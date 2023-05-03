package techproed.Tests.day01_practice;


import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.Utilities.ConfigReader;
import techproed.Utilities.Driver;
import techproed.pages.FacebookPage;

public class C04_PageClassKullanimi {

    // facebook anasayfaya gidin
    // kullanıcı email kutusuna rastgele bir isim yazın
    // kullanıcı sifre kutusuna rastgele bir password yazın
    // giris yap butonuna tıklayın
    // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
    // sayfayı kaptın


    @Test
    public void test01() {

        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        // kullanıcı email kutusuna rastgele bir isim yazın
        FacebookPage facebookPage = new FacebookPage();
        facebookPage.emailKutusu.sendKeys("Ahmet");

        // kullanıcı sifre kutusuna rastgele bir password yazın
        facebookPage.sifreKutusu.sendKeys("123456");

        // giris yap butonuna tıklayın
        facebookPage.girisYapButonu.click();

        // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
        Assert.assertTrue(facebookPage.girdiginSifreYanlisYaziElementi.isDisplayed());

        // sayfayı kaptın
        Driver.closeDriver();

       /*
       TestNG ile beraber framework'umuzu daha duzenli hale getirdik.
       locate'lerimizi Page package'ı altında depoladık.
        test'imizi Test package'ı altında olusturduk.
       driver'ı Utilities package'ı altındaki Driver class'ından kullandık.
       bizim icin gerekli olan verileri "Configrations.properties" dosyasında depoladık.
       Ve bu verilerin degerlerini "ConfigReader" sayesinde alabildik.

        */
    }
}