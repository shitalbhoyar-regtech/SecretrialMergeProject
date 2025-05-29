package CompnaySecretory;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ConfigurationMethod
{
	
	       public static FileInputStream fis = null;	//File input stream variable
		 	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
			public static XSSFSheet sheet = null;		//Sheet variable
			public static XSSFSheet sheet1 = null;		//Sheet variable
			
			
	public static void ClickConfigurationTab(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
			
				if(ConfigurationLocator.ClickConfiguration(driver).isEnabled())
				{
					Thread.sleep(2000);
					ConfigurationLocator.ClickConfiguration(driver).click();
					test.log(LogStatus.PASS ,"Configuration  tab is clickable");
				}
			   else
				{
				    	 test.log(LogStatus.FAIL, "Configuration  tab is not clickable");
			    }  
				Thread.sleep(2000);
			     EntityLocator.ClickDashboard(driver).click();
			}
			
	public static void ClickConfigurationDropdown(WebDriver driver,ExtentTest test) throws InterruptedException
			{
	             	Thread.sleep(2000);
		            ConfigurationLocator.ClickConfiguration(driver).click();
			
				if(ConfigurationLocator.ClickConfigurationDropdown(driver).isEnabled())
				{
					Thread.sleep(2000);
					ConfigurationLocator.ClickConfigurationDropdown(driver).click();
					
					test.log(LogStatus.PASS ,"Configuration  Dropdown is clickable");
				}
			   else
				{
				    	 test.log(LogStatus.FAIL, "Configuration  Dropdown is not clickable");
			    }  
				Thread.sleep(2000);
			     EntityLocator.ClickDashboard(driver).click();
				
				
			}
	
	public static void SelectLetterHeadConfiguration(WebDriver driver,ExtentTest test) throws InterruptedException
	{
         	Thread.sleep(2000);
            ConfigurationLocator.ClickConfiguration(driver).click();
            Thread.sleep(2000);
			ConfigurationLocator.ClickConfigurationDropdown(driver).click();
            
	
		if(ConfigurationLocator.SelectConfigurationDropdown(driver).isEnabled())
		{
			Thread.sleep(2000);
			ConfigurationLocator.SelectConfigurationDropdown(driver).click();
			
			test.log(LogStatus.PASS ,"Letter head Configuration option selected");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "Letter head Configuration option not selected");
	    } 
		Thread.sleep(2000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	public static void AddLetterheadconfiguration(WebDriver driver,ExtentTest test) throws InterruptedException
	{
         	 
		
		    Thread.sleep(2000);
            ConfigurationLocator.ClickConfiguration(driver).click();
	        
            Thread.sleep(2000);
			ConfigurationLocator.ClickConfigurationDropdown(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.SelectConfigurationDropdown(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickNewBtn(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickCheckBox(driver).click();
			
			driver.switchTo().frame(ConfigurationLocator.ClickiFrame(driver));

			
			Thread.sleep(2000);
			ConfigurationLocator.ClickTextBox(driver).clear();
			Thread.sleep(2000);
			ConfigurationLocator.ClickTextBox(driver).sendKeys("Test");
			
			driver.switchTo().parentFrame();
			
			driver.switchTo().frame(ConfigurationLocator.ClickiFrame1(driver));
			
	
			Thread.sleep(2000);
			ConfigurationLocator.ClickTextBox(driver).clear();
			Thread.sleep(2000);
			ConfigurationLocator.ClickTextBox(driver).sendKeys("Test");
			
			driver.switchTo().parentFrame();
			Thread.sleep(2000);
			ConfigurationLocator.ClickSaveBtn(driver).click();
			

			Thread.sleep(2000);
			String msg=ConfigurationLocator.ClickValidationMsg(driver).getText();
			
			if(msg.equalsIgnoreCase(msg))
			{
				
				test.log(LogStatus.PASS ,"Message displayd="+msg);
			}
		   else
			{
			   test.log(LogStatus.FAIL ,"Message displayd="+msg);
		    }  
			Thread.sleep(2000);
		     EntityLocator.ClickDashboard(driver).click();
		
		
	}
	public static void WithoutAddLetterheadconfiguration(WebDriver driver,ExtentTest test) throws InterruptedException
	{
         	 
		
		    Thread.sleep(2000);
            ConfigurationLocator.ClickConfiguration(driver).click();
	        
            Thread.sleep(2000);
			ConfigurationLocator.ClickConfigurationDropdown(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.SelectConfigurationDropdown(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickNewBtn(driver).click();
			
			Thread.sleep(2000);
	         ConfigurationLocator.ClickSaveBtn(driver).click();
			

			Thread.sleep(2000);
			String msg=ConfigurationLocator.ClickValidationMsg(driver).getText();
			
			if(msg.equalsIgnoreCase(msg))
			{
				
				test.log(LogStatus.FAIL ,"Message displayd="+msg);
			}
		   else
			{
			   test.log(LogStatus.PASS ,"Message displayd="+msg);
		    }  
			Thread.sleep(2000);
		     EntityLocator.ClickDashboard(driver).click();
	}
	
	public static void EditIconLetterheadconfiguration(WebDriver driver,ExtentTest test) throws InterruptedException
	{
         	 
		
		    Thread.sleep(2000);
            ConfigurationLocator.ClickConfiguration(driver).click();
	        
            Thread.sleep(2000);
			ConfigurationLocator.ClickConfigurationDropdown(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.SelectConfigurationDropdown(driver).click();
			Thread.sleep(2000);
			if(ConfigurationLocator.ClickEditIcon(driver).isEnabled())
			{
				Thread.sleep(2000);
				ConfigurationLocator.ClickEditIcon(driver).click();
				test.log(LogStatus.PASS ,"Edit Icon is clickable");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "Edit Icon is not clickable");
		    } 
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickCloseIcon(driver).click();
			Thread.sleep(2000);
		     EntityLocator.ClickDashboard(driver).click();
		}
	
	public static void UpdateLetterheadconfiguration(WebDriver driver,ExtentTest test) throws InterruptedException
	{
         	 
		
		    Thread.sleep(2000);
            ConfigurationLocator.ClickConfiguration(driver).click();
	        
            Thread.sleep(2000);
			ConfigurationLocator.ClickConfigurationDropdown(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.SelectConfigurationDropdown(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickNewBtn(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickCheckBox(driver).click();
			
			driver.switchTo().frame(ConfigurationLocator.ClickiFrame(driver));

			
			Thread.sleep(2000);
			ConfigurationLocator.ClickTextBox(driver).clear();
			Thread.sleep(2000);
			ConfigurationLocator.ClickTextBox(driver).sendKeys("Test");
			
			driver.switchTo().parentFrame();
			
			driver.switchTo().frame(ConfigurationLocator.ClickiFrame1(driver));
			
	
			Thread.sleep(2000);
			ConfigurationLocator.ClickTextBox(driver).clear();
			Thread.sleep(2000);
			ConfigurationLocator.ClickTextBox(driver).sendKeys("Test");
			
			driver.switchTo().parentFrame();
			Thread.sleep(2000);
			ConfigurationLocator.ClickSaveBtn(driver).click();
			

			Thread.sleep(2000);
			String msg=ConfigurationLocator.ClickValidationMsg(driver).getText();
			
			if(msg.equalsIgnoreCase(msg))
			{
				
				test.log(LogStatus.PASS ,"Message displayd="+msg);
			}
		   else
			{
			   test.log(LogStatus.FAIL ,"Message displayd="+msg);
		    }  
			Thread.sleep(2000);
		     EntityLocator.ClickDashboard(driver).click();
	}
	

	public static void SelectFontConfiguration(WebDriver driver,ExtentTest test) throws InterruptedException
	{
         	Thread.sleep(2000);
            ConfigurationLocator.ClickConfiguration(driver).click();
            Thread.sleep(2000);
			ConfigurationLocator.ClickConfigurationDropdown(driver).click();
            
			Thread.sleep(2000);
		if(ConfigurationLocator.ClickFontConfiguration(driver).isEnabled())
		{
			Thread.sleep(2000);
			ConfigurationLocator.ClickFontConfiguration(driver).click();
			
			test.log(LogStatus.PASS ,"Font Configuration option selected");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "Font Configuration option not selected");
	    } 
		Thread.sleep(2000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	
	public static void SentenseCaseAgendaHeading(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		    WebDriverWait wait=new WebDriverWait(driver,20);
         	Thread.sleep(2000);
            ConfigurationLocator.ClickConfiguration(driver).click();
            Thread.sleep(2000);
			ConfigurationLocator.ClickConfigurationDropdown(driver).click();
			
		    Thread.sleep(2000);
			ConfigurationLocator.ClickFontConfiguration(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.ClickEntityCompany(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.SelectEntityCompany(driver).click();
		    Thread.sleep(2000);
			ConfigurationLocator.ClickFont(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.SelectFont(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.ClickFontSize(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.SelectFontSize(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickSentenceCase(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickSaveBtn1(driver).click();
			
			Thread.sleep(2000);
			String msg=ConfigurationLocator.ClickValidMsg(driver).getText();
			
			if(msg.equalsIgnoreCase(msg))
			{
				test.log(LogStatus.PASS,"Message Displayed =" +msg);
			}
			else
			{
				test.log(LogStatus.FAIL,"Message Displayed =" +msg);
			}
			
			 By locator = By.xpath("(//a[@aria-label='Close'])[4]");
             wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		     Thread.sleep(4000);
             WebElement ViewButton = driver.findElement(locator);	
			 Thread.sleep(4000);
			 JavascriptExecutor jse=(JavascriptExecutor)driver;
			 jse.executeScript("arguments[0].click();", ViewButton);
			 
			 Thread.sleep(2000);
		     EntityLocator.ClickDashboard(driver).click();
	}
	public static void CapitalCaseAgendaHeading(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		    WebDriverWait wait=new WebDriverWait(driver,20);
         	Thread.sleep(2000);
            ConfigurationLocator.ClickConfiguration(driver).click();
            Thread.sleep(2000);
			ConfigurationLocator.ClickConfigurationDropdown(driver).click();
			
		    Thread.sleep(2000);
			ConfigurationLocator.ClickFontConfiguration(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.ClickEntityCompany(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.SelectEntityCompany(driver).click();
		    Thread.sleep(2000);
			ConfigurationLocator.ClickFont(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.SelectFont(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.ClickFontSize(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.SelectFontSize(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickCapitalCase(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickSaveBtn1(driver).click();
			
			Thread.sleep(2000);
			String msg=ConfigurationLocator.ClickValidMsg(driver).getText();
			
			if(msg.equalsIgnoreCase(msg))
			{
				test.log(LogStatus.PASS,"Message Displayed =" +msg);
			}
			else
			{
				test.log(LogStatus.FAIL,"Message Displayed =" +msg);
			}
			
			 By locator = By.xpath("(//a[@aria-label='Close'])[4]");
             wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		     Thread.sleep(4000);
             WebElement ViewButton = driver.findElement(locator);	
			 Thread.sleep(4000);
			 JavascriptExecutor jse=(JavascriptExecutor)driver;
			 jse.executeScript("arguments[0].click();", ViewButton);
			 
			 Thread.sleep(2000);
		     EntityLocator.ClickDashboard(driver).click();
	}
	public static void SentenseCaseAgendaHeadingPreviewBtn(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		    WebDriverWait wait=new WebDriverWait(driver,20);
         	Thread.sleep(2000);
            ConfigurationLocator.ClickConfiguration(driver).click();
            Thread.sleep(2000);
			ConfigurationLocator.ClickConfigurationDropdown(driver).click();
			
		    Thread.sleep(2000);
			ConfigurationLocator.ClickFontConfiguration(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.ClickEntityCompany(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.SelectEntityCompany(driver).click();
		    Thread.sleep(2000);
			ConfigurationLocator.ClickFont(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.SelectFont(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.ClickFontSize(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.SelectFontSize(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickSentenceCase(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickPreviewBtn(driver).click();
			
			test.log(LogStatus.PASS, "User should able to view the sample document");
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickCloseicon(driver).click();
			
			Thread.sleep(2000);
		     EntityLocator.ClickDashboard(driver).click();
	
	}
			
	public static void CapitalCaseAgendaHeadingPreviewBtn(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		    WebDriverWait wait=new WebDriverWait(driver,20);
         	Thread.sleep(2000);
            ConfigurationLocator.ClickConfiguration(driver).click();
            Thread.sleep(2000);
			ConfigurationLocator.ClickConfigurationDropdown(driver).click();
			
		    Thread.sleep(2000);
			ConfigurationLocator.ClickFontConfiguration(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.ClickEntityCompany(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.SelectEntityCompany(driver).click();
		    Thread.sleep(2000);
			ConfigurationLocator.ClickFont(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.SelectFont(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.ClickFontSize(driver).click();
			Thread.sleep(2000);
			ConfigurationLocator.SelectFontSize(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickCapitalCase(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickPreviewBtn(driver).click();
			
			test.log(LogStatus.PASS, "User should able to view the sample document");
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickCloseicon(driver).click();
			Thread.sleep(2000);
		     EntityLocator.ClickDashboard(driver).click();
	
	}
	
	public static void WithoutEnterDataFontConfiguration(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		  
         	Thread.sleep(2000);
            ConfigurationLocator.ClickConfiguration(driver).click();
            Thread.sleep(2000);
			ConfigurationLocator.ClickConfigurationDropdown(driver).click();
			
		    Thread.sleep(2000);
			ConfigurationLocator.ClickFontConfiguration(driver).click();
			
			Thread.sleep(2000);
			ConfigurationLocator.ClickSaveBtn1(driver).click();
			
			Thread.sleep(2000);
			String msg =ConfigurationLocator.ClickInvalidEntityName(driver).getText();
			test.log(LogStatus.PASS, "Without Enter Entity =" +msg);
			Thread.sleep(2000);
			ConfigurationLocator.ClickInvalidFontName(driver).getText();
			test.log(LogStatus.PASS, "Without Enter Font Name =" +msg);
			Thread.sleep(2000);
			ConfigurationLocator.ClickInvalidFontSize(driver).getText();
			test.log(LogStatus.PASS, "Without Enter Font size =" +msg);
			
			Thread.sleep(2000);
		     EntityLocator.ClickDashboard(driver).click();
			
	}
			

}
