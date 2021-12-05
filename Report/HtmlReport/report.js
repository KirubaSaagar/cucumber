$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
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
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;login-page;;1"
    },
    {
      "cells": [
        "simbu",
        "str"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login-page;;2"
    },
    {
      "cells": [
        "rohit",
        "hitman"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login-page;;3"
    },
    {
      "cells": [
        "pant",
        "spidey"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login-page;;4"
    },
    {
      "cells": [
        "MasterBruceWayne",
        "whitesr07"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;login-page;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1635200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
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
  "name": "user Enter The \"simbu\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"str\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launched_The_Application()"
});
formatter.result({
  "duration": 7872449300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "simbu",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 117766900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "str",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 88096500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 369170400,
  "status": "passed"
});
formatter.after({
  "duration": 231200,
  "status": "passed"
});
formatter.before({
  "duration": 92900,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
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
  "name": "user Enter The \"rohit\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"hitman\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launched_The_Application()"
});
formatter.result({
  "duration": 279965700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rohit",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 96395900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hitman",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 81753400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 332784600,
  "status": "passed"
});
formatter.after({
  "duration": 105700,
  "status": "passed"
});
formatter.before({
  "duration": 78000,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
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
  "name": "user Enter The \"pant\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"spidey\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launched_The_Application()"
});
formatter.result({
  "duration": 302751400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pant",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 120166000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "spidey",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 91749400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 404519900,
  "status": "passed"
});
formatter.after({
  "duration": 152500,
  "status": "passed"
});
formatter.before({
  "duration": 106300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
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
  "name": "user Enter The \"MasterBruceWayne\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"whitesr07\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launched_The_Application()"
});
formatter.result({
  "duration": 285181800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MasterBruceWayne",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 131771700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "whitesr07",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 89522500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 704483400,
  "status": "passed"
});
formatter.after({
  "duration": 70400,
  "status": "passed"
});
formatter.before({
  "duration": 77600,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user Select The \"New York\" Hotel Location",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user Select The \"Hotel Sunshine\" Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The \"Deluxe\" Hotel Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Select The Adults Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Select The Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Click On The Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Hotel_Location(String)"
});
formatter.result({
  "duration": 181949600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Hotel(String)"
});
formatter.result({
  "duration": 187716800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deluxe",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Select_The_Hotel_Room_Type(String)"
});
formatter.result({
  "duration": 150252700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 149813000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Check_In_Date()"
});
formatter.result({
  "duration": 106375000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Check_Out_Date()"
});
formatter.result({
  "duration": 90931000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Adults_Per_Room()"
});
formatter.result({
  "duration": 170647900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Children_Per_Room()"
});
formatter.result({
  "duration": 167538700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 686480100,
  "status": "passed"
});
formatter.after({
  "duration": 108100,
  "status": "passed"
});
formatter.before({
  "duration": 78600,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Select Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@sanitytest"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user Select The Select Radio Button",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user Click On The Continue Button And It Navigates To The Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Select_Radio_Button()"
});
formatter.result({
  "duration": 110257400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page()"
});
formatter.result({
  "duration": 607539600,
  "status": "passed"
});
formatter.after({
  "duration": 60200,
  "status": "passed"
});
formatter.before({
  "duration": 49500,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Book Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@unittest"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "user Enter The Firstname In FirstName Field",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user Enter The Lastname In LastName Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Enter The Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter The Credit Card Number In Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Select The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Select The Month In Expiry Date",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Select The Year In Expiry Date",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Enter The CVV Number",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Click On The BookNow Button And It Navigates To The Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Firstname_In_FirstName_Field()"
});
formatter.result({
  "duration": 941930200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Lastname_In_LastName_Field()"
});
formatter.result({
  "duration": 169150000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 177957200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 111232900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type()"
});
formatter.result({
  "duration": 156806100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Month_In_Expiry_Date()"
});
formatter.result({
  "duration": 162203000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Year_In_Expiry_Date()"
});
formatter.result({
  "duration": 153387100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_CVV_Number()"
});
formatter.result({
  "duration": 143138100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_BookNow_Button_And_It_Navigates_To_The_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 86544000,
  "status": "passed"
});
formatter.after({
  "duration": 93800,
  "status": "passed"
});
formatter.before({
  "duration": 66900,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Booking Confirmation Page",
  "description": "",
  "id": "hotel-booking-in-adactin-application;booking-confirmation-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 47,
      "name": "@regressiontest"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "the User Click On LogoutButton And It Navigates To The Logout Successfull Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.the_User_Click_On_LogoutButton_And_It_Navigates_To_The_Logout_Successfull_Page()"
});
formatter.result({
  "duration": 5976800000,
  "status": "passed"
});
formatter.after({
  "duration": 82300,
  "status": "passed"
});
});