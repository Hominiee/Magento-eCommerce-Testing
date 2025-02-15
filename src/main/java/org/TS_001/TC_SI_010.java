package org.TS_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SI_010 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //click on Sign In
        driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']")).click();
        Thread.sleep(1000);

        //Enter a valid Email
        driver.findElement(By.id("email")).sendKeys("udani@gmail.com");
        Thread.sleep(1000);

        //Enter a valid Password
        driver.findElement(By.id("pass")).sendKeys("Udani123");
        Thread.sleep(1000);

        //Click on Sign In button
        driver.findElement(By.id("send2")).click();
        Thread.sleep(1000);

        driver.close();

        //Again open the Application
        WebDriver AgainDriver = new ChromeDriver();
        AgainDriver.get("https://magento.softwaretestingboard.com");

        try {
            boolean loggedIn = driver.findElement(By.xpath("//span[@class='logged-in']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("The user get loggedin again.");
        }
        catch (Exception e){
            System.out.println("The user did not get loggedin again.");
        }

    }
}
