package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class BookStepDefinitions {

    private String ENDPOINT_GET_BOOK_BY_ISBN = "https://www.googleapis.com/books/v1/volumes";
    private StepData stepData;

    public BookStepDefinitions(StepData stepData) {
        this.stepData = stepData;
    }


    @Given("a book exists with an isbn of {string}")
    public void a_book_exists_with_isbn(String isbn){
        stepData.request = given().param("q", "isbn:" );
    }


    @When("a user retrieves the book by isbn")
    public void a_user_retrieves_the_book_by_isbn(){
        stepData.response = stepData.request.when().get(ENDPOINT_GET_BOOK_BY_ISBN);
        System.out.println("response: " + stepData.response.prettyPrint());
    }

    @And("response includes the following in any order")
    public void response_contains_in_any_order(Map<String,String> responseFields){
        for (Map.Entry<String, String> field : responseFields.entrySet()) {
            if(StringUtils.isNumeric(field.getValue())){
                stepData.json.body(field.getKey(), containsInAnyOrder(Integer.parseInt(field.getValue())));
            }
            else{
                stepData.json.body(field.getKey(), containsInAnyOrder(field.getValue()));
            }
        }
    }
}