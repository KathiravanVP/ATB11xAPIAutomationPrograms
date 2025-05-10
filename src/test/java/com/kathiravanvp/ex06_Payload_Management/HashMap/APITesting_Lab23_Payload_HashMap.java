package com.kathiravanvp.ex06_Payload_Management.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class APITesting_Lab23_Payload_HashMap {
    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test
    public void createBooking(){
        Map<String,Object> jsonBody = new LinkedHashMap<>();
        jsonBody.put("firstname","KL");
        jsonBody.put("lastname","Rahul");
        jsonBody.put("totalprice",10000);
        jsonBody.put("depositpaid",true);

        Map<String,Object> bookingDatesMap = new LinkedHashMap<>();
        bookingDatesMap.put("checkin","2025-01-01");
        bookingDatesMap.put("checkout","2025-02-01");

        jsonBody.put("bookingdates",bookingDatesMap);
        jsonBody.put("additionalneeds","Lunch");

        System.out.println(jsonBody);

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonBody).log().all();

        response = requestSpecification.when().log().all().post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
    }
}
