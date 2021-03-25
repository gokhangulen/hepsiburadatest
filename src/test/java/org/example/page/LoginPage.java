package org.example.page;

import org.apache.maven.plugin.logging.Log;
import org.example.base.BasePage;
import org.openqa.selenium.WebDriver;

import static org.example.constants.ConstantsLoginPage.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public LoginPage moveToLogIn(){
        hoverElement(MOVE);
        return this;
    }

    public LoginPage clickLogIn(){
        click(LOG_IN);
        return this;
    }

    public LoginPage sendEmail(){
        sendKeys(EMAIL_AREA,"testdeneme0246@gmail.com");
        return this;
    }

    public LoginPage sendPassword(){
        sendKeys(PASSWORD_AREA,"GG1234567");
        return this;
    }

    public LoginPage SubmitButton(){
        click(CLICK_BUTTON_LOGIN);
        return this;
    }

    public LoginPage search(){
        sendKeys(SEARCH_AREA,"Samsung");
        return this;
    }

    public LoginPage clickButton(){
        click(CLICK_BUTTON);
        return this;
    }

    public LoginPage movetwopage(){
        click(MOVE_TWO_PAGE);
        return this;
    }

    public LoginPage favoriteproduct(){
        click(FAVORİTE_PRODUCT);
        return this;
    }
    public LoginPage myaccount(){
        click(MY_ACCOUNT_CLİCK);
        return this;
    }

    public LoginPage favorites(){
        click(FAVORİTES);
        return this;
    }

    public LoginPage selected(){
        click(SELECTED);
        return this;
    }

    public LoginPage deleted(){
        click(DELETED);
        return this;
    }

    public LoginPage delete(){
        click(DELETE);
        return this;
    }
}
