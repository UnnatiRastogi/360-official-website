package com.officialweb.testCases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.officialweb.pageObjects.WebPage;

public class LinksWorking extends BaseClass {

    @Test
    public void LinkTest() {
        driver.get(baseURL);
        WebPage wp = new WebPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Finding all the available links on the webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Iterating each link and checking the response status
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            String linkText = link.getText();

            if (url != null && !url.isEmpty()) {
                System.out.println("Link Text: " + linkText);
                verifyLink(url);
            } else {
                System.out.println("Link Text: " + linkText + " - is a broken link (no href attribute)");
            }
        }

        driver.quit();
    }

    public static void verifyLink(String url) {
        try {
            URL link = new URL(url);
            HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
            httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage());
            } else {
                System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - is a broken link");
            }
        } catch (Exception e) {
            System.out.println(url + " - is a broken link");
        }
    }
}