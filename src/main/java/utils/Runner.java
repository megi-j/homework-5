package utils;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.*;

public class Runner {
    @BeforeClass
    public void setUp(){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addPreference("geo.enabled", false);
        options.addPreference("permissions.default.geo", 2);

        Configuration.browser = "firefox";
        Configuration.browserCapabilities = options;

        Configuration.headless = false;
        Configuration.pageLoadStrategy = "normal";
        Configuration.pageLoadTimeout = 60000;
        open("https://www.booking.com/");


    }
    @AfterClass
    public void tearDown(){
        Selenide.clearBrowserLocalStorage();
        Selenide.clearBrowserCookies();
        closeWebDriver();
    }
}
