package com.kathiravanvp.ex03_RestAssured_HTTPMethods.GET;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab06_GET_GetBooking {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void getBooking(){
        String bookingId = "948";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingId);

        response = r.when().log().all().get();
        System.out.println(response.asString());

        vr = response.then().log().all();
        vr.statusCode(200);


    }
}
