 
 @firstStep
Feature: Retail Page
  Background: 
    Given User is on Retail website
    And User click on My Account
    When User click on Login
    And User enter username 'userName' and password 'password'
    And User click on Login button
    Then User should be logged in to My Account dashboard
  @chequepayment1
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
       | company  | website      | taxID   | paymentMethod | payeeName |
       | test | test.com | 1234231 | Cheque        | test  |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @banktransfer2
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate information link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | Swiftbank  |  123 |     12345 | Checking    |     123456789 |
    And User click on Continue button
    Then User should see a success message

  @editaccountinfo3
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastName | email          | telephone  |
      | Zak      | Khan   | zakir@tekschoo.com | 2027901234 |
    And User click on continue button
    Then User should see a message Sucess: Your account has been successfully updated.
    
    
    
    
    
