package test;

import base.BasePage;
import base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import page.*;

import static constants.Constant.*;


public class StepImplementation extends BaseTest {

    LoginPage loginPage;
    BasketPage basketPage;
    SearchPage searchPage;
    MarketPage marketPage;
    FavoritePage favoritePage;

    @Step("n11 e git")
    public void homepage() {
        loginPage = new LoginPage(getWebDriver());
        basketPage = new BasketPage(getWebDriver()); // clası çalıştırmak için bunu eklemek zorundasın.
        searchPage = new SearchPage(getWebDriver());
        marketPage = new MarketPage(getWebDriver());
        favoritePage = new FavoritePage(getWebDriver());
    }

    @Step("aramaya <text> yaz")
    public void searchEnterText(String text) {
        searchPage.searchEnterText(text);
    }

    @Step("bir urun sec") // biglisayar yazınca çıkan aramalardan birini seçtim
    public void urunSec() {
        basketPage.addBasket(PRODUCT);
    }

    @Step("urunu sepete ekle") // açılan urun ayrıntıları sayfasında urunu sepete ekledi
    public void basket() {
        basketPage.addBasket(SECILI_URUN);
    }

    @Step("sepete git")
    public void goBasket() {
        basketPage.addBasket(BASKET);
    }

    @Step("urun sayisini arttir") // sepete eklenene ürünün sayısını arttırma kontrolü
    public void incrementProduct() {
        basketPage.addBasket(INCREASEBUTTON);
    }

    @Step("urun sayisini azalt") // sepete eklenene ürünün sayısını azaltma kontrolü
    public void descriminentProduct() {
        basketPage.click(DECREASEBUTTON);
    }

    @Step("satin al")
    public void giveproduct() {
        basketPage.click(BUY_PRODUCT);
    }
    @Step("Giriş yap butonuna tıkla") // sepete ekleme giriş kontrolü yaptıktan sonra açıcam
    public void loginClick() {
        loginPage.click(LOG_IN);

    }

    @Step("Email <email> girin")
    public void emailEnter(String email) {
        loginPage.sendEmail(email);
    }

    @Step("Şifre  <qwerty1> girin")
    public void passwordEnter(String password) {
        loginPage.sendPassword(password);
        loginPage.click(LOG_IN_BUTTON);
    }


    @Step("market11 butonuna tıkla")
    public void marketClick() {
        marketPage.click(MARKET);
    }

    @Step("ürün <urunAdi> ara")
    public void urunEnter(String urunAdi) {
        marketPage.sendProduct(urunAdi);
    }


    @Step("arama butonuna bas")
    public void search() {
        marketPage.click(SEARCH);
    }

    @Step("anasayfaya git")
    public void goBack() {
        getWebDriver().navigate().to(WEBLINK);
    }

    @Step("urun <text> arat ve tıkla")  // gülseren
    public void urunFav(String text) {
        favoritePage.searchEnterFav(text);
        favoritePage.selectProduct(SEARCH);
    }

    @Step("favorilere ekle")
    public void addFav() {
        favoritePage.selectProduct(WISH_BUTTON);
    }

    @Step("ekleme")
    public void implementation2() {
        favoritePage.click(ADD_FAVORITES);

    }
}