package techproed.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.Utilities.Driver;
public class BlueRentalPage {
    //normalde web elementleri locate için findelement kullanıyorduk
    //Test NG de Page clasta kullanımı aşagıdaki gibi olur

    /*
    TESTLERİMİZ: TEST PACKAGE ALTINDA
    LOCATELERİMİZ:PAGES PACKAGE ALTINDA
    AYARLAMALARI YAPTIĞIMIZ VE METHODLAR OLUŞTURDUĞUMUZ CLASSLAR UTILITIES ALTINDA
     */
    public BlueRentalPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[@role='button'])[1]")
    public WebElement login;
    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement email;
    @FindBy(id = "dropdown-basic-button")
    public WebElement verify;
    @FindBy(xpath = "//*[@role='alert']")
    public WebElement hataMesaji;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement login2;
    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement login3;
    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logout;
    //bu bir örnektir
    @FindBy(xpath = "//*[text()='OK']")// Linklerin listesinin locati
    public WebElement ok;

}
