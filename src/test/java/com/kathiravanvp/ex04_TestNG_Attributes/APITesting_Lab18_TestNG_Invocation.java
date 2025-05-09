package com.kathiravanvp.ex04_TestNG_Attributes;

import org.testng.annotations.Test;

public class APITesting_Lab18_TestNG_Invocation {
    @Test(invocationCount = 2)
    public void test_new_register() {
        System.out.println("Method register");
    }

    @Test(invocationCount = 3)
    public void test_loginPage() {
        System.out.println("Method login");
    }

    @Test(invocationCount = 1)
    public void test_normal() {
        System.out.println("Test Method");
    }
}
