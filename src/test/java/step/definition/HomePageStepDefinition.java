package step.definition;


import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;


public class HomePageStepDefinition extends Base {

	HomePageObject homepageobject = new HomePageObject(); {
	}
//Scenario:1 User verify currency values change	 
	@When("User click on Currency")
	public void user_click_on_currency() {
		homepageobject.clickOncurrencylink();
		logger.info("user succefully click on Currency");
	    
	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepageobject.clickOnEurolink();
		logger.info("User chose Euro from dropdown");
	   
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homepageobject.showValueToEuro();
		logger.info("currency value should change to Euro");
	    
	}
// Scenario:2 User empty Shopping cart message displays
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
	    
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		String expectedText = ("Your shopping cart is empty! message should display");
        String actualText = homepageobject.getEmptyMessageDisplay();
        Assert.assertEquals(expectedText, actualText);
        logger.info("“Your shopping cart is empty!” message should display");
		
	    
	}

	
	
}