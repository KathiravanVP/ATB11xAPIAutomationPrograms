package com.kathiravanvp.ex03_RestAssured_HTTPMethods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab08_GET_PingHealthCheck {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void pingHealthCheck(){
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/ping");

        response = r.log().all().get();

        vr = response.then().log().all();
        vr.statusCode(201);
    }
}
