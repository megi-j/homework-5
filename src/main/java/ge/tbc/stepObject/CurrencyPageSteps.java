package ge.tbc.stepObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ge.tbc.pageObject.CurrencyPage;

public class CurrencyPageSteps extends CurrencyPage {
    public CurrencyPageSteps currencyBoxCheck(){
        currencyBoxButton.shouldBe(Condition.visible).click();
        currencyModal.shouldBe(Condition.visible);
        return this;
    }
    public CurrencyPageSteps closePopup(){
        popup.should(Condition.exist).click();
        return this;
    }
    public CurrencyPageSteps allCurrencyCheck(){
        allCurrencyList.shouldBe(Condition.visible);
        return this;
    }
    public CurrencyPageSteps selectCurrency(String currencyName){
        for (SelenideElement element :
                allCurrencyList.$$("button[data-testid='selection-item']")) {
            if (element.getText().equalsIgnoreCase(currencyName)) {
                element.shouldBe(Condition.visible).click();
                break;
            }
        }
        return this;
    }
}
