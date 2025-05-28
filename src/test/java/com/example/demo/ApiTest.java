package com.example.demo;

import io.restassured.RestAssured;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class ApiTest {

    static final String API_URL = "https://jsonplaceholder.typicode.com/posts";

    @Test
    public void testFetchPosts() {
        RestAssured.get(API_URL)
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("size()", greaterThan(0));

    }


    @Test
    public void testFetchById() {
        RestAssured.get(API_URL)
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("size()", greaterThan(0))
                .body("[0].id", equalTo(1))
                .body("[0].title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
                .body("[0].userId", equalTo(1));

    }

}
