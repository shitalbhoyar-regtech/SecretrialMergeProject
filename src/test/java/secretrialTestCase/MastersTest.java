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
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import secretrial.MasterMethod;

public class MastersTest {
	
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
		//String workingDir = System.getProperty("user.dir");
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
		
		
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);					//Method of Login class to set browser.
		
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 1)

	void Login() throws InterruptedException, IOException
	{
	
		test = extent.startTest("Secreterial Logging In - Company Secretory");
		

		XSSFSheet sheet = ReadExcel();
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		
		driver = login.Login.UserLogin(uname,password,"Compnay Secretory");		//Method of Login class to login user.
		
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 2)
	void PageAuthoriation() throws InterruptedException, IOException
	{
		test = extent.startTest("Page Authoriation -Company Secretary Role ");
		
		MasterMethod.PageAuthoriation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 3)
	void DirectorRole() throws InterruptedException, IOException
	{
		test = extent.startTest("Page Authoriation -Director Role ");
		
		MasterMethod.PageAuthoriationDirector(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 4)
	void ManagementRole() throws InterruptedException, IOException
	{
		test = extent.startTest("Page Authoriation -Management Role ");
		
		MasterMethod.PageAuthoriationManagement(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 5)
	void PageAuthoriationCheck() throws InterruptedException, IOException
	{
		test = extent.startTest("Page Authoriation -view,add,edit delete -check or uncheck ");
		
		MasterMethod.PageAuthoriationCheck(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
//	@Test(priority = 5)
	void UserEntityAssignmentMaster() throws InterruptedException, IOException
	{
		test = extent.startTest("User-Entity Assignment- Add New");
		
		MasterMethod.UserEntityAssignmentMaster(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 6)
	void UEAMUpdate() throws InterruptedException, IOException
	{
		test = extent.startTest("User-Entity Assignment- Edit");
		
		MasterMethod.UEAMUpdate(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 7)
	void UEAMassignment() throws InterruptedException, IOException
	{
		test = extent.startTest("User-Entity Assignment- Assignment");
		
		MasterMethod.UEAMassignment(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}

//	@Test(priority = 8)
	void UEADelete() throws InterruptedException, IOException
	{
		test = extent.startTest("User-Entity Assignment- Delete");
		
		MasterMethod.UEADelete(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 9)
	void Notes() throws InterruptedException, IOException
	{
		test = extent.startTest("Notes");
		
		MasterMethod.Notes(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}

}
