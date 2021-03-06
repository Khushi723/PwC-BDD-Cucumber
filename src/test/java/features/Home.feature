Feature: HomePage
  			 I want to navigate to the Home page and count the number of articles in different columns

Scenario: In order to verify the count of articles in different columns
					Given I navigate to the PwC Digital Pulse website
					When I am viewing the 'Home' page
					Then I am presented with 3 columns of articles
					And The 'left' column is displaying 2 articles
					And The 'middle' column is displaying 1 articles
					And The 'right' column is displaying 4 articles
