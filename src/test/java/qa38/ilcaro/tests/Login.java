package qa38.ilcaro.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wd.navigate().to("https://ilcarro.web.app/");

    }
    @Test
    public void positLogTest() throws InterruptedException {
        wd.findElement(By.xpath("//a[contains(.,'Log in')]")).click();
        wd.findElement(By.cssSelector("#email")).click();
        wd.findElement(By.cssSelector("#email")).clear();
        wd.findElement(By.cssSelector("#email")).sendKeys("ref7777@gmail.com");

        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys("Qwerty234_*");

        wd.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);

    }
    public void click (By locator){
        wd.findElement(locator).click();


    }
    @AfterMethod
    public void tearDown(){

    }
}
