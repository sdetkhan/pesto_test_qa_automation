package org.example.product_search;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileReader;
import java.util.List;

public class ProductSearchNegativeTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            JSONParser parser = new JSONParser();
            JSONObject testData = (JSONObject) parser.parse(new FileReader("test_data.json"));
            JSONObject productData = (JSONObject) testData.get("productData");

            String productName = (String) productData.get("invalidSearchQuery");

            driver.get("https://example.com");

            // Enter an invalid search query
            WebElement searchInput = driver.findElement(By.id("searchBar"));
            WebElement searchButton = driver.findElement(By.id("searchButton"));

            searchInput.sendKeys(productName);
            searchButton.click();

            // Validate no search results
            List<WebElement> searchResults = driver.findElements(By.className("product"));
            if (searchResults.isEmpty()) {
                System.out.println("Negative test case passed: No results found for an invalid product search.");
            } else {
                System.out.println("Negative test case failed: Results found for an invalid product search.");
            }

            driver.quit();
        }  catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
