package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginPage = By.linkText("Sign In");
    public void clickOnLogin(){
        clickOnElement(loginPage);
    }
}
