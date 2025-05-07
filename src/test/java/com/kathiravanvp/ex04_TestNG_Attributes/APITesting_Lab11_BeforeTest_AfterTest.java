package com.kathiravanvp.ex04_TestNG_Attributes;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting_Lab11_BeforeTest_AfterTest {
    @BeforeTest
    public void beforeTest(){
        System.out.println("Pre-Requisite method");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Closing method");
    }

    @Test
    public void testCase(){
        System.out.println("Test Case Execution");
    }
}
