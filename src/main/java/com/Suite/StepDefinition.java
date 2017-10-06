package com.suite;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.suite.Cashier.DepositPage;
import com.suite.Cashier.WithdarwalPage;

import Util.Constant;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AboutUsPage;
import pages.BasePage;
import pages.ChangePassword;
import pages.ContactUsPage;
import pages.FAQSPage;
import pages.FooterPage;
import pages.ForgottenDetails;
import pages.GameInfoPage;
import pages.GettingStartedPage;
import pages.HomePage;
import pages.LivePage;
import pages.PrivacyPolicy;
import pages.PromotionPage;
import pages.RegisterPage;
import pages.ResposibleGamblingPage;
import pages.TVPresentersPage;
import pages.TermsPage;
import pages.VIPPage;
import pages.VegasPage;
import pages.VideosPage;
import pages.WelcomePage;
import pages.WinnersPage;

public class StepDefinition extends BaseTest {
	private BasePage basePage;
	private HomePage homePage;
	private RegisterPage registerPage;
	private ForgottenDetails forgottenDetailsPage;
	private com.suite.Cashier.DepositPage depositPage;
	private ChangePassword changepasswordPage;
	private ContactUsPage contactPage;
	private FooterPage footerPage;
	private GettingStartedPage gettingstartedPage;
	private TVPresentersPage tvpresentersPage;
	private VideosPage videoPage;
	private VIPPage vipPage;
	private WinnersPage winnersPage;
	private AboutUsPage aboutusPage;
	private FAQSPage faqsPage;
	private PrivacyPolicy privacypolicyPage;
	private ResposibleGamblingPage RespGambPage;
	private TermsPage termsPage;
	private WithdarwalPage withdrawPage;
	private WelcomePage welcomePage;
	private VegasPage vegasPage;
	private LivePage livePage;
	private PromotionPage promotionPage;
	private GameInfoPage gameInfoPage;

	public StepDefinition() {
		super();

		// all pages
		homePage = new HomePage(BaseTest.driver);
		registerPage = new RegisterPage(BaseTest.driver);
		basePage = new BasePage(BaseTest.driver);
		forgottenDetailsPage = new ForgottenDetails(BaseTest.driver);
		depositPage = new com.suite.Cashier.DepositPage(BaseTest.driver);
		changepasswordPage = new ChangePassword(BaseTest.driver);
		contactPage = new ContactUsPage(BaseTest.driver);
		footerPage = new FooterPage(BaseTest.driver);
		gettingstartedPage = new GettingStartedPage(BaseTest.driver);
		tvpresentersPage = new TVPresentersPage(BaseTest.driver);
		videoPage = new VideosPage(BaseTest.driver);
		vipPage = new VIPPage(BaseTest.driver);
		winnersPage = new WinnersPage(BaseTest.driver);
		aboutusPage = new AboutUsPage(BaseTest.driver);
		faqsPage = new FAQSPage(BaseTest.driver);
		privacypolicyPage = new PrivacyPolicy(BaseTest.driver);
		RespGambPage = new ResposibleGamblingPage(BaseTest.driver);
		termsPage = new TermsPage(BaseTest.driver);
		withdrawPage = new WithdarwalPage(BaseTest.driver);
		welcomePage = new WelcomePage(BaseTest.driver);
		vegasPage = new VegasPage(BaseTest.driver);
		livePage = new LivePage(BaseTest.driver);
		promotionPage = new PromotionPage(BaseTest.driver);
		gameInfoPage = new GameInfoPage(BaseTest.driver);

	}

	
	
	
	
	@Before()
	public void checkPlayerMessaging(){
		
		
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This below are Only For @Given Methods */
	///////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 * Navigating to the home page
	 * 
	 * @param {string} siteName-is the url address od supercasino.com
	 **/
	@Given("^I navigate to the homepage on \"([^\"]*)\"$")
	public void i_navigate_to_the_homepage_on(String browser) throws Throwable {
		homePage.get(CONFIG.getProperty("siteName"));
	}
	/*
	 * Navigating to the Registration page
	 * 
	 * @param {string} siteName-is the url address od supercasino.com
	 **/
	@Given("^I navigate to the Registrationpage on Mozilla$")
	public void i_navigate_to_the_Registrationpage_on_Mozilla() {
		registerPage.get(CONFIG.getProperty("siteName"));

	}
	/*
	 * Navigating to the Registration page
	 * 
	 * @param {string} siteName-is the url address od supercasino.com
	 **/
	@Given("^I navigate to the Registrationpage on \"([^\"]*)\"$")
	public void i_navigate_to_the_Registrationpage_on(String browser) {
		registerPage.get(CONFIG.getProperty("siteName"));
	}

	@Given("^I navigate to the ForgottenDetails page on \"([^\"]*)\"$")
	public void i_navigate_to_the_ForgottenDetails_page_on(String browser) {
		forgottenDetailsPage.get(CONFIG.getProperty("siteName"));
	}

	@Given("^I have loggedin on the BasePage$")
	public void i_have_loggedin_on_the_Home_Page() throws Throwable {
		basePage.doLogin(CONFIG.getProperty("siteName"), CONFIG.getProperty("defaultUsername"),
				CONFIG.getProperty("defaultPassword"));

	}

	@Given("^I navigate to Contact us page on Vegas Tab$")
	public void i_navigate_to_Contact_us_page_on_Vegas_Tab() {
		contactPage.Url();

	}

	// Navigate to promotion page
	@Given("^I navigate to the Promotion page on \"([^\"]*)\"$")
	public void i_navigate_to_the_Promotion_page_on(String browser) {
		promotionPage.get(CONFIG.getProperty("siteName"));

	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This Below are only for @When Methods */
	//////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Entering the username into the Loging username input box
	 * 
	 * @param {string}
	 *            username- this is the UserName entered into the login username
	 *            text box.
	 */
	@When("^I enter Username as \"([^\"]*)\"$")
	public void i_enter_Username_as(String username) {
		basePage.sendUsername(username);
	}

	/**
	 * Entering the password into the Loging username input box
	 * 
	 * @param {string}
	 *            password- this is the Password entered into the login Password
	 *            text box.
	 */
	@When("^I enter Password as \"([^\"]*)\"$")
	public void i_enter_Password_as(String password) {
		basePage.sendPassword(password);

	}

	/**
	 * Clicking the Signin button to login
	 */
	@When("^I click on SignIn button$")
	public void i_click_on_SignIn_button() {
		basePage.clickSigin();
	}

	/*
	 * clicking on Join Now button to navigate to registration page
	 **/
	@When("^I click on JoinNow Button$")
	public void i_click_on_JoinNow_Button() {
		basePage.clickJoinNow();
	}

	@When("^I click on RegisterButton$")
	public void i_click_on_RegisterButton() {
		

	}
	/* Enter your UserName of Birth on the Registration page
	 * @param {string} UserName- this is the UserName user entered on UserName Text box
	 */
	@When("^I enter regUsername as \"([^\"]*)\"$")
	public void i_enter_regUsername_as(String UserName) {
		registerPage.sendRegUsername(UserName);

	}
	/* Enter your Password on the Registration page
	 * @param {string} password- this is the User password entered on Password Text box
	 */
	@When("^I enter RegPassword as \"([^\"]*)\"$")
	public void i_enter_RegPassword_as(String password) {
		registerPage.sendRegPassword(password);

	}
	/* Enter your ScreenName on the Registration page
	 * @param {string} SCreenName- this is the User ScreenNmae entered on ScreenName Text box
	 */
	@When("^I enter a RegScreenName as \"([^\"]*)\"$")
	public void i_enter_a_RegScreenName_as(String ScreenName) {
		registerPage.sendOnscreenName(ScreenName);

	}
	/* Enter your Surname on the Registration page
	 * @param {string} surname- this is the User Surname entered on surname Text box
	 */
	@When("^I enter RegEmail as \"([^\"]*)\"$")
	public void i_enter_RegEmail_as(String Email) {
		registerPage.sendEmail(Email);

	}
	/* Enter your FirstName on the Registration page
	 * @param {string} firstName- this is the User firstName entered on surname Text box
	 */

	@When("^I enter RegFirstName as \"([^\"]*)\"$")
	public void i_enter_RegFirstName_as(String firstName) {
		registerPage.sendFirstName(firstName);

	}
	/* Enter your Surname of Birth on the Registration page
	 * @param {string} surname- this is the User Surname entered on surname Text box
	 */
	@When("^I enter RegSurName as \"([^\"]*)\"$")
	public void i_enter_RegSurName_as(String surname) {
		registerPage.sendSurName(surname);

	}
	/* Enter your Day of Birth on the Registration page
	 * @param {string} Day- this is the User Day of Birth selected from Date of birth Day Dropdown Menu
	 */
	@When("^I enter RegDOBDay as \"([^\"]*)\"$")
	public void i_enter_RegDOBDay_as(String Day) {
		registerPage.sendDOBday(Day);

	}
	/* Enter your Month of Birth on the Registration page
	 * @param {string} Month- this is the User Month of Birth selected from Date of birth Month Dropdown Menu
	 */
	@When("^I enter RegDOBMonth as \"([^\"]*)\"$")
	public void i_enter_RegDOBMonth_as(String Month) {
		registerPage.sendDOBmonth(Month);
	}
	/* Enter your Year of Birth on the Registration page
	 * @param {string} Year- this is the User Year of Birth selected from Date of birth Year Dropdown Menu
	 */
	@When("^I enter RegDOBYear as \"([^\"]*)\"$")
	public void i_enter_RegDOBYear_as(String Year) {
		registerPage.sendDOByear(Year);

	}
	/* Click on the Female Gender Radio button */
	@When("^I click Gender Type as Female$")
	public void i_click_Gender_Type_as_Female() {
     registerPage.clickGenderType();
	}
	/* User click on Click here link to Enter your address Manually on Registration Page */
	@When("^I click on RegClickHere$")
	public void i_click_on_RegClickHere() {
		registerPage.clickEnterManually();

	}
	/* Enter your Country on the Registration page
	 * @param {string} country- this is the country user selected from the country dropdown menu.
	 */
	@When("^I enter Country as \"([^\"]*)\"$")
	public void i_enter_Country_as(String country) {
     registerPage.sendCountry(country);
	}
	/* Select your currency on the Registration page
	 * @param {string} CurrencyType- this is the Currency type user selected from the currency Dropdown menu
	 */
	@When("^I enter Currency as \"([^\"]*)\"$")
	public void i_enter_Currency_as(String CurrencyType) {
		registerPage.sendCurrency(CurrencyType);

	}
	/* Enter your Address on the Registration page
	 * @param {string} Address- this is the User house Number and Street name entered into the Contact Number
	 *            text box.
	 */
	@When("^I enter RegAddress as \"([^\"]*)\"$")
	public void i_enter_RegAddress_as(String Address) {
		registerPage.sendAddress(Address);

	}
	/* Enter your Town address on the Registration page
	 * @param {string} Town- this is Town  of your address entered into the Town/City
	 *            text box.
	 */
	@When("^I enter RegTown as \"([^\"]*)\"$")
	public void i_enter_RegTown_as(String Town) {
		registerPage.sendCity(Town);

	}

	/*
	 * Enter your County on the Registration page
	 * 
	 * @param {string} County - this is the County entered into the County text
	 * box.
	 */
	@When("^I enter RegCounty as \"([^\"]*)\"$")
	public void i_enter_RegCounty_as(String county) {
		registerPage.sendCounty(county);

	}

	/*
	 * Enter your Postcode on the Registration page
	 * 
	 * @param {string} Postcode- this is the Address Postcode entered into the
	 * Postcode text box.
	 */
	@When("^I enter RegPostCode as \"([^\"]*)\"$")
	public void i_enter_RegPostCode_as(String Postcode) {
		registerPage.sendPostCode(Postcode);
	}
	@When("^I enter RegDialingCode as \"([^\"]*)\"$")
	public void i_enter_RegDialingCode_as(String diallingcode)  {
	    registerPage.sendDiallingCode(diallingcode);
	}
	/*
	 * Enter your Contact Mobile number on the Registration page
	 * 
	 * @param {string} contactNumber- this is the Telephone number entered into
	 * the Contact Number text box.
	 */
	@When("^I enter RegContactNum as \"([^\"]*)\"$")
	public void i_enter_RegContactNum_as(String contactNumber) {
		registerPage.sendContactNumber(contactNumber);

	}

	/* Click on the Over 18 Check box on the Registrion page */
	@When("^I click on RegT\\$CCheckBox$")
	public void i_click_on_RegT$CCheckBox() {
		registerPage.checkOver18();

	}

	/* Click on the Register Now button on the Registration Page */
	@When("^I click on RegSubmitButton$")
	public void i_click_on_RegSubmitButton() {
		registerPage.clickRegSubmit();

	}

	@When("^I click on forgottenDetailsLink$")
	public void i_click_on_forgottenDetailsLink() {
		basePage.clickForgottenDetailsLink();

	}

	@When("^I enter Forgotten Deatils username as \"([^\"]*)\"$")
	public void i_enter_Forgotten_Deatils_username_as(String username) {
		forgottenDetailsPage.sendForgottenUsername(username);

	}

	@When("^I enter  Forgotten Deatils email as \"([^\"]*)\"$")
	public void i_enter_Forgotten_Deatils_email_as(String Email) {
		forgottenDetailsPage.sendForgottenEmail(Email);

	}

	@When("^I enter  Forgotten Deatils  DOBday as \"([^\"]*)\"$")
	public void i_enter_Forgotten_Deatils_DOBday_as(String day) {
		forgottenDetailsPage.sendForgottenDOBDay(day);
	}

	@When("^I enter  Forgotten Deatils DOBmonth as \"([^\"]*)\"$")
	public void i_enter_Forgotten_Deatils_DOBmonth_as(String month) {
		forgottenDetailsPage.sendForgottenMonth(month);
	}

	@When("^I enter  Forgotten Deatils DOBYear as \"([^\"]*)\"$")
	public void i_enter_Forgotten_Deatils_DOBYear_as(String year) {
		forgottenDetailsPage.sendForgottenYear(year);

	}

	@When("^I click on  Forgotten Deatils Submit Button$")
	public void i_click_on_Forgotten_Deatils_Submit_Button() throws InterruptedException {
		forgottenDetailsPage.clickForgottenSubmitButton();

	}

	@When("^I enter Reset Password as \"([^\"]*)\"$")
	public void i_enter_Reset_Password_as(String newpassword) {
		forgottenDetailsPage.sendResetNewPassword(newpassword);
	}

	@When("^I enter ResetConFirmPassword as \"([^\"]*)\"$")
	public void i_enter_ResetConFirmPassword_as(String confirmPassword) {
		forgottenDetailsPage.sendResetConfPassword(confirmPassword);

	}

	@When("^I click on ResetSubmitt Button$")
	public void i_click_on_ResetSubmitt_Button() {
		forgottenDetailsPage.clickResetSubmitButton();
	}

	@When("^I have logged in username as \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_have_logged_in_username_as_and_password(String username, String password) {
		basePage.sendUsername(username);
		basePage.sendPassword(password);
		basePage.clickSigin();
		// basePage.doLogin(username, password, password);
	}

	@When("^I click a Depositbutton$")
	public void i_click_a_Depositbutton() {
		basePage.clickHpDepositButton();
	}

	@When("^I enter CardVisa Number as \"([^\"]*)\"$")
	public void i_enter_CardVisa_Number_as(String cardNumber) {
		depositPage.sendCashierCardNumber(cardNumber);

	}

	@When("^I entry Expiry card month as \"([^\"]*)\"$")
	public void i_entry_Expiry_card_month_as(String Month) {
		depositPage.sendCashierMonthExpiryDate(Month);

	}

	@When("^I enter Expiry card year as \"([^\"]*)\"$")
	public void i_enter_Expiry_card_year_as(String Year) {
		depositPage.sendCashierYearExpiryDate(Year);

	}

	@When("^I enter CVV as \"([^\"]*)\"$")
	public void i_enter_CVV_as(String cvvNumber) {
		depositPage.sendCashierCVVNumber(cvvNumber);

	}

	// Input the value amount to deposit in the Enter amount text box.
	@When("^I enter Amount To Deposit as \"([^\"]*)\"$")
	public void i_enter_Amount_To_Deposit_as(String amount) {
		depositPage.sendCashierEnterAmountInputField(amount);
	}

	// click on deposit Button within the Safe Charge Cashier
	@When("^I click a SafeChargeDepositbutton$")
	public void i_click_a_SafeChargeDepositbutton() {
		depositPage.clickCashierDepositButton();

	}

	// clicking on the Close button within the Success deposit approved deposit
	// pop-up box
	@When("^I click on CloseButton within the Success Cashier Pop-up box$")
	public void i_click_on_CloseButton_within_the_Success_Cashier_Pop_up_box() {
		depositPage.clickSuccessCloseApprovedButton();
	}

	// clicking on the decline close Icon
	@When("^I click on decline close icon$")
	public void i_click_on_decline_close_icon() {
		depositPage.clickDeclinedCloseIcon();

	}

	// Clicking on the other payment method to register a new card
	@When("^I click on Other Payment Methods Card Logo$")
	public void i_click_on_Other_Payment_Methods_Card_Logo() {
		depositPage.clickRegisterNewCreditCard();

	}

	// clicking on the Change Billing address check box
	@When("^I click on Change Billing Address Check Box$")
	public void i_click_on_Change_Billing_Address_Check_Box() {
		depositPage.clickCashierChangeBillAddresCheckBox();
	}

	// enter a post code address
	@When("^I enter Post code as \"([^\"]*)\"$")
	public void i_enter_Post_code_as(String postcode) {
		depositPage.sendCashierChangeBillingAddressPostCodeInput(postcode);
	}

	// Enter a new house addresss
	@When("^I enter House address as \"([^\"]*)\"$")
	public void i_enter_House_address_as(String AddressNum) {
		depositPage.sendCashierChangeBillingAddressNumberInput(AddressNum);

	}

	// Click on the Close Icon of th Cashier frame pop-up box
	@When("^I click on close Icon of the Cashier$")
	public void i_click_on_close_Icon_of_the_Cashier() {
		depositPage.clickChashierCloseIcon();

	}

	// Click on Deposit Limit link on the Registration Page
	@When("^I click on deposit limit click here link$")
	public void i_click_on_deposit_limit_click_here_link() {
		registerPage.clickDepositLimit();
	}

	/*
	 * @param{string} Type- it either daily, weekly or Monthly limit user wish
	 * to set
	 **/
	@When("^I enter Choose Type as \"([^\"]*)\"$")
	public void i_enter_Choose_Type_as(String Type) {
		registerPage.sendChooseType(Type);

	}

	// Select amount limit from the drop down menu on Registration page
	@When("^I enter Choose limit as \"([^\"]*)\"$")
	public void i_enter_Choose_limit_as(String Limit) {
		registerPage.sendChooseLimitWeekly(Limit);
	}

	// Enter amount on the the Other amount text box on Deposit limit
	// Registration Form
	@When("^I enter Other Amount as \"([^\"]*)\"$")
	public void i_enter_Other_Amount_as(String Other) {
		registerPage.sendChooseLimitOther(Other);

	}

	// Clicking on the Deposit limit close link on Registration Page
	@When("^I click on deposit limit close link$")
	public void i_click_on_deposit_limit_close_link() {

	}

	// Mouse move to the Account menu Drop down
	@When("^I click on Account Menu dropDown box$")
	public void i_click_on_Account_Menu_dropDown_box() {
		basePage.moveAccountMenu();

	}

	// Click on the Change Password link within the Account Menu drop down
	@When("^I click on ChangePassword link$")
	public void i_click_on_ChangePassword_link() {
		basePage.clickChangePasswordLink();

	}

	// I enter cold password in to the Old password text box on Change Password
	// page
	@When("^I enter Old Password as \"([^\"]*)\"$")
	public void i_enter_Old_Password_as(String oldpassword) {
		changepasswordPage.sendChangePasswordOld(oldpassword);

	}

	// I enter New password in to the New password text box on Change Password
	// page
	@When("^I enter New Password as \"([^\"]*)\"$")
	public void i_enter_New_Password_as(String newpassword) {
		changepasswordPage.sendChangePasswordNewPassWord(newpassword);

	}

	// I enter confirm password in to the Confirm password text box on Change
	// Password page
	@When("^I enter Confirm Password as \"([^\"]*)\"$")
	public void i_enter_Confirm_Password_as(String ConfPassword) throws InterruptedException {
		changepasswordPage.sendChangePasswordConfirmPassWord(ConfPassword);

	}

	// Click on Submit button on Change Password page
	@When("^I click on ChangePasswordSubmit Button$")
	public void i_click_on_ChangePasswordSubmit_Button() {
		changepasswordPage.clickChangePasswordSubmitButton();

	}

	// Clicking on Roulette Express Premium Game
	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String arg1) throws InterruptedException {
		homePage.clickRouletteGames();
	}

	// Click on Vegas vertical Tab
	@When("^I click on Vegas Tab$")
	public void i_click_on_Vegas_Tab() {
		basePage.clickVegasTab();

	}

	// Click on the Getting Started link within the footer
	@When("^I click on Getting Started Link within the footer$")
	public void i_click_on_Getting_Started_Link_within_the_footer() {
		footerPage.clickGettingStartedLink();

	}

	// Click on the TV Presnter link within the footer
	@When("^I click on TVPresenters link within the footer$")
	public void i_click_on_TVPresenters_link_within_the_footer() {
		footerPage.clickTVPresentLink();

	}

	// Click on the Video link within the footer on the Home page
	@When("^I click on Videos link within the footer$")
	public void i_click_on_Videos_link_within_the_footer() {
		footerPage.clickVideo();
	}

	// Click on Vip Link to navigate to Vip Page
	@When("^I click on VIP link within the footer$")
	public void i_click_on_VIP_link_within_the_footer() {
		footerPage.clickVIPLink();

	}

	// click on Winner link to navigate to winners page
	@When("^I click on Winners link within the footer$")
	public void i_click_on_Winners_link_within_the_footer() {
		footerPage.clickWinnerLink();

	}

	// Click on AboutUs link within the footer to About us page
	@When("^I click on AboutUs link within the footer$")
	public void i_click_on_AboutUs_link_within_the_footer() {
		footerPage.clickAboutUs();

	}

	// CLICKING ON ContactUs link on the casino tab footer
	@When("^I click on Contactus link within the footer$")
	public void i_click_on_Contactus_link_within_the_footer() {
		footerPage.clickContactUsLink();

	}

	// Clicking on the Help and FAQS link
	@When("^I click on Help&FAQS link within the footer$")
	public void i_click_on_Help_FAQS_link_within_the_footer() {
		footerPage.clickFAQSLink();

	}

	// Click on ForgottenYur Password link within the Contact us Page
	@When("^I click on ForgottenPassword link within Contact us page$")
	public void i_click_on_ForgottenPassword_link_within_Contact_us_page() {
		contactPage.clickContactUsForgottenDetailsLink();
	}

	// Click on Privacy Policy link within the footer on casino vertical tab
	@When("^I click on PrivacyPolicy link within the footer$")
	public void i_click_on_PrivacyPolicy_link_within_the_footer() {
		footerPage.clickPrivacyPolicylink();

	}

	@When("^I click on Responsible Gambling link within the footer$")
	public void i_click_on_Responsible_Gambling_link_within_the_footer() {
		footerPage.clickResponsibleGamblingLink();
	}

	@When("^I click on Terms link within the footer$")
	public void i_click_on_Terms_link_within_the_footer() {
		footerPage.clickTermLink();
	}

	@When("^I click on Withdrawal link$")
	public void i_click_on_Withdrawal_link() {
		basePage.clickWithdrawLink();
	}

	// withdrawl tab link within the Cashier
	@When("^I click on withdrawal tab link$")
	public void i_click_on_withdrawal_tab_link() {
		withdrawPage.clickWithdrwalTablink();

	}

	// Enter an amount in the Amount withdraw text box
	@When("^I enter withdraw amount as \"([^\"]*)\"$")
	public void i_enter_withdraw_amount_as(String AmountWithdraw) {
		withdrawPage.sendAmoutToWithdraw(AmountWithdraw);

	}

	// click on withdrawal button
	@When("^I click Withdrawal Button$")
	public void i_click_Withdrawal_Button() {
		withdrawPage.clickWithDrawalButton();

	}

	@When("^I click success pop-up box Ok Button$")
	public void i_click_success_pop_up_box_Ok_Button() {
		withdrawPage.clickWithDrawConirmSuccessOKButton();

	}

	@When("^I click on Pending withdrwal Cancel Button$")
	public void i_click_on_Pending_withdrwal_Cancel_Button() throws InterruptedException {
		withdrawPage.clickPendingWithdrawalCancellButton();

	}

	// Click On No Button of Confirmation Withdraw Pop-up box
	@When("^I click on No Button on Pending Confirmation box$")
	public void i_click_on_No_Button_on_Pending_Confirmation_box() {
		withdrawPage.clickNoConfirmationWithdrawPendingButton();
	}

	// Click on Yes Button On Confirmation withdraw pending Pop-up Box
	@When("^I click on Yes Button on Pending Confirmation box$")
	public void i_click_on_Yes_Button_on_Pending_Confirmation_box() {
		withdrawPage.clickYesConfirmationWithdrawPendingButton();

	}

	// click on OK button on Confirmation withdraw pop-up box
	@When("^I click on OK button on Confirmation success Pending Cancellation Pop up Box$")
	public void i_click_on_OK_button_on_Confirmation_success_Pending_Cancellation_Pop_up_Box() {
		withdrawPage.clickOKConfirmationWithdrawPendingSuccessButton();
	}

	@When("^I check My account Balance$")
	public void i_check_My_account_Balance() {
		depositPage.getCashierBalancePresent();
	}

	// Click on Deposit button on the Welcome Page.
	@When("^I click on deposit Button on Welcome page$")
	public void i_click_on_deposit_Button_on_Welcome_page() {
		welcomePage.clickDepositWelcomeButton();

	}

	// click on OK button on withdraw transaction failed pop-up box
	@When("^I click Transaction Failed Ok Button$")
	public void i_click_Transaction_Failed_Ok_Button() {
		withdrawPage.clickWithdrawTransactionFailedOKButton();

	}

	// Click on cashier deposit tab link within the safecharge
	@When("^I click on Deposit tab link$")
	public void i_click_on_Deposit_tab_link() {
		depositPage.clickCashierDepositTablink();

	}

	// Click on a game on Vegas home game
	@When("^I click one Virtue Fusion Game$")
	public void i_click_one_Virtue_Fusion_Game() {
		vegasPage.clickVegasGamesLaunch();

	}

	// click on a Live vertical tab link
	@When("^I click on Live Tab$")
	public void i_click_on_Live_Tab() throws InterruptedException {
		basePage.clickLiveTab();
	}

	// click on a live Game on live Home page
	@When("^I click one Live Game$")
	public void i_click_one_Live_Game() throws InterruptedException {
		livePage.clickLiveGame();

	}

	// Click on Promotion Vertical tab link
	@When("^I click on Promotion tab link$")
	public void i_click_on_Promotion_tab_link() {
		basePage.clickPromotionsTab();

	}

	// Click on each More Info Button on Promotion Banner Page
	@When("^I click on each More Info Banner button$")
	public void i_click_on_each_More_Info_Banner_button() throws InterruptedException {
		promotionPage.clickEachPromoMoreInfoButton();

	}

	// Click on Join Now Button on a Promotion Banner
	@When("^I click on each Join To Play Banner button$")
	public void i_click_on_each_Join_To_Play_Banner_button() {
		promotionPage.clickPromoJoinToPlayButton();

	}

	// Click on Game info icon on Roulette express Premium
	@When("^I click on Roulette Express Premium Game Info icon$")
	public void i_click_on_Roulette_Express_Premium_Game_Info_icon() {
		homePage.clickRouletteGameGameInfoButton();

	}

	// Click on Play for real button on Roulette Express Premium game info page
	@When("^I click on Play For Real on Roulette Express Premium$")
	public void i_click_on_Play_For_Real_on_Roulette_Express_Premium() {
		gameInfoPage.clickGameInfoGamePlayForRealButton();

	}

	// Click on Play for Fun button on Roulette Express Premium game info page
	@When("^I click on Play For Fun on Roulette Express Premium$")
	public void i_click_on_Play_For_Fun_on_Roulette_Express_Premium() {
		gameInfoPage.clickGameInfoGamePlayForFunButton();

	}

	// Click on Game info icon on Playtech Game
	@When("^I click on Playtech casino slot Game Info icon$")
	public void i_click_on_Playtech_casino_slot_Game_Info_icon() {
		homePage.clickPlaytechGameInfoButton();

	}

	// Click on Play for Real button on Playtech game info page
	@When("^I click on Play For Real on this Playtech game GameInfo page$")
	public void i_click_on_Play_For_Real_on_this_Playtech_game_GameInfo_page() {
		gameInfoPage.clickGameInfoGamePlayForRealButton();

	}

	// Click on Play for Fun button on Playtech game info page
	@When("^I click on Play For Fun on this Playtech game GameInfo page$")
	public void i_click_on_Play_For_Fun_on_this_Playtech_game_GameInfo_page() {
		gameInfoPage.clickGameInfoGamePlayForFunButton();

	}

	/* Click on the Search Icon on the Home page */
	@When("^I click enter$")
	public void i_click_enter() {
		homePage.enterSearchGames();

	}

	// Click on Play for Fun button on Playtech game info page
	@When("^I click on Playtech Virtue Fusion  slot Game Info icon$")
	public void i_click_on_Playtech_Virtue_Fusion_slot_Game_Info_icon() {
		homePage.clickPlaytechGameInfoButton();

	}

	/*
	 * @param{string} gameSearchType- it is the Game user want to search for to
	 * set
	 **/
	@When("^I enter game saerch as \"([^\"]*)\"$")
	public void i_enter_game_saerch_as(String gameSearchType) {
		homePage.sendSearchGames(gameSearchType);

	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This Are only for @Then Methods */
	////////////////////////////////////////////////////////////////////////////////////////////////////////

	// Verify if Error Login Pop-up box will be displayed when login with
	// Invalid Data
	@Then("^I should see Login errorMesssage Pop-up box$")
	public void i_should_see_Login_errorMesssage_Pop_up_box() {
		// Assert.assertTrue(!basePage.isDepositButtonPresent());

	}

	/*
	 * Verifying if username displayed is the same as the username entered to
	 * login
	 * 
	 * @param {string} username- this is the Name displayed on the user's
	 * account loggin page
	 **/
	@Then("^I should see username as \"([^\"]*)\" present$")
	public void i_should_see_username_as_present(String username) {
		Assert.assertEquals(username, homePage.getUserName());
	}

	/**
	 * Verifying if Account Balance is displayed after login
	 */
	@Then("^I should see AccountBlance present$")
	public void i_should_see_AccountBlance_present() {

	}

	/*
	 * Verifying if Deposit button is displayed after login
	 **/
	@Then("^I should see Depositbutton present$")
	public void i_should_see_Depositbutton_present() {
		Assert.assertTrue(basePage.isDepositButtonPresent());
	}

	/*
	 * verifying if Account Menu is displayed when user have logged in
	 **/
	@Then("^I should see AccountMenu$")
	public void i_should_see_AccountMenu_() {

	}

	/*
	 * Verifying if the URL address of the register page is the same as
	 * expected.
	 **/
	@Then("^I should navigate to Registration page$")
	public void i_should_navigate_to_Registration_page() {
		Assert.assertEquals("is the Url address the same", this.basePage.getCurrentUrl(), driver.getCurrentUrl());

	}

	/* Verify that Register text is displayed on the Registration page */
	@Then("^I should see Register on the Register form$")
	public void i_should_see_Register_on_the_Register_form() {

	}

	/*
	 * Verify that Email input Dropdown box is displayed on the Registration
	 * page
	 */
	@Then("^I should Email Input box displayed on Registration page$")
	public void i_should_Email_Input_box_displayed_on_Registration_page() {
		Assert.assertTrue(registerPage.isRegisterEmailInputBoxPresent());

	}

	/* Verify that Password input box is displayed on the Registration page */
	@Then("^I should see Password Input box displayed on Registration page$")
	public void i_should_see_Password_Input_box_displayed_on_Registration_page() {
		Assert.assertTrue(registerPage.isRegisterPasswordInputBoxPresent());

	}

	/* Verify that Username input box is displayed on the Registration page */
	@Then("^I should see Useranme Input box displayed on Registration Page$")
	public void i_should_see_Useranme_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterUserNameInputBoxPresent());

	}

	/* Verify that ScreenName input box is displayed on the Registration page */
	@Then("^I should see ScreenName Input box displayed on Registration Page$")
	public void i_should_see_ScreenName_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterScreenNameInputBoxPresent());

	}

	/* Verify that FirstNmae input box is displayed on the Registration page */
	@Then("^I should see FirstName Input box displayed on Registration Page$")
	public void i_should_see_FirstName_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterFirstNameInputBoxPresent());

	}

	/* Verify that Surname Input box is displayed on the Registration page */
	@Then("^I should see Surname Input box displayed on Registration Page$")
	public void i_should_see_Surname_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterSurNameInputBoxPresent());

	}

	/*
	 * Verify that Date of birth Year Dropdown box is displayed on the
	 * Registration page
	 */
	@Then("^I should see Date of Birth Day Dropdown box displayed on Registration Page$")
	public void i_should_see_Date_of_Birth_Day_Dropdown_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterDOBDayDropdownBoxPresent());

	}

	/*
	 * Verify that Date of birth Month Dropdown box is displayed on the
	 * Registration page
	 */
	@Then("^I should see Date of Birth Month Dropdown box displayed on Registration Page$")
	public void i_should_see_Date_of_Birth_Month_Dropdown_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterDOBMonthDropdownBoxPresent());

	}

	/*
	 * Verify that Date of Birth Year Dropdown box is displayed on the
	 * Registration page
	 */
	@Then("^I should see Date of Birth Year Dropdown box displayed on Registration Page$")
	public void i_should_see_Date_of_Birth_Year_Dropdown_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterDOBYearhDropdownBoxPresent());

	}

	/* Verify that Gender Radio buttons is displayed on the Registration page */
	@Then("^I should see Gender Radio Buttons displayed on Registration Page$")
	public void i_should_see_Gender_Radio_Buttons_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterGenderTypeMaleRadioButtonPresent());

	}

	/* Verify that Country Dropdown box is displayed on the Registration page */
	@Then("^I should see Country Input box displayed on Registration Page$")
	public void i_should_see_Country_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterCountryInputBoxPresent());

	}

	/* Verify that Currency input box is displayed on the Registration page */
	@Then("^I should see Currency Input box displayed on Registration Page$")
	public void i_should_see_Currency_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterCunrrencyDropdownBoxPresent());

	}

	/*
	 * Verify that House Number Input box is displayed on the Registration page
	 */
	@Then("^I should see House Number Input box displayed on Registration Page$")
	public void i_should_see_House_Number_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterHouseNumberInputBoxPresent());

	}
	
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Invalid Error Message displayed by the Email input box on Registration Page$")
	public void i_should_see_Invalid_Error_Message_displayed_by_the_Email_input_box_on_Registration_Page()  {
		Assert.assertTrue(registerPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Password input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Password_input_box_on_Registration_Page()  {
		Assert.assertTrue(registerPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the UserName input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_UserName_input_box_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the OnScreenName input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_OnScreenName_input_box_on_Registration_Page()  {
		Assert.assertTrue(registerPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the FirstName input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_FirstName_input_box_on_Registration_Page(){
		Assert.assertTrue(registerPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the SurName input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_SurName_input_box_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Address input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Address_input_box_on_Registration_Page()  {
		Assert.assertTrue(registerPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Postcode input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Postcode_input_box_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Town input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Town_input_box_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the County input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_County_input_box_on_Registration_Page() {
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Contact Number input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Contact_Number_input_box_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Deposit linit Amount input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Deposit_linit_Amount_input_box_on_Registration_Page()  {
		Assert.assertTrue(registerPage.isRegInvalidDataErrorMessagePresent());
	    
	}


	// Verify if Error Message will be displayed on Register form with Invalid
	// Data
	@Then("^I should see Error Messsage displayed on Register Page$")
	public void i_should_see_Error_Messsage_displayed_on_Register_Page() {
		Assert.assertTrue(registerPage.isRegErrorMessagePresent());

	}

	/*
	 * Verify that Find Address Green Button is displayed on the Registration
	 * page
	 */
	@Then("^I should see Find Address button displayed on Registration Page$")
	public void i_should_see_Find_Address_button_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterFindAddressButtonPresent());

	}

	/* Verify that Country Input box is displayed on the Registration page */
	@Then("^I should see Country Code dropdown box displayed on Registration Page$")
	public void i_should_see_Country_Code_dropdown_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterPostCodeInputBoxPresent());

	}

	/* Verify that Contact Input box is displayed on the Registration page */
	@Then("^I should see Contact Number Input box displayed on Registration Page$")
	public void i_should_see_Contact_Number_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterContactNumberInputBoxPresent());

	}

	/*
	 * Verify that Deposit Limit Type Dropdown box is displayed on the
	 * Registration page
	 */
	@Then("^I should see Deposit Limit Type Input box displayed on Registration Page$")
	public void i_should_see_Deposit_Limit_Type_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isDepositLimitChooseTypePresent());
	}

	/*
	 * Verify that Deposit Limit Dropdown box is displayed on the Registration
	 * page
	 */
	@Then("^I should see Deposit Limit Amount Dropdown box displayed on Registration Page$")
	public void i_should_see_Deposit_Limit_Amount_Dropdown_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isDepositLimitChooseLimitPresent());
	}

	/* Verify that Free Bonus Check box is displayed on the Registration page */
	@Then("^I should see Free Bonuses and Offer Check box checked displayed on Registration Page$")
	public void i_should_see_Free_Bonuses_and_Offer_Check_box_checked_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterFreeBonusessCheckedBoxPresent());
	}

	/* Verify that Over 18+ Check box is displayed on the Registration page */
	@Then("^I should see OverEighteenPlus Check box displayed on Registration Page$")
	public void i_should_see_OverEighteenPlus_Check_box_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterOverEightennPlusCheckBoxPresent());
	}

	/*
	 * Verify if Terms link is displayed within the Over 18+ content messagae on
	 * Register form
	 */
	@Then("^I should see terms link within OverEighteenPlus Content displayed on Registration Page$")
	public void i_should_see_terms_link_within_OverEighteenPlus_Content_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterOverEighteenTermsPresent());
	}

	/*
	 * Verify if Privacy policy link is displayed within the Over 18+ content
	 * messagae on Register form
	 */
	@Then("^I should see Privacy Policy link within OverEighteenPlus Content displayed on Registration Page$")
	public void i_should_see_Privacy_Policy_link_within_OverEighteenPlus_Content_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterOverEighteenPrivacyPolicyBoxPresent());
	}

	/*
	 * Verify if Register Now Button is displayed below the Register form on
	 * Registration page
	 */
	@Then("^I should see Register Now Button displayed on Registration Page$")
	public void i_should_see_Register_Now_Button_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterRegisterNowButtonPresent());
	}

	/*
	 * Verify if Compliance text is displayed below the Register Now Button on
	 * Registration page
	 */
	@Then("^I should see Compliance Text displayed below Register Now button on Registration Page$")
	public void i_should_see_Compliance_Text_displayed_below_Register_Now_button_on_Registration_Page() {
		Assert.assertTrue(registerPage.isComplianceTextPresent());
	}

	/*
	 * Verify if Welcome to Supercasion text is displayed as a title on
	 * Registration page
	 */
	@Then("^I should see Welcome To SuperCasino Text displayed on Registration Page$")
	public void i_should_see_Welcome_To_SuperCasino_Text_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterWelcomeToSuperCasinoTextPresent());
	}

	/* Verify if Jackpot Slider Block is displayed on Registration Page */
	@Then("^I should see JackpotSlider Block displayed on Registration Page$")
	public void i_should_see_JackpotSlider_Block_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterJackpotSliderBlockPresent());
	}

	/* Verify if Promotion Banner is Displayed on Registratiopn Page */
	@Then("^I should see Promotion Banner displayed on Registration Page$")
	public void i_should_see_Promotion_Banner_displayed_on_Registration_Page() {
		Assert.assertTrue(registerPage.isRegisterPoromotionBannerPresent());
	}

	/*
	 * Verify if Help Icon is displayed at the top of the Registration page next
	 * before choat icon
	 */
	@Then("^I should see Help icon display at the Top of Registration page$")
	public void i_should_see_Help_icon_display_at_the_Top_of_Registration_page() {
		Assert.assertTrue(registerPage.isRegisterHelpIconPresent());
	}

	/* Verify if Chat Icon is displayed at the top of Registration Page */
	@Then("^I should see Chat Icon displayed next to Help icon on Registration page$")
	public void i_should_see_Chat_Icon_displayed_next_to_Help_icon_on_Registration_page() {
		Assert.assertTrue(registerPage.isRegisterChatIconPresent());

	}

	/*
	 * Verifying if user able to register successfully
	 * 
	 * @param {string} expected Result- this id the Welcome title page
	 */
	@Then("^I should navigate \"([^\"]*)\" to welcome page\\.$")
	public void i_should_navigate_to_welcome_page(String expectedResult) {
		Assert.assertTrue(welcomePage.getWelComePageTilte());

	}

	// Verifying if user navigated to forgotten page
	@Then("^I should navigate to Forgotten Details page$")
	public void i_should_navigate_to_Forgotten_Details_page() {
		Assert.assertTrue(forgottenDetailsPage.isTitlePresent());

	}

	// Verify if Error Message will be displayed when Invalid data are provided
	@Then("^I should see an error Messeage on Forgotten Details Page$")
	public void i_should_see_an_error_Messeage_on_Forgotten_Details_Page() {
		Assert.assertTrue(forgottenDetailsPage.isErrorMessageTextPresent());
	}

	@Then("^I should reset my password$")
	public void i_should_reset_my_password() {
		Assert.assertTrue(forgottenDetailsPage.YourPasswordSuccessfyllyChange());
	}

	// Verying if Safe charge Logo is presented
	@Then("^I should see new cashier$")
	public void i_should_see_new_cashier() {
		Assert.assertTrue(depositPage.isCashierSafeChargeLogoPresent());
	}

	// verying if username is the same as the name displayed within the cashier
	@Then("^I should see  UsernameInfo as \"([^\"]*)\"$")
	public void i_should_see_UsernameInfo_as(String username) throws Throwable {
		String NameDisplayed = depositPage.getCashierUsername();
		System.out.println(username);
		Assert.assertEquals(username, NameDisplayed);

	}

	// Verying if My Account Tab link is displayed within the Cashier pop-up box
	@Then("^I should see  My Account Tab in the cashier pop-up$")
	public void i_should_see_My_Account_Tab_in_the_cashier_pop_up() {
		Assert.assertTrue(depositPage.isCashierMyAccountTabPresent());

	}

	// Verying if Deposit Link Tab is displayed within the Cashier pop-up
	@Then("^I should see Deposit Tab in the cashier pop-up$")
	public void i_should_see_Deposit_Tab_in_the_cashier_pop_up() {
		Assert.assertTrue(depositPage.isCashierDepositTabPresent());

	}

	// Verifying if withdraw link tab is displayed within the Cashier pop-up
	@Then("^I should see Withdraw Tab in the casheir pop-up$")
	public void i_should_see_Withdraw_Tab_in_the_casheir_pop_up() {
		Assert.assertTrue(depositPage.isCashierWithdrawTabPresent());

	}

	// Verifying that Balance value is displayed within the pop-up box cashier
	@Then("^I should see Balance value in the cashier pop-up$")
	public void i_should_see_Balance_value_in_the_cashier_pop_up() {

	}

	// Verifying that Payment method Text in the cashier
	@Then("^I should see  My Payments Methods text in the cashier pop$")
	public void i_should_see_My_Payments_Methods_text_in_the_cashier_pop() {
		Assert.assertTrue(depositPage.isCashierMyPaymentMethodTextPresent());

	}

	// Verifying that Payment details text is displayed within the scashier
	// pop-up box
	@Then("^I should see  Payment Details text in the cashier pop-up$")
	public void i_should_see_Payment_Details_text_in_the_cashier_pop_up() {
		Assert.assertTrue(depositPage.isCashierMyPaymentLogoPresent());
	}

	// Verifying if Payment logo is present for user that has registerd hie car
	@Then("^I should see payment logo in the cashier pop-up$")
	public void i_should_see_payment_logo_in_the_cashier_pop_up() {

	}

	// verifying if other payment logo is displayed within the Cashier pop-up
	// box
	@Then("^I should see other Payment Methods logo in the cashier pop-up$")
	public void i_should_see_other_Payment_Methods_logo_in_the_cashier_pop_up() {
		Assert.assertTrue(depositPage.isCashierOtherPaymentMethodLogo());

	}

	// verifying if card owner name is displayed within the cashier pop-up box
	@Then("^I should see account creditcard ownername in the cashier pop-up$")
	public void i_should_see_account_creditcard_ownername_in_the_cashier_pop_up() {
		Assert.assertTrue(depositPage.isCashierCreditNameOwnerPresent());

	}

	// verifying if the last four card number is diplayed within the Cashier
	// pop-up box
	@Then("^I should see last(\\d+) digit card numbers as \"([^\"]*)\"$")
	public void i_should_see_last_digit_card_numbers_as(int arg1, String arg2) {
		Assert.assertTrue(depositPage.isCashierLastFourDigitCardNumberPresent());
	}

	// veriying if card expirary date is displayed within the cashier pop-up box
	@Then("^I should see card expiry date in the cashier pop-up$")
	public void i_should_see_card_expiry_date_in_the_cashier_pop_up() {
		Assert.assertTrue(depositPage.isCashierCreditCardExpiaryDatePresent());
	}

	// Verifying if CVV input field is displayed within the Cashier Pop-up box
	@Then("^I should see CVV input field in the cashier pop-up$")
	public void i_should_see_CVV_input_field_in_the_cashier_pop_up() {
		Assert.assertTrue(depositPage.isCashierCVVInputfieldPresent());

	}

	// Verifying if Poromotion code input box field is displayed
	@Then("^I should see Promocode input text in the cashier pop-up$")
	public void i_should_see_Promocode_input_text_in_the_cashier_pop_up() {
		Assert.assertTrue(depositPage.isCashierPromocodeInputFieldPresent());
	}

	// Verifying if Change Billing Address Check box is diplayed with in the
	// cashier pop-up box
	@Then("^I should see Bill Address check box in the cashier pop-up$")
	public void i_should_see_Bill_Address_check_box_in_the_cashier_pop_up() {
		Assert.assertTrue(depositPage.isCashierChangeBillingAddCheckboxPresent());
	}

	@Then("^I should Amount To deposit in the cashier pop-up$")
	public void i_should_Amount_To_deposit_in_the_cashier_pop_up() {

	}

	// verifying if the Enter your amount input field is displayed within the
	// cashier
	@Then("^I should see other amount input field in the cashier pop-up$")
	public void i_should_see_other_amount_input_field_in_the_cashier_pop_up() {
		Assert.assertTrue(depositPage.isCashierOtherAmountInputfieldPresent());

	}

	// Verifying if Deposit Button is displayed within the Cashier pop-up box.
	@Then("^I should see Deposit deposit button in the cashier pop-up$")
	public void i_should_see_Deposit_deposit_button_in_the_cashier_pop_up() {
		Assert.assertTrue(depositPage.isCashierDepositButtonPresent());
	}

	// Verifying if Card input error messsage will be displayed when invalid
	// card and Incomplete numbers a used
	@Then("^I should see InaValidCardErrorMessage displayed$")
	public void i_should_see_InaValidCardErrorMessage_displayed() {
		Assert.assertTrue(depositPage.isErrorCardInputTextPresent());

	}

	// Verifying if Card input error messsage will be displayed when invalid
	// card and Incomplete numbers a used
	@Then("^I should see In Valid Expeiratin ErrorMessage displayed$")
	public void i_should_see_In_Valid_Expeiratin_ErrorMessage_displayed() {
		Assert.assertTrue(depositPage.isInvalidExpDateError());

	}

	// Verifying if CVV error message is displayed
	@Then("^I should see The field must be exactly (\\d+) digits ErrorMessage Text displayed$")
	public void i_should_see_The_field_must_be_exactly_digits_ErrorMessage_Text_displayed(int arg1) {
		Assert.assertTrue(depositPage.isCardCVVNumberErrorMessagePresent());

	}

	// Checking if user can make a deposit less than required.
	@Then("^I should  Please Enter Valid ammount errorText displayed$")
	public void i_should_Please_Enter_Valid_ammount_errorText_displayed() {
		Assert.assertTrue(depositPage.isEnterAmountToDepositErrorMessagePresent());

	}

	// Checking if Green tick mark is displayed when user input name is correct
	@Then("^I should see Green tick mark next to CardOwnerNametext box$")
	public void i_should_see_Green_tick_mark_next_to_CardOwnerNametext_box() {
		Assert.assertTrue(depositPage.isGreenTickCardNumberPresent());
	}

	// Check if Green tick mark is displayed when user correct card number
	@Then("^I should see Green tick mark next to CardNumberbox box$")
	public void i_should_see_Green_tick_mark_next_to_CardNumberbox_box() {
		Assert.assertTrue(depositPage.isGreenTickCardNumberPresent());

	}

	// Check if Green tick Mark is displayed when user input Correct CVV Number
	@Then("^I should see Green tick mark next to CardCVVtext box$")
	public void i_should_see_Green_tick_mark_next_to_CardCVVtext_box() {
		Assert.assertTrue(depositPage.isGreenTickCardCVVNumberPresent());
	}

	// Checking IF green tick will be displayed when user input required amount.
	@Then("^I should see a Green tick Mark next to EnterAmounttext box$")
	public void i_should_see_a_Green_tick_Mark_next_to_EnterAmounttext_box() {
		Assert.assertTrue(depositPage.isGreenTickEnterAmountPresent());

	}

	// verifying if Success test is displayed within the Apporovedd Deposit
	// pop-up box
	@Then("^I should see Deposit Success Cashier Pop-up box displayed$")
	public void i_should_see_Deposit_Success_Cashier_Pop_up_box_displayed() {
		Assert.assertTrue(depositPage.isApprovedDepositHeaderPopBoxPresent());
	}

	// Verifying if your Trancastion was approved Text is displayed within the
	// Approved Deposit pop-up box
	@Then("^I should see Your transaction was approved Text displayed$")
	public void i_should_see_Your_transaction_was_approved_Text_displayed() {
		Assert.assertTrue(depositPage.isApporvedDepositTextPresent());
	}

	// Verifying if the Close button is displayed within the Pop-up box for
	// deposit approved
	@Then("^I should see CloseButton within the Success Cashier Pop-up box displayed$")
	public void i_should_see_CloseButton_within_the_Success_Cashier_Pop_up_box_displayed() {
		Assert.assertTrue(depositPage.isApprovedDepositCloseButtonPopUpBoxPresent());
	}
	/*
	 * @Then("^I should see my new Account Balance increase by (\\d+)\\.(\\d+)$"
	 * ) public void i_should_see_my_new_Account_Balance_increase_by(int
	 * AmountFigure,int arg2) { float NewBalance =
	 * depositPage.getCurrentBalance() + AmountFigure;
	 * System.out.print(AmountFigure); Assert.assertTrue(NewBalance -
	 * depositPage.getCashierBalancePresent() == AmountFigure); }
	 */

	// Checking if previous balance plus new Bet value will equal New Balance
	// displayed

	@Then("^I should see my new Account Balance increase by \"([^\"]*)\"$")
	public void i_should_see_my_new_Account_Balance_increase_by(String amount) {
		// String Amountfigure = amount.replace(",", "").replace("£", "");
		double AmountDeposit = Double.parseDouble(amount);
		double Prev = depositPage.getCashierBalancePresent() + AmountDeposit;
		System.out.println(Prev);
		System.out.println(AmountDeposit);
		System.out.println(depositPage.getCurrentBalance());
		// Assert.assertTrue(AmountDeposit==(depositPage.getCurrentBalance()-Prev));
		// Assert.assertTrue(Prev - (depositPage.getCurrentBalance()) ==
		// AmountDeposit);

	}

	// Deposit Limit pop-up box for new user first deposit
	@Then("^I should see deposit limit pop-up box$")
	public void i_should_see_deposit_limit_pop_up_box() {

	}

	// Verifying that Success Cashier pop-up box is closed when the Close button
	// within it is clicked
	@Then("^I should see no Deposit Success Cashier Pop-up box displayed\\.$")
	public void i_should_see_no_Deposit_Success_Cashier_Pop_up_box_displayed() {
		Assert.assertTrue(depositPage.isCashierDepositButtonPresent());
	}

	@Then("^I should see Decline Pop-up box displayed$")
	public void i_should_see_Decline_Pop_up_box_displayed() {
		Assert.assertTrue(depositPage.isDeclinedDepositHeaderPopUpBoxPresent());

	}

	// Checking if correct declined texts is displayed.
	@Then("^I should see Your Transaction decline text displayed$")
	public void i_should_see_Your_Transaction_decline_text_displayed() {
		Assert.assertTrue(depositPage.isYourTransactionHasBeenDeclineTextPresent());
	}

	// Checking if Contact Support Number is displayed within the declined
	// pop-up box
	@Then("^I should see Contact Support Number displayed$")
	public void i_should_see_Contact_Support_Number_displayed() {
		Assert.assertTrue(depositPage.isDeclinedDepositContactSurpotNumberPresent());
	}

	// Check if pop-up is display after closing the close icon on the declined
	// pop-up box
	@Then("^I should see a close icon displayed$")
	public void i_should_see_a_close_icon_displayed() {
		Assert.assertTrue(depositPage.isDeclinedDepositCloseIconPresent());
	}

	@Then("^I should see no decline pop-up box$")
	public void i_should_see_no_decline_pop_up_box() {
		Assert.assertFalse(depositPage.isDeclinedDepositCloseIconPresent());
	}

	// Verifying if new Post Code Address Change is saved within the cashier
	@Then("^I should  see new Post code as \"([^\"]*)\" displayed$")
	public void i_should_see_new_Post_code_as_displayed(String postcode) {

	}

	// Verifying if new Home Address Change is saved within the cashier
	@Then("^I should see  House address as \"([^\"]*)\"$")
	public void i_should_see_House_address_as(String AddressNum) {
		depositPage.getNewBillingAddresss();

	}

	// Verifying if Choose Type Drop down is Displayed on Registration Page
	@Then("^I should see Choose Type dropdown box$")
	public void i_should_see_Choose_Type_dropdown_box() {
		Assert.assertTrue(registerPage.isDepositLimitChooseTypePresent());

	}

	// Verifying That Choose Limit Drop down Box is displayed
	@Then("^I should  see Choose Limit  dropdown box$")
	public void i_should_see_Choose_Limit_dropdown_box() {
		Assert.assertTrue(registerPage.isDepositLimitChooseLimitPresent());
	}

	@Then("^I should see Choose Type as \"([^\"]*)\"$")
	public void i_should_see_Choose_Type_as(String Value) {
		System.out.println(Value);
		Assert.assertTrue(registerPage.isDepositLimitDailyPresent(Value));
		Assert.assertTrue(registerPage.isDepositLimitMonthlyPresent(Value));
		Assert.assertTrue(registerPage.isDepositLimitWeeklyPresent(Value));
	}

	//
	@Then("^I should  see Choose Limit  as \"([^\"]*)\"$")
	public void i_should_see_Choose_Limit_as(String Limit) {
		System.out.println(Limit);
		Assert.assertTrue(registerPage.isDepositLimitThousandPoundsPresent(Limit));
		Assert.assertTrue(registerPage.isDepositLimitTenThousandPoundsPresent(Limit));
		Assert.assertTrue(registerPage.isDepositLimitFiftyThousandPoundsPresent(Limit));

	}

	@Then("^I should  see no Choose Limit  as \"([^\"]*)\"$")
	public void i_should_see_no_Choose_Limit_as(String arg1) {

	}

	@Then("^I should see no  Other Amount  as \"([^\"]*)\"$")
	public void i_should_see_no_Other_Amount_as(String arg1) {

	}
	
	// Verify if Title Page displayed is Change Password
	@Then("^I should See ChangePassword Title displayed$")
	public void i_should_See_ChangePassword_Title_displayed() {
		Assert.assertTrue(changepasswordPage.verifyChangePasswordTitlePageText());

	}

	// Verify if Old Password text is displayed on the Change Password page
	@Then("^I should see Old Password Text box displayed$")
	public void i_should_see_Old_Password_Text_box_displayed() {
		Assert.assertTrue(changepasswordPage.isChangePasswaordOldInputBoxPresent());

	}

	// Verify if New Password text is displayed on the Change Password page
	@Then("^I should see New Password Text box displayed$")
	public void i_should_see_New_Password_Text_box_displayed() {
		Assert.assertTrue(changepasswordPage.isNewPasswordInputBoxPresent());
	}

	// Verify if Confirm Password text is displayed on the Change Password page
	@Then("^I should see Confirm Password Text box displayed$")
	public void i_should_see_Confirm_Password_Text_box_displayed() {
		Assert.assertTrue(changepasswordPage.isConfirmPasswordInputBoxPresent());
	}

	// Verify if Submit Button is displayed on the Change Password page
	@Then("^I should see Submit Button displayed$")
	public void i_should_see_Submit_Button_displayed() {
		Assert.assertTrue(changepasswordPage.isSubmitChangePasswordButtonPresent());

	}

	// Verify if Error Message will be displayed when invalid data is provided.
	@Then("^I should see an error Messeage displayed$")
	public void i_should_see_an_error_Messeage_displayed() {
		Assert.assertTrue(changepasswordPage.isErrorTextPresent());
	}

	// Verify if Password successfully reset is displayed after Resetting
	// password
	@Then("^I should see Your Password Have successfully Rest$")
	public void i_should_see_Your_Password_Have_successfully_Rest() throws InterruptedException {
		changepasswordPage.isYourPasswordHasSuccessfullyChangeTextPresent();

	}

	// Verifying if
	@Then("^I should see a game Launching in another window$")
	public void i_should_see_a_game_Launching_in_another_window() {

	}

	// Verifying if Contact us is displayed as Tittle Page
	@Then("^I should see Contact Us displayed$")
	public void i_should_see_Contact_Us_displayed() {
		Assert.assertTrue(contactPage.isContactUsTitlePagePresent());

	}

	// Verify if Support us email link is within the Contact us page
	@Then("^I should see Customer support care link$")
	public void i_should_see_Customer_support_care_link() {
		Assert.assertTrue(contactPage.isCustomerCareLinkPresent());

	}

	// Verify if Forgotten password link is within the contact-us content page
	@Then("^I should see Forgotten Your Password link$")
	public void i_should_see_Forgotten_Your_Password_link() {
		Assert.assertTrue(contactPage.isForgotYourPasswordLinkPresent());
	}

	// Verify if Free Phone Contact numbre is displayed on the Phone
	@Then("^I should see free Phone Contact Number$")
	public void i_should_see_free_Phone_Contact_Number() {

	}

	// Verify if Uk Contact number is displayed on Contact-us Page
	@Then("^I should see Uk Contact Number$")
	public void i_should_see_Uk_Contact_Number() {
		Assert.assertTrue(contactPage.isUKContactNumberPresent());

	}

	// Verify if Getting Started Link is displayed within the footer of any page
	@Then("^I should see GettingStarted link within the footer$")
	public void i_should_see_GettingStarted_link_within_the_footer() {
		Assert.assertTrue(footerPage.isGettingStartedLinkPresent());

	}

	// Verify if TV Presenter link is displayed within the footer of any page
	@Then("^I should see TVPresenters link within the footer$")
	public void i_should_see_TVPresenters_link_within_the_footer() {
		Assert.assertTrue(footerPage.isTVPresentLinkPresent());
	}

	// Verify if the Video link is displayed within the footer on any page
	@Then("^I should see Videos link within the footer$")
	public void i_should_see_Videos_link_within_the_footer() {
		Assert.assertTrue(footerPage.isVideoLinkPresent());
	}

	// Verify if the VIP link is displayed within the footer on any page
	@Then("^I should see VIP link within the footer$")
	public void i_should_see_VIP_link_within_the_footer() {
		Assert.assertTrue(footerPage.isVIPLinkPresent());

	}

	// Verify if the Winnres link is displayed within the footer on any page
	@Then("^I should see Winners link within the footer$")
	public void i_should_see_Winners_link_within_the_footer() {
		Assert.assertTrue(footerPage.isWinnerLinkPresent());

	}

	// Verify if the Blog link is displayed within the footer on any page
	@Then("^I should see Blog link within the footer$")
	public void i_should_see_Blog_link_within_the_footer() {
		Assert.assertTrue(footerPage.isBlogLinkPresent());

	}

	// Verify if the About-us link is displayed within the footer on any page
	@Then("^I should see AboutUs link within the footer$")
	public void i_should_see_AboutUs_link_within_the_footer() {
		Assert.assertTrue(footerPage.isAboutUsLinkPresent());

	}

	// Verify if the Affiliates link is displayed within the footer on any page
	@Then("^I should see Afiliates link within the footer$")
	public void i_should_see_Afiliates_link_within_the_footer() {
		Assert.assertTrue(footerPage.isAfiliatesLinkPresent());

	}

	// Verify if the Contact Us link is displayed within the footer on any page
	@Then("^I should see ContactUs link within the footer$")
	public void i_should_see_ContactUs_link_within_the_footer() {
		Assert.assertTrue(footerPage.isContactUsLinkPresent());
	}

	// Verify if the Help$Faqs link is displayed within the footer on any page
	@Then("^I should see Help&FAQS link within the footer$")
	public void i_should_see_Help_FAQS_link_within_the_footer() {
		Assert.assertTrue(footerPage.isFAQSLinkPresent());
	}

	// Verify if the PrivacyPolicy link is displayed within the footer on any
	// page
	@Then("^I should see PrivacyPolicy link within the footer$")
	public void i_should_see_PrivacyPolicy_link_within_the_footer() {
		Assert.assertTrue(footerPage.isPrivacyPolicylinkPresent());

	}

	// Verify if the ResponsibleGamling link is displayed within the footer on
	// any page
	@Then("^I should see ResponsibleGambling link within the footer$")
	public void i_should_see_ResponsibleGambling_link_within_the_footer() {
		Assert.assertTrue(footerPage.isResponsibleGamblingLinkPresent());

	}

	// Verify if the Terms link is displayed within the footer on any page
	@Then("^I should see Terms link within the footer$")
	public void i_should_see_Terms_link_within_the_footer() {
		Assert.assertTrue(footerPage.isTermLinkPresent());

	}

	// Verify if the PayPal Icon is displayed within the footer on any page
	@Then("^I should see PayPalIcon link within the footer$")
	public void i_should_see_PayPalIcon_link_within_the_footer() {
		Assert.assertTrue(footerPage.isPayPalIconPresent());

	}

	// Verify if the Visa Icon is displayed within the footer on any page
	@Then("^I should see VisaIcon link within the footer$")
	public void i_should_see_VisaIcon_link_within_the_footer() {
		Assert.assertTrue(footerPage.isVisaIconPresent());

	}

	// Verify if the NetPlaytv Icon is displayed within the footer on any page
	@Then("^I should see NetPlayTvIcon link within the footer$")
	public void i_should_see_NetPlayTvIcon_link_within_the_footer() {
		Assert.assertTrue(footerPage.isNetPlayTvLogoPresent());

	}

	// Verify if the 18+ Icon is displayed within the footer on any page
	@Then("^I should see (\\d+)\\+Icon link within the footer$")
	public void i_should_see_Icon_link_within_the_footer(int arg1) {
		Assert.assertTrue(footerPage.is18PLUSPresent());

	}

	// Verify if the GamCare Icon is displayed within the footer on any page
	@Then("^I should see GamCareIcon link within the footer$")
	public void i_should_see_GamCareIcon_link_within_the_footer() {
		Assert.assertTrue(footerPage.isGAMCAREPresent());

	}

	// Verify if the GamBlingCommission Icon is displayed within the footer on
	// any page
	@Then("^I should see GamblingCommissionIcon link within the footer$")
	public void i_should_see_GamblingCommissionIcon_link_within_the_footer() {
		Assert.assertTrue(footerPage.isGambCommsissionPresent());

	}

	// Verify if the Compliance Texts is displayed within the footer on any page
	@Then("^I should see legalText within the footer$")
	public void i_should_see_legalText_within_the_footer() {
		Assert.assertTrue(footerPage.isComplianceTextsPresent());

	}

	// Verify if Getting Started Sub Tab is displayed on Getting Started Page.
	@Then("^I should see Getting Started sub tab$")
	public void i_should_see_Getting_Started_sub_tab() {
		Assert.assertTrue(gettingstartedPage.isGettingStratedTabPresent());

	}

	// Verify if How To Deposit Sub Tab is displayed on Getting Started Page.
	@Then("^I should see How To Deposit sub tab$")
	public void i_should_see_How_To_Deposit_sub_tab() {
		Assert.assertTrue(gettingstartedPage.isHowToDepositTabPresent());
	}

	// Verify if How To Withdraw Sub Tab is displayed on Getting Started Page.
	@Then("^I shoid see How To Withdraw sub tab$")
	public void i_shoid_see_How_To_Withdraw_sub_tab() {
		Assert.assertTrue(gettingstartedPage.isHowToWithrawTabPresent());

	}

	// Verify if Is My Deposit safe Sub Tab is displayed on Getting Started
	// Page.
	@Then("^I should see  Is My Deposit Safe sub tab$")
	public void i_should_see_Is_My_Deposit_Safe_sub_tab() {
		Assert.assertTrue(gettingstartedPage.isIsMyDepositSafeTabPresent());

	}

	// Verify if Security Sub Tab is displayed on Getting Started Page.
	@Then("^I should see Security sub tab$")
	public void i_should_see_Security_sub_tab() {
		Assert.assertTrue(gettingstartedPage.isSecurityTabPresent());

	}

	// Verify if JackPot Slider is displayed on Getting Started Page.
	@Then("^I should see Jackpot Block slisder$")
	public void i_should_see_Jackpot_Block_slisder() {
		Assert.assertTrue(gettingstartedPage.isGettingStartedJackpotBlockSliderPresent());

	}

	// Verify if Present is displayed as a title on Presnters page
	@Then("^I should see Presenter as TitlePage$")
	public void i_should_see_Presenter_as_TitlePage() {
		Assert.assertTrue(tvpresentersPage.isPresenterTitlePresent());

	}

	@Then("^I should see each Presenters image$")
	public void i_should_see_each_Presenters_image() {

	}

	// Verify if All Videos Sub Tab is displayed on Videos Page.
	@Then("^I should see All Video sub tab$")
	public void i_should_see_All_Video_sub_tab() {
		Assert.assertTrue(videoPage.isAllVideoTabPresent());

	}

	// Verify if TV Advert Sub Tab is displayed on video Page.
	@Then("^I should see  Tv Avert sub tab$")
	public void i_should_see_Tv_Avert_sub_tab() {
		Assert.assertTrue(videoPage.isVideoTVAdvertTabPresent());

	}

	// Verify if Games Review Sub Tab is displayed on Videos Page.
	@Then("^I should see Game Review sub tab$")
	public void i_should_see_Game_Review_sub_tab() {
		Assert.assertTrue(videoPage.isVideoGamesReviewTabPresent());

	}

	// Verify if VIP Logo is displayed on Vip Page.
	@Then("^I should see VIP Logo on Vip page$")
	public void i_should_see_VIP_Logo_on_Vip_page() {
		Assert.assertTrue(vipPage.isVIPLogoPresent());

	}

	// Verify if Red Table Badge is displayed on VIP Page.
	@Then("^I should see Red table badge$")
	public void i_should_see_Red_table_badge() {
		Assert.assertTrue(vipPage.isVIPRedBadgePresent());

	}

	// Verify if Bronze Table Badge is displayed on VIP Page.
	@Then("^I should see Bronze table Badge$")
	public void i_should_see_Bronze_table_Badge() {
		Assert.assertTrue(vipPage.isVIPBronzeBadgePresent());
	}

	// Verify if Sliver Table Badge is displayed on VIP Page.
	@Then("^I should see Silver table Badge$")
	public void i_should_see_Silver_table_Badge() {
		Assert.assertTrue(vipPage.isVIPSliverBadgePresent());
	}

	// Verify if Gold Table Badge is displayed on VIP Page.
	@Then("^I should see Gold table Badge$")
	public void i_should_see_Gold_table_Badge() {
		Assert.assertTrue(vipPage.isVIPGoldBadgePresent());

	}

	// Verify if Platinum Table Badge is displayed on VIP Page.
	@Then("^I should see Platinum table Badge$")
	public void i_should_see_Platinum_table_Badge() {
		Assert.assertTrue(vipPage.isVIPPlatinumBadgePresent());

	}

	// Verify if Winners is Displayed as Title page
	@Then("^I should see Winners as Title page$")
	public void i_should_see_Winners_as_Title_page() {
		Assert.assertTrue(winnersPage.isWinnersTitlePagePresent());
	}

	// Verify if Winners Table is displayed with winners
	@Then("^I should see winners table displayed$")
	public void i_should_see_winners_table_displayed() throws Throwable {
		Assert.assertTrue(winnersPage.isWinnersTablePagePresent());
	}

	// Verify if About supercasino is displayed as title page on About Us Page
	// page
	@Then("^I should see AboutSupercasino as Title page$")
	public void i_should_see_AboutSupercasino_as_Title_page() {
		Assert.assertTrue(aboutusPage.isAboutSupercasionTitlePagePresent());

	}

	// Verify if Forgotten Details is displayed as Title page on Forgotten
	// details Page
	@Then("^I should see Forgotten Details Displayed as title$")
	public void i_should_see_Forgotten_Details_Displayed_as_title() {
		Assert.assertTrue(forgottenDetailsPage.isTitlePresent());

	}

	// Verify if Faqs is displayed as title page on FAQS page
	@Then("^I should see FAQS displayed$")
	public void i_should_see_FAQS_displayed() {
		Assert.assertTrue(faqsPage.isFaqsTitlePagePresent());
	}

	// Verify pRIVACY pOLICY tITLE IS DISPLAYED ON Privacy Page
	@Then("^I should see Privcy Polcy Uk displayed as Title Page$")
	public void i_should_see_Privcy_Polcy_Uk_displayed_as_Title_Page() {
		Assert.assertTrue(privacypolicyPage.isPrivacyPolicyTitlePagePresent());

	}

	// Verify Responsible Gambling tITLE IS DISPLAYED ON Privacy Page
	@Then("^I should see Responsible Gambling displayed as Title Page$")
	public void i_should_see_Responsible_Gambling_displayed_as_Title_Page() {
		Assert.assertTrue(RespGambPage.isResponsibleGamblingTitlePagePresent());
	}

	// Verify if Terms and Conditions is displayed as title on term page
	@Then("^I should see Terms And Conditions For Uk displayed as Title Page$")
	public void i_should_see_Terms_And_Conditions_For_Uk_displayed_as_Title_Page() {
		Assert.assertTrue(termsPage.isTermsAndConditionsTitlePagePresent());
	}

	// Withdrawal cashier page
	@Then("^I should navigate to Withdrawl page\\.$")
	public void i_should_navigate_to_Withdrawl_page() {
		Assert.assertTrue(withdrawPage.isYourWithdrawalPendingTextPresent());

	}

	// Withdraw confirmation Pop-up box
	@Then("^I should see Withdrawal success Pop-up box$")
	public void i_should_see_Withdrawal_success_Pop_up_box() {
		Assert.assertTrue(withdrawPage.isWithdrawSuccessLightBoxPresent());

	}

	// Verify if Withdraw Confirmation Pop-up is not displayed after clicking No
	// button
	@Then("^I should see no pop-up box displayed$")
	public void i_should_see_no_pop_up_box_displayed() {
		Assert.assertTrue(!withdrawPage.isWithdrawSuccessLightBoxNotPresent());

	}

	// Verify if The Withdraw Pending button is displayed.
	@Then("^I should see a withdrawl Pending displayed$")
	public void i_should_see_a_withdrawl_Pending_displayed() {
		Assert.assertTrue(withdrawPage.isPendingWithdrawalCancellButtonPresent());

	}

	//
	@Then("^I should see a see Confirmation Pop-up box\\.$")
	public void i_should_see_a_see_Confirmation_Pop_up_box() {
		Assert.assertTrue(withdrawPage.isPendingWithdrawCancelConfimationBoxPresent());

	}

	// Verify if Cancel Pending withdrawl Cancel button is still present.
	@Then("^I should see Pending withdrwal Cancel Button$")
	public void i_should_see_Pending_withdrwal_Cancel_Button() {
		Assert.assertTrue(withdrawPage.isPendingWithdrawalCancellButtonPresent());

	}

	@Then("^I should see Amount Withdrawal cancell Comfirmation box$")
	public void i_should_see_Amount_Withdrawal_cancell_Comfirmation_box() {

	}

	@Then("^My balance should increase by amount withdrawn$")
	public void my_balance_should_increase_by_amount_withdrawn() {

	}

	@Then("^I should see no Amount Withdrawal cancell Comfirmation box$")
	public void i_should_see_no_Amount_Withdrawal_cancell_Comfirmation_box() {

	}

	// Verify if Withdrawl Pending Cancel button is not Displayed
	@Then("^I should see no Pending withdrwal Cancel Button$")
	public void i_should_see_no_Pending_withdrwal_Cancel_Button() {
		Assert.assertTrue(!withdrawPage.isPendingWithdrawCancelButtonNotPresent());

	}

	// Verify if Balance is the same
	@Then("^I should see My Balance as the same$")
	public void i_should_see_My_Balance_as_the_same() {
		Assert.assertTrue((depositPage.getCurrentBalance() == depositPage.getCashierBalancePresent()));

	}

	// Verify if Pending Notification Pop-up box is displayed
	@Then("^I should see Pending Notification Pop-up box displayed$")
	public void i_should_see_Pending_Notification_Pop_up_box_displayed() {
		Assert.assertTrue(depositPage.isWitdrawPendingNotificationPresent());

	}

	// Verify if user navigated to Vegas home page
	@Then("^I should navigated to Vegas Home page$")
	public void i_should_navigated_to_Vegas_Home_page() {
		// Assert.assertEquals(vegasPage.VerifyVegasURLaddress(),
		// "https://vegas.supercasino.com/");
	}

	// Verify if one of the Vegas games launched
	@Then("^i should see the Game launching$")
	public void i_should_see_the_Game_launching() {
		// Verifying if new game launch
		vegasPage.isWindowTabTheSame();
	}

	// Verify if user navigated to Live home page
	@Then("^I should navigated to Live Home page$")
	public void i_should_navigated_to_Live_Home_page() {
		// Assert.assertEquals(livePage.getLiveVetricalUrlAddress(),
		// "https://live.supercasino.com/");
	}

	// Verify if one of the Live game on Live home launched.
	@Then("^I should see the live Game launching$")
	public void i_should_see_the_live_Game_launching() throws InterruptedException  {
		livePage.isLiveGameLaunch();
	}

	// Verify if user navigated to Promotion page
	@Then("^I should see Promotion Banners displayed$")
	public void i_should_see_Promotion_Banners_displayed() throws InterruptedException {
		Assert.assertTrue(promotionPage.PromotionBannerTitlePagePresent());
	}

	// Verify if More Info button is displayed on each of the Banner
	@Then("^I should see More info button$")
	public void i_should_see_More_info_button() {
		Assert.assertTrue(promotionPage.isPromMoreInfoButtonPresent());

	}

	// Verify if Join Now button is displayed on each of the Banner
	@Then("^I should see Join Now to play$")
	public void i_should_see_Join_Now_to_play() {
		Assert.assertTrue(promotionPage.isJoinToPlayButtonPresent());

	}

	// Verify if Promotion Sub Menu tab is displayed on Promotion page
	@Then("^I should see Promotions Sub tab$")
	public void i_should_see_Promotions_Sub_tab() {
		Assert.assertTrue(promotionPage.isPromoSubMenu());

	}

	// Verify if Competition sub menu is displayed on promotion page
	@Then("^I should see  Competitions Sub tab$")
	public void i_should_see_Competitions_Sub_tab() {
		Assert.assertTrue(promotionPage.isCompetitionSubMenuTabPresent());

	}

	// Verify if user can navigate to each More info on Game Promotion banner
	// page
	@Then("^I should Navigate to Promotion Banner page$")
	public void i_should_Navigate_to_Promotion_Banner_page() throws InterruptedException {
		Assert.assertTrue(promotionPage.isPromMoreInfoButtonPresent());

	}

	/*
	 * Verify if Roulette Express is displayed as title name on the Game info
	 * Page
	 */
	@Then("^I should see Roulette Express Premium as title Page$")
	public void i_should_see_Roulette_Express_Premium_as_title_Page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameNamePresent());

	}

	/* Verify if Game Detail information is displayed on the Game info Page */
	@Then("^I should see Game Details Information$")
	public void i_should_see_Game_Details_Information() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameDetailsPresent());

	}

	/* Verify if Game Device image is displayed on the Game info Page */
	@Then("^I should see Game Devices images$")
	public void i_should_see_Game_Devices_images() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameDeviceImagePresent());
	}

	/* Verify if Game Air Status is displayed on the Game info Page */
	@Then("^I should Game Air Status$")
	public void i_should_Game_Air_Status() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameAirStatusPresent());
	}

	/* Verify if Play for Real is displayed on the Game info Page */
	@Then("^I should see Play for Real Button on Roulette Express Premium Game Info page$")
	public void i_should_see_Play_for_Real_Button_on_Roulette_Express_Premium_Game_Info_page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGamePlayForRealButtonPresent());

	}

	/* Verify if Play for Fun is displayed on the Game info Page */
	@Then("^I should see Play For Fun Button on Roulette Express Premium Game Info page$")
	public void i_should_see_Play_For_Fun_Button_on_Roulette_Express_Premium_Game_Info_page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGamePlayForFunButtonPresent());

	}

	/* Verify if Android logo is displayed on the Game info Page */
	@Then("^I should see Roulette Express Banner display on Roulette Express Premium Game Info$")
	public void i_should_see_Roulette_Express_Banner_display_on_Roulette_Express_Premium_Game_Info() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameBannerPresent());

	}

	/* Verify if Jackpot Slider is displayed on the Game info Page */
	@Then("^I should see Jackpot slider on the Roulette Express Premium Game Info$")
	public void i_should_see_Jackpot_slider_on_the_Roulette_Express_Premium_Game_Info() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameJackpotSliderPresent());

	}

	/* Verify if Winner Slider is displayed on the Game info Page */
	@Then("^I should see Winners SliderRoulette Express Premium Game Info$")
	public void i_should_see_Winners_SliderRoulette_Express_Premium_Game_Info() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameWinnersSliderPresent());

	}

	/* Verify if Apple logo is displayed on the Game info Page */
	@Then("^I should see AppStore logo on Roulette Express Premium Game Info$")
	public void i_should_see_AppStore_logo_on_Roulette_Express_Premium_Game_Info() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameAppleLogoPresent());

	}

	/* Verify if Android logo is displayed on the Game info Page */
	@Then("^I should see Android Logo on Roulette Express Premium Game Info$")
	public void i_should_see_Android_Logo_on_Roulette_Express_Premium_Game_Info() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameAndroidLogoPresent());
	}

	/* Verify if Login pop -up box is displayed on the Game info Page */
	@Then("^I should see a Login Pop-up box displayed on Roulette Express Premium Game Info$")
	public void i_should_see_a_Login_Pop_up_box_displayed_on_Roulette_Express_Premium_Game_Info() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageLoginPopBoxPresent());
	}

	/*
	 * Verify if Name of the Game is displayed as the title on the Game info
	 * Page
	 */
	@Then("^I should see the Name of the game as title Page$")
	public void i_should_see_the_Name_of_the_game_as_title_Page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameNamePresent());

	}

	/* Verify if Play for real is displayed on the Game info Page */
	@Then("^I should see Play for Real Button on this Playtech game GameInfo page$")
	public void i_should_see_Play_for_Real_Button_on_this_Playtech_game_GameInfo_page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGamePlayForRealButtonPresent());

	}

	/* Verify if Play For Fun Button is displayed on the Game info Page */
	@Then("^I should see Play For Fun Button on this Playtech game GameInfo page$")
	public void i_should_see_Play_For_Fun_Button_on_this_Playtech_game_GameInfo_page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGamePlayForFunButtonPresent());

	}

	/* Verify if Game Banner is displayed on the Game info Page */
	@Then("^I should see the Game Banner display on this Playtech game GameInfo page$")
	public void i_should_see_the_Game_Banner_display_on_this_Playtech_game_GameInfo_page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameBannerPresent());

	}

	/* Verify if Jackpot slider is displayed on the Game info Page */
	@Then("^I should see Jackpot slider on the this Playtech game GameInfo page$")
	public void i_should_see_Jackpot_slider_on_the_this_Playtech_game_GameInfo_page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameJackpotSliderPresent());

	}

	/* Verify if Winner Slider is displayed on the Game info Page */
	@Then("^I should see Winners Slider this Playtech game GameInfo page$")
	public void i_should_see_Winners_Slider_this_Playtech_game_GameInfo_page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameWinnersSliderPresent());

	}

	/* Verify if Apple logo is displayed on the Game info Page */
	@Then("^I should see AppStore logo on this Playtech game GameInfo page$")
	public void i_should_see_AppStore_logo_on_this_Playtech_game_GameInfo_page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameAppleLogoPresent());

	}

	/* Verify if Android logo is displayed on the Game info Page */
	@Then("^I should see Android Logo on this Playtech game GameInfo page$")
	public void i_should_see_Android_Logo_on_this_Playtech_game_GameInfo_page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageGameAndroidLogoPresent());

	}

	/* Verify if Login Pop-up box is displayed on the Game Info p[age */
	@Then("^I should see a Login Pop-up box displayed on this Playtech game GameInfo page$")
	public void i_should_see_a_Login_Pop_up_box_displayed_on_this_Playtech_game_GameInfo_page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPageLoginPopBoxPresent());

	}

	/* Verify if Game search for is displayed */
	@Then("^I should see Roulette Express Premoium display from the Search$")
	public void i_should_see_Roulette_Express_Premoium_display_from_the_Search() {
		Assert.assertTrue(homePage.isCasinoGameSearchReturnPresent());
	}

	/* Verify if Game search for is displayed */
	@Then("^I should see Roulette GameSearch game display from the Search$")
	public void i_should_see_Roulette_GameSearch_game_display_from_the_Search() {
		Assert.assertTrue(homePage.isVegasGameSearchReturnPresent());
	}
	
	@Then("^I should see Disabled Register Now button displayed$")
	public void i_should_see_Disabled_Register_Now_button_displayed() {
		Assert.assertTrue(registerPage.isDisabledRegisterNowButtonPresent());
	   
	}

	@After()
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
