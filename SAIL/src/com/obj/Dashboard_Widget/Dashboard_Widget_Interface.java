package com.obj.Dashboard_Widget;

public interface Dashboard_Widget_Interface {
	

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
	
	boolean Is_Teaser_Feed_Enabled();
	
	boolean Is_Teaser_Feed_Displayed();
	
	String Get_Teaser_Feed();
	
	public boolean Is_File_Tab_Enabled();
	
	public boolean Is_File_Tab_Displayed();
	
	public void click_File_tab();
	
	public boolean Is_File_Status_Field_Enabled();
	
	public boolean Is_File_Status_Field_Displayed();
	
	public void Click_File_Status_Field() throws InterruptedException;
	
	public boolean Is_File_Upload_Area_Enabled();
	
	public boolean Is_File_upload_Area_Displayed();
	
	public void Click_File_Upload_Area_With_Image() throws InterruptedException;
	
	public boolean Is_File_Upload_Post_Button_Enabled();
	
	public boolean Is_File_Upload_Post_Button_Displayed();
	
	public void Click_File_Upload_Post_Button() throws InterruptedException;
	
	public boolean Is_File_Tab_Empty_Alert_Enabled();
	
	public boolean Is_File_Tab_Empty_Alert_Displayed();
	
	public void Click_File_Tab_Empty_Alert_Popup();
	
	public boolean Is_Image_Enabled();
	
	public boolean Is_Image_Displayed();
	
	public void Click_Image();
	
	public boolean Is_ThumbNail_Close_Enabled();
	
	public boolean Is_ThumbNail_Close_Displayed();
	
	public void Close_ThumbNail() throws InterruptedException;
	
	public void Wait_To_Image_uploaded();
	
	public boolean Progress_bar_Enabled();
	
	public boolean Progress_bar_Displayed();
	
	public void Click_File_Upload_Area_With_File() throws InterruptedException;
	
	public boolean Is_File_upload_Bar_Close_Button_Is_Enabled() throws InterruptedException;
	
	public boolean Is_File_upload_Bar_Close_Button_Is_Displayed();
	
	public void Click_Close_Button_File_Upload_Bar();
	
	public boolean Is_Empty_Alert_Popup_Enabled();
	
	public boolean Is_Empty_Alert_Popup_Displayed();
	
	public void click_Empty_Alert_Popup_Close();
	
	public void Multiple_File_Upload_Area_With_File() throws InterruptedException;
	
	public boolean Is_Link_Tab_Enabled();
	
	public boolean Is_Link_Tab_Displayed();
	
	public void Click_Link_Tab();
	
	public boolean Is_Link_Text_Field_Enabled();
	
	public boolean Is_Link_Text_Field_Displayed();
	
	public void Click_Link_Text_Field() throws InterruptedException;
	
	public boolean Is_Meta_Description_Enabled();
	
	public boolean Is_Meta_Description_Displayed();
	
	public boolean Is_Meta_Description_Close_button_Enabled();
	
	public boolean Is_Meta_Description_Close_button_Displayed();
	
	public void Click_Meta_Description_Close();
	
	public boolean Is_Feed_Page_Navigation_Enabled();
	
	public boolean Is_Feed_Page_Navigation_Displayed();
	
	public void Click_Feed_Page_Navigation();
	

}
