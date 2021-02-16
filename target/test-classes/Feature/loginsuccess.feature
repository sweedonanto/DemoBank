Feature: Test login functionality


  Scenario Outline: Check login  credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigate to the home page
    
        
    Examples:
    |username|password|
    |mngr308726|Yduzypy|
   |mngr308726|Yduz|
   
   
