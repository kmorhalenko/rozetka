package ua.com.rozetka.Steps;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import ua.com.rozetka.Locators.Locators;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class Steps extends CommonElements {

    @Step
    public void openHomePage() {
        open(baseUrl);
    }

    @Step
    public void enterToTheSearchFieldText(String text) {
        $(By.name("search")).setValue(text);
    }

    @Step
    public void selectDropdownItemOfMainSearchByText(String text) {
        $(By.xpath(Locators.DROPDOWN_ITEMS_BY_NAME.replace("$1", text))).shouldBe(visible).click();
    }

    @Step
    public void chooseFirstItemOfSearchResult() {
        $$(By.xpath(Locators.RESULTS_OF_THE_SEARCH)).first().shouldBe(visible).click();
    }

    @Step
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

    @Step
    public void clickButtonByName(String buttonName) {
        clickOnElementByXpath(Locators.BUTTON_BY_NAME.replace("$1", buttonName));
    }

    @Step
    public void popupWithNameShouldBeOpen(String popupName) {
        Assert.assertTrue("Popup isn`t displayed",
                elementIsVisible(Locators.POPUP_BY_NAME.replace("$1", popupName)));
    }

    @Step
    public void closePopup() {
        clickOnElementByXpath(Locators.CLOSE_BUTTON_OF_POPUP);
    }

    @Step
    public void popupWithNameShouldBeClosed(String popupName) {
        Assert.assertTrue("Popup isn`t displayed",
                elementIsInvisible(Locators.POPUP_BY_NAME.replace("$1", popupName)));
    }

    @Step
    public void basketCounterIsAppeared() {
        Assert.assertTrue("Basket`s counter isn`t appeared", elementIsVisible(Locators.BASKETS_COUNTER));
    }

    @Step
    public void openBasket() {
        clickOnElementByXpath(Locators.BASKET_ITEM);
    }

    @Step
    public void basketShouldHaveProduct(String productName) {
        elementShouldContainsText(Locators.PRODUCT_TITLE_IN_BASKET, productName);
    }
}