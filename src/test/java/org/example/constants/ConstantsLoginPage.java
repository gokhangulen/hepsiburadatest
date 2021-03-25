package org.example.constants;

import org.openqa.selenium.By;

public class ConstantsLoginPage {
    public static final By MOVE = By.id("myAccount");
    public static final By LOG_IN = By.id("login");
    public static final By EMAIL_AREA = By.id("txtUserName");
    public static final By PASSWORD_AREA = By.id("txtPassword");
    public static final By CLICK_BUTTON_LOGIN = By.id("btnLogin");
    public static final By SEARCH_AREA = By.className("desktopOldAutosuggestTheme-input");
    public static final By CLICK_BUTTON = By.xpath("//*[@id=\"SearchBoxOld\"]/div/div/div[2]");
    public static final By MOVE_TWO_PAGE = By.xpath("//*[@id=\"pagination\"]/ul/li[2]/a");
    public static final By FAVORİTE_PRODUCT = By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div/div[2]/section/div[1]/div[4]/div/div/div/div/ul/li[3]/div/div[1]/div");
    public static final By MY_ACCOUNT_CLİCK = By.xpath("//*[@id=\"myAccount\"]/span/a/span[1]");
    public static final By FAVORİTES = By.xpath("//*[@id=\"myAccount\"]/div/div[2]/ul/li[5]/a");
    public static final By SELECTED = By.xpath("//*[@id=\"StickActionHeader-SelectAll\"]");
    public static final By DELETED = By.id("StickActionHeader-RemoveSelected");
    public static final By DELETE = By.id("DeleteConfirmationModal-ActionButton");
}
