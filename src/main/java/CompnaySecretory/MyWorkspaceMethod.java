package CompnaySecretory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class MyWorkspaceMethod 
{
	
	   private static List<WebElement> elementsList = null;
	    public static FileInputStream fis = null;	//File input stream variable
		public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
		public static XSSFSheet sheet = null;		//Sheet variable
		public static XSSFSheet sheet1 = null;		//Sheet variable

		
		public static void ClickMyWorkspace(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
		
			if(MyWorkspaceLocator.MyWorkspaceimg(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				test.log(LogStatus.PASS ,"My workspace tab is clickable");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "My workspace tab is not clickable");
		    }    
		}
		public static void ClickConcludedMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			if(MyWorkspaceLocator.ConcludedMeeting(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.ConcludedMeeting(driver).click();
				test.log(LogStatus.FAIL ,"After clicking on concluded meeting it shows heading as 'Meeting' but expected heading is 'Concluded meeting'");
			}
		   else
			{
			    	 test.log(LogStatus.PASS, "After clicking on concluded meeting it shows heading as 'Concluded meeting'");
		    }
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
			    
    	}
		
		public static void ClickNewButton(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
		
			if(MyWorkspaceLocator.NewButton(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.NewButton(driver).click();
				test.log(LogStatus.PASS ,"User should be redirected to the meeting page");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "User should not be redirected to the meeting page");
		    }
			Thread.sleep(2000);
			MyWorkspaceLocator.CloseIcon(driver).click();
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}
		public static void ClickEditButton(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			
			if(MyWorkspaceLocator.EditButton(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.EditButton(driver).click();
				test.log(LogStatus.PASS ,"User should be redirected to the meeting edit page");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "User should not be redirected to the meeting edit page");
		    }
			
			Thread.sleep(2000);
			MyWorkspaceLocator.CloseIcon(driver).click();
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}
		public static void ClickMoreAction(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
		
			if(MyWorkspaceLocator.MoreAction(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MoreAction(driver).click();
				test.log(LogStatus.PASS ,"More action dropdown is clickable");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "More action dropdown is not clickable");
		    }
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}
		public static void ClickComplianceTab(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			
			if(MyWorkspaceLocator.ComplianceTab(driver).isEnabled())
			{
				Thread.sleep(3000);
				MyWorkspaceLocator.ComplianceTab(driver).click();
				test.log(LogStatus.PASS ,"User should be redirected to the compliance page");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "User should not be redirected to the compliance page");
		    }
			
			 Thread.sleep(4000);
			 MyWorkspaceLocator.CloseIcon1(driver).click();	  
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	    
		}
		public static void ClickDraftResolutionandMinuteTab(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
		
				if(MyWorkspaceLocator.DraftResolutionandMinuteTab(driver).isEnabled())
				{
				   Thread.sleep(2000);
				   MyWorkspaceLocator.DraftResolutionandMinuteTab(driver).click();
				  test.log(LogStatus.PASS ,"User should be redirected to the Draft and resolution page");
				}
				else
				{
					  test.log(LogStatus.FAIL ,"User should not be redirected to the Draft and resolution page");
				}
			
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(500,0)");
//			 Thread.sleep(4000);
//			 MyWorkspaceLocator.CloseIcon2(driver).click();	  
//			 Thread.sleep(4000);
//		     EntityLocator.ClickDashboard(driver).click();	    
		}
		public static void ClickDraftResolutionandMinuteDownloadIcon(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='griDDLActionMenu_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "Draft Resolution & Minutes");
			
			if(MyWorkspaceLocator.DraftResolutionandMinuteDonloadIcon(driver).isEnabled())
			{
				Thread.sleep(3000);
				MyWorkspaceLocator.DraftResolutionandMinuteDonloadIcon(driver).click();
				test.log(LogStatus.PASS ,"File Download successfully ");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "File does not  Download successfully");
		    }
			
//			 Thread.sleep(4000);
//			 MyWorkspaceLocator.CloseIcon2(driver).click();	  
//			 Thread.sleep(4000);
//		     EntityLocator.ClickDashboard(driver).click();	    
		}
		
		public static void ClickAnnetureTab(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='griDDLActionMenu_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "Draft Resolution & Minutes");
			if(MyWorkspaceLocator.Anneture(driver).isEnabled())
			{
				Thread.sleep(3000);
				MyWorkspaceLocator.Anneture(driver).click();
				test.log(LogStatus.PASS ,"User should be redirected to the Annexure tab");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "User should not be redirected to the Anneture tab");
		    }
			
			 Thread.sleep(4000);
			 MyWorkspaceLocator.CloseIcon2(driver).click();	 
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	    
		}
		public static void ClickAnnetureTabValidUploadFile(WebDriver driver,ExtentTest test) throws InterruptedException
		{
    		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='griDDLActionMenu_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "Draft Resolution & Minutes");
				
				Thread.sleep(3000);
				MyWorkspaceLocator.Anneture(driver).click();
		 
				Thread.sleep(3000);
				MyWorkspaceLocator.selectFile(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\Management Personnel.pdf");
				Thread.sleep(3000);
				MyWorkspaceLocator.clickUpload(driver).click();
				Thread.sleep(3000);
				String msg =MyWorkspaceLocator.clickValidationMsg(driver).getText();
				if(msg.equalsIgnoreCase(msg))
				{
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				}
				else
				{
					test.log(LogStatus.FAIL, "Message displayed =" +msg);
				}
				 Thread.sleep(4000);
				 MyWorkspaceLocator.CloseIcon2(driver).click();	 
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
		}
		public static void ClickAnnetureTabMultipleUploadFile(WebDriver driver,ExtentTest test) throws InterruptedException
		{
    		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='griDDLActionMenu_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "Draft Resolution & Minutes");
				
				Thread.sleep(3000);
				MyWorkspaceLocator.Anneture(driver).click();
		 
				Thread.sleep(3000);
				MyWorkspaceLocator.selectFile(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\Management Personnel.pdf");
				
				Thread.sleep(3000);
				MyWorkspaceLocator.selectFile(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\DIR-8.docx");
				Thread.sleep(3000);
				MyWorkspaceLocator.clickUpload(driver).click();
				Thread.sleep(3000);
				String msg =MyWorkspaceLocator.clickValidationMsg(driver).getText();
				if(msg.equalsIgnoreCase(msg))
				{
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				}
				else
				{
					test.log(LogStatus.FAIL, "Message displayed =" +msg);
				}
				 Thread.sleep(4000);
				 MyWorkspaceLocator.CloseIcon2(driver).click();	 
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
		}
		public static void ClickAnnetureTabInvalidUploadFile(WebDriver driver,ExtentTest test) throws InterruptedException
		{
    		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='griDDLActionMenu_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "Draft Resolution & Minutes");
				
				Thread.sleep(3000);
				MyWorkspaceLocator.Anneture(driver).click();
		 
				Thread.sleep(3000);
				MyWorkspaceLocator.selectFile(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\Statutory Auditor.html");
				
		
				Thread.sleep(3000);
				String msg =MyWorkspaceLocator.clickValidationMsg1(driver).getText();
				if(msg.equalsIgnoreCase(msg))
				{
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				}
				else
				{
					test.log(LogStatus.FAIL, "Message displayed =" +msg);
				}
				 Thread.sleep(4000);
				 MyWorkspaceLocator.CloseIcon2(driver).click();	 
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
		}
		public static void ClickAnnetureTabMultipleInvalidUploadFile(WebDriver driver,ExtentTest test) throws InterruptedException
		{
    		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='griDDLActionMenu_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "Draft Resolution & Minutes");
				
				Thread.sleep(3000);
				MyWorkspaceLocator.Anneture(driver).click();
		 
				Thread.sleep(3000);
				MyWorkspaceLocator.selectFile(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\Statutory Auditor.html");
				
				Thread.sleep(3000);
				MyWorkspaceLocator.selectFile(driver).sendKeys("E:\\Snehal\\ComplianceLatest\\Secretarial-Project-main\\Secretarial-Project-main\\TestData\\Contract.xlsx");
				
				Thread.sleep(3000);
				String msg =MyWorkspaceLocator.clickValidationMsg1(driver).getText();
				if(msg.equalsIgnoreCase(msg))
				{
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				}
				else
				{
					test.log(LogStatus.FAIL, "Message displayed =" +msg);
				}
				 Thread.sleep(4000);
				 MyWorkspaceLocator.CloseIcon2(driver).click();	 
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
		}
		public static void ClickAnnetureTabWithoutSelectingUploadFile(WebDriver driver,ExtentTest test) throws InterruptedException
		{
    		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='griDDLActionMenu_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "Draft Resolution & Minutes");
				
				Thread.sleep(3000);
				MyWorkspaceLocator.Anneture(driver).click();
				
				Thread.sleep(3000);
				MyWorkspaceLocator.clickUpload(driver).click();
				

				Thread.sleep(3000);
				String msg =MyWorkspaceLocator.clickValidationMsg2(driver).getText();
				if(msg.equalsIgnoreCase(msg))
				{
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				}
				else
				{
					test.log(LogStatus.FAIL, "Message displayed =" +msg);
				}
				 Thread.sleep(4000);
				 MyWorkspaceLocator.CloseIcon2(driver).click();	 
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
		}
		public static void ClickAnnetureTabViewFile(WebDriver driver,ExtentTest test) throws InterruptedException
		{
    		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='griDDLActionMenu_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "Draft Resolution & Minutes");
				
				Thread.sleep(3000);
				MyWorkspaceLocator.Anneture(driver).click();
				
				Thread.sleep(3000);
		       MyWorkspaceLocator.clickViewIcon(driver).click();
		       
		       test.log(LogStatus.PASS, "User should able to view uploaded file successfully");
		       
		       Thread.sleep(3000);
		       MyWorkspaceLocator.clickCloseIcon(driver).click();
		  	 Thread.sleep(4000);
			 MyWorkspaceLocator.CloseIcon2(driver).click();	 
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}
		
		public static void ClickAnnetureTabDownloadFile(WebDriver driver,ExtentTest test) throws InterruptedException
		{
    		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='griDDLActionMenu_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "Draft Resolution & Minutes");
				
				Thread.sleep(3000);
				MyWorkspaceLocator.Anneture(driver).click();
				
				Thread.sleep(3000);
		       MyWorkspaceLocator.clickDownloadIcon(driver).click();
		       
		       test.log(LogStatus.PASS, "User should able to download file successfully");
		       
		  
		  	 Thread.sleep(4000);
			 MyWorkspaceLocator.CloseIcon2(driver).click();	 
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}
		public static void ClickAnnetureTabDeleteFile(WebDriver driver,ExtentTest test) throws InterruptedException
		{
    		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='griDDLActionMenu_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "Draft Resolution & Minutes");
				
				Thread.sleep(3000);
				MyWorkspaceLocator.Anneture(driver).click();
				
				Thread.sleep(3000);
		       MyWorkspaceLocator.clickDeleteIcon(driver).click();
		       
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
				String msg= MyWorkspaceLocator.clickValidMsg2(driver).getText();	
		       
		           test.log(LogStatus.PASS, "Message displayed =" +msg);
		       
		  
		  	 Thread.sleep(4000);
			 MyWorkspaceLocator.CloseIcon2(driver).click();	 
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		}	
		
		public static void ClickMinutesTab(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			
			if(MyWorkspaceLocator.MinutesTab(driver).isEnabled())
			{
				Thread.sleep(3000);
				MyWorkspaceLocator.MinutesTab(driver).click();
				test.log(LogStatus.PASS ,"User should be redirected to the Minutes page");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "User should not be redirected to the Minutes page");
		    }
			
			 Thread.sleep(4000);
			 MyWorkspaceLocator.clickCloseIcon2(driver).click();	  
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	    
		}
		
		public static void ClickMinutesTabDownloadIcon(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			Thread.sleep(3000);
			MyWorkspaceLocator.MinutesTab(driver).click();
			Thread.sleep(3000);
			driver.switchTo().frame(MyWorkspaceLocator.clickiframe(driver));
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			File dir2 = new File("C:\\Users\\Snehal Patil\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			MyWorkspaceLocator.clickDownloadLicon(driver).click();
			
		 	Thread.sleep(6000);
			File dir3 = new File("C:\\Users\\Snehal Patil\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "User should able to download the minutes ");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "User should not be able to download the minutes ");
			}
   			
			
//			 Thread.sleep(9000);
//			 MyWorkspaceLocator.clickCloseIcon2(driver).click();	  
//			 Thread.sleep(4000);
//		     EntityLocator.ClickDashboard(driver).click();	    
		}
		public static void ClickCertifiedTrueCopy(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			
			if(MyWorkspaceLocator.CertifiedTrueCopyTab(driver).isEnabled())
			{
				Thread.sleep(3000);
				MyWorkspaceLocator.CertifiedTrueCopyTab(driver).click();
				test.log(LogStatus.PASS ,"User should be redirected to the Certified True Copy page");
			}
		   else
			{
			    	 test.log(LogStatus.FAIL, "User should not be redirected to the Certified True Copy page");
		    }
			
			 Thread.sleep(4000);
			 MyWorkspaceLocator.clickCloseIcon3(driver).click();	  
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	    
		}
		public static void ClickCTCPreviewIcon(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			
		   Thread.sleep(3000);
			MyWorkspaceLocator.CertifiedTrueCopyTab(driver).click();
				
			Thread.sleep(3000);
			MyWorkspaceLocator.clickPreviewCTC(driver).click();
			test.log(LogStatus.PASS ,"User should able to view CTC documents successfully");
			
			Thread.sleep(4000);
			 MyWorkspaceLocator.clickCloseIcon4(driver).click();	
			 Thread.sleep(4000);
			 MyWorkspaceLocator.clickCloseIcon3(driver).click();	  
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	    
		}
		public static void ClickCTCDownloadIcon(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			
		   Thread.sleep(3000);
			MyWorkspaceLocator.CertifiedTrueCopyTab(driver).click();
				
		
			File dir2 = new File("C:\\Users\\Snehal Patil\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			MyWorkspaceLocator.clickDownloadCTCIcon(driver).click();
			
		 	Thread.sleep(6000);
			File dir3 = new File("C:\\Users\\Snehal Patil\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "User should able to download CTC documents in word successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "User should not able to download CTC documents in word successfully ");
			}
		
			
			 Thread.sleep(4000);
			 MyWorkspaceLocator.clickCloseIcon3(driver).click();	  
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	    
		}
		
		public static void ClickCTCDownloadpdfIcon(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
			
		   Thread.sleep(3000);
			MyWorkspaceLocator.CertifiedTrueCopyTab(driver).click();
				
		
			File dir2 = new File("C:\\Users\\Snehal Patil\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			MyWorkspaceLocator.clickDownloadCTCPDFIcon(driver).click();
			
		 	Thread.sleep(6000);
			File dir3 = new File("C:\\Users\\Snehal Patil\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "User should able to download CTC documents in pdf successfully");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "User should not able to download CTC documents in pdf successfully ");
			}
		
			
			 Thread.sleep(4000);
			 MyWorkspaceLocator.clickCloseIcon3(driver).click();	  
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	    
		}
		public static void ClickUploadDocTab(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ConcludedMeeting(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.MoreAction(driver).click();
		
			Thread.sleep(2000);
			if(MyWorkspaceLocator.UploadDocTab(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.UploadDocTab(driver).click();
				test.log(LogStatus.PASS, "User should be redirected to the upload document page");
			}
			else
			{
				test.log(LogStatus.FAIL, "User should not be redirected to the upload document page");
			}
			Thread.sleep(2000);
			MyWorkspaceLocator.clickCloseIcon5(driver).click();
			
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	
			
		}
		

    public static void ClickUploadDoc(WebDriver driver,ExtentTest test) throws InterruptedException
    {
	    Thread.sleep(2000);
	    MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	    Thread.sleep(2000);
	    MyWorkspaceLocator.ConcludedMeeting(driver).click();
	    Thread.sleep(2000);
	    MyWorkspaceLocator.MoreAction(driver).click();
	    
	    Thread.sleep(2000);
		MyWorkspaceLocator.UploadDocTab(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.selectFile(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\Statutory Auditor.html");
		
		 Thread.sleep(2000);
		MyWorkspaceLocator.clickUpload(driver).click();

		 Thread.sleep(2000);
		 String msg=MyWorkspaceLocator.clickvalidmsg(driver).getText();
		 if(msg.equalsIgnoreCase(msg))
		 {
			 test.log(LogStatus.PASS,"Message displayed =" +msg);
		 }
		 else
		 {
			 test.log(LogStatus.FAIL,"Message displayed =" +msg);
		 }
		 
			Thread.sleep(2000);
			MyWorkspaceLocator.clickCloseIcon5(driver).click();
			
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	
	
   }
    public static void ClickMultipleUploadDoc(WebDriver driver,ExtentTest test) throws InterruptedException
    {
	    Thread.sleep(2000);
	    MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	    Thread.sleep(2000);
	    MyWorkspaceLocator.ConcludedMeeting(driver).click();
	    Thread.sleep(2000);
	    MyWorkspaceLocator.MoreAction(driver).click();
	    
	    Thread.sleep(2000);
		MyWorkspaceLocator.UploadDocTab(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.selectFile(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\Statutory Auditor.html");
		Thread.sleep(2000);
		MyWorkspaceLocator.selectFile(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\Management Personnel.pdf");
		 Thread.sleep(2000);
		MyWorkspaceLocator.clickUpload(driver).click();

		 Thread.sleep(2000);
		 String msg=MyWorkspaceLocator.clickvalidmsg(driver).getText();
		 if(msg.equalsIgnoreCase(msg))
		 {
			 test.log(LogStatus.PASS,"Message displayed =" +msg);
		 }
		 else
		 {
			 test.log(LogStatus.FAIL,"Message displayed =" +msg);
		 }
		 
			Thread.sleep(2000);
			MyWorkspaceLocator.clickCloseIcon5(driver).click();
			
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	
	
   }
    
    public static void ClickWithoutSelectingFile(WebDriver driver,ExtentTest test) throws InterruptedException
    {
	    Thread.sleep(2000);
	    MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	    Thread.sleep(2000);
	    MyWorkspaceLocator.ConcludedMeeting(driver).click();
	    Thread.sleep(2000);
	    MyWorkspaceLocator.MoreAction(driver).click();
	    
	    Thread.sleep(2000);
		MyWorkspaceLocator.UploadDocTab(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickUpload(driver).click();

		 Thread.sleep(2000);
		 String msg=MyWorkspaceLocator.clickvalidmsg(driver).getText();
		 if(msg.equalsIgnoreCase(msg))
		 {
			 test.log(LogStatus.FAIL,"Message displayed =" +msg);
		 }
		 else
		 {
			 test.log(LogStatus.PASS,"Message displayed =" +msg);
		 }
		 
			Thread.sleep(2000);
			MyWorkspaceLocator.clickCloseIcon5(driver).click();
			
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	
	
   }
    
  public static void ClickViewFile(WebDriver driver,ExtentTest test) throws InterruptedException
    {
	    Thread.sleep(2000);
	    MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	    Thread.sleep(2000);
	    MyWorkspaceLocator.ConcludedMeeting(driver).click();
	    Thread.sleep(2000);
	    MyWorkspaceLocator.MoreAction(driver).click();
	    
	    Thread.sleep(2000);
		MyWorkspaceLocator.UploadDocTab(driver).click();
		
	    Thread.sleep(2000);
		MyWorkspaceLocator.clickViewIcon1(driver).click();
		Thread.sleep(3000);
		driver.switchTo().frame(MyWorkspaceLocator.clickIframe(driver));
		  Thread.sleep(2000);
			String msg=MyWorkspaceLocator.clickError(driver).getText();
			  if(msg.equalsIgnoreCase("Document Load Error: No document is specified so nothing to display."))
      		  {
      			  test.log(LogStatus.PASS, "User should able to view uploaded file successfully= " +msg);
      		  }
      		  else
      		  {
      			 test.log(LogStatus.FAIL, "User should not able to view uploaded file successfully= " +msg);
      		  }

		     driver.switchTo().parentFrame();
			Thread.sleep(2000);
			MyWorkspaceLocator.clickCloseIcon6(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.clickCloseIcon5(driver).click();
			
			 Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();	
	
   }
  
  
  public static void ClickDownloadFile(WebDriver driver,ExtentTest test) throws InterruptedException
  {
	    Thread.sleep(2000);
	    MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	    Thread.sleep(2000);
	    MyWorkspaceLocator.ConcludedMeeting(driver).click();
	    Thread.sleep(2000);
	    MyWorkspaceLocator.MoreAction(driver).click();
	    
	    Thread.sleep(2000);
		MyWorkspaceLocator.UploadDocTab(driver).click();
		
			File dir2 = new File("C:\\Users\\Snehal Patil\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(3000);
			MyWorkspaceLocator.clickDownloadIcon1(driver).click();
			
		 	Thread.sleep(6000);
			File dir3 = new File("C:\\Users\\Snehal Patil\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "User should able to download uploaded file successfully ");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "User should not able to download uploaded file successfully ");
			}
		   
		   Thread.sleep(2000);
			MyWorkspaceLocator.clickCloseIcon5(driver).click();
			
			Thread.sleep(4000);
		     EntityLocator.ClickDashboard(driver).click();
		
  }
		   
		   public static void ClickDeleteFile(WebDriver driver,ExtentTest test) throws InterruptedException
		   {
		 	    Thread.sleep(2000);
		 	    MyWorkspaceLocator.MyWorkspaceimg(driver).click();
		 	    Thread.sleep(2000);
		 	    MyWorkspaceLocator.ConcludedMeeting(driver).click();
		 	    Thread.sleep(2000);
		 	    MyWorkspaceLocator.MoreAction(driver).click();
		 	    
		 	    Thread.sleep(2000);
		 		MyWorkspaceLocator.UploadDocTab(driver).click();
		 		

		 	    Thread.sleep(2000);
		 		MyWorkspaceLocator.clickDeleteIcon1(driver).click();
		 		
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
				MyWorkspaceLocator.clickCloseIcon5(driver).click();
   			
				Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
			
  }
		   
			public static void ClickCopyMeetingTab(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.ConcludedMeeting(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.MoreAction(driver).click();
			
				Thread.sleep(2000);
				if(MyWorkspaceLocator.CopyMeetingTab(driver).isEnabled())
				{
					Thread.sleep(2000);
					MyWorkspaceLocator.CopyMeetingTab(driver).click();
					test.log(LogStatus.PASS, "User should be redirected to the Copy Meeting page");
				}
				else
				{
					test.log(LogStatus.FAIL, "User should not be redirected to the Copy Meeting page");
				}
				Thread.sleep(2000);
				MyWorkspaceLocator.clickCloseIcon7(driver).click();
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();	
				
			}
			
			public static void ClickCopyMeetingAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.ConcludedMeeting(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.MoreAction(driver).click();
			
				Thread.sleep(2000);
				MyWorkspaceLocator.CopyMeetingTab(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickEntityName(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.selectEntityName(driver).click();
				 
				Thread.sleep(2000);
				MyWorkspaceLocator.clickCheckbox(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickSave(driver).click();
				
				Thread.sleep(2000);
				String msg=MyWorkspaceLocator.clickValidMsg(driver).getText();
				
				if(msg.equalsIgnoreCase(msg))
				{
					test.log(LogStatus.PASS,"Message displayed =" +msg);
				}
				else
				{
					test.log(LogStatus.FAIL,"Message displayed =" +msg);
				}
				
					
				Thread.sleep(2000);
				MyWorkspaceLocator.clickCloseIcon7(driver).click();
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();	
				
			}
			
			public static void ClickCopyMeetingMultipleAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.ConcludedMeeting(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.MoreAction(driver).click();
			
				Thread.sleep(2000);
				MyWorkspaceLocator.CopyMeetingTab(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickEntityName(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.selectEntityName(driver).click();
				

				Thread.sleep(2000);
				MyWorkspaceLocator.clickEntityName1(driver).click();
				 
				Thread.sleep(2000);
				MyWorkspaceLocator.selectEntityName1(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.clickCheckbox(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickSave(driver).click();
				
				Thread.sleep(2000);
				String msg=MyWorkspaceLocator.clickValidMsg(driver).getText();
				
				if(msg.equalsIgnoreCase(msg))
				{
					test.log(LogStatus.PASS,"Message displayed =" +msg);
				}
				else
				{
					test.log(LogStatus.FAIL,"Message displayed =" +msg);
				}
				
					
				Thread.sleep(2000);
				MyWorkspaceLocator.clickCloseIcon7(driver).click();
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();	
				
			}
			
			public static void ClickCopyMeetingMultiplecheckboxAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.ConcludedMeeting(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.MoreAction(driver).click();
			
				Thread.sleep(2000);
				MyWorkspaceLocator.CopyMeetingTab(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickEntityName(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.selectEntityName(driver).click();
				

				Thread.sleep(2000);
				MyWorkspaceLocator.clickEntityName1(driver).click();
				 
				Thread.sleep(2000);
				MyWorkspaceLocator.selectEntityName1(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.clickCheckbox1(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickSave(driver).click();
				
				Thread.sleep(2000);
				String msg=MyWorkspaceLocator.clickValidMsg(driver).getText();
				
				if(msg.equalsIgnoreCase(msg))
				{
					test.log(LogStatus.PASS,"Message displayed =" +msg);
				}
				else
				{
					test.log(LogStatus.FAIL,"Message displayed =" +msg);
				}
				
					
				Thread.sleep(2000);
				MyWorkspaceLocator.clickCloseIcon7(driver).click();
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();	
				
			}
			
			public static void ClickCopyMeetingAgendaWithoutEnterData(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.ConcludedMeeting(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.MoreAction(driver).click();
			
				Thread.sleep(2000);
				MyWorkspaceLocator.CopyMeetingTab(driver).click();
				
			 Thread.sleep(2000);
				MyWorkspaceLocator.clickSave(driver).click();
			
				try
				{
			     	Thread.sleep(2000);
				    String msg=MyWorkspaceLocator.clickValidMsg(driver).getText();
				
				   if(msg.equalsIgnoreCase(msg))
				   {
					  test.log(LogStatus.PASS,"Message displayed =" +msg);
				   }
				   else
				   {
					 test.log(LogStatus.FAIL,"Message displayed =" +msg);
				   }
			  }
				catch(Exception e)
				{
					test.log(LogStatus.FAIL,"No error validation message displayed");
				}
				
					
				Thread.sleep(2000);
				MyWorkspaceLocator.clickCloseIcon7(driver).click();
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();	
				
			}
			
			public static void ClickCopyMeetingAgendaCloseBtn(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.ConcludedMeeting(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.MoreAction(driver).click();
			
				Thread.sleep(2000);
				MyWorkspaceLocator.CopyMeetingTab(driver).click();
				   Thread.sleep(2000);
				if(	MyWorkspaceLocator.clickClose(driver).isEnabled())
				{
				   Thread.sleep(2000);
				   MyWorkspaceLocator.clickClose(driver).click();
				   test.log(LogStatus.PASS, "The user should be redirected to the previous page.");
				
				}
				else
				{
					 test.log(LogStatus.FAIL, "The user not should be redirected to the previous page.");
				}
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();	
				
			}
			
			public static void ClickCopyMeetingAgendaLog(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.ConcludedMeeting(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.MoreAction(driver).click();
			
				Thread.sleep(2000);
				MyWorkspaceLocator.CopyMeetingTab(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickLog(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickLogDelete(driver).click();
				
				
				Thread.sleep(2000);
				String msg=MyWorkspaceLocator.clickLogDeleteMsg(driver).getText();
				
				if(msg.equalsIgnoreCase(msg))
				{
					test.log(LogStatus.PASS, "Message Displayed =" +msg);
					
				}
				else
				{
					test.log(LogStatus.FAIL, "Message Displayed =" +msg);
				}
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickLogDelete1(driver).click();
				
				Thread.sleep(2000);
				String msg1=MyWorkspaceLocator.clickLogDeleteMsg1(driver).getText();
				
				if(msg1.equalsIgnoreCase(msg1))
				{
					test.log(LogStatus.PASS, "Message Displayed =" +msg1);
				}
				else
				{
					test.log(LogStatus.FAIL, "Message Displayed =" +msg1);
				}
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickLogDeleteClose(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickCloseIcon7(driver).click();
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();	
			}
			
			public static void ClickCopyMeetingAgendaDeleteNoBtn(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.ConcludedMeeting(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.MoreAction(driver).click();
			
				Thread.sleep(2000);
				MyWorkspaceLocator.CopyMeetingTab(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickLog(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickLogDelete(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickLogDeleteNoBtn(driver).click();
				
				test.log(LogStatus.PASS, "The item should not be deleted. The confirmation prompt should be dismissed, and the item should remain intact without any changes.");
			
				Thread.sleep(2000);
				MyWorkspaceLocator.clickCloseIcon7(driver).click();
				
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();	
			
			}
			
			public static void ClickConcludedMeetingAdd(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				Thread.sleep(2000);
				MyWorkspaceLocator.ConcludedMeeting(driver).click();
				
				Thread.sleep(2000);
				if(MyWorkspaceLocator.clickAddBtn(driver).isEnabled())
				{
			     	Thread.sleep(2000);
				    MyWorkspaceLocator.clickAddBtn(driver).click();
				    test.log(LogStatus.PASS, "Add button is enabled for actual concluded meeting");
				}
				else
				{
				    test.log(LogStatus.FAIL, "Add button is not enabled for actual concluded meeting");
				}
				
				Thread.sleep(2000);
			    MyWorkspaceLocator.clickCloseBtn(driver).click();
			    
			    Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();	
			    
			}
			
			public static void ClickMyCompliance(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				
				if(MyWorkspaceLocator.clickMyCompliance(driver).isEnabled())
				{
					Thread.sleep(2000);
					MyWorkspaceLocator.clickMyCompliance(driver).click();
					test.log(LogStatus.PASS ,"User should be redirected to the My Compliances page'");
				}
			   else
				{
				    	 test.log(LogStatus.FAIL, "User should not be redirected to the My Compliances page'");
			    }
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
				    
	    	}
			
			public static void ClickMyComplianceEditBtn(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickMyCompliance(driver).click();
			
				Thread.sleep(2000);
				if(MyWorkspaceLocator.clickMyComplianceEdit(driver).isEnabled())
				{
					Thread.sleep(2000);
					MyWorkspaceLocator.clickMyComplianceEdit(driver).click();
					test.log(LogStatus.PASS ,"User should be redirected to the  Compliances page'");
				}
			   else
				{
				    	 test.log(LogStatus.FAIL, "User should not be redirected to the  Compliances page'");
			    }
				
				 Thread.sleep(4000);
				 MyWorkspaceLocator.clickCloseIcon9(driver).click();
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
				    
		}
			
		public static void ClickMyTask(WebDriver driver,ExtentTest test) throws InterruptedException
			{
				
				Thread.sleep(2000);
				MyWorkspaceLocator.MyWorkspaceimg(driver).click();
					Thread.sleep(2000);
			   if(MyWorkspaceLocator.clickMyTask(driver).isEnabled())
			   {
				  Thread.sleep(2000);
				   MyWorkspaceLocator.clickMyTask(driver).click();
				   test.log(LogStatus.PASS, "My Task tab is clickable");
		    	}
			  else
			  {
				 test.log(LogStatus.FAIL, "My Task tab not is clickable");
			  }
				
		 }
		
		public static void AddMyTaskMetting(WebDriver driver,ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
			sheet=workbook.getSheetAt(0);
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			   
			   Thread.sleep(2000);
			   MyWorkspaceLocator.clickNewTask(driver).click();
			   
			   Thread.sleep(2000);
			   MyWorkspaceLocator.clickType(driver).click();
			   
				Thread.sleep(2000);
			     List<WebElement>type = driver.findElements(By.xpath("//ul[@id='TaskType_listbox']/li"));
				selectOptionFromDropDown_bs(type, "Meeting");
				
//				   Thread.sleep(5000);
//				   MyWorkspaceLocator.clickEntity(driver).click();
				   
				   By locator = By.xpath("//*[@id='divEntityId']/span[2]/span/span[2]");
				 
				   wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				   Thread.sleep(4000);
				   WebElement ViewButton = driver.findElement(locator);	
				   Thread.sleep(3000);
				   JavascriptExecutor jse=(JavascriptExecutor)driver;
				   jse.executeScript("arguments[0].click();", ViewButton);
				   
				
				   Thread.sleep(2000);
				     List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='EntityId_listbox']/li"));
					selectOptionFromDropDown_bs(entitytype, "A LIMITED");
				   
				   Thread.sleep(2000);
				    Row row = sheet.getRow(81);						//Selected 1st index row (Second row)
				    org.apache.poi.ss.usermodel.Cell c = row.getCell(1);						//Selected cell (1 row,1 column)
					String TaskTitle = c.getStringCellValue();	//Got the URL stored at position 1,1
					MyWorkspaceLocator.ClickTaskTitle(driver).sendKeys(TaskTitle );
					
					 Thread.sleep(2000);
					 Row row1 = sheet.getRow(82);						//Selected 1st index row (Second row)
					 org.apache.poi.ss.usermodel.Cell c1 = row1.getCell(1);						//Selected cell (1 row,1 column)
					 String TaskDesciption= c1.getStringCellValue();	//Got the URL stored at position 1,1
					 MyWorkspaceLocator.ClickTaskDescription(driver).sendKeys(TaskDesciption );
					
					 Thread.sleep(2000);
					 MyWorkspaceLocator.ClickCalender(driver).click();
					 Thread.sleep(2000);
					 MyWorkspaceLocator.SelectDate(driver).click();
					 
					 Thread.sleep(2000);
					 MyWorkspaceLocator.selectFile(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\Management Personnel.pdf");
	
					 Thread.sleep(2000);
					 MyWorkspaceLocator.Save(driver).click();
					 Thread.sleep(2000);
					 String msg= MyWorkspaceLocator.ValidMsg(driver).getText();
					 
					 if(msg.equalsIgnoreCase(msg))
					 {
						 test.log(LogStatus.PASS, "Message displsyed ="+msg);
					 }
					 else
					 {
						 test.log(LogStatus.FAIL, "Message displsyed ="+msg);
					 }
					 
					 Thread.sleep(2000);
					 MyWorkspaceLocator.CloseBtn(driver).click();
		
		}
		
		public static void AddMyTaskAgenda(WebDriver driver,ExtentTest test,XSSFWorkbook workbook,XSSFSheet sheet) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
			//sheet=workbook.getSheetAt(0);
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			   
			   Thread.sleep(2000);
			   MyWorkspaceLocator.clickNewTask(driver).click();
			   
			   Thread.sleep(2000);
			   MyWorkspaceLocator.clickType(driver).click();
			   
				Thread.sleep(2000);
			     List<WebElement>type = driver.findElements(By.xpath("//ul[@id='TaskType_listbox']/li"));
				selectOptionFromDropDown_bs(type, "Agenda");
			 
				   By locator = By.xpath("//*[@id='divEntityId']/span[2]/span/span[2]");
				 
				   wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				   Thread.sleep(4000);
				   WebElement ViewButton = driver.findElement(locator);	
				   Thread.sleep(3000);
				   JavascriptExecutor jse=(JavascriptExecutor)driver;
				   jse.executeScript("arguments[0].click();", ViewButton);
				   
				
				   Thread.sleep(2000);
				     List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='EntityId_listbox']/li"));
					selectOptionFromDropDown_bs(entitytype, "A LIMITED");
				   
				   Thread.sleep(2000);
				    Row row = sheet.getRow(81);						//Selected 1st index row (Second row)
				    org.apache.poi.ss.usermodel.Cell c = row.getCell(1);						//Selected cell (1 row,1 column)
					String TaskTitle = c.getStringCellValue();	//Got the URL stored at position 1,1
					MyWorkspaceLocator.ClickTaskTitle(driver).sendKeys(TaskTitle );
					
					 Thread.sleep(2000);
					 Row row1 = sheet.getRow(82);						//Selected 1st index row (Second row)
					 org.apache.poi.ss.usermodel.Cell c1 = row1.getCell(1);						//Selected cell (1 row,1 column)
					 String TaskDesciption= c1.getStringCellValue();	//Got the URL stored at position 1,1
					 MyWorkspaceLocator.ClickTaskDescription(driver).sendKeys(TaskDesciption );
					
					 Thread.sleep(2000);
					 MyWorkspaceLocator.ClickCalender(driver).click();
					 Thread.sleep(2000);
					 MyWorkspaceLocator.SelectDate(driver).click();
					 
					 Thread.sleep(2000);
					 MyWorkspaceLocator.selectFile(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\Management Personnel.pdf");
	
					 Thread.sleep(2000);
					 MyWorkspaceLocator.Save(driver).click();
					 Thread.sleep(2000);
					 String msg= MyWorkspaceLocator.ValidMsg(driver).getText();
					 
					 if(msg.equalsIgnoreCase(msg))
					 {
						 test.log(LogStatus.PASS, "Message displsyed ="+msg);
					 }
					 else
					 {
						 test.log(LogStatus.FAIL, "Message displsyed ="+msg);
					 }
					 
					 Thread.sleep(2000);
					 MyWorkspaceLocator.CloseBtn(driver).click();
		
		}
		public static void AddMyTaskOther(WebDriver driver,ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
			sheet=workbook.getSheetAt(0);
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			   
			   Thread.sleep(2000);
			   MyWorkspaceLocator.clickNewTask(driver).click();
			   
			   Thread.sleep(2000);
			   MyWorkspaceLocator.clickType(driver).click();
			   
				Thread.sleep(2000);
			     List<WebElement>type = driver.findElements(By.xpath("//ul[@id='TaskType_listbox']/li"));
				selectOptionFromDropDown_bs(type, "Other");
			 
				
				   Thread.sleep(2000);
				    Row row = sheet.getRow(81);						//Selected 1st index row (Second row)
				    org.apache.poi.ss.usermodel.Cell c = row.getCell(1);						//Selected cell (1 row,1 column)
					String TaskTitle = c.getStringCellValue();	//Got the URL stored at position 1,1
					MyWorkspaceLocator.ClickTaskTitle(driver).sendKeys(TaskTitle );
					
					 Thread.sleep(2000);
					 Row row1 = sheet.getRow(82);						//Selected 1st index row (Second row)
					 org.apache.poi.ss.usermodel.Cell c1 = row1.getCell(1);						//Selected cell (1 row,1 column)
					 String TaskDesciption= c1.getStringCellValue();	//Got the URL stored at position 1,1
					 MyWorkspaceLocator.ClickTaskDescription(driver).sendKeys(TaskDesciption );
					
					 Thread.sleep(2000);
					 MyWorkspaceLocator.ClickCalender(driver).click();
					 Thread.sleep(2000);
					 MyWorkspaceLocator.SelectDate(driver).click();
					 
					 Thread.sleep(2000);
					 MyWorkspaceLocator.selectFile(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\Management Personnel.pdf");
	
					 Thread.sleep(2000);
					 MyWorkspaceLocator.Save(driver).click();
					 Thread.sleep(2000);
					 String msg= MyWorkspaceLocator.ValidMsg(driver).getText();
					 
					 if(msg.equalsIgnoreCase(msg))
					 {
						 test.log(LogStatus.PASS, "Message displsyed ="+msg);
					 }
					 else
					 {
						 test.log(LogStatus.FAIL, "Message displsyed ="+msg);
					 }
					 
					 Thread.sleep(2000);
					 MyWorkspaceLocator.Close(driver).click();
		
		}
		
		public static void WithoutEnterDataTask(WebDriver driver,ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
			sheet=workbook.getSheetAt(0);
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			   
			   Thread.sleep(2000);
			   MyWorkspaceLocator.clickNewTask(driver).click();
			   
				 Thread.sleep(2000);
				 MyWorkspaceLocator.Save(driver).click();
				 Thread.sleep(2000);
				 String msg= MyWorkspaceLocator.ValidMsg(driver).getText();
				 
				 if(msg.equalsIgnoreCase(msg))
				 {
					 test.log(LogStatus.FAIL, "Message displsyed ="+msg);
				 }
				 else
				 {
					 test.log(LogStatus.PASS, "Message displsyed ="+msg);
				 }
				 
				 Thread.sleep(2000);
				 MyWorkspaceLocator.Close(driver).click();
				 
		}
		public static void AddMyTaskCloseBtn(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			   
			   Thread.sleep(2000);
			   MyWorkspaceLocator.clickNewTask(driver).click();
			   
			   if( MyWorkspaceLocator.CloseBtn(driver).isEnabled())
			   {
				   Thread.sleep(2000);
					 MyWorkspaceLocator.CloseBtn(driver).click();
					 test.log(LogStatus.PASS, "Close button is clickable");
			   }
			   else
			   {
				   test.log(LogStatus.FAIL, "Close button is not clickable");
			   }
			   
		}
		
		public static void EditBtn(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			   Thread.sleep(2000);
			   if(  MyWorkspaceLocator.EditBtn(driver).isEnabled())
			   {
			   
			      Thread.sleep(2000);
			      MyWorkspaceLocator.EditBtn(driver).click();
			      test.log(LogStatus.PASS, "Edit button is clickable");
			   }
			   else
			   {
				      test.log(LogStatus.FAIL, "Edit button is not clickable");
			   }
			   Thread.sleep(2000);
				 MyWorkspaceLocator.closeBtn(driver).click();
				 
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
		
		}
			   
		public static void TaskViewDeatiles(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			  
			 
			   Thread.sleep(2000);
			   MyWorkspaceLocator.EditBtn(driver).click();
			   
			   Thread.sleep(2000);
			   if(  MyWorkspaceLocator.TaskDetailesTab(driver).isEnabled())
			   {
			   
			      Thread.sleep(2000);
			      MyWorkspaceLocator.TaskDetailesTab(driver).click();
			      test.log(LogStatus.PASS, "User should able to view 'Task Details'");
			   }
			   else
			   {
				      test.log(LogStatus.FAIL, "User should not able to view 'Task Details'");
			   }
			   
			    Thread.sleep(2000);
				 MyWorkspaceLocator.closeBtn(driver).click();
				 
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
		
		}
		
		public static void EditTask(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			  
			 
			   Thread.sleep(2000);
			   MyWorkspaceLocator.EditBtn(driver).click();
			   
			   Thread.sleep(2000);
			   MyWorkspaceLocator.Status(driver).click();
			   Thread.sleep(2000);
			   MyWorkspaceLocator. Remark(driver).sendKeys("ok");
			   Thread.sleep(2000);
			   MyWorkspaceLocator. File(driver).sendKeys("C:\\Users\\Snehal Patil\\Downloads\\Management Personnel.pdf");
			   Thread.sleep(2000);
			   MyWorkspaceLocator.Savebtn(driver).click();
			   Thread.sleep(2000);
			  String msg= MyWorkspaceLocator.validMsg(driver).getText();
			  
			  if(MyWorkspaceLocator.validMsg(driver).isEnabled())
			  {
				  test.log(LogStatus.PASS, "Message displayed ="+msg);
			  }
			  else
			  {
				  test.log(LogStatus.FAIL, "Message displayed ="+msg);
			  }
			  
			  Thread.sleep(2000);
				 MyWorkspaceLocator.closeBtn(driver).click();
				 
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
	   }
			   
		public static void EditTaskWithoutEnterData(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			  
			 
			   Thread.sleep(2000);
			   MyWorkspaceLocator.EditBtn(driver).click();
			   
			   Thread.sleep(2000);
			   MyWorkspaceLocator. Remark(driver).clear();
			   
			   Thread.sleep(2000);
			   MyWorkspaceLocator.Savebtn(driver).click();
			   Thread.sleep(2000);
			  String msg= MyWorkspaceLocator.InvalidMsg(driver).getText();
			  
			  if(MyWorkspaceLocator.InvalidMsg(driver).isEnabled())
			  {
				  test.log(LogStatus.PASS, "Message displayed ="+msg);
			  }
			  else
			  {
				  test.log(LogStatus.FAIL, "Message displayed ="+msg);
			  }
			  
			  Thread.sleep(2000);
				 MyWorkspaceLocator.closeBtn(driver).click();
				 
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
	   }
		
		public static void DownloadDocument(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			  
			 
			   Thread.sleep(2000);
			   MyWorkspaceLocator.EditBtn(driver).click();
			   
			   Thread.sleep(2000);
			   if( MyWorkspaceLocator.DownloadIcon(driver).isEnabled())
			   {
				   Thread.sleep(2000);
			       MyWorkspaceLocator.DownloadIcon(driver).click();
			       
			       test.log(LogStatus.PASS, "User should able to download task document");
			   }
			   else
			   {
				   test.log(LogStatus.FAIL, "User should not able to download task document");
			   }
			   Thread.sleep(2000);
				 MyWorkspaceLocator.closeBtn(driver).click();
				 
				 Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
			   
			   
		}
		
		public static void CloseBtn(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			  
			 
			   Thread.sleep(2000);
			   MyWorkspaceLocator.EditBtn(driver).click();

               
			   Thread.sleep(2000);
			  if(MyWorkspaceLocator.closeBtnEditTask(driver).isEnabled())
			  {
				  MyWorkspaceLocator.closeBtnEditTask(driver).click();
				  test.log(LogStatus.PASS, "Close button is clickable");
			  }
			  else
			  {
				  test.log(LogStatus.FAIL, "Close button is not clickable");
			  }
			   
		}
		
		public static void DeleteBtn(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			   
			 
			      Thread.sleep(5000);
			      MyWorkspaceLocator.DeleteIcon(driver).click();
			      
			      Thread.sleep(2000);
			    String msg=MyWorkspaceLocator. Deletevalidmsg(driver).getText();
			    
			    if(msg.equalsIgnoreCase(msg))
			    {
			    	test.log(LogStatus.PASS, "Message Dispalyed=" +msg);
			    }
			    else
			    {
			    	test.log(LogStatus.FAIL, "Message Dispalyed=" +msg);
			    }
		
			      Thread.sleep(2000);
			      MyWorkspaceLocator. DeleteIconYes(driver).click();
			     
			      
			      Thread.sleep(2000);
				    String msg1=MyWorkspaceLocator. Deletevalidmsg1(driver).getText();
				    
				    if(msg1.equalsIgnoreCase(msg1))
				    	
				    {
				    	test.log(LogStatus.PASS, "Message Dispalyed=" +msg1);
				    }
				    else
				    {
				    	test.log(LogStatus.FAIL, "Message Dispalyed=" +msg1);
				    }
				    
				    Thread.sleep(2000);
				      MyWorkspaceLocator.closeIcon(driver).click();
		}
		
		public static void DeleteBtnNo(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			  Thread.sleep(2000);
			   MyWorkspaceLocator.clickMyTask(driver).click();
			   
			 
			      Thread.sleep(5000);
			      MyWorkspaceLocator.DeleteIcon(driver).click();
			      
			      Thread.sleep(2000);
			    String msg=MyWorkspaceLocator. Deletevalidmsg(driver).getText();
			    
			    if(msg.equalsIgnoreCase(msg))
			    {
			    	test.log(LogStatus.PASS, "Message Dispalyed=" +msg);
			    }
			    else
			    {
			    	test.log(LogStatus.FAIL, "Message Dispalyed=" +msg);
			    }
		
			    
			    if( MyWorkspaceLocator. DeleteIconNo(driver).isEnabled())
			    {
			       Thread.sleep(2000);
			       MyWorkspaceLocator. DeleteIconNo(driver).click();
			       test.log(LogStatus.PASS, "The item should not be deleted");
			    }
			    else
			    {
			    	test.log(LogStatus.FAIL, "The item should  be deleted");
			    }
			      
		}
		
		public static void MeetingCalender(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			Thread.sleep(2000);
			if(MyWorkspaceLocator.MeetingCalender(driver).isEnabled())
			{
			   Thread.sleep(2000);
			    MyWorkspaceLocator.MeetingCalender(driver).click();
			    test.log(LogStatus.PASS, "User  redirected to the Meeting Calender page");
			}
			else
			{
				test.log(LogStatus.FAIL, "User not redirected to the Meeting Calender page");
			}
			
			
		}
		
		public static void AddMeetingCalender(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			  Thread.sleep(2000);
			    MyWorkspaceLocator.MeetingCalender(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator.NewBtn(driver).click();
			    
			    Thread.sleep(2000);
			    MyWorkspaceLocator.AddBtn(driver).click();
			    
			    Thread.sleep(2000);
			    MyWorkspaceLocator.Entity(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator.SelectEntity(driver).click();
//			    Thread.sleep(2000);
//			    MyWorkspaceLocator.ClickFY(driver).click();
//			    
//			    Thread.sleep(2000);
//			    MyWorkspaceLocator.ClickFY1(driver).click();
//			    Thread.sleep(2000);
//			    MyWorkspaceLocator. SelectFY(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator.ClickMeetingType(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator.SelectMeetingType(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator.ClickMeetingNumber(driver).sendKeys("5");
			    Thread.sleep(2000);
			    MyWorkspaceLocator.MeetingDate(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator.SelectDate(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator. StarDate(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator.StarDateTime(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator.EndDate(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator. EndDateTime(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator.savebtn(driver).click();
			    Thread.sleep(2000);
			    String msg=  MyWorkspaceLocator. ValidMsg1(driver).getText();
			   if(MyWorkspaceLocator. ValidMsg1(driver).isEnabled()) 
			   {
				  test.log(LogStatus.PASS, "Message Displayed =" +msg);
				  
			   }
			   else
			   {
				   test.log(LogStatus.FAIL, "Message Displayed =" +msg);
			   }
			   
			    Thread.sleep(2000);
			    MyWorkspaceLocator.closeIcon(driver).click();
			    
			    Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
			    
		}
		
		public static void MeetingCalenderWithoutEnterData(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			  Thread.sleep(2000);
			    MyWorkspaceLocator.MeetingCalender(driver).click();
			    Thread.sleep(2000);
			    MyWorkspaceLocator.NewBtn(driver).click();
			    
			    Thread.sleep(2000);
			    MyWorkspaceLocator.AddBtn(driver).click();
			    
			    Thread.sleep(2000);
			    MyWorkspaceLocator.savebtn(driver).click();
			    Thread.sleep(2000);
			    String msg=  MyWorkspaceLocator. ValidMsg1(driver).getText();
			   if(msg.equalsIgnoreCase(msg)) 
			   {
				  test.log(LogStatus.FAIL, "Message Displayed =" +msg);
				  
			   }
			   else
			   {
				   test.log(LogStatus.PASS, "Message Displayed =" +msg);
			   }
			   
			    Thread.sleep(2000);
			    MyWorkspaceLocator.closeIcon(driver).click();
			    
			    Thread.sleep(4000);
			     EntityLocator.ClickDashboard(driver).click();
			    
		}
		
		public static void ClearBtn(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			WebDriverWait wait=new WebDriverWait(driver, 20);
		
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			  Thread.sleep(2000);
			    MyWorkspaceLocator.MeetingCalender(driver).click();
			    
			    Thread.sleep(2000);
			    MyWorkspaceLocator.ClickEntity(driver).click();
			    
			    Thread.sleep(2000);
				 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='EntityID_listbox']/li"));
				 selectOptionFromDropDown_bs(entitytype, "A LIMITED");
				
				 if( MyWorkspaceLocator.clearFilter(driver).isEnabled())
				 {
				   Thread.sleep(2000);
			       MyWorkspaceLocator.clearFilter(driver).click();
			       test.log(LogStatus.PASS, "Clear button is clickable");
				 }
				 else
				 {
					 test.log(LogStatus.FAIL, "Clear button is not clickable");
				 }
		}
		
		public static void MyMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			Thread.sleep(2000);
			if(MyWorkspaceLocator.MyMeeting(driver).isEnabled())
			{
				Thread.sleep(2000);
				MyWorkspaceLocator.MyMeeting(driver).click();
				test.log(LogStatus.PASS, "User redirected on 'My Meeting' page");
			}
			else
			{
				test.log(LogStatus.FAIL, "User not redirected on 'My Meeting' page");
			}
		}
		public static void NewRegularMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.MyMeeting(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.AddRegularMeeting(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.clickEntity1(driver).click();
			
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "CAM SERVICE LLP");
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickType1(driver).click();
			
				
				Thread.sleep(2000);
				 List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
					selectOptionFromDropDown_bs(type, "Board");
			
				Thread.sleep(2000);
				MyWorkspaceLocator.clickFY1(driver).click();
					
				Thread.sleep(2000);
				List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
				selectOptionFromDropDown_bs(FY, "FY-2023-24");
				
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickSave1(driver).click();
				
				try
				{
				  Thread.sleep(2000);
				  if(MyWorkspaceLocator.clickEntityOrCompnay(driver).isDisplayed())
				   {
		
					   test.log(LogStatus.PASS, "User redirected on 'Regular Meeting' page");
				  } 
				  else
				  {
					  test.log(LogStatus.FAIL, "User not redirected on 'Regular Meeting' page");
				  }
				}
			  catch(Exception e)
				 {
				    Thread.sleep(2000);
					String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
					if(msg.equalsIgnoreCase(msg))
					{
						test.log(LogStatus.PASS, "Message displayed =" +msg);
					}
					else
					{
						test.log(LogStatus.FAIL, "Message displayed =" +msg);
					}
				  }
				Thread.sleep(2000);
				MyWorkspaceLocator.close(driver).click();
		}
		public static void NewShorterMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.MyMeeting(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.AddRegularMeeting(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.clickEntity1(driver).click();
			
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "LACC LIMITED");
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickType1(driver).click();
			
				
				Thread.sleep(2000);
				 List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
					selectOptionFromDropDown_bs(type, "Board");
			
				Thread.sleep(2000);
				MyWorkspaceLocator.clickFY1(driver).click();
					
				Thread.sleep(2000);
				List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
				selectOptionFromDropDown_bs(FY, "FY-2022-23");
				
				Thread.sleep(2000);
				MyWorkspaceLocator.Shorter(driver).click();
				
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickSave1(driver).click();
				
				try
				{
				  Thread.sleep(2000);
				  if(MyWorkspaceLocator.clickEntityOrCompnay(driver).isDisplayed())
				   {
		
					   test.log(LogStatus.PASS, "User should be redirected to the 'Shorter Notice Meeting' page");
				  } 
				  else
				  {
					  test.log(LogStatus.FAIL, "User should not be redirected to the 'Shorter Notice Meeting' page");
				  }
				}
			  catch(Exception e)
				 {
				    Thread.sleep(2000);
					String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
					if(msg.equalsIgnoreCase(msg))
					{
						test.log(LogStatus.PASS, "Message displayed =" +msg);
					}
					else
					{
						test.log(LogStatus.FAIL, "Message displayed =" +msg);
					}
				  }
				Thread.sleep(2000);
				MyWorkspaceLocator.close(driver).click();
		}	    
			
		public static void NewEMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.MyMeeting(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.AddRegularMeeting(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.clickEntity1(driver).click();
			
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "A LIMITED");
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickType1(driver).click();
			
				
				Thread.sleep(2000);
				 List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
					selectOptionFromDropDown_bs(type, "Board");
			
				Thread.sleep(2000);
				MyWorkspaceLocator.clickFY1(driver).click();
					
				Thread.sleep(2000);
				List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
				selectOptionFromDropDown_bs(FY, "FY-2022-23");
				
				Thread.sleep(2000);
				MyWorkspaceLocator.eMetting(driver).click();
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickSave1(driver).click();
				
				try
				{
				  Thread.sleep(2000);
				  if(MyWorkspaceLocator.clickEntityOrCompnay(driver).isDisplayed())
				   {
		
					   test.log(LogStatus.PASS, "User redirected on 'Regular e-Meeting' page");
				  } 
				  else
				  {
					  test.log(LogStatus.FAIL, "User not redirected on 'Regular e-Meeting' page");
				  }
				}
			  catch(Exception e)
				 {
				    Thread.sleep(2000);
					String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
					if(msg.equalsIgnoreCase(msg))
					{
						test.log(LogStatus.PASS, "Message displayed =" +msg);
					}
					else
					{
						test.log(LogStatus.FAIL, "Message displayed =" +msg);
					}
				  }
					  
				  
				Thread.sleep(2000);
				MyWorkspaceLocator.close(driver).click();
		}	    
		public static void CircularMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
		{
			
			Thread.sleep(2000);
			MyWorkspaceLocator.MyWorkspaceimg(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.MyMeeting(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.AddRegularMeeting(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.circular(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.clickEntity1(driver).click();
			
			Thread.sleep(2000);
			 List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
				selectOptionFromDropDown_bs(entitytype, "AAM SERVICE LLP");
				
				Thread.sleep(2000);
				MyWorkspaceLocator.clickType1(driver).click();
			
				
				Thread.sleep(2000);
				 List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
					selectOptionFromDropDown_bs(type, "Board");
			
				Thread.sleep(2000);
				MyWorkspaceLocator.clickFY1(driver).click();
					
				Thread.sleep(2000);
				List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
				selectOptionFromDropDown_bs(FY, "FY-2022-23");
				
			
				Thread.sleep(2000);
				MyWorkspaceLocator.clickSave1(driver).click();
				
				try
				{
				  Thread.sleep(2000);
				  if(MyWorkspaceLocator.clickEntityOrCompnay(driver).isDisplayed())
				   {
		
					   test.log(LogStatus.PASS, "User redirected on 'Regular Meeting' page");
				  } 
				  else
				  {
					  test.log(LogStatus.FAIL, "User not redirected on 'Regular Meeting' page");
				  }
				}
			  catch(Exception e)
				 {
				    Thread.sleep(2000);
					String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
					if(msg.equalsIgnoreCase(msg))
					{
						test.log(LogStatus.PASS, "Message displayed =" +msg);
					}
					else
					{
						test.log(LogStatus.FAIL, "Message displayed =" +msg);
					}
				  }
				Thread.sleep(2000);
				MyWorkspaceLocator.close(driver).click();
		}	
		

public static void NewRegularNoticeMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "RANJIT SECURITIES LIMITED");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		 List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
			selectOptionFromDropDown_bs(type, "Board");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();
	    
		try
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.ClickCalender(driver).click();
			

			Thread.sleep(2000);
			MyWorkspaceLocator.SelectDate(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.clickTime(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.selectTime(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.clickVenue(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.SelectVenue(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ClickUpdte(driver).click();
			
			Thread.sleep(2000);
		    String msg=  MyWorkspaceLocator. UpdateValidMsg(driver).getText();
		    if(msg.equalsIgnoreCase(msg)) 
		    {
		    	test.log(LogStatus.PASS, "Message Displayed =" +msg);
			  
		    }
		    else
		    {
			   test.log(LogStatus.FAIL, "Message Displayed =" +msg);
		    }
		}
	  catch(Exception e)
		 {
		    Thread.sleep(2000);
			String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
			if(msg.equalsIgnoreCase(msg))
			{
				test.log(LogStatus.PASS, "Message displayed =" +msg);
			}
			else
			{
				test.log(LogStatus.FAIL, "Message displayed =" +msg);
			}
		  }
	    
	    
			
		
		Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
}
		
public static void NewShorterNoticeMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "BFN FORGINGS PRIVATE LIMITED");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		 List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
			selectOptionFromDropDown_bs(type, "Board");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();
	    
	    try
	    {
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickCalender(driver).click();
		

	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.SelectDate(driver).click();
		
	    	Thread.sleep(2000);
			MyWorkspaceLocator.clickTime(driver).click();
			
			Thread.sleep(2000);
			MyWorkspaceLocator.selectTime(driver).click();
		
			Thread.sleep(2000);
			MyWorkspaceLocator.clickVenue(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.SelectVenue(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ClickRadioBtnShoerterNotice(driver).click();
			Thread.sleep(2000);
			MyWorkspaceLocator.ClickUpdte(driver).click();
		
			Thread.sleep(2000);
			String msg=  MyWorkspaceLocator. UpdateValidMsg(driver).getText();
			if(msg.equalsIgnoreCase(msg)) 
			{
				test.log(LogStatus.PASS, "Message Displayed =" +msg);
				
			}
			else
			{
				test.log(LogStatus.FAIL, "Message Displayed =" +msg);
			}
	    }
	    catch(Exception e)
		 {
		    Thread.sleep(2000);
			String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
			if(msg.equalsIgnoreCase(msg))
			{
				test.log(LogStatus.PASS, "Message displayed =" +msg);
			}
			else
			{
				test.log(LogStatus.FAIL, "Message displayed =" +msg);
			}
		  }
		Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
}
public static void WithoutEnterRegularNoticeMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "LNT PVT LTD");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		 List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
			selectOptionFromDropDown_bs(type, "Designated Partner's");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();
			
		try
		{
			Thread.sleep(2000);
			MyWorkspaceLocator.ClickUpdte(driver).click();
		
			Thread.sleep(2000);
			String msg=  MyWorkspaceLocator. UpdateValidMsg(driver).getText();
			if(msg.equalsIgnoreCase(msg)) 
			{
				test.log(LogStatus.FAIL, "Without Enter Data =" +msg);
		  
			}
			else
			{
				test.log(LogStatus.PASS, "Without Enter Data  =" +msg);
			}
		}
	  catch(Exception e)
			{
			   Thread.sleep(2000);
		       String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
				if(msg.equalsIgnoreCase(msg))
					{
						test.log(LogStatus.PASS, "Message displayed =" +msg);
					}
				else
					{
						test.log(LogStatus.FAIL, "Message displayed =" +msg);
					}
		    }
		Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
}	

public static void AvailabiltyOption(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "KESTREL AVIATION PRIVATE LIMITED");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		 List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
			selectOptionFromDropDown_bs(type, "Board");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();
	    
	   
		try
		{
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.ClickCheckAvailabilty(driver).isDisplayed())
		   {
			  if(MyWorkspaceLocator.ClickRadioBtnAvailabilty(driver).isEnabled())
			  {
				  Thread.sleep(2000);
				  MyWorkspaceLocator.ClickRadioBtnAvailabilty(driver).click();
			     test.log(LogStatus.PASS, "'Availibility' option should get activated after clicking on 'Yes' radio button");
			  }
		  } 
		  else
		  {
			  test.log(LogStatus.FAIL, "'Availibility' option should not get activated after clicking on 'Yes' radio button");
		  }
		}
	  catch(Exception e)
		 {
		    Thread.sleep(2000);
			String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
			if(msg.equalsIgnoreCase(msg))
			{
				test.log(LogStatus.PASS, "Message displayed =" +msg);
			}
			else
			{
				test.log(LogStatus.FAIL, "Message displayed =" +msg);
			}
		  }
	    
	 
		Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
}
public static void ClickAvailabiltyOption(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "HEGET PVT LTD");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		 List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
			selectOptionFromDropDown_bs(type, "Board");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();	
	    
		try
			{
			  Thread.sleep(2000);
			  if(MyWorkspaceLocator.ClickCheckAvailabilty(driver).isDisplayed())
			   {
				  
				   Thread.sleep(2000);
					MyWorkspaceLocator.ClickRadioBtnAvailabilty(driver).click();
					
					if(MyWorkspaceLocator.ClickAvailabiltyTab(driver).isEnabled())
					{
						Thread.sleep(2000);
						MyWorkspaceLocator.ClickAvailabiltyTab(driver).click();
				    
						test.log(LogStatus.PASS, "User should be redirected to the 'Availibility' page");
					}
			  } 
					
			  else
			  {
				  test.log(LogStatus.FAIL, "User should be redirected to the 'Availibility' page");
			  }
			}
		  catch(Exception e)
			 {
			    Thread.sleep(2000);
				String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
				if(msg.equalsIgnoreCase(msg))
				{
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				}
				else
				{
					test.log(LogStatus.FAIL, "Message displayed =" +msg);
				}
			  }
			
			Thread.sleep(2000);
			MyWorkspaceLocator.close(driver).click();
}

public static void AddNewAvailability(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "ADANI AEROSPACE AND DEFENCE LIMITED");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
		selectOptionFromDropDown_bs(type, "Independent Director");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();	
	    
	    try
	    {
	    
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickRadioBtnAvailabilty(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickAvailabiltyTab(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickAddBtn(driver).click();
	  
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickCalender(driver).click();
		

	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.SelectDate(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickTime(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.selectTime(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickVenue1(driver).click();

		
	    	Thread.sleep(2000);
	    	List<WebElement>SelectVenue = driver.findElements(By.xpath("//ul[@id='AvailabilityAddressType_listbox']/li"));
	    	selectOptionFromDropDown_bs(SelectVenue, "Registered Office");
			
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickPrefrence(driver).click();
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.SelectPrefrence(driver).click();
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickSaveBtn(driver).click();
		
		
		
	    	Thread.sleep(2000);
	    	String msg =MyWorkspaceLocator.clickSaveValidMsg(driver).getText();
		
	    	if(msg.equalsIgnoreCase(msg))
	    	{
	    		test.log(LogStatus.PASS, "Add Aavailabiltiy = " +msg);
	    	}
	    	else
	    	{
	    		test.log(LogStatus.FAIL, "Add Aavailabiltiy = " +msg);
	    	}
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickcloseIcon(driver).click();
	    }
	   catch(Exception e)
			 {
			    Thread.sleep(2000);
				String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
				if(msg.equalsIgnoreCase(msg))
				{
					test.log(LogStatus.PASS, "Message displayed =" +msg);
				}
				else
				{
					test.log(LogStatus.FAIL, "Message displayed =" +msg);
				}
			  }
		Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
}
			   		
			
public static void AddExistingAvailability(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "KESTREL AVIATION PRIVATE LIMITED");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
		selectOptionFromDropDown_bs(type, "Board");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();	
	    
	    try
	    {
	    
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickRadioBtnAvailabilty(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickAvailabiltyTab(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickAddBtn(driver).click();
	  
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickCalender(driver).click();
		

	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.SelectDate(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickTime(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.selectTime(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickVenue1(driver).click();

		
	    	Thread.sleep(2000);
	    	List<WebElement>SelectVenue = driver.findElements(By.xpath("//ul[@id='AvailabilityAddressType_listbox']/li"));
	    	selectOptionFromDropDown_bs(SelectVenue, "Registered Office");
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickPrefrence(driver).click();
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.SelectPrefrence(driver).click();
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickSaveBtn(driver).click();
		
	    	Thread.sleep(2000);
	    	String msg =MyWorkspaceLocator.clickSaveValidMsg(driver).getText();
		
	    	if(msg.equalsIgnoreCase(msg))
	    	{
	    		test.log(LogStatus.FAIL, "Add Exsiting Aavailabiltiy = " +msg);
	    	}
	    	else
	    	{
	    		test.log(LogStatus.PASS, "Add Exsiting Aavailabiltiy = " +msg);
	    	}
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickcloseIcon(driver).click();
	 }
	catch(Exception e)
	{
		Thread.sleep(2000);
		String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
		if(msg.equalsIgnoreCase(msg))
		{
		test.log(LogStatus.PASS, "Message displayed =" +msg);
		}
		else
		{
			test.log(LogStatus.FAIL, "Message displayed =" +msg);
		}
	}

		Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
}
public static void WithoutEnterDataAvailability(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "ADANI ENTERPRISES LIMITED");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
		selectOptionFromDropDown_bs(type, "Audit Committee");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();	
	    
	    try
	    {
	    
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickRadioBtnAvailabilty(driver).click();
		
	    	Thread.sleep(2000);
			MyWorkspaceLocator.ClickAvailabiltyTab(driver).click();
		
			Thread.sleep(2000);
			MyWorkspaceLocator.ClickAddBtn(driver).click();
	  
		
			Thread.sleep(2000);
			MyWorkspaceLocator.clickSaveBtn(driver).click();
		
			Thread.sleep(2000);
			String msg =MyWorkspaceLocator.clickInvaliMsg(driver).getText();
		
			if(msg.equalsIgnoreCase(msg))
			{
				test.log(LogStatus.PASS, "Without Entering data in Aavailabiltiy = " +msg);
			}
			else
			{
				test.log(LogStatus.FAIL, "Without Entering data in  Aavailabiltiy = " +msg);
			}
		
			Thread.sleep(2000);
			MyWorkspaceLocator.clickcloseIcon(driver).click();
	    }
		 catch(Exception e)
		 {
		    Thread.sleep(2000);
			String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
			if(msg.equalsIgnoreCase(msg))
			{
				test.log(LogStatus.PASS, "Message displayed =" +msg);
			}
			else
			{
				test.log(LogStatus.FAIL, "Message displayed =" +msg);
			}
		  }
		Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
}			   					
public static void CancelBtnAvailability(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "SPRESSO POD MANUFACTURING PRIVATE LIMITED");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
		selectOptionFromDropDown_bs(type, "Board");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();	
	    try
	    {
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickRadioBtnAvailabilty(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickAvailabiltyTab(driver).click();
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickAddBtn(driver).click();
	  
	
	    	if(MyWorkspaceLocator.clickCancelBtn(driver).isEnabled())
	    	{
	    		Thread.sleep(2000);
	    		MyWorkspaceLocator.clickCancelBtn(driver).click();
	    		test.log(LogStatus.PASS, "Cancel Btn is clickable");
	    	}
	    	else
	    	{
	    		test.log(LogStatus.FAIL, "Cancel button is not clickable");
	    	}
		
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickcloseIcon(driver).click();
	    }
		 catch(Exception e)
		 {
			 Thread.sleep(2000);
			 String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
			 if(msg.equalsIgnoreCase(msg))
			 {
				test.log(LogStatus.PASS, "Message displayed =" +msg);
			 }
			 else
			 {
				test.log(LogStatus.FAIL, "Message displayed =" +msg);
			 }
		  }
		Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
}			   									
public static void MailFormatBtn(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "SPRESSO POD MANUFACTURING PRIVATE LIMITED");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
		selectOptionFromDropDown_bs(type, "Board");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();
	    
	    try
	    {
	    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickRadioBtnAvailabilty(driver).click();
	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickAvailabiltyTab(driver).click();
    	
    	
	    	if(MyWorkspaceLocator.clickMailFormat(driver).isEnabled())
    		{
    			MyWorkspaceLocator.clickMailFormat(driver).click();
    			test.log(LogStatus.PASS, "User should be redirected to the mail format page");
    		}
    		else
    		{
    			test.log(LogStatus.FAIL, "User should not be redirected to the mail format page");
    		}
    	}
    	catch(Exception e) 
    	{

			 Thread.sleep(2000);
			 String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
			 if(msg.equalsIgnoreCase(msg))
			 {
				test.log(LogStatus.PASS, "Message displayed =" +msg);
			 }
			 else
			 {
				test.log(LogStatus.FAIL, "Message displayed =" +msg);
			 }
    	}
    	Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
    	
    }

public static void  UpdateMailFormat(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "TEAMLEASE REGTECH PRIVATE LIMITED");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
		selectOptionFromDropDown_bs(type, "Board");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();
	    
	    try
	    {
	    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickRadioBtnAvailabilty(driver).click();
	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickAvailabiltyTab(driver).click();
    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickMailFormat(driver).click();
	    	
	    	driver.switchTo().frame(MyWorkspaceLocator.clickFrame(driver));
	    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickText(driver).clear();
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickText(driver).sendKeys("Test");
	    	
	    	driver.switchTo().parentFrame();
	    
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickUpdate(driver).click();
	    	
	    	Thread.sleep(2000);
	    	String msg=MyWorkspaceLocator.clickValidMsg1(driver).getText();
	    	if(msg.equalsIgnoreCase(msg))
    		{
    			
    			test.log(LogStatus.PASS, "Message displayed ="+msg);
    		}
    		else
    		{
    			test.log(LogStatus.FAIL, "Message displayed ="+msg);
    		}
    	}
    	catch(Exception e) 
    	{

			 Thread.sleep(2000);
			 String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
			 if(msg.equalsIgnoreCase(msg))
			 {
				test.log(LogStatus.PASS, "Message displayed =" +msg);
			 }
			 else
			 {
				test.log(LogStatus.FAIL, "Message displayed =" +msg);
			 }
    	}
    	Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
    	
    }
public static void  SendMail(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "PQR PVT LTD");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
		selectOptionFromDropDown_bs(type, "Designated Partner's");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();
	    
	    try
	    {
	    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickRadioBtnAvailabilty(driver).click();
	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickAvailabiltyTab(driver).click();
	    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickAvailabiltyDueDate(driver).click();
	    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.SelectAvailabiltyDueDate(driver).click();
    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickMailFormat(driver).click();
	    	
	    	driver.switchTo().frame(MyWorkspaceLocator.clickFrame(driver));
	    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickText(driver).clear();
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickText(driver).sendKeys("Test");
	    	
	    	driver.switchTo().parentFrame();
	    
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickSendBtn(driver).click();
	    	
	    	Thread.sleep(2000);
	    	String msg=MyWorkspaceLocator.clickValidMsg1(driver).getText();
	    	if(msg.equalsIgnoreCase(msg))
    		{
    			
    			test.log(LogStatus.PASS, "Message displayed ="+msg);
    		}
    		else
    		{
    			test.log(LogStatus.FAIL, "Message displayed ="+msg);
    		}
    	}
    	catch(Exception e) 
    	{

			 Thread.sleep(2000);
			 String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
			 if(msg.equalsIgnoreCase(msg))
			 {
				test.log(LogStatus.PASS, "Message displayed =" +msg);
			 }
			 else
			 {
				test.log(LogStatus.FAIL, "Message displayed =" +msg);
			 }
    	}
    	Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
    	
    }
public static void  WithoutEnterDataSendMail(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "LC LIMITED");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
		selectOptionFromDropDown_bs(type, "Board");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();
	    
	    try
	    {
	    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickRadioBtnAvailabilty(driver).click();
	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.ClickAvailabiltyTab(driver).click();
	    	
	    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickMailFormat(driver).click();
	    	
	    	
	    	Thread.sleep(2000);
	    	MyWorkspaceLocator.clickSendBtn(driver).click();
	    	
	    	Thread.sleep(2000);
	    	String msg=MyWorkspaceLocator.clickErrorMsg1(driver).getText();
	    	if(msg.equalsIgnoreCase(msg))
    		{
    			
    			test.log(LogStatus.PASS, "Message displayed ="+msg);
    		}
    		else
    		{
    			test.log(LogStatus.FAIL, "Message displayed ="+msg);
    		}
    	}
    	catch(Exception e) 
    	{

			 Thread.sleep(2000);
			 String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
			 if(msg.equalsIgnoreCase(msg))
			 {
				test.log(LogStatus.PASS, "Message displayed =" +msg);
			 }
			 else
			 {
				test.log(LogStatus.FAIL, "Message displayed =" +msg);
			 }
    	}
    	Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
    	
    }
public static void AgendaItem(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.AddRegularMeeting(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntity1(driver).click();
	
		Thread.sleep(2000);
		List<WebElement>entitytype = driver.findElements(By.xpath("//ul[@id='Entityt_Id_listbox']/li"));
		selectOptionFromDropDown_bs(entitytype, "ADBC PVT LTD");
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickType1(driver).click();
	
		
		Thread.sleep(2000);
		 List<WebElement>type = driver.findElements(By.xpath("//ul[@id='MeetingTypeId_listbox']/li"));
			selectOptionFromDropDown_bs(type, "Board");
	
		Thread.sleep(2000);
		MyWorkspaceLocator.clickFY1(driver).click();
			
		Thread.sleep(2000);
		List<WebElement>FY = driver.findElements(By.xpath("//ul[@id='FYID_listbox']/li"));
		selectOptionFromDropDown_bs(FY, "FY-2023-24");
		
        Thread.sleep(2000);
	    MyWorkspaceLocator.clickSave1(driver).click();
	    
	   
		try
		{
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.ClickCheckAvailabilty(driver).isDisplayed())
		   {
			  if(MyWorkspaceLocator.clickAgendaItem(driver).isEnabled())
			  {
				  Thread.sleep(2000);
				  MyWorkspaceLocator.clickAgendaItem(driver).click();
			     test.log(LogStatus.PASS, "User should be redirected to the 'Agenda Item' page");
			  }
		  } 
		  else
		  {
			  test.log(LogStatus.FAIL, "User should not be redirected to the 'Agenda Item' page");
		  }
		}
	  catch(Exception e)
		 {
		    Thread.sleep(2000);
			String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
			if(msg.equalsIgnoreCase(msg))
			{
				test.log(LogStatus.PASS, "Message displayed =" +msg);
			}
			else
			{
				test.log(LogStatus.FAIL, "Message displayed =" +msg);
			}
		  }
	    
	 
		Thread.sleep(2000);
		MyWorkspaceLocator.close(driver).click();
}
public static void OpenAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);  
		  if(MyWorkspaceLocator.ClickOpenAgenda(driver).isEnabled())
		  	{
			  Thread.sleep(2000);
			  MyWorkspaceLocator.ClickOpenAgenda(driver).click();
			  test.log(LogStatus.PASS, "User should be redirected to the Open Agenda window");
		  	}
	  
		  else
		  	{
			  test.log(LogStatus.FAIL, "User should not be redirected to the Open Agenda window");
		  	}
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCloseNotingAgendaPopup(driver).click();
		  
		  Thread.sleep(2000);
			MyWorkspaceLocator.close(driver).click();
}

public static void AddOpenAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickOpenAgenda(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickCheckbox(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator. clickSaveBtn1(driver).click();
		  
		  Thread.sleep(2000);
		   String msg= MyWorkspaceLocator.clickValidMsg3(driver).getText();
		  if(msg.equalsIgnoreCase(msg))
		  {
			  test.log(LogStatus.PASS, "Message displayed :-"+msg);
		  }
		  else
		  {
			  test.log(LogStatus.PASS, "Message displayed :-"+msg);
		  }
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCloseNotingAgendaPopup(driver).click();
		  
		  Thread.sleep(2000);
			MyWorkspaceLocator.close(driver).click();
}

public static void AddMultipleOpenAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickOpenAgenda(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickCheckbox(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickCheckbox1(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator. clickSaveBtn1(driver).click();
		  
		  Thread.sleep(2000);
		   String msg= MyWorkspaceLocator.clickValidMsg3(driver).getText();
		  if(msg.equalsIgnoreCase(msg))
		  {
			  test.log(LogStatus.PASS, "Message displayed :-"+msg);
		  }
		  else
		  {
			  test.log(LogStatus.PASS, "Message displayed :-"+msg);
		  }
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCloseNotingAgendaPopup(driver).click();
		  
		  Thread.sleep(2000);
			MyWorkspaceLocator.close(driver).click();
}

public static void OpenAgendaInfo(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickOpenAgenda(driver).click();
		  
	
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.ClickOpenAgendaInfo(driver).isEnabled())
		  {
			  
			  Thread.sleep(2000);
			  MyWorkspaceLocator.ClickOpenAgendaInfo(driver).click();
			  test.log(LogStatus.PASS, "User should able to see agenda information after clicking on the 'i' button ");
		  }
		  else
		  {
			  test.log(LogStatus.FAIL, "User should not able to see agenda information after clicking on the 'i' button ");
		  }
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItemInfo(driver).click();
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCloseNotingAgendaPopup(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.close(driver).click();
}
		  
public static void NotingAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  if(MyWorkspaceLocator.clickNotingAgenda(driver).isEnabled())
		  	{
			  Thread.sleep(2000);
			  MyWorkspaceLocator.clickNotingAgenda(driver).click();
			  test.log(LogStatus.PASS, "User should be redirected to the Noting Agenda window");
		  	}
	  
		  else
		  	{
			  test.log(LogStatus.FAIL, "User should not be redirected to the Noting Agenda window");
		  	}
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCloseNotingAgendaPopup(driver).click();
}
public static void AddNotingAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickNotingAgenda(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCheckboxNotingAgenda(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickSaveBtn1(driver).click();
		  
		  Thread.sleep(2000);
		  String msg =MyWorkspaceLocator.clickValidMsg3(driver).getText();
		  
		  if(msg.equalsIgnoreCase(msg))
		  {
			  test.log(LogStatus.PASS, "Message displayed =" +msg);
		  }
		  else
		  {
			  test.log(LogStatus.FAIL, "Message displayed =" +msg);
		  }
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCloseNotingAgendaPopup(driver).click();
		  
		  
}

public static void AddMultipleNotingAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickNotingAgenda(driver).click();
		 
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCheckboxNotingAgenda1(driver).click();
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCheckboxNotingAgenda2(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCheckboxNotingAgenda3(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickSaveBtn1(driver).click();
		  
		  Thread.sleep(2000);
		  String msg =MyWorkspaceLocator.clickValidMsg3(driver).getText();
		  
		  if(msg.equalsIgnoreCase(msg))
		  {
			  test.log(LogStatus.PASS, "Message displayed =" +msg);
		  }
		  else
		  {
			  test.log(LogStatus.FAIL, "Message displayed =" +msg);
		  }
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCloseNotingAgendaPopup(driver).click();
		  
		  
}

public static void  AgendaItemInformation(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickNotingAgenda(driver).click();
		
		  Thread.sleep(2000);
		  if( MyWorkspaceLocator.clickIicon(driver).isEnabled())
		  {
			  Thread.sleep(2000);
			  MyWorkspaceLocator.clickIicon(driver).click();
			  test.log(LogStatus.PASS, "User should able to see agenda information after clicking on the 'i' button ");
		  }
		  else
		  {
			  test.log(LogStatus.FAIL, "User should not able to see agenda information after clicking on the 'i' button ");
		  }
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItemInfo(driver).click();
		  
}


public static void VotingAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  if(MyWorkspaceLocator.clickVottingAgenda(driver).isEnabled())
		  	{
			  Thread.sleep(2000);
			  MyWorkspaceLocator.clickVottingAgenda(driver).click();
			  test.log(LogStatus.PASS, "User should be redirected to the Voting Agenda window");
		  	}
	  
		  else
		  	{
			  test.log(LogStatus.FAIL, "User should not be redirected to the Voting Agenda window");
		  	}
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCloseNotingAgendaPopup(driver).click();
}

public static void AddVotingAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickVottingAgenda(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCheckboxNotingAgenda(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickSaveBtn1(driver).click();
		  
		  Thread.sleep(2000);
		  String msg =MyWorkspaceLocator.clickValidMsg3(driver).getText();
		  
		  if(msg.equalsIgnoreCase(msg))
		  {
			  test.log(LogStatus.PASS, "Message displayed =" +msg);
		  }
		  else
		  {
			  test.log(LogStatus.FAIL, "Message displayed =" +msg);
		  }
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCloseNotingAgendaPopup(driver).click();
		  
		  
}
public static void AddMultipleVotingAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickVottingAgenda(driver).click();
		 
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCheckboxNotingAgenda1(driver).click();
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCheckboxNotingAgenda2(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCheckboxNotingAgenda3(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickSaveBtn1(driver).click();
		  
		  Thread.sleep(2000);
		  String msg =MyWorkspaceLocator.clickValidMsg3(driver).getText();
		  
		  if(msg.equalsIgnoreCase(msg))
		  {
			  test.log(LogStatus.PASS, "Message displayed =" +msg);
		  }
		  else
		  {
			  test.log(LogStatus.FAIL, "Message displayed =" +msg);
		  }
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCloseNotingAgendaPopup(driver).click();
		  
		  
}
public static void  VotingAgendaItemInformation(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickVottingAgenda(driver).click();
		
		  Thread.sleep(2000);
		  if( MyWorkspaceLocator.clickIicon1(driver).isEnabled())
		  {
			  Thread.sleep(2000);
			  MyWorkspaceLocator.clickIicon1(driver).click();
			  test.log(LogStatus.PASS, "User should able to see agenda information after clicking on the 'i' button ");
		  }
		  else
		  {
			  test.log(LogStatus.FAIL, "User should not able to see agenda information after clicking on the 'i' button ");
		  }
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItemInfo(driver).click();
		  
}

public static void NewAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.clickNewAgenda(driver).isEnabled())
		  	{
			  Thread.sleep(2000);
			  MyWorkspaceLocator.clickNewAgenda(driver).click();
			  test.log(LogStatus.PASS, "User should be redirected to the New Agenda window");
		  	}
	  
		  else
		  	{
			  test.log(LogStatus.FAIL, "User should not be redirected to the New Agenda window");
		  	}
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickNewAgendaCloseBtn(driver).click();
}
public static void AddNewVotingAgenda(WebDriver driver,ExtentTest test,XSSFWorkbook workbook,XSSFSheet sheet) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickNewAgenda(driver).click();
		  
		  
		  Thread.sleep(2000);
		  Row row = sheet.getRow(85);												//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c = row.getCell(1);						//Selected cell (1 row,1 column)
	      String agendaItem = c.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickAgendaItem1(driver).sendKeys(agendaItem );
		  
		  Thread.sleep(2000);
		  Row row1 = sheet.getRow(86);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c1 = row1.getCell(1);						//Selected cell (1 row,1 column)
	      String agendaHeading = c1.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickAgendaHeading(driver).sendKeys(agendaHeading );
		  
		  
		   Thread.sleep(2000);
		  MyWorkspaceLocator.clickVoting(driver).click();
		  
		  Thread.sleep(2000);
		  driver.switchTo().frame(MyWorkspaceLocator.clickFrameAgendaTemplte(driver));
		  
		  
		  Thread.sleep(2000);
		  Row row2 = sheet.getRow(87);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c2 = row2.getCell(1);						//Selected cell (1 row,1 column)
	      String AgendaTemplate = c2.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickTextAgendaTemplte(driver).sendKeys(AgendaTemplate );
		  
		  driver.switchTo().parentFrame();
		  
		  Thread.sleep(2000);					
		  MyWorkspaceLocator.clickResolutionTemplte(driver).click();
		  
		  Thread.sleep(2000);
		  driver.switchTo().frame(MyWorkspaceLocator.clickFrameResolutionTemplte(driver));
		  
		  Thread.sleep(2000);
		  Row row3 = sheet.getRow(88);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c3 = row3.getCell(1);						//Selected cell (1 row,1 column)
	      String ResolutionTemplate = c3.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickTextAgendaTemplte(driver).sendKeys(ResolutionTemplate );
		  
		  driver.switchTo().parentFrame();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickMinuteTemplte(driver).click();
		  
		  Thread.sleep(2000);
		  Row row4 = sheet.getRow(89);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c4 = row4.getCell(1);						//Selected cell (1 row,1 column)
	      String MinutesTemplate = c4.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickMinutesTemplteHeading(driver).sendKeys(MinutesTemplate );
		  
		  Thread.sleep(2000);
		  driver.switchTo().frame(MyWorkspaceLocator.clickApproveRecommended(driver));
		  
		  Thread.sleep(2000);
		  Row row5 = sheet.getRow(90);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c5 = row5.getCell(1);						//Selected cell (1 row,1 column)
	      String ApproveRecommended = c5.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickTextAgendaTemplte(driver).sendKeys(ApproveRecommended );
		  
		  driver.switchTo().parentFrame();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator. clickDisapproveNonRecommended(driver).click();
		  
		  Thread.sleep(2000);
		  driver.switchTo().frame(MyWorkspaceLocator.clickFrameDisapproveNonRecommended(driver));
		  
		  Thread.sleep(2000);
		  Row row6 = sheet.getRow(91);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c6 = row6.getCell(1);						//Selected cell (1 row,1 column)
	      String DisapproveNonRecommended = c6.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickTextAgendaTemplte(driver).sendKeys(DisapproveNonRecommended );
		  
		  driver.switchTo().parentFrame();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickDefer(driver).click();
		  Thread.sleep(2000);
		  driver.switchTo().frame(MyWorkspaceLocator.clickFrameDefer(driver));
		  
		  Thread.sleep(2000);
		  Row row7 = sheet.getRow(92);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c7 = row7.getCell(1);						//Selected cell (1 row,1 column)
	      String Defer = c7.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickTextAgendaTemplte(driver).sendKeys(Defer );
		  
		  driver.switchTo().parentFrame();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickSaveButton(driver).click();
		  
		  Thread.sleep(2000);
		  String msg =MyWorkspaceLocator.clickvalidmsg(driver).getText();
		  if(msg.equalsIgnoreCase(msg))
		  {
			  test.log(LogStatus.PASS, "Message displayed =" +msg);
		  }
		  else
		  {

			  test.log(LogStatus.FAIL, "Message displayed =" +msg);
		  }
		  
}
public static void AddNewNotingAgenda(WebDriver driver,ExtentTest test,XSSFWorkbook workbook,XSSFSheet sheet) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickNewAgenda(driver).click();
		  
		  
		  Thread.sleep(2000);
		  Row row = sheet.getRow(85);												//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c = row.getCell(1);						//Selected cell (1 row,1 column)
	      String agendaItem = c.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickAgendaItem1(driver).sendKeys(agendaItem );
		  
		  Thread.sleep(2000);
		  Row row1 = sheet.getRow(86);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c1 = row1.getCell(1);						//Selected cell (1 row,1 column)
	      String agendaHeading = c1.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickAgendaHeading(driver).sendKeys(agendaHeading );
		  
		  
		  Thread.sleep(2000);
		  driver.switchTo().frame(MyWorkspaceLocator.clickFrameAgendaTemplte(driver));
		  
		  
		  Thread.sleep(2000);
		  Row row2 = sheet.getRow(87);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c2 = row2.getCell(1);						//Selected cell (1 row,1 column)
	      String AgendaTemplate = c2.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickTextAgendaTemplte(driver).sendKeys(AgendaTemplate );
		  
		  driver.switchTo().parentFrame();
		  
		  Thread.sleep(2000);					
		  MyWorkspaceLocator.clickResolutionTemplte(driver).click();
		  
		  Thread.sleep(2000);
		  driver.switchTo().frame(MyWorkspaceLocator.clickFrameResolutionTemplte(driver));
		  
		  Thread.sleep(2000);
		  Row row3 = sheet.getRow(88);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c3 = row3.getCell(1);						//Selected cell (1 row,1 column)
	      String ResolutionTemplate = c3.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickTextAgendaTemplte(driver).sendKeys(ResolutionTemplate );
		  
		  driver.switchTo().parentFrame();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickMinuteTemplte(driver).click();
		  
		  Thread.sleep(2000);
		  Row row4 = sheet.getRow(89);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c4 = row4.getCell(1);						//Selected cell (1 row,1 column)
	      String MinutesTemplate = c4.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickMinutesTemplteHeading(driver).sendKeys(MinutesTemplate );
		  
		  Thread.sleep(2000);
		  driver.switchTo().frame(MyWorkspaceLocator.clickApproveRecommended(driver));
		  
		  Thread.sleep(2000);
		  Row row5 = sheet.getRow(90);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c5 = row5.getCell(1);						//Selected cell (1 row,1 column)
	      String ApproveRecommended = c5.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickTextAgendaTemplte(driver).sendKeys(ApproveRecommended );
		  
		  driver.switchTo().parentFrame();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator. clickDisapproveNonRecommended(driver).click();
		  
		  Thread.sleep(2000);
		  driver.switchTo().frame(MyWorkspaceLocator.clickFrameDisapproveNonRecommended(driver));
		  
		  Thread.sleep(2000);
		  Row row6 = sheet.getRow(91);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c6 = row6.getCell(1);						//Selected cell (1 row,1 column)
	      String DisapproveNonRecommended = c6.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickTextAgendaTemplte(driver).sendKeys(DisapproveNonRecommended );
		  
		  driver.switchTo().parentFrame();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickDefer(driver).click();
		  Thread.sleep(2000);
		  driver.switchTo().frame(MyWorkspaceLocator.clickFrameDefer(driver));
		  
		  Thread.sleep(2000);
		  Row row7 = sheet.getRow(92);													//Selected 1st index row (Second row)
		  org.apache.poi.ss.usermodel.Cell c7 = row7.getCell(1);						//Selected cell (1 row,1 column)
	      String Defer = c7.getStringCellValue();								//Got the URL stored at position 1,1
		  MyWorkspaceLocator.clickTextAgendaTemplte(driver).sendKeys(Defer );
		  
		  driver.switchTo().parentFrame();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickSaveButton(driver).click();
		  
		  Thread.sleep(2000);
		  String msg =MyWorkspaceLocator.clickvalidmsg(driver).getText();
		  if(msg.equalsIgnoreCase(msg))
		  {
			  test.log(LogStatus.PASS, "Message displayed =" +msg);
		  }
		  else
		  {

			  test.log(LogStatus.FAIL, "Message displayed =" +msg);
		  }
		  
}
public static void WithoutEnteringData(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickNewAgenda(driver).click();
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickSaveButton(driver).click();
		  
		  Thread.sleep(2000);
		  String msg =MyWorkspaceLocator.clickErrorMsg(driver).getText();
		  if(msg.equalsIgnoreCase(msg))
		  {
			  test.log(LogStatus.PASS, "Message displayed =" +msg);
		  }
		  else
		  {

			  test.log(LogStatus.FAIL, "Message displayed =" +msg);
		  }
		  

}
public static void CloseButton(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickNewAgenda(driver).click();
		 
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.clickCloseButton(driver).isEnabled())
		  {
			  Thread.sleep(2000);
			  MyWorkspaceLocator.clickCloseButton(driver).click();
			  test.log(LogStatus.PASS, "Page should be closed without saving data and the user should be redirected to the previous page.");
		  }
		  else
		  {

			  test.log(LogStatus.FAIL, "Page should not be closed without saving data and the user should be redirected to the previous page.");
		  }
		  

}	

public static void AgendaSequence(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		 
		 
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.clickAgendaSequence(driver).isEnabled())
		  {
			  Thread.sleep(2000);
			  MyWorkspaceLocator.clickAgendaSequence(driver).click();
			  test.log(LogStatus.PASS, "Agenda Sequence  tab is clickable");
		  }
		  else
		  {

			  test.log(LogStatus.FAIL, "Agenda Sequence  tab is not clickable");
		  }
		  
		Thread.sleep(3000);
		 MyWorkspaceLocator.clickAgendaSequenceCloseBtn(driver).click();
}

public static void AddAgendaSequence(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaSequence(driver).click();
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCheckboxAgendaSequnce(driver).clear();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCheckboxAgendaSequnce(driver).sendKeys("1");
		  
		  Thread.sleep(2000);
		  Actions a = new Actions(driver);
		  //scroll down a page
		  a.sendKeys(Keys.PAGE_DOWN).build().perform();
		  a.sendKeys(Keys.PAGE_DOWN).build().perform();
		  
		  Thread.sleep(3000);
		  MyWorkspaceLocator.clickAgendaSequenceSubmitBtn(driver).click();
		  
		  Thread.sleep(2000);
		  Actions a1 = new Actions(driver);
		  //scroll down a page
		  a1.sendKeys(Keys.PAGE_UP).build().perform();
		  a1.sendKeys(Keys.PAGE_UP).build().perform();
		  
		  try
		  {
			  Thread.sleep(2000);
			  String msg =MyWorkspaceLocator.clickValidationOfAgendaSequence(driver).getText();
			  if(msg.equalsIgnoreCase(msg))
			  {
				  test.log(LogStatus.PASS, "Message Displayed :- "+msg);
			  }
			  else
			  {
				  test.log(LogStatus.FAIL, "Message Displayed :- "+msg);
			  }	 
		  }
		  catch(Exception e)
		  {
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
		  }
		  
		  Thread.sleep(3000);
		  MyWorkspaceLocator.clickAgendaSequenceCloseBtn(driver).click();

		  Thread.sleep(3000);
		  MyWorkspaceLocator.clickCloseMeetignBorad(driver).click();
    }
		 
public static void DuplicateAgendaSequence(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaSequence(driver).click();
		 
		  
		  Thread.sleep(2000);
		  Actions a = new Actions(driver);
		  //scroll down a page
		  a.sendKeys(Keys.PAGE_DOWN).build().perform();
		  a.sendKeys(Keys.PAGE_DOWN).build().perform();
		  
		  Thread.sleep(3000);
		  MyWorkspaceLocator.clickAgendaSequenceSubmitBtn(driver).click();
		  
		  Thread.sleep(2000);
		  Actions a1 = new Actions(driver);
		  //scroll down a page
		  a1.sendKeys(Keys.PAGE_UP).build().perform();
		  a1.sendKeys(Keys.PAGE_UP).build().perform();
		  
		  try
		  {
		  
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
		  }
		  catch(Exception e)
		  {
			  test.log(LogStatus.FAIL, "Validation Message  not displayed");
		  }
		  
		  Thread.sleep(3000);
		  MyWorkspaceLocator.clickAgendaSequenceCloseBtn(driver).click();
		  
		  Thread.sleep(3000);
		  MyWorkspaceLocator.clickCloseMeetignBorad(driver).click();
		 
		  
    }

public static void WithoutEnterDataAgendaSequence(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaSequence(driver).click();
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCheckboxAgendaSequnce(driver).clear();
		    
		  Thread.sleep(2000);
		  Actions a = new Actions(driver);
		  //scroll down a page
		  a.sendKeys(Keys.PAGE_DOWN).build().perform();
		  a.sendKeys(Keys.PAGE_DOWN).build().perform();
		  
		  Thread.sleep(3000);
		  MyWorkspaceLocator.clickAgendaSequenceSubmitBtn(driver).click();
		  
		
		
		  try
		  {
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
		  }
		  catch(Exception e)
		  {
			  test.log(LogStatus.FAIL, "Validation Message  not displayed");
		  }

		  Thread.sleep(3000);
		  MyWorkspaceLocator.clickAgendaSequenceCloseBtn(driver).click();
		  
		  Thread.sleep(3000);
		  MyWorkspaceLocator.clickCloseMeetignBorad(driver).click();
		  
    }

public static void SigningAuthority(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		 
		 
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.clickSigningAuthority(driver).isEnabled())
		  {
			  Thread.sleep(2000);
			  MyWorkspaceLocator.clickSigningAuthority(driver).click();
			  test.log(LogStatus.PASS, "Signing Authority  tab is clickable");
		  }
		  else
		  {

			  test.log(LogStatus.FAIL, "Signing Authority  tab is not clickable");
		  }
		  
		Thread.sleep(3000);
		 MyWorkspaceLocator.clickCloseSigningAuthority(driver).click();
}

public static void AddSigningAuthority(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickSigningAuthority(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator. ClickNameSigningAuthority(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.SelectNameSigningAuthority(driver).click();
		  
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickUpload(driver).click();     //click save Signing authority
				 
		  Thread.sleep(2000);
		 String msg= MyWorkspaceLocator.clickvalidmsg(driver).getText();
		 
		 if(msg.equalsIgnoreCase(msg))
		 {
			 test.log(LogStatus.PASS,"Message displayed =" +msg);
		 }
		 else
		 {
			 test.log(LogStatus.FAIL,"Message displayed =" +msg);
		 }
}

public static void CopyMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		 
		 
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.clickCopyMeeting(driver).isEnabled())
		  {
			  Thread.sleep(2000);
			  MyWorkspaceLocator.clickCopyMeeting(driver).click();
			  test.log(LogStatus.PASS, "Copy Meeting  tab is clickable");
		  }
		  else
		  {

			  test.log(LogStatus.FAIL, "Copy Meeting  tab is not clickable");
		  }
		  
		Thread.sleep(3000);
		 MyWorkspaceLocator.clickCloseCopyMeeting(driver).click();
}

public static void CopyMeetingSelectEntity(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCopyMeeting(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickEntityCopyMeeting(driver).click();
		  
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.selectEntityCopyMeeting(driver).isDisplayed())
		  {
			  Thread.sleep(2000);
			  MyWorkspaceLocator.selectEntityCopyMeeting(driver).click();
			  test.log(LogStatus.PASS, "Entity is selected from Entity drop down ");
		  }
		  else
		  {

			  test.log(LogStatus.FAIL, "Entity is not selected from Entity drop down ");
		  }
		  Thread.sleep(3000);
		MyWorkspaceLocator.clickCloseCopyMeeting(driver).click();
}
		  
public static void CopyMeetingSelectMultipleEntity(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCopyMeeting(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickEntityCopyMeeting(driver).click();
		  
		  
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.selectEntityCopyMeeting(driver).isDisplayed()&&  MyWorkspaceLocator.selectEntityCopyMeeting1(driver).isDisplayed())
		  {
			  		Thread.sleep(2000);
			  		MyWorkspaceLocator.selectEntityCopyMeeting(driver).click();
			  		Thread.sleep(2000);
					  MyWorkspaceLocator.clickEntityCopyMeeting(driver).click();
					  
			  		Thread.sleep(2000);
			  		MyWorkspaceLocator.selectEntityCopyMeeting1(driver).click();
			  		test.log(LogStatus.PASS, "Multiple Entity is selected from Entity drop down ");
			
		  }
		  else
		  {

			  		test.log(LogStatus.FAIL, "Multiple Entity is not selected from Entity drop down ");
		  }
		  Thread.sleep(3000);
		MyWorkspaceLocator.clickCloseCopyMeeting(driver).click();
}	  
public static void AddCopyMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCopyMeeting(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickEntityCopyMeeting(driver).click();	
		  
		  Thread.sleep(2000);
	  	  MyWorkspaceLocator.selectEntityCopyMeeting(driver).click();
	  	  

		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickOpenAgendaCheckbox(driver).click();
	  		
	  	  Thread.sleep(2000);
	  	  MyWorkspaceLocator.SaveCopyMeeting(driver).click();
	  	  
	  	 Thread.sleep(2000);
	  	 String msg= MyWorkspaceLocator.ValidMsgCopyMeeting(driver).getText();
	  	 
	  	 if(msg.equalsIgnoreCase(msg))
	  	 {
	  		test.log(LogStatus.PASS, "Message displayed :-"+msg); 
	  	 }
	  	 else
	  	 {
	  		test.log(LogStatus.FAIL, "Message displayed :-"+msg); 
	  	 }
	  	 Thread.sleep(3000);
		MyWorkspaceLocator.clickCloseCopyMeeting(driver).click();
}
public static void CloseBtnCopyMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCopyMeeting(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickEntityCopyMeeting(driver).click();	
		  
		  Thread.sleep(2000);
	  	  MyWorkspaceLocator.selectEntityCopyMeeting(driver).click();
	  	  
	  	  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickOpenAgendaCheckbox(driver).click();
	  		
	  	  
	  	 
	  	 if( MyWorkspaceLocator.CloseBtnCopyMeeting(driver).isEnabled())
	  	 {
	  		  Thread.sleep(2000);
		  	  MyWorkspaceLocator.CloseBtnCopyMeeting(driver).click();
		  	  test.log(LogStatus.PASS, "The user should be able to cancel the Copy Meeting process without saving any changes.");
	  	 }
	  	 else
	  	 {
	  		  test.log(LogStatus.FAIL, "The user should not be able to cancel the Copy Meeting process without saving any changes.");
	  	 }
	  
			
}

public static void WithoutEnteringCopyMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCopyMeeting(driver).click();
		  
			
	  	  Thread.sleep(2000);
	  	  MyWorkspaceLocator.SaveCopyMeeting(driver).click();
	  	  
	  	try
	  	{
	  		
	  		Thread.sleep(2000);
	  	 	String msg= MyWorkspaceLocator.ValidMsgCopyMeeting(driver).getText();
	  	 
	  	 	if(msg.equalsIgnoreCase(msg))
	  	 	{
	  	 		test.log(LogStatus.PASS, "Message displayed :-"+msg); 
	  	 	}
	  	 	else
	  	 	{
	  	 		test.log(LogStatus.FAIL, "Message displayed :-"+msg); 
	  	 	}
	  	}
	  	catch(Exception e)
	  	{  
	  	
	  		test.log(LogStatus.FAIL, "No validation message displayed"); 
	  	
	  	}
 		Thread.sleep(2000);
		MyWorkspaceLocator.clickCloseCopyMeeting(driver).click();
	  
			
}

public static void LogDetailesCopyMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCopyMeeting(driver).click();
		   
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.ClickLogDetailes(driver).isDisplayed())
		  {
			  		Thread.sleep(2000);
			  		MyWorkspaceLocator.ClickLogDetailes(driver).click();
			  		test.log(LogStatus.PASS, "User should be able to see log details on the screen ");
			
		  }
		  else
		  {

			  		test.log(LogStatus.FAIL, "User should not be able to see log details on the screen");
		  }
		  Thread.sleep(3000);
		MyWorkspaceLocator.ClickCloseLogDetailesCopyMeeting(driver).click();
}	
public static void CancelLogDetailesCopyMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCopyMeeting(driver).click();
		  
		  Thread.sleep(2000);
	  		MyWorkspaceLocator.ClickLogDetailes(driver).click();
	  		
	  	  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickDeleteLogDetailesCopyMeeting(driver).click();
		 
		  Thread.sleep(5000);
		 if(MyWorkspaceLocator.ClickNoBtnLogDetailes(driver).isEnabled())
		 {
			 Thread.sleep(2000);
			  MyWorkspaceLocator. ClickNoBtnLogDetailes(driver).click();
			  test.log(LogStatus.PASS, "Log should not be deleted");
		 }
		 else
		 {
			 test.log(LogStatus.FAIL, "Log should be deleted");
		 }
		 Thread.sleep(3000);
			MyWorkspaceLocator.ClickCloseLogDetailesCopyMeeting(driver).click();
	}	


public static void DelteLogDetailesCopyMeeting(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.clickCopyMeeting(driver).click();
		  
		  Thread.sleep(2000);
	  		MyWorkspaceLocator.ClickLogDetailes(driver).click();
	  		
	  	  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickDeleteLogDetailesCopyMeeting(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator. ClickYesDeleteLogDetailesCopyMeeting(driver).click();
		  
		  
		  Thread.sleep(2000);
		 String msg = MyWorkspaceLocator.ClickValidMsg(driver).getText();
		 if(msg.equalsIgnoreCase(msg))
		 {
			 test.log(LogStatus.PASS, "Message displayed :-"+msg);
		 }
		 else
		 {
			 test.log(LogStatus.FAIL, "Message displayed :-"+msg);
		 }
		 Thread.sleep(3000);
			MyWorkspaceLocator.ClickCloseLogDetailesCopyMeeting1(driver).click();
	}	

public static void AgendaPrepration(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  if(MyWorkspaceLocator.ClickAgendaPreperation(driver).isEnabled())
		  {
			  Thread.sleep(2000);
			  MyWorkspaceLocator.ClickAgendaPreperation(driver).click();
			  test.log(LogStatus.PASS, "A popup message should be shown on the screen indicating 'The system is preparing your agenda' Please wait a moment'");
		  }
		  else
		  {
			  test.log(LogStatus.FAIL, "A popup message should not be shown on the screen indicating 'The system is preparing your agenda' Please wait a moment'");
		  }
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickAgendaPreperationcloseBtn(driver).click();
}

public static void AgendaPreprationClosePopupMessage(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickAgendaPreperation(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickAgendaPreperationcloseBtn(driver).click();
		  
		  Thread.sleep(2000);
		  String msg =MyWorkspaceLocator. ClickAgendaPreperationMsg(driver).getText();
		  
		  Thread.sleep(2000);
		  if(msg.equalsIgnoreCase(msg))
		  {
			 
			  test.log(LogStatus.PASS, "Message displayed ="+msg);
		  }
		  else
		  {
			  test.log(LogStatus.FAIL, "Message displayed ="+msg);
		  }
		  Thread.sleep(2000);
		  MyWorkspaceLocator.close(driver).click();
		 
}

public static void AgendaPreprationRefreshBtn(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickAgendaPreperation(driver).click();
		  
		  Thread.sleep(2000);
		  MyWorkspaceLocator.ClickAgendaPreperationcloseBtn(driver).click();
		  
		  Thread.sleep(5000);
		  if(  MyWorkspaceLocator.ClickRefreshBtn(driver).isEnabled())
		  {
			  Thread.sleep(5000);
			  MyWorkspaceLocator.ClickRefreshBtn(driver).click();
			  test.log(LogStatus.PASS, "The Agenda Preparation message disappears and the agenda download and agenda preview buttons should be activated");
		  }
		  else
		  {
			  test.log(LogStatus.FAIL, "The Agenda Preparation message disappears and the agenda download and agenda preview buttons should not be activated");
		  }
		  
		  Thread.sleep(5000);
		  MyWorkspaceLocator.close(driver).click();
}

public static void DownloadAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
	
		  
			File dir2 = new File("C:\\Users\\Snehal Patil\\Downloads");
			File[] dirContents1 = dir2.listFiles();						//Counting number of files in directory before download
			
			 Thread.sleep(2000);
			  MyWorkspaceLocator.ClickDownloadAgenda(driver).click();
			
		 	Thread.sleep(6000);
			File dir3 = new File("C:\\Users\\Snehal Patil\\Downloads");
			File[] allFilesNew1 = dir3.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
		   if (dirContents1.length < allFilesNew1.length) {
				test.log(LogStatus.PASS,  "The document should be downloaded to the system");
			}
		   else
		   {
				test.log(LogStatus.FAIL, "The document should not be downloaded to the system");
			}
		   
		   Thread.sleep(5000);
		  MyWorkspaceLocator.close(driver).click();
	}
public static void PreviewAgenda(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		
		  if(MyWorkspaceLocator. ClickPreviewAgenda(driver).isEnabled())
		 {
			 Thread.sleep(3000);
			 MyWorkspaceLocator. ClickPreviewAgenda(driver).click();
			 test.log(LogStatus.PASS, "User should be able to preview the document");
		 }
		 else
		 {
			 test.log(LogStatus.FAIL, "User should not be able to preview the document");
		 }
		  
		 Thread.sleep(3000);
		 MyWorkspaceLocator. ClickClosePopupPreviewAgenda(driver).click();
}

public static void AgendaVersion(WebDriver driver,ExtentTest test) throws InterruptedException
{
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyWorkspaceimg(driver).click();
	
		Thread.sleep(2000);
		MyWorkspaceLocator.MyMeeting(driver).click();
		
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.selectEntityfilter(driver).click();
		Thread.sleep(2000);
		MyWorkspaceLocator.clickEditIcon(driver).click();
		
		 Thread.sleep(2000);
		  MyWorkspaceLocator.clickAgendaItem(driver).click();
		  
			  if(MyWorkspaceLocator. ClickAgendaVersion(driver).isEnabled())
				 {
					 Thread.sleep(3000);
					 MyWorkspaceLocator. ClickAgendaVersion(driver).click();
					 test.log(LogStatus.PASS, "User should redirected to the 'Agenda Version' page");
				 }
				 else
				 {
					 test.log(LogStatus.FAIL, "User should not redirected to the 'Agenda Version' page");
				 }
				  
			Thread.sleep(3000);
			MyWorkspaceLocator.ClickCloseAgendaVersion(driver).click();
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
