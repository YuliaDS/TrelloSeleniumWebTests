package com.telRan.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws InterruptedException {
        app.init();
        app.login("jmdonskaya@gmail.com", "trello123DS");

    }

    @AfterClass(enabled = true)
    public void tearDown(){
        app.stop();
    }


}

