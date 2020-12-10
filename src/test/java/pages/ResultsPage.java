package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;


public class ResultsPage {
    private static final Logger LOGGER = Logger.getLogger(MainPage.class);

    public SelenideElement sortPrice = $(By.xpath("//li[@class=' sort_category   sort_price ']"));

    public SelenideElement firstLike = $(By.xpath("//div[@id='hotellist_inner']/div[1]//button"));

    public SelenideElement likePopUp = $(By.xpath("//div[@id='hotel-wishlists']/div[contains(.,'Saved')]"));

    public void sortResultsByPrice() {
        LOGGER.debug("Sort by price");
        sortPrice.click();
    }

    public void likeFirstResult() {
        LOGGER.debug("Like the first result");
        firstLike.click();
    }

}
