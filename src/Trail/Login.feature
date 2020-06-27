Feature: Login Feature 
This features will include the following scenarios 
1. negative login
2. empty user
3. empty password
4. valid credentials 

Scenario: Negative login
Given i should able to login to magento home page 
And i should able to slect the user login
When i update the user name to be "<email>"
And i update the password to be "<pwd>"
Then i should able to get the error message as "Invalid login or password."

Examples:
|email|pwd|
|lathasindhu@gmail.com|welcome|
|sunstarom@gmail.com|welc|

Scenario: empty user
Given i should able to login to magento home page 
And i should able to slect the user login
When i update the user name to be ""
And i update the password to be "welcome"
Then i should able to get the error message as "Invalid login or password."


