package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//User Name WebElement
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}

	//Password WebElement
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button WebElement
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//Minimize flyOut Window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Logout link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	//createUser 
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement oUserbutten;
	public WebElement getUserbutton()
	{
		return oUserbutten;
	}
	@FindBy(xpath="//*[@id='createUserDiv']/div/div[2]")
	private WebElement oAdduser;
	public WebElement getAdd()
	{
		return oAdduser;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_firstNameField']")
	private WebElement oName1;
	public WebElement getName1()
	{
		return oName1;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement oName2;
	public WebElement getName2()
	{
		return oName2;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement oEmail;
	public WebElement getEmail()
	{
		return oEmail;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_usernameField\']")
	private WebElement oUserName;
	public WebElement getUserName1()
	{
		return oUserName;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement oPassword1;
	public WebElement getPassword1()
	{
		return oPassword1;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement oConfirmP;
	public WebElement getConfirm()
	{
		return oConfirmP;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement oCommit;
	public WebElement getCommit()
	{
		return oCommit;
	}
	//createUser2
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement oAdduser1;
	public WebElement getAdd1()
	{
		return oAdduser1;
	}
	
	private WebElement userDataLightBox_firstNameField;
	public WebElement getName7()
	{
		return userDataLightBox_firstNameField;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement oName3;
	public WebElement getName3()
	{
		return oName3;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement oEmail1;
	public WebElement getEmail1()
	{
		return oEmail1;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_usernameField\']")
	private WebElement oUserName1;
	public WebElement getUserName2()
	{
		return oUserName1;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement oPassword2;
	public WebElement getPassword2()
	{
		return oPassword2;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement oConfirmP1;
	public WebElement getConfirm1()
	{
		return oConfirmP1;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement oCommit1;
	public WebElement getCommit1()
	{
		return oCommit1;
	}
	//createUser3
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement oAdduser3;
	public WebElement getAdd3()
	{
		return oAdduser3;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_firstNameField']")
	private WebElement oName5;
	public WebElement getName5()
	{
		return oName5;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_lastNameField\']")
	private WebElement oName6;
	public WebElement getName6()
	{
		return oName6;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_emailField\']")
	private WebElement oEmail3;
	public WebElement getEmail3()
	{
		return oEmail3;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_usernameField\']")
	private WebElement oUserName3;
	public WebElement getUserName3()
	{
		return oUserName3;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement oPassword5;
	public WebElement getPassword5()
	{
		return oPassword5;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement oConfirmP4;
	public WebElement getConfirm4()
	{
		return oConfirmP4;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement oCommit5;
	public WebElement getCommit5()
	{
		return oCommit5;
	}
	
	//deleteUser
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement oDelete1;
	public WebElement getDelete1()
	{
		return oDelete1;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement oDelete2;
	public WebElement getDelete2()
	{
		return oDelete2;
	}
	//deleteUser2
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
	private WebElement oDelete3;
	public WebElement getDelete3()
	{
		return oDelete3;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement oDelete4;
	public WebElement getDelete4()
	{
		return oDelete4;
	}
	//deleteUser3
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
	private WebElement oDelete5;
	public WebElement getDelete5()
	{
		return oDelete3;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_deleteBtn\']")
	private WebElement oDelete6;
	public WebElement getDelete6()
	{
		return oDelete6;
	}
	//loginadmin
	@FindBy(xpath="//*[@id=\'username\']")
	private WebElement oLoginadmin;
	public WebElement getLoginadmin()
	{
		return oLoginadmin;
	}
	@FindBy(xpath="//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
	private WebElement oLoginadminpwd;
	public WebElement getLoginadminpwd()
	{
		return oLoginadminpwd;
	}
	@FindBy(xpath="//*[@id=\"loginButton\"]/div")
	private WebElement oLoginadminbtn;
	public WebElement getLoginadminbtn()
	{
		return oLoginadminbtn;
	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement oUserlist;
	public WebElement getUserlist()
	{
		return oUserlist;
	}
	
	
	
	
	//modifyUser
	@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]/div[1]")
	private WebElement oModify;
	public WebElement getmodifybtn()
	{
		return oModify;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
	private WebElement oChangepwd;
	public WebElement getChangepwd()
	{
		return oChangepwd;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
	private WebElement oCopypwd;
	public WebElement getCopypwd()
	{
		return oCopypwd;
	}
	
	
    @FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
    private WebElement oSavechanges;
    public WebElement getsavechanges()
    {
    	return oSavechanges;
    }
    //createCustomer
    @FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a")
    private WebElement oTaskbtn;
    public WebElement getoTaskbtn()
    {
    	return oTaskbtn;
    }
    @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
    private WebElement oAddcustomer ;
    public WebElement getAddcustomer()
    {
    	return oAddcustomer;
    }
    @FindBy(xpath="/html/body/div[14]/div[1]")
    private WebElement oCreatecustomer;
    public WebElement getCreatecustomer()
    {
    	return oCreatecustomer;
    }
    @FindBy(xpath="//*[@id=\'customerLightBox_nameField\']")
    private WebElement oCustomername;
    public WebElement  getCustomername()
    {
    	return oCustomername;
    }
    @FindBy(xpath="//*[@id=\'customerLightBox_commitBtn\']/div/span")
    private WebElement oCommitbtn;
    public WebElement  getCommitbtn()
    {
    	return oCommitbtn;
    }
    //deleteCustomer
    @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
    private WebElement oSettingbtn;
    public WebElement getSettingbtn()
    {
    	return oSettingbtn;
    }
    @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
    private WebElement oActionbtn;
    public WebElement  getActionbtn()
    {
    	return oActionbtn;
    }@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")
    private WebElement oDeletecustomer;
    public WebElement  getDeletecustomer()
    {
    	return oDeletecustomer;
    }
    @FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
    private WebElement oDeleteconfirm;
    public WebElement  getDeleteconfirm()
    {
    	return oDeleteconfirm;
    }
    //modifyCustomer
    @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
    private WebElement oSettingbtn1 ;
    public WebElement getSettingbtn1()
    {
    	return oSettingbtn1;
    }
    @FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
    private WebElement oDescriptionbtn ;
    public WebElement getDescriptionbtn()
    {
    	return oDescriptionbtn;
    }
    @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
    private WebElement oModifycustomer;
    public WebElement getModifycustomer()
    {
    	return oModifycustomer;
    }
   //createProject
    @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
    private WebElement oAddprojectbtn;
    public WebElement getAddprojectbtn()
    {
    	return oAddprojectbtn;
    }
    @FindBy(xpath="/html/body/div[14]/div[2]")
    private WebElement oProjectbtn;
    public WebElement getProjectbtn()
    {
    	return oProjectbtn;
    }
    @FindBy(xpath="//*[@id=\'projectPopup_projectNameField\']")
    private WebElement oProjectname ;
    public WebElement getProjectname()
    {
    	return oProjectname;
    }
    @FindBy(xpath="//*[@id=\'projectPopup_commitBtn\']/div/span")
    private WebElement oCreateproject;
    public WebElement getCreateproject()
    {
    	return oCreateproject ;
    }
    //deleteProject
    @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
    private WebElement oSettingbtn2 ;
    public WebElement getSettingbtn2()
    {
    	return oSettingbtn2 ;
    
    }
    @FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
    private WebElement oActionbtn2;
    public WebElement getActionbtn2()
    {
    	return oActionbtn2 ;
    }
    @FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
    private WebElement oDeleteproject;
    public WebElement getDeleteproject()
    {
    	return oDeleteproject ;
    }
    @FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
    private WebElement oDeleteconfirmproject ;
    public WebElement getDeleteconfirmproject()
    {
    	return oDeleteconfirmproject ;
    }
    //modifyProject
    @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
    private WebElement oSettingprojectbtn3 ;
    public WebElement getSettingprojecbtn()
    {
    	return oSettingprojectbtn3 ;
    }
    @FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
    private WebElement oDescriptionproject;
    public WebElement getDescriptionproject()
    {
    	return oDescriptionproject;
    }
    @FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
    private WebElement oModifyproject ;
    public WebElement getModifyproject()
    {
    	return oModifyproject;
    }
    //createTasks
    @FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
    private WebElement oAddtasksbtn;
    public WebElement getAddtasksbtn()
    {
    	return oAddtasksbtn;
    }
    @FindBy(xpath="/html/body/div[13]/div[1]")
    private WebElement oCreatetasksbtn; ;
    public WebElement getCreatetasksbtn()
    {
    	return oCreatetasksbtn;
    }
    @FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
    private WebElement oTasksname ;
    public WebElement getTasksname()
    {
    	return oTasksname;
    }
    @FindBy(xpath="//*[@id=\'createTasksPopup_commitBtn\']/div/span")
    private WebElement oCreateTasks ;
    public WebElement getCreateTasks()
    {
    	return oCreateTasks;
    }
   //deleteTasks
    @FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
    private WebElement oSettingtaskbtn;
    public WebElement getSettingtaskbtn()
    {
    	return oSettingtaskbtn;
    }
    @FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
    private WebElement oActionbtn4;
    public WebElement getActionbtn4()
    {
    	return oActionbtn4;
    }
    @FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
    private WebElement oDeletetask;
    public WebElement getDeletetask()
    {
    	return oDeletetask;
    }
    @FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")
    private WebElement oConfirmdeletetask;
    public WebElement getConfirmdeletetask()
    {
    	return oConfirmdeletetask;
    }
  
//loginuser1
@FindBy(xpath="//*[@id=\'username\']")
private WebElement oUserid1;
public WebElement getUserid1()
{
	return oUserid1 ;
}
@FindBy(xpath="//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement oPwdofUser1;
public WebElement getPwdofuser1()
{
	return oPwdofUser1;
}
@FindBy(xpath="//*[@id=\'loginButton\']/div")
private WebElement oLoginofuser1;
public WebElement getLoginofuser1()
{
	return oLoginofuser1;
}
@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")
private WebElement oLoginexplore;
public WebElement getLoginexplore()
{
	return oLoginexplore;
}
//logoutuser1
@FindBy(xpath="//*[@id=\'logoutLink\']")
private WebElement oLogoutuser1;
public WebElement getLogoutuser1()
{
	return oLogoutuser1;
}
//loginuser2
@FindBy(xpath="//*[@id=\'username\']")
private WebElement oUserid2;
public WebElement getUserid2()
{
	return oUserid2 ;
}
@FindBy(xpath="//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement oPwdofUser2;
public WebElement getPwdofuser2()
{
	return oPwdofUser2;
}
@FindBy(xpath="//*[@id=\'loginButton\']/div")
private WebElement oLoginofuser2;
public WebElement getLoginofuser2()
{
	return oLoginofuser2;
}
@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")
private WebElement oLoginexplore1;
public WebElement getLoginexplore1()
{
	return oLoginexplore1;
}
//logoutuser2
@FindBy(xpath="//*[@id=\'logoutLink\']")
private WebElement oLogoutuser2;
public WebElement getLogoutuser2()
{
	return oLogoutuser2;
}
//loginuser3
@FindBy(xpath="//*[@id=\'username\']")
private WebElement oUserid3;
public WebElement getUserid3()
{
	return oUserid3 ;
}
@FindBy(xpath="//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement oPwdofUser3;
public WebElement getPwdofuser3()
{
	return oPwdofUser3;
}
@FindBy(xpath="//*[@id=\'loginButton\']/div")
private WebElement oLoginofuser3;
public WebElement getLoginofuser3()
{
	return oLoginofuser3;
}
@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")
private WebElement oLoginexplore2;
public WebElement getLoginexplore2()
{
	return oLoginexplore2;
}
//logoutuser3
@FindBy(xpath="//*[@id=\'logoutLink\']")
private WebElement oLogoutuser3;
public WebElement getLogoutuser3()
{
	return oLogoutuser3;
}
//modifyPassworduser1
@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")
private WebElement oUserbtn1;
public WebElement getUserbtn1()
{
	return oUserbtn1;
}
@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr/td[1]/div/table/tbody/tr/td/div[1]")
private WebElement oUsermodify1;
public WebElement getUsermodify1()
{
	return oUsermodify1;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
private WebElement oPwdmodify1;
public WebElement getPwdmodify1()
{
	return oPwdmodify1;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
private WebElement oCopymodify1;
public WebElement getCopymodify1()
{
	return oCopymodify1;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
private WebElement oChangedmodify3;
public WebElement getChangedmodify3()
{
	return oChangedmodify3;
}
//modifyPassworduser2
@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
private WebElement oUsermodify3;
public WebElement getUsermodify3()
{
	return oUsermodify3;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
private WebElement oPwdmodify3;
public WebElement getPwdmodify3()
{
	return oPwdmodify3;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
private WebElement oCopymodify4;
public WebElement getCopymodify4()
{
	return oCopymodify4;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
private WebElement oChangedmodify4;
public WebElement getChangedmodify4()
{
	return oChangedmodify4;
}
//modifyPassworduser3
@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[2]")
private WebElement oUsermodify4;
public WebElement getUsermodify4()
{
	return oUsermodify4;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordField\']")
private WebElement oPwdmodify5;
public WebElement getPwdmodify5()
{
	return oPwdmodify5;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_passwordCopyField\']")
private WebElement oCopymodify5;
public WebElement getCopymodify5()
{
	return oCopymodify5;
}
@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
private WebElement oChangedmodify5;
public WebElement getChangedmodify5()
{
	return oChangedmodify5;
}
}
    


