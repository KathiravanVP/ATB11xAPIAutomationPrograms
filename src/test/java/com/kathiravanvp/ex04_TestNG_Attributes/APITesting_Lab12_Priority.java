package com.kathiravanvp.ex04_TestNG_Attributes;

import org.testng.annotations.Test;

public class APITesting_Lab12_Priority {
    @Test(priority = 1)
    public void M1(){
        System.out.println(1);
    }

    @Test(priority = 3)
    public void M4(){
        System.out.println(3);
    }

    @Test(priority = 4)
    public void M2(){
        System.out.println(4);
    }

    @Test(priority = 2)
    public void M3(){
        System.out.println(2);
    }
}
