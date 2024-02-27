package org.example.user_registration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;

public class UserRegistrationPositiveTest {
    public static void main(String[] args) {
        // Set up the WebDriver
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

            // Validate successful registration
            String successMessage = driver.findElement(By.id("successMessage")).getText();
            if (successMessage.equals("Registration successful!")) {
                System.out.println("Positive test case passed: User registration was successful.");
            } else {
                System.out.println("Positive test case failed: User registration was not successful.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
