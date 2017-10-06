package ui.firefox

import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.Firefox
import org.scalatest.{BeforeAndAfterEach, FunSuite, Matchers}

class FirefoxGoogleSearch extends FunSuite
  with BeforeAndAfterEach with Matchers with Eventually with Firefox {

  test("Should open google search and fine cheese") {
    go to "http://www.google.co.uk"
    click on "q"
    textField("q").value = "Cheese!"
    submit()
    // Google's search is rendered dynamically with JavaScript.
    eventually {
      pageTitle should be("Cheese! - Google Search")
    }
  }

  override def afterEach(): Unit = {
    close()
  }
}
