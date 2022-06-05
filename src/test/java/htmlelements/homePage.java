package htmlelements;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public class homePage {

    cartButton cartButton;

    public homePage(WebDriver driver) {

        HtmlElementLoader.populatePageObject(this, driver);

    }
}


