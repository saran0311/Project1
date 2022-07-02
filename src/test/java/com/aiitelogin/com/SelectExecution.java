package com.aiitelogin.com;

import com.aiitelocators.login.SelectLocators;
import com.aiitepom.login.BaseClass;

public class SelectExecution extends SelectLocators {
	public static void clickRadiobtn() {
		BaseClass.click(BaseClass.findByXpath(SelectLocators.radiobtn));
	}
	public static void clickContinue() {
		
		BaseClass.click(BaseClass.findByID(SelectLocators.continuebtn));
	}
}

