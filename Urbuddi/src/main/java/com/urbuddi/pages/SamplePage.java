package com.urbuddi.pages;

import com.urbuddi.base.BasePage;

public class SamplePage {
	String ProfileMenu = "css=.btn-profile";
	
	BasePage base;
	
	public void goToProfile() {
		base.elementPresence(ProfileMenu);
	}
}
