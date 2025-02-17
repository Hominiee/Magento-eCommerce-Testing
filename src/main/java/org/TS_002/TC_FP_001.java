package org.TS_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FP_001 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //click on Sign In
        driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']")).click();
        Thread.sleep(1000);

        //click on Forgot Password link
        driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/forgotpassword/']")).click();
        Thread.sleep(1000);

        //Enter a valid Email
        driver.findElement(By.id("email_address")).sendKeys("hominiudani@gmail.com");
        Thread.sleep(1000);

        //Click on 'Reset My Password' button
        driver.findElement(By.cssSelector(".action.submit.primary")).click();
        Thread.sleep(1000);

        // Open mail in a new tab
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        Thread.sleep(2000);

        // Closes all tabs and ends the session
        driver.quit();


    }
}
