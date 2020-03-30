package constants;

import org.openqa.selenium.By;

public class Constant {
    public static String WEBLINK = "https://www.n11.com/";
    public static final By LOG_IN = By.className("btnSignIn"); //nursema
    public static final By EMAIL =By.id("email"); // nursema
    public static final By PASSWORD = By.id("password"); //N
    public static final By LOG_IN_BUTTON = By.id("loginButton"); // N
    public static final By PRODUCT = By.xpath("//*[@id=\"p-285098982\"]/div[1]/a/img");
    public static final By SECILI_URUN = By.xpath("//*[@id=\"contentProDetail\"]/div/div[3]/div[2]/div[3]/div[3]/a[2]");
    public static final By BASKET =By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[2]/div[4]/a/i");
    public static final By INCREASEBUTTON= By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[1]/div/span[1]");
    public static final By DECREASEBUTTON=By.xpath("//*[@id=\"newCheckout\"]/div/div[1]/div[2]/div[1]/section/table[2]/tbody/tr/td[3]/div[1]/div/span[2]");
    public static final By BUY_PRODUCT=By.xpath("//*[@id='js-buyBtn']");
    public static final By MARKET = By.xpath("//*[@id='header']/div/div/div[1]/ul/li[2]/a"); // gamze
    public static final By URUN = By.xpath("//*[@id='searchData']"); // gamze
    public static final By SEARCH_MARKET = By.xpath("//*[@id=\"header\"]/div/div/div[2]/div[1]/a"); // gamze
    public static final By INPUT = By.id("searchData"); // MErve
    public static final By SEARCH = By.className("searchBtn"); // Merve
//gülseren
    public static final By SEARCH_AREA = By.id("searchData");
    public static final By WISH_BUTTON = By.xpath("//*[@id='getWishList']");
    public static final By SEARCH_BUTTON = By.className ("searchBtn");
    public static final By SELECT_PRODUCT = By.cssSelector("#adSponsoredShopComponent > div > ul > li:nth-child(1) > a > img");
    public static final By ADD_FAVORITES = By.xpath("//*[@id='addToFavouriteWishListBtn']");
}
