package techproed.Tests.day01_practice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import techproed.Utilities.TestBase;

public class C03_softAssert extends TestBase {

    // "https://amazon.com" sayfasına gidiniz
    /// Title'in "Amazon" icerdigini test edin
    /// Arama kutusunun erisilebilir oldugunu test edin
    // Arama kutusuna nutella yazıp aratın
    /// Sonuc yazısının gorunur oldugunu test edin
    /// Sonuc yazısının "Nutella" icerdigini test edin

    // test islemlerini softAsser ile yapınız ve hatalar icin mesaj versin

    @Test
    public void test01() {
        // "https://amazon.com" sayfasına gidiniz
        driver.get("https://amazon.com");

        /// Title'in "Amazon" icerdigini test edin
        SoftAssert softAssert = new SoftAssert();

        String amazonTitle = driver.getTitle();

        softAssert.assertTrue(amazonTitle.contains("RAmazon1"),"TİTLE AMAZON İCERMİYOR");

        /// Arama kutusunun erisilebilir oldugunu test edin
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        softAssert.assertTrue(aramaKutusu.isEnabled(),"ARAMA KUTUSUNA ERİSİLEMİYOR");

        // Arama kutusuna nutella yazıp aratın
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);


        /// Sonuc yazısının gorunur oldugunu test edin
        WebElement sonucYazisi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        softAssert.assertTrue(sonucYazisi.isDisplayed(),"SONUC YAZISI GORUNMUYOR");

        /// Sonuc yazısının "Nutella" icerdigini test edin

        softAssert.assertTrue(sonucYazisi.getText().contains("Kutella"),"SONUC YAZISI Nutella ICERMIYOR");

        softAssert.assertAll();
        /*
        softAssert.assertAll(); yazıp tum hataları listelemesini istemeliyiz. Aksi halde hata vermez
         */

    }
}