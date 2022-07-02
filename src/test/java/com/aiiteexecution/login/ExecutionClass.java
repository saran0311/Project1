package com.aiiteexecution.login;

import com.aiitelogin.com.BookingExecution;

public class ExecutionClass  extends BookingExecution {
	public void test() {
		loadDriver();
		loadurl(propertiesfile("url"));
		username();
		password();
		login();
		location();
		hotels();
		roomtype();
		noofrooms();
		checkin();
		checkout();
		adultroom();
		childroom();
		searchbutton();
		clickRadiobtn();
		clickContinue();
		firstname();
		lastname();
		address();
		cardnumber();
		cardtype();
		month();
		year();
		cvv();
		bookbtn();
		orderno();
		close();
	}
}

