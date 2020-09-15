package com.telRan.tests;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTrelloTests extends TestBase {


    @BeforeMethod
    public void ensurePreconditions(){
         if(app.isAvatarPresent()){
             app.logout();
         }
    }

    @Test
    public void loginAtlassianAccPositive() throws InterruptedException {
         //clickOnWelcomePage

        app.login("jmdonskaya@gmail.com", "trello123DS");
        //ER userLoggedIn
        Assert.assertTrue(app.isAvatarPresent());
        //is user correct

        // wd.findElements(By.xpath("")).size();
    }

    @Test
    public void negativeLoginAtlassianAccPositive() throws InterruptedException {
        //clickOnWelcomePage

        app.login("jmdonskaya@gmail.com", "trelloDS");
        //ER userLoggedIn
        Assert.assertTrue(app.isLoginErrorPresent());
        Assert.assertFalse(app.isAvatarPresent());
        //is user correct

        // wd.findElements(By.xpath("")).size();
    }


}
