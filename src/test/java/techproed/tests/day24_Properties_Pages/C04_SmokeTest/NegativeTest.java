package techproed.tests.day24_Properties_Pages.C04_SmokeTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;
public class NegativeTest {
    @Test(groups = "smoke")
    public void test1(){
        /*
        Description:
        Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
        Acceptance Criteria
        Customer email: fake@bluerentalcars.com
        Customer password: fakepass
        Error:
        User with email fake@bluerentalcars.com not found
         */
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        Reporter.log("BlueRental Sayfasına gidildi");
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        Reporter.log("Login buttonuna tıklandı");
        blueRentalPage.email.sendKeys("erol@gmail.com",
                Keys.TAB,"12345");
        Reporter.log("Email ve Password girildi");
        blueRentalPage.login2.click();
        Reporter.log("Tekrar login butonuna tıklandı");
        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi("TumSayfaResmi");
        Reporter.log("Sayfanın resmi alındı");
        Assert.assertTrue(blueRentalPage.hataMesaji.isDisplayed());
        Reporter.log("Doğrulama yapıldı");
        Driver.closeDriver();
        Reporter.log("Sayfa kapatıldı");
    }
}
