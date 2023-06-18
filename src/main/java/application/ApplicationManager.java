package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    UserHelper userHelper;


    public void init(){

        wd = new ChromeDriver();
        wd.navigate().to("https://ilcarro.web.app/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        userHelper = new UserHelper(wd);

    }
    public void stop(){

        wd.quit();
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }
}