package com.sgtesting.testscripts;


import java.time.Duration;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AdvancedScenario2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createUser1();
		createUser2();
		createUser3();
		loginUser3();
		modifyUser3();
		loginModifyUser3();
		modifyUser2();
		loginModifyUser2();
		modifyUser1();
		loginModifyUser1();
		deleteUser3();
		deleteUser2();
		deleteUser1();
		closeApplication();
		
		}

	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Example Automation\\\\\\\\Automation\\\\\\\\Web-Automation\\\\\\\\Library\\\\\\\\drivers\\\\\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch (Exception e)
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
		oBrowser.findElement(By.name("username")).sendKeys("admin");
		Thread.sleep(2000);
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void minimizeFlyoutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo1");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user1");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user1");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo1@gamil.com");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);			
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo2");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user2");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user2");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo2@gamil.com");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(7000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo3");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("user3");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user3");
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo3@gamil.com");
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123");
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(7000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
		
	static void loginUser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginModifyUser3()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser2()
	{
		try
		{
		oBrowser.findElement(By.name("username")).sendKeys("user1");
		Thread.sleep(2000);
		oBrowser.findElement(By.name("pwd")).sendKeys("123");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(4000);
		oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
		Thread.sleep(2000);			
		oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
		
		oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
		
		oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
		}
	static void loginModifyUser2()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void modifyUser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);			
			
			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[2]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("1234");
			Thread.sleep(2000);			
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("1234");
			Thread.sleep(2000);			
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginModifyUser1()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
	        Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("1234");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[2]")).click();
			Thread.sleep(2000);			
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			    String str=oAlert.getText();
			    System.out.println(str);
			    oAlert.accept();
			    Thread.sleep(3000);
			    oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("user1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input")).sendKeys("1234");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);			
	        oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);                            
			                                                                                                                      
			
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			 Alert oAlert=oBrowser.switchTo().alert();
			    String str=oAlert.getText();
			    System.out.println(str);
			    oAlert.accept();
			    Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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
			oBrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);			
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			 Alert oAlert=oBrowser.switchTo().alert();
			    String str=oAlert.getText();
			    System.out.println(str);
			    oAlert.accept();
			    Thread.sleep(3000);
			    oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
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




