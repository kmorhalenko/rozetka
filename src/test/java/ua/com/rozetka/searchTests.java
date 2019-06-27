package ua.com.rozetka;

import io.qameta.allure.Step;
import org.junit.Test;
import org.openqa.selenium.By;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class searchTests {


    @Test
    @DisplayName("214234234")
    @Step("First step")
    public void searchIphone() {
        open("https://rozetka.com.ua/");
    }

    @Test
    public void searshFieldTest() {
        open("https://rozetka.com.ua/");
        $(By.name("search")).setValue("Iphone");
        $(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit']")).click();

    }

}