package com.kathiravanvp.ex04_TestNG_Attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab17_TestNG_Always_run {
    @Test
    public void test_new_register() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test_loginPage() {
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = false)
    public void test_normal() {
        Assert.assertTrue(true);
    }
}
