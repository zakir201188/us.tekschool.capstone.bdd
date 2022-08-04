package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1//a[text()='TEST ENVIRONMENT']")
	private WebElement retailPage;
	@FindBy(xpath = "//li/a[@title='My Account']")
	private WebElement myAccountLink;
	@FindBy(xpath = "//li//a[text()='Login']")
	private WebElement loginLink;
	@FindBy(xpath = "//div//input[@id='input-email']")
	private WebElement emailField;
	@FindBy(xpath = "//div//input[@type='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//div//input[@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//div[@id='content']//h2[text()='My Account']")
	private WebElement myAccountDashboard;
   // Scenario 1 Register as an Affiliate user with Cheque Payment Method
	@FindBy(xpath = "//a[text()= 'Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccount;
	@FindBy(id = "input-company")
	private WebElement companyName;
	@FindBy(id = "input-website")
	private WebElement websiteinput;
	@FindBy(id = "input-tax")
	private WebElement taxIdinput;
	@FindBy(xpath = "//label[normalize-space()='Cheque']")
	private WebElement clickOnPayMethodCheque;
	@FindBy(id = "input-cheque")
	private WebElement chequepayeeName;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement aboutUsCheckBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	// Scenario 2 Edit your affiliate information from Cheque payment method to Bank
	@FindBy(xpath = ("//li/a[text()='Edit your affiliate information'"))
	private WebElement editAffiliatedInformationLink;
	@FindBy(xpath = "//input[@value = 'bank']")
	private WebElement bankRadioButton;

	@FindBy(xpath = "//input[@name='bank_name']")
	private WebElement BankNameFeild;
	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement branchNumber;
	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement swiftCodeFeild;
	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement accountNameFeild;
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumberFeild;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueOnBttnAcountEdit;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMassageOnEditAccount;
	// Scenario 3 Edit your account information
	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInfo;
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement editFirstName;
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement editLastName;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement editEmail;
	@FindBy(xpath = "//input[@name='telephone'] ")
	private WebElement editTelephone;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement editContinueBttn;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageOnEditAccountInfo;
	
	
		

	public String getToRetailPage() {
		String testEnvironmentTextOnUI = retailPage.getText();
		return testEnvironmentTextOnUI;
	}

	public void clickOnMyAccount() {
		myAccountLink.click();
	}

	public void clickOnLogin() {
		loginLink.click();
	}

	public void enterEmailAdd(String email) {
		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public String getLoggedinDashboard() {
		String myAccountTextOnLoggedinPage = myAccountDashboard.getText();
		return myAccountTextOnLoggedinPage;
	}

	public void clickOnRegisterForAnAffiliateAccount() {
		registerForAnAffiliateAccount.click();
	}

	public void enterCompanyName(String companyNameEnter) {
		companyName.sendKeys(companyNameEnter);
	}

	public void enterWebSite(String WebSitelink) {
		websiteinput.sendKeys(WebSitelink);
	}

	public void enterTaxId(String TaxIdInput) {
		taxIdinput.sendKeys(TaxIdInput);
	}

	public void choosePaymentMethod(String PayMethodCheque) {
		clickOnPayMethodCheque.click();
	}

	public void chequePayeeName(String PayeeNameInput) {
		chequepayeeName.sendKeys(PayeeNameInput);

	}


	public void clickOnAboutcheckBox() {
		aboutUsCheckBox.click();
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public String getSuccessMessageOnAffiliatedAccount() {
		String successMessageOnAffiliatedAccount = successMessage.getText();
		return successMessageOnAffiliatedAccount;
	}

	// Scenario 2 Edit your affiliate information from Cheque payment method to Bank
	// transfer;

	public void clickOnEditAffiliatedInformationLink() {
		editAffiliatedInformationLink.click();
	}

	public void clickOnBankRadioButton() {
		bankRadioButton.click();
	}

	public void enterBankName(String bankName) {

		BankNameFeild.sendKeys(bankName);
	}

	public void enterBranchNumber(String abaNumber) {
		branchNumber.sendKeys(abaNumber);
	}

	public void enterSwiftCodeFeild(String swiftCode) {
		swiftCodeFeild.sendKeys(swiftCode);
	}

	public void enterAccountNameFeild(String swiftCode) {
		accountNameFeild.sendKeys(swiftCode);

	}

	public void enterAccountNumberFeild(String accountNumber) {
		accountNumberFeild.sendKeys(accountNumber);
	}

	public void clickOnContinueBttOnAccountEdit() {
		continueOnBttnAcountEdit.click();
	}

	public void clickOnEditYourAccountInfo() {
	editYourAccountInfo.click();
	}

	public void clearFirstName() {
		editFirstName.clear();
	}

	public void enterEditFirstName(String firstname) {
		editFirstName.sendKeys(firstname);
	}

	public void clearEditLastName() {
		editLastName.clear();
	}

	public void enterEditLastName(String lastname) {
		editLastName.sendKeys(lastname);
	}

	public void cleareditEmail() {
		editEmail.clear();
	}

	public void enterEditEmail(String email) {
		editEmail.sendKeys(email);
	}

	public void clearEditTelephone() {
		editTelephone.clear();
	}

	public void enterEditTelephone(String telephone) {
		editTelephone.sendKeys(telephone);
		}

	public void clickOneEditContinueBattn() {
		editContinueBttn.click();
	}
	
	public String getSuccessMessageOnEditAccountInfo() {
		String successMessageOnEditAccouintInformation = 
				successMessageOnEditAccountInfo.getText();
		return successMessageOnEditAccouintInformation;
	}
}
