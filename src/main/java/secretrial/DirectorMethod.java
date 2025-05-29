package secretrial;

import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.tools.javac.util.Assert;

public class DirectorMethod {

	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	public static void DirectorClick(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		if(DirectorLocator.Director(driver).isEnabled()) {
			DirectorLocator.Director(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "User should be redirected to the new window of 'Directot/KMP' page ");
		}else {
			test.log(LogStatus.FAIL, " User should be redirected to the new window of 'Directot/KMP' page");
			
		}
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DirectorAddNew(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			DirectorLocator.Salutation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.SalutationMS(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(0);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FirstName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(1);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.MiddleName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(2);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.LastName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.Gender(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Female(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DateofBirth(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Year(driver).click();
			Thread.sleep(2000);
			DirectorLocator.Year1(driver).click();
			Thread.sleep(2000);
			DirectorLocator.Year1(driver).click();
			Thread.sleep(2000);
			DirectorLocator.YearS(driver).click();
			Thread.sleep(1000);
			DirectorLocator.YearDOB(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Month(driver).click();
			Thread.sleep(1000);
			DirectorLocator.MonthDate(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DateofBirth(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DateofBirth1(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			DirectorLocator.DIN(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);
			
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherFirstName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherMiddleName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherLastName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(7);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.PANofDirector(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
		/*	row0 = sheet.getRow(8);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			 No = (int) c1.getNumericCellValue();
			DirectorLocator.Adhaar(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);*/
			
			DirectorLocator.Resident(driver).click();
			Thread.sleep(1000);
			DirectorLocator.ResidentYes(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(9);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			 No = (int) c1.getNumericCellValue();
			DirectorLocator.MobileNo(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);
			
			row0 = sheet.getRow(10);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(11);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.EmailId_Official(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.DSCExpiryDate(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DSCExpiryDate1(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(12);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.MotherName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(7000);
			
		//	 WebElement job = driver.findElement(By.id("divDetailsNew"));
			
			 Actions act =new Actions(driver);
	            act.sendKeys(Keys.PAGE_DOWN).build().perform();
	            Thread.sleep(7000);
	            
			row0 = sheet.getRow(13);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.Permenant_Address_Line1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.Country(driver).click();
			Thread.sleep(1000);
			DirectorLocator.CountryIndia(driver).click();
			Thread.sleep(8000);
			
			DirectorLocator.State(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Maharastra(driver).click();
			Thread.sleep(8000);
			
			DirectorLocator.City(driver).click();
			Thread.sleep(3000);
		//	DirectorLocator.Ahmadnagar(driver).click();
			By locator = By.xpath("(//ul[@id='ddlPermenant_CityId_listbox'])[4]//li[3]");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			Thread.sleep(8000);
			
			DirectorLocator.permanentRadio(driver).click();
			Thread.sleep(4000);
			
			DirectorLocator.EducationalQualification(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Graduation(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.Occupation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Professional(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.AreaofOccupation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Government(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.Save(driver).click();
			Thread.sleep(1000);
		//	DirectorLocator.Save(driver).click();
		//	Thread.sleep(3000);
			 act.sendKeys(Keys.PAGE_UP).build().perform(); 
			 Thread.sleep(4000);
			 try {
			String	msg1=DirectorLocator.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(msg1.equalsIgnoreCase("Save successfully.")|| msg1.equalsIgnoreCase("DIN already exists") ) {
			test.log(LogStatus.PASS,  msg1);
			}
			else {
				test.log(LogStatus.FAIL,  msg1);
			}
			Thread.sleep(4000);
			 act.sendKeys(Keys.PAGE_DOWN).build().perform();
	            Thread.sleep(7000);
			DirectorLocator.Close1(driver).click();
			Thread.sleep(4000);
			 }catch(Exception e) {
				 String	msg1=DirectorLocator.SaveMsg1(driver).getText();
					Thread.sleep(4000);
					if(msg1.equalsIgnoreCase("Save successfully.")|| msg1.equalsIgnoreCase("DIN already exists") ) {
						test.log(LogStatus.PASS,  msg1);
						}
						else {
							test.log(LogStatus.FAIL,  msg1);
						}
				//	test.log(LogStatus.PASS,   msg1);
					Thread.sleep(4000);
					 act.sendKeys(Keys.PAGE_DOWN).build().perform();
			            Thread.sleep(7000);
					DirectorLocator.Close(driver).click();
					Thread.sleep(4000);
			 }
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorAddNewAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DirectorAddNew(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			DirectorLocator.Salutation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.SalutationMS(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(0);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FirstName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(1);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.MiddleName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(2);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.LastName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.Gender(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Female(driver).click();
			Thread.sleep(3000);
			
		/*	DirectorLocator.DateofBirth(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DateofBirth1(driver).click();
			Thread.sleep(3000);*/
			DirectorLocator.DateofBirth(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Year(driver).click();
			Thread.sleep(2000);
			DirectorLocator.Year1(driver).click();
			Thread.sleep(2000);
			DirectorLocator.Year1(driver).click();
			Thread.sleep(2000);
			DirectorLocator.YearS(driver).click();
			Thread.sleep(1000);
			DirectorLocator.YearDOB(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Month(driver).click();
			Thread.sleep(1000);
			DirectorLocator.MonthDate(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DateofBirth(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DateofBirth1(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			DirectorLocator.DIN(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);
			
			row0 = sheet.getRow(4);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherFirstName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(5);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherMiddleName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(6);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FatherLastName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(7);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.PANofDirector(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
		/*	row0 = sheet.getRow(8);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			 No = (int) c1.getNumericCellValue();
			DirectorLocator.Adhaar(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);*/
			
			DirectorLocator.Resident(driver).click();
			Thread.sleep(1000);
			DirectorLocator.ResidentYes(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(9);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			 No = (int) c1.getNumericCellValue();
			DirectorLocator.MobileNo(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(3000);
			
			row0 = sheet.getRow(10);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(11);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.EmailId_Official(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.DSCExpiryDate(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DSCExpiryDate1(driver).click();
			Thread.sleep(3000);
			
			row0 = sheet.getRow(12);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.MotherName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(7000);
			
		//	 WebElement job = driver.findElement(By.id("divDetailsNew"));
			
			 Actions act =new Actions(driver);
	            act.sendKeys(Keys.PAGE_DOWN).build().perform();
	            Thread.sleep(7000);
	            
			row0 = sheet.getRow(13);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.Permenant_Address_Line1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			DirectorLocator.Country(driver).click();
			Thread.sleep(1000);
			DirectorLocator.CountryIndia(driver).click();
			Thread.sleep(8000);
			
			DirectorLocator.State(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Maharastra(driver).click();
			Thread.sleep(8000);
			
			DirectorLocator.City(driver).click();
			Thread.sleep(3000);
		//	DirectorLocator.Ahmadnagar(driver).click();
			By locator = By.xpath("//*[@id='ddlPermenant_CityId_listbox']/li[3]");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			Thread.sleep(8000);
			
			DirectorLocator.permanentRadio(driver).click();
			Thread.sleep(4000);
			
			DirectorLocator.EducationalQualification(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Graduation(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.Occupation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Professional(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.AreaofOccupation(driver).click();
			Thread.sleep(1000);
			DirectorLocator.Government(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.Save(driver).click();
			Thread.sleep(1000);
		//	DirectorLocator.Save(driver).click();
		//	Thread.sleep(3000);
			 act.sendKeys(Keys.PAGE_UP).build().perform(); 
			 Thread.sleep(4000);
			 try {
					String	msg1=DirectorLocator.SaveMsg(driver).getText();
					Thread.sleep(4000);
					if (msg1.equalsIgnoreCase("DIN already exists")) {
	    				test.log(LogStatus.PASS,   msg1);
	    			} else {
	    				test.log(LogStatus.FAIL, msg1);
	    			}
					//test.log(LogStatus.PASS,  msg1);
					Thread.sleep(4000);
					 act.sendKeys(Keys.PAGE_DOWN).build().perform();
			            Thread.sleep(7000);
					DirectorLocator.Close1(driver).click();
					Thread.sleep(4000);
					 }catch(Exception e) {
						 String	msg1=DirectorLocator.SaveMsg1(driver).getText();
							Thread.sleep(4000);
							if (msg1.equalsIgnoreCase("DIN already exists")) {
			    				test.log(LogStatus.PASS,   msg1);
			    			} else {
			    				test.log(LogStatus.FAIL, msg1);
			    			}
							//test.log(LogStatus.PASS,   msg1);
							Thread.sleep(4000);
							 act.sendKeys(Keys.PAGE_DOWN).build().perform();
					            Thread.sleep(7000);
							DirectorLocator.Close(driver).click();
							Thread.sleep(4000);
					 }
			
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorAddNewClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DirectorAddNew(driver).click();
			Thread.sleep(3000);
			 Actions act =new Actions(driver);
	            act.sendKeys(Keys.PAGE_DOWN).build().perform();
	            Thread.sleep(7000);
	            
	            if(DirectorLocator.Close(driver).isEnabled()) {
	    			DirectorLocator.Close(driver).click();
	    			Thread.sleep(1000);
	    			test.log(LogStatus.PASS, "the system should close the 'Add Director/KMP' form without adding the Director/KMP to the system ");
	    		}else {
	    			test.log(LogStatus.FAIL, " the system should not close the 'Add Director/KMP' ");
	    			
	    		}
			
			
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
			DirectorLocator.FirstName(driver).clear();
			Thread.sleep(3000);
			row0 = sheet.getRow(0);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			DirectorLocator.FirstName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Actions act =new Actions(driver);
            act.sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(7000);
			
		
			
			DirectorLocator.Save(driver).click();
			Thread.sleep(1000);
		//	DirectorLocator.Save(driver).click();
		//	Thread.sleep(3000);
			 act.sendKeys(Keys.PAGE_UP).build().perform(); 
			 Thread.sleep(4000);
			 try {
					String	msg1=DirectorLocator.SaveMsg(driver).getText();
					Thread.sleep(4000);
					test.log(LogStatus.PASS,  msg1);
					Thread.sleep(4000);
					 act.sendKeys(Keys.PAGE_DOWN).build().perform();
			            Thread.sleep(5000);
					DirectorLocator.Close1(driver).click();
					Thread.sleep(4000);
					 }catch(Exception e) {
						 String	msg1=DirectorLocator.SaveMsg1(driver).getText();
							Thread.sleep(4000);
							test.log(LogStatus.PASS,   msg1);
							Thread.sleep(4000);
							 act.sendKeys(Keys.PAGE_DOWN).build().perform();
					            Thread.sleep(5000);
							DirectorLocator.Close(driver).click();
							Thread.sleep(4000);
					 }
			
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorEditBlank(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
			DirectorLocator.FirstName(driver).clear();
			Thread.sleep(3000);
			DirectorLocator.FatherLastName(driver).clear();
			Thread.sleep(3000);
			
			Actions act =new Actions(driver);
            act.sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(7000);
			
		
			
			DirectorLocator.Save(driver).click();
			Thread.sleep(1000);
		//	DirectorLocator.Save(driver).click();
		//	Thread.sleep(3000);
			 act.sendKeys(Keys.PAGE_UP).build().perform(); 
			 Thread.sleep(4000);
			
					String	msg1=DirectorLocator.NameVal(driver).getText();
					Thread.sleep(4000);
					String	msg2=DirectorLocator.FatherLastNameVal(driver).getText();
					Thread.sleep(4000);
					test.log(LogStatus.PASS, "Message Displayed : -"+ msg1+" ,"+msg2);
					Thread.sleep(4000);
					 act.sendKeys(Keys.PAGE_DOWN).build().perform();
			            Thread.sleep(5000);
					DirectorLocator.Close1(driver).click();
					Thread.sleep(4000);
					
			
		Thread.sleep(1000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void DirectorEditClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
			
			
			Actions act =new Actions(driver);
            act.sendKeys(Keys.PAGE_DOWN).build().perform();
            Thread.sleep(7000);
			
		
			
		
            if(DirectorLocator.Close1(driver).isEnabled()) {
    			DirectorLocator.Close1(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "The system should close the 'Edit Director/KMP' form without adding the Director/KMP to the system ");
    		}else {
    			test.log(LogStatus.FAIL, " The system should not close the 'Edit Director/KMP' ");
    			
    		}
					
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLOR(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            if(DirectorLocator.ListofRelatives(driver).isEnabled()) {
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'List of relative' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'List of relative' page");
    			
    		}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.HUF(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			try {
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    			
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			}
    			catch(Exception e)
    			{
    				
    			}
    			
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);*/
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Record saved successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.HUF(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			try {
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			}
    			catch(Exception e) {
    				
    			}
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Record saved successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void DirectorLORAddNewSpo(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Spouse(driver).click();
    			Thread.sleep(5000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			try {
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")|| msg.equalsIgnoreCase("Record saved successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			}catch(Exception e) {
    				 			 			
    			}
    			
    			try {
    				String msg1 = DirectorLocator.SaveLORMSg1(driver).getText();
        			Thread.sleep(3000); 
    				if (msg1.equalsIgnoreCase("Saved Successfully.")|| msg1.equalsIgnoreCase("Record saved successfully.")) {
        				test.log(LogStatus.PASS,   msg1);
        			} else {
        				test.log(LogStatus.FAIL, msg1);
        			}
    				    
    			}
    			catch(Exception e) {
    				
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSpoAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Spouse(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			try {
        			String msg = DirectorLocator.SavesuccessSg(driver).getText();
        			Thread.sleep(3000);
        			if (msg.equalsIgnoreCase("Record already Exists.")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
        			}catch(Exception e) {
        				 			 			
        			}
	                  try {
	                	  String msg = DirectorLocator.SaveLORMSg1(driver).getText();
	            			Thread.sleep(3000);
	                	  if (msg.equalsIgnoreCase("Record already Exists.")) {
	          				test.log(LogStatus.PASS,   msg);
	          			} else {
	          				test.log(LogStatus.FAIL, msg);
	          			}
	                    }
        			
        			catch(Exception e) {
        			            			
        			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSpoEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Spouse(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if(msg.equalsIgnoreCase("please enter the details")) {
    				test.log(LogStatus.PASS,   msg);
    			}
    			else {
    				test.log(LogStatus.FAIL,   msg);

    			}
    			
    		/*	try {
    				
        			String msg = DirectorLocator.SaveLORMSg(driver).getText();
        			Thread.sleep(3000);
        			if(msg.equalsIgnoreCase("please enter name details")) {
        				test.log(LogStatus.PASS,   msg);
        			}
        			else {
        				test.log(LogStatus.FAIL,   msg);

        			}
        			}catch(Exception e) {
        			            			
        			}
    			try {
    				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
        			Thread.sleep(3000);
        			
    				if(msg.equalsIgnoreCase("please enter name details")) {
        				test.log(LogStatus.PASS,   msg);
        			}
        			else {
        				test.log(LogStatus.FAIL,   msg);

        			}
    			}
    			catch(Exception e) {
    				
    			}
    			*/
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseSpo(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Spouse(driver).click();
    			Thread.sleep(3000);
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewFather(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Father(driver).click();
    			Thread.sleep(5000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			try {
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Record saved successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			}catch(Exception e) {
    				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
        			Thread.sleep(3000);
        			if (msg.equalsIgnoreCase("Record saved successfully.")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
        				//test.log(LogStatus.FAIL,   msg);
        			
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewFatherAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Father(driver).click();
    			Thread.sleep(5000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			try {
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Record already exists.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    				//test.log(LogStatus.FAIL,   msg);
    			
    			}catch(Exception e) {
    				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
        			Thread.sleep(3000);
        			if (msg.equalsIgnoreCase("Record already exists.")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
        			//	test.log(LogStatus.PASS,   msg);
        			
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewFathEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Father(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			try {
        			String msg = DirectorLocator.SaveLORMSg(driver).getText();
        			Thread.sleep(3000);
        			if (msg.equalsIgnoreCase("please enter the details")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
        			//	test.log(LogStatus.FAIL,   msg);
        			
        			}catch(Exception e) {
        				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
            			Thread.sleep(3000);
            			if (msg.equalsIgnoreCase("please enter the details")) {
            				test.log(LogStatus.PASS,   msg);
            			} else {
            				test.log(LogStatus.FAIL, msg);
            			}
            			//	test.log(LogStatus.FAIL,   msg);
            			
        			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseFath(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Father(driver).click();
    			Thread.sleep(3000);
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewMother(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Mother(driver).click();
    			Thread.sleep(5000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    			/*DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			try {
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Record saved successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			}catch(Exception e) {
    				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
        			Thread.sleep(3000);
        			
        				test.log(LogStatus.FAIL,   msg);
        			
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewMotherAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Mother(driver).click();
    			Thread.sleep(5000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			try {
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    				//test.log(LogStatus.FAIL,   msg);
    			
    			}catch(Exception e) {
    				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
        			Thread.sleep(3000);
        			if (msg.equalsIgnoreCase("Saved Successfully.")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
        			//	test.log(LogStatus.PASS,   msg);
        			
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewMothEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Mother(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			try {
        			String msg = DirectorLocator.SaveLORMSg(driver).getText();
        			Thread.sleep(3000);
        			if (msg.equalsIgnoreCase("please enter the details")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
        				//test.log(LogStatus.FAIL,   msg);
        			
        			}catch(Exception e) {
        				String msg = DirectorLocator.SaveLORMSg1(driver).getText();
            			Thread.sleep(3000);
            			if (msg.equalsIgnoreCase("please enter the details")) {
            				test.log(LogStatus.PASS,   msg);
            			} else {
            				test.log(LogStatus.FAIL, msg);
            			}
            			//	test.log(LogStatus.FAIL,   msg);
            			
        			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseMoth(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Mother(driver).click();
    			Thread.sleep(3000);
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSon(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Son(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Record saved successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSonAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Son(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Already exists.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewEmptySon(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Son(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("please enter the details")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseSon(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Son(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewDaughter(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Daughter(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Record saved successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewDaughterAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Daughter(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(16);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.SpouseName(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			String error = "saved successfully" + "Record Saved successfuly";
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    		/*	if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}*/
    			if (msg.contains(error)) {
    			    test.log(LogStatus.PASS, msg);
    			} else {
    			    test.log(LogStatus.FAIL, msg);
    				
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewEmptyDaughter(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Daughter(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseDaughter(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Daughter(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewBrother(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			wait.until(ExpectedConditions.elementToBeClickable(DirectorLocator.Relation(driver))); 

    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Brother(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    		//	DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Record Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewBrotherAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Brother(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    		//	DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Already exists.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewEmptyBrother(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Brother(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseBrother(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Brother(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSister(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Sister(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    		//	DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			
    		/*	DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Record saved successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewSisterAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(DirectorLocator.Edit(driver))); 

			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Sister(driver).click();
    			Thread.sleep(3000);
    			
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Adult(driver).click();
    			Thread.sleep(4000);
    		//	DirectorLocator.MinorAdult(driver).click();
    			Thread.sleep(1000);
    			
    			DirectorLocator.MaritalStatus(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Married(driver).click();
    			Thread.sleep(3000);
    			/*
    			DirectorLocator.ChangeType(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeType1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.ChangeDate(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.ChangeDate1(driver).click();
    			Thread.sleep(3000);
    			*/
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Already exists.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewEmptySister(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Sister(driver).click();
    			Thread.sleep(3000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SaveLORMSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.FAIL,   msg);
    			} else {
    				test.log(LogStatus.PASS, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORAddNewCloseSister(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(DirectorLocator.Edit(driver))); 

			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.AddNew(driver).click();
    			Thread.sleep(3000);

    			DirectorLocator.Relation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.Sister(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " Page should be closed without saving data and the user should be redirected to the previous page.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLOREdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (50));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    		//	DirectorLocator.LOREdit(driver).click();
    			Thread.sleep(3000);
    			By locator = By.xpath("(//img[contains(@src, '/NewUi_Images/edit.svg')])[2]");
    			
    			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    			Thread.sleep(4000);
    			
    			WebElement editButton = driver.findElement(locator);	
    			Thread.sleep(4000);
    		JavascriptExecutor jse=(JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();", editButton);
    			Thread.sleep(4000);
    			
    			DirectorLocator.Name(driver).clear();
    			Thread.sleep(2000);
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.SaveLOR(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Updated Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseLOR(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLOREditClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    		//	DirectorLocator.LOREdit(driver).click();
    			Thread.sleep(3000);
    			By locator = By.xpath("(//img[contains(@src, '/NewUi_Images/edit.svg')])[2]");
    			
    			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    			Thread.sleep(4000);
    			
    			WebElement ViewButton = driver.findElement(locator);	
    			Thread.sleep(4000);
    		JavascriptExecutor jse=(JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();", ViewButton);
    			Thread.sleep(4000);
    			
    			DirectorLocator.Name(driver).clear();
    			Thread.sleep(2000);
    			row0 = sheet.getRow(15);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			if(DirectorLocator.CloseLOR(driver).isEnabled()) {
    				DirectorLocator.CloseLOR(driver).click();
    				test.log(LogStatus.PASS, " The user should be able to cancel the editing process without saving any changes. The data should remain unchanged.");
    			}else {
    				test.log(LogStatus.FAIL, " Page not closed .");
    				
    			}
    			Thread.sleep(4000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORDelete(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    		//	DirectorLocator.LOREdit(driver).click();
    			Thread.sleep(3000);
    			By locator = By.xpath("(//img[contains(@src, 'NewUi_Images/delete.svg')])[2]");
    			
    			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    			Thread.sleep(4000);
    			
    			WebElement ViewButton = driver.findElement(locator);	
    			Thread.sleep(4000);
    		JavascriptExecutor jse=(JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();", ViewButton);
    			Thread.sleep(4000);
    			
    		String msg=	driver.switchTo().alert().getText();
    			
    			Thread.sleep(2000);
    			test.log(LogStatus.PASS,   msg);
    			driver.switchTo().alert().accept();
    			Thread.sleep(2000);
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORDeleteCan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    		//	DirectorLocator.LOREdit(driver).click();
    			Thread.sleep(3000);
    			By locator = By.xpath("(//*[@class='k-grid-Delete k-grid-delete hoverCircle k-grid-button'])[2]");
    			
    			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    			Thread.sleep(4000);
    			
    			WebElement ViewButton = driver.findElement(locator);	
    			Thread.sleep(4000);
    		JavascriptExecutor jse=(JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();", ViewButton);
    			Thread.sleep(4000);
    			
    		
    			driver.switchTo().alert().dismiss();
    			test.log(LogStatus.PASS, "The item should not be deleted. The confirmation prompt should be dismissed Clicking on Cancel Button.");
    			Thread.sleep(2000);
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorLORipp(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.ListofRelatives(driver).click();
    			Thread.sleep(3000);
    			
    		
    		
    			if(DirectorLocator.itemsperpage(driver).isDisplayed()) {
    				
    				test.log(LogStatus.PASS, " The 'Items per page' option should be visible on the right corner of the page.");
    			}else {
    				test.log(LogStatus.FAIL, " The 'Items per page' option is not Visible.");
    				
    			}
    			Thread.sleep(4000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOI(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            if(DirectorLocator.DetailsOfInterest(driver).isEnabled()) {
    			DirectorLocator.DetailsOfInterest(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'Details Of Interest' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'Details Of Interest' page");
    			
    		}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCP(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            if(DirectorLocator.DetailsofCommitteePositions(driver).isEnabled()) {
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'Details of Committee Positions' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'Details of Committee Positions' page");
    			
    		}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(DirectorLocator.DetailsofCommitteePositions(driver))); 

    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPAddnew(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPEntityName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPEntityName1(driver).click();
    			Thread.sleep(3000);  			
    		
    			DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteName1(driver).click();
    			Thread.sleep(4000);
    	
    			DirectorLocator.DOCPPosition(driver).click();
    			Thread.sleep(2000);
    			DirectorLocator.DOCPPosition1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofAppointment(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofAppointment1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofCessation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofCessation1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveDOCP(driver).click();
    			Thread.sleep(3000);
    			try {
    			String msg = DirectorLocator.SavesuccessSg(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Saved Successfully.")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			}
    			catch(Exception e) {
    				String msg = DirectorLocator.SaveMSG(driver).getText();
        			Thread.sleep(3000);
        			if (msg.equalsIgnoreCase("Saved Successfully.")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
    			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPAddNewVal(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPAddnew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.DOCPEntityName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPEntityName1(driver).click();
    			Thread.sleep(3000);
    			
    		
    		/*	DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteName1(driver).click();
    			Thread.sleep(4000);
    	*/
    		
    			
    			DirectorLocator.SaveDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			try {
        			String msg = DirectorLocator.SavesuccessSg(driver).getText();
        			Thread.sleep(3000);
        			if (msg.equalsIgnoreCase("Enter all the Mandatory Fields")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
        			}
        			catch(Exception e) {
        				String msg = DirectorLocator.SaveMSG(driver).getText();
            			Thread.sleep(3000);
            			if (msg.equalsIgnoreCase("Enter all the Mandatory Fields")) {
            				test.log(LogStatus.PASS,   msg);
            			} else {
            				test.log(LogStatus.FAIL, msg);
            			}
        			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPAddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPAddnew(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveDOCP(driver).click();
    			Thread.sleep(3000);
    			try {
        			String msg = DirectorLocator.SavesuccessSg(driver).getText();
        			Thread.sleep(3000);
        			if (msg.equalsIgnoreCase("Enter all the Mandatory Fields")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
        			}
        			catch(Exception e) {
        				String msg = DirectorLocator.SaveMSG(driver).getText();
            			Thread.sleep(3000);
            			if (msg.equalsIgnoreCase("Enter all the Mandatory Fields")) {
            				test.log(LogStatus.PASS,   msg);
            			} else {
            				test.log(LogStatus.FAIL, msg);
            			}
        			}
    			/*String msg = DirectorLocator.EntityNameVal(driver).getText();
    			Thread.sleep(3000);
    			String msg1 = DirectorLocator.CommitteNameVal(driver).getText();
    			Thread.sleep(3000);
    			
    				test.log(LogStatus.PASS, "Message Displayed : -" + msg+", "+msg1);
    				*/
    			
    			Thread.sleep(4000);
    			
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPAddNewAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPAddnew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.DOCPEntityName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPEntityName1(driver).click();
    			Thread.sleep(3000);
    			
    		
    			DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteName1(driver).click();
    			Thread.sleep(4000);
    	
    			DirectorLocator.DOCPPosition(driver).click();
    			Thread.sleep(2000);
    			DirectorLocator.DOCPPosition1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofAppointment(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofAppointment1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofCessation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofCessation1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.SaveDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			try {
        			String msg = DirectorLocator.SavesuccessSg(driver).getText();
        			Thread.sleep(3000);
        			if (msg.equalsIgnoreCase("Director already Present in Committee.")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
        			}
        			catch(Exception e) {
        				String msg = DirectorLocator.SaveMSG(driver).getText();
            			Thread.sleep(3000);
            			if (msg.equalsIgnoreCase("Director already Present in Committee.")) {
            				test.log(LogStatus.PASS,   msg);
            			} else {
            				test.log(LogStatus.FAIL, msg);
            			}
        			}
    			Thread.sleep(4000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPAddNewClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPAddnew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.DOCPEntityName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPEntityName1(driver).click();
    			Thread.sleep(3000);
    			
    		
    			DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteName1(driver).click();
    			Thread.sleep(4000);
    	
    			DirectorLocator.DOCPPosition(driver).click();
    			Thread.sleep(2000);
    			DirectorLocator.DOCPPosition1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofAppointment(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofAppointment1(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DateofCessation(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DateofCessation1(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			if (DirectorLocator.CloseDOCP(driver).isEnabled()) {
    				DirectorLocator.CloseDOCP(driver).click();
        			Thread.sleep(3000);
        			
    				test.log(LogStatus.PASS,   "The system should close the 'Details of committee position' form without adding the comittee position to the system");
    			} else {
    				test.log(LogStatus.FAIL, "Page not Close");
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    		//	DirectorLocator.EditDOCP(driver).click();
    		//	Thread.sleep(3000);
    			
           
    			
    			DirectorLocator.DOCPAddnew(driver).click();
    			Thread.sleep(3000);
    			
    			
    			
    			DirectorLocator.DOCPEntityName(driver).click();
    			Thread.sleep(1000);
    			String entityname = DirectorLocator.DOCPEntityName1(driver).getText();
    			Thread.sleep(2000);
    			DirectorLocator.DOCPEntityName1(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			String commitee = DirectorLocator.DOCPCommitteName1(driver).getText();
    			Thread.sleep(4000);
    			DirectorLocator.DOCPCommitteName1(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPPosition(driver).click();
    			Thread.sleep(2000);
    			String position = DirectorLocator.DOCPPosition1(driver).getText();
    			Thread.sleep(3000);
    			
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			
            By locator = By.xpath("(//div[@id='gridKendo1']//img[contains(@src, 'NewUi_Images/edit.svg')])[1]");
    			
    			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    			Thread.sleep(4000);
    			
    			WebElement ViewButton = driver.findElement(locator);	
    			Thread.sleep(4000);
    		JavascriptExecutor jse=(JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();", ViewButton);
    			Thread.sleep(4000);
    			
    		
    			DirectorLocator.Entityname(driver).clear();
    			Thread.sleep(1000);
    			DirectorLocator.Entityname(driver).sendKeys(entityname);
    			Thread.sleep(4000);
    			DirectorLocator.CommitteeName(driver).clear();
    			Thread.sleep(1000);
    			DirectorLocator.CommitteeName(driver).sendKeys(commitee);
    			Thread.sleep(4000);
    			DirectorLocator.position(driver).clear();
    			Thread.sleep(1000);
    			DirectorLocator.position(driver).sendKeys(position);
    			Thread.sleep(4000);
    	
    			DirectorLocator.Update(driver).click();
    			Thread.sleep(3000);
    			String value = DirectorLocator.Entitynamegrid(driver).getText();
    			Thread.sleep(3000);
    			System.out.println(value);
    			if(entityname == value) {
    				
    				test.log(LogStatus.PASS, "Updated successfully");
    			}
    			else {
    				test.log(LogStatus.FAIL, "Not Updated.");

    			}
    			   DirectorLocator.CloseLR(driver).click();
    				Thread.sleep(5000);	
    			/*
    			String msg = DirectorLocator.UpdateMsgDOCP(driver).getText();
    			Thread.sleep(3000);
    			if (msg.equalsIgnoreCase("Update Successfully")) {
    				test.log(LogStatus.PASS, "Message Displayed :-" + msg);
    			} else {
    				test.log(LogStatus.FAIL,"Message not Displayed :-"+ msg);
    			}
    			Thread.sleep(4000);
    			
    			*/
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPEditBlank(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.EditDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			DirectorLocator.DOCPCommitteName(driver).click();
    			Thread.sleep(1000);
    			DirectorLocator.DOCPCommitteNameBlank(driver).click();
    			Thread.sleep(4000);
    	
    			
    			
    			DirectorLocator.SaveDOCP(driver).click();
    			Thread.sleep(3000);
    			
    			String msg = DirectorLocator.CommitteNameVal(driver).getText();
    			Thread.sleep(3000);
    			
    				test.log(LogStatus.PASS, "Message Displayed :-" + msg);
    			
    			Thread.sleep(4000);
    			
    			DirectorLocator.CloseDOCP(driver).click();
    			Thread.sleep(3000);
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPEditClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
    			
By locator = By.xpath("(//div[@id='gridKendo1']//img[contains(@src, 'NewUi_Images/edit.svg')])[1]");
    			
    			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    			Thread.sleep(4000);
    			
    			WebElement ViewButton = driver.findElement(locator);	
    			Thread.sleep(4000);
    		JavascriptExecutor jse=(JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();", ViewButton);
    			Thread.sleep(4000);
    			
    			if (DirectorLocator.CloseD(driver).isEnabled()) {
    				DirectorLocator.CloseD(driver).click();
        			Thread.sleep(3000);
        			
    				test.log(LogStatus.PASS,   "The system should close the 'Details of committee position' form without adding the comittee position to the system");
    			} else {
    				test.log(LogStatus.FAIL, "Page not Close");
    			}
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDOCPDelete(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.DetailsofCommitteePositions(driver).click();
    			Thread.sleep(3000);
                By locator = By.xpath("(//div[@id='gridKendo1']//img[contains(@src, 'NewUi_Images/delete.svg')])[1]");
    			
    			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    			Thread.sleep(4000);
    			
    			WebElement ViewButton = driver.findElement(locator);	
    			Thread.sleep(4000);
    		JavascriptExecutor jse=(JavascriptExecutor)driver;
    		jse.executeScript("arguments[0].click();", ViewButton);
    			Thread.sleep(4000);
    		//	DirectorLocator.DeleteDOCP(driver).click();
    		//	Thread.sleep(3000);
    			
    		String msg=	driver.switchTo().alert().getText();
    			
    		Thread.sleep(1000);
    				test.log(LogStatus.PASS,msg );
    				driver.switchTo().alert().accept();
    			Thread.sleep(4000);
    			
    			
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorSD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            if(DirectorLocator.SecurityDetails(driver).isEnabled()) {
    			DirectorLocator.SecurityDetails(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'Security Details' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'Security Details' page");
    			
    		}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorSDEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
          
    			DirectorLocator.SecurityDetails(driver).click();
    			Thread.sleep(5000);
    			DirectorLocator.SecurityDetailsEdit(driver).click();
    			Thread.sleep(5000);
    			DirectorLocator.NumberofTransaction(driver).clear();
    			
    			row0 = sheet.getRow(18);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.NumberofTransaction(driver).sendKeys("" + No + "",Keys.ENTER);
    			Thread.sleep(5000);
    			DirectorLocator.NumberofSecurities(driver).clear();
    			row0 = sheet.getRow(19);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.NumberofSecurities(driver).sendKeys("" + No + "");
    			Thread.sleep(5000);
    			
    			DirectorLocator.DescriptionofSecurities(driver).clear();
    			row0 = sheet.getRow(20);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.DescriptionofSecurities(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			
    			DirectorLocator.NominalValueSecurities(driver).clear();
    			row0 = sheet.getRow(21);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.NominalValueSecurities(driver).sendKeys("" + No + "");
    			Thread.sleep(5000);
    			
    		//	row0 = sheet.getRow(22);
    		//	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    		//	 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Dateofacquisition(driver).sendKeys("02-03-2023");
    			Thread.sleep(5000);
    			
    		//	row0 = sheet.getRow(23);
    		//	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    		//	 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Dateofdisposal(driver).sendKeys("02-03-2023");
    			Thread.sleep(5000);
    			DirectorLocator.Pricepaidforacquisition(driver).clear();
    			row0 = sheet.getRow(24);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Pricepaidforacquisition(driver).sendKeys("" + No + "");
    			Thread.sleep(4000);
    			
    			DirectorLocator.Otherconsiderationpaidforacquisition(driver).clear();
    			
    			row0 = sheet.getRow(25);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Otherconsiderationpaidforacquisition(driver).sendKeys("" + No + "");
    			Thread.sleep(4000);
    			
    			DirectorLocator.Pricereceivedondisposal(driver).clear();
    			row0 = sheet.getRow(26);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Pricereceivedondisposal(driver).sendKeys("" + No + "");
    			Thread.sleep(4000);
    			
    			DirectorLocator.Modeofacquisition(driver).clear();
    			row0 = sheet.getRow(27);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.Modeofacquisition(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			
                DirectorLocator.Otherconsiderationreceivedondisposal(driver).clear();
    			row0 = sheet.getRow(28);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Otherconsiderationreceivedondisposal(driver).sendKeys("" + No + "");
    			Thread.sleep(4000);
    			
    			  DirectorLocator.Cumulativebalance(driver).clear();
    			row0 = sheet.getRow(29);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.Cumulativebalance(driver).sendKeys("" + No + "");
    			Thread.sleep(4000);
    			
    			  DirectorLocator.txtSecCurities(driver).clear();
    			
    			row0 = sheet.getRow(30);
    			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
    			DirectorLocator.txtSecCurities(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
    			Thread.sleep(2000);
    			
    			DirectorLocator.SaveSD(driver).click();
    			Thread.sleep(4000);	
    			
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			String msg= 	DirectorLocator.SaveMsgSD(driver).getText();
    			if (msg.equalsIgnoreCase("Security Details Update Successfully")) {
    				test.log(LogStatus.PASS,   msg);
    			} else {
    				test.log(LogStatus.FAIL, msg);
    			}
    			Thread.sleep(2000);
    			  DirectorLocator.CloseSD(driver).click();
    				Thread.sleep(5000);	
    						
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorSDclose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
          
    			DirectorLocator.SecurityDetails(driver).click();
    			Thread.sleep(5000);
    			DirectorLocator.SecurityDetailsEdit(driver).click();
    			Thread.sleep(5000);
    			DirectorLocator.NumberofTransaction(driver).clear();
    			
    			row0 = sheet.getRow(18);
    			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
    			 No = (int) c1.getNumericCellValue();
    			
    			DirectorLocator.NumberofTransaction(driver).sendKeys("" + No + "",Keys.ENTER);
    			Thread.sleep(5000);
    			Actions act =new Actions(driver);
                act.sendKeys(Keys.PAGE_DOWN).build().perform();
                Thread.sleep(3000);
    			
                if (DirectorLocator.CloseSD(driver).isEnabled()) {
    				DirectorLocator.CloseSD(driver).click();
        			Thread.sleep(3000);
        			
    				test.log(LogStatus.PASS,   "he system should close the 'Security Details' form without adding the Details to the system");
    			} else {
    				test.log(LogStatus.FAIL, "Page not Close");
    			}
    			Thread.sleep(2000);
    			 
    						
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorProfile(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            if(DirectorLocator.Profile(driver).isEnabled()) {
    			DirectorLocator.Profile(driver).click();
    			Thread.sleep(1000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'Profile' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'Profile' page");
    			
    		}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorProfileAdd(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			DirectorLocator.Edit(driver).click();
			Thread.sleep(5000);
		
            
    			DirectorLocator.Profile(driver).click();
    			Thread.sleep(3000);
    			
driver.switchTo().frame(DirectorLocator.ProfileFrame(driver));	
Thread.sleep(3000);
    			DirectorLocator.Profiletext(driver).sendKeys("a");
    			Thread.sleep(3000);
    			driver.switchTo().parentFrame();
    			 DirectorLocator.ProfileSave(driver).click();
    				Thread.sleep(5000);	
    				String msg= 	DirectorLocator.ProfileTextMsg(driver).getText();
        			if (msg.equalsIgnoreCase("Profile Details Saved successfully")) {
        				test.log(LogStatus.PASS,   msg);
        			} else {
        				test.log(LogStatus.FAIL, msg);
        			}
            DirectorLocator.CloseLR(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDIR8(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
		
            if(DirectorLocator.DirectorDIR8(driver).isEnabled()) {
    			DirectorLocator.DirectorDIR8(driver).click();
    			Thread.sleep(4000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of 'DIR-8' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of 'DIR-8' page");
    			
    		}
            DirectorLocator.DIR8Close(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	public static void setZoomLevel(WebDriver driver, double zoomLevel) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='" + zoomLevel + "'");
    }
	
	
	public static void DirectorDIR8Preview(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DirectorDIR8(driver).click();
			Thread.sleep(4000);
			
			
			DirectorLocator.DirectorDIR(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DirectorDIR1(driver).click();
				Thread.sleep(3000);
          
				DirectorLocator.EntityNameDIR(driver).click();
				Thread.sleep(1000);
				DirectorLocator.EntityNameDIR1(driver).click();
					Thread.sleep(3000);
					

					DirectorLocator.DateOfIssueDIR(driver).click();
					Thread.sleep(3000);
					DirectorLocator.DateOfIssueDIR1(driver).click();
						Thread.sleep(3000);
    			
						DirectorLocator.PreviewDIR(driver).click();
						Thread.sleep(4000);
						driver.switchTo().frame(DirectorLocator.frame(driver));
						String Text=DirectorLocator.PreviewText(driver).getText();						
				Thread.sleep(4000);
				if(Text.equalsIgnoreCase("Form DIR-8")) {
					Thread.sleep(4000);
					test.log(LogStatus.PASS, "user is able to Preview DIR-8 form with valid data");
	    		}else {
	    			test.log(LogStatus.FAIL, " user is not able to Preview DIR-8 form with valid data");
	    			
	    		}
				
				driver.switchTo().parentFrame();
				try {
			           // Set zoom level to 90% (0.9) for zooming out
			          setZoomLevel(driver, 0.8);
			           // Wait to observe the effect
			          Thread.sleep(2000);
			            // Set zoom level back to 100% (1.0) to reset to normal
					//  setZoomLevel(getDriver(), 1.0);
			        } catch (InterruptedException e) {
			          e.printStackTrace();
			        }
				Thread.sleep(2000);	
				  DirectorLocator.PreviewClose(driver).click();
					Thread.sleep(2000);	
							
            DirectorLocator.DIR8Close(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDIR8DownLoad(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DirectorDIR8(driver).click();
			Thread.sleep(4000);
			
			
			DirectorLocator.DirectorDIR(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DirectorDIR1(driver).click();
				Thread.sleep(3000);
          
				DirectorLocator.EntityNameDIR(driver).click();
				Thread.sleep(1000);
				DirectorLocator.EntityNameDIR1(driver).click();
					Thread.sleep(3000);
					

					DirectorLocator.DateOfIssueDIR(driver).click();
					Thread.sleep(3000);
					DirectorLocator.DateOfIssueDIR1(driver).click();
						Thread.sleep(3000);
    			
						File dir = new File("C:\\Users\\shitalb\\Downloads");
						File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
						
						Thread.sleep(500);
						DirectorLocator.PreviewDownload(driver).click();		//Exporting (Downloading) file
						
						Thread.sleep(3000);//C://Users//jiya//Downloads//
						File dir1 = new File("C:\\Users\\shitalb\\Downloads");
						File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
						
						Thread.sleep(3000);
						if (dirContents.length < allFilesNew.length) {
							test.log(LogStatus.PASS,  "  File downloaded successfully.");
						} else {
							test.log(LogStatus.FAIL, "  File does not downloaded.");
						}
							
            DirectorLocator.DIR8Close(driver).click();
			Thread.sleep(5000);	
					
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorMBP(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(2000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
		
            if(DirectorLocator.DirectorMBP(driver).isEnabled()) {
    			DirectorLocator.DirectorMBP(driver).click();
    			Thread.sleep(4000);
    			test.log(LogStatus.PASS, "User should be redirected to the new window of  'MBP-1' page");
    		}else {
    			test.log(LogStatus.FAIL, " User should not redirected to the new window of  'MBP-1' page");
    			
    		}
            try {
            DirectorLocator.MBP1Close(driver).click();
			Thread.sleep(5000);	
            }
            catch(Exception e) {
            	DirectorLocator.DIR8Close(driver).click();
    			Thread.sleep(5000);	
            }
            
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorMBPPreview(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DirectorMBP(driver).click();
			Thread.sleep(4000);
			
			
			DirectorLocator.DirectorMBP1(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DirectorMBP11(driver).click();
				Thread.sleep(3000);
          
				DirectorLocator.EntityNameMBP(driver).click();
				Thread.sleep(1000);
				DirectorLocator.EntityNameMBP1(driver).click();
					Thread.sleep(3000);
					

					DirectorLocator.DateOfIssueMBP(driver).click();
					Thread.sleep(3000);
					DirectorLocator.DateOfIssueMBP1(driver).click();
						Thread.sleep(3000);
    			
						DirectorLocator.PreviewMBP1(driver).click();
						Thread.sleep(4000);
						Actions act =new Actions(driver);
		                act.sendKeys(Keys.PAGE_UP).build().perform();
		                Thread.sleep(3000);
						driver.switchTo().frame(DirectorLocator.frame(driver));

						String Text=DirectorLocator.PreviewText(driver).getText();

				//String Text=DirectorLocator.PreviewTextMBP(driver).getText();
				Thread.sleep(4000);
				if(Text.equalsIgnoreCase("FORM MBP – 1")) {
					Thread.sleep(4000);
	    			test.log(LogStatus.PASS, "user is able to Preview MBP-1 form with valid data");
	    		}else {
	    			test.log(LogStatus.FAIL, " user is not able to Preview MBP-1 form with valid data");
	    			
	    		}
				driver.switchTo().parentFrame();
				Thread.sleep(4000);
				By locator = By.xpath("(//a[@aria-label='Close'])[15]");
				
				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			Thread.sleep(2000);
			jse.executeScript("arguments[0].click();", ViewButton);
				Thread.sleep(4000);
				//  DirectorLocator.PreviewClose(driver).click();
					Thread.sleep(2000);	
							
					try {
			            DirectorLocator.MBP1Close(driver).click();
						Thread.sleep(5000);	
			            }
			            catch(Exception e) {
			            	DirectorLocator.DIR8Close(driver).click();
			    			Thread.sleep(5000);	
			            }
					
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void DirectorMBPDwonload(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			
			DirectorLocator.DirectorMBP(driver).click();
			Thread.sleep(4000);
			
			
			DirectorLocator.DirectorMBP1(driver).click();
			Thread.sleep(1000);
			DirectorLocator.DirectorMBP11(driver).click();
				Thread.sleep(3000);
          
				DirectorLocator.EntityNameMBP(driver).click();
				Thread.sleep(1000);
				DirectorLocator.EntityNameMBP1(driver).click();
					Thread.sleep(3000);
					

					DirectorLocator.DateOfIssueMBP(driver).click();
					Thread.sleep(3000);
					DirectorLocator.DateOfIssueMBP1(driver).click();
						Thread.sleep(3000);
    			
						File dir = new File("C:\\Users\\shitalb\\Downloads");
						File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
						
						Thread.sleep(500);
						DirectorLocator.DownloadMBP(driver).click();		//Exporting (Downloading) file
						
						Thread.sleep(3000);//C://Users//jiya//Downloads//
						File dir1 = new File("C:\\Users\\shitalb\\Downloads");
						File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
						
						Thread.sleep(3000);
						if (dirContents.length < allFilesNew.length) {
							test.log(LogStatus.PASS,  "  File downloaded successfully.");
						} else {
							test.log(LogStatus.FAIL, "  File does not downloaded.");
						}
							
				
						Thread.sleep(5000);	
            DirectorLocator.MBP1Close(driver).click();
			Thread.sleep(5000);	
					
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorView(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(2000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			By locator = By.xpath("(//img[contains(@src, 'NewUi_Images/EyeIcon.svg')])[1]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			//DirectorLocator.View(driver).click();
			//Thread.sleep(4000);
			String Text=DirectorLocator.ViewText(driver).getText();
			Thread.sleep(4000);
			if(Text.equalsIgnoreCase("Director Details")) {
				Thread.sleep(4000);
    			test.log(LogStatus.PASS, "user is able to view 'Director Details' ");
    		}else {
    			test.log(LogStatus.FAIL, "user is not able to view 'Director Details'");
    			
    		}
			
			DirectorLocator.ViewClose(driver).click();
			Thread.sleep(4000);
			
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorViewAbout(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
		//	DirectorLocator.View(driver).click();
		//	Thread.sleep(4000);
			
         By locator = By.xpath("(//img[contains(@src, 'NewUi_Images/EyeIcon.svg')])[1]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			if(DirectorLocator.ViewAbout(driver).isEnabled()) {
				Thread.sleep(4000);
				DirectorLocator.ViewAbout(driver).click();
				Thread.sleep(4000);
    			test.log(LogStatus.PASS, "About' tab is clickable  ");
    		}else {
    			test.log(LogStatus.FAIL, "About' tab is not clickable ");
    			
    		}
			
			DirectorLocator.ViewClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorViewDOI(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			//DirectorLocator.View(driver).click();
			//Thread.sleep(4000);
           By locator = By.xpath("(//img[contains(@src, 'NewUi_Images/EyeIcon.svg')])[1]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			if(DirectorLocator.DetailsOfInterestView(driver).isEnabled()) {
				Thread.sleep(4000);
				DirectorLocator.DetailsOfInterestView(driver).click();
				Thread.sleep(4000);
    			test.log(LogStatus.PASS, "'Details of Interest'tab is clickable  ");
    		}else {
    			test.log(LogStatus.FAIL, "'Details of Interest'tab is not clickable ");
    			
    		}
			
			DirectorLocator.ViewClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorViewCP(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			//DirectorLocator.View(driver).click();
			//Thread.sleep(4000);
			
By locator = By.xpath("(//img[contains(@src, 'NewUi_Images/EyeIcon.svg')])[1]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			if(DirectorLocator.CommitteePositions(driver).isEnabled()) {
				DirectorLocator.CommitteePositions(driver).click();
				Thread.sleep(4000);
				
    			test.log(LogStatus.PASS, "'Committe Position'tab is clickable  ");
    		}else {
    			test.log(LogStatus.FAIL, "'Committe Position'tab is not clickable ");
    			
    		}
			
			DirectorLocator.ViewClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDelete(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
By locator = By.xpath("(//img[contains(@src, 'NewUi_Images/delete.svg')])[1]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			//DirectorLocator.Delete(driver).click();
			//Thread.sleep(4000);
	String msg =driver.switchTo().alert().getText();
	test.log(LogStatus.PASS, "Message Displayed : -" +msg);
	driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String alert =driver.switchTo().alert().getText();
		if(alert.equalsIgnoreCase("deleted successfully"))
		{
		test.log(LogStatus.PASS, "Message Displayed : -" +alert);
		}
		else {
			test.log(LogStatus.FAIL, "Message Displayed : -" +alert);

		}
		driver.switchTo().alert().accept();
			Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorDeleteCan(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
By locator = By.xpath("(//img[contains(@src, 'NewUi_Images/delete.svg')])[1]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
		//	DirectorLocator.Delete(driver).click();
		//	Thread.sleep(4000);
			driver.switchTo().alert().dismiss();
	test.log(LogStatus.PASS, "The item should not be deleted. The confirmation prompt should be dismissed by Clicking on Cancel button" );
	
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void DirectorSearch(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			row0 = sheet.getRow(3);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			
			DirectorLocator.Search(driver).sendKeys("" + No + "",Keys.ENTER);
			Thread.sleep(5000);
			
			
    			
    			String Text = DirectorLocator.DINText(driver).getText();
    			Thread.sleep(3000);
    			
    			if(Text.equalsIgnoreCase("12344321")) {
    				Thread.sleep(4000);
        			test.log(LogStatus.PASS, "The search feild working successfully. ");
        		}else {
        			test.log(LogStatus.FAIL, "The search feild not working");
        			
        		}
    			Thread.sleep(4000);
    			
    		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorUpload(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			if(DirectorLocator.Upload(driver).isEnabled()) {
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				
    			test.log(LogStatus.PASS, " User should be redirected to new window of DIR-3 KYC");
    		}else {
    			test.log(LogStatus.FAIL, "User should not redirected to new window of DIR-3 KYC");
    			
    		}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorUploadInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator = By.xpath("//input[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
			//	ViewButton.sendKeys("D:\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\TestData\\dir 8.xlsx");
				ViewButton.sendKeys("D:\\Automation Upload Secretrial//dir-8.docx");

				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			if(Msg.equalsIgnoreCase("Please check uploaded file is DIR-3-KYC")) {
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			}else {
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorUploadExcel(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
   /*   By locator = By.xpath("(//img[contains(@src, 'NewUi_Images/delete.svg')])[1]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);*/
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
			
				 By locator = By.xpath("//img[contains(@src, 'Images/Excel_icon.png')]");
					
					wait.until(ExpectedConditions.presenceOfElementLocated(locator));
					Thread.sleep(4000);
					
					WebElement ViewButton = driver.findElement(locator);	
					Thread.sleep(4000);
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				jse.executeScript("arguments[0].click();", ViewButton);
					Thread.sleep(4000);
					
			//	DirectorLocator.SampleFormate(driver).click();
			//	Thread.sleep(4000);
				By locator1 = By.xpath("//input[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
				//ViewButton1.sendKeys("D:\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\TestData\\Director Master Sample File.xlsx");
				ViewButton1.sendKeys("D:\\Automation Upload Secretrial\\Director Master Sample File.xlsx");

				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator4 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton4 = driver.findElement(locator4);	
				Thread.sleep(3000);
		String Msg=	ViewButton4.getText();
			Thread.sleep(3000);
			if(Msg.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			}else {
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			}
				}catch(Exception e) {
					
					By locator5 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton5 = driver.findElement(locator5);	
					Thread.sleep(3000);
			String Msg=	ViewButton5.getText();
				Thread.sleep(3000);
				if(Msg.equalsIgnoreCase("Record Save Successfully")) {
					test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				}else {
					test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
				}
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void DirectorUploadExcelInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
				
				By excel = By.xpath("(//img[contains(@src, 'Images/Excel_icon.png')])[1]");

				wait.until(ExpectedConditions.presenceOfElementLocated(excel));
				Thread.sleep(4000);
				
				WebElement excelButton = driver.findElement(excel);	
				Thread.sleep(4000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", excelButton);
				Thread.sleep(4000);
				//DirectorLocator.SampleFormate(driver).click();
				//Thread.sleep(4000);
				
				By locator = By.xpath("//input[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
				ViewButton.sendKeys("D:\\Automation Upload Secretrial\\Director Master Sample File-InvalidDIN.xlsx");
			
				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			if(Msg.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			}else {
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			}
				}catch(Exception e) {
					
					By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton1 = driver.findElement(locator1);	
					Thread.sleep(3000);
			String Msg=	ViewButton1.getText();
				Thread.sleep(3000);
				
					test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void DirectorUploadExcelInvalidMore(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
				
				By excel = By.xpath("(//img[contains(@src, 'Images/Excel_icon.png')])[1]");

				wait.until(ExpectedConditions.presenceOfElementLocated(excel));
				Thread.sleep(4000);
				
				WebElement excelButton = driver.findElement(excel);	
				Thread.sleep(4000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", excelButton);
				Thread.sleep(4000);
				
			//	DirectorLocator.SampleFormate(driver).click();
				//Thread.sleep(4000);
				By locator = By.xpath("//*[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
				ViewButton.sendKeys("D:\\Automation Upload Secretrial\\Director Master Sample File More than8digitDIN.xlsx");
			
				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			if(Msg.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			}else {
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			}
				}catch(Exception e) {
					
					By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton1 = driver.findElement(locator1);	
					Thread.sleep(3000);
			String Msg=	ViewButton1.getText();
				Thread.sleep(3000);
				
					test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorUploadExcelInvalidAlpha(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
				
				By excel = By.xpath("(//img[contains(@src, 'Images/Excel_icon.png')])[1]");

				wait.until(ExpectedConditions.presenceOfElementLocated(excel));
				Thread.sleep(4000);
				
				WebElement excelButton = driver.findElement(excel);	
				Thread.sleep(4000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", excelButton);
				Thread.sleep(4000);
				
			//	DirectorLocator.SampleFormate(driver).click();
			//	Thread.sleep(4000);
				By locator = By.xpath("//input[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
				ViewButton.sendKeys("D:\\Automation Upload Secretrial\\Director Master Sample FileDIN as aalphabet.xlsx");
			
				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			if(Msg.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			}else {
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			}
				}catch(Exception e) {
					
					By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton1 = driver.findElement(locator1);	
					Thread.sleep(3000);
			String Msg=	ViewButton1.getText();
				Thread.sleep(3000);
				
					test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorUploadExcelInvalidSpe(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
				
				By excel = By.xpath("(//img[contains(@src, 'Images/Excel_icon.png')])[1]");

				wait.until(ExpectedConditions.presenceOfElementLocated(excel));
				Thread.sleep(4000);
				
				WebElement excelButton = driver.findElement(excel);	
				Thread.sleep(4000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", excelButton);
				Thread.sleep(4000);
				
				//DirectorLocator.SampleFormate(driver).click();
				//Thread.sleep(4000);
				By locator = By.xpath("//input[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
				ViewButton.sendKeys("D:\\Automation Upload Secretrial\\Director Master Sample FileDIN as specialCharacters.xlsx");
			
				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			if(Msg.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			}else {
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			}
				}catch(Exception e) {
					
					By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton1 = driver.findElement(locator1);	
					Thread.sleep(3000);
			String Msg=	ViewButton1.getText();
				Thread.sleep(3000);
				
					test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorUploadExcelInvalidPan(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
				
				By excel = By.xpath("(//img[contains(@src, 'Images/Excel_icon.png')])[1]");

				wait.until(ExpectedConditions.presenceOfElementLocated(excel));
				Thread.sleep(4000);
				
				WebElement excelButton = driver.findElement(excel);	
				Thread.sleep(4000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", excelButton);
				Thread.sleep(4000);
				
				//DirectorLocator.SampleFormate(driver).click();
				//Thread.sleep(4000);
				By locator = By.xpath("//*[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
				ViewButton.sendKeys("D:\\Automation Upload Secretrial\\Director Master Sample FilePAN Less than10 Characters.xlsx");
			
				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			if(Msg.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			}else {
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			}
				}catch(Exception e) {
					
					By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton1 = driver.findElement(locator1);	
					Thread.sleep(3000);
			String Msg=	ViewButton1.getText();
				Thread.sleep(3000);
				
					test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void DirectorUploadExcelInvalidPanM(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
				By excel = By.xpath("(//img[contains(@src, 'Images/Excel_icon.png')])[1]");

				wait.until(ExpectedConditions.presenceOfElementLocated(excel));
				Thread.sleep(4000);
				
				WebElement excelButton = driver.findElement(excel);	
				Thread.sleep(4000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", excelButton);
				Thread.sleep(4000);
			//	DirectorLocator.SampleFormate(driver).click();
			//	Thread.sleep(4000);
				By locator = By.xpath("//input[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
				ViewButton.sendKeys("D:\\Automation Upload Secretrial\\Director Master Sample FilePAN More than 10 characters.xlsx");
			
				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			if(Msg.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			}else {
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			}
				}catch(Exception e) {
					
					By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton1 = driver.findElement(locator1);	
					Thread.sleep(3000);
			String Msg=	ViewButton1.getText();
				Thread.sleep(3000);
				if(Msg.equalsIgnoreCase("Record Save Successfully")) {
					test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				}else {
					test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
				}
					//test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorUploadExcelInvalidPanSpe(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
				
				By excel = By.xpath("(//img[contains(@src, 'Images/Excel_icon.png')])[1]");

				wait.until(ExpectedConditions.presenceOfElementLocated(excel));
				Thread.sleep(4000);
				
				WebElement excelButton = driver.findElement(excel);	
				Thread.sleep(4000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", excelButton);
				Thread.sleep(4000);
				//DirectorLocator.SampleFormate(driver).click();
				//Thread.sleep(4000);
				By locator = By.xpath("//input[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
				ViewButton.sendKeys("D:\\Automation Upload Secretrial\\Director Master Sample FilePAN With SpecialChar.xlsx");
			
				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			if(Msg.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			}else {
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			}
				}catch(Exception e) {
					
					By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton1 = driver.findElement(locator1);	
					Thread.sleep(3000);
			String Msg=	ViewButton1.getText();
				Thread.sleep(3000);
				if(Msg.equalsIgnoreCase("Record Save Successfully")) {
					test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				}else {
					test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
				}
					//test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorUploadExcelInvalidMbl(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
				By excel = By.xpath("(//img[contains(@src, 'Images/Excel_icon.png')])[1]");

				wait.until(ExpectedConditions.presenceOfElementLocated(excel));
				Thread.sleep(4000);
				
				WebElement excelButton = driver.findElement(excel);	
				Thread.sleep(4000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", excelButton);
				Thread.sleep(4000);
			//	DirectorLocator.SampleFormate(driver).click();
			//	Thread.sleep(4000);
				By locator = By.xpath("//input[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
				ViewButton.sendKeys("D:\\Automation Upload Secretrial\\Director Master Sample File InvalidMobileNo.xlsx");
			
				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			if(Msg.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			}else {
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			}
				}catch(Exception e) {
					
					By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton1 = driver.findElement(locator1);	
					Thread.sleep(3000);
			String Msg=	ViewButton1.getText();
				Thread.sleep(3000);
				if(Msg.equalsIgnoreCase("Record Save Successfully")) {
					test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				}else {
					test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
				}
					//test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorUploadExcelEmpty(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
				By excel = By.xpath("(//img[contains(@src, 'Images/Excel_icon.png')])[1]");

				wait.until(ExpectedConditions.presenceOfElementLocated(excel));
				Thread.sleep(4000);
				
				WebElement excelButton = driver.findElement(excel);	
				Thread.sleep(4000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", excelButton);
				Thread.sleep(4000);
				//DirectorLocator.SampleFormate(driver).click();
				//Thread.sleep(4000);
				By locator = By.xpath("//*[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
				ViewButton.sendKeys("D:\\Automation Upload Secretrial\\Director Master Sample File WithEmptyData.xlsx");
			
				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			if(Msg.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			}else {
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			}
				}catch(Exception e) {
					
					By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton1 = driver.findElement(locator1);	
					Thread.sleep(3000);
			String Msg=	ViewButton1.getText();
				Thread.sleep(3000);
				if(Msg.equalsIgnoreCase("Record Save Successfully")) {
					test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				}else {
					test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
				}
					//test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorUploadExcelinEx(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
			//	DirectorLocator.SampleFormate(driver).click();
			//	Thread.sleep(4000);
				By locator = By.xpath("//*[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
				ViewButton.sendKeys("D:\\Automation Upload Secretrial\\dir-8.docx");
			
				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			
				test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
			
				}catch(Exception e) {
					
					By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton1 = driver.findElement(locator1);	
					Thread.sleep(3000);
			String Msg=	ViewButton1.getText();
				Thread.sleep(3000);
				
					test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorUploadExcelAE(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(3000);
		
			DirectorLocator.Director(driver).click();
			Thread.sleep(4000);
			
			
				DirectorLocator.Upload(driver).click();
				Thread.sleep(4000);
				By locator3 = By.xpath("//*[@id='FileType_DM_Excel']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator3));
				Thread.sleep(4000);
				
				WebElement ViewButton3 = driver.findElement(locator3);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton3);
				Thread.sleep(4000);
				DirectorLocator.SampleFormate(driver).click();
				Thread.sleep(4000);
				By locator = By.xpath("//*[@id='File']");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(3000);
				ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Director Master Sample File.xlsx");
			
				Thread.sleep(3000);
				DirectorLocator.Uploadbtn(driver).click();
				Thread.sleep(5000);
				try {
				By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable");

				wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
				Thread.sleep(4000);
				
				WebElement ViewButton1 = driver.findElement(locator1);	
				Thread.sleep(3000);
		String Msg=	ViewButton1.getText();
			Thread.sleep(3000);
			
				test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
			
				}catch(Exception e) {
					
					By locator1 = By.xpath("//*[@id='frmUpdateUpload']/div[1]/ul");

					wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
					Thread.sleep(4000);
					
					WebElement ViewButton1 = driver.findElement(locator1);	
					Thread.sleep(3000);
			String Msg=	ViewButton1.getText();
				Thread.sleep(3000);
				
					test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
				
				}
			
			DirectorLocator.UploadClose(driver).click();
			Thread.sleep(4000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}

	public static void complianceassignment(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(3000);
		
		if(Locator.ComplianceAssignment(driver).isEnabled()) {
			
			test.log(LogStatus.PASS, " User should be redirected to the compliance assignment page");

		}
		else {
			test.log(LogStatus.FAIL, "User should not redirected to the compliance assignment page");

		}
		/*
		 Actions act =new Actions(driver);
         act.sendKeys(Keys.PAGE_DOWN).build().perform();
         Thread.sleep(7000);
         
         
			
			
			if(DirectorLocator.complianceassignment(driver).isEnabled()) {
				By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
				
				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				Thread.sleep(4000);
				
				WebElement ViewButton = driver.findElement(locator);	
				Thread.sleep(4000);
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", ViewButton);
				Thread.sleep(4000);
				
    			test.log(LogStatus.PASS, " User should be redirected to the compliance assignment page");
    		}else {
    			test.log(LogStatus.FAIL, "User should not redirected to the compliance assignment page");
    			
    		}*/
			
		
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentMR(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
			*/
			
			if(DirectorLocator.MeetingRadio(driver).isEnabled()) {
				DirectorLocator.MeetingRadio(driver).click();
				Thread.sleep(4000);
				
    			test.log(LogStatus.PASS, " After selecting meeting tab- assignment,assigned and re-assignment options are seen.");
    		}else {
    			test.log(LogStatus.FAIL, "After selecting meeting tab- assignment,assigned and re-assignment options are  not seen.");
    			
    		}
			
		
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentAssign(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
		*/
			
			 DirectorLocator.Entity(driver).click();
				Thread.sleep(2000);
				 DirectorLocator.Entity1(driver).click();
					Thread.sleep(3000);
					 DirectorLocator.Performer(driver).click();
						Thread.sleep(2000);
						 DirectorLocator.Performer1(driver).click();
							Thread.sleep(3000);
						 DirectorLocator.Reviewer(driver).click();
								Thread.sleep(2000);
						 DirectorLocator.Reviewer1(driver).click();
									Thread.sleep(3000);
									 DirectorLocator.StartDate(driver).click();
										Thread.sleep(2000);
								 DirectorLocator.StartDate1(driver).click();
											Thread.sleep(3000);
											 DirectorLocator.Filter(driver).sendKeys("8887",Keys.ENTER);
												Thread.sleep(3000);	
												WebElement element = driver.findElement(By.xpath("//*[@id='fsetCompliance']/div[2]/div/div[2]/button"));
												JavascriptExecutor js = (JavascriptExecutor) driver;
											    js.executeScript("arguments[0].scrollIntoView(true);", element);
											    Thread.sleep(3000);	
											    element.click();
											    Thread.sleep(1000);	
											    try {
												String msg=DirectorLocator.SaveCAMsg(driver).getText();
												if(msg.equalsIgnoreCase("Save Successfully.")) {
													test.log(LogStatus.PASS,"Message Displayed :-  "+ msg);
												}else {
													test.log(LogStatus.FAIL,"Message Displayed :-  "+ msg);
												}
												Thread.sleep(4000);
											    }
											    catch(Exception e) {
											    	String msg=DirectorLocator.SaveAssignement(driver).getText();
											    	if(msg.equalsIgnoreCase("Save Successfully.")) {
														test.log(LogStatus.PASS,"Message Displayed :-  "+ msg);
													}else {
														test.log(LogStatus.FAIL,"Message Displayed :-  "+ msg);
													}
											    }
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentCheck(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
			*/
			 DirectorLocator.Entity(driver).click();
				Thread.sleep(2000);
				 DirectorLocator.Entity1(driver).click();
					Thread.sleep(3000);
					
					if( DirectorLocator.CheckBox(driver).isSelected()) {
						
						DirectorLocator.CheckBox(driver).click();
						DirectorLocator.CheckBox(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}else {
						DirectorLocator.CheckBox(driver).click();
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentDeCheck(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
	/*By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
			
			 DirectorLocator.Entity(driver).click();
				Thread.sleep(2000);
				 DirectorLocator.Entity1(driver).click();
					Thread.sleep(3000);
					
					if( DirectorLocator.CheckBox(driver).isSelected()) {
						
						
						DirectorLocator.CheckBox(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox is deselected .");
					}else {
						
						test.log(LogStatus.PASS, " The checkbox is  deselected.");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentDeCheckAll(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
			
			 DirectorLocator.Entity(driver).click();
				Thread.sleep(2000);
				 DirectorLocator.Entity1(driver).click();
					Thread.sleep(3000);
					
					if( DirectorLocator.CheckBoxAll(driver).isEnabled()) {
						
						
						DirectorLocator.CheckBoxAll(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "When checked, all checkboxes in the group should be selected.");
					}else {
						
						test.log(LogStatus.PASS, " When checked, all checkboxes in the group not selected.");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentSearch(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
			
			 DirectorLocator.Entity(driver).click();
				Thread.sleep(2000);
				 DirectorLocator.Entity1(driver).click();
					Thread.sleep(4000);
					String id = DirectorLocator.Id(driver).getText();
					Thread.sleep(1000);
					 DirectorLocator.Filter(driver).sendKeys(id,Keys.ENTER);
					 Thread.sleep(4000);
		String msg= DirectorLocator.ID(driver).getText();
		Thread.sleep(4000);
					if(msg.equalsIgnoreCase(id)) {
						
						test.log(LogStatus.PASS, "The list  display only the items that match the keyword ");
					}else {
						
						test.log(LogStatus.PASS, " The list not display only the items that match the keyword ");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentA(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
					
					if( DirectorLocator.Assigned(driver).isEnabled()) {
						
						
						DirectorLocator.Assigned(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "User redirected to the assigned page");
					}else {
						
						test.log(LogStatus.PASS, " User not redirected to the assigned page");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAAssignedExport(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
						
			DirectorLocator.Assigned(driver).click();
				Thread.sleep(3000);
				
				DirectorLocator.EntityAssi(driver).click();
				Thread.sleep(2000);
				DirectorLocator.EntityAssi1(driver).click();
				Thread.sleep(4000);
				try {
				DirectorMethod.ExcelcountAndGridMatch(driver,test,workbook);
				}
				catch(IOException e)
				{
					
				}
					/*
				Thread.sleep(2000);
				File dir = new File("C:\\Users\\shitalb\\Downloads");
				File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(500);
				DirectorLocator.Export(driver).click();		//Exporting (Downloading) file
				
				Thread.sleep(3000);//C://Users//jiya//Downloads//
				File dir1 = new File("C:\\Users\\shitalb\\Downloads");
				File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
				
				Thread.sleep(3000);
				if (dirContents.length < allFilesNew.length) {
					test.log(LogStatus.PASS,  "  File downloaded successfully.");
				} else readTotalItems1 {
					test.log(LogStatus.FAIL, "  File does not downloaded.");
				}
				*/
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ExcelcountAndGridMatch( WebDriver driver, ExtentTest test, XSSFWorkbook workbook) throws InterruptedException, IOException
	{
			    
	  
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000); 		
        
        Thread.sleep(7000);

        DirectorLocator.readTotalItems(driver).click();
		String item = DirectorLocator.readTotalItems(driver).getText();
		String[] bits = item.split(" ");								//Splitting the String
		String compliancesCount = bits[bits.length - 2];				//Getting the second last word (total number of users)
		int count1 = Integer.parseInt(compliancesCount);
	
		if(compliancesCount.equalsIgnoreCase("to"))
		{
			Thread.sleep(5000);
		   item = DirectorLocator.readTotalItems(driver).getText();
			bits = item.split(" ");
        
		}
		
		Thread.sleep(2000);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        
        js1.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);

Thread.sleep(1000);
File dir = new File("C:\\Users\\shitalb\\Downloads");
File[] dirContents = dir.listFiles();							//Counting number of files in directory before download 

Thread.sleep(1000);
DirectorLocator.Export(driver).click();

Thread.sleep(9000);					//Clicking on 'Excel Report' image.
test.log(LogStatus.PASS, "File downloaded successfully.");

Thread.sleep(5500);
File dir1 = new File("C:\\Users\\shitalb\\Downloads");
File[] allFilesNew = dir1.listFiles();							//Counting number of files in directory after download

if(dirContents.length < allFilesNew.length)
{
	
	
	File lastModifiedFile = allFilesNew[0];			//Storing any 0th index file in 'lastModifiedFile' file name.
    for (int i = 1; i < allFilesNew.length; i++) 	//For loop till the number of files in directory.
    {
       if (lastModifiedFile.lastModified() < allFilesNew[i].lastModified()) 	//If allFilesNew[i] file is having large/latest time time of update then latest modified file be allFilesNew[i] file.
       {
           lastModifiedFile = allFilesNew[i];
       }
    }
	
	Thread.sleep(1000);
	fis = new FileInputStream(lastModifiedFile);
	workbook = new XSSFWorkbook(fis);
	sheet = workbook.getSheetAt(0);					//Retrieving first sheet of Workbook
	/*
	int no = sheet.getFirstRowNum();
	Row row = sheet.getRow(no);
	Cell c1 = row.getCell(0);
	int records =(int) c1.getNumericCellValue();
	*/
	sheet = workbook.getSheetAt(0);
	int columnNumber = 3;
	int rowCount = 0;
	int actualRow=0;
	
	for(Row row : sheet)
	{
		
		Cell cell =row.getCell(columnNumber);
		if(cell != null) {
			
			rowCount++;
			actualRow = rowCount-4;
		}
		
	}
	fis.close();
	
	if(count1 == actualRow)
	{
		//test.log(LogStatus.PASS, "No of records from grid matches to no of records in Excel Sheet.");
		test.log(LogStatus.PASS, "Total records from Grid = "+count1+" | Total records from Report = "+actualRow);
	}
	else
	{
		//test.log(LogStatus.FAIL, "No of records from grid doesn't matches to no of records in Excel Sheet.");
		test.log(LogStatus.FAIL, "Total records from Grid = "+count1+" | Total records from Excel Sheet = "+actualRow);
	}
}
else
{
	test.log(LogStatus.FAIL, "File doesn't downloaded successfully.");
}

        
	
	}
	public static void complianceassignmentRA(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
					
					if( DirectorLocator.ReAssignment(driver).isEnabled()) {
						
						DirectorLocator.ReAssignment(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "User redirected to the Re-Assignment page");
					}else {
						
						test.log(LogStatus.PASS, " User not redirected to the Re-Assignment page");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentRAS(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
	/*	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
					
				
						DirectorLocator.ReAssignment(driver).click();
						Thread.sleep(2000);
						DirectorLocator.EntityRA(driver).click();
						Thread.sleep(1000);
						DirectorLocator.EntityRA1(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.User(driver).click();
						Thread.sleep(1000);
						DirectorLocator.User2(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.NewUser(driver).click();
						Thread.sleep(1000);
						DirectorLocator.NewUser1(driver).click();
						Thread.sleep(2000);
					
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,500)");	
						
						DirectorLocator.SaveRA(driver).click();
						Thread.sleep(2000);
						
						String Msg=	DirectorLocator.SaveRAMsg(driver).getText();
						Thread.sleep(3000);
						if(Msg.equalsIgnoreCase("Save Successfully.")) {
							test.log(LogStatus.PASS,"To  Check user is able to Re-assign meeting level compliances based on entity name to new user : Message Displayed :-  "+ Msg);
						}else {
							test.log(LogStatus.FAIL,"To  Check user is able to Re-assign meeting level compliances based on entity name to new user : Message Displayed :-  "+ Msg);
						}
						Thread.sleep(3000);
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentCheckRA(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.ReAssignment(driver).click();
		Thread.sleep(2000);
			
		DirectorLocator.EntityRA(driver).click();
		Thread.sleep(1000);
		DirectorLocator.EntityRA1(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.User(driver).click();
		Thread.sleep(1000);
		DirectorLocator.User2(driver).click();
		Thread.sleep(2000);
		
		
					
					if( DirectorLocator.Checkbox(driver).isSelected()) {
						
						DirectorLocator.Checkbox(driver).click();
						DirectorLocator.Checkbox(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}else {
						DirectorLocator.Checkbox(driver).click();
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentDeCheckRA(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
			*/
		DirectorLocator.ReAssignment(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.EntityRA(driver).click();
		Thread.sleep(1000);
		DirectorLocator.EntityRA1(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.User(driver).click();
		Thread.sleep(1000);
		DirectorLocator.User2(driver).click();
		Thread.sleep(2000);
					
					if( DirectorLocator.Checkbox(driver).isSelected()) {
						
						
						DirectorLocator.Checkbox(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox is deselected .");
					}else {
						
						test.log(LogStatus.PASS, " The checkbox is  deselected.");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentDeCheckRAAll(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
			
		DirectorLocator.ReAssignment(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.EntityRA(driver).click();
		Thread.sleep(1000);
		DirectorLocator.EntityRA1(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.User(driver).click();
		Thread.sleep(1000);
		DirectorLocator.User2(driver).click();
		Thread.sleep(2000);
					
					if( !DirectorLocator.CheckboxAll(driver).isSelected()) {
						
						
						DirectorLocator.CheckboxAll(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " When checked, all checkboxes in the group should be selected.");
					}else {
						
						test.log(LogStatus.PASS, " When checked, all checkboxes in the group should be selected.");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentAgen(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
					
					if( DirectorLocator.Agenda(driver).isEnabled()) {
						
						DirectorLocator.Agenda(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " the Agenda radio button is clickable successfully.");
					}else {
						
						test.log(LogStatus.PASS, "the Agenda radio button is  not clickable");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentAgenSave(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
						
						DirectorLocator.Agenda(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.Entity(driver).click();
						Thread.sleep(1000);
						DirectorLocator.Entity1(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.Performer(driver).click();
						Thread.sleep(2000);
						 DirectorLocator.Performer1(driver).click();
							Thread.sleep(3000);
						 DirectorLocator.Reviewer(driver).click();
								Thread.sleep(2000);
						 DirectorLocator.Reviewer1(driver).click();
									Thread.sleep(3000);
									 DirectorLocator.StartDate(driver).click();
										Thread.sleep(2000);
								 DirectorLocator.StartDate1(driver).click();
											Thread.sleep(3000);
								 DirectorLocator.CheckboxAllAge(driver).click();
												Thread.sleep(3000);
								 DirectorLocator.CheckboxAllAge(driver).click();
													Thread.sleep(3000);
													 DirectorLocator.CheckboxAge1(driver).click();
														Thread.sleep(3000);
														JavascriptExecutor js = (JavascriptExecutor) driver;
														js.executeScript("window.scrollBy(0,300)");	
														Thread.sleep(5000);
														 DirectorLocator.Apply(driver).click();
															Thread.sleep(3000);
															
															DirectorLocator.filterCompliance(driver).sendKeys("86848",Keys.ENTER);
															Thread.sleep(5000);
															
															 DirectorLocator.SaveAgenda(driver).click();
																Thread.sleep(3000);		
																String Msg=	DirectorLocator.SaveAgendaMsg(driver).getText();
																Thread.sleep(3000);
																if(Msg.equalsIgnoreCase("Save Successfully.")) {
																	test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
																}else {
																	test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
																}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentCheckAge(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(2000);
			
		DirectorLocator.Entity(driver).click();
		Thread.sleep(1000);
		DirectorLocator.Entity1(driver).click();
		Thread.sleep(2000);
		
					
					if( DirectorLocator.CheckboxAge1(driver).isSelected()) {
						
						DirectorLocator.CheckboxAge1(driver).click();
						DirectorLocator.CheckboxAge1(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}else {
						DirectorLocator.Checkbox(driver).click();
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentDeCheckgenA(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
			
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.Entity(driver).click();
		Thread.sleep(1000);
		DirectorLocator.Entity1(driver).click();
		Thread.sleep(2000);
					
					if( DirectorLocator.CheckboxAge1(driver).isSelected()) {
						
						
						DirectorLocator.CheckboxAge1(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox is deselected .");
					}else {
						
						test.log(LogStatus.PASS, " The checkbox is  deselected.");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentDeCheckAllAgen(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
			
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.Entity(driver).click();
		Thread.sleep(1000);
		DirectorLocator.Entity1(driver).click();
		Thread.sleep(2000);
					
					if(!DirectorLocator.CheckboxAllAge(driver).isSelected()) {
						
						DirectorLocator.CheckboxAllAge(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " When checked, all checkboxes in the group should be selected.");
					}else {
						
						test.log(LogStatus.PASS, " When checked, all checkboxes in the group should be selected.");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void complianceassignmentAgenSearch(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
						
						DirectorLocator.Agenda(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.Entity(driver).click();
						Thread.sleep(1000);
						DirectorLocator.Entity1(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.Performer(driver).click();
						Thread.sleep(2000);
						 DirectorLocator.Performer1(driver).click();
							Thread.sleep(3000);
						 DirectorLocator.Reviewer(driver).click();
								Thread.sleep(2000);
						 DirectorLocator.Reviewer1(driver).click();
									Thread.sleep(3000);
									 DirectorLocator.StartDate(driver).click();
										Thread.sleep(2000);
								 DirectorLocator.StartDate1(driver).click();
											Thread.sleep(3000);
								 DirectorLocator.CheckboxAllAge(driver).click();
												Thread.sleep(3000);
								 DirectorLocator.CheckboxAllAge(driver).click();
													Thread.sleep(3000);
													 DirectorLocator.CheckboxAge1(driver).click();
														Thread.sleep(3000);
														JavascriptExecutor js = (JavascriptExecutor) driver;
														js.executeScript("window.scrollBy(0,300)");	
														Thread.sleep(5000);
														 DirectorLocator.Apply(driver).click();
															Thread.sleep(3000);
															String id = DirectorLocator.id(driver).getText();
															DirectorLocator.filterCompliance(driver).sendKeys(id,Keys.ENTER);
															Thread.sleep(5000);
																 
																String Msg=	DirectorLocator.idText(driver).getText();
																Thread.sleep(3000);
																if(id != null && id.equals(Msg)) {
																	test.log(LogStatus.PASS," The list should display only the items that match the keyword ");
																}else {
																	test.log(LogStatus.FAIL,"The list should not display only the items that match the keyword ");
																}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void CAAgendaAssigned(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(2000);
					
					if( DirectorLocator.Assigned(driver).isEnabled()) {
						
						DirectorLocator.Assigned(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " User should be redirected to the assigned page");
					}else {
						
						test.log(LogStatus.PASS, "User should not redirected to the assigned page");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAAgenAssignedExport(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(2000);
					
						
			DirectorLocator.Assigned(driver).click();
				Thread.sleep(3000);
				
				DirectorLocator.EntityAssi(driver).click();
				Thread.sleep(2000);
				DirectorLocator.EntityAssi1(driver).click();
				Thread.sleep(4000);
					try {
				DirectorMethod.ExcelcountAndGridMatch(driver, test, workbook);
					}
					catch(IOException e) {
						
					}
					/*
				Thread.sleep(2000);
				File dir = new File("C:\\Users\\shitalb\\Downloads");
				File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(500);
				DirectorLocator.Export(driver).click();		//Exporting (Downloading) file
				
				Thread.sleep(3000);//C://Users//jiya//Downloads//
				File dir1 = new File("C:\\Users\\shitalb\\Downloads");
				File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
				
				Thread.sleep(3000);
				if (dirContents.length < allFilesNew.length) {
					test.log(LogStatus.PASS,  "  File downloaded successfully.");
				} else {
					test.log(LogStatus.FAIL, "  File does not downloaded.");
				}
				*/
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAAgendareassignment (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(2000);
					
					if( DirectorLocator.ReAssignment(driver).isEnabled()) {
						
						DirectorLocator.ReAssignment(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " User should be redirected to the re-assignment  page");
					}else {
						
						test.log(LogStatus.PASS, "User should not redirected to the re - assignment  page");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAAgendaRS(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
	/*	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(2000);
				
						DirectorLocator.ReAssignment(driver).click();
						Thread.sleep(2000);
						DirectorLocator.EntityRA(driver).click();
						Thread.sleep(1000);
						DirectorLocator.EntityRA1(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.User(driver).click();
						Thread.sleep(1000);
						DirectorLocator.User1(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.NewUser(driver).click();
						Thread.sleep(1000);
						DirectorLocator.NewUser1(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.CheckAllAgen(driver).click();
						Thread.sleep(2000);
						DirectorLocator.CheckAllAgen(driver).click();
						Thread.sleep(3000);
						DirectorLocator.CheckAgen(driver).click();
						Thread.sleep(2000);
					
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,500)");	
						Thread.sleep(2000);
						
						
						DirectorLocator.SaveRA(driver).click();
						Thread.sleep(2000);
						
						String Msg=	DirectorLocator.SaveRAMsg(driver).getText();
						Thread.sleep(3000);
						if(Msg.equalsIgnoreCase("Save Successfully.")) {
							test.log(LogStatus.PASS,"To  Check user is able to Re-assign meeting level compliances based on entity name to new user : Message Displayed :-  "+ Msg);
						}else {
							test.log(LogStatus.FAIL,"To  Check user is able to Re-assign meeting level compliances based on entity name to new user : Message Displayed :-  "+ Msg);
						}
						Thread.sleep(3000);
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CACheckAgeRS(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.ReAssignment(driver).click();
		Thread.sleep(2000);
			
		DirectorLocator.EntityRA(driver).click();
		Thread.sleep(1000);
		DirectorLocator.EntityRA1(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.User(driver).click();
		Thread.sleep(1000);
		DirectorLocator.User1(driver).click();
		Thread.sleep(2000);
		
		
					
					if( DirectorLocator.CheckAgen(driver).isSelected()) {
						
						DirectorLocator.CheckAgen(driver).click();
						DirectorLocator.CheckAgen(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}else {
						DirectorLocator.Checkbox(driver).click();
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CACheckAgeRSDeS(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.ReAssignment(driver).click();
		Thread.sleep(2000);
			
		DirectorLocator.EntityRA(driver).click();
		Thread.sleep(1000);
		DirectorLocator.EntityRA1(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.User(driver).click();
		Thread.sleep(1000);
		DirectorLocator.User1(driver).click();
		Thread.sleep(2000);
		
		
					
					if( DirectorLocator.CheckAgen(driver).isSelected()) {
						
					
						DirectorLocator.CheckAgen(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox is deselected Successfully.");
					}else {
						
						test.log(LogStatus.PASS, " The checkbox is deselected .");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CACheckAgeRSDeSAll(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.ReAssignment(driver).click();
		Thread.sleep(2000);
			
		DirectorLocator.EntityRA(driver).click();
		Thread.sleep(1000);
		DirectorLocator.EntityRA1(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.User(driver).click();
		Thread.sleep(1000);
		DirectorLocator.User1(driver).click();
		Thread.sleep(2000);
		
		
					
					if( !DirectorLocator.CheckAllAgen(driver).isSelected()) {
						
					
						DirectorLocator.CheckAllAgen(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " When checked, all checkboxes in the group should be selected.");
					}else {
						
						test.log(LogStatus.PASS, " When checked, all checkboxes in the group should be selected.");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAAgendaUpload (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
		
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(2000);
					
					if( DirectorLocator.UploadAssignment(driver).isEnabled()) {
						
						DirectorLocator.UploadAssignment(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " User should be redirected to the new page of upload assignment");
					}else {
						
						test.log(LogStatus.PASS, "User should not redirected to the new page of upload assignment");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAAgendaUploadWF (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
		
		DirectorLocator.Agenda(driver).click();
		Thread.sleep(3000);
						
						DirectorLocator.UploadAssignment(driver).click();
						Thread.sleep(4000);
						
						DirectorLocator.UploadBtn(driver).click();
						Thread.sleep(4000);
						
						String Msg=	DirectorLocator.UploadMsgAgn(driver).getText();
						Thread.sleep(3000);
						if(Msg.equalsIgnoreCase("Please Upload File")) {
							test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
						}else {
							test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
						}
											
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAStatutory (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
	
					if( DirectorLocator.Statutory(driver).isEnabled()) {
						
						DirectorLocator.Statutory(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " the Statutory radio button is clickable Successfully .");
					}else {
						
						test.log(LogStatus.PASS, "the Statutory radio button is not clickable ");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}

	public static void CAStatutorySave(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
						
						DirectorLocator.Statutory(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.Entity(driver).click();
						Thread.sleep(1000);
						DirectorLocator.Entity1(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.Performer(driver).click();
						Thread.sleep(2000);
						 DirectorLocator.Performer1(driver).click();
							Thread.sleep(3000);
						 DirectorLocator.Reviewer(driver).click();
								Thread.sleep(2000);
						 DirectorLocator.Reviewer1(driver).click();
									Thread.sleep(3000);
									 DirectorLocator.StartDate(driver).click();
										Thread.sleep(2000);
								 DirectorLocator.StartDate1(driver).click();
											Thread.sleep(4000);
								 
												
													 DirectorLocator.StatutoryCheck(driver).click();
														Thread.sleep(3000);
														JavascriptExecutor js = (JavascriptExecutor) driver;
														js.executeScript("window.scrollBy(0,300)");	
														Thread.sleep(5000);
														 DirectorLocator.Apply1(driver).click();
															Thread.sleep(3000);
															
															 DirectorLocator.SaveAgenda(driver).click();
																Thread.sleep(3000);		
																String Msg=	DirectorLocator.SaveAgendaMsg(driver).getText();
																Thread.sleep(3000);
																if(Msg.equalsIgnoreCase("Save Successfully.")) {
																	test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
																}else {
																	test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
																}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CACheckStatu(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
		
			
		DirectorLocator.Entity(driver).click();
		Thread.sleep(1000);
		DirectorLocator.Entity1(driver).click();
		Thread.sleep(2000);
		
		
		
					
					if( !DirectorLocator.StatutoryCheck(driver).isSelected()) {
						
						DirectorLocator.StatutoryCheck(driver).click();
						Thread.sleep(2000);
						
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}else {
					
						test.log(LogStatus.PASS, " The checkbox Already selected .");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CACheckStaDeS(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
		
			
		DirectorLocator.Entity(driver).click();
		Thread.sleep(1000);
		DirectorLocator.Entity1(driver).click();
		Thread.sleep(2000);
					
					if( !DirectorLocator.StatutoryCheck(driver).isSelected()) {
						
					
						DirectorLocator.StatutoryCheck(driver).click();
						Thread.sleep(2000);
						DirectorLocator.StatutoryCheck(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox is deselected Successfully.");
					}else {
						
						test.log(LogStatus.PASS, " The checkbox is deselected .");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CACheckStaAll(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
		
			
		DirectorLocator.Entity(driver).click();
		Thread.sleep(1000);
		DirectorLocator.Entity1(driver).click();
		Thread.sleep(2000);
					
					if( !DirectorLocator.StatutoryCheckAll(driver).isSelected()) {
						
					
						DirectorLocator.StatutoryCheckAll(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " When checked, all checkboxes in the group should be selected.");
					}else {
						
						test.log(LogStatus.PASS, " When checked, all checkboxes in the group should be selected.");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAStatutoryAssigned (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);*/
	
					if( DirectorLocator.Assigned(driver).isEnabled()) {
						
						DirectorLocator.Assigned(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " User should be redirected to the assigned page Successfully .");
					}else {
						
						test.log(LogStatus.PASS, "User should not redirected to the assigned page");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	

	public static void CAStaAssignedExport(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
	/*	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
					
						
			DirectorLocator.Assigned(driver).click();
				Thread.sleep(3000);
				
				DirectorLocator.EntityAssi(driver).click();
				Thread.sleep(2000);
				DirectorLocator.EntityAssi1(driver).click();
				Thread.sleep(4000);
					
				Thread.sleep(2000);
				File dir = new File("C:\\Users\\shitalb\\Downloads");
				File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
				
				Thread.sleep(500);
				DirectorLocator.Export(driver).click();		//Exporting (Downloading) file
				
				Thread.sleep(3000);//C://Users//jiya//Downloads//
				File dir1 = new File("C:\\Users\\shitalb\\Downloads");
				File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
				
				Thread.sleep(3000);
				if (dirContents.length < allFilesNew.length) {
					test.log(LogStatus.PASS,  "  File downloaded successfully.");
				} else {
					test.log(LogStatus.FAIL, "  File does not downloaded.");
				}
				
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAStareassignment (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
		*/
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
					
					if( DirectorLocator.ReAssignment(driver).isEnabled()) {
						
						DirectorLocator.ReAssignment(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " User should be redirected to the re-assignment  page");
					}else {
						
						test.log(LogStatus.PASS, "User should not redirected to the re - assignment  page");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void CAStaRS(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
				
						DirectorLocator.ReAssignment(driver).click();
						Thread.sleep(2000);
						DirectorLocator.EntityRA(driver).click();
						Thread.sleep(2000);
						DirectorLocator.EntityRA3(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.User(driver).click();
						Thread.sleep(1000);
						DirectorLocator.User2(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.NewUser(driver).click();
						Thread.sleep(1000);
						DirectorLocator.NewUser1(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.CheckAllAgen(driver).click();
						Thread.sleep(2000);
						DirectorLocator.CheckAllAgen(driver).click();
						Thread.sleep(3000);
						DirectorLocator.CheckAgen(driver).click();
						Thread.sleep(2000);
					
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,500)");	
						Thread.sleep(2000);
						
						
						
						DirectorLocator.SaveRA(driver).click();
						Thread.sleep(2000);
						
						String Msg=	DirectorLocator.SaveRAMsg(driver).getText();
						Thread.sleep(3000);
						if(Msg.equalsIgnoreCase("Save Successfully.")) {
							test.log(LogStatus.PASS,"To  Check user is able to Re-assign meeting level compliances based on entity name to new user : Message Displayed :-  "+ Msg);
						}else {
							test.log(LogStatus.FAIL,"To  Check user is able to Re-assign meeting level compliances based on entity name to new user : Message Displayed :-  "+ Msg);
						}
						Thread.sleep(3000);
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CACheckStaRS(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.ReAssignment(driver).click();
		Thread.sleep(2000);
			
		DirectorLocator.EntityRA(driver).click();
		Thread.sleep(1000);
		DirectorLocator.EntityRA3(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.User(driver).click();
		Thread.sleep(1000);
		DirectorLocator.User2(driver).click();
		Thread.sleep(2000);
		
		
					
					if(DirectorLocator.CheckAgen(driver).isSelected()) {
						
						DirectorLocator.CheckAgen(driver).click();
						DirectorLocator.CheckAgen(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}else {
						DirectorLocator.Checkbox(driver).click();
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CACheckStaRSDeS(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.ReAssignment(driver).click();
		Thread.sleep(2000);
			
		DirectorLocator.EntityRA(driver).click();
		Thread.sleep(1000);
		DirectorLocator.EntityRA3(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.User(driver).click();
		Thread.sleep(1000);
		DirectorLocator.User2(driver).click();
		Thread.sleep(2000);
		
		
					
					if( DirectorLocator.CheckAgen(driver).isSelected()) {
						
					
						DirectorLocator.CheckAgen(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox is deselected Successfully.");
					}else {
						
						test.log(LogStatus.PASS, " The checkbox is deselected .");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CACheckStaRSDeSAll(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.ReAssignment(driver).click();
		Thread.sleep(2000);
			
		DirectorLocator.EntityRA(driver).click();
		Thread.sleep(1000);
		DirectorLocator.EntityRA3(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.User(driver).click();
		Thread.sleep(1000);
		DirectorLocator.User2(driver).click();
		Thread.sleep(2000);
		
		
					
					if( !DirectorLocator.CheckAllAgen(driver).isSelected()) {
						
					
						DirectorLocator.CheckAllAgen(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " When checked, all checkboxes in the group should be selected.");
					}else {
						
						test.log(LogStatus.PASS, " When checked, all checkboxes in the group should be selected.");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAStaExclude (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
					
					if( DirectorLocator.ExcludeAssignment(driver).isEnabled()) {
						
						DirectorLocator.ExcludeAssignment(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " User should be redirected to the Exclude assignment page");
					}else {
						
						test.log(LogStatus.PASS, "User should not redirected to the Exclude assignment page");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAStaExcludeA (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
					
						DirectorLocator.ExcludeAssignment(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.EntityEA(driver).click();
						Thread.sleep(1000);
						DirectorLocator.EntityEA1(driver).click();
						Thread.sleep(8000);
						
						DirectorLocator.CheckEA(driver).click();
						Thread.sleep(2000);
						
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("window.scrollBy(0,1000)");	
						Thread.sleep(3000);		
						
						DirectorLocator.SaveEA(driver).click();
						Thread.sleep(3000);
						 Actions act =new Actions(driver);
				            act.sendKeys(Keys.PAGE_UP).build().perform();
				            Thread.sleep(7000);
					
						By locator1 = By.xpath("//*[@id='divgridComplianceAssignExcludeMessage']/div/div/div/lable");
						
						wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
						Thread.sleep(4000);
						
						WebElement ViewButton1 = driver.findElement(locator1);	
						Thread.sleep(4000);
						ViewButton1.click();
						String Msg=	DirectorLocator.SaveEAMsg(driver).getText();
						Thread.sleep(3000);
						if(Msg.equalsIgnoreCase("Save Successfully.")) {
							test.log(LogStatus.PASS,"To check whether user is able to exclude already assigned assignment from the list : Message Displayed :-  "+ Msg);
						}else {
							test.log(LogStatus.FAIL,"To check whether user is able to exclude already assigned assignment from the list : Message Displayed :-  "+ Msg);
						}
						Thread.sleep(3000);
								
						
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAStaExcludeAFilter (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
					
						DirectorLocator.ExcludeAssignment(driver).click();
						Thread.sleep(2000);
						
						DirectorLocator.EntityEA(driver).click();
						Thread.sleep(1000);
						DirectorLocator.EntityEA1(driver).click();
						Thread.sleep(8000);
						
						DirectorLocator.FilterEA(driver).sendKeys("291",Keys.ENTER);
						Thread.sleep(2000);
						String Msg=	DirectorLocator.FilterEAText(driver).getText();
						Thread.sleep(2000);
						if(Msg.equalsIgnoreCase("291"))
						{
							test.log(LogStatus.PASS," Filter working successfully . ");
						}else {
							test.log(LogStatus.PASS," Filter not working  . ");
						}
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAEACheckStatu(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.ExcludeAssignment(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.EntityEA(driver).click();
		Thread.sleep(1000);
		DirectorLocator.EntityEA1(driver).click();
		Thread.sleep(8000);
		
		
		
					
					if( !DirectorLocator.CheckEA(driver).isSelected()) {
						
						DirectorLocator.CheckEA(driver).click();
						Thread.sleep(2000);
						
						test.log(LogStatus.PASS, " The checkbox should be selected .");
					}else {
					
						test.log(LogStatus.PASS, " The checkbox Already selected .");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CAEACheckStaDe(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.ComplianceAssignment(driver).click();
		Thread.sleep(4000);
		/*
	By locator = By.xpath("//*[@id='Mastermenu']/ul/li[11]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		DirectorLocator.Statutory(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.ExcludeAssignment(driver).click();
		Thread.sleep(2000);
		
		DirectorLocator.EntityEA(driver).click();
		Thread.sleep(1000);
		DirectorLocator.EntityEA1(driver).click();
		Thread.sleep(8000);
		
					
					if( !DirectorLocator.CheckEA(driver).isSelected()) {
						
					
						DirectorLocator.CheckEA(driver).click();
						Thread.sleep(2000);
						DirectorLocator.CheckEA(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, " The checkbox is deselected Successfully.");
					}else {
						
						test.log(LogStatus.PASS, " The checkbox is deselected .");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void NotesClick (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.Note(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[12]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
		test.log(LogStatus.PASS, " User should be redirected to the Notes page");
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void NotesA (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.Note(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[12]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
	
					
					if( DirectorLocator.ApplicableRB(driver).isEnabled()) {
						
						DirectorLocator.ApplicableRB(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Clicking on the applicable radio button selects it and visually indicates the selection state");
					}else {
						
						test.log(LogStatus.PASS, " applicable radio button not selected");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void NotesNA (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.Note(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[12]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
					if( DirectorLocator.NotApplicableRB(driver).isEnabled()) {
						
						DirectorLocator.NotApplicableRB(driver).click();
						Thread.sleep(2000);
						test.log(LogStatus.PASS, "Clicking on the not applicable radio button selects it and visually indicates the selection state");
					}else {
						
						test.log(LogStatus.PASS, " not applicable radio button not selected");
					}
					
												
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void NotesText (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(2000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.Note(driver).click();
		Thread.sleep(4000);
		/*
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[12]/a");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);*/
		
	//	driver.switchTo().frame(0);
		driver.switchTo().frame(Locator.Frame(driver));
		Thread.sleep(2000);
		WebElement editableArea = driver.findElement(By.xpath("//body"));  // Example XPath inside iframe
		editableArea.clear();
		editableArea.sendKeys("Auto23");
		//Locator.TextArea(driver).clear();
		//Thread.sleep(2000);
	//	Locator.TextArea(driver).sendKeys("Auto23");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement Save = DirectorMethod.scrollToElement(driver, Locator.SaveNotes(driver));
		Save.click();
	//	Locator.SaveNotes(driver).click();
		Thread.sleep(3000);
		String text=Locator.ValidationMsg(driver).getText();
		test.log(LogStatus.PASS, ""+ text);
		
      		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	public static WebElement scrollToElement(WebDriver driver,WebElement element)
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
		return element;
	}
	
	
	
}
