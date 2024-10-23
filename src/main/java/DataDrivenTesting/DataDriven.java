package DataDrivenTesting;

import LocalServerAPIs.DataSets;
import LocalServerAPIs.getApiRequest;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class DataDriven extends DataSets {



    @Test(dataProvider = "DataForPost")
    public static void postApi(String firstName, String lastName,int subjectId){
        JSONObject request = new JSONObject();
        request.put("firstName",firstName);
        request.put("lastName",lastName);
        request.put("subjectId",subjectId);
        getApiRequest.baseURl();
        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                post("/users").then().statusCode(201).log().all();
    }
}
