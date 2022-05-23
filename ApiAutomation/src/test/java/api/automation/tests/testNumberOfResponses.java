package api.automation.tests;

import io.restassured.RestAssured;
import org.testng.annotations.*;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

public class testNumberOfResponses {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testSizeOfPosts() {
        given().
                when().get("/posts").
                then().assertThat().statusCode(200).
                body("id[0]", equalTo(1)).
                body("size()", is(100));
    }

    @Test
    public void testSizeOfComments() {
        given().
                when().get("/comments").
                then().assertThat().statusCode(200).
                body("id[0]", equalTo(1)).
                body("size()", is(500));
    }

    @Test
    public void testSizeOfAlbums() {
        given().
                when().get("/albums").
                then().assertThat().statusCode(200).
                body("id[0]", equalTo(1)).
                body("size()", is(100));
    }

    @Test
    public void testSizeOfPhotos() {
        given().
                when().get("/photos").
                then().assertThat().statusCode(200).
                body("id[0]", equalTo(1)).
                body("size()", is(5000));
    }

    @Test
    public void testSizeOfTodos() {
        given().
                when().get("/todos").
                then().assertThat().statusCode(200).
                body("id[0]", equalTo(1)).
                body("size()", is(200));
    }

    @Test
    public void testSizeOfUsers() {
        given().
                when().get("/users").
                then().assertThat().statusCode(200).
                body("id[0]", equalTo(1)).
                body("size()", is(10));
    }


}
