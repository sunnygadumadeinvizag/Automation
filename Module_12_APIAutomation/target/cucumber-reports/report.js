$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("UserLibrary.feature");
formatter.feature({
  "line": 1,
  "name": "validate user API",
  "description": "",
  "id": "validate-user-api",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "valid status code of user Api",
  "description": "",
  "id": "validate-user-api;valid-status-code-of-user-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "get user status",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "The user calls the \"getuserAPI\" with the \"GET\" request",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "status\" in respose body is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.get_user_status()"
});
formatter.result({
  "duration": 891416800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "getuserAPI",
      "offset": 20
    },
    {
      "val": "GET",
      "offset": 42
    }
  ],
  "location": "StepDefinitions.the_user_calls_the_something_with_the_something_request(String,String)"
});
formatter.result({
  "duration": 839496000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 27
    }
  ],
  "location": "StepDefinitions.status_in_respose_body_is(int)"
});
formatter.result({
  "duration": 1489500,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "validate header contentType code of user Api",
  "description": "",
  "id": "validate-user-api;validate-header-contenttype-code-of-user-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "get user status",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "The user calls the \"getuserAPI\" with the \"GET\" request",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "header content type is json",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.get_user_status()"
});
formatter.result({
  "duration": 2411300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "getuserAPI",
      "offset": 20
    },
    {
      "val": "GET",
      "offset": 42
    }
  ],
  "location": "StepDefinitions.the_user_calls_the_something_with_the_something_request(String,String)"
});
formatter.result({
  "duration": 306690600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.header_content_type_is_json()"
});
formatter.result({
  "duration": 5132400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "validate the size of the response",
  "description": "",
  "id": "validate-user-api;validate-the-size-of-the-response",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "get user status",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "The user calls the \"getuserAPI\" with the \"GET\" request",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "the size of response is 10",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.get_user_status()"
});
formatter.result({
  "duration": 2421500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "getuserAPI",
      "offset": 20
    },
    {
      "val": "GET",
      "offset": 42
    }
  ],
  "location": "StepDefinitions.the_user_calls_the_something_with_the_something_request(String,String)"
});
formatter.result({
  "duration": 281596200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 24
    }
  ],
  "location": "StepDefinitions.the_size_of_response_is(int)"
});
formatter.result({
  "duration": 423399900,
  "status": "passed"
});
});