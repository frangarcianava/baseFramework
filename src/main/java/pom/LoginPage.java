package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="username")
    private WebElement exampleField;
    @FindBy(id="btn")
    private WebElement btnExample;

    public MainPage fillLoginFields(){
        completeField(exampleField, "20375299873");
        clickOnElement(btnExample);

        return new MainPage(getDriver());
    }
}
