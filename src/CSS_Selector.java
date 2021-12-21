import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CSS_Selector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankur\\Desktop\\Nisha Zipcode\\Selenium Stuff\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.navigate().to("https://www.amazon.com/ref=nav_logo");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Toys");
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();

        driver.close();
    }
}
