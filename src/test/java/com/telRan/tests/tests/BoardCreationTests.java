package com.telRan.tests.tests;

import com.telRan.tests.model.Board;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {
    @Test
    public void boardCreationTest() {
        int before = app.board().getBoardsCount();
        app.header().clickOnPlusButton();
        app.header().selectCreateBoard();
        app.board().fillBoardForm(new Board()
                .setBoardName("new qa24 board")
                .setTeamVisible("public"));
         app.board().confirmBoardCreation();
        app.header().returnOnHomePageFromBoard();
        int after = app.board().getBoardsCount();
        System.out.println("was :" + before + " now :" + after);
        Assert.assertEquals(after, before +1);
        // personal boards count before, after
    }
    @Test
    public void boardCreationTest2(){
    int before = app.board().getBoardsCount();
    app.header().clickOnPlusButton();
    app.header().selectCreateBoard();
    app.board().fillBoardForm(new Board()
            .setBoardName("qa24 board2")
            .setTeamVisible("private"));
    app.board().confirmBoardCreation();
    app.header().returnOnHomePageFromBoard();
    int after = app.board().getBoardsCount();
    System.out.println("was :" + before + " now :" + after);
    Assert.assertEquals(after, before +1);
    }
}

