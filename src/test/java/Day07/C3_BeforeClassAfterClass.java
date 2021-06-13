package Day07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C3_BeforeClassAfterClass {
    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void test01()  {
        driver.get("https://techproeducation.com");
        System.out.println("First Method Run");
    }
    @Test
    public void test02()  {
        driver.get("https://www.amazon.com");
        System.out.println("Second Method Run");
    }
    @Test
    public void test03()  {
        driver.get("https://www.facebook.com");
        System.out.println("Third Method Run");
    }
}

