package com.assignmentsonpom.testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDemo6 {
	public static WebDriver oBrowser=null;
	public static ActiTimeDemo oPage=null;
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
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
	static void createCustomer()
	{
		try
		{
			oPage.getCustomer().click();
			Thread.sleep(1000);	
			oPage.getaddnewCustomer().click();
			Thread.sleep(1000);
			oPage.getnewCustomer().click();
			Thread.sleep(1000);
			oPage.getCustomernameField().sendKeys("User");
			Thread.sleep(1000);
			oPage.getcreateCustomer().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createProject()
	{
		try
		{
			oPage.getaddnewProject().click();
			Thread.sleep(1000);
			oPage.getnewProject().click();
			Thread.sleep(1000);
			oPage.getProjectnameField().sendKeys("CustomerProject");;
			Thread.sleep(1000);
			oPage.getcreateProject().click();
			Thread.sleep(1000);
			oPage.getEdit3Button().click();
			Thread.sleep(1000);
		}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
	static void modifyProject()
	{
		try
		{
			oPage.getModifyProject().sendKeys("DemoProject");
			Thread.sleep(1000);
			oPage.getCloseProject().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
		       e.printStackTrace();
		}
	}
			
	static void deleteProject()
	{
		try
		{
			oPage.getEdit3Button().click();
		    Thread.sleep(1000);
			oPage.getaction3Button().click();
			Thread.sleep(1000);	
			oPage.geticondelete1Project().click();
			Thread.sleep(1000);
			oPage.getdelete1Project().click();
			Thread.sleep(1000);
		}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	static void deleteCustomer()
	{
		try
		{
			oPage.getEdit4Button().click();
			Thread.sleep(1000);
			oPage.getaction4Button().click();
			Thread.sleep(1000);
			oPage.geticondelete2Customer().click();
			Thread.sleep(1000);
			oPage.getdelete2Customer().click();
			Thread.sleep(1000);
		}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

