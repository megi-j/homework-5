package ge.tbc.stepObject;

import com.codeborne.selenide.Condition;
import ge.tbc.pageObject.HomePage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HomePageSteps extends HomePage {
    public HomePageSteps fillDestinationInput(String destinationInputValue){
        destinationInput.shouldBe(visible)
                .setValue(destinationInputValue);
        return this;
    }
    public HomePageSteps fillCheckInCheckOut(){
        checkInCheckOutDateButton.shouldBe(visible)
                .click();
        checkInDate.shouldBe(visible, Duration.ofSeconds(10))
                .shouldBe(Condition.clickable)
                .click();
        checkOutDate.shouldBe(Condition.clickable).click();
        return this;
    }
    public HomePageSteps closePopup(){
        popup.should(Condition.exist).click();
        return this;
    }

    public HomePageSteps searchButtonClick(){
        searchButton.shouldBe(visible).click();
        sleep(700);
        filtersBox.shouldBe(visible, Duration.ofSeconds(10));
        return this;
    }
    public HomePageSteps checkReviewScoreFilter(){
        reviewScore.shouldBe(visible);
        return this;
    }
}
