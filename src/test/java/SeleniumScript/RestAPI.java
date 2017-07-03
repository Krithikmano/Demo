package SeleniumScript;

import java.net.URI;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;


public class RestAPI {
	@Test
public static Response Post(String By, String uri){
	
  RequestSpecification Rs=given().body(By).contentType(ContentType.JSON);
  Response Response = Rs.post(uri);
  return Response;
		  }
	}
