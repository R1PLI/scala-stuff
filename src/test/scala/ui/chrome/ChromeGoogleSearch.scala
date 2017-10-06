package ui.chrome

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.scalatest.concurrent.Eventually
import org.scalatest.selenium.WebBrowser
import org.scalatest.{BeforeAndAfterEach, FunSuite, Matchers}

class ChromeGoogleSearch extends FunSuite
  with BeforeAndAfterEach with Matchers with Eventually with WebBrowser {

  System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe")
  implicit val webDriver: WebDriver = new ChromeDriver

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
