#
#  Feature: Application Login
#
#    @RegressionTest
#    Scenario: Admin page default Login
#      Given User is on net banking page
#      When User Login into application with "admin" and password "1234"
#      Then Home Page is displayed
#      And Cards are displayed
#
#  #Reusable
#
#    @RegressionTest
#    Scenario: User page default Login
#      Given User is on net banking page
#      When User Login into application with user and password 0935
#      Then Home Page is displayed
#      And Cards are displayed
#
#    @SmokeTest @RegressionTest
#    Scenario Outline: User Page default login
#      Given User is on net banking page
#      When User Login into application with "<Username>" and password "<Password>"
#      Then Home Page is displayed
#      And Cards are displayed
#
#    Examples:
#      |Username| Password|
#      |debituser| hello12 |
#
#     @SmokeTest
#    Scenario: User is on practice landing page
#      Given User is on net banking page
#      When User Login into application
#      | rahul |
#      | shetty |
#      | contact@email.com |
#      | 1234567890        |
#      Then Home Page is displayed
#      And Cards are displayed