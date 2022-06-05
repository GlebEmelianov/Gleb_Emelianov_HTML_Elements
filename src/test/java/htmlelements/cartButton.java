package htmlelements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("Cart Button")
@FindBy(xpath="//a[@class='link']")
public class cartButton extends HtmlElement {

        @Name("Checkout button")
        @FindBy(xpath="//a[@class='link']")
        WebElement checkoutButton;

        public void clickCheckoutButton() {
                checkoutButton.click();
        }
}
