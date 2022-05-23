package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;

import static org.hamcrest.Matchers.equalTo;

public class SecondStepDefinitions {

    private StepData stepData;

    public SecondStepDefinitions(StepData stepData) {
        this.stepData = stepData;
    }

    @Then("the status code is {int}")
    public void verify_status_code(int statusCode){
        stepData.json = stepData.response.then().statusCode(statusCode);
    }

    @And("response includes the following")
    public void response_equals(Map<String,String> responseFields){
        for (Map.Entry<String, String> field : responseFields.entrySet()) {
            if(StringUtils.isNumeric(field.getValue())){
                stepData.json.body(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
            }
            else{
                stepData.json.body(field.getKey(), equalTo(field.getValue()));
            }
        }
    }
}