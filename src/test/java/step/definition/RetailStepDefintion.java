package step.definition;

import java.io.IOException;
import java.util.List;
import java.util.Map;


import org.junit.Assert;

import core.Base;
import io.cucumber.core.logging.Logger;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import okhttp3.internal.Util;
import page.objects.RetailPageObject;
import utilities.utils;


public class RetailStepDefintion extends Base {

	RetailPageObject retailpageobj = new RetailPageObject();

	// Background
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
		String actualText = retailpageobj.getToRetailPage();
		Assert.assertEquals(expectedText, actualText);
		logger.info("User is on retail page");
		}
	
	@And("User click on My Account")
	public void user_click_on_my_account() {
		retailpageobj.clickOnMyAccount();
		logger.info("My Account was clicked successfully");
	}

	@And("User click on Login")
	public void user_click_on_login() {
		retailpageobj.clickOnLogin();
		logger.info("login was clicked successfully");

	}

	@And("User enter username {string} and password {string}")
	public void user_enter_username_and_password (String email, String password) {
		retailpageobj.enterEmailAdd("zakir321@gmail.com");
		retailpageobj.enterPassword("!@#$%^&");
		logger.info("user enter username and password successfully");
	}
	@And("User click on Login button")
	public void user_click_on_login_button() {
		retailpageobj.clickOnLoginButton();
		logger.info("login button was clicked successfully");
	}

	@Then("User should be logged in to My Account dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String expectedText = "My Account";
		String actualText = retailpageobj.getLoggedinDashboard();
		Assert.assertEquals(expectedText, actualText);	
		logger.info("user is on login dashbord");
		utils.takeScreenShot();
	}
	// Scenario 1: Register as an Affliliate user with Cheque Payment Method
	
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		retailpageobj.clickOnRegisterForAnAffiliateAccount();
		logger.info("User click on regester for an Affilate Account successfully");
				
	}
	
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		List<Map<String, String>> Affiliate = dataTable.asMaps(String.class, String.class);
		retailpageobj.enterCompanyName(Affiliate.get(0).get("company"));
		retailpageobj.enterWebSite(Affiliate.get(0).get("website"));
		retailpageobj.enterTaxId(Affiliate.get(0).get("taxID"));
		retailpageobj.choosePaymentMethod(Affiliate.get(0).get("paymentMethod"));
		retailpageobj.chequePayeeName(Affiliate.get(0).get("payeeName"));
		Thread.sleep(5000);
	}
		
	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() throws InterruptedException {
		retailpageobj.clickOnAboutcheckBox();
		Thread.sleep(2000);
   }

	@When("User click on Continue button")
	public void user_click_on_continue_button() throws InterruptedException {
		retailpageobj.clickOnContinueButton();
		Thread.sleep(2000);
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message(String string ) {
		String expectedMessage = "Seucess: Your account has been sucessfully updated.";
		String actualMessage = retailpageobj.getSuccessMessageOnAffiliatedAccount();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("User see success message");
		}
	
// acounttransfer 2
	
	@When("User click on Edit your affiliate information link")
    public void user_click_on_edit_your_affiliate_information_link() {
		retailpageobj.clickOnEditAffiliatedInformationLink();
		logger.info("User clicked on Edite Affiliated Infromation Link successfully");
	}
		
	@And("user click on Bank Transfer radio button")
     public void user_click_on_bank_transfer_radio_button() {
		retailpageobj.clickOnBankRadioButton();
	}
		
	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobj.enterBankName(data.get(0).get("bankName"));
		retailpageobj.enterBranchNumber(data.get(0).get("abaNumber"));	
		retailpageobj.enterSwiftCodeFeild(data.get(0).get("swiftCode"));
		retailpageobj.enterAccountNameFeild(data.get(0).get("accountName"));		
		retailpageobj.enterAccountNumberFeild(data.get(0).get("accountNumber"));
			logger.info("User enter Affiliate Account info");
			utils.takeScreenShot();
	}
	
	// Scenario 3: Edit your account Information. 
	@When("User click on Edit your account information link")
	public void user_click_On_edit_your_account_information_link() {
		retailpageobj.clickOnEditYourAccountInfo();
		logger.info("User clicked of edit your account linke successfully");
	}
	@And("User modify below information")
	public void User_modify_below_information(DataTable dataTable) {
	retailpageobj.clearFirstName();
	retailpageobj.clearEditLastName();
	retailpageobj.cleareditEmail();
	retailpageobj.clearEditTelephone();
	List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
	retailpageobj.enterEditFirstName(data.get(0).get("firstname"));
	retailpageobj.enterEditLastName(data.get(0).get("lastname"));	
	retailpageobj.enterEditEmail(data.get(0).get("email"));
	retailpageobj.enterEditTelephone(data.get(0).get("Telephone"));		
	logger.info("User Modify the information successfully");
		utils.takeScreenShot();	
	}
	
	@And("User click on continue button")
	public void User_click_on_continue_button() {
		retailpageobj.clickOnContinueBttOnAccountEdit();
		logger.info("User clicked on the continue button successfully");
	}
	
		
	@Then("User should see a message Sucess: Your account has been successfully updated.")
	public void user_should_see_a_message_sucess_your_account_has_been_successfully_updated() {
		String expectedMessage = "Sucess: Your account has been successfully updated.";
		String actualMessage = retailpageobj.getSuccessMessageOnEditAccountInfo();
		Assert.assertEquals(expectedMessage, actualMessage);
		logger.info("User see a message:Success: Your account has been successfully updated.");
		utils.takeScreenShot(); 
	}
}
	
	
	
	

