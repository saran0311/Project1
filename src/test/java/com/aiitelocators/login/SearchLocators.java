package com.aiitelocators.login;

import com.aiitelogin.com.LoginExecution;

public class SearchLocators extends LoginExecution {
	public static String location = "location";  //id
	public static String hotels = "hotels";  //id
	public static String roomtype = "//select[@id='room_type']";   //xpath
	public static String noofrooms ="//select[@name='room_nos']";  //xpath
	public static String checkin = "datepick_in";   //name
	public static String checkout = "datepick_out";  //name
	public static String adultroom = "adult_room";  //id
	public static String childroom = "child_room";  //id
	public static String searchbutton = "//input[@type='submit']"; //xpath
}
