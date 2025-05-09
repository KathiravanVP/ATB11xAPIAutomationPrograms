package com.kathiravanvp.ex05_Test_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting_Lab21_TestNG_Assertions {
    @Test
    public void HardAssert(){
        System.out.println("Start of Program");
        Assert.assertEquals("kathir","Kathir");
        System.out.println("End of Program");
    }

    @Test
    public void SoftAssert(){
        System.out.println("Start of Program");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("kathir","Kathir");
        System.out.println("End of Program");
        softAssert.assertAll();
    }
}
