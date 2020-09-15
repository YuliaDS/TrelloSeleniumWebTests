package com.telRan.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {
    @Test
    public void boardCreationTest() {
        int before = app.getBoardsCount();
        app.clickOnPlusButton();
        // selectCreateBoard()
        app.fillBoardForm("new qa24 board", "public");
         app.confirmBoardCreation();
        app.returnOnHomePage();
        int after = app.getBoardsCount();
        System.out.println("was :" + before + "now :" + after);
        Assert.assertEquals(after, before +1);
        // personal boards count before, after
    }


