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
	
//	@Test(priority = 23) 
	void ExportDD() throws InterruptedException, IOException
	{
		test = extent.startTest(" 'My Reports > Director Details' :- To check whether the 'Export to Excel' functionality is working or not");
		
		MyReportsMethods.ExportDD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 24) 
	void WordDocDD() throws InterruptedException, IOException
	{
		test = extent.startTest(" 'My Reports > Director Details' :-To check whether the user is able to 'Generate Word' document or not");
		
		MyReportsMethods.WordDocDD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 25) 
	void WordDocDDVal() throws InterruptedException, IOException
	{
		test = extent.startTest(" 'My Reports > Director Details' :-Verify that the validation message is displayed when we click on 'Generate' button without selecting data");
		
		MyReportsMethods.WordDocDDVal(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 26) 
		void BankDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > Bank Details' tab is clickable or not");
			
			MyReportsMethods.BankDetails(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 27) 
		void CompanyAllClickBD() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Bank Details' :- To check whether the compliance 'Company - All' dropdown is Clickable or not");
			
			MyReportsMethods.CompanyAllClickBD(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		//@Test(priority = 28) 
		void ExportBD() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Bank Details' :- To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportBD(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 29) 
		void DIR3KYCDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > DIR-3 KYC Details' tab is clickable or not");
			
			MyReportsMethods.DIR3KYCDetails(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 30) 
		void StatusAllClickKYC() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the Select-All dropdown is clickable or not");
			
			MyReportsMethods.StatusAllClickKYC(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 31) 
		void FYClickKYC() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the Financial Year-All dropdown is working or not");
			
			MyReportsMethods.FYClickKYC(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 32) 
		void ExportKYC() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportKYC(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 33) 
		void AddNew() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the 'New' button is clickable or not");
			
			MyReportsMethods.AddNew(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 34) 
		void AddNewData() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the user is able to add new DIR-3 KYC details or not");
			
			MyReportsMethods.AddNewData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 35) 
		void AddNewWithOutData() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that the validation message is displayed when we click on 'Save' button without selecting data");
			
			MyReportsMethods.AddNewWithOutData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 36) 
		void AddNewDataWD() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that the validation message is displayed when we dont select director from dropdown and fill all remaining fields");
			
			MyReportsMethods.AddNewDataWD(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 37) 
		void UploadBtn() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the 'Upload' button is clickable or not");
			
			MyReportsMethods.UploadBtn(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 38) 
		void Upload() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the user is able to upload the 'DIR-3 KYC' form");
			
			MyReportsMethods.Upload(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 39) 
		void UploadWD() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that the validation message is displayed when we upload empty excel file");
			
			MyReportsMethods.UploadWD(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 40) 
		void UploadIE() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that the validation message is displayed when we upload different extension file");
			
			MyReportsMethods.UploadIE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 41) 
		void EditClick() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that clicking the 'Edit' button opens the 'DIR-3 KYC Details' editing interface.");
			
			MyReportsMethods.EditClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 42) 
		void Edit() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that the 'Edit' button allows the user to edit relevant fields in the 'DIR-3 KYC Details' section.");
			
			MyReportsMethods.Edit(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 43) 
		void AnnualFilingReport() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > Annual Filling Report' tab is clickable or not");
			
			MyReportsMethods.AnnualFilingReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 44) 
		void ExportAFR() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Annual Filling Report' :- To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportAFR(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 45) 
		void DPT3StatusReport() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > DPT-3 Status Report' tab is clickable or not");
			
			MyReportsMethods.DPT3StatusReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 46) 
		void ExportDPT() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportDPT(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 47) 
		void AddNewDPT() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - To check whether the user is able to add new DPT-3 Status details or not");
			
			MyReportsMethods.AddNewDPT(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 48) 
		void DPT3StatusUpload() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - To check whether the 'Upload' button is clickable or not");
			
			MyReportsMethods.DPT3StatusUpload(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 49) 
		void UploadDPT() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - To check whether the user is able to upload the ' DPT-3  Details' form");
			
			MyReportsMethods.UploadDPT(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 50) 
		void UploadDPTE() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - Verify that the validation message is displayed when we upload empty excel file");
			
			MyReportsMethods.UploadDPTE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 51) 
		void UploadDptIE() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - Verify that the validation message is displayed when we upload different extension file");
			
			MyReportsMethods.UploadDptIE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 52) 
		void EditDPTClick() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - Verify that clicking the 'Edit' button opens the 'DPT-3 Details' editing interface.");
			
			MyReportsMethods.EditDPTClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 53) 
		void EditDPT() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - Verify that the 'Edit' button allows the user to edit relevant fields in the 'DPT-3 Details' section");
			
			MyReportsMethods.EditDPT(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 54) 
		void MSMEReport() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > MSME Report' tab is clickable or not");
			
			MyReportsMethods.MSMEReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 55) 
		void ExportMSME() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportMSME(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 56) 
		void AddNewMSME() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- To check whether the user is able to add new MSME data or not");
			
			MyReportsMethods.AddNewMSME(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 57) 
		void MSMEUpload() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- To check whether the 'Upload' button is clickable or not");
			
			MyReportsMethods.MSMEUpload(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 58) 
		void UploadMSME() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- To check whether the user is able to upload the 'MSME' form");
			
			MyReportsMethods.UploadMSME(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 59) 
		void UploadMSMEE() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- Verify that the validation message is displayed when we upload empty excel file");
			
			MyReportsMethods.UploadMSMEE(driver,test);
			
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
