package com.kathiravanvp.ex03_RestAssured_HTTPMethods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab05_POST_CreateToken {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void createToken(){
        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        response = r.when().log().all().post();

        vr = response.then().log().all();
        vr.statusCode(200);
    }
}
