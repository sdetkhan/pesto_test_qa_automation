package org.example.cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddSingleItemToCartPositiveTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://example.com/products/product123");

        // Click the "Add to Cart" button
        WebElement addToCartButton = driver.findElement(By.id("addToCartButton"));
        addToCartButton.click();

        // Validate cart content
        WebElement cartIcon = driver.findElement(By.id("cartIcon"));
        if (cartIcon.getText().equals("1")) {
            System.out.println("Positive test case passed: Item added to the cart.");
        } else {
            System.out.println("Positive test case failed: Item not added to the cart.");
        }

        driver.quit();
    }
}
