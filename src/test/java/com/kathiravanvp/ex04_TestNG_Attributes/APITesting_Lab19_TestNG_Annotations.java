package com.kathiravanvp.ex04_TestNG_Attributes;

import org.testng.annotations.*;

public class APITesting_Lab19_TestNG_Annotations {
    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeClass
    void beforeClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    void actualTest(){
        System.out.println("Test Execution");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After Class");
    }

    @AfterTest
    void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("After Suite");
    }
}
