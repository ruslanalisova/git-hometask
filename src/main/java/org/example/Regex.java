package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
  //  ChromeOptions options = new ChromeOptions();
    // options.addArguments("--remote-allow-origins=*");

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

       // driver = new ChromeDriver(options);
        driver.get("https://www.epam.com/about/who-we-are/contact");
        List<String> resultList = new ArrayList<>();
        List<String> titlesList = Arrays.asList("Street: ", "Apartment: ", "City: ", "Post code: ", "Country: ");

        String address = driver.findElement(By.xpath("//div[contains(@class, 'column-control')]//p[contains(@class, 'scaling-of-text-wrapper')]")).getText();

        Matcher matcher = Pattern.compile("([\\w\\s]+)").matcher(address);

        while (matcher.find()) {
            resultList.add(matcher.group().replace("\n", ""));
        }

        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(titlesList.get(i) + resultList.get(i));
        }

        System.out.println(checkRegex("178.43.161.128", "ip"));
        System.out.println(checkRegex("ruslana@gmail.com", "email"));
        System.out.println(checkRegex("5168789654324567", "card"));

        driver.quit();
    }

    private static boolean checkRegex(String line, String regexType) {
        String ip = "(\\b25[0-5]|\\b2[0-4][0-9]|\\b[01]?[0-9][0-9]?)(\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}";
        String email = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        String card = "^5[0-9]{12}(?:[0-9]{3})?$";

        switch (regexType) {
            case "ip": {
                return line.matches(ip);
            }
            case "email": {
                return line.matches(email);
            }
            case "card": {
                return line.matches(card);
            }
            default: {
                return false;
            }
        }
    }
}