import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        String name = "John";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ankur\\Desktop\\Nisha Zipcode\\Selenium Stuff\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        String password = getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/p")).getText());
        System.out.println(driver.findElement(By.cssSelector("#root > div > div > div > h2")).getText());
        driver.findElement(By.xpath("//button[text()=\"Log Out\"]")).click();
        driver.close();


    }
    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > div > button.reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        // Please use temporary password 'rahulshettyacademy' to Login.
        String[] passwordArray = passwordText.split("'");
//        String[] passwordArray2 = passwordArray[1].split("'");
//        String s = passwordArray2[0];
        String password = passwordArray[1].split("'")[0];
        // 0th index = Please use temporary password
        //1st index = rahulshettyacademy' to Login.

        //0th index = rahulshettyacademy
        //1st index = to Login.

        return password;





    }
}
