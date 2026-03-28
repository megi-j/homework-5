package utils;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Runner {
    @BeforeClass
    public void setUp(){
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("geo.enabled", false);
        options.addPreference("permissions.default.geo", 2);

        Configuration.browser = "firefox";
        Configuration.browserCapabilities = options;

        Configuration.headless = false;
        Configuration.pageLoadStrategy = "normal";
        Configuration.pageLoadTimeout = 60000;
        open("https://www.wizzair.com/en-gb");
    }
    @AfterClass
    public void tearDown(){
        Selenide.clearBrowserLocalStorage();
        Selenide.clearBrowserCookies();
        closeWebDriver();
    }
}
