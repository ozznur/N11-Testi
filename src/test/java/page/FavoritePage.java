package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Constant.*;

public class FavoritePage extends BasePage {
    public FavoritePage(WebDriver driver) {
        super(driver);
    }


    public void searchEnterFav(String urunAdi) {
        sendKeys(URUN, urunAdi);
        searchClick();
    }


    public void searchClick() {
        click(MARKET);
    }

    public void selectProduct(By by) {
        findElement(by).click();
    }


    public void addFavori(){
        click(WISH_BUTTON);
        click(ADD_FAVORITES);
    }
}
