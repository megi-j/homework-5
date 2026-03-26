package ge.tbc.steps;

import ge.tbc.pageObject.HomePage;

public class HomePageSteps extends HomePage {
    public HomePageSteps fillOriginInput(String originCityValue){
        originCityInput.setValue(originCityValue);
        return this;
    }
    public HomePageSteps fillDestinationInput(String destinationCityValue){
        destinationCityInput.setValue(destinationCityValue);
        return this;
    }
}
