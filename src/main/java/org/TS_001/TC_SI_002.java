package org.TS_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_SI_002 {
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

        //Enter a Invalid Email
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("udani@@gmail.com");
        Thread.sleep(1000);

        //Enter a Invalid Password
        driver.findElement(By.id("pass")).sendKeys("Udani111");
        Thread.sleep(1000);

        //Click on Sign In button
        WebElement signIn = driver.findElement(By.id("send2"));
        signIn.click();
        Thread.sleep(1000);

        try {
            boolean loggedIn = driver.findElement(By.xpath("//span[@class='logged-in']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("The login process was completed.");
        }
        catch (Exception e){
            System.out.println("The login process was not completed.");
        }

        driver.close();



    }
}
