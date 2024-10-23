package RestAssuredApi;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteApiRequest {
    @Test
    public static void deleteApi(){
        given().
                when().
                delete("https://reqres.in/api/users/2").
                then().statusCode(204);
    }
}
