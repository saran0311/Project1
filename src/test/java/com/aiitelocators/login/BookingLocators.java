package com.aiitelocators.login;
import org.openqa.selenium.WebElement;

import com.aiitelogin.com.SelectExecution;

public class BookingLocators extends SelectExecution {
	public static String firstname = "first_name"; //name
	public static String lastname = "last_name"; //name
	public static String address = "//textarea[@name='address']"; //xpath
	public static String cardnumber = "cc_num"; //id
	public static String cardtype = "cc_type"; //id
	public static String month = "cc_exp_month"; //id
	public static String year = "cc_exp_year"; //id
	public static String cvv = "cc_cvv"; //name
	public static String bookbtn = "//input[@id='book_now']"; //xpath
	public static String orderno = "order_no"; //id
}
