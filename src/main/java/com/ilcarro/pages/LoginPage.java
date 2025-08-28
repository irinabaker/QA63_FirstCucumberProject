package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement emailInput;
    @FindBy(id = "password")
    WebElement passwordInput;

    public LoginPage enterData(String email, String password) {
        type(emailInput,email);
        type(passwordInput,password);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement yallaButton;

    public LoginPage clickOnYalla() {
        click(yallaButton);
        return this;
    }

    @FindBy(css = "h2.message")
    WebElement textMessage;

    public LoginPage verifyMessage(String message) {
        assert shouldHaveText(textMessage,message,10);
        return this;
    }
}
