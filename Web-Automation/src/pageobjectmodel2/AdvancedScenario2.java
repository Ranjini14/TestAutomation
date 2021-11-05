package pageobjectmodel2;





import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenario2 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		logout();
		
		loginuser1();
		createUser2();
		logoutuser1();
		
		loginuser2();
		createUser3();
		logoutuser2();
		
		loginuser3();
		logoutuser3();
		
		loginuser21();
		modifyPassworduser3();
		logoutuser21();
	    loginModifyuser3();
		logoutuser31();
		
		loginuser11();
		modifyPassworduser2();
		logoutuser11();
		loginModifyuser2();
		
		
		loginadmin();
		modifyPassworduser1();
		logoutadmin1();
		loginModifyuser1();
		logoutuser13();
		
		loginuser22();
		deleteUser3();
		logout22();
		
		loginuser33();
		deleteUser2();
		logout33();
       
		loginadmin22();
        deleteUser1();
		logoutadmin22();
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
	
	
	
	static void createUser1()
	{
		try
		{  
			oPage.getUserbutton().click();
			Thread.sleep(2000);
		    oPage.getAdd().click();
		    Thread.sleep(2000);
			oPage.getName1().sendKeys("user1");
			oPage.getName2().sendKeys("demo1");
			oPage.getEmail().sendKeys("demo1@gmail.com");
			oPage.getUserName1().sendKeys("user1");
			oPage.getPassword1().sendKeys("123");
			oPage.getConfirm().sendKeys("123");
			Thread.sleep(2000);
			oPage.getCommit().click();
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
	
	static void loginuser1()
	{
		try
		{
			oPage.getUserid1().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getPwdofuser1().sendKeys("123");
			Thread.sleep(2000);
			oPage.getLoginofuser1().click();
			Thread.sleep(2000);
			oPage.getLoginexplore().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
		static void createUser2()
		{
			try 
			{
			oPage.getUserlist1().click();
			Thread.sleep(2000);				
			oPage.getAdd1().click();
			Thread.sleep(2000);
			oPage. getName7().sendKeys("user2");
			oPage.getName3().sendKeys("demo2");
			oPage.getEmail1().sendKeys("demo2@gmail.com");
			oPage.getUserName2().sendKeys("user2");
			oPage.getPassword2().sendKeys("123");		
			oPage.getConfirm1().sendKeys("123");
			Thread.sleep(2000);
			oPage.getCommit1().click();
			Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void logoutuser1()
		{
			try
			{
				oPage.getLogoutuser1().click();
				Thread.sleep(2000);
						
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		static void loginuser2()
		{
			try
			{
				oPage.getUserid2().sendKeys("user2");
				Thread.sleep(2000);
				oPage.getPwdofuser2().sendKeys("123");
				Thread.sleep(2000);
				oPage.getLoginofuser2().click();
				Thread.sleep(2000);
				oPage.getLoginexplore1().click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void createUser3()
		{
			try
			{
			oPage.getUserlist2().click();
			Thread.sleep(2000);
			oPage.getAdd3().click();
			Thread.sleep(2000);
		    oPage.getName5().sendKeys("user3");
			oPage.getName6().sendKeys("demo3");
			oPage.getEmail3().sendKeys("demo3@gmail.com");
			oPage.getUserName3().sendKeys("user3");
			oPage.getPassword5().sendKeys("123");		
			oPage. getConfirm4().sendKeys("123");
			Thread.sleep(2000);
			oPage.getCommit5().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
		
	static void logoutuser2()
	{
		try
		{
			oPage.getLogoutuser2().click();
			Thread.sleep(2000);
	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginuser3()
	{
		try
		{
			oPage.getUserid3().sendKeys("user3");
			Thread.sleep(2000);
			oPage.getPwdofuser3().sendKeys("123");
			Thread.sleep(2000);
			oPage.getLoginofuser3().click();
			Thread.sleep(2000);
			oPage.getLoginexplore2().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logoutuser3()
	{
		try
		{
			oPage.getLogoutuser3().click();
			Thread.sleep(2000);
	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser21()
	{
		try
		{
			oPage.getUserid21().sendKeys("user2");
			Thread.sleep(2000);
			oPage.getPwdofuser21().sendKeys("123");
			Thread.sleep(2000);
			oPage.getLoginofuser21().click();
			Thread.sleep(2000);
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyPassworduser3()
	{
		try
		{
			
			
			oPage.getUsermodify4().click();
			Thread.sleep(2000);
			oPage.getPwdmodify5().sendKeys("1234");
			oPage.getCopymodify5().sendKeys("1234");
			Thread.sleep(2000);	
			oPage.getChangedmodify5().click();
			Thread.sleep(2000);
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser21()
	{
		try
		{
			oPage.getLogoutuser21().click();
			Thread.sleep(2000);
	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginModifyuser3()
	{
		try
		{
			oPage.getModifiedusername3().sendKeys("user3");
			Thread.sleep(2000);
			oPage.getModifiedPassword3().sendKeys("1234");
			Thread.sleep(2000);
			oPage.getModifiedlogin3().click();
			Thread.sleep(2000);
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser31()
	{
		try
		{
			oPage.getLogoutuser31().click();
			Thread.sleep(2000);
	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser11()
	{
		try
		{
			oPage.getUserid11().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getPwdofuser11().sendKeys("123");
			Thread.sleep(2000);
			oPage.getLoginofuser11().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyPassworduser2()
	{
		try
		{

			oPage.getUsermodify3().click();
			Thread.sleep(2000);
			oPage.getPwdmodify3().sendKeys("1234");;
			oPage.getCopymodify4().sendKeys("1234");
			Thread.sleep(2000);	
			oPage.getChangedmodify4().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser11()
	{
		try
		{
			oPage.getLogoutuser11().click();
			Thread.sleep(2000);
					
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginModifyuser2()
	{
		try
		{
			oPage.getModifiedusername2().sendKeys("user2");
			Thread.sleep(2000);
			oPage.getModifiedPassword2().sendKeys("1234");
			Thread.sleep(2000);
			oPage.getModifiedlogin2().click();
			Thread.sleep(2000);
			oPage.getModifiedlogout2().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void loginadmin()
	{
		try
		{
			oPage.getLoginadmin().sendKeys("admin");
			Thread.sleep(2000);
			oPage.getLoginadminpwd().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLoginadminbtn().click();
			Thread.sleep(2000);
			oPage.getUserlist().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	


	
	static void modifyPassworduser1()
	{
		try
		{
			oPage.getUserbtn1().click();
			Thread.sleep(2000);
			oPage.getUsermodify1().click();
			Thread.sleep(2000);
			oPage.getPwdmodify1().sendKeys("1234");
			oPage.getCopymodify1().sendKeys("1234");
			Thread.sleep(2000);
			oPage.getChangedmodify3().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutadmin1()
	{
		try
		{
			oPage.getLogoutadmin1().click();
			Thread.sleep(2000);
					
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void loginModifyuser1()
	{
		try
		{
			oPage.getModifiedusername1().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getModifiedPassword1().sendKeys("1234");
			Thread.sleep(2000);
			oPage.getModifiedlogin1().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutuser13()
	{
		try
		{
			oPage.getLogoutuser13().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void loginuser22()
	{
		try
		{
			oPage.getUserid22().sendKeys("user2");
			Thread.sleep(2000);
			oPage.getPwdofuser22().sendKeys("123");
			Thread.sleep(2000);
			oPage.getLoginofuser22().click();
			Thread.sleep(2000);
		
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void deleteUser3()
	{
		try
		{

			
			oPage.getDelete5().click();
			Thread.sleep(2000);
			oPage.getDelete6().click();
			Thread.sleep(3000);
			Alert oAlert2=oBrowser.switchTo().alert();
			String str2=oAlert2.getText();
			System.out.println(str2);
			oAlert2.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	
     }
	static void logout22()
	{
		try
		{
			oPage.getLogoutuser22().click();
			Thread.sleep(2000);
	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginuser33()
	{
		try
		{
			oPage.getUserid33().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getPwdofuser33().sendKeys("123");
			Thread.sleep(2000);
			oPage.getLoginofuser33().click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser2()
	{
		try
		{
			oPage.getDelete3().click();
			Thread.sleep(2000);
			oPage.getDelete4().click();
			Thread.sleep(3000);
			Alert oAlert1=oBrowser.switchTo().alert();
			String str1=oAlert1.getText();
			System.out.println(str1);
			oAlert1.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout33()
	{
		try
		{
			oPage.getLogoutuser33().click();
			Thread.sleep(2000);
	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginadmin22()
	{
		try
		{
			oPage.getLoginadmin22().sendKeys("admin");
			Thread.sleep(2000);
			oPage.getLoginadminpwd22().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLoginadminbtn22().click();
			Thread.sleep(2000);
			oPage.getUserlist22().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	
	

	static void deleteUser1()
	{
		try
		{
			oPage.getDelete1().click();
			Thread.sleep(2000);
			oPage.getDelete2().click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logoutadmin22()
	{
		try
		{
			oPage.getLogoutadmin22().click();
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







