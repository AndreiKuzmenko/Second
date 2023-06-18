package qa38.ilcaro.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {
    @BeforeMethod
    public void preCondition(){
        if(!app.getUserHelper().isElementDisplayed(By.xpath("//a[.=' Log in ']"))){
            app.getUserHelper().clickLogOut();

        }
    }

    @Test
    public void positiveLoginTest() {
        //clickLogIn
        // wd.findElement(By.id("")).click();
        app.getUserHelper().clickLogIn();
        app.getUserHelper().fillLoginForm("qwe777@gmail.com", "123@Qwe123");
        app.getUserHelper().clickSubmitButton();
        app.getUserHelper().pause(3000);
        Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//div[@class='dialog-container']")));

    }



    @Test
    public void loginNegativeTest() {
        app.getUserHelper().login("qwe777@gmail.com", "123@Qwe123");
        Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//a[.=' Log in ']")));
    }



}