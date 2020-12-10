package tests;


import app.App;
import driver.Driver;
import org.junit.Before;
import org.apache.log4j.Logger;

public class BaseSteps {
    protected App app;
    private static final Logger LOGGER = Logger.getLogger(BaseSteps.class);

    @Before
    public void setUp() {
        LOGGER.info("Test started");
        Driver.initDriver();
        app = new App();
    }


}
