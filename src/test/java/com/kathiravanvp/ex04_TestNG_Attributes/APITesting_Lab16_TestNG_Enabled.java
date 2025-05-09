package com.kathiravanvp.ex04_TestNG_Attributes;

import org.testng.annotations.Test;

public class APITesting_Lab16_TestNG_Enabled {
    @Test(enabled = true)
    public void M1(){
        System.out.println("Method 1");
    }

    @Test(enabled = false)
    public void M2(){
        System.out.println("Method 2");
    }

    @Test
    public void M3(){
        System.out.println("Method 3");
    }
}
