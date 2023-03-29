package LocatorsOfThePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsOfThePage {

    public WebElement loc_of_search_icon(WebDriver drv1){
        return drv1.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/button"));
    }
    public WebElement loc_of_search_bar(WebDriver drv1){
        return drv1.findElement(By.id("txt_search_query"));
    }

    public WebElement loc_of_second_lesson(WebDriver drv1){
        return drv1.findElement(By.xpath("/html/body/div/div[1]/div/div/main/div[3]/ul/li[2]/div/a"));
    }
    public WebElement loc_of_worksheet_btn(WebDriver drv1){
        return drv1.findElement(By.xpath("/html/body/div/div[1]/div/div/aside/div/ul/li[4]/div/a"));
    }

}
