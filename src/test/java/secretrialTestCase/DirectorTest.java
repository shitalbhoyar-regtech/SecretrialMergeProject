package secretrialTestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CompnaySecretory.MyWorkspaceMethod;
import CompnaySecretory.UserMasterMethod;
import secretrial.DirectorMethod;
import secretrial.MasterMethod;

public class DirectorTest {

	
	public static WebDriver driver = null;		//WebDriver instance created
	public static WebElement upload = null;		//WebElement to get upload button
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static List<WebElement> elementsList = null;
	
	public static XSSFSheet ReadExcel() throws IOException
	{
		
		fis = new FileInputStream("D:\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\TestData\\Scretrial.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Report\\Secretrial.html",true);
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
	
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);	

	
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		
		driver = login.Login.UserLogin(uname,password,"Compnay Secretory");		//Method of Login class to login user.
		
	}
	
	@Test(priority = 1) //20/06/2023   done
	void DirectorClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - clickable or not Verification  ");
		
		DirectorMethod.DirectorClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 2) //done
	void DirectorAddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - Add New - With Valid Data  ");
		
		DirectorMethod.DirectorAddNew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 3) //done
	void DirectorAddNewAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - Add New - With already exists Data  ");
		
		DirectorMethod.DirectorAddNewAE(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 4) //done
	void DirectorAddNewClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - Add New - Close ");
		
		DirectorMethod.DirectorAddNewClose(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 5) //Pending because field not get edit and editing not working here
	void DirectorEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - With Valid Data ");
		
		DirectorMethod.DirectorEdit(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 6) //Pending because field not get edit and editing not working here
	void DirectorEditBlank() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - Leave one or more required fields blank ");
		
		DirectorMethod.DirectorEditBlank(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 7) //done
	void DirectorEditClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - Close ");
		
		DirectorMethod.DirectorEditClose(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 8) //Done
	void DirectorLOR() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' option is clickable or not");
		
		DirectorMethod.DirectorLOR(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 9) //28/06/2023   done
	void DirectorLORAddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -HUF - with valid data");
		
		DirectorMethod.DirectorLORAddNew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 10) //done
	void DirectorLORAddNewAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- HUF - with the same details as an existing entry");
		
		DirectorMethod.DirectorLORAddNewAE(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 11) //done
	void DirectorLORAddNewEmpty() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -HUF - without entering data");
		
		DirectorMethod.DirectorLORAddNewEmpty(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 12) //done
	void DirectorLORAddNewClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- HUF -'Close' button is clickable or Not verification.");
		
		DirectorMethod.DirectorLORAddNewClose(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 13) //done
	void DirectorLORAddNewSpo() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Spouse - with valid data");
		
		DirectorMethod.DirectorLORAddNewSpo(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 14)//done
	void DirectorLORAddNewSpoAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Spouse - with the same details as an existing entry");
		
		DirectorMethod.DirectorLORAddNewSpoAE(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 15) //done
		void DirectorLORAddNewSpoEmpty() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Spouse - without entering data");
			
			DirectorMethod.DirectorLORAddNewSpoEmpty(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 16) //done
		void DirectorLORAddNewCloseSpo() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Spouse -'Close' button is clickable or Not verification.");
			
			DirectorMethod.DirectorLORAddNewCloseSpo(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
		@Test(priority = 17) //done
		void DirectorLORAddNewFather() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Father - with valid data");
			
			DirectorMethod.DirectorLORAddNewFather(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	@Test(priority = 18) //done
		void DirectorLORAddNewFatherAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Father - with the same details as an existing entry");
			
			DirectorMethod.DirectorLORAddNewFatherAE(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	
		@Test(priority = 19) //done
		void DirectorLORAddNewFathEmpty() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Father - without entering data");
			
			DirectorMethod.DirectorLORAddNewFathEmpty(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 20) //done
		void DirectorLORAddNewCloseFath() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Father -'Close' button is clickable or Not verification.");
			
			DirectorMethod.DirectorLORAddNewCloseFath(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
		@Test(priority = 21) //done
		void DirectorLORAddNewMother() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Mother - with valid data");
			
			DirectorMethod.DirectorLORAddNewMother(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 22) //done
		void DirectorLORAddNewMotherAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Mother - with the same details as an existing entry");
			
			DirectorMethod.DirectorLORAddNewMotherAE(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 23) //done
		void DirectorLORAddNewMothEmpty() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Mother - without entering data");
			
			DirectorMethod.DirectorLORAddNewMothEmpty(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 24) //done
		void DirectorLORAddNewCloseMoth() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Mother -'Close' button is clickable or Not verification.");
			
			DirectorMethod.DirectorLORAddNewCloseMoth(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 25) //done
		void DirectorLORAddNewSon() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Son - with valid data");
			
			DirectorMethod.DirectorLORAddNewSon(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 26) //done
		void DirectorLORAddNewSonAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Son - with the same details as an existing entry");
			
			DirectorMethod.DirectorLORAddNewSonAE(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 27) //done
			void DirectorLORAddNewEmptySon() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Son - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptySon(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 28) //done
			void DirectorLORAddNewCloseSon() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Son -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseSon(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 29) //29/06/2023  done
			void DirectorLORAddNewDaughter() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Daughter - with valid data");
				
				DirectorMethod.DirectorLORAddNewDaughter(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
		
			@Test(priority = 30) //done
			void DirectorLORAddNewDaughterAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Daughter - with the same details as an existing entry");
				
				DirectorMethod.DirectorLORAddNewDaughterAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 31) //done
			void DirectorLORAddNewEmptyDaughter() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Son - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptyDaughter(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 32) //done
			void DirectorLORAddNewCloseDaughter() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Son -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseDaughter(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			
	
			@Test(priority = 33) //done
			void DirectorLORAddNewBrother() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Brother - with valid data");
				
				DirectorMethod.DirectorLORAddNewBrother(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
		
			@Test(priority = 34) //DONE
			void DirectorLORAddNewBrotherAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Brother - with the same details as an existing entry");
				
				DirectorMethod.DirectorLORAddNewBrotherAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 35) //DONE
			void DirectorLORAddNewEmptyBrother() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Brother - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptyBrother(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 36) //done
			void DirectorLORAddNewCloseBrother() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Brother -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseBrother(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 37) //done
			void DirectorLORAddNewSister() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Sister - with valid data");
				
				DirectorMethod.DirectorLORAddNewSister(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
		
			@Test(priority = 38) //Done
			void DirectorLORAddNewSisterAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Sister - with the same details as an existing entry");
				
				DirectorMethod.DirectorLORAddNewSisterAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 39) //done
			void DirectorLORAddNewEmptySister() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Sister - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptySister(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 40) //done
			void DirectorLORAddNewCloseSister() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Sister -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseSister(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 41) //done
			void DirectorLOREdit() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Edit - with valid data");
				
				DirectorMethod.DirectorLOREdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 42) //done
			void DirectorLOREditClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Edit - Close");
				
				DirectorMethod.DirectorLOREditClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 43) //done
			void DirectorLORDelete() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Delete");
				
				DirectorMethod.DirectorLORDelete(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 44) //done
			void DirectorLORDeleteCan() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Delete -Cancel");
				
				DirectorMethod.DirectorLORDeleteCan(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 45) //done
			void DirectorLORipp() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Items per page - Displayed or not Verification");
				
				DirectorMethod.DirectorLORipp(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 46)//30/06/2023  done
			void DirectorDOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details Of Interest' option is clickable or not");
				
				DirectorMethod.DirectorDOI(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 47)//done
			void DirectorDOCP() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' option is clickable or not");
				
				DirectorMethod.DirectorDOCP(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 48) //done
			void DirectorDOCPAddNew() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New - With Valid Data");
				
				DirectorMethod.DirectorDOCPAddNew(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 49)//done
			void DirectorDOCPAddNewVal() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -without providing all the required information.");
				
				DirectorMethod.DirectorDOCPAddNewVal(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 50)//done
			void DirectorDOCPAddNewEmpty() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -without filling data.");
				
				DirectorMethod.DirectorDOCPAddNewEmpty(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 51)//done
			void DirectorDOCPAddNewAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -  with the same details as an existing entry");
				
				DirectorMethod.DirectorDOCPAddNewAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			
			@Test(priority = 52)//done
			void DirectorDOCPAddNewClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -  Close");
				
				DirectorMethod.DirectorDOCPAddNewClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 53)//done
			void DirectorDOCPEdit() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Edit");
				
				DirectorMethod.DirectorDOCPEdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 54)//pending
			void DirectorDOCPEditBlank() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Edit -Leave one  required fields blank. ");
				
				DirectorMethod.DirectorDOCPEditBlank(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 55)//done
			void DirectorDOCPEditClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Edit - Close ");
				
				DirectorMethod.DirectorDOCPEditClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 56)//done
			void DirectorDOCPDelete() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Delete ");
				
				DirectorMethod.DirectorDOCPDelete(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 57)//done
			void DirectorSD() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Security Details' option is clickable or not");
				
				DirectorMethod.DirectorSD(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 58) //03/07/2023  pending
			void DirectorSDEdit() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Security Details' - Edit- with Valid Data");
				
				DirectorMethod.DirectorSDEdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 59) //pending
			void DirectorSDclose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Security Details' - Edit- Close");
				
				DirectorMethod.DirectorSDclose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 60)//done
			void DirectorProfile() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Profile' option is clickable or not");
				
				DirectorMethod.DirectorProfile(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 61)//done
			void DirectorProfileAdd() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Profile' - Add");
				
				DirectorMethod.DirectorProfileAdd(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 62)//done
			void DirectorDIR8() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'DIR-8' option is clickable or not");
				
				DirectorMethod.DirectorDIR8(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 63) //05/07/2023  //done
			void DirectorDIR8Preview() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master  - 'DIR-8' - Preview - with Valid data");
				
				DirectorMethod.DirectorDIR8Preview(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 64) //done
			void DirectorDIR8DownLoad() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master  - 'DIR-8' -  Download");
				
				DirectorMethod.DirectorDIR8DownLoad(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 65)//done
			void DirectorMBP() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master  - 'MBP-1' option is clickable or not");
				
				DirectorMethod.DirectorMBP(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 66) //done
			void DirectorMBPPreview() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - 'MBP-1' - Preview - with Valid data");
				
				DirectorMethod.DirectorMBPPreview(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 67)//done
			void DirectorMBPDwonload() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - 'MBP-1' - Download");
				
				DirectorMethod.DirectorMBPDwonload(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 68)//done
			void DirectorView() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - View");
				
				DirectorMethod.DirectorView(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 69)//done
			void DirectorViewAbout() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - View - About' tab is clickable or not Verification.");
				
				DirectorMethod.DirectorViewAbout(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
		   @Test(priority = 70)//done
			void DirectorViewDOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - View -'Details of Interest' tab is clickable or not Verification.");
				
				DirectorMethod.DirectorViewDOI(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 71) //done
			void DirectorViewCP() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - View -'Committe Position' tab is clickable or not Verification.");
				
				DirectorMethod.DirectorViewCP(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 72) //done
			void DirectorDelete() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Delete");
				
				DirectorMethod.DirectorDelete(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 73)//done
			void DirectorDeleteCan() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Delete - Cancel");
				
				DirectorMethod.DirectorDeleteCan(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 74) //06/07/2023  done
			void DirectorSearch() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Search");
				
				DirectorMethod.DirectorSearch(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 75)//done
			void DirectorUpload() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload tab is clickable or not Verification");
				
				DirectorMethod.DirectorUpload(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 76)//done
			void DirectorUploadInvalid() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - DIR-3 KYC - with invalid File type extension.");
				
				DirectorMethod.DirectorUploadInvalid(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 77)//done
			void DirectorUploadExcel() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with valid data");
				
				DirectorMethod.DirectorUploadExcel(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 78) //10/07/2023//done
			void DirectorUploadExcelInvalid() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid DIN number.(Less than 8 digits)");
				
				DirectorMethod.DirectorUploadExcelInvalid(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 79) //done
			void DirectorUploadExcelInvalidMore() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid DIN number.(More than 8 digits)");
				
				DirectorMethod.DirectorUploadExcelInvalidMore(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 80) //done
			void DirectorUploadExcelInvalidAlpha() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid DIN number.(Entering Alphabet)");
				
				DirectorMethod.DirectorUploadExcelInvalidAlpha(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 81) //done
			void DirectorUploadExcelInvalidSpe() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid DIN number.(Special charecter in the field of DIN number )");
				
				DirectorMethod.DirectorUploadExcelInvalidSpe(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 82) //done
			void DirectorUploadExcelInvalidPan() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid - Enter PAN number with less than 10 characters");
				
				DirectorMethod.DirectorUploadExcelInvalidPan(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 83) //done
			void DirectorUploadExcelInvalidPanM() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid - Enter PAN number with More than 10 characters");
				
				DirectorMethod.DirectorUploadExcelInvalidPanM(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 84) //done
			void DirectorUploadExcelInvalidPanSpe() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid - Enter PAN number with special characters ");
				
				DirectorMethod.DirectorUploadExcelInvalidPanSpe(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 85) //done
			void DirectorUploadExcelInvalidMbl() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid - Enter Invalid mobile number ");
				
				DirectorMethod.DirectorUploadExcelInvalidMbl(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
		@Test(priority = 86) //done
			void DirectorUploadExcelEmpty() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid - with Empty data ");
				
				DirectorMethod.DirectorUploadExcelEmpty(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 87) //done
			void DirectorUploadExcelinEx() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with invalid file type extension ");
				
				DirectorMethod.DirectorUploadExcelinEx(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 88)//done //21-04-2024
			void DirectorUploadExcelAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Existing data");
				
				DirectorMethod.DirectorUploadExcel(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 89)//13/07/2023 //done
			void complianceassignment() throws InterruptedException, IOException
			{
				test = extent.startTest("Master - Compliance Assignment");
				
				DirectorMethod.complianceassignment(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 90) //done
			void complianceassignmentMR() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - the meeting radio button is clickable or not");
				
				DirectorMethod.complianceassignmentMR(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 91)  //done
			void complianceassignmentAssign() throws InterruptedException, IOException
			{
				test = extent.startTest("Master - Compliance Assignment -  compliance assign to particular performer and reviewer");
				
				DirectorMethod.complianceassignmentAssign(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 92)  //done
			void complianceassignmentCheck() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting - Assignment - Verify that a checkbox can be selected");
				
				DirectorMethod.complianceassignmentCheck(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 93) //done
			void complianceassignmentDeCheck() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting - Assignment - Verify that a checkbox can be deselected ");
				
				DirectorMethod.complianceassignmentDeCheck(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 94)//done
			void complianceassignmentDeCheckAll() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting - Assignment - all checkbox option working properly or not ");
				
				DirectorMethod.complianceassignmentDeCheckAll(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 95)  //done
			void complianceassignmentSearch() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting - Assignment - The compliance ID/Compliance filter fuctionality is working or not by search option ");
				
				DirectorMethod.complianceassignmentSearch(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 96) //14/07/2023  //done
			void complianceassignmentA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting  -  'Assigned' tab is clickable or not verification");
				
				DirectorMethod.complianceassignmentA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 97) //done
			void CAAssignedExport() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting  -  'Assigned' tab - Export");
				DirectorMethod.CAAssignedExport(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 98)  //done
			void complianceassignmentRA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting  -  'Re-Assignment' tab is clickable or not verification");
				
				DirectorMethod.complianceassignmentRA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 99)//done
			void complianceassignmentRAS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting  -  'Re-Assignment'  ");
				
				DirectorMethod.complianceassignmentRAS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 100)//done
			void complianceassignmentCheckRA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting - Re-Assignment - Verify that a checkbox can be selected(Meeting> Re-assignment)");
				
				DirectorMethod.complianceassignmentCheckRA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			@Test(priority = 101)//done
			void complianceassignmentDeCheckRA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting -Re- Assignment - Verify that a checkbox can be deselected (Meeting> Re-assignment)");
				
				DirectorMethod.complianceassignmentDeCheckRA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 102)//done
			void complianceassignmentDeCheckRAAll() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting -Re- Assignment - Verify all checkbox option working properly or not (Meeting> Re-assignment)");
				
				DirectorMethod.complianceassignmentDeCheckRAAll(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 103)//done
			void complianceassignmentAgen() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment   - The Agenda radio button is clickable or not verification");
				
				DirectorMethod.complianceassignmentAgen(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 104)//done
			void complianceassignmentAgenSave() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda - Assignment - To check user is able to assign Agenda level compliances based on entity name to performer and reviewer");
				
				DirectorMethod.complianceassignmentAgenSave(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 105)//done
			void complianceassignmentCheckAge() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Agenda -  Verify that a checkbox can be selected (Agenda> Assignment)");
				
				DirectorMethod.complianceassignmentCheckAge(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 106)//done
			void complianceassignmentDeCheckgenA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Agenda - Verify that a selected checkbox can be deselected (Agenda> Assignment)");
				
				DirectorMethod.complianceassignmentDeCheckgenA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 107)//done
			void complianceassignmentDeCheckAllAgen() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  - Agenda - To check whether the select all checkbox option working properly or not (Agenda> Assignment)");
				
				DirectorMethod.complianceassignmentDeCheckAllAgen(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 108)//done
			void complianceassignmentAgenSearch() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  - Agenda - To check whether the Meeting filter fuctionality is working or not (Agenda > Assignment)");
				
				DirectorMethod.complianceassignmentAgenSearch(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 109)  //17/07/2023  //done
			void CAAgendaAssigned() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment   -  Agenda - Assigned' tab is clickable or not");
				
				DirectorMethod.CAAgendaAssigned(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 110) //done
			void CAAgenAssignedExport() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda  -  'Assigned' tab - Export");
				DirectorMethod.CAAgenAssignedExport(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 111) //done
			void CAAgendareassignment() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda  -  the reassignment tab is clickable or not (Agenda > Re-assignment)");
				DirectorMethod.CAAgendareassignment(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 112) //done
			void CAAgendaRS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda  -  re-assignment ");
			
				DirectorMethod.CAAgendaRS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 113) //done
			void CACheckAgeRS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Agenda -  Verify that a checkbox can be selected (Agenda> Re-assignment)");
				
				DirectorMethod.CACheckAgeRS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 114)//done
			void CACheckAgeRSDeS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Agenda - Verify that a selected checkbox can be deselected (Agenda> Re- Assignment)");
				
				DirectorMethod.CACheckAgeRSDeS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 115)  //done
			void CACheckAgeRSDeSAll() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  - Agenda - To check whether the select all checkbox option working properly or not (Agenda> Re-Assignment)");
				
				DirectorMethod.CACheckAgeRSDeSAll(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 116) //Pending because of functinality not visible
			void CAAgendaUpload() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda  -  the upload Assignment tab is clickable or not (Agenda > Upload assignment)");
				DirectorMethod.CAAgendaUpload(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 117) //Pending because of functinality not visible
			void CAAgendaUploadWF() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda  -   upload Assignment - without selecting a file");
			
				DirectorMethod.CAAgendaUploadWF(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 118) //done
			void CAStatutory() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  the Statutory radio button is clickable or not Verification .");
				
				DirectorMethod.CAStatutory(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 119)//pending
			void CAStatutorySave() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory - Assignment - To check user is able to assign statutory level compliances based on entity name to performer and reviewer");
				
				DirectorMethod.CAStatutorySave(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 120)//pending
			void CACheckStatu() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Statutory - Assignment -  Verify that a checkbox can be selected ");
				
				DirectorMethod.CACheckStatu(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 121)//pending
			void CACheckStaDeS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -   Statutory - Assignment  - Verify that a selected checkbox can be deselected ");
				
				DirectorMethod.CACheckStaDeS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 122)//pending
			void CACheckStaAll() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -   Statutory - Assignment  - To check whether the select all checkbox option working properly or not");
				
				DirectorMethod.CACheckStaAll(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 123) //18/07/2023  done
			void CAStatutoryAssigned() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -   Statutory - 'Assigned' tab is clickable or not Verification.");
				
				DirectorMethod.CAStatutoryAssigned(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 124) //done
			void CAStaAssignedExport() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  'Assigned' tab - Export");
				DirectorMethod.CAStaAssignedExport(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		   @Test(priority = 125) //done
			void CAStareassignment() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  the reassignment tab is clickable or not (Statutory > Re-assignment)");
				DirectorMethod.CAStareassignment(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 126) //pending because data not loaded
			void CAStaRS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  re-assignment ");
			
				DirectorMethod.CAStaRS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 127)//pending because data not loaded
			void CACheckStaRS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Statutory -  Verify that a checkbox can be selected (Statutory> Re-assignment)");
				
				DirectorMethod.CACheckStaRS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 128)//pending because data not loaded
			void CACheckStaRSDeS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Statutory - Verify that a selected checkbox can be deselected (Statutory> Re- Assignment)");
				
				DirectorMethod.CACheckStaRSDeS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 129) //pending because data not loaded
			void CACheckStaRSDeSAll() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  - Statutory - To check whether the select all checkbox option working properly or not (Statutory> Re-Assignment)");
				
				DirectorMethod.CACheckStaRSDeSAll(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 130) //done
			void CAStaExclude() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  Exclude assignment tab is clickable or not (Statutory > Exclude Assignment)");
				DirectorMethod.CAStaExclude(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 131) //done
			void CAStaExcludeA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  Exclude assignment ");
			
				DirectorMethod.CAStaExcludeA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 132) //done
			void CAStaExcludeAFilter() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  Exclude assignment - To check whether the compliance ID/Compliance filter fuctionality is working or not by search option ");
			
				DirectorMethod.CAStaExcludeAFilter(driver,test);
			
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 133)//done
			void CAEACheckStatu() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  - Statutory -  Verify that a checkbox can be selected (statutory> Exclude Assignment)");
				
				DirectorMethod.CAEACheckStatu(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 134)//done
			void CAEACheckStaDe() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Statutory - Verify that a selected checkbox can be deselected (statutory> Exclude Assignment)");
				
				DirectorMethod.CAEACheckStaDe(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 135) //19/07/2023   done
			void NotesClick() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  Notes tab is clickable or not Verification .");
			
				DirectorMethod.NotesClick(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 136) //done
			void NotesA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  Notes - Verify the functionality of the Applicable radio button");
			
				DirectorMethod.NotesA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 137) //done
			void NotesNA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  Notes - Verify the functionality of the not Applicable radio button");
			
				DirectorMethod.NotesNA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 138) //done
			void NotesText() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  Notes - To check whether user is able to write notes ");
			
				DirectorMethod.NotesText(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			//-----------------------------------
			
			@Test(priority = 139) //done
			void UserEntityAssignmentMaster() throws InterruptedException, IOException
			{
				test = extent.startTest("User-Entity Assignment- Add New");
				
				MasterMethod.UserEntityAssignmentMaster(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 140)//done
			void UEAMUpdate() throws InterruptedException, IOException
			{
				test = extent.startTest("User-Entity Assignment- Edit");
				
				MasterMethod.UEAMUpdate(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 141)//done
			void UEAMassignment() throws InterruptedException, IOException
			{
				test = extent.startTest("User-Entity Assignment- Assignment");
				
				MasterMethod.UEAMassignment(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}

			@Test(priority = 142)//done
			void UEADelete() throws InterruptedException, IOException
			{
				test = extent.startTest("User-Entity Assignment- Delete");
				
				MasterMethod.UEADelete(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 143)//done

			void UserMaster() throws InterruptedException, IOException
			{
				test = extent.startTest(" Add -User Master  Verification");
				
				UserMasterMethod.AddUser(driver, test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 144)//done

			void UpdateUser() throws InterruptedException, IOException
			{
				test = extent.startTest(" Update -User Master  Verification");
				
				UserMasterMethod.UpdateUser(driver, test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}

			@Test(priority = 145)//done

			void FilterUserMaster() throws InterruptedException, IOException
			{
				test = extent.startTest(" Search Filter Work or not  -User Master  Verification");
				
				UserMasterMethod.FilterUser(driver, test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}	
			
			@Test(priority = 146)//done

			void WithoutEnteringDataUser() throws InterruptedException, IOException
			{
				test = extent.startTest("Without Entering Data -User Master  Verification");
				
				UserMasterMethod.WithoutEnteringDataUser(driver, test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}		
			
			@Test(priority = 147)//done

			void EnterInvalidDataUser() throws InterruptedException, IOException
			{
				test = extent.startTest("Enter Invalid Data  -User Master  Verification");
				
				UserMasterMethod.EnterInvalidDataUser(driver, test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}		
			
			@Test(priority = 148)//done

			void EnterValidDataUser() throws InterruptedException, IOException
			{
				test = extent.startTest("Enter Valid Data -User Master  Verification");
				
				UserMasterMethod.EnterValidDataUser(driver, test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}		
			
//---------------------------My Workspace - My compliance and my task
			
			@Test(priority=149)//done

			  void ClickMyCompliance() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Compliance tab Verification");
				
				MyWorkspaceMethod.ClickMyCompliance(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority=150)//done

			  void ClickMyComplianceEditBtn() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Compliance tab -Edit Icon Verification");
				
				MyWorkspaceMethod.ClickMyComplianceEditBtn(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority=151)//done

			  void MyCompliances() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Compliance tab - Update compliance status Verification");
				
				MyWorkspaceMethod.MyCompliances(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority=152)//done  --

			  void MyCompliancesdownload() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Compliance tab - Update compliance status Verification");
				
				MyWorkspaceMethod.MyCompliances(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority=153)//done --

			  void MyCompliancesview() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Compliance tab - Update compliance status Verification");
				
				MyWorkspaceMethod.MyCompliances(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority=154)//done --

			  void MyCompliancesdownloads() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Compliance tab - Update compliance status Verification");
				
				MyWorkspaceMethod.MyCompliances(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority=155)//done

			  void ClickMyTask() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab Verification");
				
				MyWorkspaceMethod.ClickMyTask(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority=156)//pending

			  void AddTask() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Add Task -Meeting Type Verification");
				
				MyWorkspaceMethod.AddMyTaskMetting(driver, test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority=157)

			  void AddMyTaskAgenda() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Add Task- Agenda Type Verification");
				
				MyWorkspaceMethod.AddMyTaskAgenda(driver, test,workbook,sheet);
				
				extent.endTest(test);
				extent.flush();
			}
			//@Test(priority=158)

			  void AddMyTaskOther() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Add Task- Other Type Verification");
				
				MyWorkspaceMethod.AddMyTaskOther(driver, test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			//@Test(priority=159)

			  void WithoutEnterDataTask() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Add Task-Without Enter Data Verification");
				
				MyWorkspaceMethod.WithoutEnterDataTask(driver, test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			//@Test(priority=160)

			  void AddMyTaskCloseBtn() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Add Task-close button Verification");
				
				MyWorkspaceMethod.AddMyTaskCloseBtn(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			//@Test(priority=161)

			  void EditBtn() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Edit button Verification");
				
				MyWorkspaceMethod.EditBtn(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			//@Test(priority=162)

			  void TaskViewDeatiles() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Task View Detailes Tab Verification");
				
				MyWorkspaceMethod.TaskViewDeatiles(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			//@Test(priority=163)

			  void EditTask() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Edit Task Verification");
				
				MyWorkspaceMethod.EditTask(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			//@Test(priority=164)

			  void EditTaskWithoutEnterData() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Without Enter data edit task Verification");
				
				MyWorkspaceMethod.EditTaskWithoutEnterData(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			//@Test(priority=165)

			  void DownloadDocument() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Download Document Verification");
				
				MyWorkspaceMethod.DownloadDocument(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			//@Test(priority=166)

			  void closeBtnEditTask() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Close button Verification");
				
				MyWorkspaceMethod.CloseBtn(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			//@Test(priority=167)

			  void DeleteBtn() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Delete button -'Yes' button Verification");
				
				MyWorkspaceMethod.DeleteBtn(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			//@Test(priority=168)

			  void DeleteBtnNo() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- My Task tab - Delete button -'No'button Verification");
				
				MyWorkspaceMethod.DeleteBtnNo(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			  @Test(priority=169)//done

			  void MeetingCalender() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- Meeting Calender tab Verification");
				
				MyWorkspaceMethod.MeetingCalender(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority=170)//d

			  void AddMeetingCalender() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- Meeting Calender tab -Add Meeting Calender tab Verification");
				
				MyWorkspaceMethod.AddMeetingCalender(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority=171)//d

			  void MeetingCalenderWithoutEnterData() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- Meeting Calender tab -New button -Without Enter Data Verification");
				
				MyWorkspaceMethod.MeetingCalenderWithoutEnterData(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority=172)//d

			  void ClearBtn() throws InterruptedException, IOException
			  {
				test = extent.startTest("My Workspace- Meeting Calender tab -Clear button Verification");
				
				MyWorkspaceMethod.ClearBtn(driver, test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			
			
	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(1000);
  		driver.close();
  	}	       
  		       		
 	@AfterTest
  	void Closing() throws InterruptedException
  	{
  		
  	}
}
