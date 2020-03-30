package page;

import base.BasePage;
import com.thoughtworks.gauge.execution.parameters.parsers.converters.StringToIntegerConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static constants.Constant.PRODUCT;

public class BasketPage extends BasePage {

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage addBasket(By by) {
        findElement(by).click();
        return this;
    }

}