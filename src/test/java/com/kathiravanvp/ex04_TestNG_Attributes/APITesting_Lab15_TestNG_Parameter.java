package com.kathiravanvp.ex04_TestNG_Attributes;

import com.beust.jcommander.Parameter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting_Lab15_TestNG_Parameter {

    @Test
    @Parameters({"browser"})
    public void param1(String browser){
        System.out.println("Parameter Class");
        System.out.println("Starting "+browser+" browser");
    }
}
