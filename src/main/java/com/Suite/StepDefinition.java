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

import Connector.WebConnector;
import Util.Constant;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.ForgottenDetails;
import pages.HomePage;
import pages.RegisterPage;

public class StepDefinition extends BaseTest {

	private BasePage basePage;
	private HomePage homePage;
	private RegisterPage registerPage;
	private ForgottenDetails forgottenDetailsPage;
	private com.suite.Cashier.DepositPage depositPage;

	public StepDefinition() {

		super();

		// all pages
		homePage = new HomePage(this.driver);
		registerPage = new RegisterPage(this.driver);
		basePage = new BasePage(this.driver);
		forgottenDetailsPage = new ForgottenDetails(this.driver);
		depositPage = new com.suite.Cashier.DepositPage(this.driver);

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

	@Given("^I navigate to the ForgottenDetails page on \"([^\"]*)\"$")
	public void i_navigate_to_the_ForgottenDetails_page_on(String browser) {
		forgottenDetailsPage.get(CONFIG.getProperty("siteName"));
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
	public void i_click_on_Forgotten_Deatils_Submit_Button() {
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
		basePage.doLogin(username, password);
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

	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This Are only for @Then Methods */
	////////////////////////////////////////////////////////////////////////////////////////////////////////

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
	@Then("^I should see AccountMenu_$")
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

	/*
	 * Verifying if user able to register successfully
	 * 
	 * @param {string} expected Result- this id the Welcome title page
	 */
	@Then("^I should navigate \"([^\"]*)\" to welcome page\\.$")
	public void i_should_navigate_to_welcome_page(String expectedResult) {
		Assert.assertTrue(this.registerPage.getWelcomePage(expectedResult));
		String result = null;

	}

	// Verifying if user navigated to forgotten page
	@Then("^I should navigate  to Forgotten Details page$")
	public void i_should_navigate_to_Forgotten_Details_page() {
		Assert.assertEquals("is the Url address the same", this.basePage.getCurrentUrl(), driver.getCurrentUrl());

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

}
