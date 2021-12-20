import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestGetCommand {

    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankur\\Desktop\\Nisha Zipcode\\Selenium Stuff\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.get("https://www.amazon.com/");
            String title = driver.getTitle();
            System.out.println("Title of the page is: " + title);
            driver.findElement(By.linkText("Amazon Basics")).click();
            String currentUrl = driver.getCurrentUrl();
            System.out.println("The current url is: " + currentUrl);
            driver.close();



}
}