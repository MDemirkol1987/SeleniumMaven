package Day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C5_RadioButtonTest {
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        // driver.close();
    }

    @Test
    public void Test01(){
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        WebElement radioErkek= driver.findElement(By.xpath("//input[@value='2']"));
        if (!radioErkek.isSelected());
        radioErkek.click();
    }

}
