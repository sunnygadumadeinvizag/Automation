Feature: validate user API

Scenario: valid status code of user Api
Given get user status
When The user calls the "getuserAPI" with the "GET" request
Then status" in respose body is 200


Scenario: validate header contentType code of user Api
Given get user status
When The user calls the "getuserAPI" with the "GET" request
Then header content type is json


Scenario: validate the size of the response
Given get user status
When The user calls the "getuserAPI" with the "GET" request
Then the size of response is 10

