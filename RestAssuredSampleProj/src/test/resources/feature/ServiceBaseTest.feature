@DemoTest
Feature: To test Restful service is up and running

  Background: User is Logged In
  Given This is background code
  
  @abc
  Scenario: Validate that Restful service is up and running and returns required details for given parameter
    Given Run the RestFul service by providing valid Endpoint
    When Validate the service ran successfully and status code is accepted
    Then Validate the service returned required details for given parameter

  @xyz
  Scenario: Create multiple new accounts in Facebook
    Given I open Facebook URL and create new accounts with below data
      | First Name | Last Name | Phone No   | Password | DOB Day | DOB Month | DOB Year | Gender |
      | Abc FN     | Abc LN    | 0123123123 | Pass1234 |      01 | Jan       |     1990 | Male   |

 @pqr
  Scenario: Create multiple new accounts in Facebook
    Given I open Facebook URL and create new accounts with below datas
      | First Name  | abc |
      | Last Name   | xyz |
      | Middle Name | zk  |
