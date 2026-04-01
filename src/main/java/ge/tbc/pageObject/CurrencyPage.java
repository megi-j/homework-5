package ge.tbc.pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CurrencyPage {
    public SelenideElement
       currencyBoxButton = $("button[data-testid='header-currency-picker-trigger']"),
       currencyModal = $("div[data-testid='selection-modal']"),
            popup = $("button[aria-label='Dismiss sign-in info.']"),
    allCurrencyList = $("div[data-testid='All currencies'] ul"),
    currency = $("button[data-testid='selection-item']");

}
