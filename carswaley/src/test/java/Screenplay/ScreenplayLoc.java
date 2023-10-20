package Screenplay;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class ScreenplayLoc {

	static Target CLICK_ON_HOMEPAGE_LOGIN_BUTTON 		=Target.the("homepageLoginButton").locatedBy("#navbarExample li:nth-child(5)");
	static Target USER_NAME_INPUT_FIELD =Target.the("userNameInputField").locatedBy("input#loginusername");
	static Target PASSWORD_INPUT_FIELD  =Target.the("passwordInputField").locatedBy("input#loginpassword");
	static Target LOGIN_BUTTON_AFTER_ENTERING_CREDENTIALS =	Target.the("loginButtonAfterEnteringCredentials").locatedBy("#logInModal button.btn-primary");
	static Target CLICK_HOME_SECTION_ON_FOOTER			= Target.the("clickHomeSectionOnFooter").locatedBy("#navbarExample li.nav-item:nth-child(1)");
	static Target CLICK_ON_LAPTOPS_SECTION		= Target.the("clickonlaptopsSection").locatedBy(".list-group a:nth-child(3)");
	static Target CLICK_ON_SELECTED_LAPTOP_NAME		= Target.the("click_on_selected_laptop_name").locatedBy("#tbodyid > div:nth-child(1) h4.card-title");
	static Target CLICK_ADD_TO_CART_ON_SELECTED_LAPTOP		= Target.the("click_add_to_cart_on_selected_laptop").locatedBy("#tbodyid a");
	static Target  CLICK_ON_CART_SECTION_ON_FOOTER		= Target.the("click_on_cart_section_on_footer").locatedBy("#navbarExample li.nav-item:nth-child(4)");
	static Target  VERIFY_LAPTOP_NAME_IN_CART 		= Target.the(" verify_laptop_name_in_cart").locatedBy("#tbodyid > tr > td:nth-child(2)");
	static Target  CONFIRM_CLOSE 		= Target.the("confirm_close").locatedBy("#signInModal button.btn-secondary");
	static Target  CLICK_ON_PLACE_ORDER 		= Target.the("click_on_place_order").locatedBy("#page-wrapper button.btn-success");
	static Target  CLICK_ON_LOGOUT 		= Target.the("click_on_logout").locatedBy("#logout2");
	static Target PLACE_ORDER_FORM_NAME_INPUT_FIELD		= Target.the("place_order_form_name_input_field").locatedBy("div.form-group input#name");
	static Target PLACE_ORDER_FORM_COUNTRY_INPUT_FIELD	= Target.the("place_order_form_country_input_field").locatedBy("div.form-group input#country");
	static Target PLACE_ORDER_FORM_CITY_INPUT_FIELD	= Target.the("place_order_form_city_input_field").locatedBy("div.form-group input#city");
	static Target PLACE_ORDER_FORM_MONTH_INPUT_FIELD	= Target.the("place_order_form_month_input_field").locatedBy("div.form-group input#month");
	static Target PLACE_ORDER_FORM_MONTH_YEAR_FIELD	= Target.the("place_order_form_year_input_field").locatedBy("div.form-group input#card");
	static Target PLACE_ORDER_FORM_CREDITCARD_YEAR_FIELD	= Target.the("place_order_form_creditcard_input_field").locatedBy("div.form-group input#year");
	static Target PLACE_ORDER_FORM_CLICK_ON_PURCHASE_BUTTON = Target.the("place_order_form_click_on_purchase_button").locatedBy("#orderModal Button.btn.btn-primary");

}
