# PwC-BDD-Cucumber

# Tools
	Eclipse IDE for Java Developers Version: 2022-06 (4.24.0)
	JRE (JavaSE-1.8)
	Maven 1.7
	Cucumber
	
# Dependencies 
	Commons-lang3
	Cucumber-java
	Cucumber-core
	cucumber-picocontainer
	cucumber-junit
	selenium-java
	webdrivermanager
	
# Architecture 
The project is a "BDD Cucumber Maven" project. The framework design is based on the Page Object Model where each page has a different class that contains the methods specific to that class. 
Also each page has a separate Feature and Step definition files containing the feature and steps details.
The project is designed in a modular approach where each action is performed in a separate module. The methods are generalized to avoid code redundancy and to enhance reusability.
Data Driven Development is used to separate the data from the code. No hard coding is done
	
# Steps for running Tests 

The scenarios can be executed through RunnerClass file present under the myrunner package by Junit runner.
 
# Recaptcha
FYI -Google Recaptcha is implemented to enforce security which protects the sites from spam. It detects the presence of a bot or any malicious software. Google Recaptcha cannot be automated. It can be bypassed in the test environment for testing purpose. Although I have put my efforts to automate it, but it cannot be.
