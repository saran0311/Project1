package com.aiitelogin.com;

import com.aiitelocators.login.BookingLocators;
import com.aiitepom.login.BaseClass;

public class BookingExecution extends BookingLocators {
	public static void firstname() {
			BaseClass.typeData(BaseClass.findByName(BookingLocators.firstname), BaseClass.excelRead(8, 2));
		}
		public static void lastname() {
			BaseClass.typeData(BaseClass.findByName(BookingLocators.lastname), BaseClass.excelRead(9, 2));
		}
		public static void address() {
			BaseClass.typeData(BaseClass.findByXpath(BookingLocators.address), BaseClass.excelRead(10, 2));
		}
		public static void cardnumber() {
			BaseClass.typeData(BaseClass.findByID(BookingLocators.cardnumber), BaseClass.excelRead(11, 3));
		}
		public static void cardtype() {
			BaseClass.typeData(BaseClass.findByID(BookingLocators.cardtype), BaseClass.excelRead(12, 3));
		}
		public static void month() {
			BaseClass.typeData(BaseClass.findByID(BookingLocators.month), BaseClass.excelRead(13, 2));
		}
		public static void year() {
			BaseClass.typeData(BaseClass.findByID(BookingLocators.year), BaseClass.excelRead(13, 3));
		}
		public static void cvv() {
			BaseClass.typeData(BaseClass.findByName(BookingLocators.cvv), BaseClass.excelRead(14, 2));
		}
		public static void bookbtn() {
			BaseClass.click(BaseClass.findByXpath(BookingLocators.bookbtn));
		}
		public static void orderno() {
			BaseClass.scroll(0, 1500);
			String attribute = BaseClass.getAttribute(BaseClass.findByID(BookingLocators.orderno), "value");
			BaseClass.excelWrite(attribute);
		}
	}
	
