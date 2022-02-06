package Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MavenTestNG1 {

   @Test
    public void MavenTestNG1 () {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stylus.ua/");
        System.out.println(driver.getTitle());

        //String title = driver.getTitle();

        //Assert.assertEquals(title, "Google");

        driver.quit();



    }
}
