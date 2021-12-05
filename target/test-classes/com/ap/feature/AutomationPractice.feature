Feature: Purchasing Dress in Automation Practice Site

@smoketest
Scenario: Home Page
Given user Launched The Application
Then user Click On The SignIn Button And It Navigates To The SignIn Page

@smoketest
Scenario: Login Page
When user Enter The Email In Email Address Field
And user Enter The Password In Password Field
Then user Click On The Signin Button And It Navigates To The Account Signedin HomePage

@women
Scenario: Women Page
When user Hover over To The Women Section
Then user Clicked Tshirts In women Tops Section And It Navigates to Tshirt Page

@women
Scenario: Tshirts Page
When user Hover Over To The QuickView And Clicked On It
And user Select The Size
And user Select The Color
And user Click On The Add To Cart Button
Then user Click On The Proceed To Checkout Button And It Navigates To The Order Page

@women
Scenario: Order Page
Then user Click On The Proceed To Checkout Button And It Navigates To The Shipping Page

@women
Scenario: Address Page
When user Click On The Proceed To Checkout Button 
And user Clicked The Terms Of Service Radio Button 
Then user Clicked The Proceed To Checkout Button And It Navigates To The Payment Page

@women
Scenario: Payment Page
When user Clicked The Pay By Check
Then user Clicked The I Confirm My Order Button And It Navigates To The Order Confirmation Page


