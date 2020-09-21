package com.telRan.tests.tests;

import com.telRan.tests.fw.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws InterruptedException {
        app.init();
        app.session().login("jmdonskaya@gmail.com", "trello123DS");

    }

    @AfterClass(enabled = true)
    public void tearDown(){
        app.stop();
    }


}

