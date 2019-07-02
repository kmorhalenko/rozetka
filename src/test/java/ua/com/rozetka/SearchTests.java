package ua.com.rozetka;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import io.qameta.allure.junit4.DisplayName;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class SearchTests extends CommonElements {
    String baseUrl = Configuration.baseUrl;

    @BeforeClass
    public static void setUpppp() {
        setUp();
    }



    @Test
    @DisplayName("214234234")
    @Step("First step")
    public void searchIphone() {
        open(baseUrl);
    }



    @Test
    public void searshFieldTest() {
        open(baseUrl);
        $(By.name("search")).setValue("Iphone");
        $(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit']")).shouldBe(visible).click();

    }

}