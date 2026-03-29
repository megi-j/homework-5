package ge.tbc.stepObject;

import com.codeborne.selenide.Condition;
import ge.tbc.pageObject.HomePage;

import static com.codeborne.selenide.Selenide.$;

public class HomePageSteps extends HomePage {
    public HomePageSteps fillDestinationInput(String destinationInputValue){
        destinationInput.shouldBe(Condition.visible)
                .setValue(destinationInputValue);
        return this;
    }
    public HomePageSteps fillCheckInCheckOut(){
        checkInCheckOutDateButton.shouldBe(Condition.visible)
                .click();
        checkInDate.shouldBe(Condition.clickable).click();
        checkOutDate.shouldBe(Condition.clickable).click();
        return this;
    }
    public HomePageSteps closePopup(){
        popup.should(Condition.exist).click();
        return this;
    }

    public HomePageSteps searchButtonClick(){
        searchButton.shouldBe(Condition.visible).click();
        return this;
    }
}
