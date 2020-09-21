package com.telRan.tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {
    @Test
    public void boardCreationTest() {
        int before = app.board().getBoardsCount();
        app.header().clickOnPlusButton();
        app.header().selectCreateBoard();
        app.board().fillBoardForm("new qa24 board", "public");
         app.board().confirmBoardCreation();
        app.header().returnOnHomePage();
        int after = app.board().getBoardsCount();
        System.out.println("was :" + before + "now :" + after);
        Assert.assertEquals(after, before +1);
        // personal boards count before, after
    }
    @Test
    public void boardCreationTest2(){
    int before = app.board().getBoardsCount();
    app.header().clickOnPlusButton();
    app.header().selectCreateBoard();
    app.board().fillBoardForm("new qa24 board", "private");
    app.board().confirmBoardCreation();
    app.header().returnOnHomePage();
    int after = app.board().getBoardsCount();
    System.out.println("was :" + before + "now :" + after);
    Assert.assertEquals(after, before +1);
    }
}

