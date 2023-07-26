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

import secretrial.DirectorMethod;

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
		
		fis = new FileInputStream("C:\\Users\\Mayuri\\Desktop\\AvaSec\\Secretarial-Project\\TestData\\Scretrial.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("C:\\Users\\Mayuri\\Desktop\\AvaSec\\Secretarial-Project\\Report\\Secretrial.html",true);
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
	
//	@Test(priority = 1) //20/06/2023
	void DirectorClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - clickable or not Verification  ");
		
		DirectorMethod.DirectorClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 2) 
	void DirectorAddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - Add New - With Valid Data  ");
		
		DirectorMethod.DirectorAddNew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 3) 
	void DirectorAddNewAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - Add New - With already exists Data  ");
		
		DirectorMethod.DirectorAddNewAE(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 4) 
	void DirectorAddNewClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master - Add New - Close ");
		
		DirectorMethod.DirectorAddNewClose(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 5) 
	void DirectorEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - With Valid Data ");
		
		DirectorMethod.DirectorEdit(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 6) 
	void DirectorEditBlank() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - Leave one or more required fields blank ");
		
		DirectorMethod.DirectorEditBlank(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 7) 
	void DirectorEditClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - Close ");
		
		DirectorMethod.DirectorEditClose(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 8) 
	void DirectorLOR() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' option is clickable or not");
		
		DirectorMethod.DirectorLOR(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	//@Test(priority = 9) //28/06/2023
	void DirectorLORAddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -HUF - with valid data");
		
		DirectorMethod.DirectorLORAddNew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 10) 
	void DirectorLORAddNewAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- HUF - with the same details as an existing entry");
		
		DirectorMethod.DirectorLORAddNewAE(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 11) 
	void DirectorLORAddNewEmpty() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -HUF - without entering data");
		
		DirectorMethod.DirectorLORAddNewEmpty(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 12) 
	void DirectorLORAddNewClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- HUF -'Close' button is clickable or Not verification.");
		
		DirectorMethod.DirectorLORAddNewClose(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 13) 
	void DirectorLORAddNewSpo() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Spouse - with valid data");
		
		DirectorMethod.DirectorLORAddNewSpo(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 14) 
	void DirectorLORAddNewSpoAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Spouse - with the same details as an existing entry");
		
		DirectorMethod.DirectorLORAddNewSpoAE(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 15) 
		void DirectorLORAddNewSpoEmpty() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Spouse - without entering data");
			
			DirectorMethod.DirectorLORAddNewSpoEmpty(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
//		@Test(priority = 16) 
		void DirectorLORAddNewCloseSpo() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Spouse -'Close' button is clickable or Not verification.");
			
			DirectorMethod.DirectorLORAddNewCloseSpo(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
	//	@Test(priority = 17) 
		void DirectorLORAddNewFather() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Father - with valid data");
			
			DirectorMethod.DirectorLORAddNewFather(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 18) 
		void DirectorLORAddNewFatherAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Father - with the same details as an existing entry");
			
			DirectorMethod.DirectorLORAddNewFatherAE(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	
	//	@Test(priority = 19) 
		void DirectorLORAddNewFathEmpty() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Father - without entering data");
			
			DirectorMethod.DirectorLORAddNewFathEmpty(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 20) 
		void DirectorLORAddNewCloseFath() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Father -'Close' button is clickable or Not verification.");
			
			DirectorMethod.DirectorLORAddNewCloseFath(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	
	//	@Test(priority = 21) 
		void DirectorLORAddNewMother() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Mother - with valid data");
			
			DirectorMethod.DirectorLORAddNewMother(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 22) 
		void DirectorLORAddNewMotherAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Mother - with the same details as an existing entry");
			
			DirectorMethod.DirectorLORAddNewMotherAE(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 23) 
		void DirectorLORAddNewMothEmpty() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Mother - without entering data");
			
			DirectorMethod.DirectorLORAddNewMothEmpty(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 24) 
		void DirectorLORAddNewCloseMoth() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Mother -'Close' button is clickable or Not verification.");
			
			DirectorMethod.DirectorLORAddNewCloseMoth(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 25) 
		void DirectorLORAddNewSon() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Son - with valid data");
			
			DirectorMethod.DirectorLORAddNewSon(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 26) 
		void DirectorLORAddNewSonAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Son - with the same details as an existing entry");
			
			DirectorMethod.DirectorLORAddNewSonAE(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		//@Test(priority = 27) 
			void DirectorLORAddNewEmptySon() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Son - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptySon(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 28) 
			void DirectorLORAddNewCloseSon() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Son -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseSon(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 29) //29/06/2023
			void DirectorLORAddNewDaughter() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Daughter - with valid data");
				
				DirectorMethod.DirectorLORAddNewDaughter(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
		
		//	@Test(priority = 30) 
			void DirectorLORAddNewDaughterAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Daughter - with the same details as an existing entry");
				
				DirectorMethod.DirectorLORAddNewDaughterAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 31) 
			void DirectorLORAddNewEmptyDaughter() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Son - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptyDaughter(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 32) 
			void DirectorLORAddNewCloseDaughter() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Son -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseDaughter(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 33) 
			void DirectorLORAddNewBrother() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Brother - with valid data");
				
				DirectorMethod.DirectorLORAddNewBrother(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
		
		//	@Test(priority = 34) 
			void DirectorLORAddNewBrotherAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Brother - with the same details as an existing entry");
				
				DirectorMethod.DirectorLORAddNewBrotherAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
	//		@Test(priority = 35) 
			void DirectorLORAddNewEmptyBrother() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Brother - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptyBrother(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 36) 
			void DirectorLORAddNewCloseBrother() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Brother -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseBrother(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 37) 
			void DirectorLORAddNewSister() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Sister - with valid data");
				
				DirectorMethod.DirectorLORAddNewSister(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
		
		//	@Test(priority = 38) 
			void DirectorLORAddNewSisterAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Sister - with the same details as an existing entry");
				
				DirectorMethod.DirectorLORAddNewSisterAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 39) 
			void DirectorLORAddNewEmptySister() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New -Sister - without entering data");
				
				DirectorMethod.DirectorLORAddNewEmptySister(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 40) 
			void DirectorLORAddNewCloseSister() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' -Add New- Sister -'Close' button is clickable or Not verification.");
				
				DirectorMethod.DirectorLORAddNewCloseSister(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 41) 
			void DirectorLOREdit() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Edit - with valid data");
				
				DirectorMethod.DirectorLOREdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 42) 
			void DirectorLOREditClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Edit - Close");
				
				DirectorMethod.DirectorLOREditClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 43) 
			void DirectorLORDelete() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Delete");
				
				DirectorMethod.DirectorLORDelete(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 44) 
			void DirectorLORDeleteCan() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Delete -Cancel");
				
				DirectorMethod.DirectorLORDeleteCan(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 45) 
			void DirectorLORipp() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'List of relative' - Items per page - Displayed or not Verification");
				
				DirectorMethod.DirectorLORipp(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 46)//30/06/2023 
			void DirectorDOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details Of Interest' option is clickable or not");
				
				DirectorMethod.DirectorDOI(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 47)
			void DirectorDOCP() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' option is clickable or not");
				
				DirectorMethod.DirectorDOCP(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 48)
			void DirectorDOCPAddNew() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New - With Valid Data");
				
				DirectorMethod.DirectorDOCPAddNew(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 49)
			void DirectorDOCPAddNewVal() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -without providing all the required information.");
				
				DirectorMethod.DirectorDOCPAddNewVal(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 50)
			void DirectorDOCPAddNewEmpty() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -without filling data.");
				
				DirectorMethod.DirectorDOCPAddNewEmpty(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 51)
			void DirectorDOCPAddNewAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -  with the same details as an existing entry");
				
				DirectorMethod.DirectorDOCPAddNewAE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			
		//	@Test(priority = 52)
			void DirectorDOCPAddNewClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Add New -  Close");
				
				DirectorMethod.DirectorDOCPAddNewClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 53)
			void DirectorDOCPEdit() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Edit");
				
				DirectorMethod.DirectorDOCPEdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 54)
			void DirectorDOCPEditBlank() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Edit -Leave one  required fields blank. ");
				
				DirectorMethod.DirectorDOCPEditBlank(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 55)
			void DirectorDOCPEditClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Edit - Close ");
				
				DirectorMethod.DirectorDOCPEditClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 56)
			void DirectorDOCPDelete() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Details of Committee Positions' - Delete ");
				
				DirectorMethod.DirectorDOCPDelete(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 57)
			void DirectorSD() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Security Details' option is clickable or not");
				
				DirectorMethod.DirectorSD(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 58) //03/07/2023
			void DirectorSDEdit() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Security Details' - Edit- with Valid Data");
				
				DirectorMethod.DirectorSDEdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 59) 
			void DirectorSDclose() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Security Details' - Edit- Close");
				
				DirectorMethod.DirectorSDclose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 60)
			void DirectorProfile() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Profile' option is clickable or not");
				
				DirectorMethod.DirectorProfile(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 61)
			void DirectorProfileAdd() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'Profile' - Add");
				
				DirectorMethod.DirectorProfileAdd(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 62)
			void DirectorDIR8() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -Edit - 'DIR-8' option is clickable or not");
				
				DirectorMethod.DirectorDIR8(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 63) //05/07/2023
			void DirectorDIR8Preview() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master  - 'DIR-8' - Preview - with Valid data");
				
				DirectorMethod.DirectorDIR8Preview(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 64) 
			void DirectorDIR8DownLoad() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master  - 'DIR-8' -  Download");
				
				DirectorMethod.DirectorDIR8DownLoad(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 65)
			void DirectorMBP() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master  - 'MBP-1' option is clickable or not");
				
				DirectorMethod.DirectorMBP(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 66)
			void DirectorMBPPreview() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - 'MBP-1' - Preview - with Valid data");
				
				DirectorMethod.DirectorMBPPreview(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 67)
			void DirectorMBPDwonload() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - 'MBP-1' - Download");
				
				DirectorMethod.DirectorMBPDwonload(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			//@Test(priority = 68)
			void DirectorView() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - View");
				
				DirectorMethod.DirectorView(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 69)
			void DirectorViewAbout() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - View - About' tab is clickable or not Verification.");
				
				DirectorMethod.DirectorViewAbout(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
			//@Test(priority = 70)
			void DirectorViewDOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - View -'Details of Interest' tab is clickable or not Verification.");
				
				DirectorMethod.DirectorViewDOI(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 71)
			void DirectorViewCP() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - View -'Committe Position' tab is clickable or not Verification.");
				
				DirectorMethod.DirectorViewCP(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 72)
			void DirectorDelete() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Delete");
				
				DirectorMethod.DirectorDelete(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 73)
			void DirectorDeleteCan() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Delete - Cancel");
				
				DirectorMethod.DirectorDeleteCan(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 74) //06/07/2023
			void DirectorSearch() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Search");
				
				DirectorMethod.DirectorSearch(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 75)
			void DirectorUpload() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload tab is clickable or not Verification");
				
				DirectorMethod.DirectorUpload(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 76)
			void DirectorUploadInvalid() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - DIR-3 KYC - with invalid File type extension.");
				
				DirectorMethod.DirectorUploadInvalid(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 77)
			void DirectorUploadExcel() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with valid data");
				
				DirectorMethod.DirectorUploadExcel(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 78) //10/07/2023
			void DirectorUploadExcelInvalid() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid DIN number.(Less than 8 digits)");
				
				DirectorMethod.DirectorUploadExcelInvalid(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 79) 
			void DirectorUploadExcelInvalidMore() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid DIN number.(More than 8 digits)");
				
				DirectorMethod.DirectorUploadExcelInvalidMore(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 80) 
			void DirectorUploadExcelInvalidAlpha() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid DIN number.(Entering Alphabet)");
				
				DirectorMethod.DirectorUploadExcelInvalidAlpha(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 81) 
			void DirectorUploadExcelInvalidSpe() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid DIN number.(Special charecter in the field of DIN number )");
				
				DirectorMethod.DirectorUploadExcelInvalidSpe(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 82) 
			void DirectorUploadExcelInvalidPan() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid - Enter PAN number with less than 10 characters");
				
				DirectorMethod.DirectorUploadExcelInvalidPan(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 83) 
			void DirectorUploadExcelInvalidPanM() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid - Enter PAN number with More than 10 characters");
				
				DirectorMethod.DirectorUploadExcelInvalidPanM(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 84) 
			void DirectorUploadExcelInvalidPanSpe() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid - Enter PAN number with special characters ");
				
				DirectorMethod.DirectorUploadExcelInvalidPanSpe(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 85) 
			void DirectorUploadExcelInvalidMbl() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid - Enter Invalid mobile number ");
				
				DirectorMethod.DirectorUploadExcelInvalidMbl(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
	//		@Test(priority = 86) 
			void DirectorUploadExcelEmpty() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Invalid - with Empty data ");
				
				DirectorMethod.DirectorUploadExcelEmpty(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 87) 
			void DirectorUploadExcelinEx() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with invalid file type extension ");
				
				DirectorMethod.DirectorUploadExcelinEx(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 88)
			void DirectorUploadExcelAE() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  upload - Excel - with Existing data");
				
				DirectorMethod.DirectorUploadExcel(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 89)//13/07/2023
			void complianceassignment() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment");
				
				DirectorMethod.complianceassignment(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 90)
			void complianceassignmentMR() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - the meeting radio button is clickable or not");
				
				DirectorMethod.complianceassignmentMR(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 91)
			void complianceassignmentAssign() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  compliance assign to particular performer and reviewer");
				
				DirectorMethod.complianceassignmentAssign(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 92)
			void complianceassignmentCheck() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting - Assignment - Verify that a checkbox can be selected");
				
				DirectorMethod.complianceassignmentCheck(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 93)
			void complianceassignmentDeCheck() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting - Assignment - Verify that a checkbox can be deselected ");
				
				DirectorMethod.complianceassignmentDeCheck(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 94)
			void complianceassignmentDeCheckAll() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting - Assignment - all checkbox option working properly or not ");
				
				DirectorMethod.complianceassignmentDeCheckAll(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 95)
			void complianceassignmentSearch() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting - Assignment - The compliance ID/Compliance filter fuctionality is working or not by search option ");
				
				DirectorMethod.complianceassignmentSearch(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 96) //14/07/2023
			void complianceassignmentA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting  -  'Assigned' tab is clickable or not verification");
				
				DirectorMethod.complianceassignmentA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 97) 
			void CAAssignedExport() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting  -  'Assigned' tab - Export");
				DirectorMethod.CAAssignedExport(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 98)
			void complianceassignmentRA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting  -  'Re-Assignment' tab is clickable or not verification");
				
				DirectorMethod.complianceassignmentRA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 99)
			void complianceassignmentRAS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting  -  'Re-Assignment'  ");
				
				DirectorMethod.complianceassignmentRAS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 100)
			void complianceassignmentCheckRA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting - Re-Assignment - Verify that a checkbox can be selected(Meeting> Re-assignment)");
				
				DirectorMethod.complianceassignmentCheckRA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
	
		//	@Test(priority = 101)
			void complianceassignmentDeCheckRA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting -Re- Assignment - Verify that a checkbox can be deselected (Meeting> Re-assignment)");
				
				DirectorMethod.complianceassignmentDeCheckRA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 102)
			void complianceassignmentDeCheckRAAll() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment - Meeting -Re- Assignment - Verify all checkbox option working properly or not (Meeting> Re-assignment)");
				
				DirectorMethod.complianceassignmentDeCheckRAAll(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 103)
			void complianceassignmentAgen() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment   - The Agenda radio button is clickable or not verification");
				
				DirectorMethod.complianceassignmentAgen(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 104)
			void complianceassignmentAgenSave() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda - Assignment - To check user is able to assign Agenda level compliances based on entity name to performer and reviewer");
				
				DirectorMethod.complianceassignmentAgenSave(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 105)
			void complianceassignmentCheckAge() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Agenda -  Verify that a checkbox can be selected (Agenda> Assignment)");
				
				DirectorMethod.complianceassignmentCheckAge(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 106)
			void complianceassignmentDeCheckgenA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Agenda - Verify that a selected checkbox can be deselected (Agenda> Assignment)");
				
				DirectorMethod.complianceassignmentDeCheckgenA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 107)
			void complianceassignmentDeCheckAllAgen() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  - Agenda - To check whether the select all checkbox option working properly or not (Agenda> Assignment)");
				
				DirectorMethod.complianceassignmentDeCheckAllAgen(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 108)
			void complianceassignmentAgenSearch() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  - Agenda - To check whether the Meeting filter fuctionality is working or not (Agenda > Assignment)");
				
				DirectorMethod.complianceassignmentAgenSearch(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 109)  //17/07/2023
			void CAAgendaAssigned() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment   -  Agenda - Assigned' tab is clickable or not");
				
				DirectorMethod.CAAgendaAssigned(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 110) 
			void CAAgenAssignedExport() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda  -  'Assigned' tab - Export");
				DirectorMethod.CAAgenAssignedExport(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 111) 
			void CAAgendareassignment() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda  -  the reassignment tab is clickable or not (Agenda > Re-assignment)");
				DirectorMethod.CAAgendareassignment(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 112) 
			void CAAgendaRS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda  -  re-assignment ");
			
				DirectorMethod.CAAgendaRS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 113)
			void CACheckAgeRS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Agenda -  Verify that a checkbox can be selected (Agenda> Re-assignment)");
				
				DirectorMethod.CACheckAgeRS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 114)
			void CACheckAgeRSDeS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Agenda - Verify that a selected checkbox can be deselected (Agenda> Re- Assignment)");
				
				DirectorMethod.CACheckAgeRSDeS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 115)
			void CACheckAgeRSDeSAll() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  - Agenda - To check whether the select all checkbox option working properly or not (Agenda> Re-Assignment)");
				
				DirectorMethod.CACheckAgeRSDeSAll(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 116) 
			void CAAgendaUpload() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda  -  the upload Assignment tab is clickable or not (Agenda > Upload assignment)");
				DirectorMethod.CAAgendaUpload(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 117) 
			void CAAgendaUploadWF() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Agenda  -   upload Assignment - without selecting a file");
			
				DirectorMethod.CAAgendaUploadWF(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 118) 
			void CAStatutory() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  the Statutory radio button is clickable or not Verification .");
				
				DirectorMethod.CAStatutory(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 119)
			void CAStatutorySave() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory - Assignment - To check user is able to assign statutory level compliances based on entity name to performer and reviewer");
				
				DirectorMethod.CAStatutorySave(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 120)
			void CACheckStatu() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Statutory - Assignment -  Verify that a checkbox can be selected ");
				
				DirectorMethod.CACheckStatu(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 121)
			void CACheckStaDeS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -   Statutory - Assignment  - Verify that a selected checkbox can be deselected ");
				
				DirectorMethod.CACheckStaDeS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 122)
			void CACheckStaAll() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -   Statutory - Assignment  - To check whether the select all checkbox option working properly or not");
				
				DirectorMethod.CACheckStaAll(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 123) //18/07/2023
			void CAStatutoryAssigned() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -   Statutory - 'Assigned' tab is clickable or not Verification.");
				
				DirectorMethod.CAStatutoryAssigned(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 124) 
			void CAStaAssignedExport() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  'Assigned' tab - Export");
				DirectorMethod.CAStaAssignedExport(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 125) 
			void CAStareassignment() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  the reassignment tab is clickable or not (Statutory > Re-assignment)");
				DirectorMethod.CAStareassignment(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 126) 
			void CAStaRS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  re-assignment ");
			
				DirectorMethod.CAStaRS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 127)
			void CACheckStaRS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Statutory -  Verify that a checkbox can be selected (Statutory> Re-assignment)");
				
				DirectorMethod.CACheckStaRS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 128)
			void CACheckStaRSDeS() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Statutory - Verify that a selected checkbox can be deselected (Statutory> Re- Assignment)");
				
				DirectorMethod.CACheckStaRSDeS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 129)
			void CACheckStaRSDeSAll() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  - Statutory - To check whether the select all checkbox option working properly or not (Statutory> Re-Assignment)");
				
				DirectorMethod.CACheckStaRSDeSAll(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 130) 
			void CAStaExclude() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  Exclude assignment tab is clickable or not (Statutory > Exclude Assignment)");
				DirectorMethod.CAStaExclude(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 131) 
			void CAStaExcludeA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  Exclude assignment ");
			
				DirectorMethod.CAStaExcludeA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 132) 
			void CAStaExcludeAFilter() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment -  Statutory  -  Exclude assignment - To check whether the compliance ID/Compliance filter fuctionality is working or not by search option ");
			
				DirectorMethod.CAStaExcludeAFilter(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 133)
			void CAEACheckStatu() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  - Statutory -  Verify that a checkbox can be selected (statutory> Exclude Assignment)");
				
				DirectorMethod.CAEACheckStatu(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 134)
			void CAEACheckStaDe() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master - Compliance Assignment  -  Statutory - Verify that a selected checkbox can be deselected (statutory> Exclude Assignment)");
				
				DirectorMethod.CAEACheckStaDe(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
	//		@Test(priority = 135) //19/07/2023
			void NotesClick() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  Notes tab is clickable or not Verification .");
			
				DirectorMethod.NotesClick(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 136) 
			void NotesA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  Notes - Verify the functionality of the Applicable radio button");
			
				DirectorMethod.NotesA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 137) 
			void NotesNA() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  Notes - Verify the functionality of the not Applicable radio button");
			
				DirectorMethod.NotesNA(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
		//	@Test(priority = 138) 
			void NotesText() throws InterruptedException, IOException
			{
				test = extent.startTest("Directot/KMP master -  Notes - To check whether user is able to write notes ");
			
				DirectorMethod.NotesText(driver,test);
				
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
