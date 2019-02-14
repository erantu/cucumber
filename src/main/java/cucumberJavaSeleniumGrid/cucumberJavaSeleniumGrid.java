package cucumberJavaSeleniumGrid;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class cucumberJavaSeleniumGrid {
    //WebDriver driver = null;

    private static Wait<WebDriver> wait;
    private static DesiredCapabilities capabillities;
    private static WebDriver driver;

    @Given("^I have open the browser$")
    public void openBrowser() throws Exception{
        capabillities = DesiredCapabilities.chrome();
        /** URL is the selenium hub URL here **/
        driver = new RemoteWebDriver(new URL("http://erantu:4444/wd/hub"), capabillities);
        capabillities.setBrowserName("chrome");
        wait = new WebDriverWait(driver, 2000);
    }

    @When("^I open Facebook website$")
    public void goToFacebook() {
        driver.get("https://www.google.com/");
    }

    @Then("^Login button should exits$")
    public void loginButton() {
        if(driver.findElement(By.name("q")).isEnabled()) {
            System.out.println("Test 1 Pass");
        } else {
            System.out.println("Test 1 Fail");
        }
        driver.close();
    }
}