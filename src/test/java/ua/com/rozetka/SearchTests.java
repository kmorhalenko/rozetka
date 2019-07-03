package ua.com.rozetka;

import org.junit.BeforeClass;
import org.junit.Test;
import io.qameta.allure.junit4.DisplayName;
import ua.com.rozetka.Steps.CommonElements;
import ua.com.rozetka.Steps.Steps;


public class SearchTests extends CommonElements {
    Steps steps = new Steps();

    @BeforeClass
    public static void setSettings() {
        setUp();
    }


    @Test
    @DisplayName("Buy iPhone")
    public void searchIphone() {
        steps.openHomePage();
        steps.enterToTheSearchFieltText("Iphone");
        steps.selectDropdownItemOfMainSearchByText("iphone xr");
        steps.chooseFirstItemOfSearchResult();
        steps.changeColourTo(0,0,0);
        steps.clickButtonByName("Купить");
        steps.popupWithNameShouldBeOpen("Вы добавили товар в корзину");
        steps.closePopup();
        steps.popupWithNameShouldBeClosed("Вы добавили товар в корзину");


    }


}