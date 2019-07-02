package ua.com.rozetka;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CommonElements {

    public static void setUp() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://rozetka.com.ua/";
        Configuration.reportsFolder = "test-result/reports";
    }

    public void clickOnElementByXpath(String xpath){
        $(By.xpath(xpath)).shouldBe(visible).click();
    }



}