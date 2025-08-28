package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {

    @And("User clicks on Login link")
    public void click_on_Login_link() {
        new HomePage(driver).clickOnLoginLink();
    }

    @And("User enters correct data")
    public void enter_correct_data() {
        new LoginPage(driver).enterData("manuel@gm.com","Manuel1234!");
    }

    @And("User clicks on Yalla button")
    public void click_on_Yalla() {
        new LoginPage(driver).clickOnYalla();
    }

    @Then("User verifies SuccessMessage is displayed")
    public void verify_Success() {
        new LoginPage(driver).verifyMessage("Logged in success");
    }
}
