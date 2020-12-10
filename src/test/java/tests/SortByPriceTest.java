package tests;

import com.codeborne.selenide.Condition;
import config.AppConfig;
import org.junit.Test;

public class SortByPriceTest extends BaseSteps {


    @Test
    public void sortByPrice() {
        app.openMain();
        app.searchHotel();
        app.sortResults();
        app.likeFirstResult();
        app.getPopUP().shouldHave(Condition.text(AppConfig.EXPECTED_POPUP));

    }
}
