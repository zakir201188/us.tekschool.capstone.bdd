package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;

public class LaptopNoteBooksStepDefinition extends Base {

	LaptopNoteBooksPageObject laptopNoteBooksObj = new LaptopNoteBooksPageObject();
	{

	}
	// Background

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptopNoteBooksObj.clickOnLaptopsAndNotebooks();
		logger.info("User click on Laptop & NoteBook top");

	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopNoteBooksObj.clickOnShowAllLaptopAndNoteBooks();
		logger.info("User clicked on Show all laptop & NoteBook option");

	}

	// scenario:1
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptopNoteBooksObj.clickOnMackBookItem();
		logger.info("User clicked on MacBook Item");

	}
	
	@Then("User should see {int} item\\(s){double} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(Integer int1, Double double1) {
		laptopNoteBooksObj.getItem602ShowToTheCart();
		logger.info("User see 1 item(s)-602.00 showed to the cart.");

	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptopNoteBooksObj.clickOnCartOption();

	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNoteBooksObj.clickremoveTheItemFRomCart();
		logger.info("User click on red X button to remove the item from cart");

	}

	// Scenario:2 ProductComparsion.
			
	@Given("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptopNoteBooksObj.clickproductComparisonOnMacBook();
		logger.info("User click on product comparison icon on MacBook");
	}
		
	@When("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptopNoteBooksObj.clickproductComparisonOnMacBookAir();
		logger.info("User click on product comparison icon on MacBook");
	}
	
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptopNoteBooksObj.clickproductComparisonOnMacBook();
		logger.info("User click on Procuct comparision link");

	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart(String string) {
		String expectedText = ("Product Comparison Chart");
		String actualText = laptopNoteBooksObj.getProductComparisonChart();
		Assert.assertEquals(expectedText, actualText);
		logger.info("User should see Prodcut Comparsion Chart");

	}

	//Scenario 3
	@And("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list(String string ) {
		laptopNoteBooksObj.clickOnHeartIcomToAddSonyVaio();
		logger.info("User added Sony Vaio laptop to wish list");

	}

	@Then("User should get a message You must login or create an account to save Sony VAIO to your wish list!")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list(
			String String) {
		String expectedText = ("You must login or create an account to save Sony VAIO to your wish list!");
		String actualText = laptopNoteBooksObj.getLoginOrCreatAccountMessage();
		Assert.assertEquals(expectedText, actualText);
		logger.info("User should get a message You must login or"
				+ " create an account to save Sony VAIO to your wish list!");

	}


	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String expectedPrice) {
		String expectedText = ("Get the Price Tage");
		String actualText = laptopNoteBooksObj.getPriceTag();
		Assert.assertEquals(expectedText, actualText);
		logger.info("User sees 2000.000 price tag is present on UI successfully");
	}
		


}









