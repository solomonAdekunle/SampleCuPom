package Util;

public class Constant  {

	
	
	public static String SUITE_SHEET="Suite";
	

	// Locators for Registtration Page
	public static  String  Reg_UserName= "input#account_username";
	public static String Reg_PassWord="input#account_password";
	public static String Reg_ConfirmPassword="input#account_password_confirm";
	public static String Reg_OnScreeName="input#screen_name";
	public static String Reg_Email="input#email";
	public static String Reg_Title="div.form-item-title .form-select";
	public static String Reg_FirstName="input#fname";
	public static String Reg_SurName="input#surname";
	public static  String Reg_DOB_Day="select#edit-date-select-day";
	public static String  Reg_DOB_Month="select#edit-date-select-month";
	public static String Reg_DOB_Year="select#edit-date-select-year";
	public static String Reg_Enter_Manually="span#enter_manually a";
	public static String  Reg_Address="input#address";
	public static String Reg_Town="input#city";
	public static String Reg_County="input#county";
	public static String Reg_PostCode="input#postcode";
	public static String  Reg_Contact_Number="input#mobile_phone";
	public static String  Reg_Terms_Wagering="div#bonus-description a";
	public static String Reg_Over18="input#agree_terms";
	public static String Reg_terms="div#terms-description a[data-ajax-url='/get-page/2']";
	public static String Reg_privacyPolicy="div#terms-description a[data-ajax-url='/get-page/3']";
	public static String Reg_Compilaance_Message="div.registration-form-legal-footer p";
	public static String Reg_Submit="button#registration_submit";
	public static String  Reg_DepositLimitLink="a.off .click-button";
	public static String Reg_DepositLimit_ChooseType="div.form-item-deposit-limits select#edit-deposit-limits";
	public static String Reg_DepositLimit_ChooseLimit="div.form-item-deposit-amount select#edit-deposit-amount";
	public static String Reg_DepositLimit_ChooseLimitOther="input#edit-input-amount";
	public static String Reg_DepositLimit_ChooseTypeNolimit="div.form-item-deposit-limits option[value='0']";
	public static String Reg_DepositLimit_ChooseTypeDaily="div.form-item-deposit-limits option[value='Daily']";
	public static String Reg_DepositLimit_ChooseTypeWeekLy="div.form-item-deposit-limits option[value='Weekly']";
	public static String Reg_DepositLimit_ChooseTypeMonthly="div.form-item-deposit-limits option[value='Monthly']";
	public static String Reg_DepositLimitValueBox="//select[@id='edit-deposit-amount']";
	public static String Reg_DepositLimit_ChooseLimitValue1="select#edit-deposit-amount option[value='1000']";
	public static String Reg_DepositLimit_ChooseLimitValue2="select#edit-deposit-amount option[value='10000']";
	public static String Reg_DepositLimit_ChooseLimitValue3="select#edit-deposit-amount option[value='50000']";
	public static String Reg_DepositLimit_ChooseLimitValue4="select#edit-deposit-amount option[value='Other']";
	public static String Reg_DepositLimit_close="a.on";
	public static String Reg_ErrorText="body.page-register .basic-page .error";
	
	
	// Locators for all Elements On Login 
	public static String Login_ErrorPopBox="div.login-modal .login-error .error_message";
	
	// locator for ForgottenDetails link
	public  static String HomePage_ForgottenDetailsLink="div.region-header a#forgotten-details-link";
	public static String ForgottenDetails_UserName="input#forgotten_username";
	public static String ForgottenDetails_Email="input#email";
	public static String ForgottenDetails_DOBDay="select#edit-date-select-day";
	public static String ForgottenDetails_DOBMonth="select#edit-date-select-month";
	public static String ForgottenDetails_DOBYEAR="select#edit-date-select-year";
	public static String ForgottenDetails_Submit="button#forgotten_details_submit";
	public static String ForgottenDetails_ErrorText="body.page-forgotten-details .basic-page .error";
	// lactor for Reset password
	public static String Reset_NewPassword="input#new_password";
	public static String Resset_ConfirmPassword="input#password_confirm";
	public static String Reset_Submit="input#personal_details_password_submit";
	
	//locator for Title page
	public static String TitlePage="h1.title";
	
	// locator for all the Header of the page
	public static String HP_DeopsitButton="div#account_box a.deposit";
	
	// locators for all elements in the cashier
	public static String Cashier_UserNameInfo ="#PH_UserDataBox span#PH_UserName";
	public static String Cashier_BalanceValve="#PH_UserDataBox span#PH_UserBalanceLabel";
	public static String Cashier_BalanceFigure="span#PH_UserBalance";
	public static String SafeCharge_Logo="div.v-bottom .sfc-logo";
	public static String Cashier_MyAccountTab="#PB_CasinoMyAccount";
	public static String Cashier_DepositTab="#PB_3rdpExternalDeposit";
	public static String Cashier_WithrawTab="#PB_Withdraw";
	public static String Cashier_MyPaymentMethodtext="div.user_pm .payment_header_label";
	public static String Cashier_OtherPaymentDetailsText="div.pm span.payment_header_label";
	public static String Cashier_DepositButton="div.amount-deposit-footer input#continueButton";
	public static String  Cashier_MyPaymentMthodLogo="div.list-container li.selected";
	public static String Cashier_MyOtherPaymentMethodPayPal_logo="div.list-container div[title='PayPal']";
	public static String Cashier_CardOwnerName="div.PMINFO .cc_name_on_card";
	public static String Cashier_CardOwnerNumber="div.PMINFO .cc_card_number";
	public static String Cashier_CardExpirydate="div#_read_only_text";
	public static String Cashier_lastFourDigitNumber="div#cc_card_number_read_only_text";
	public static String Cashier_CardCVVTextbox="div.PMINFO .cc_cvv2 input#cc_cvv2";
	public static String Cashier_promocodeTextbox="input#promoCode";
	public static String Cashier_ChangeBillingAddresCheckbox="div.user_details";
	public static String Cashier_EnterAmountInputField="input#item_amount_1";
	public static String Cashier_CardInputtextErroMessage="div#cc_card_number_validation label.error";
	public static String Cashier_CardInputField="input#cc_card_number";
	public static String Cashier_cardExpiryDateMonth="select#cc_exp_month";
	public static String Cashier_cardExpiryDateYear="select#cc_exp_year";
	public static String Cashier_cardCardOwnerNameInputBox="input#cc_name_on_card";
	public static String Cashier_cardExpiryErroText="div#expiration_period_validation label[for='expiration_period']";
	public static String Cashier_cardCVVErrorText="label[for='cc_cvv2']";
	public static String Cashier_CardOwnerNameInputGreenTick="div#cc_name_on_card_validation";
	public static String Cashier_CardNumberInputFieldGreenTick="div#cc_card_number_validation";
	public static String Cashier_ExpirydateAndCvvInputFieldGreenTick="div#cc_cvv2_validation";
	public static String Cashier_PromCodeInputFieldGreenTick="div#promoCode_validation";
	public static String Cashier_EnterAmountInputFieldErroMessageText="label[for='item_amount_1']";
	public static String Cashier_EnterAmountInputFieldGreenTick="div#item_amount_1_validation";
	public static String Cashier_SuccessDepositPop_upBox ="div.lightbox-header";
	public static String Cashier_RegisterNewCardLogo="div.list-container li[data-value='cc_card']";
	public static String Cashier_DepositApporovedText="div.lightbox-content .h3";
	public static String Cashier_SuccessDepositPop_boxCloseButton="button.modal_close.btn.on_confirm";
	public static String Cashier_DeclinedDepositPop_upBox="div.lightbox-header h2";
	public static String Cashier_DeclineDepositTransactionText="div.lightbox-content .h3";
	public static String Cashier_DeclinedDepositConatctSuportNumber="//a[@href='tel:08000147523']";
	public static String Cashier_DeclineDepositCloseIcon="span.modal_close.on_cancel";
	public static String Cashier_ChangeBillingAddressPostCodeInputField="input#zip";
	public static String Cashier_ChangeBillingAddressHouseNumber="input#address1";
	public static String Cashier_NewBillinaddresText="input[placeholder='Address']";
	public static String Cashier_WithdrawButton="button.withdraw";
	public static String Cashier_Withdraw_NoWithDrawalPendingtext="div.withdraw-wrapper";
	public static String Cashier_Withdraw_AmountToWithdraw="input.amount";
	public static String Cashier_Withdraw_SuccessPopUpBox="div#lightbox";
	public static String Cashier_Withdraw_SuccessPopUpBox_okButton="button.modal_close";
	public static String Cashier_WithdrawPendingCancelButton="td.wd_button";
	public static String Cashier_WithdrawPendingCancel_ConfirmationPopBox="div.confirm";
	public static String Cashier_WithdrawConfimationPopBox_YesButton="button.ok";
	public static String Cashier_WithdrawConfirmationPopBox_NoButton="button.no";
	public static String Cashier_WithdrawPendingCancel_SuccessPopUpBox="div.wd_canceled";
	public static String Cashier_WithdrawPendingCancel_SuccessPopUpBox_OKButton="button.modal_close";
	
	
	// Locator for all Elements on Account Menu Dropdown box
	public static String AccountMenuDropdown="//ul[@class='account_menu']";
	public static String AccountMenu_ChangePassword="//ul[@class='account_menu']//li[@class='change_password']";
	public static String AccountMenu_Withdrawl="ul.account_menu .withdraw_funds a";
	
	// Locators for all elements on Changepassword page
	public static String ChangePassword_titlePage="h1.title";
	public static String ChangePassword_OldPassword="input#old_password";
	public static String ChangePassword_NewPassword="input#new_password";
	public static String ChangePassword_ConfPassword="input#password_confirm";
	public static String ChangePassword_SubmitButton="//*[@id='change_password_submit']";
	public static String YourPasswordHasChangeSuccefully_titlePage="h1.title";
	public static String  ChangePassword_ErrorMessage="body.page-change-password .basic-page .error";
	
	
	// Locators For ContactUs Page
	 public static String ContactUs_titlePage="h1.title";
	 public static String ContactUs_CustomerCareLink="a[href='mailto:support@supercasino.com']";
	 public static String ContactUs_ForgottenPasswordlink="a[href='/forgotten-details']";
	 public static String ContactUs_UkNumber="#node-138 > div > div > div > div > div > p:nth-child(15)";
	 
	 
	 
	 // lOcators for all Elements on footer 
	 public static String Footer_GettingStartedLink="div.menu-footer---site-links ul.menu .getting-started a";
	 public static String Footer_TvPresenterLink="div.menu-footer---site-links ul.menu .tv-presenters a";
	 public static String Footer_VideosLink="div.menu-footer---site-links ul.menu .videos a";
	 public static String Footer_VIPLink="div.menu-footer---site-links ul.menu .vip a";
	 public static String Footer_WinnersLink="div.menu-footer---site-links ul.menu .winners a";
	 public static String Footer_BlogLink="div.menu-footer---site-links ul.menu .blog a";
	 public static String Footer_AboutUSLink="div.footer-information-menu .about-us a";
	 public static String Footer_AfiliatesLink="div.footer-information-menu .affiliates a";
	 public static String Footer_ConTactUSLink="div.footer-information-menu .contact-us a";
	 public static String Footer_FAQSLink="div.footer-information-menu .help-faqs a";
	 public static String Footer_PrivacyPolicyLink="div.footer-information-menu .privacy-policy a";
	 public static String Footer_ResponsibleGamblingLink="div.footer-information-menu .responsible-gambling a";
	 public static String Footer_TermsLink="div.footer-information-menu .terms a";
	 public static String Footer_PayPalIcon="div.view-payment-methods .views-row-1 img";
	 public static String Footer_VisaIcon="div.view-payment-methods .views-row-2 img";
	 public static String Footer_NetPlayTvIcon="li.footer_logo_netplay a";
	 public static String Footer_18PlusIcon="li.footer_logo_responsibly a";
	 public static String Footer_GamCareIcon="li.footer_logo_gamcare a";
	 public static String Footer_GamblingCommissionIcon="li.footer_logo_gamblingcontrol a";
	 public static String Footer_NetplaytvLicenceTexts="div.footer_legal_text";

// locators for all the Elements on the Vertical tab
	 public static String VerticalTab_Casino="div.menu-verticals .casino a";
	 public static String VerticalTab_Vegas="div.menu-verticals .vegas a";
	 public static String VerticalTab_Live="div.menu-verticals .live a";
	 public static String VerticalTab_Promotions="div.menu-verticals .promotions  a";
	 
	 // locatores for all Element on Getting Started Page
	 public static String GettingStarted_SubTab="div.menu-getting-started .getting-started a";
	 public static String GettingStarted_HowToDepositSubTab="div.menu-getting-started .how-to-deposit a";
	 public static String GettingStarted_HowToWithDrawSubTab="div.menu-getting-started .how-to-withdraw a";
	 public static String GettingStarted_IsMyDepositSafeSubTab="div.menu-getting-started .is-my-deposit-safe- a";
	 public static String GettingStarted_SecuritySubTab="div.menu-getting-started .security a";
	 public static String GettingStarted_JackpotBlockSlider="div.view-id-jackpots";
	 
	 // locator for all Elements on Presenters Page
	  public static String Presenter_TitlePage="h1.title";
	  
	  // locators for all Elements on Video page
	  public static String Videos_AllVideosSubTab="div#quicktabs-videos .first a";
	  public static String Videos_TVAdvertsSubTab="div#quicktabs-videos li a#quicktabs-tab-videos-1";
	  public static String Videos_GamesReviewSubTab="div#quicktabs-videos li a#quicktabs-tab-videos-2";
	  
	  
	  // locators for all Element on VIP page
	  public static String Vip_Logo="header.vip-logo";
	  public static String Vip_RedTable="ul.red-table";
	  public static String Vip_BronzeTable="ul.bronze-table";
	  public static String Vip_SliverTable="ul.silver-table";
	  public static String Vip_GoldTable="ul.gold-table";
	  public static String Vip_platinumTable="ul.platinum-table";
	  
	  // locators for all Elements on Winners page
	  public static String Winners_TitlePage="h1.title";
	  public static String Winners_Table="div.block-winners .tableStyle";
	  
	  // locators for all Element on About us Page
	  public static String AboutUs_TitlePage="h1.title";
	   
	  // locators for all Elements FAQS Page
	  public static String FAQS_TitlePage="h1.title";
	  
	// locators for all Elements Privacy Page
	  public static String PrivacyPolicy_TitlePage="h1.title";
	  
	// locators for all Elements Responsible Gambling Page
		public static String ResponsibleGambling_TitlePage="h1.title";
	  
		// locators for all Elements Terms Page
		  public static String Terms_TitlePage="h1.title";
	  
	 
	 
	 
	 
	 
	 


}
