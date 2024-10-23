package LocalServerAPIs;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class postApiRequest {
    @Test
    public static void postApi(){
        JSONObject request = new JSONObject();
        request.put("firstName","James");
        request.put("lastName","Sims");
        request.put("subjectId",4);
        getApiRequest.baseURl();
        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().
                post("/users").then().
                statusCode(201).log().all();

    }
}
