package com.assignments.testscripts;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenarioDemo1{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		createUser2();
		createUser3();
		logout();
		user1Login();
		logout();
		user2Login();
		logout();
		user3Login();
		logout();
		login();
		modifyPassword1();
		modifyPassword2();
		modifyPassword3();
		logout();		
		login();
		deleteUser1();
		deleteUser2();
		deleteUser3();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "F:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void minimizeFlyOutWindow()
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

	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
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

	static void createUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Pradeep");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("pradeep21@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("pradeep");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("pradeep21");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("pradeep21");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Sample");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Priya");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("priya22@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("priya");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("priya22");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("priya22");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
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
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Test");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Prem");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("prem23@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("prem");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("prem23");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("prem23");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}

	static void user1Login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("pradeep");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("pradeep21");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void user2Login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("priya");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("priya22");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void user3Login()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("prem");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("pwd")).sendKeys("prem23");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	
	static void modifyPassword1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr/td[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("sundeep21");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("sundeep21");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyPassword2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("priya44");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("priya44");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyPassword3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("prem24");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("prem24");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
	
	static void deleteUser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
	static void deleteUser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
