package com.kathiravanvp.ex03_RestAssured_HTTPMethods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab09_PUT_UpdateBooking {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void updateBooking(){
        String token = "90adcecff4dc4d3";
        String bookingId = "4558";
        String payload = "{\n" +
                "    \"firstname\" : \"Akash\",\n" +
                "    \"lastname\" : \"Kevin\",\n" +
                "    \"totalprice\" : 1000,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2025-02-01\",\n" +
                "        \"checkout\" : \"2025-03-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Lunch\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();

        response = r.when().log().all().put();

        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
