Feature: Validate SpaceX Lanches Latest API

@TestAPIScenario
Scenario: Validate the Response Code for SpaceX Launches Latest API

Given BaseURI to the User
When Submits a "Get" request 
Then the Reponse Status Code should get displayed as "200"