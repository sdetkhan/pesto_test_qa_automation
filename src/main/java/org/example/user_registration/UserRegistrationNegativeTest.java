package org.example.user_registration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;

public class UserRegistrationNegativeTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            // Read test data from the JSON file
            JSONParser parser = new JSONParser();
            JSONObject testData = (JSONObject) parser.parse(new FileReader("test_data.json"));
            JSONObject registrationData = (JSONObject) testData.get("registrationData");

            // Navigate to the registration page
            driver.get("https://example.com/register");

            // Fill in valid user details
            WebElement emailInput = driver.findElement(By.id("email"));
            WebElement passwordInput = driver.findElement(By.id("password"));
            WebElement registerButton = driver.findElement(By.id("registerButton"));

            String email = (String) registrationData.get("validUser.email");
            String password = (String) registrationData.get("validUser.password");

            emailInput.sendKeys(email);
            passwordInput.sendKeys(password);
            registerButton.click();
            // Validate error message
            String errorMessage = driver.findElement(By.id("errorMessage")).getText();
            if (errorMessage.equals("Email address already registered.")) {
                System.out.println("Negative test case passed: User registration failed with an existing email.");
            } else {
                System.out.println("Negative test case failed: User registration succeeded with an existing email.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
