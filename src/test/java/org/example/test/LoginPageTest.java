package org.example.test;

import org.example.base.BaseTest;
import org.example.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @Before
    public void before(){
        loginPage = new LoginPage(getWebDriver());
    }
    @Test
    public void test() throws InterruptedException {
        loginPage.moveToLogIn().clickLogIn().sendEmail().sendPassword().SubmitButton().search().clickButton().movetwopage().favoriteproduct().myaccount().favorites().selected().deleted().delete();
        Thread.sleep(5000);
    }
    @After
    public void after() throws InterruptedException {
        Thread.sleep(900);
        //tearDown;
    }
}
