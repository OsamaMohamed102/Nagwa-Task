package StepsDef;

import LocatorsOfThePage.LocatorsOfThePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import java.util.List;

public class StepsDefintion {

     LocatorsOfThePage loc1 = new LocatorsOfThePage();
    ChromeDriver driver;

    @Given("user go to the website")
    public void  open_website(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.nagwa.com/en/");
    }
    @And("user press on search icon")
    public void user_go_to_Search(){
        loc1.loc_of_search_icon(driver).click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt_search_query")));
    }
    @And("user write lesson name and go to it")
    public void user_enter_lesson_name(){
        loc1.loc_of_search_bar(driver).sendKeys("Addition");
        loc1.loc_of_search_bar(driver).sendKeys(Keys.ENTER);
    }
    @And("click on the second lesson")
    public void go_to_second_lesson(){
        loc1.loc_of_second_lesson(driver).click();
    }
    @And("go to worksheet section then click on preview button")
    public void go_to_wokrsheet(){
        loc1.loc_of_worksheet_btn(driver).click();

    }
    @Then("work sheet open and count the number of questions appears")
    public void count_num_of_elements(){
        Assert.assertTrue(driver.findElement(By.tagName("b")).isDisplayed());
        List<WebElement> elements = driver.findElements(By.tagName("b"));
        int elementcount = elements.size();
        System.out.println(elementcount);
    }
}
