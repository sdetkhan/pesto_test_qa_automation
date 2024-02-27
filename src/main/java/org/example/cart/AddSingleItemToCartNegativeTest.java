package org.example.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddSingleItemToCartNegativeTest {

    /***
    Cart tests are not test data driven as it was not necessary to store any information.
    Refer to Product Search and User Registration tests for data driven tests
    ***/
    
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com/products/product456");

        // Click the "Add to Cart" button for a non-existent product
        WebElement addToCartButton = driver.findElement(By.id("addToCartButton"));
        addToCartButton.click();

        // Validate error message
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        if (errorMessage.getText().equals("Product not found.")) {
            System.out.println("Negative test case passed: Error message displayed for non-existent product.");
        } else {
            System.out.println("Negative test case failed: No error message for non-existent product.");
        }

        driver.quit();
    }
}
