Feature: Test Egg Timer Countdown Application

@TestScenario 
Scenario: Test the Countdown for the Go Timer application 

	Given I launch the desired URL
	When I add desired time as '25 Seconds' in the timer textbox
	And click on the GoTimer button 
	Then the count down page should get displayed
	And the time should get reduced by 1 second every time 
