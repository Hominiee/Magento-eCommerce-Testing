package org.TS_001;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SI_008 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //click on Sign In
        WebElement signin = driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']"));
        signin.click();
        Thread.sleep(1000);

        //Enter a valid Email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("udani@gmail.com");
        Thread.sleep(1000);

        //Enter a valid Password
        driver.findElement(By.id("pass")).sendKeys("Udani123");
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0,100)");

        //Click on Sign In button
        WebElement signIn = driver.findElement(By.id("send2"));
        signIn.click();
        Thread.sleep(1000);

        //Click on Sign Out
        driver.findElement(By.xpath("//button[@class='action switch']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/logout/']")).click();
        Thread.sleep(1000);

        //Click on Browser Back button
        driver.navigate().back();
        Thread.sleep(1000);

        try {
            boolean loggedIn = driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']")).isDisplayed();
            Thread.sleep(2000);
            System.out.println("The user did not get loggedin again.");
        }
        catch (Exception e){
            System.out.println("The user get loggedin again.");
        }

        driver.close();



    }
}
