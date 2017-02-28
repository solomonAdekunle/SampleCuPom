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

import Connector.WebConnector;
import Util.Constant;
import cucumber.api.PendingException;
import cucumber.api.java.After;
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
import pages.GettingStartedPage;
import pages.HomePage;
import pages.PrivacyPolicy;
import pages.RegisterPage;
import pages.ResposibleGamblingPage;
import pages.TVPresentersPage;
import pages.TermsPage;
import pages.VIPPage;
import pages.VideosPage;
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

	@Given("^I navigate to the Registrationpage on Mozilla$")
	public void i_navigate_to_the_Registrationpage_on_Mozilla() {
		registerPage.get(CONFIG.getProperty("siteName"));

	}

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

	@When("^I enter regUsername as \"([^\"]*)\"$")
	public void i_enter_regUsername_as(String UserName) {
		registerPage.sendRegUsername(UserName);

	}

	@When("^I enter RegPassword as \"([^\"]*)\"$")
	public void i_enter_RegPassword_as(String password) {
		registerPage.sendRegPassword(password);

	}

	@When("^I enter RegConfirmPassword as \"([^\"]*)\"$")
	public void i_enter_RegConfirmPassword_as(String ConfPass) {
		registerPage.sendConfirmpassword(ConfPass);
	}

	@When("^I enter a RegScreenName as \"([^\"]*)\"$")
	public void i_enter_a_RegScreenName_as(String ScreenName) {
		registerPage.sendOnscreenName(ScreenName);

	}

	@When("^I enter RegEmail as \"([^\"]*)\"$")
	public void i_enter_RegEmail_as(String Email) {
		registerPage.sendEmail(Email);

	}

	@When("^I enter RegTitle as \"([^\"]*)\"$")
	public void i_enter_RegTitle_as(String title) {
		registerPage.sendTitle(title);
	}

	@When("^I enter RegFirstName as \"([^\"]*)\"$")
	public void i_enter_RegFirstName_as(String firstName) {
		registerPage.sendFirstName(firstName);

	}

	@When("^I enter RegSurName as \"([^\"]*)\"$")
	public void i_enter_RegSurName_as(String surname) {
		registerPage.sendSurName(surname);

	}

	@When("^I enter RegDOBDay as \"([^\"]*)\"$")
	public void i_enter_RegDOBDay_as(String Day) {
		registerPage.sendDOBday(Day);

	}

	@When("^I enter RegDOBMonth as \"([^\"]*)\"$")
	public void i_enter_RegDOBMonth_as(String Month) {
		registerPage.sendDOBmonth(Month);
	}

	@When("^I enter RegDOBYear as \"([^\"]*)\"$")
	public void i_enter_RegDOBYear_as(String Year) {
		registerPage.sendDOByear(Year);

	}

	@When("^I click on RegClickHere$")
	public void i_click_on_RegClickHere() {
		registerPage.clickEnterManually();

	}

	@When("^I enter RegAddress as \"([^\"]*)\"$")
	public void i_enter_RegAddress_as(String Address) {
		registerPage.sendAddress(Address);

	}

	@When("^I enter RegTown as \"([^\"]*)\"$")
	public void i_enter_RegTown_as(String Town) {
		registerPage.sendCity(Town);

	}

	@When("^I enter RegCounty as \"([^\"]*)\"$")
	public void i_enter_RegCounty_as(String county) {
		registerPage.sendCounty(county);

	}

	@When("^I enter RegPostCode as \"([^\"]*)\"$")
	public void i_enter_RegPostCode_as(String Postcode) {
		registerPage.sendPostCode(Postcode);
	}

	@When("^I enter RegContactNum as \"([^\"]*)\"$")
	public void i_enter_RegContactNum_as(String contactNumber) {
		registerPage.sendContactNumber(contactNumber);

	}

	@When("^I click on RegT\\$CCheckBox$")
	public void i_click_on_RegT$CCheckBox() {
		registerPage.checkOver18();

	}

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
	public void i_enter_Amount_To_Deposit_as(String Amount) {
		depositPage.sendCashierEnterAmountInputField(Amount);
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
		;

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
	@Then("^I should navigate  to Registration page$")
	public void i_should_navigate_to_Registration_page() {
		Assert.assertEquals("is the Url address the same", this.basePage.getCurrentUrl(), driver.getCurrentUrl());

	}

	// Verify if Error Message will be displayed on Register form with Invalid
	// Data
	@Then("^I should see Error Messsage displayed on Register Page$")
	public void i_should_see_Error_Messsage_displayed_on_Register_Page() {
		Assert.assertTrue(registerPage.isRegErrorMessagePresent());

	}

	/*
	 * Verifying if user able to register successfully
	 * 
	 * @param {string} expected Result- this id the Welcome title page
	 */
	@Then("^I should navigate \"([^\"]*)\" to welcome page\\.$")
	public void i_should_navigate_to_welcome_page(String expectedResult) {
		registerPage.getWelcomePage(expectedResult);
		// Assert.assertTrue(this.registerPage.getWelcomePage(expectedResult));

	}

	// Verifying if user navigated to forgotten page
	@Then("^I should navigate  to Forgotten Details page$")
	public void i_should_navigate_to_Forgotten_Details_page() {
		Assert.assertEquals("is the Url address the same", this.basePage.getCurrentUrl(), driver.getCurrentUrl());

	}

	// Verify if Error Message will be displayed when Invalid data are provided
	@Then("^I should see an error Messeage on Forgotten Details Page$")
	public void i_should_see_an_error_Messeage_on_Forgotten_Details_Page() {
		Assert.assertTrue(forgottenDetailsPage.isErrorMessageTextPresent());
	}

	@Then("^I should reset my password$")
	public void i_should_reset_my_password() {
		Assert.assertTrue(forgottenDetailsPage.isTitlePresent());
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

	// Checking if previous balance plus new Bet value will equal New Balance
	// displayed
	@Then("^I should see my new Account Balance increase by \"([^\"]*)\"$")
	public void i_should_see_my_new_Account_Balance_increase_by(String Amount) {
		int Amountfigure = Integer.parseInt(Amount);
		float NewBalance = depositPage.getCurrentBalance() + Amountfigure;
		System.out.print(Amountfigure);
		Assert.assertTrue(NewBalance - depositPage.getCashierBalancePresent() == Amountfigure);

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

	// Verifying if Deposit Limit link is displayed
	@Then("^I should see Deposit Limit Link$")
	public void i_should_see_Deposit_Limit_Link() {
		Assert.assertTrue(registerPage.isDepositLimitLinkPresent());

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

	@Then("^I should see Othe Amount Input box$")
	public void i_should_see_Othe_Amount_Input_box() {
		Assert.assertTrue(registerPage.isDepositLimitOtherInputBoxPresent());

	}

	@Then("^I should see Other Amount  as \"([^\"]*)\"$")
	public void i_should_see_Other_Amount_as(String Value) {
		Assert.assertTrue(registerPage.isDepositLimitOtherValuePresent(Value));

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
	public void i_should_see_an_error_Messeage_displayed() throws Throwable {
		Assert.assertTrue(changepasswordPage.isErrorTextPresent());
	}

	@Then("^I should see Your Password Have successfully Rest$")
	public void i_should_see_Your_Password_Have_successfully_Rest() throws InterruptedException {
		changepasswordPage.isYourPasswordHasSuccessfullyChangeTextPresent();

	}

	@Then("^I should see a game Launching in another window$")
	public void i_should_see_a_game_Launching_in_another_window() {

	}

	// Verifying if Contact us is displayed as Tittle Page
	@Then("^I should see Contact Us displayed$")
	public void i_should_see_Contact_Us_displayed() {
		Assert.assertTrue(contactPage.isContactUsTitlePagePresent());

	}

	@Then("^I should see Customer support care link$")
	public void i_should_see_Customer_support_care_link() {
		Assert.assertTrue(contactPage.isCustomerCareLinkPresent());

	}

	@Then("^I should see Forgotten Your Password link$")
	public void i_should_see_Forgotten_Your_Password_link() {
		Assert.assertTrue(contactPage.isForgotYourPasswordLinkPresent());
	}

	@Then("^I should see free Phone Contact Number$")
	public void i_should_see_free_Phone_Contact_Number() {

	}

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
	@Then("^I should see  Responsible Gambling displayed as Title Page$")
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

	@After()
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
