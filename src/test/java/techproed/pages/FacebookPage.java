package techproed.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class FacebookPage {


    public FacebookPage() {

        PageFactory.initElements(Driver.getDriver(),this);

    }


    // kullanıcı email kutusuna rastgele bir isim yazın

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailKutusu;


    // kullanıcı sifre kutusuna rastgele bir password yazın

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement sifreKutusu;

    // giris yap butonuna tıklayın

    @FindBy(xpath = "//button[@name='login']")
    public WebElement girisYapButonu;

    // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement girdiginSifreYanlisYaziElementi;

    // sayfayı kaptın






}
