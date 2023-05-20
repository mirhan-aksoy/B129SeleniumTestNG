package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;


public class Product_Attributes_Locator {
    public Product_Attributes_Locator() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //--------------- US-20 LOCATER -------------------------------------------------

    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement userNameTexti;

    @FindBy(id = "password")
    public WebElement passwordTexti;

    @FindBy(name = "login")
    public WebElement login;
    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signOut;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;

    //    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-coupons']/a/span[2]")
//    public WebElement couponsButton;
    @FindBy(xpath = "(//*[@class='text'])[6]")
    public WebElement couponsButton;

    @FindBy(id = "add_new_coupon_dashboard")
    public WebElement addNewButton;

    @FindBy(xpath = "(//span[@class='text'])[8]")
    public WebElement refundButton;

    @FindBy(id = "title")
    public WebElement codeTexti;


    @FindBy(id = "discount_type")
    public WebElement discount_typeDDM;

    @FindBy(id = "coupon_amount")
    public WebElement coupon_amounTexti;

    @FindBy(id = "expiry_date")
    public WebElement expiry_dateTexti;

    @FindBy(id = "free_shipping")
    public WebElement free_shippingRadioButton;

    @FindBy(id = "show_on_store")
    public WebElement show_on_storeRadioButton;

    @FindBy(id = "wcfm_coupon_manager_submit_button")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@class='wcfm-message wcfm-success']")
    public WebElement verifyMessage;


        //--------------------------------------------------------------------------------------------------

    @FindBy(xpath = "(//a[@href='/product-category/new-arrivals/'])[1]")
    public WebElement newArrivals;

        //    @FindBy(xpath = "(//*[@class='compare btn-product-icon'])[1]")
//    public WebElement compareButton;

    @FindBy(xpath = "//*[@class='compare btn-product-icon']")
    public WebElement compareButton;

    @FindBy(xpath = "//*[@class='compare-heading']")
    public WebElement compareList;

    @FindBy(xpath = "//*[@class='breadcrumb']")
    public WebElement bread;

    @FindBy(xpath = "//*[@class='compare-clean']")
    public WebElement clearAll;

    @FindBy(xpath = "//*[@class='btn-remove remove_from_compare fas fa-times']")
    public WebElement clear;

    @FindBy(xpath = "//*[@class='btn btn-dark btn-rounded']")
    public WebElement startCompare;

    @FindBy(xpath = "//*[@class='compare-col compare-value']")
    public WebElement compareProducts;

    @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")
    public WebElement errorMessage;

    @FindBy(xpath = "(//*[@class='wcfm-collapse-content'])[1]")
    public WebElement coupons;

        
        
        
        
        
    @FindBy(xpath = "(//*[@class='text'])[4]")
    public WebElement productsButton;

    @FindBy(id = "add_new_product_dashboard")
    public WebElement addNewProduct;

        
    @FindBy(id = "product_type")
    public WebElement productDDM;

    @FindBy(id = "product_url")
    public WebElement productUrl;

    @FindBy(id = "regular_price")
    public WebElement productPrice;

    @FindBy(id = "button_text")
    public WebElement productButtonText;

    @FindBy(id = "sale_price")
    public WebElement productSalePrice;

    @FindBy(xpath = "//*[@name='submit-data']")
    public WebElement productsubmit;

        
        
        
        
        
        
        
        
        
}