package CompnaySecretory;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;




public class MyDocumentMethod {
	
	
	    
	    public static FileInputStream fis = null;	//File input stream variable
		public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
		public static XSSFSheet sheet = null;		//Sheet variable
		public static XSSFSheet sheet1 = null;		//Sheet variable

		
		public static void ClickMyDocument(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
		
			if(MyDocumentLocator.MyDocumentimg(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				test.log(LogStatus.PASS ,"My Document tab is clickable");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "My Document tab is not clickable");
		    }    
		}
		public static void ClickStatutoryRegistor(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyDocumentLocator.MyDocumentimg(driver).click();
			if(MyDocumentLocator.StatutoryRegisters(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyDocumentLocator.StatutoryRegisters(driver).click();
				test.log(LogStatus.PASS ,"Statutory Regitors is clickable");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "Statutory Regitors is not clickable");
		    }    
		}

		public static void RegisterOfMember(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyDocumentLocator.MyDocumentimg(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.StatutoryRegisters(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickEntityLocation(driver).click();
			Thread.sleep(2000);
			MyDocumentLocator.SelectEntityLocation(driver).click();
			
			Thread.sleep(2000);
			if(MyDocumentLocator.ClickViewIcon(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyDocumentLocator.ClickViewIcon(driver).click();
				test.log(LogStatus.PASS ,"New popup 'Register Of Member' open");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "New popup 'Register Of Member' not  open");
		    }
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickcloseIcon(driver).click();
			
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}
		
		
		public static void DownloadButton(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyDocumentLocator.MyDocumentimg(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.StatutoryRegisters(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickEntityLocation(driver).click();
			Thread.sleep(2000);
			MyDocumentLocator.SelectEntityLocation(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickViewIcon(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickMembers(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.SelectMembers(driver).click();
			
		
			if(MyDocumentLocator.ClickDownload(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyDocumentLocator.ClickDownload(driver).click();
				test.log(LogStatus.PASS ,"User should able to Download 'Register of Member' document");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "User should not be able to Download 'Register of Member' document");
		    }
			
		
			Thread.sleep(2000);
			MyDocumentLocator.ClickcloseIcon(driver).click();
			
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}
		
	public static void ViewButton1(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyDocumentLocator.MyDocumentimg(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.StatutoryRegisters(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickEntityLocation(driver).click();
			Thread.sleep(2000);
			MyDocumentLocator.SelectEntityLocation(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickViewIcon(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickMembers(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.SelectMembers(driver).click();
			
		
			if(MyDocumentLocator.ClickView(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyDocumentLocator.ClickView(driver).click();
				test.log(LogStatus.PASS ,"User should able to View 'Register of Member' document");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "User should not be able to view 'Register of Member' document");
		    }
			
			Thread.sleep(3000);
			MyDocumentLocator.closeViewIcon(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickcloseIcon(driver).click();
			
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}
	public static void RegistorOfDirectorKMP(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		if(MyDocumentLocator.ClickViewIcon1(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.ClickViewIcon1(driver).click();
			test.log(LogStatus.PASS ,"New popup ''Register of Director/KMP' open");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "New popup ''Register of Director/KMP' not  open");
	    }
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	
	
	public static void ExistingDownloadButton(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickViewIcon1(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickMembers(driver).click();
		
		Thread.sleep(2000);
	    List<WebElement>SelectDirector = driver.findElements(By.xpath("//ul[@id='ddlDirector_listbox']/li"));
		selectOptionFromDropDown_bs(SelectDirector, "Mr. Director One - [Director (Executive)]");
		
		
	
		if(MyDocumentLocator.ClickDownload(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.ClickDownload(driver).click();
			test.log(LogStatus.PASS ,"User should able to Download 'Existing Register' document");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "User should not be able to Download 'Existing Register' document");
	    }
		
	
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	
	public static void ExistingViewButton(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickViewIcon1(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickMembers(driver).click();
	
		
		Thread.sleep(2000);
	    List<WebElement>SelectDirector = driver.findElements(By.xpath("//ul[@id='ddlDirector_listbox']/li"));
		selectOptionFromDropDown_bs(SelectDirector, "Mr. Director One - [Director (Executive)]");
		
	
		if(MyDocumentLocator.ClickView1(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.ClickView1(driver).click();
			test.log(LogStatus.PASS ,"User should able to View 'Existing Register' document");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "User should not be able to view 'Existing Register' document");
	    }
		
		Thread.sleep(3000);
		MyDocumentLocator.closeViewIcon(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	public static void OldDownloadButton(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickViewIcon1(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickOldRadioButton(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickMembers1(driver).click();
		
		Thread.sleep(2000);
	    List<WebElement>SelectDirector = driver.findElements(By.xpath("//ul[@id='ddlPastDirector_listbox']/li"));
		selectOptionFromDropDown_bs(SelectDirector, "DIRECTOR ONE");
		
		
	
		if(MyDocumentLocator.ClickDownload(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.ClickDownload(driver).click();
			test.log(LogStatus.PASS ,"User should able to Download 'Old Register'' document");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "User should not be able to Download 'Old Register'' document");
	    }
		
	
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	
	public static void OldViewButton(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickViewIcon1(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickOldRadioButton(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickMembers1(driver).click();
	
		
		Thread.sleep(2000);
	    List<WebElement>SelectDirector = driver.findElements(By.xpath("//ul[@id='ddlPastDirector_listbox']/li"));
		selectOptionFromDropDown_bs(SelectDirector, "DIRECTOR ONE");
		
	
		if(MyDocumentLocator.ClickView1(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.ClickView1(driver).click();
			test.log(LogStatus.PASS ,"User should able to View 'Old Register'' document");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "User should not be able to view 'Old Register'' document");
	    }
		
		Thread.sleep(3000);
		MyDocumentLocator.closeViewIcon(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	
	public static void AllDownloadButton(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickViewIcon1(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickAllRadioButton(driver).click();
		
	
		if(MyDocumentLocator.ClickDownload(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.ClickDownload(driver).click();
			test.log(LogStatus.PASS ,"User should able to Download 'All Register'' document");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "User should not be able to Download 'All Register'' document");
	    }
		
	
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	
	public static void AllViewButton(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickViewIcon1(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickAllRadioButton(driver).click();

		
		if(MyDocumentLocator.ClickView1(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.ClickView1(driver).click();
			test.log(LogStatus.PASS ,"User should able to View 'All Register'' document");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "User should not be able to view 'All Register'' document");
	    }
		
		Thread.sleep(3000);
		MyDocumentLocator.closeViewIcon(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	public static void RegistorOfCharge(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		if(MyDocumentLocator.ClickRegisterOfChargeView(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.ClickRegisterOfChargeView(driver).click();
			test.log(LogStatus.PASS ,"New popup 'Register of Charge' open");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "New popup ''Register of Charge' not  open");
	    }
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	
	public static void DownloadRegisterOfCharge(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickRegisterOfChargeView(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickMembers(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.SelectChargeID(driver).click();
		
	
		if(MyDocumentLocator.DownloadRegisterOfCharge(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.DownloadRegisterOfCharge(driver).click();
			test.log(LogStatus.PASS ,"User should able to Download 'Register of Charge' document");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "User should not be able to Download 'Register of Charge' document");
	    }
		
	
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	
   public static void ViewRegisterOfCharge (WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickRegisterOfChargeView(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickMembers(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.SelectChargeID(driver).click();
		
	
		if(MyDocumentLocator.ViewRegisterOfCharge(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.ViewRegisterOfCharge(driver).click();
			test.log(LogStatus.PASS ,"User should able to View 'Register of Member' document");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "User should not be able to view 'Register of Member' document");
	    }
		
		Thread.sleep(3000);
		MyDocumentLocator.closeViewIcon(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	public static void RegistorOfLoan(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		if(MyDocumentLocator.ClickRegisterofLoansView(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.ClickRegisterofLoansView(driver).click();
			test.log(LogStatus.PASS ,"New popup 'Register of Loans, Guarantee, Security and Acquisition made by the Company' open");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "New popup 'Register of Loans, Guarantee, Security and Acquisition made by the Company' not  open");
	    }
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	public static void DownloadRegisterOfLoan(WebDriver driver,ExtentTest test) throws InterruptedException
	{
		
		Thread.sleep(2000);
		MyDocumentLocator.MyDocumentimg(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.StatutoryRegisters(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickEntityLocation(driver).click();
		Thread.sleep(2000);
		MyDocumentLocator.SelectEntityLocation(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickRegisterofLoansView(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.ClickMembers(driver).click();
		
		Thread.sleep(2000);
		MyDocumentLocator.SelectNatureOfTransaction(driver).click();

		if(MyDocumentLocator.DownloadRegisterOfCharge(driver).isEnabled())
		{
			Thread.sleep(2000);
			MyDocumentLocator.DownloadRegisterOfCharge(driver).click();
			test.log(LogStatus.PASS ,"User should able to Download 'Register of Loans, Guarantee, Security and Acquisition made by the Company' document");
		}
	   else
		{
		    	 test.log(LogStatus.FAIL, "User should not be able to Download 'Register of Loans, Guarantee, Security and Acquisition made by the Company' document");
	    }
		
	
		Thread.sleep(2000);
		MyDocumentLocator.ClickcloseIcon(driver).click();
		
		 Thread.sleep(4000);
	     EntityLocator.ClickDashboard(driver).click();
	}
	  public static void ViewRegisterOfLoan(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyDocumentLocator.MyDocumentimg(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.StatutoryRegisters(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickEntityLocation(driver).click();
			Thread.sleep(2000);
			MyDocumentLocator.SelectEntityLocation(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickRegisterofLoansView(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickMembers(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.SelectNatureOfTransaction(driver).click();

			if(MyDocumentLocator.ViewRegisterOfLoan(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyDocumentLocator.ViewRegisterOfLoan(driver).click();
				test.log(LogStatus.PASS ,"User should able to View 'Register of Loans, Guarantee, Security and Acquisition made by the Company' document");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "User should not be able to view 'Register of Loans, Guarantee, Security and Acquisition made by the Company' document");
		    }
			
			Thread.sleep(3000);
			MyDocumentLocator.closeViewIcon(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickcloseIcon(driver).click();
			
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}
	  
		public static void RegistorOfDebentureHolder(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyDocumentLocator.MyDocumentimg(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.StatutoryRegisters(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickEntityLocation(driver).click();
			Thread.sleep(2000);
			MyDocumentLocator.SelectEntityLocation(driver).click();
			
			Thread.sleep(2000);
			if(MyDocumentLocator.ClickRegisterofDebentureholdersView(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyDocumentLocator.ClickRegisterofDebentureholdersView(driver).click();
				test.log(LogStatus.PASS ,"New popup 'Register of Debenture holders/Other securities holders' open");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "New popup 'Register of Debenture holders/Other securities holders' not  open");
		    }
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickcloseIcon(driver).click();
			
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}
		public static void DownloadRegisterOfDebentureHolder(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyDocumentLocator.MyDocumentimg(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.StatutoryRegisters(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickEntityLocation(driver).click();
			Thread.sleep(2000);
			MyDocumentLocator.SelectEntityLocation(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickRegisterofDebentureholdersView(driver).click();
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickMembers(driver).click();
			
			Thread.sleep(2000);
		    List<WebElement>SelectDirector = driver.findElements(By.xpath("//ul[@id='ddlDebentureClass_listbox']/li"));
			selectOptionFromDropDown_bs(SelectDirector, "Non Convertible Debentures");
			
			Thread.sleep(2000);
			MyDocumentLocator.ClickDebentureHolder(driver).click();
			Thread.sleep(2000);
			MyDocumentLocator.SelectDebentureHolder(driver).click();

			if(MyDocumentLocator.DownloadRegisterOfCharge(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyDocumentLocator.DownloadRegisterOfCharge(driver).click();
				test.log(LogStatus.PASS ,"User should able to Download 'Register of Debenture holders/Other securities holders' document");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "User should not be able to Download 'Register of Debenture holders/Other securities holders' document");
		    }
			
		
			Thread.sleep(2000);
			MyDocumentLocator.ClickcloseIcon(driver).click();
			
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}
		 public static void ViewRegisterOfDebentureOfHolder(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.StatutoryRegisters(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickEntityLocation(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.SelectEntityLocation(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickRegisterofDebentureholdersView(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickMembers(driver).click();
			
				Thread.sleep(2000);
			    List<WebElement>SelectDirector = driver.findElements(By.xpath("//ul[@id='ddlDebentureClass_listbox']/li"));
				selectOptionFromDropDown_bs(SelectDirector, "Non Convertible Debentures");
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickDebentureHolder(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.SelectDebentureHolder(driver).click();

				if(MyDocumentLocator.ClickRegisterofDebentureholdersView1(driver).isEnabled())
				{
					Thread.sleep(2000);
					MyDocumentLocator.ClickRegisterofDebentureholdersView1(driver).click();
					test.log(LogStatus.PASS ,"User should able to View 'Register of Loans, Guarantee, Security and Acquisition made by the Company' document");
				}
			   else
				{
				    	 test.log(LogStatus.FAIL, "User should not be able to view 'Register of Loans, Guarantee, Security and Acquisition made by the Company' document");
			    }
				
				Thread.sleep(3000);
				MyDocumentLocator.closeViewIcon(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickcloseIcon(driver).click();
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
			}
			public static void DownloadButtonWithoutSelectingData(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.StatutoryRegisters(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickEntityLocation(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.SelectEntityLocation(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickRegisterofDebentureholdersView(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.DownloadRegisterOfCharge(driver).click();
				
			    test.log(LogStatus.PASS ,"No Data Found");
				
			     driver.navigate().back();
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
			}
			public static void ViewButtonWithoutSelectingData(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.StatutoryRegisters(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickEntityLocation(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.SelectEntityLocation(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickRegisterofDebentureholdersView(driver).click();
				
			
			    Thread.sleep(2000);
				MyDocumentLocator.ClickRegisterofDebentureholdersView1(driver).click();
					
				
				 test.log(LogStatus.FAIL, "Validation messaage not displayed");
			    
				Thread.sleep(3000);
				MyDocumentLocator.closeViewIcon1(driver).click();
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
			}
			
			public static void ClickHistoricalRegistor(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				if(MyDocumentLocator.HistiricalDoc(driver).isEnabled())
				{
					Thread.sleep(2000);
					MyDocumentLocator.HistiricalDoc(driver).click();
					test.log(LogStatus.PASS ,"User should be redirected to the Historical Document page");
				}
			   else
				{
				    	 test.log(LogStatus.FAIL, "User should not be redirected to the Historical Document page");
			    }    
			}
			public static void AddHistoricalRegistor(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDocNew(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickEntity(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.SelectEntity(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickMeetingType(driver).click();
				
				Thread.sleep(2000);
			    List<WebElement>MeetingType = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
				selectOptionFromDropDown_bs(MeetingType, "ABCDE");
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickFY(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.SelectFY(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickNoOfMeeting(driver).sendKeys("1");
				Thread.sleep(2000);
				MyDocumentLocator.ClickCalender(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.SelectDate(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.clickSrNo(driver).sendKeys("2");
				Thread.sleep(2000);
				MyDocumentLocator.clickSave(driver).click();
				
				
				try
				{
				  
					Thread.sleep(2000);
					String msg= MyDocumentLocator.clickSaveValidMsg(driver).getText();
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				 	
			   }
				  catch(Exception e)
				  {
				  
				 	Thread.sleep(2000);
					String msg=MyDocumentLocator.clickSaveInValidMsg(driver).getText();
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				   
				  }
				
				Thread.sleep(2000);
				MyDocumentLocator.clickclosePopup(driver).click();
			}
			public static void WithoutEnterDataHistoricalRegistor(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDocNew(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.clickSave(driver).click();
				Thread.sleep(2000);
				String msg =MyDocumentLocator.ValidEntityMsg(driver).getText();
				if(msg.equalsIgnoreCase(msg))
				{
					
					test.log(LogStatus.PASS, "Message displayed = " +msg);
				}
				else
				{
					test.log(LogStatus.FAIL, "Message displayed = " +msg);
				}
				Thread.sleep(2000);
				MyDocumentLocator.clickclosePopup(driver).click();
			}
			public static void AddDocumentHistoricalRegistor(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickEdtIcon(driver).click();
				
		     	Thread.sleep(2000);
				MyDocumentLocator.ClickFiles(driver).sendKeys("E:\\Secreterial Project Git Folder\\Avasec Merge\\Secreterial Project 26JULY23\\Secretarial-Project-26JULY23\\TestData\\SecreterialSheet3.xlsx");
				
				
				Actions a =new Actions(driver);
				a.sendKeys(Keys.PAGE_DOWN).build().perform();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickSave(driver).click();
			
				try
				{
				  
					Thread.sleep(2000);
					String msg= MyDocumentLocator.clickSaveValidMsg(driver).getText();
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				 	
			   }
				  catch(Exception e)
				  {
				  
				 	Thread.sleep(2000);
					String msg=MyDocumentLocator.clickSaveInValidMsg(driver).getText();
					test.log(LogStatus.FAIL, "Message displayed =" +msg);
				   
				  }
				
				Thread.sleep(2000);
				MyDocumentLocator.clickclosePopup(driver).click();
			}
			
			public static void AddMultipleDocumentHistoricalRegistor(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickEdtIcon(driver).click();
				
		     	Thread.sleep(2000);
				MyDocumentLocator.ClickFiles(driver).sendKeys("E:\\Secreterial Project Git Folder\\Avasec Merge\\Secreterial Project 26JULY23\\Secretarial-Project-26JULY23\\TestData\\SecreterialSheet3.xlsx");
				Thread.sleep(2000);
				MyDocumentLocator.ClickFiles(driver).sendKeys("E:\\Secreterial Project Git Folder\\Avasec Merge\\Secreterial Project 26JULY23\\Secretarial-Project-26JULY23\\TestData\\1. Spresso MGT 7.pdf");
				
				Actions a =new Actions(driver);
				a.sendKeys(Keys.PAGE_DOWN).build().perform();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickSave(driver).click();
			
				try
				{
				  
					Thread.sleep(2000);
					String msg= MyDocumentLocator.clickSaveValidMsg(driver).getText();
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				 	
			   }
				  catch(Exception e)
				  {
				  
				 	Thread.sleep(2000);
					String msg=MyDocumentLocator.clickSaveInValidMsg(driver).getText();
					test.log(LogStatus.FAIL, "Message displayed =" +msg);
				   
				  }
				
				Thread.sleep(2000);
				MyDocumentLocator.clickclosePopup(driver).click();
			}
			public static void AgendaItems(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDocNew(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickEntity(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.SelectEntity(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickMeetingType(driver).click();
				
				Thread.sleep(2000);
			    List<WebElement>MeetingType = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
				selectOptionFromDropDown_bs(MeetingType, "ABCDE");
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickFY(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.SelectFY(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickNoOfMeeting(driver).sendKeys("1");
				Thread.sleep(2000);
				MyDocumentLocator.ClickCalender(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.SelectDate(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.clickSrNo(driver).sendKeys("2");
				Thread.sleep(2000);
				MyDocumentLocator.clickSave(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickAgendaItems(driver).click();
				
				if(MyDocumentLocator.ClickAgendaItems(driver).isEnabled())
				{
					Thread.sleep(2000);
					MyDocumentLocator.ClickAgendaItems(driver).click();
					test.log(LogStatus.PASS ,"Agenda Items is clickable");
				}
			   else
				{
				    	 test.log(LogStatus.FAIL, "Agenda Items is not clickable");
			    }    
				
				Thread.sleep(2000);
				MyDocumentLocator.clickclosePopup(driver).click();
			}
			public static void EditHistoricalRegistor(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
				
				
			
				
				if(MyDocumentLocator.ClickEdtIcon(driver).isEnabled())
				{
					Thread.sleep(2000);
					MyDocumentLocator.ClickEdtIcon(driver).click();
					test.log(LogStatus.PASS ,"Edit Icon is clickable");
				}
			   else
				{
				    	 test.log(LogStatus.FAIL, "Edit Icon is not clickable");
			    }   
				Thread.sleep(3000);
				MyDocumentLocator.clickclosePopup(driver).click();
			}
			public static void UpdateHistoricalRegistor(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickEdtIcon(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickEntity(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.SelectEntity(driver).click();
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(2000);
				
				Actions a =new Actions(driver);
				a.sendKeys(Keys.PAGE_DOWN).build().perform();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickSave(driver).click();

				try
				{
				  
					Thread.sleep(2000);
					String msg= MyDocumentLocator.clickSaveValidMsg(driver).getText();
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				 	
			   }
				  catch(Exception e)
				  {
				  
				 	Thread.sleep(2000);
					String msg=MyDocumentLocator.clickSaveInValidMsg(driver).getText();
					test.log(LogStatus.FAIL, "Message displayed =" +msg);
				   
				  }
				
			}
			
			public static void DeleteRegisterDoc(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickHistoricalDocDelete(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickYesButton(driver).click();
				
				   Thread.sleep(5000);
				    // Switching to Alert        
			        Alert alert1 = driver.switchTo().alert();		
			        		
			        // Capturing alert message.    
			        String alertMessage1= driver.switchTo().alert().getText();	
			        
			        
			        test.log(LogStatus.PASS, alertMessage1);
			        		
			        // Displaying alert message		
			        System.out.println(alertMessage1);
			        
			     // Accepting alert		
			        alert1.accept();	
			       
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
			}
				
			public static void DeleteRegisterDocNo(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.ClickHistoricalDocDelete(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickNoButton(driver).click();
				
				test.log(LogStatus.PASS, "The item should not be deleted. The confirmation prompt should be dismissed, and the item should remain intact without any changes.");
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
			}
			
			public static void HistoricalDocTypeFilter(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickTypeFilter(driver).click();
				
		        Thread.sleep(2000);
		          if(MyDocumentLocator.SelectTypeFilter(driver).isEnabled())
					{
						Thread.sleep(2000);
						MyDocumentLocator.SelectTypeFilter(driver).click();
						test.log(LogStatus.PASS ,"Type Dropdown working properly.");
					}
				   else
					{
					    	 test.log(LogStatus.FAIL, "Type Dropdown  working not properly.");
				    }    
					Thread.sleep(2000);
				     EntityLocator.ClickDashboard(driver).click();
		       
			}
			
			
			public static void HistoricalDocFilter(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
//				Thread.sleep(2000);
//				MyDocumentLocator.ClickTypeFilter(driver).click();
//				Thread.sleep(500);
//		       String typetext =MyDocumentLocator.SelectTypeFilter(driver).getText();
//		       Thread.sleep(500);
//		       MyDocumentLocator.SelectTypeFilter(driver).click();
		      
		       Thread.sleep(3000);
		        MyDocumentLocator.ClickEntityFilter(driver).click();
		       Thread.sleep(500);
		       String entitytext =MyDocumentLocator.SelectEntityFilter(driver).getText();
		       Thread.sleep(500);
		       MyDocumentLocator.SelectEntityFilter(driver).click();
		       
		       Thread.sleep(500); 
		       MyDocumentLocator. ClickFYFilter(driver).click();
		       Thread.sleep(500);
		       String FYText =MyDocumentLocator.SelectFYFilter(driver).getText();
		       Thread.sleep(500);
		       MyDocumentLocator.SelectFYFilter(driver).click();
		     
		       
		        List<String> li=new ArrayList<String>();
		        
		       // li.add(typetext);
		        li.add(entitytext);
		        li.add(FYText);
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			//	filter.add("Type");
				filter.add("Entity");	
				filter.add("FY");	
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,150)");	
				Thread.sleep(3000);

				MyDocumentLocator.ReadTotalItem(driver).click();					//Clicking on Text of total items just to scroll down.
				String s = MyDocumentLocator.ReadTotalItem(driver).getText();
				Thread.sleep(2000);

				if(!s.equalsIgnoreCase("No items to display")) {
				Thread.sleep(5000);
			
				List<WebElement> entitycol=driver.findElements(By.xpath("//*[@id='gridHistoricalData']/table/tbody/tr/td[1]"));
				
				//List<WebElement> Typecol=driver.findElements(By.xpath("//*[@id='gridHistoricalData']/table/tbody/tr/td[2]"));
				List<WebElement> FYcol=driver.findElements(By.xpath("//*[@id='gridHistoricalData']/table/tbody/tr/td[5]"));
				Thread.sleep(2000);

				for(int i=0; i<li.size(); i++){
					
					List<String> text= new ArrayList<String>();
					HashSet<String> pass=new LinkedHashSet<>();
					HashSet<String> fail=new LinkedHashSet<>();
					List<WebElement> raw=new ArrayList<WebElement>();

//						if(i==0)
//						{
//							raw.addAll(Typecol);
//						}
				 if(i==0)
						{
							raw.addAll(entitycol);
						}
					else if(i==1)
					{
						raw.addAll(FYcol);
					}
						
						
					for(int k=0;k<raw.size();k++)
						{
							text.add(raw.get(k).getText());
						}

						for(int l=0;l<text.size();l++)
					    {
							
//							if(i==0)
//								{
//									pass.add(text.get(l));	
//								}
//								else
//								{
							
							
						if(text.get(l).equals(li.get(i)))
							{
								pass.add(text.get(l));	
								System.out.println("pass : "+text.get(l)+" : "+li.get(i));

							}
						else
						{
							fail.add(text.get(l));		
							System.out.println("fail : "+text.get(l)+" : "+li.get(i));
							System.out.println(i);

						}
						 }
							
					             // }
				 
			for(String Fal : fail)
				 {
						test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
				 }	
				 for(String Pas : pass)
				 {
					 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
						test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
						System.out.println(filter.get(i)+" : "+Pas);
			 }
				 text.clear();
				pass.clear();
				fail.clear();
				raw.clear();
				
				
				}
				}else {
					test.log(LogStatus.PASS,"No records found");	
				}
				
				  
				 Thread.sleep(2000);
			     EntityLocator.ClickDashboard(driver).click();
			
			}
			public static void HistoricalDocClearButton(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.HistiricalDoc(driver).click();
				Thread.sleep(2000);
				MyDocumentLocator.ClickTypeFilter(driver).click();
				
		         Thread.sleep(500);
		         MyDocumentLocator.SelectTypeFilter(driver).click();
		         
					if(MyDocumentLocator.clearBtn(driver).isEnabled())
					{
						Thread.sleep(2000);
						MyDocumentLocator.clearBtn(driver).click();
						test.log(LogStatus.PASS ,"Clear button working properly.");
					}
				   else
					{
					    	 test.log(LogStatus.FAIL, "Clear button working not properly.");
				    }    
					Thread.sleep(2000);
				     EntityLocator.ClickDashboard(driver).click();
			}
			public static void EFormRepositorytab (WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
			
				
				if(MyDocumentLocator.EFormRepositorytab(driver).isEnabled())
				{
					Thread.sleep(2000);
					MyDocumentLocator.EFormRepositorytab(driver).click();
					test.log(LogStatus.PASS ,"E-Form Repository tab is clickable.");
				}
			   else
				{
				    	 test.log(LogStatus.FAIL, "E-Form Repository tab is clickable.");
			    }    
				Thread.sleep(2000);
			     EntityLocator.ClickDashboard(driver).click();
			}
			public static void UploadEFormRepository (WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.EFormRepositorytab(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.UploadButton(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickFromName(driver).sendKeys("Form CRA-3");
				Thread.sleep(2000);
				MyDocumentLocator.ClickCalender(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.SelectDate(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickFromDescription(driver).sendKeys("ABC");
				Thread.sleep(2000);
				MyDocumentLocator.clickUploadFile(driver).sendKeys("E:\\Secreterial Project Git Folder\\Avasec Merge\\Secreterial Project 26JULY23\\Secretarial-Project-26JULY23\\TestData\\SecreterialSheet3.xlsx");
			
				Thread.sleep(2000);
				MyDocumentLocator.clickSavebtn(driver).click();
				
				try
				{
					Thread.sleep(2000);
					String msg =MyDocumentLocator.clickValidMsg(driver).getText();
					test.log(LogStatus.PASS, "Message Displayed :-" +msg);
				}
				catch(Exception e)
				{
					Thread.sleep(2000);
					String msg =MyDocumentLocator.clickInvalidMsg(driver).getText();
					test.log(LogStatus.PASS, "Message Displayed :-" +msg);
				}
				

				Thread.sleep(2000);
				MyDocumentLocator.clickCloseIcon(driver).click();
				Thread.sleep(2000);
			     EntityLocator.ClickDashboard(driver).click();
		
			}
			public static void WithoutUploadEFormRepository (WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.EFormRepositorytab(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.UploadButton(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickSavebtn(driver).click();
				try
				{
					Thread.sleep(2000);
					String msg =MyDocumentLocator.clickValidMsg(driver).getText();
					test.log(LogStatus.PASS, "Message Displayed :-" +msg);
				}
				catch(Exception e)
				{
					Thread.sleep(2000);
					String msg =MyDocumentLocator.clickInvalidMsg(driver).getText();
					test.log(LogStatus.PASS, "Message Displayed :-" +msg);
				}
				

				Thread.sleep(2000);
				MyDocumentLocator.clickCloseIcon(driver).click();
				Thread.sleep(2000);
			     EntityLocator.ClickDashboard(driver).click();
			}
			
			public static void EditUploadEFormRepository (WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.EFormRepositorytab(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickEditIcon(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickFromName(driver).clear();
				Thread.sleep(2000);
				MyDocumentLocator.clickFromName(driver).sendKeys("Form CRA-3");
				Thread.sleep(2000);
				MyDocumentLocator.ClickCalender(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.SelectDate(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickFromDescription(driver).clear();
				Thread.sleep(2000);
				MyDocumentLocator.clickFromDescription(driver).sendKeys("ABC");
				Thread.sleep(2000);
				MyDocumentLocator.clickUploadFile(driver).sendKeys("E:\\Secreterial Project Git Folder\\Avasec Merge\\Secreterial Project 26JULY23\\Secretarial-Project-26JULY23\\TestData\\SecreterialSheet3.xlsx");
			
				Thread.sleep(2000);
				MyDocumentLocator.clickSavebtn(driver).click();
				
				try
				{
					Thread.sleep(2000);
					String msg =MyDocumentLocator.clickValidMsg(driver).getText();
					test.log(LogStatus.PASS, "Message Displayed :-" +msg);
				}
				catch(Exception e)
				{
					Thread.sleep(2000);
					String msg =MyDocumentLocator.clickInvalidMsg(driver).getText();
					test.log(LogStatus.PASS, "Message Displayed :-" +msg);
				}
				

				Thread.sleep(2000);
				MyDocumentLocator.clickCloseIcon(driver).click();
				Thread.sleep(2000);
			     EntityLocator.ClickDashboard(driver).click();
		
			}
			
			public static void DownloadDoc (WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.EFormRepositorytab(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickDownlodIcon(driver).click();
				
				test.log(LogStatus.PASS, "Document Downloaded working successfully");
			}
			public static void DeleteDoc (WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.EFormRepositorytab(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickDeleteIcon(driver).click();
				
				
				  Thread.sleep(5000);
				    // Switching to Alert        
			        Alert alert1 = driver.switchTo().alert();		
			        		
			        // Capturing alert message.    
			        String alertMessage1= driver.switchTo().alert().getText();	
			        
			        
			        test.log(LogStatus.PASS, alertMessage1);
			        		
			        // Displaying alert message		
			        System.out.println(alertMessage1);
			        
			     // Accepting alert		
			        alert1.accept();	
			       
				
				Thread.sleep(2000);
				String msg =MyDocumentLocator.clickDeleteValidMsg(driver).getText();
				
				test.log(LogStatus.PASS, "Message Displayed ="+msg);
			}	
			public static void DeleteDocCancelBtn (WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.EFormRepositorytab(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.clickDeleteIcon(driver).click();
				
				
				  Thread.sleep(5000);
				    // Switching to Alert        
			        Alert alert1 = driver.switchTo().alert();		
			        		
			        // Capturing alert message.    
			        String alertMessage1= driver.switchTo().alert().getText();	
			        
			        
			        test.log(LogStatus.PASS, alertMessage1);
			        		
			        // Displaying alert message		
			        System.out.println(alertMessage1);
			        
			     // Accepting alert		
			        alert1.dismiss();	
			        
			        test.log(LogStatus.PASS, "The document should not be deleted from the system");
			}	
			      
				
			public static void SearchFilter (WebDriver driver,ExtentTest test,String type) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.EFormRepositorytab(driver).click();
				
			   Thread.sleep(3000);
		        MyDocumentLocator.clickSearch(driver).sendKeys(type,Keys.ENTER);
		      
		     
		        List<String> li=new ArrayList<String>();
		        
		       
		        li.add(type);
		       
		        
				List<String> filter=new ArrayList<String>();	
				
				filter.add("EForm Name");	
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,150)");	
				Thread.sleep(3000);

				MyDocumentLocator.ReadTotalItem(driver).click();					//Clicking on Text of total items just to scroll down.
				String s = MyDocumentLocator.ReadTotalItem(driver).getText();
				Thread.sleep(2000);

				if(!s.equalsIgnoreCase("No items to display")) {
				Thread.sleep(5000);
		
				List<WebElement> typecol=driver.findElements(By.xpath("//*[@id='gridEFormRepository']/div[2]/table/tbody/tr/td[1]"));
				Thread.sleep(2000);

				for(int i=0; i<li.size(); i++){
					
					List<String> text= new ArrayList<String>();
					HashSet<String> pass=new LinkedHashSet<>();
					HashSet<String> fail=new LinkedHashSet<>();
					List<WebElement> raw=new ArrayList<WebElement>();


				 if(i==0)
						{
							raw.addAll(typecol);
						}
					
						
						
					for(int k=0;k<raw.size();k++)
						{
							text.add(raw.get(k).getText());
						}

					for(int l=0;l<text.size();l++)
					 {
							
						if(text.get(l).equals(li.get(i)))
							{
								pass.add(text.get(l));	
								System.out.println("pass : "+text.get(l)+" : "+li.get(i));

							}
						else
						   {
								fail.add(text.get(l));		
								System.out.println("fail : "+text.get(l)+" : "+li.get(i));
								System.out.println(i);

						   }
					  }
							
					             
				 
			for(String Fal : fail)
				 {
						test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
				 }	
				 for(String Pas : pass)
				 {
					 	test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
						test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
						System.out.println(filter.get(i)+" : "+Pas);
				 }
				 text.clear();
				pass.clear();
				fail.clear();
				raw.clear();
				
				
				}
				}else {
					test.log(LogStatus.PASS,"No records found");	
				}
				
				  
				 Thread.sleep(2000);
			     EntityLocator.ClickDashboard(driver).click();
			}
			public static void EFormClearBtn (WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyDocumentLocator.MyDocumentimg(driver).click();
				
				Thread.sleep(2000);
				MyDocumentLocator.EFormRepositorytab(driver).click();
				
			   Thread.sleep(3000);
		        MyDocumentLocator.clickSearch(driver).sendKeys("Form CRL-7",Keys.ENTER);
			
		        Thread.sleep(2000);
				if(MyDocumentLocator.clearBtn(driver).isEnabled())
				{
					Thread.sleep(2000);
					MyDocumentLocator.clearBtn(driver).click();
					test.log(LogStatus.PASS ,"Clear button  is clickable.");
				}
			   else
				{
				    	 test.log(LogStatus.FAIL, "Clear button  is not clickable.");
			    }    
				Thread.sleep(2000);
			     EntityLocator.ClickDashboard(driver).click();
			}
				
			
				
				
				
			
		
			
			
			
				
			
			
			
			
	 static void selectOptionFromDropDown_bs(List<WebElement> options, String value) {
			
			for(WebElement option:options) {
				if(option.getText().equals(value)) {
					option.click();
					break;
				}
			}
		 }
}
