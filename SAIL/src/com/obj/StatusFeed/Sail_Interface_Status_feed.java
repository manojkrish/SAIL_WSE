package com.obj.StatusFeed;

public interface Sail_Interface_Status_feed 
{

	boolean Is_Status_Feed_Enabled();
	
	boolean Is_Profile_Image_Enabled();
	
	boolean Is_Profile_Image_Displayed();
	
	boolean Is_Status_feed_Text_Field_Enabled();
	
	boolean Is_Status_feed_Text_Field_Displayed();
	
	boolean IsStatus_feed_Place_Holder_Enabled();
	
	boolean IsStatus_feed_Place_Holder_Displayed();
	
	void EmptyStatus();
	
	boolean IsEmpty_Status_Alert_Enabled();
	
	boolean IsEmpty_Status_Alert_Displayed();
	
	void close_Empty_Alert();
	
	void Insert_Empty_Feed();
	
	boolean IsStatus_Post_Button_Enabled();
	
	boolean IsStatus_Post_Button_Displayed();
	
	void Click_Post_Button();
	
	boolean Is_Privacy_Drop_Down_Enabled();
	
	boolean Is_Privacy_Drop_Down_Displayed();
	
	boolean Is_EveryOne_Option_Enabled();
	
	boolean Is_EveryOne_Option_Displayed();
	
	boolean Is_MyFriend_Option_Enabled();
	
	boolean Is_MyFriend_Option_Displayed();
	
	void SelectEveryone();
	
	void SelectMyFriend();
	
	void Insert_Text_In_The_Feed();
	
	boolean Is_Logged_In_UserName_Enabled();
	
	boolean Is_Logged_In_UserName_Displayed();
	
	String Get_Logged_UserName();
	
	boolean Is_Feed_In_UserName_Enabled();
	
	boolean Is_Feed_In_UserName_Displayed();
	
	String Get_Feed_UserName();
	
	boolean Is_Time_Stamp_Enabled();
	
	boolean Is_Time_Stamp_Displayed();
	
	String Get_Time_Stamp();
	
	void Scrolling_The_Page();
	
}
