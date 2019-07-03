package ua.com.rozetka.Steps;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CommonElements {
    String baseUrl = Configuration.baseUrl;

    public static void setUp() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://rozetka.com.ua/";
        Configuration.reportsFolder = "test-result/reports";

    }

    public static void clickOnElementByXpath(String xpath) {
        $(By.xpath(xpath)).shouldBe(visible).click();
    }



}