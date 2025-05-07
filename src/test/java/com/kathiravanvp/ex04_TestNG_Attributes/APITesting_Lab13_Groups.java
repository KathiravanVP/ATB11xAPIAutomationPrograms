package com.kathiravanvp.ex04_TestNG_Attributes;

import org.testng.annotations.Test;

public class APITesting_Lab13_Groups {
    @Test(groups = {"Smoke","Regression"})
    public void TC1(){
        System.out.println("Test Case 1");
    }

    @Test(groups = {"Smoke","Sanity"})
    public void TC2(){
        System.out.println("Test Case 2");
    }

    @Test(groups = {"Regression"})
    public void TC3(){
        System.out.println("Test Case 3");
    }
}
