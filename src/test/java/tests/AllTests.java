package tests;

import org.testng.annotations.Test;
import pom.LoginPage;

public class AllTests extends BaseTest{
    @Test(priority = 1, description = "")
    public void hacerFactura() throws InterruptedException {
        loginPage = new LoginPage(myDriver.getDriver());
        mainPage = loginPage.fillLoginFields();

        mainPage.clickOnComprobantesEnLinea();

    }
}
