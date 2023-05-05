package techproed.Tests.day26_ExcelDataProvider;
import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;
public class C02_DataProvider {

    // Eger baska bir classta dataprovider'larimizi yaziyorsak
// dataProvider = "cityDatas" 'dan sonra
// dataProvider'imizin nerede oldugunu belirtmemiz gerekiyor.
// Bu yuzden virgul koyup 'dataProviderClass = DataProviderUtils.class)' diyerek yerini gosterdik.


    @Test(dataProvider = "sehirVerileri",dataProviderClass = DataProviderUtils.class)
    public void test1(String ad,String bolge,String plaka) {
        System.out.println(ad+" | "+bolge+" | "+plaka);
    }

    @Test(dataProvider = "kullanicilar",dataProviderClass = DataProviderUtils.class)
    public void test2(String username,String password) {
        System.out.println(username+" | "+password);
    }
    /*
    Yukardaki örneklerdeki gibi blueRentalCar sayfasına login olunuz
    Her data için login olduğunuzu doğrulayınız
    NOT:configuration.properties dosyasındaki verileri kullanınız
     */
}







