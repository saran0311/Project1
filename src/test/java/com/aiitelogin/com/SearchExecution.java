package com.aiitelogin.com;

import com.aiitelocators.login.SearchLocators;
import com.aiitepom.login.BaseClass;

public class SearchExecution extends SearchLocators {
	public static void location() {
		BaseClass.typeData(BaseClass.findByID(SearchLocators.location), BaseClass.excelRead(1, 2));
	}
public static void hotels() {
	BaseClass.typeData(BaseClass.findByID(SearchLocators.hotels), BaseClass.excelRead(2, 2));
}
public static void roomtype() {
	BaseClass.typeData(BaseClass.findByXpath(SearchLocators.roomtype), BaseClass.excelRead(3, 2));
}
public static void noofrooms() {
	BaseClass.typeData(BaseClass.findByXpath(SearchLocators.noofrooms), BaseClass.excelRead(4, 2));
}
public static void checkin() {
	BaseClass.clear(findByName(SearchLocators.checkin));
	BaseClass.typeData(BaseClass.findByName(SearchLocators.checkin), BaseClass.excelRead(5, 2));
	
}
public static void checkout() {
	BaseClass.clear(findByName(SearchLocators.checkout));
	BaseClass.typeData(BaseClass.findByName(SearchLocators.checkout), BaseClass.excelRead(5, 3));
}
public static void adultroom() {
	BaseClass.typeData(BaseClass.findByID(SearchLocators.adultroom), BaseClass.excelRead(6, 2));
}
public static void childroom() {
	BaseClass.typeData(BaseClass.findByID(SearchLocators.childroom), BaseClass.excelRead(7, 2));
}
public static void searchbutton() {
	click(BaseClass.findByXpath(SearchLocators.searchbutton));
}
}
