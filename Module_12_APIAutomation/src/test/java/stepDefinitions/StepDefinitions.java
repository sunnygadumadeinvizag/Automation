package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResource;
import resources.Utlis;




public class StepDefinitions extends Utlis {

	private  RequestSpecification resquestSpec;
	private  ResponseSpecification resposeSpec;
	private Response response;
	
	@Given("^get user status$")
	public  void get_user_status() throws Exception {
		resquestSpec= given().spec(requestSpecification()).relaxedHTTPSValidation();
      
	}

	@When("^The user calls the \"([^\"]*)\" with the \"([^\"]*)\" request$")
	public void the_user_calls_the_something_with_the_something_request(String resource, String methodName) {
		
		APIResource apiresources=APIResource.valueOf(resource);
		
		if(methodName.equalsIgnoreCase("POST")){
			resposeSpec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
			response=resquestSpec.when().post(apiresources.getResource()).then().spec(resposeSpec).extract().response();
		}
		if(methodName.equalsIgnoreCase("GET")){
			resposeSpec=	new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
			response=resquestSpec.when().get(apiresources.getResource());
		}
		
		

	}

	@Then("^status\" in respose body is (\\d+)$")
	public void status_in_respose_body_is(int statusCode) {
		System.out.println("The response of body is " + response.getStatusCode());
		assertEquals(response.getStatusCode(),200);
	}

	
	
	@Then("^header content type is json$")
	public void header_content_type_is_json()  {
	   response.then().assertThat().contentType(ContentType.JSON);
	}
	
	
	
	@Then("^the size of response is (\\d+)$")
	public void the_size_of_response_is(int expectedCount) {

		String responseAsString=response.asString();
		JsonPath js=new JsonPath(responseAsString);
		int actualCount=js.getInt("size()");
		System.out.println("The count of an array is " + actualCount);
		assertEquals(actualCount, expectedCount);
		
	}
	
}
