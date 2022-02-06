package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PerforatorySales {

    @Test
    public void perforatorySales () {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://stylus.ua/");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div[2]/div[1]/div/button"));


        driver.quit();

    }
}
