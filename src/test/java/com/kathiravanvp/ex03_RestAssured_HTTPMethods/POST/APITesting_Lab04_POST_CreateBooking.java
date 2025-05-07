package com.kathiravanvp.ex03_RestAssured_HTTPMethods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab04_POST_CreateBooking {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void createBooking(){
        String payload = "{\n" +
                "    \"firstname\" : \"Monish\",\n" +
                "    \"lastname\" : \"Sam\",\n" +
                "    \"totalprice\" : 1500,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2025-01-01\",\n" +
                "        \"checkout\" : \"2025-02-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        response = r.when().log().all().post();

        vr = response.then().log().all();
        vr.statusCode(200);

    }
}
