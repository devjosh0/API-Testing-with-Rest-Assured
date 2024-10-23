package LocalServerAPIs;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class getApiRequest {
    public static void baseURl() {
        baseURI = "http://localhost:3000/";
    }

    @Test
    public static void getApi(){
        baseURl();

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                when().
                get("/users").
                then().statusCode(200).log().all();
    }


    //Using Parameters
    @Test
    public static void getApi2(){
        baseURl();

        given().
                param("name","Automation").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                when().
                get("/subjects").
                then().statusCode(200).log().all();
    }
}
