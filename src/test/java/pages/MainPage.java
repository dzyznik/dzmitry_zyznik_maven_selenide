package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import config.AppConfig;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private static final Logger LOGGER = Logger.getLogger(MainPage.class);

    public SelenideElement searchField = $(By.xpath("//input[@type='search']"));
    public SelenideElement dateField = $(By.xpath("//div[@class='xp__dates xp__group']"));
    public SelenideElement startDate = $(By.xpath("//td[@data-date= '2020-12-25']"));
    public SelenideElement endDate = $(By.xpath("//td[@data-date= '2021-01-04']"));
    public SelenideElement guestsField = $(By.xpath("//div[@class='xp__input-group xp__guests']"));
    public SelenideElement addAdult = $(By.xpath("//div[@class='sb-group__field sb-group__field-adults']//button[2]"));
    public SelenideElement addChildren = $(By.xpath("//div[@class='sb-group__field sb-group-children ']//button[2]"));
    public SelenideElement submitButton = $(By.xpath("//button[@class='sb-searchbox__button ']"));

    public void open() {
        LOGGER.debug("Open Booking app");
        Selenide.open(AppConfig.BASEURL);
    }

    public void searchHotel(String city) {
        LOGGER.debug("Set city");
        searchField.setValue(city);
        LOGGER.debug("Click on date field");
        dateField.click();
        LOGGER.debug("Choose start date");
        startDate.click();
        LOGGER.debug("Choose end date");
        endDate.click();
        LOGGER.debug("Click on guest field");
        guestsField.click();
        LOGGER.debug("Add adult");
        addAdult.click();
        LOGGER.debug("Add children");
        addChildren.click();
        LOGGER.debug("Add children");
        addChildren.click();
        LOGGER.debug("Submit");
        submitButton.click();
    }


}
