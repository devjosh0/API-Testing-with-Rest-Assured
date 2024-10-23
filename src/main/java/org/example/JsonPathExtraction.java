package org.example;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

public class JsonPathExtraction {
    @Test
    public static void extractElementInJson(){
        given().
                when().
                get("http://api.zippopotam.us/us/90210").then().assertThat().
                //The code below explains, places[0] is targeting the first object in the json, .'place name' is extracting the key place name
                        // to assess the value Beverly Hills.
                body("places[0].'place name'",equalTo("Beverly Hills"));
    }

    @Test
    public static void extractElementInJson1(){
        given().
                when().
                get("http://api.zippopotam.us/us/90210").then().assertThat().
                //The code below explains, places is targeting the all objects in the json, .'place name' is extracting the key place name
                // to assess the value Beverly Hills.
                body("places.'place name'",hasItem("Beverly Hills")).
                log().body();
    }
}
