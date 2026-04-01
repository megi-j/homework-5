import ge.tbc.stepObject.CurrencyPageSteps;
import org.testng.annotations.Test;
import utils.Runner;

import static ge.tbc.dataObject.CurrencyPageData.*;

public class CurrencyPageTest extends Runner {
    CurrencyPageSteps currencyPageSteps = new CurrencyPageSteps();

    @Test
    public void chooseCurrency(){
        currencyPageSteps.closePopup()
                .currencyBoxCheck()
                .allCurrencyCheck()
                .selectCurrency(currencyName);
    }

}
