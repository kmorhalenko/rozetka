package ua.com.rozetka.Locators;

public interface Locators {

    ///___________________________________COMMON_______________________________________________///
    String BUTTON_BY_NAME = "//button[contains(text(),'$1')]";
    String POPUP_BY_NAME = "//h2[contains(text(),'$1')]";
    String CLOSE_BUTTON_OF_POPUP = "//*[@class='rz-popup-close-icon']";


    ///___________________________________HEADER_______________________________________________///

    String SEARCH_BUTTON_ON_THE_HEADER = "//button[@class='button button_color_green button_size_medium search-form__submit']";
    String DROPDOWN_ITEMS_BY_NAME = "//a//span[contains(text(),'$1')]";
    String BASKETS_COUNTER = "//span[@class='header-actions__button-counter ng-star-inserted']";
    String BASKET_ITEM = "//li[@class='header-actions__item header-actions__item_type_cart']";

    ///__________________________________RESULT PAGE__________________________________________///
    String RESULTS_OF_THE_SEARCH = "//div[@data-location='SearchResults']";

    ///__________________________________PRODUCT PAGE________________________________________///
    String SHOOSE_BLACK_COLOUR_OF_PRODUCT = "//span[@style='background-color: rgb($1, $2, $3);']";


    ///__________________________________BASKET______________________________________________///
    String PRODUCT_TITLE_IN_BASKET = "//a[@class='purchase-title novisited']";


}
