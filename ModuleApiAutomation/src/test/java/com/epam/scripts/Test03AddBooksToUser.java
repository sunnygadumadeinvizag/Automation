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
import com.epam.pojo.ISBN;
import com.epam.pojo.ListOfBooks;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Test03AddBooksToUser extends TestBase {
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

		//	PropertyReaderWriter.addIntoProperties("token", token);
		}
	}
	@Test(priority=2)
	
	
	public void addBooksToUser() throws SerializeException {

		String isbn = PropertyReaderWriter.getProperty("bookId");
		//String token = PropertyReaderWriter.getProperty();

		ISBN[] isbn1 = { new ISBN(isbn) };
		ListOfBooks list = new ListOfBooks(userID, isbn1);

		JsonSerializer jsonSer = JsonSerializer.DEFAULT;
		String jsonBody = jsonSer.serialize(list);

		System.out.println(jsonBody);

		Response res = given().header("Authorization", "Bearer " + token).header("Content-Type", "application/json")
				.body(jsonBody).post("/BookStore/v1/Books").then().log().all().extract().response();
		Assert.assertEquals(HttpStatus.SC_CREATED, res.getStatusCode());


	}
}
