package com.epam.scripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.apache.http.HttpStatus;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlib.PropertyReaderWriter;
import com.commonlib.TestBase;
import com.epam.pojo.DeleteBook;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Test05DeleteAddedBooks extends TestBase {
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
	public void deleteBooksAdded() throws SerializeException {
		String isbn = "9781449331818";
	 //String isbn="9781593275846";
		//String token = PropertyReaderWriter.getProperty("token");
System.out.println("---------------------------------------------------");
		DeleteBook deleteBookJson = new DeleteBook(isbn, userID);

		JsonSerializer jsonSer = JsonSerializer.DEFAULT;
		String jsonBody = jsonSer.serialize(deleteBookJson);

		System.out.println(jsonBody);

		Response response = given().header("Authorization", "Bearer " + token)
				.header("Content-Type", "application/json").body(jsonBody).delete("/BookStore/v1/Book").then().log()
				.all().extract().response();

		Assert.assertEquals(response.getStatusCode(), 204);

//		/"{ \"isbn\": \"" + bookId + "\", \"userId\": \"" + userID + "\"}"
	}

}
