package com.kathiravanvp.ex04_TestNG_Attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Lab14_DependsOnMethod {
    @Test
    public void startEngine(){
        System.out.println("Engine is started");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"startEngine"})
    public void releaseClutch(){
        System.out.println("Clutch is released");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = {"releaseClutch"})
    public void moveVehicle(){
        System.out.println("Vehicle is moved");
        Assert.assertTrue(true);
    }
}
