package Example_1;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.hasText;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;

public class SuccessBlock extends BaseView {

    public SuccessBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='ajax_block_products_total']")
    private WebElement sumElement;

    private final static String successIconXPathLocator = "//i[@class='icon-ok']";

    @FindBy(xpath = successIconXPathLocator)
    private WebElement successIconOk;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedCheckoutButton;

    @Step("Проверка появления окна с подтвердением о заказе и валидности суммы заказа")
    public void checkSuccessWithSum(String summ) {
        //webDriverWait.until(ExpectedConditions.visibilityOf(successIconOk));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(successIconXPathLocator)));
        Assertions.assertAll(
                () -> assertThat(driver.findElement(By.xpath("//i[@class='icon-ok']")), isDisplayed()),
                () -> assertThat(driver.findElement(By.xpath("//span[@class='ajax_block_products_total']")), hasText(summ))
        );
    }

    @Step("Продолжение оформления заказа")
    public N1_ShoppingCartSummaryPage clickProceedCheckoutButton() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Proceed to checkout']")));
        proceedCheckoutButton.click();
        return new N1_ShoppingCartSummaryPage(driver);
    }

}
