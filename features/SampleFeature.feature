Feature: A sample feature
	In order to xxxx
	As a xxx
	I can do xxx
	
	Scenario: Sample scenario
		Given I have an empty accumulator
		When I enter a number 15
		Then The accumulation is 15
		
	Scenario: Accumulate more numbers
		Given I have an empty accumulator
		When I enter a number 15
			And I enter a number 30
			And I enter a number 33
		Then The accumulation is 78