package app;

import com.codeborne.selenide.SelenideElement;
import config.AppConfig;
import org.apache.log4j.Logger;
import pages.MainPage;
import pages.ResultsPage;

public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class);

    MainPage mainPage = new MainPage();
    ResultsPage resultsPage = new ResultsPage();

    public void openMain(){
        mainPage.open();
    }

    public void searchHotel() {
        mainPage.searchHotel(AppConfig.KRAKOW);
    }

    public void likeFirstResult(){
       resultsPage.likeFirstResult();
    }

    public void sortResults(){
        resultsPage.sortResultsByPrice();
    }

    public SelenideElement getPopUP(){
        LOGGER.debug("Get pop up");
        return resultsPage.likePopUp;
    }
}
