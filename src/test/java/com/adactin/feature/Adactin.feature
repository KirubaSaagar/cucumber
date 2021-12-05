Feature: Hotel booking in Adactin Application

@smoketest
Scenario Outline: Login Page
Given user Launched The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page

Examples:
		|Username|Password|
		|simbu|str|
		|rohit|hitman|
		|pant|spidey|
		|MasterBruceWayne|whitesr07|


@sanitytest
Scenario: Search Hotel
When user Select The "New York" Hotel Location
And user Select The "Hotel Sunshine" Hotel
And user Select The "Deluxe" Hotel Room Type
And user Select The Number Of Rooms
And user Select The Check In Date
And user Select The Check Out Date
And user Select The Adults Per Room
And user Select The Children Per Room
Then user Click On The Search Button And It Navigates To The Select Hotel Page

@sanitytest
Scenario: Select Hotel
When user Select The Select Radio Button
Then user Click On The Continue Button And It Navigates To The Book Hotel Page

@unittest
Scenario: Book Hotel
When user Enter The Firstname In FirstName Field
And user Enter The Lastname In LastName Field
And user Enter The Address In Billing Address Field
And user Enter The Credit Card Number In Credit Card Number Field
And user Select The Credit Card Type 
And user Select The Month In Expiry Date
And user Select The Year In Expiry Date
And user Enter The CVV Number
Then user Click On The BookNow Button And It Navigates To The Booking Confirmation Page

@regressiontest
Scenario: Booking Confirmation Page
Then the User Click On LogoutButton And It Navigates To The Logout Successfull Page