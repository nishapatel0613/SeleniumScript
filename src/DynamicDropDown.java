import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DynamicDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankur\\Desktop\\Nisha Zipcode\\Selenium Stuff\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //      //a[@value='MAA']     -xpath for chennai
        //      //a[@value='BLR']     -xpath for Bengaluru

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       driver.findElement(By.xpath("//a[@value='BLR']")).click();

       driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
    }
}