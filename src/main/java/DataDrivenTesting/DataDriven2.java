package DataDrivenTesting;

import LocalServerAPIs.DataSets;
import LocalServerAPIs.Utils.ExcelUtils;
import LocalServerAPIs.getApiRequest;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static LocalServerAPIs.getApiRequest.baseURl;
import static io.restassured.RestAssured.given;

public class DataDriven2 {

    @Test(dataProvider = "DataSetsForPost")
    public static void postApi(String firstName, String lastName,int subjectId){
        JSONObject request = new JSONObject();
        request.put("firstName",firstName);
        request.put("lastName",lastName);
        request.put("subjectId",subjectId);
        baseURl();
        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                post("/users").then().statusCode(201).log().all();
}
@Test(dataProvider = "DataSetsForDelete")
    public static void deleteData(int usersId){
      given().
              when().
              delete("/users"+usersId);
}
}
