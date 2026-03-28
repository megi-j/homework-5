package ge.tbc.pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement
            destinationInput = $("input[data-destination=\"1\"]"),
            checkInCheckOutDateButton = $("button[data-testid='searchbox-dates-container']"),
            checkInDate = $("span[data-date='2026-04-01']"),
            checkOutDate = $("span[data-date='2026-04-05']"),
            popup = $("button[aria-label='Dismiss sign-in info.']");
}
