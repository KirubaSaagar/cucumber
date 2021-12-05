$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/ap/feature/AutomationPractice.feature");
formatter.feature({
  "line": 1,
  "name": "Purchasing Dress in Automation Practice Site",
  "description": "",
  "id": "purchasing-dress-in-automation-practice-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Home Page",
  "description": "",
  "id": "purchasing-dress-in-automation-practice-site;home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launched The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Click On The SignIn Button And It Navigates To The SignIn Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApStep_Definition.user_Launched_The_Application()"
});
formatter.result({
  "duration": 9445740600,
  "status": "passed"
});
formatter.match({
  "location": "ApStep_Definition.user_Click_On_The_SignIn_Button_And_It_Navigates_To_The_SignIn_Page()"
});
formatter.result({
  "duration": 3928130000,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Login Page",
  "description": "",
  "id": "purchasing-dress-in-automation-practice-site;login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user Enter The Email In Email Address Field",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Enter The Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Click On The Signin Button And It Navigates To The Account Signedin HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "ApStep_Definition.user_Enter_The_Email_In_Email_Address_Field()"
});
formatter.result({
  "duration": 1013461600,
  "status": "passed"
});
formatter.match({
  "location": "ApStep_Definition.user_Enter_The_Password_In_Password_Field()"
});
formatter.result({
  "duration": 175010900,
  "status": "passed"
});
formatter.match({
  "location": "ApStep_Definition.user_Click_On_The_Signin_Button_And_It_Navigates_To_The_Account_Signedin_HomePage()"
});
formatter.result({
  "duration": 3318528700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Women Page",
  "description": "",
  "id": "purchasing-dress-in-automation-practice-site;women-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@women"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user Hover over To The Women Section",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user Clicked Tshirts In women Tops Section And It Navigates to Tshirt Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApStep_Definition.user_Hover_over_To_The_Women_Section()"
});
formatter.result({
  "duration": 214912600,
  "status": "passed"
});
formatter.match({
  "location": "ApStep_Definition.user_Clicked_Tshirts_In_women_Tops_Section_And_It_Navigates_to_Tshirt_Page()"
});
formatter.result({
  "duration": 4019886500,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Tshirts Page",
  "description": "",
  "id": "purchasing-dress-in-automation-practice-site;tshirts-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@women"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user Hover Over To The QuickView And Clicked On It",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user Select The Size",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The Color",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Click On The Add To Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click On The Proceed To Checkout Button And It Navigates To The Order Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApStep_Definition.user_Hover_Over_To_The_QuickView_And_Clicked_On_It()"
});
formatter.result({
  "duration": 5312598200,
  "status": "passed"
});
formatter.match({
  "location": "ApStep_Definition.user_Select_The_Size()"
});
formatter.result({
  "duration": 198453700,
  "status": "passed"
});
formatter.match({
  "location": "ApStep_Definition.user_Select_The_Color()"
});
formatter.result({
  "duration": 135142300,
  "status": "passed"
});
formatter.match({
  "location": "ApStep_Definition.user_Click_On_The_Add_To_Cart_Button()"
});
formatter.result({
  "duration": 110048900,
  "status": "passed"
});
formatter.match({
  "location": "ApStep_Definition.user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigates_To_The_Order_Page()"
});
formatter.result({
  "duration": 10449162000,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Order Page",
  "description": "",
  "id": "purchasing-dress-in-automation-practice-site;order-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@women"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Click On The Proceed To Checkout Button And It Navigates To The Shipping Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApStep_Definition.user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigates_To_The_Shipping_Page()"
});
formatter.result({
  "duration": 4177137900,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Address Page",
  "description": "",
  "id": "purchasing-dress-in-automation-practice-site;address-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@women"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user Click On The Proceed To Checkout Button",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Clicked The Terms Of Service Radio Button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Clicked The Proceed To Checkout Button And It Navigates To The Payment Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApStep_Definition.user_Click_On_The_Proceed_To_Checkout_Button()"
});
formatter.result({
  "duration": 4946278700,
  "status": "passed"
});
formatter.match({
  "location": "ApStep_Definition.user_Clicked_The_Terms_Of_Service_Radio_Button()"
});
formatter.result({
  "duration": 123199600,
  "status": "passed"
});
formatter.match({
  "location": "ApStep_Definition.user_Clicked_The_Proceed_To_Checkout_Button_And_It_Navigates_To_The_Payment_Page()"
});
formatter.result({
  "duration": 5192830500,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Payment Page",
  "description": "",
  "id": "purchasing-dress-in-automation-practice-site;payment-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@women"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "user Clicked The Pay By Check",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user Clicked The I Confirm My Order Button And It Navigates To The Order Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ApStep_Definition.user_Clicked_The_Pay_By_Check()"
});
formatter.result({
  "duration": 3083603300,
  "status": "passed"
});
formatter.match({
  "location": "ApStep_Definition.user_Clicked_The_I_Confirm_My_Order_Button_And_It_Navigates_To_The_Order_Confirmation_Page()"
});
formatter.result({
  "duration": 8831362200,
  "status": "passed"
});
});