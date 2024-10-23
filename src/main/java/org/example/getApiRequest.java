package org.example;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class getApiRequest {
    // Asserts
@Test
    public static void checkPlaceNameInResponseBody(){
       given().
                when().
                get("http://api.zippopotam.us/us/90210").
                then().
                assertThat().
                body("places[0].'place name'",equalTo("Beverly Hills"));

    }
    @Test
    public static void checkStatusCode(){
    given().
            when().
            get("http://api.zippopotam.us/us/90210").
            then().
            statusCode(200);
    }
    @Test
    public static void checkContentType(){
    given().
            when().
            get("http://api.zippopotam.us/us/90210").
            then().
            contentType(ContentType.JSON);
    }
    @Test
    public static void seeAllLogs(){
    given().
            log().all().
            when().
            get("http://api.zippopotam.us/us/90210").
            then().
            log().body();
    }
}
