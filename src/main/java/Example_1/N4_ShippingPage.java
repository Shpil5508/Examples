package Example_1;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class N4_ShippingPage extends BaseView{
    public N4_ShippingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkbox;

    @FindBy(xpath = "//button[@name='processCarrier']")
    private WebElement checkoutButton_4;

    @Step("Клик на чек-бокс (включение)")
    public N4_ShippingPage clickCheckbox() {
        checkbox.click();
        return this;
    }

    @Step("Клик на кнопку продолжения покупки_4")
    public N5_PaymantPage clickCheckoutButton_4() {
        checkoutButton_4.click();
        return new N5_PaymantPage(driver);
    }
}
