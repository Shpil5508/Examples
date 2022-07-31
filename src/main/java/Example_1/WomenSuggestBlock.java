package Example_1;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenSuggestBlock extends BaseView {
    public WomenSuggestBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[contains(@class, 'submenu-container')]//li/a[@title='T-shirts']")
    private WebElement tShirtsButton;

    @Step("Клик на кнопку 'T-Shirts'")
    public TShirtsPage tShirtsButtonClick() {
        tShirtsButton.click();
        return new TShirtsPage(driver);
    }

}
