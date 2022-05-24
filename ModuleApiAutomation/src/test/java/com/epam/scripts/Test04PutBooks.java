package com.epam.scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.apache.http.HttpStatus;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlib.PropertyReaderWriter;
import com.commonlib.TestBase;
import com.epam.pojo.ISBN;
import com.epam.pojo.ListOfBooks;
import com.google.gson.JsonObject;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Test04PutBooks extends TestBase {
	public String token;
@Test(priority=1)
	public void authorization() throws IOException {
		Response response = given().header("Content-Type", "application/json")
				.body("{ \"userName\":\"" + userName + "\", \"password\":\"" + password + "\"}")
				.post("/Account/v1/GenerateToken").then().log().all().extract().response();
		
		Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);

		if (response.getStatusCode() == HttpStatus.SC_OK) {

			String jsonString = response.asString();
			Assert.assertTrue(jsonString.contains("token"));

			 token = JsonPath.from(jsonString).get("token");
			 System.out.println(token);
		}
}
	@Test(priority=2)
	public void updateBooksToUser() throws SerializeException, Throwable {

		String newIsbn = "9781449331818";
		String isbn = PropertyReaderWriter.getProperty("bookId");
		//String token = PropertyReaderWriter.getProperty("token");
		
		String jsonBody = "{\r\n"
				+ "  \"userId\": \"49eb1eca-132f-4a2c-93a4-952527d4b54c\",\r\n"
				+ "  \"isbn\": \"9781449331818\"\r\n"
				+ "}";
				


		Response res = given().header("Authorization", "Bearer " + token).header("Content-Type", "application/json")
				.body(jsonBody).put("/BookStore/v1/Books/"+isbn).then().log().all().extract().response();
		Assert.assertEquals(res.getStatusCode(), 200);

}
}
