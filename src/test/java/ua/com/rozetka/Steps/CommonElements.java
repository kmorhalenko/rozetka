package ua.com.rozetka.Steps;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;


public class CommonElements {
    String baseUrl = Configuration.baseUrl;

    public static void setUp() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://rozetka.com.ua/";
        Configuration.reportsFolder = "test-result/reports";
        Configuration.timeout = 5000;

    }

    static void clickOnElementByXpath(String xpath) {
        $(By.xpath(xpath)).shouldBe(visible).click();
    }


    boolean elementIsVisible(String xpath) {
        $(By.xpath(xpath)).shouldBe(visible);
        return $(By.xpath(xpath)).isDisplayed();
    }

    boolean elementIsInvisible(String xpath) {
        $(By.xpath(xpath)).shouldBe(disappear);
        return !$(By.xpath(xpath)).isDisplayed();
    }

    void elementShouldContainsText(String xpath, String text){
        $(By.xpath(xpath)).shouldHave(text(text));

    }

}