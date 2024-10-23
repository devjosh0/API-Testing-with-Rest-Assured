package LocalServerAPIs;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PatchApiRequest {
    @Test
    public static void patchApi(){
        JSONObject request = new JSONObject();
        request.put("firstName","Paul");
        getApiRequest.baseURl();
        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                patch("/users/1").then().
                statusCode(200).log().all();
    }
}
