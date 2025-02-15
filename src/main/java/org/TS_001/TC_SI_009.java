package org.TS_001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_SI_009 {
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

        // Locate the password field
        String fieldType = driver.findElement(By.id("pass")).getAttribute("type");
        Thread.sleep(1000);
        //*****************************************
            // Locate the password field
//            WebElement passwordField = driver.findElement(By.id("password"));
            // Get the type attribute
//            String fieldType = passwordField.getAttribute("type");
        //*****************************************

        // Validate if the password is hidden
        if (fieldType.equals("password")) {
            System.out.println("Password is hidden.");
        } else {
            System.out.println("Password is visible.");
        }

        // Close the browser
        driver.quit();
    }
}
