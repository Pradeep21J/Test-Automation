package com.assignmentsonpom.testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDemo2 {
	public static WebDriver oBrowser=null;
	public static ActiTimeDemo oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		//closeApplication();
	}
	
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\\\ExampleAutomation\\\\Automation\\\\Web-Automation\\\\Library\\\\drivers\\\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimeDemo(oBrowser);
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
			Thread.sleep(1000);
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
			Thread.sleep(1000);
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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	static void createUser()
	{
		try
		{
			oPage.getCreate().click();
			Thread.sleep(1000);	
			oPage.getaddUser().click();
			Thread.sleep(1000);
			oPage.getfirstname().sendKeys("user");
			Thread.sleep(1000);
			oPage.getlastname().sendKeys("demo");
			Thread.sleep(1000);
			oPage.getemailfield().sendKeys("userdemo@gmail.com");
			Thread.sleep(1000);
			oPage.getUserName().sendKeys("userdemo");
			Thread.sleep(1000);
			oPage.getPasswordField().sendKeys("sample");
			Thread.sleep(1000);
			oPage.getretypepassword().sendKeys("sample");
			Thread.sleep(1000);
			oPage.getusercreated().click();
			Thread.sleep(1000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser()
	{
		try
		{
			oPage.geticonmodify().click();
			Thread.sleep(1000);	
			oPage.getlastnameField().sendKeys("user1");
			Thread.sleep(1000);	
			oPage.getmodifybutton().click();
			Thread.sleep(1000);	
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteUser()
	{
		try
		{
			oPage.geticondeleteUser().click();
			Thread.sleep(1000);
			oPage.getdeleteUser().click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(1000);
		}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

