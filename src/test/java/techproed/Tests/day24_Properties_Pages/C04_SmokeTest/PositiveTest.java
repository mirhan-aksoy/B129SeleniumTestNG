package techproed.Tests.day24_Properties_Pages.C04_SmokeTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.Utilities.ConfigReader;
import techproed.Utilities.Driver;
public class PositiveTest {
    @Test(groups = "smoke")
    public void test1() {
        /*
        Acceptance Criteria:
        Admin olarak, uygulamaya giriş yapabilmeliyim
        https://www.bluerentalcars.com/
        Admin email: jack@gmail.com
        Admin password: 12345
         */
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("email"),
                Keys.TAB,ConfigReader.getProperty("pass"),Keys.ENTER);
        Assert.assertEquals(blueRentalPage.verify.getText(),"Jack Nicholson");
        Driver.closeDriver();
    }
}
