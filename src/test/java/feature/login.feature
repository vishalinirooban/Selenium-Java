Feature: Login to Leaftaps application and create lead 

Scenario: TC001 Positive flow for login 
	Given Launch the browser 
	And Maximise the browser 
	And Load the url 
	And Enter the username as demosalesmanager 
	And Enter the password as crmsfa 
	When Click on the login buttn 
	Then verify login is sucessfull 
	And Click on the CRM/SFA link 
	Then verify it navigates to nextpage 
	When click on Lead button 
	Then click on create Lead 
	And Enter the companyname 
	And Enter the firstname 
	And Enter the Lastname 
	And click on create Lead submit button
	Then Verify lead is created successfully