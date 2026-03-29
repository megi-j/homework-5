package ge.tbc.stepObject;

import com.codeborne.selenide.Condition;
import ge.tbc.pageObject.AttractionsPage;
import org.checkerframework.checker.units.qual.C;

public class AttractionsPageSteps extends AttractionsPage {
    public AttractionsPageSteps moveToAttractionsPage(){
        attractionsButton.click();
        return this;
    }
    public AttractionsPageSteps fillDestinationInput(String destinationValue){
        destinationInput.shouldBe(Condition.visible).click();
        destinationInput.setValue(destinationValue);
        resultDestination.click();
        return this;
    }

    public AttractionsPageSteps fillDate(){
        selectDate.shouldBe(Condition.visible).click();
        firstDate.shouldBe(Condition.visible).click();
        lastDate.shouldBe(Condition.visible).click();
        return this;
    }
    public AttractionsPageSteps clickSearchButton(){
        searchButton.click();
        return this;
    }
    public AttractionsPageSteps checkNearByDestination(){
        nearByDestinations.scrollIntoView(true);
        nearByDestinations.shouldBe(Condition.visible);
        nearByDestination.shouldBe(Condition.visible).click();
        return this;
    }
}
