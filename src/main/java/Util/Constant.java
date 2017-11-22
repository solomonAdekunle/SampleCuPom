package Util;

public class Constant  {

	
	
	public static String SUITE_SHEET="Suite";
	

	// Locators for Registtration Page
	public static  String  Reg_UserName= "username";
	public static String Reg_PassWord="password";
	public static String Reg_OnScreeName="screen_name";
	public static String Reg_Email="email";
	public static String Reg_FirstName="fname";
	public static String Reg_SurName="surname";
	public static  String Reg_DOB_Day="date_select[day]";
	public static String  Reg_DOB_Month="date_select[month]";
	public static String Reg_DOB_Year="date_select[year]";
	public static String Reg_Enter_Manually="#enter_manually a";
	public static String  Reg_Address="address";
	public static String Reg_Town="city";
	public static String Reg_County="county";
	public static String Reg_PostCode="postcode";
	public static String  Reg_Contact_Number="mobile_phone";
	public static String  Reg_Terms_Wagering="nobonus";
	public static String Reg_Over18="agree_terms";
	public static String Reg_terms="a[href='/terms']";
	public static String Reg_privacyPolicy="a[href='/privacy']";
	public static String Reg_Compilaance_Message="div.registration-form-legal-footer p";
	public static String Reg_Submit="registration_submit";
	public static String  Reg_DepositLimitLink="a.off .click-button";
	public static String Reg_DepositLimit_ChooseType="deposit_limits";
	public static String Reg_DepositLimit_ChooseLimit="deposit_amount";
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
	public static String Reg_GenderTypeFemale="Female";
	public static String Reg_GenderTypeMale="Male";
	public static String Reg_Country="country";
	public static String Reg_Currency="currency";
	public static String Reg_CountryDialingCode="phone_prefix";
	public static String Reg_FindAddressButton="postcode_searchbutton";
	public static String Reg_WelToSuperCasinoText="section[class^=' registrationPage__info'] h2";
	public static String Reg_JackpotSliderBlock="div[class^='jackpots__jackpotsWrapper'] h2";
	public static String Reg_PromoBanner="";
	public static String Reg_RegisterTitle="title";
	public static String Reg_HelpIconlink="div[class^='header__help'] a";
	public static String Reg_ChatIconlink="div[class^='header__chat'] a";
	public static String Reg_InvalidDataErrorMessage="div[class^='tooltip__error']";
	public static String Reg_DisabledRegisterNowButton="button[class*='form__buttonDisabled']";
	
	// Locators for all Elements On Login 
	public static String Login_ErrorPopBox="div.login-modal .login-error .error_message";
	
	// locator for ForgottenDetails link
	public  static String HomePage_ForgottenDetailsLink="div.region-header a#forgotten-details-link";
	public static String ForgottenDetails_UserName="input#forgotten_username";
	public static String ForgottenDetails_Email="input#email";
	public static String ForgottenDetails_DOBDay="select#edit-date-select-day";
	public static String ForgottenDetails_DOBMonth="select#edit-date-select-month";
	public static String ForgottenDetails_DOBYEAR="select#edit-date-select-year";
	public static String ForgottenDetails_DOBYEAR_Select="//select[@id='edit-date-select-year']//option[@value='{0}']";
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
	public static String Cashier_closeIcon="div.cashier-modal a i.icon-close";
	public static String Cashier_MyAccountTab="table#PB_CasinoMyAccount";
	public static String Cashier_DepositTab="table#PB_3rdpExternalDeposit";
	public static String Cashier_WithrawTab="table#PB_3rdpExternalWithdraw";
	public static String Cashier_MyPaymentMethodtext="div.user_pm .payment_header_label";
	public static String Cashier_OtherPaymentDetailsText="div.pm span.payment_header_label";
	public static String Cashier_DepositButton="div.amount-deposit-footer input#continueButton";
	public static String  Cashier_MyPaymentMthodLogo="div.list-container li.selected";
	public static String Cashier_MyOtherPaymentMethodPayPal_logo="div.pm  ul.pm-list";
	//public static String Cashier_MyOtherPaymentMethodPayPal_logo="div.list-container div[title='PayPal']";
	public static String Cashier_CardOwnerName="div.PMINFO .cc_name_on_card";
	public static String Cashier_CardOwnerNumber="div.PMINFO .cc_card_number";
	public static String Cashier_CardExpirydate="div#_read_only_text";
	public static String Cashier_lastFourDigitNumber="div#cc_card_number_read_only_text";
	public static String Cashier_CardCVVTextbox="div.PMINFO .cc_cvv2 input#cc_cvv2";
	public static String Cashier_promocodeTextbox="input#promoCode";
	public static String Cashier_ChangeBillingAddresCheckbox="label[for='user_details'] span";
	public static String Cashier_EnterAmountInputField="input#item_amount_1";
	public static String Cashier_CardInputtextErroMessage="div#cc_card_number_validation label.error";
	public static String Cashier_CardInputField="input#cc_card_number";
	public static String Cashier_cardExpiryDateMonth="select#cc_exp_month";
	public static String Cashier_cardExpiryDateMonth_Select="//select[@id='cc_exp_month']//option[@value='{0}']";
	public static String Cashier_cardExpiryDateYear="select#cc_exp_year";
	public static String Cashier_cardExpiryDateYear_Select="//select[@id='cc_exp_year']//option[@value='{0}']";
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
	public static String Cashier_WithdrawTransaction_FailedPopUpBox_OK="button.modal_close";
	public static String Cashier_WithdrawPendingNotification_PopupBox="div#lightbox";
	
	
	// Locator for all Elements on Account Menu Dropdown box
	public static String AccountMenuDropdown="//ul[@class='account_menu']";
	public static String AccountMenu_ChangePassword="li.change_password a";
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
	  
	 
	 // Locators for all Element on Welcome Page
		  public static String Welcome_DepositButton="ul.welcome_panels a.cashier";
	 
		  // Locators for all Elements on Promotions Page
		  public static String PromoMoreInfo_Buttons="a.promo-more-info";
		  public static String PromoJoinToPlay_Button="a.promo-register";
		  public static String PromotionSubMenu_Tablink="div.menu-promotions-submenu .promotions a";
		  public static String CompetitionsSubMenu_Tablink="div.menu-promotions-submenu .competitions a";
		  
		  
		  // Elements on Games Categories for Casino, Vegas and Live vertiical
		  public static String RepGameInfoButton="div.netplay-games.rep .game_overlay a.more_info";
		  public static String PlaytechGameInfoButton="div.playtech-games .game_overlay a.more_info";
		  public static String SearchGameInputbox="input.search_field";
		  public static String SearchGameReturnRoulette="div.netplay-games.rep.NetplayRoulette_TEST";
		  public static String  SearchGameVirtureFusionReturn="div.playtech-games.Cleopatra.PLUS";
		 
		  // Elements on Games Info Page
		  public static String GameInfoPagePlayForReal="a.js-game-launch.play-for-real";
		  public static String GameInfoPagePlayForFun="a.play-for-fun";
		  public static String GameInfoGameBanner="div.game-info-image";
		  public static String GamesDetails="div.game-info-details";
		  public static String GamesInfoGameDeviceImg="div.device-available-container";
		  public static String GameInfoPageAirStatus="div.on-air";
		  public static String GameInfoPageJackpotSlider="div.jackpots-slider";
		  public static String GameInfoPageWinnersSlider="div.winners-scroller-3";
		  public static String GameInfoPageAppLogo="div#mobile_app_store_badges .app-store-logo";
		  public static String GameInfoPageAndroidLogo="div#mobile_app_store_badges .android-logo";
		  
		  // Element for Login Modal
		  public static String  LoginPopUpBox="div.login-modal .modal-content .login-overlay-header h2";
		  
		  // Element for Roulette Express Premium
		  public static String RouletteExpressPremium=".NetplayRoulette_TEST.rep";
		  public static String RouletteExpressPremiumPLayForReal=".NetplayRoulette_TEST.rep .action-button.register.play_for_real.button";
		  
		  // Elements of Chat icon
		  public static String ChatIcon="div.block-lobby-components a.betssonChatLink";
		  public static String ChatboxSuperCasinoLogo="#rn_PageTitle img";
		  
		  //Element for Home Page Help icon
		  public static String HelpIconLink ="div.block-lobby-components a.help_button";
	 
	 
	 


}
