package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class productCart {
  WebDriver driver;

  @Given("Visit URL")
  void visitURL() {
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://automationteststore.com/");
  }
}
