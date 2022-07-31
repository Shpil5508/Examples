package Example_1;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class N5_PaymantPage extends BaseView{
    public N5_PaymantPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='bankwire']")
    private WebElement payByBankWire;

    @Step("Клик на кнопку подтверждения покупки (для банка)")
    public N6_OrderSummery clickPayByBankWire() {
        payByBankWire.click();
        return new N6_OrderSummery(driver);
    }
}
