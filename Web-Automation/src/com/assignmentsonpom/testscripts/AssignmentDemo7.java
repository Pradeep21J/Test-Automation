package com.assignmentsonpom.testscripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDemo7 {
	public static WebDriver oBrowser=null;
	public static ActiTimeDemo oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
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
		}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
	static void createTask()
	{
		try
		{
			oPage.getAddnewTask().click();
			Thread.sleep(1000);
			oPage.getnewTask().click();
			Thread.sleep(1000);
			oPage.getTaskField().sendKeys("TestDemo");
			Thread.sleep(1000);
			oPage.getCreateTask().click();
			Thread.sleep(1000);
			oPage.getTaskButton().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
		       e.printStackTrace();
		}
	}
	
	static void deleteTask()
	{
		try
		{		
			oPage.getActionTask().click();
			Thread.sleep(1000);
			oPage.geticonDeleteTask().click();
			Thread.sleep(1000);
			oPage.getDeleteTask().click();
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
			oPage.getEdit2Button().click();
			Thread.sleep(1000);
			oPage.getaction2Button().click();
			Thread.sleep(1000);
			oPage.geticondeleteProject().click();
			Thread.sleep(1000);
			oPage.getdeleteProject().click();
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
			oPage.getEdit1Button().click();
			Thread.sleep(1000);
			oPage.getaction1Button().click();
			Thread.sleep(1000);
			oPage.geticondelete1Customer().click();
			Thread.sleep(1000);
			oPage.getdelete1Customer().click();
			Thread.sleep(1000);
		}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

