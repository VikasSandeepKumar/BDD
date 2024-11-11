package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class GreenKartstepDefinitions {
    public WebDriver driver;
    public String landingPageProductName;
    public String offerPageProductName;
    @Given("GreenCart Landing Page")
    public void green_cart_landing_page() {
//        System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().browserVersion("130.0.6723.92").setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
    }
    @When("User searched with Shortname {string} and extracted name of the product")
    public void user_searched_with_and_extracted_name_of_the_product(String shortname) throws InterruptedException {
       driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
        Thread.sleep(2000);
       landingPageProductName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
       System.out.println(landingPageProductName +"is extracted from Home page");
    }
    @Then("Searched for {string} shortname in offers page to check if product exist with same name")
    public void searched_for_the_same_shortname(String shortname) throws InterruptedException {
       driver.findElement(By.linkText("Top Deals")).click();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        String parentWindow = i1.next();
        String childWindow = i1.next();
        driver.switchTo().window(childWindow);
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortname);
        Thread.sleep(2000);
        offerPageProductName = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
    }

    @Then("Validate product name in offers page matched with Landing Page")
    public void validate_product_name_in_offers_page_matched_with_landing_page() {
        Assert.assertEquals(offerPageProductName, landingPageProductName);
    }

    @Then("Close the Browser")
    public void close_the_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
