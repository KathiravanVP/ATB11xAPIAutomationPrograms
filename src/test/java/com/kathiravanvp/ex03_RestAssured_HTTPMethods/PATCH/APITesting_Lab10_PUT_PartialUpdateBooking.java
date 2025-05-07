package com.kathiravanvp.ex03_RestAssured_HTTPMethods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab10_PUT_PartialUpdateBooking {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void partialUpdateBooking(){
        String token = "06efc62a13beb66";
        String bookingId = "2376";
        String payload = "{\n" +
                "    \"firstname\" : \"Shaun\",\n" +
                "    \"lastname\" : \"Tait\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" + bookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(payload).log().all();

        response = r.when().log().all().patch();

        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
