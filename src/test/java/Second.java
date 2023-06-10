import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Second {
    WebDriver wd;

    @BeforeTest
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");

    }
    @Test
    public void test(){
        // Old strategies
        wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));
        wd.findElement(By.xpath("//a"));

        wd.findElement(By.id("root"));
        wd.findElement(By.className("container"));

        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.cssSelector(".container"));

        wd.findElement(By.xpath("//*[@id='root']"));
        wd.findElement(By.xpath("//*[@class='container']"));

        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.cssSelector("[href*='og']"));
        wd.findElement(By.cssSelector("[href^='/login']"));
        wd.findElement(By.cssSelector("[href$='gin']"));

        wd.findElement(By.xpath("//*[@href='/login']"));
        wd.findElement(By.xpath("//*[contains(@href,'log')]"));






        wd.findElement(By.cssSelector("[href='/about']"));
        wd.findElement(By.cssSelector(".active"));
        wd.findElement(By.cssSelector("[href*='bo']"));
        wd.findElement(By.cssSelector("[href^='/ab']"));
        wd.findElement(By.cssSelector("[href$='out']"));





   }
    @AfterTest
    public void postcondition(){
     wd.quit();
    }

}
