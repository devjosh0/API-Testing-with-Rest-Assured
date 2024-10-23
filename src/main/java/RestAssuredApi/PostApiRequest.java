package RestAssuredApi;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PostApiRequest {
    @Test
    public static void postApi1(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","Hussein");
        map.put("job","Tester");
        JSONObject request = new JSONObject(map);

        given().
                body(request.toJSONString()).
        when().
                post("https://reqres.in/api/users").

                then().statusCode(201);
    }
    @Test
    public static void posApi2(){
        JSONObject request1 = new JSONObject();
        request1.put("name","Vicient");
        request1.put("job","Mechanic");
        given().
                body(request1.toJSONString()).
                when().
                post("https://reqres.in/api/users").then().
                statusCode(201);

    }
}
