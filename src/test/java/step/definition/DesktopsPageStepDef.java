package step.definition;

import java.awt.Desktop;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.DesktopPageObject;
public class DesktopsPageStepDef extends Base {
	
	DesktopPageObject desktopPageObj = new DesktopPageObject(); 
		
	
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPageObj.clickOnDesktopTap();
		logger.info("Desktop Tap was clicked successfully");	    
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPageObj.clickOnShowAllDesktopTap();
		logger.info("User clicked On Show All Desktop Tap");
	   
	}
// Need help
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
	    
	}

	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktopPageObj.clickOnCanonEosCamra();		
		logger.info("User clicked On Canon EOS Camra");
	    
	}
 // Need help
	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPageObj.clickOnAddToCartButton();
		logger.info("User add the item successfully");
		
	   
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
	   
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
	    
	}

	@Then("User should see a message 'Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart(String string ) {
	   String expectedMessage= "Success: You have added Canon EOS 5D to your shopping cart!";
	   String actualMessage =  desktopPageObj.getSuccessMessageOnshoppingCart();
	   Assert.assertEquals(expectedMessage, actualMessage);
	   logger.info("User see a meessag Success: You have added Canon EOS 5D to your shopping cart!");
	}
// 
	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPageObj.clickOncanonEos5DItemReview();
		logger.info("User click On canon Eos 5D Item for review ");
	    
	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPageObj.clickOnWriteAReview();
		logger.info("User click On Review link Batton");
	    
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    List<Map<String, String>> Data = dataTable.asMaps(String.class, String.class);
	    List<Map<String, String>> Review = dataTable.asMaps(String.class, String.class);
	    desktopPageObj.EnterReviewName(Review.get(0).get("YourName"));
	    desktopPageObj.EnterYourReview(Review.get(0).get("Yourreview"));
	    desktopPageObj.clickOnRating();
	    Thread.sleep(5000);
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPageObj.clickcontinueOnReview();
	    
	}
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		String expectedMessage= "User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval";
		   String actualMessage = desktopPageObj.getApprovalMessageOfReview();
		   Assert.assertEquals(expectedMessage, actualMessage);
		   logger.info("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.");
		}
	    
	
}
