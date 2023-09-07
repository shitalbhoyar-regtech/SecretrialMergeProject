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

import secretrial.MyReportsMethods;

public class MyReportsTest {

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
		
		fis = new FileInputStream("D:\\AvaSec26\\Avsec26July2023\\Secretarial-Project-26JULY23\\TestData\\Scretrial.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\AvaSec26\\Avsec26July2023\\Secretarial-Project-26JULY23\\Report\\Secretrial.html",true);
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
	
//	@Test(priority = 1) 
	void ReportsClick() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Report' tab is clickable or not  ");
		
		MyReportsMethods.ReportsClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 2) 
	void ComplianceStatusReport() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Reports > Compliance Status Report' tab is clickable or not");
		
		MyReportsMethods.ComplianceStatusReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 3) 
	void ComplianceStatusReportTypeAll() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the Type-All dropdown is working or not");
		
		MyReportsMethods.ComplianceStatusReportTypeAll(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 4) 
	void StatusAll() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the compliance 'Status-All' dropdown is working or not");
		
		MyReportsMethods.StatusAll(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 5) 
	void StatusAllFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Verify that the user can able to select a specific compliance status option from 'Status-All' dropdown");
		
		MyReportsMethods.StatusAllFilter(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 6) 
	void ClearFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Verify that the 'Clear Filter' option clears all applied filters");
		
		MyReportsMethods.ClearFilter(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 7) 
	void ExportCSR() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'Export to Excel' functionality is working or not");
		
		MyReportsMethods.ExportCSR(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 8) 
	void AttendanceReport() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Reports > Attendance Report' tab is clickable or not");
		
		MyReportsMethods.AttendanceReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 9) 
	void FinancialYearAllClick() throws InterruptedException, IOException
	{
		test = extent.startTest("'My Reports > Attendance Report':- To check whether the compliance 'Financial Year-All' dropdown is Clickable or not");
		
		MyReportsMethods.FinancialYearAllClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 10) 
	void FinancialYearAllFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("'My Reports > Attendance Report':- Verify that the user can able to select a specific financial year option from 'Financial year-All' dropdown");
		
		MyReportsMethods.FinancialYearAllFilter(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 11) 
	void CompanyAllClick() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':- To check whether the compliance 'Company - All' dropdown is Clickable or not");
		
		MyReportsMethods.CompanyAllClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	

//	@Test(priority = 12) 
	void CompanyAllFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':- Verify that the user can able to select a specific company name option from 'Company - All' dropdown");
		
		MyReportsMethods.CompanyAllFilter(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 13) 
	void ExportAR() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':- To check whether the 'Export to Excel' functionality is working or not");
		
		MyReportsMethods.ExportAR(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 14) 
	void AllFilters() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':- Verify whether the 'financial Year - All' and 'Company - All' dropdowns are working together.");
		
		MyReportsMethods.AllFilters(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 15) 
	void ViewAR() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':- Verify that the 'View' functionality is working or not");
		
		MyReportsMethods.ViewAR(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 16) 
	void ViewARDownload() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':-To check whether the 'Download' functionality is working or not which is present under 'View' option");
		
		MyReportsMethods.ViewARDownload(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 17) 
	void ARDownload() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':-To check whether the 'Download' functionality is working or not which is present under Action column");
		
		MyReportsMethods.ARDownload(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 18) 
	void AuditorDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Reports > Auditor Details' tab is clickable or not");
		
		MyReportsMethods.AuditorDetails(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 19) 
	void CompanyAllClickAD() throws InterruptedException, IOException
	{
		test = extent.startTest("'My Reports > Auditor Details' :- To check whether the compliance 'Company - All' dropdown is Clickable or not");
		
		MyReportsMethods.CompanyAllClickAD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 20) 
	void ExportAD() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Reports > Auditor Details' :- To check whether the 'Export to Excel' functionality is working or not");
		
		MyReportsMethods.ExportAD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 21) 
	void DirectorDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Reports > Director  Details' tab is clickable or not");
		
		MyReportsMethods.DirectorDetails(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 22) 
	void CompanyAllClickDD() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Director Details':- To check whether the compliance 'Company - All' dropdown is Clickable or not");
		
		MyReportsMethods.CompanyAllClickDD(driver,test);
		
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
