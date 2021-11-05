package pageobjectmodel;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
		logout();
		//closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\\\Example Automation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	
	
	static void createCustomer()
	{
		try
		{  
			oPage.getoTaskbtn().click();
			Thread.sleep(2000);
		    oPage.getAddcustomer().click();
		    Thread.sleep(2000);
			oPage.getCreatecustomer().click();
			Thread.sleep(2000);
			oPage. getCustomername().sendKeys("user");
			Thread.sleep(2000);
			oPage.getCommitbtn().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createProject()
	{
		try
		{
			oPage.getAddprojectbtn().click();
			Thread.sleep(2000);
		    oPage.getProjectbtn().click();
		    Thread.sleep(2000);
			oPage.getProjectname().sendKeys("automation");
			Thread.sleep(2000);		
			oPage. getCreateproject().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyProject()
	{
		try
		{
			oPage. getSettingprojecbtn().click();
			Thread.sleep(2000);
			oPage.getDescriptionproject().sendKeys("selenium");
			Thread.sleep(2000);
			oPage.getModifyproject().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteProject()
	{
		try
		{
			oPage.getSettingbtn2().click();
			Thread.sleep(2000);
		    oPage.getActionbtn2().click();
		    Thread.sleep(2000);
			oPage.getDeleteproject().click();
			Thread.sleep(2000);
			oPage.getDeleteconfirmproject().click();
			Thread.sleep(2000);
		
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void deleteCustomer()
	{
		try
		{
			oPage.getSettingbtn().click();
			Thread.sleep(2000);
			oPage.getActionbtn().click();
			Thread.sleep(2000);
			oPage. getDeletecustomer().click();
			Thread.sleep(2000);
			oPage. getDeleteconfirm().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	
     }
	static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void closeApplication()
	{
		
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
}



