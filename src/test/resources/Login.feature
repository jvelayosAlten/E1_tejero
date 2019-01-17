Feature: LoginFeature
  This feature deals with the login functionality of the application

  Scenario Outline: Login with correct user and password
    Given I call servicioWebReporting with <user> and <password>

    Then The serverStatus return <statusCode>

    Examples:
    | user      | password  | statusCode |
    | tum       | Alten2018 | 200        |
    | tum       | xxxxxxxx  | 401        |
    | xxxxxxxx  | xxxxxxxx  | 401        |
