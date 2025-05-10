package com.kathiravanvp.ex05_Test_Assertions;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class APITesting_Lab22_TestNG_AssertJ_Assertions {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Description("TC1 - Verifying Booking is created successfully")
    @Test
    public void createBooking_POST() {
        String payload = "{\n" +
                "    \"firstname\" : \"Manish\",\n" +
                "    \"lastname\" : \"Pandey\",\n" +
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

        Integer bookingId = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        Assert.assertEquals(firstname,"Manish");
        Assert.assertEquals(lastname,"Pandey");
        Assert.assertNotNull(bookingId);

        assertThat(bookingId).isNotZero().isNotNull().isNotNegative();
        assertThat(firstname).isEqualTo("Manish").isNotBlank();
    }
}