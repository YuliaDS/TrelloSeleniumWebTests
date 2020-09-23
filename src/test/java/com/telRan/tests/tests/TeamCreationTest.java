package com.telRan.tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamCreationTest extends TestBase {

    @Test
    public void teamCreationFromHeaderTest() {

        int before = app.team().getTeamCount();

        app.header().clickOnPlusButton();
        app.header().selectCreateTeam();
        app.team().fillTeamCreationForm("qa 24", "Продажи CRM");

        app.team().submitTeamCreationForm();
        app.team().selectIwillDoThisLaterButton();
        app.header().returnOnHomePageFromTeam();


        int after = app.team().getTeamCount();
        Assert.assertEquals(after, before);

    }
}
