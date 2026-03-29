import ge.tbc.stepObject.AttractionsPageSteps;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.Runner;

import static com.codeborne.selenide.Selenide.switchTo;
import static ge.tbc.dataObject.AttractionsPageData.*;

public class AttractionsPageTest extends Runner {
    AttractionsPageSteps attractionsPageSteps = new AttractionsPageSteps();
    @BeforeClass
    public void setUpTests(){
        attractionsPageSteps.moveToAttractionsPage();
    }

    @Test
    public void fillDestinationInput(){
        attractionsPageSteps.fillDestinationInput(destinationPlace)
                .fillDate()
                .clickSearchButton();
                switchTo().window(1);
    }
    @Test
    public void showAllRecommendedAttractions(){
        attractionsPageSteps.checkNearByDestination();
    }

}
