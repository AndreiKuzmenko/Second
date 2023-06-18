package qa38.ilcaro.tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogOut extends TestBase {
    @BeforeMethod
    public void precondition() {
        if (!app.getUserHelper().isElementDisplayed(By.xpath("//a[.=' Log in ']"))) {
            app.getUserHelper().click(By.xpath("//div[@class='header']//a[5]"));
        }
    }
    @Test
    public void logOutTest(){
        app.getUserHelper().login("qwe777@gmail.com", "123@Qwe123");
//            app.getUserHelper().click(By.xpath("//a[.=' Log in ']"));
//            type(By.id("email"), "qwe777@gmail.com");
//            type(By.id("password"), "123@Qwe123");
//            click(By.cssSelector("button[type='submit']"));
//            pause(5000);
//            click(By.cssSelector("button[class='positive-button ng-star-inserted']"));
        app.getUserHelper().click(By.xpath("//button[normalize-space()='Ok']"));
        app.getUserHelper().click(By.xpath("//div[@class='header']//a[5]"));
        app.getUserHelper().pause(5000);
        Assert.assertTrue(app.getUserHelper().isElementDisplayed(By.xpath("//a[.=' Log in ']")));
    }

}