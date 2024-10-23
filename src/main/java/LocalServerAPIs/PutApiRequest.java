package LocalServerAPIs;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutApiRequest {
    @Test
    public static void putApi(){
        JSONObject request = new JSONObject();
        request.put("firstName","Matt");
        request.put("lastName","Scott");
        request.put("subjectId",5);
        getApiRequest.baseURl();
        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                put("/users/1").then().
                statusCode(200).log().all();
    }
}
