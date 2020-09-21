package com.telRan.tests.tests;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTrelloTests extends TestBase {


    @BeforeMethod
    public void ensurePreconditions(){
         if(app.header().isAvatarPresent()){
             app.header().logout();
         }
    }

    @Test
    public void loginAtlassianAccPositiveTest() throws InterruptedException {
         //clickOnWelcomePage

        app.session().login("jmdonskaya@gmail.com", "trello123DS");
        //ER userLoggedIn
        Assert.assertTrue(app.header().isAvatarPresent());
        //is user correct

        // wd.findElements(By.xpath("")).size();
    }

    @Test
    public void negativeLoginAtlassianAccPositiveTest() throws InterruptedException {
        //clickOnWelcomePage

        app.session().login("jmdonskaya@gmail.com", "trelloDS");
        //ER userLoggedIn
        Assert.assertTrue(app.session().isLoginErrorPresent());
        Assert.assertFalse(app.header().isAvatarPresent());
        //is user correct

        // wd.findElements(By.xpath("")).size();
    }


}
