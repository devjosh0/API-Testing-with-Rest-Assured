package RestAssuredApi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetApiRequest {
    @Test
    public static void getApi(){
         Response response = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());

        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode,200);


    }
    @Test
    public static void getApi2(){
        given().
                when().
                get("https://reqres.in/api/users?page=2").
                then().
                assertThat().
                body("data[1].'first_name'",equalTo("Lindsay"));
    }
    @Test
    public static void getApi3(){
        given().
                when().
                get("https://reqres.in/api/users?page=2").then()
                .log().all();
    }
    @Test
    public static void getApi4(){
        given().
                when().
                get("https://reqres.in/api/users?page=2").then()
                .assertThat().body("data.'first_name'",hasItems("Michael","Lindsay","Tobias"));
    }
}
