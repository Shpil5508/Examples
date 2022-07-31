package Example_1;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class N6_OrderSummery extends BaseView{
    public N6_OrderSummery(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='I confirm my order']")
    private WebElement confirmOrderButton;

    @Step("Клик на кнопку окончательного подтверждения покупки")
    public N6_OrderSummery clickConfirmOrderButton() {
        confirmOrderButton.click();
        return this;
    }
}
