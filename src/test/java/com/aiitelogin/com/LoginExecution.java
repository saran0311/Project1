package com.aiitelogin.com;

import com.aiitelocators.login.LoginLocators;
import com.aiitepom.login.BaseClass;

public class LoginExecution extends LoginLocators {
	public static void username() {
		BaseClass.typeData(BaseClass.findByID(LoginLocators.username), BaseClass.propertiesfile("userid"));
	}
	public static void password() {	
		BaseClass.typeData(BaseClass.findByID(LoginLocators.password), BaseClass.propertiesfile("password"));
	}
	public static void login() {
		BaseClass.click(BaseClass.findByID(LoginLocators.login));
	}
	}
