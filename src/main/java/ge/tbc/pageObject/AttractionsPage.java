package ge.tbc.pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AttractionsPage {
    public SelenideElement
              attractionsButton = $("a[id='attractions']"),
              destinationInput = $("input[data-testid='search-input-field']"),
              selectDate = $x("//div[text()='Dates']"),
              firstDate = $("span[data-date='2026-04-01']"),
              lastDate = $("span[data-date='2026-04-05']"),
              resultDestination = $("button[data-testid='search-bar-result']"),
              searchButton = $("button[data-testid='search-button']"),
              nearByDestinations = $x("//h2[normalize-space()='Nearby destinations']"),
              nearByDestination = nearByDestinations.$x("parent::*/parent::*/following-sibling::*[1]");

}
