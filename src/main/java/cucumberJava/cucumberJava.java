package cucumberJava;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class cucumberJava {
    WebDriver driver = null;

    @Given("^I have open the browser$")
    public void openBrowser() {
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
    }

    @When("^I open Facebook website$")
    public void goToFacebook() {
        driver.navigate().to("https://www.facebook.com/");
    }

    @Then("^Login button should exits$")
    public void loginButton() {
        if(driver.findElement(By.id("u_0_v")).isEnabled()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
        driver.close();
    }
}