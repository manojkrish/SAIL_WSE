package com.obj.Edit_Status;

public interface Sail_Interface_Edit_Option {
	
	public boolean Is_Logged_In_User_Name_IsEnabled();
	
	public boolean Is_Logged_In_User_Name_IsDisplayed();
	
	String Get_Logged_In_UserName();
	
	public boolean Is_Logged_In_Feed_Name_IsEnabled();
		
	public boolean Is_Logged_In_Feed_Name_IsDisplayed();
	
	String Get_Feed_Name();
	
	public boolean Is_Post_Feed_Enabled();
	
	public boolean Is_Post_Feed_Displayed();
	
	void Click_Post_Feed_Option();
	
	public boolean Is_Edit_option_Enabled();
	
	public boolean Is_Edit_Option_Displayed();
	
	void Click_Edit_Option();
	
	void Clear_Text_Field() throws InterruptedException;
	
	public boolean Is_Done_Button_Enabled() throws InterruptedException;
	
	public boolean Is_Done_Button_Displayed();
	
	public boolean Is_Cancel_Button_Enabled() throws InterruptedException;

	public boolean Is_Cancel_Button_Displayed();
	
	void Click_Done_Button() throws InterruptedException;
	
	void Click_Cancel_Button();
	
	public boolean Is_Empty_Alert_Popup_Enabled();
	
	public boolean Is_Empty_Alert_Popup_Displayed();
	
	void Insert_Text_In_Edit();
	
	public boolean Is_Content_Before_Edit_Enabled();
	
	public boolean Is_Content_Before_Edit_Displayed();
	
	public String Get_Content_Before_Edit();
	
	public boolean Is_Content_After_Edit_Enabled();
	
	public boolean Is_Content_After_Edit_Displayed();
	
	public String Get_Content_After_Edit();
	
	public boolean Is_Edited_History_tag_Enabled();
	
	public boolean Is_Edited_History_tag_Displayed();
	
	public void click_Edited_History_tag();
	
	public boolean Is_Edited_history_popup_enabled();
	
	public boolean Is_Edited_history_popup_displayed();
	
	public String Get_Edited_History_Popup_Header();
	
	public void Close_Edited_History_Popup();
	
	public boolean Is_View_More_Enabled();
	
	public boolean Is_view_more_Displayed();
	
	public void click_View_More();
	
	public String Get_Edited_History_Content();
	
	public boolean Is_Delete_Enabled();
	
	public boolean Is_Delete_Displayed();
	
	public void Click_Delete();
	
	public boolean Is_delete_Popup_Enabled();
	
	public boolean Is_delete_Popup_Displayed();
	
	public String Get_popup();
	
	public void Click_Delete_button();
	
	
	
	
	
	
	
	
	
	
}
