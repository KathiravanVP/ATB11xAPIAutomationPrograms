package com.kathiravanvp.ex02_RA_TestNG;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab03_TestNG_TestCase {
    String pincode = "600089";

    @Test
    public void test_Positive_TC1(){
        pincode = "600002";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us/")
                    .basePath("/IN/" +pincode)
                .when()
                    .get()
                .then()
                .log().all().statusCode(200);
    }

    @Test
    public void test_Negative_TC1(){
        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

    @Test
    public void test_Negative_TC2(){
        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/" +pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
