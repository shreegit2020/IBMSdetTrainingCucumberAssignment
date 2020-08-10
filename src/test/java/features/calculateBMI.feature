Feature: BMI Calculation
	Calculating the BMI of 5 users

@RegressionTest	
	Scenario: Calculate BMI for multiple persons
		Given Calculator net page is open
		When user click on BMICalculator link
		Then BMICalculator page opened successfully
		When we enter value as DataTable and calculate BMI
		| 10  | 127    | 40     |
		| 30  | 156    | 70     |
		| 25  | 152    | 55     |
		| 20  | 160    | 45     |
		| 35  | 160    | 70     |
		
		Then close browser
	
