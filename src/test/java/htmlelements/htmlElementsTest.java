package htmlelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class htmlElementsTest {

    @Test
    public void regionMenuChangeButtonTest() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");

        homePage HomePage = new homePage(driver);

        HomePage.cartButton.checkoutButton.click();

        Assert.assertEquals(driver.getTitle(), "Checkout | My Store1", "Cart page is not opened");

    }
}
