package com.epam.scripts;

import com.epam.pojo.Root;
import com.epam.pojo.User;
import com.epam.pojo.UserResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class POJOTests {

    @BeforeClass
    public void setUp(){
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api";

        RestAssured.requestSpecification = new RequestSpecBuilder().
                setContentType("application/json").build();
        RestAssured.responseSpecification = new ResponseSpecBuilder().
                expectContentType("application/json").build();
    }

    @Test
    public void verifyGetRequest() throws IOException {
        ObjectMapper om = new ObjectMapper();

        Root root = om.readValue(new File(System.getProperty("user.dir") + ".\\src\\test\\resources\\Payloads\\Users.json"), Root.class);
        Response response = get("/users/2").
                then().statusCode(200).spec(responseSpecification).
                body("data.first_name",equalTo("Janet")).
                body("data.last_name",equalTo("Weaver")).
                body("data.email",equalTo("janet.weaver@reqres.in")).
                extract().
                response();

        String text = response.path("support.text").toString();
        System.out.println(response);

    }


    @Test
    public void verifyGetListUsers() throws IOException {
        ObjectMapper om = new ObjectMapper();

        Root payLoadroot = om.readValue(new File(System.getProperty("user.dir") + ".\\src\\test\\resources\\Payloads\\Users.json"), Root.class);
        Response response = given().queryParam("page","2").
                get("/users").
                then().statusCode(200).spec(responseSpecification).extract().response();
        System.out.println(response.asString());
        Root responseroot =om.readValue(response.asString(),Root.class);
        String pageNumber = response.path("page").toString();
        System.out.println(pageNumber);
        String data = response.path("data").toString();
        System.out.println(data);
        Assert.assertEquals(payLoadroot.getPage(),responseroot.getPage());
        Assert.assertEquals(payLoadroot.getSupport().getText(),responseroot.getSupport().getText());
    }


    @Test
    public void verifyPostRequest() throws IOException {
        ObjectMapper om = new ObjectMapper();

        User user = om.readValue(new File(System.getProperty("user.dir") + ".\\src\\test\\resources\\Payloads\\User.json"), User.class);
        Response response = given().body(user)
                .when().post("/users")
                .then().statusCode(201)
                .spec(responseSpecification).extract().response();
        System.out.println(response.asString());
        String id = response.path("id");
        System.out.println("Created User id is: "+id);
        String createdDate = response.path("createdAt");
        System.out.println("User Created date is: "+createdDate);
        UserResponse responseuser =om.readValue(response.asString(),UserResponse.class);
        Assert.assertEquals(user.getName(),responseuser.getName());
    }


    @Test
    public void verifyPutRequest(){
        Response response = given().body("{\"name\":\"morpheus\",\"job\":\"zion resident\"}").
                when().put("/users/2")
                .then().statusCode(200)
                .spec(responseSpecification).extract().response();

        String job = response.path("job");
        System.out.println("Created User id is: "+job);
        String updatedDate = response.path("updatedAt");
        System.out.println("User Updated date is: "+updatedDate);
    }

    @Test
    public void verifyUserRegister(){
        Response response = given().body("{\"email\":\"eve.holt@reqres.in\",\"password\":\"pistol\"}")
                .when().post("/register")
                .then().statusCode(200).spec(responseSpecification)
                .extract().response();
        String id = response.path("id").toString();
        System.out.println("Generated Id is:"+id);
        String token = response.path("token");
        System.out.println("Generated Id is:"+token);
    }
    @Test
    public void verifyUserLogin() {
        Response response = given().body("{\"email\":\"eve.holt@reqres.in\",\"password\":\"cityslicka\"}")
                .when().post("/login")
                .then().statusCode(200).spec(responseSpecification)
                .extract().response();

        String token = response.path("token");
        System.out.println("Generated Id is:"+token);

    }


    @Test
    public void verifyUserRegisterUnSuccessful(){
        given().body("{\"email\":\"sydney@fife\"}")
                .when().post("/register")
                .then().statusCode(400).spec(responseSpecification)
                .body("error",equalTo("Missing password"));

    }

    @Test
    public void verifyUserLoginUnSuccessful(){
        given().body("{\"email\":\"peter@klaven\"}")
                .when().post("/login")
                .then().statusCode(400).spec(responseSpecification)
                .body("error",equalTo("Missing password"));

    }

    @Test
    public void verifyDelayedResponse(){
        given().queryParam("delay","3")
                .when().get("/user")
                .then().statusCode(200).spec(responseSpecification);
    }

}
