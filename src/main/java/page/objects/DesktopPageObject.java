package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopPageObject extends Base {
	
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath = "//h1//a[text()='TEST ENVIRONMENT']")
		private WebElement desktopPage;
		@FindBy(xpath = "//li//a[text()='Desktops']")
		private WebElement desktopsTab;
		@FindBy(xpath = "//li//a[text()='Show All Desktops']")
		private WebElement showAllDesktops;
		// Desktops
		//Scenario: User verify all the items are prents in Desktops tab
		
		@FindBy(xpath = "//div//a[@class='list-group-item active']")
		private WebElement allPresentItems;
	// Scenario:2 User add Canon EOS 5D from Desktops tab to the cart 
		@FindBy(xpath = "//div//a//img[@class='img-responsive']")
		private WebElement canonEos5dCamera;
		@FindBy(xpath = "//div//select[@id='input-option226']")
		private WebElement selectRedColor;
		@FindBy(xpath = "//input[@id='input-quantity']")
		private WebElement quantity;
		@FindBy(xpath = "//button[@id='button-cart']")
		private WebElement addTheItemToCard;
		@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement successMassageOnShoppingCart;
		
		// Scenario:4 User add a review to Canon Eos 5d item inDesktops tab
		@FindBy(xpath = "//div//a//img[@title='Canon EOS 5D Camera']")  
        private WebElement canonEos5DItemReview ;
       @FindBy(xpath = "//li//a[text()='Reviews (0)']")
       private WebElement reviewlink;
	   @FindBy(xpath = "//input[@id='input-name']")  
	   private WebElement reviewName;
	   @FindBy(xpath = "//div//textarea[@id='input-review']")  
	   private WebElement yourReview ;
	   @FindBy(xpath = "//*[@id=\"form-review\"]/div[4]/div/input[5]")  
	   private WebElement rating;
	   @FindBy(xpath = "//div//button[@id='button-review']")  
	   private WebElement continueOnReview;
	   @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	   private WebElement approvalMessageOfReview;

		public String getToRetailPage() {
			String tetEnvironmentTextOnUI = desktopPage.getText();
			return tetEnvironmentTextOnUI;
		}
	
		public void clickOnDesktopTap() {
			desktopsTab.click();
		
}
		public void clickOnShowAllDesktopTap() {
			showAllDesktops.click();
	}
		
	public void clickOnCanonEosCamra() {
		canonEos5dCamera.click();
	}
	//Need help
			public void selectQuantity(String one) {
				quantity.sendKeys(one);
	}
	public void clickOnAddToCartButton() {
		addTheItemToCard.click();
		
	}
	public String getSuccessMessageOnshoppingCart() {
		String successMessageOnAddShoppingCart = successMassageOnShoppingCart.getText();
		return successMessageOnAddShoppingCart;
		
	}
	public void  clickOncanonEos5DItemReview() {
		canonEos5DItemReview.click();
		
	}
	public void clickOnWriteAReview() {
		reviewlink.click();
	}
	
	
	public void EnterReviewName(String John) {
		reviewName.sendKeys(John);
	
	}
	public void EnterYourReview(String review) {
		yourReview.sendKeys(review);
		
	}
	public void clickOnRating() {
		rating.click();
	
	
	}
	public void clickcontinueOnReview() {
		continueOnReview.click();
	}
	public String getApprovalMessageOfReview()  {
		String approvalMessageOfReviewSubmitted = approvalMessageOfReview.getText();
		return approvalMessageOfReviewSubmitted;
			
		}
	}
	
	
	
	
	
	
	
	
	
	
