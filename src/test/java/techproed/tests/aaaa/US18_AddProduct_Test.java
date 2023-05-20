package techproed.tests.aaaa;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import techproed.pages.Product_Attributes_Locator;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;


public class US18_AddProduct_Test {
    @Test
    public void addProduct() {
        Product_Attributes_Locator userSelectProductsLocator = new Product_Attributes_Locator();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        userSelectProductsLocator.signInButton.click();
        userSelectProductsLocator.userNameTexti.sendKeys(ConfigReader.getProperty("userNameV"),
                Keys.TAB, ConfigReader.getProperty("passwordV"), Keys.ENTER);
        Assert.assertTrue(userSelectProductsLocator.signInButton.isDisplayed());

        userSelectProductsLocator.signOut.click();

        userSelectProductsLocator.storeManager.click();

        ReusableMethods.click(userSelectProductsLocator.productsButton);

        ReusableMethods.click(userSelectProductsLocator.addNewProduct);

        Select select = new Select(userSelectProductsLocator.productDDM);
        select.selectByVisibleText("External/Affiliate Product");

        //Urun bilgileri doldur
        userSelectProductsLocator.productUrl.sendKeys(ConfigReader.getProperty("prdouct_Url"),
                Keys.TAB, ConfigReader.getProperty("product_Button"),
                Keys.TAB, ConfigReader.getProperty("prdouct_Price"),
                Keys.TAB, ConfigReader.getProperty("prdouct_SalePrice"),Keys.ENTER);
        ReusableMethods.tumSayfaResmi("text'ler doldumu");


    }
}