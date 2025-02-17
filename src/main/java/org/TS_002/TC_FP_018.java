package org.TS_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_FP_018 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Intern\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //click on Sign In
        driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']")).click();
        Thread.sleep(1000);

        //Enter a valid Email to the SignIn page
        driver.findElement(By.id("email")).sendKeys("hominiudani@gmail.com");
        Thread.sleep(1000);

        //click on Forgot Password link
        driver.findElement(By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/forgotpassword/']")).click();
        Thread.sleep(1000);

        try {
            //// Retrieve the email textbox value
            String enteredText = driver.findElement(By.id("email_address")).getAttribute("value");

            // Check if the entered text is not null and not empty
            if (enteredText != null && !enteredText.isEmpty()) {
                System.out.println("Entered text is present: " + enteredText);
            } else {
                System.out.println("No text entered in the email field.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}

