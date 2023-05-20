package techproed.tests.aaaa;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import techproed.pages.Product_Attributes_Locator;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US07_CompareTest {
    Product_Attributes_Locator userSelectProductsLocator = new Product_Attributes_Locator();
    @Test
    public void testCompare() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        userSelectProductsLocator.signInButton.click();
        userSelectProductsLocator.userNameTexti.sendKeys(ConfigReader.getProperty("userNameC"),
                Keys.TAB, ConfigReader.getProperty("passwordC"), Keys.ENTER);
        Assert.assertTrue(userSelectProductsLocator.signInButton.isDisplayed());
        ReusableMethods.click(userSelectProductsLocator.newArrivals);
        Driver.getDriver().getTitle().contains("New Arrivals");
        for (int i = 0; i <5; i++) {
            ReusableMethods.click(userSelectProductsLocator.compareButton);
        }
        Assert.assertTrue(userSelectProductsLocator.compareList.getText().contains("4 Products"));
    }

    @Test(dependsOnMethods = "testCompare")
    public void testUrunleriSilebilmeli() {

        for (int i = 1; i <= 4; i++) {
            ReusableMethods.click(userSelectProductsLocator.clear);
            ReusableMethods.bekle(3);
        }
        ReusableMethods.bekle(3);
        ReusableMethods.tumSayfaResmi("Silinemeyen Urun");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(userSelectProductsLocator.compareList.getText().contains("0 Products"));
    }
    @Test(dependsOnMethods = "testCompare")
    public void testUrunlerininTamaminiSilebilmeli() {
        ReusableMethods.click(userSelectProductsLocator.clearAll);
        ReusableMethods.bekle(3);
        Assert.assertTrue(userSelectProductsLocator.compareList.getText().contains("0 Products"));

    }
    @Test(dependsOnMethods = "testCompare",priority = 4)
    public void testUrunleriKarsilastirabilmeli() {
        for (int i = 0; i <4; i++) {
            ReusableMethods.click(userSelectProductsLocator.compareButton);
        }
        ReusableMethods.click(userSelectProductsLocator.startCompare);
        ReusableMethods.tumSayfaResmi("Compare Page");
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Compare"));
        for (int i = 0; i <= 18; i++) {
            Assert.assertTrue(userSelectProductsLocator.compareProducts.isDisplayed());
        }
    }
}