package Example_1;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class N1_ShoppingCartSummaryPage extends BaseView{
    public N1_ShoppingCartSummaryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//p/a[@title='Proceed to checkout']")
    private WebElement checkoutButton_1;

    @Step("Клик на кнопку продолжения покупки_1")
    public N3_AddressesPage clickCheckoutButton_1() {
        checkoutButton_1.click();
        return new N3_AddressesPage(driver);
    }

}
