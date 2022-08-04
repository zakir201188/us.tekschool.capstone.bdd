package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base  {

	public HomePageObject() {
	PageFactory.initElements(driver, this);
	}
	// Scenario 1
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencylink;
	@FindBy(xpath ="//button[@name='EUR']")
	private WebElement choseEurolink;
	@FindBy(xpath = "//button//strong[text()='€']")
	private WebElement changeValueToEuro;
	
	
// Scenario 2
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement  shoppingCartLink;
	@FindBy(xpath = "//li//p[text()='Your shopping cart is empty!']")
	private WebElement emptyMessageShouldDisplay;
	
	
	
	
	public void clickOncurrencylink() {
		currencylink.click();
	}
	public void clickOnEurolink() {
		choseEurolink.click();
	}
	public void showValueToEuro() {
		changeValueToEuro.isDisplayed();
		
	}
	public void clickOnshoppingCartLink() {
		shoppingCartLink.click();
	}
	
	public String  getEmptyMessageDisplay() {
	String emptyMessageShouldDisplayOnUI = emptyMessageShouldDisplay.getText();
	return emptyMessageShouldDisplayOnUI;
	
	}

	
	
}
