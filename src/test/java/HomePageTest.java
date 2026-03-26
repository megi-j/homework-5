import ge.tbc.steps.HomePageSteps;
import org.testng.annotations.Test;
import utils.Runner;

import static ge.tbc.dataObject.HomePageData.*;

public class HomePageTest extends Runner {
    HomePageSteps homePageSteps = new HomePageSteps();
    @Test
    public void successfullFlightSearch(){
        homePageSteps
                .fillOriginInput(originCity)
                .fillDestinationInput(destinationCity);
    }
}
