package ge.tbc.pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement
            originCityInput = $("[data-test='search-departure-station']"),
            destinationCityInput = $("[data-test='search-arrival-station']");
}
