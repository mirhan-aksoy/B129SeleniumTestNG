package techproed.Tests.day01_practice;

import Utilities.TestBase;
import org.testng.annotations.Test;

public class C01_Priority extends TestBase {


    // amazon isimli bir test methodu olusturunuz. Ve amazona gidiniz
    // bestbuy isimli bir test methodu olusturunuz. Ve bestbuy'a gidiniz
    // techproeducation isimli bir test methodu olusturunuz. Ve techproeducation'a gidiniz

    // once techproeducation, sonra amazon, sonra bestbuy test methodu calısacak sekilde sıralama yapınız

    @Test(priority = -2)
    public void amazon() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void bestbuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test(priority = -5)
    public void techproeducation() {
        driver.get("https://www.techproeducation.com");
    }
    /*
    TestNG, test methodlarını isim sırasına gore calıstırır
    eger isim sıralamasının dısında bir sıralama ile calısmasını isterseniz
    o zaman test methodlarına oncelik(priority) tanımlayabiliriz.


    priority kucukten buyuge gore calısır
    eger bir test methoduna priority degeri atanmamıssa
    default olarak priority=0 kabul edilir
     */
}