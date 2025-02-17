package org.TS_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FP_014 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

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

        try {
            boolean logo = driver.findElement(By.xpath("//img[@src='https://magento.softwaretestingboard.com/pub/static/version1695896754/frontend/Magento/luma/en_US/images/logo.svg']")).isDisplayed();
            Thread.sleep(1000);
            System.out.println("The Logo is displayed.");
        }
        catch (Exception e){
            System.out.println("The Logo was not displayed");
        }

        driver.close();

    }
}

