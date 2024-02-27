package org.example.product_search;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.util.List;

public class ProductSearchPositiveTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            JSONParser parser = new JSONParser();
            JSONObject testData = (JSONObject) parser.parse(new FileReader("test_data.json"));
            JSONObject productData = (JSONObject) testData.get("productData");

            String productName = (String) productData.get("validSearchQuery");

            // Enter a valid search query
            WebElement searchInput = driver.findElement(By.id("searchBar"));
            WebElement searchButton = driver.findElement(By.id("searchButton"));

            searchInput.sendKeys(productName);
            searchButton.click();

            // Validate search results
            List<WebElement> searchResults = driver.findElements(By.className("product"));
            if (!searchResults.isEmpty()) {
                System.out.println("Positive test case passed: Product search returned results.");
            } else {
                System.out.println("Positive test case failed: Product search did not return results.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

