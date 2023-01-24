package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h3[contains(text(),'comprobantes en')]")
    WebElement btnComprobantesEnLinea;

    public void clickOnComprobantesEnLinea() throws InterruptedException {
        Thread.sleep(9000);
        clickOnElement(btnComprobantesEnLinea);
    }
}
