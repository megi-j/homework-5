import ge.tbc.stepObject.HomePageSteps;
import org.testng.annotations.Test;
import utils.Runner;

import static ge.tbc.dataObject.HomePageData.*;

public class HomePageTest extends Runner {
    HomePageSteps homePageSteps = new HomePageSteps();
    @Test
    public void successfullHotelSearch(){
        homePageSteps
                .closePopup()
                .fillDestinationInput(departurePlace)
                .fillCheckInCheckOut()
                .searchButtonClick()
                .checkReviewScoreFilter();

    }
}
