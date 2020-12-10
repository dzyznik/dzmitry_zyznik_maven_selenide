package driver;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import config.TestConfig;

public class Driver {
    public static void initDriver() {


        TestConfig.initConfig();


        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = false;
        Configuration.screenshots = false;

        if(TestConfig.isHeadless()) {
            Configuration.headless = true;
        } else {
            Configuration.headless = false;
        }

        if ("firefox".equals(TestConfig.browser)) {
            Configuration.browser = Browsers.FIREFOX;
        } else {
            Configuration.browser = Browsers.CHROME;
        }
    }
}
