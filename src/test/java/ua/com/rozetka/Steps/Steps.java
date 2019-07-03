package ua.com.rozetka.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import ua.com.rozetka.Locators.Locators;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class Steps extends CommonElements {

    public void openHomePage() {
        open(baseUrl);
    }

    public void enterToTheSearchFieltText(String text) {
        $(By.name("search")).setValue(text);
    }

    public void selectDropdownItemOfMainSearchByText(String text) {
        $(By.xpath(Locators.DROPDOWN_ITEMS_BY_NAME.replace("$1",text))).shouldBe(visible).click();
    }

    public void chooseFirstItemOfSearchResult() {
        $$(By.xpath(Locators.RESULTS_OF_THE_SEARCH)).first().shouldBe(visible).click();
    }

    public void changeColourTo(int r, int g, int b) {
        String red, green, blue;
        red = String.valueOf(r);
        green = String.valueOf(g);
        blue = String.valueOf(b);
        $(By.xpath(Locators.SHOOSE_BLACK_COLOUR_OF_PRODUCT.
                replace("$1", red).
                replace("$2", green).
                replace("$3", blue))).
                shouldBe(visible).click();
    }


    public void clickButtonByName(String buttonName) {
        CommonElements.clickOnElementByXpath(Locators.BUTTON_BY_NAME.replace("$1",buttonName));

    }

    public void popupWithNameShouldBeOpen(String popupName) {
    Assert.assertTrue("Popup isn`t displayed",
            $(By.xpath(Locators.POPUP_BY_NAME.replace("$1",popupName))).shouldBe(visible).isDisplayed());

    }

    public void closePopup() {
        $(By.xpath(Locators.CLOSE_BUTTON_OF_POPUP)).shouldBe(visible).click();
    }

    public void popupWithNameShouldBeClosed(String popupName) {
        Assert.assertFalse("Popup isn`t displayed",
                $(By.xpath(Locators.POPUP_BY_NAME.replace("$1",popupName))).shouldBe(disappear).isDisplayed());
    }
}