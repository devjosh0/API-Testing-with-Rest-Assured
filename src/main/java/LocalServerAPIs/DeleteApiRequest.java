package LocalServerAPIs;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteApiRequest {
    @Test
    public static void deleteApi(){
        getApiRequest.baseURl();

        given().
                when().
                delete("/users/1").
                then().statusCode(200);
    }
}
