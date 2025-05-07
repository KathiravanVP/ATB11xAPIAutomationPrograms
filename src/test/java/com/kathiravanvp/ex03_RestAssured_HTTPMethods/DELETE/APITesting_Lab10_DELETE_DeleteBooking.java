package com.kathiravanvp.ex03_RestAssured_HTTPMethods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab10_DELETE_DeleteBooking {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void deleteBooking(){
        String token = "98da98675c88c74";
        String bookingId = "948";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);

        response = r.when().log().all().delete();

        vr = response.then().log().all();
        vr.statusCode(201);
    }
}
