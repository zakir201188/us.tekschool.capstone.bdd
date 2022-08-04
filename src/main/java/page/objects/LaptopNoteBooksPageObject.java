package page.objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

//Background
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	private WebElement laptopsAndNotebooks;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNoteBooks;

//Scenario:1
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement item602ShowToTheCart;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartOption;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement removeTheItemFRomCart;
	@FindBy(xpath = "//button//span[@id='cart-total']")
	private WebElement cartShouldShow0item;

// Secnario:2	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement productComparisonOnMacBook;
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement productComparisonOnMacBookAir;
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productComparisonLink;
	@FindBy(xpath = "//table[@class='table table-bordered']")
	private WebElement productComparisonChart;

// Secnario:3

	@FindBy(xpath = "//button//i[@class='fa fa-heart']){[6]")
	private WebElement addSonyVaioToWishList;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']" + "/text()[1]")
	private WebElement userGetMassageToCreatAccount;
	@FindBy(xpath = "//a[text()='login']")
	private WebElement loginInTheMessage;
	@FindBy(xpath = "(//div[@class='alert alert-success" + " alert-dismissible'])/text()[2]")
	private WebElement or;
	@FindBy(xpath = "//a[text()='create an account']")
	private WebElement createAnAccountInTheMessage;
	@FindBy(xpath = "(//div[@class='alert alert-success " + "alert-dismissible'])/text()[3]")
	private WebElement toSave;
	@FindBy(xpath = "(//a[text()='Sony VAIO'])[1]")
	private WebElement SonyVAIOInTheMessage;
	@FindBy(xpath = "(//div[@class='alert alert-success " + "alert-dismissible'])/text()[4]")
	private WebElement toYour;
	@FindBy(xpath = "(//a[text()='wish list'])[1]")
	private WebElement wishListInTheMessage;
	@FindBy(xpath = "(//div[@class='alert alert-success " + "alert-dismissible'])/text()[5]")
	private WebElement exclamationMark;
	@FindBy(xpath = "//div//a[text()='MacBook Pro']")
	private WebElement macBooProItem;
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement priceTag;
	

	public void clickOnLaptopsAndNotebooks() {
		laptopsAndNotebooks.click();
	}
	public void clickOnShowAllLaptopAndNoteBooks() {
		showAllLaptopsAndNoteBooks.click();
	}
	public void clickOnMackBookItem() {
		macBook.click();
	}
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	public String getItem602ShowToTheCart() {
		String item602ShowToTheCartOnUI = item602ShowToTheCart.getText();
		return item602ShowToTheCartOnUI;
	}
	public void clickOnCartOption() {
		cartOption.click();
	}
	public void clickremoveTheItemFRomCart() {
		removeTheItemFRomCart.click();
	}
	public void clickproductComparisonOnMacBook() {
		productComparisonOnMacBook.click();
	}

	public void clickproductComparisonOnMacBookAir() {
		productComparisonOnMacBookAir.click();
	}
	public String getProductComparisonChart() {
		String productComparisonChartOnUI = productComparisonChart.getText();
		return productComparisonChartOnUI;
// Scenario 3:
	}
	public void clickOnHeartIcomToAddSonyVaio() {
		addSonyVaioToWishList.click();
	}
	public String getLoginOrCreatAccountMessage() {
		String actualResult = "You must " + loginInTheMessage.getText() + " or " + createAnAccountInTheMessage.getText()
				+ " to save " + SonyVAIOInTheMessage.getText() + " to your " + wishListInTheMessage.getText()
				+ "exclamationMark";
		return actualResult;
	}
	public void clickOnmacBooProItem() {
		macBooProItem.click();
	}
	public String getPriceTag() {
		String actualPrice = priceTag.getText();
		return actualPrice;
	}

}
