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
		
		fis = new FileInputStream("D:\\dotNetSecreterial\\Secretarial-Project-26JULY23\\TestData\\Scretrial.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\dotNetSecreterial\\Secretarial-Project-26JULY23\\Report\\Secretrial.html",true);
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
	
	@Test(priority = 1) 
	void ReportsClick() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Report' tab is clickable or not  ");
		
		MyReportsMethods.ReportsClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 2) 
	void ComplianceStatusReport() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Reports > Compliance Status Report' tab is clickable or not");
		
		MyReportsMethods.ComplianceStatusReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 3) 
	void ComplianceStatusReportTypeAll() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the Type-All dropdown is working or not");
		
		MyReportsMethods.ComplianceStatusReportTypeAll(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 4) 
	void CompanyAllClickCS() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Compliance Status Report':- To check whether the compliance 'Company - All' dropdown is Clickable or not");
		
		MyReportsMethods.CompanyAllClickCS(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	

	@Test(priority = 5) 
	void CompanyAllFilterCS() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Compliance Status Report':- Verify that the user can able to select a specific company name option from 'Company - All' dropdown");
		
		MyReportsMethods.CompanyAllFilterCS(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 6) 
	void StatusAll() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the compliance 'Status-All' dropdown is working or not");
		
		MyReportsMethods.StatusAll(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 7) 
	void StatusAllFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Verify that the user can able to select a specific compliance status option from 'Status-All' dropdown");
		
		MyReportsMethods.StatusAllFilter(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 8) //Test Case not available
	void ClearFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Verify that the 'Clear Filter' option clears all applied filters");
		
		MyReportsMethods.ClearFilter(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 9) 
	void ExportCSR() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'Export to Excel' functionality is working or not");
		
		MyReportsMethods.ExportCSR(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 10) 
	void AttendanceReport() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Reports > Attendance Report' tab is clickable or not");
		
		MyReportsMethods.AttendanceReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 11) 
	void FinancialYearAllClick() throws InterruptedException, IOException
	{
		test = extent.startTest("'My Reports > Attendance Report':- To check whether the compliance 'Financial Year-All' dropdown is Clickable or not");
		
		MyReportsMethods.FinancialYearAllClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
@Test(priority = 12) 
	void FinancialYearAllFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("'My Reports > Attendance Report':- Verify that the user can able to select a specific financial year option from 'Financial year-All' dropdown");
		
		MyReportsMethods.FinancialYearAllFilter(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 13) 
	void CompanyAllClick() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':- To check whether the compliance 'Company - All' dropdown is Clickable or not");
		
		MyReportsMethods.CompanyAllClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	

	@Test(priority = 14) //not run
	void CompanyAllFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':- Verify that the user can able to select a specific company name option from 'Company - All' dropdown");
		
		MyReportsMethods.CompanyAllFilter(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 15) 
	void ExportAR() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':- To check whether the 'Export to Excel' functionality is working or not");
		
		MyReportsMethods.ExportAR(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 16) //not run
	void AllFilters() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':- Verify whether the 'financial Year - All' and 'Company - All' dropdowns are working together.");
		
		MyReportsMethods.AllFilters(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 17) 
	void ViewAR() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':- Verify that the 'View' functionality is working or not");
		
		MyReportsMethods.ViewAR(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 18) 
	void ViewARDownload() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':-To check whether the 'Download' functionality is working or not which is present under 'View' option");
		
		MyReportsMethods.ViewARDownload(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 19) 
	void ARDownload() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Attendance Report':-To check whether the 'Download' functionality is working or not which is present under Action column");
		
		MyReportsMethods.ARDownload(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 20) 
	void AuditorDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Reports > Auditor Details' tab is clickable or not");
		
		MyReportsMethods.AuditorDetails(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 21) 
	void CompanyAllClickAD() throws InterruptedException, IOException
	{
		test = extent.startTest("'My Reports > Auditor Details' :- To check whether the compliance 'Company - All' dropdown is Clickable or not");
		
		MyReportsMethods.CompanyAllClickAD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 22) 
	void CompanyAllFilterAD() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Auditor Details':- Verify that the user can able to select a specific company name option from 'Company - All' dropdown");
		
		MyReportsMethods.CompanyAllFilterAD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 23) 
	void ExportAD() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Reports > Auditor Details' :- To check whether the 'Export to Excel' functionality is working or not");
		
		MyReportsMethods.ExportAD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 24) 
	void DirectorDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'My Reports > Director  Details' tab is clickable or not");
		
		MyReportsMethods.DirectorDetails(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 25) 
	void CompanyAllClickDD() throws InterruptedException, IOException
	{
		test = extent.startTest("My Reports > Director Details':- To check whether the compliance 'Company - All' dropdown is Clickable or not");
		
		MyReportsMethods.CompanyAllClickDD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	

//	@Test(priority = 26) 
	void CompanyAllFilterDD() throws InterruptedException, IOException
	{
		test = extent.startTest("'My Reports > Director Details' :- Verify that the user can able to select a specific company name option from 'Company - All' dropdown");
		
		MyReportsMethods.CompanyAllFilterDD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 27) 
	void ExportDD() throws InterruptedException, IOException
	{
		test = extent.startTest(" 'My Reports > Director Details' :- To check whether the 'Export to Excel' functionality is working or not");
		
		MyReportsMethods.ExportDD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 28) 
	void WordDocDD() throws InterruptedException, IOException
	{
		test = extent.startTest(" 'My Reports > Director Details' :-To check whether the user is able to 'Generate Word' document or not");
		
		MyReportsMethods.WordDocDD(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 29) 
	void WordDocDDVal() throws InterruptedException, IOException
	{
		test = extent.startTest(" 'My Reports > Director Details' :-Verify that the validation message is displayed when we click on 'Generate' button without selecting data");
		
		MyReportsMethods.WordDocDDVal(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 30) 
		void BankDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > Bank Details' tab is clickable or not");
			
			MyReportsMethods.BankDetails(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 31) 
		void CompanyAllClickBD() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Bank Details' :- To check whether the compliance 'Company - All' dropdown is Clickable or not");
			
			MyReportsMethods.CompanyAllClickBD(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 32) 
		void CompanyAllFilterBD() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Bank Details' :- Verify that the user can able to select a specific company name option from 'Company - All' dropdown");
			
			MyReportsMethods.CompanyAllFilterBD(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		//@Test(priority = 33) 
		void ExportBD() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Bank Details' :- To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportBD(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 34) 
		void DIR3KYCDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > DIR-3 KYC Details' tab is clickable or not");
			
			MyReportsMethods.DIR3KYCDetails(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 35) 
		void StatusAllClickKYC() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the Select-All dropdown is clickable or not");
			
			MyReportsMethods.StatusAllClickKYC(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 36) 
		void StatusAllFilterKYC() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details' :- Verify that the user can able to select a specific compliance status option from 'Status-All' dropdown");
			
			MyReportsMethods.StatusAllFilterKYC(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 37) 
		void FYClickKYC() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the Financial Year-All dropdown is working or not");
			
			MyReportsMethods.FYClickKYC(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 38) 
		void FYKYCFilter() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that the user can able to select a specific financial year option from 'Financial year-All' dropdown");
			
			MyReportsMethods.FYKYCFilter(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 39) 
		void ExportKYC() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportKYC(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 40) 
		void AddNew() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the 'New' button is clickable or not");
			
			MyReportsMethods.AddNew(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 41) 
		void AddNewData() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the user is able to add new DIR-3 KYC details or not");
			
			MyReportsMethods.AddNewData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 42) 
		void AddNewWithOutData() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that the validation message is displayed when we click on 'Save' button without selecting data");
			
			MyReportsMethods.AddNewWithOutData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 43) 
		void AddNewDataWD() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that the validation message is displayed when we dont select director from dropdown and fill all remaining fields");
			
			MyReportsMethods.AddNewDataWD(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 44) 
		void UploadBtn() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the 'Upload' button is clickable or not");
			
			MyReportsMethods.UploadBtn(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 45) 
		void Upload() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- To check whether the user is able to upload the 'DIR-3 KYC' form");
			
			MyReportsMethods.Upload(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 46) 
		void UploadWD() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that the validation message is displayed when we upload empty excel file");
			
			MyReportsMethods.UploadWD(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 47) 
		void UploadIE() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that the validation message is displayed when we upload different extension file");
			
			MyReportsMethods.UploadIE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 48) 
		void EditClick() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that clicking the 'Edit' button opens the 'DIR-3 KYC Details' editing interface.");
			
			MyReportsMethods.EditClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 49) 
		void Edit() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DIR-3 KYC Details':- Verify that the 'Edit' button allows the user to edit relevant fields in the 'DIR-3 KYC Details' section.");
			
			MyReportsMethods.Edit(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 50) 
		void AnnualFilingReport() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > Annual Filling Report' tab is clickable or not");
			
			MyReportsMethods.AnnualFilingReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}

		//	@Test(priority = 51) 
			void CompanyAllClickAF() throws InterruptedException, IOException
			{
				test = extent.startTest("'My Reports > Annual Filling Report' :- To check whether the compliance 'Company - All' dropdown is Clickable or not");
				
				MyReportsMethods.CompanyAllClickAF(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
		
	//	@Test(priority = 52) 
		void ExportAFR() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Annual Filling Report' :- To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportAFR(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 53) 
		void DPT3StatusReport() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > DPT-3 Status Report' tab is clickable or not");
			
			MyReportsMethods.DPT3StatusReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 54) 
		void CompanyAllClickDPT() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports >  DPT-3 Status Report' :- To check whether the compliance 'Company - All' dropdown is Clickable or not");
			
			MyReportsMethods.CompanyAllClickDPT(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 55) 
		void CompanyAllFilterDPT() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DPT-3 Status Report' :- Verify that the user can able to select a specific company name option from 'Company - All' dropdown");
			
			MyReportsMethods.CompanyAllFilterDPT(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 56) 
		void FYDPT() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DPT-3 Status Report':- To check whether the Financial Year-All dropdown is working or not");
			
			MyReportsMethods.FYDPT(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 57) 
		void FYDPTFilter() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > DPT-3 Status Report':- Verify that the user can able to select a specific financial year option from 'Financial year-All' dropdown");
			
			MyReportsMethods.FYDPTFilter(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 58) 
		void ExportDPT() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportDPT(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 59) 
		void AddNewDPT() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - To check whether the user is able to add new DPT-3 Status details or not");
			
			MyReportsMethods.AddNewDPT(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 60) 
		void DPT3StatusUpload() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - To check whether the 'Upload' button is clickable or not");
			
			MyReportsMethods.DPT3StatusUpload(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 61) 
		void UploadDPT() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - To check whether the user is able to upload the ' DPT-3  Details' form");
			
			MyReportsMethods.UploadDPT(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 62) 
		void UploadDPTE() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - Verify that the validation message is displayed when we upload empty excel file");
			
			MyReportsMethods.UploadDPTE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 63) 
		void UploadDptIE() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - Verify that the validation message is displayed when we upload different extension file");
			
			MyReportsMethods.UploadDptIE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 64) 
		void EditDPTClick() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - Verify that clicking the 'Edit' button opens the 'DPT-3 Details' editing interface.");
			
			MyReportsMethods.EditDPTClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 65) 
		void EditDPT() throws InterruptedException, IOException
		{
			test = extent.startTest(" 'My Reports > DPT-3 Status Report' : - Verify that the 'Edit' button allows the user to edit relevant fields in the 'DPT-3 Details' section");
			
			MyReportsMethods.EditDPT(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 66) 
		void MSMEReport() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > MSME Report' tab is clickable or not");
			
			MyReportsMethods.MSMEReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 67) 
		void CompanyAllClickMSME() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports >   MSME Report' :- To check whether the compliance 'Company - All' dropdown is Clickable or not");
			
			MyReportsMethods.CompanyAllClickMSME(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 68) 
		void CompanyAllFilterMSME() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports >  MSME Report' :- Verify that the user can able to select a specific company name option from 'Company - All' dropdown");
			
			MyReportsMethods.CompanyAllFilterMSME(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 69) 
		void FYMSME() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report':- To check whether the Financial Year-All dropdown is working or not");
			
			MyReportsMethods.FYMSME(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 70) 
		void FYMSMEFilter() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report':- Verify that the user can able to select a specific financial year option from 'Financial year-All' dropdown");
			
			MyReportsMethods.FYMSMEFilter(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 71) 
		void ExportMSME() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportMSME(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 72) 
		void AddNewMSME() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- To check whether the user is able to add new MSME data or not");
			
			MyReportsMethods.AddNewMSME(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 73) 
		void MSMEUpload() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- To check whether the 'Upload' button is clickable or not");
			
			MyReportsMethods.MSMEUpload(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 74) 
		void UploadMSME() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- To check whether the user is able to upload the 'MSME' form");
			
			MyReportsMethods.UploadMSME(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 75) 
		void UploadMSMEE() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- Verify that the validation message is displayed when we upload empty excel file");
			
			MyReportsMethods.UploadMSMEE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 76) 
		void UploadMSMEIE() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- Verify that the validation message is displayed when we upload different extension file");
			
			MyReportsMethods.UploadMSMEIE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 77) 
		void EditMSMEClick() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- Verify that clicking the 'Edit' button opens the 'MSME Details' editing interface.");
			
			MyReportsMethods.EditMSMEClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 78) 
		void EditMSME() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > MSME Report' :- Verify that the 'Edit' button allows the user to edit relevant fields in the 'MSME' section");
			
			MyReportsMethods.EditMSME(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 79) 
		void Reg26ofSEBILODR() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > Reg 26(3) of SEBI (LODR)' tab is clickable or not");
			
			MyReportsMethods.Reg26ofSEBILODR(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 80) 
		void AddNewReg26ofSEBILODR() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- To check whether the user is able to add 'New' Reg 26(3) of SEBI (LODR) details or not");
			
			MyReportsMethods.AddNewReg26ofSEBILODR(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 81) 
		void AddNewReg26ofSEBILODRAE() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- Verify that the validation message is displayed when we click on save button without selecting a data");
			
			MyReportsMethods.AddNewReg26ofSEBILODRAE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 82) 
		void UploadReg() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- To check whether the user is able to upload the Reg 26(3) of SEBI (LODR) sample excel file with valid data");
			
			MyReportsMethods.UploadReg(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 83) 
		void UploadRegVal() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- Verify that the validation message is displayed when we enter Invalid DIN number and upload it");
			
			MyReportsMethods.UploadRegVal(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 84) 
		void UploadRegVal1() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- Verify that the validation message is displayed when we enter Invalid CIN number and upload it");
			
			MyReportsMethods.UploadRegVal1(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 85) 
		void UploadRegValD1() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- Verify that the validation message is displayed when we enter Invalid Date and upload it");
			
			MyReportsMethods.UploadRegValD1(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 86) 
		void UploadRegValDE1() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- Verify that the validation message is displayed when we upload different extension file");
			
			MyReportsMethods.UploadRegValDE1(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 87) 
		void CompanyAllClickReg() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports >  Reg 26(3) of SEBI (LODR)' :- To check whether the compliance 'Company - All' dropdown is Clickable or not");
			
			MyReportsMethods.CompanyAllClickReg(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 88) 
		void CompanyAllFilterReg() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports >   Reg 26(3) of SEBI (LODR)' :- Verify that the user can able to select a specific company name option from 'Company - All' dropdown");
			
			MyReportsMethods.CompanyAllFilterReg(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 89) 
		void DirectorAllClickReg() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports >  Reg 26(3) of SEBI (LODR)' :- To check whether the Director-All dropdown is working or not");
			
			MyReportsMethods.DirectorAllClickReg(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 90) 
		void DirectorAllFilterReg() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports >   Reg 26(3) of SEBI (LODR)' :- Verify that the user can able to select a specific Dirctor option from Director-All dropdown");
			
			MyReportsMethods.DirectorAllFilterReg(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 91) 
		void FinancialYearAllReg() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports >  Reg 26(3) of SEBI (LODR)' :- To check whether the 'Financial Year-All' dropdown is working or not");
			
			MyReportsMethods.FinancialYearAllReg(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 92) 
		void FinancialYearAllFilterReg() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports >   Reg 26(3) of SEBI (LODR)' :- Verify that the user can able to select a specific financial year option from 'Financial year-All' dropdown");
			
			MyReportsMethods.FinancialYearAllFilterReg(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 93) 
		void ExportReg() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportReg(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 94) 
		void EditReg() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- To check whether the user is able to edit Reg 26(3) of SEBI (LODR) Report or not");
			
			MyReportsMethods.EditReg(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 96) 
		void EditRegUpload() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- To check whether the user is able to upload pdf file which is present under edit tab");
			
			MyReportsMethods.EditRegUpload(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 96) 
		void EditDraftDocument() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- To check whether the user is able to download 'Draft Document' which is present under edit tab");
			
			MyReportsMethods.EditDraftDocument(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 97) 
		void View() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- To check whether the 'View' button is clickable or not");
			
			MyReportsMethods.View(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}

	//	@Test(priority = 98) 
		void ViewDownload() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- View :- To check whether the user is able to download uploaded document or not");
			
			MyReportsMethods.ViewDownload(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 99) 
		void ViewUploadDoc() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- View :- To check whether the user is able to View uploaded document or not");
			
			MyReportsMethods.ViewUploadDoc(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 100) 
		void ViewUploadDocDelete() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- View :- To check whether the user is able to Delete uploaded document or not");
			
			MyReportsMethods.ViewUploadDocDelete(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 101) 
		void ViewUploadDocDeleteCan() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- View :- To check whether the user is able to Delete - Cancels uploaded document or not");
			
			MyReportsMethods.ViewUploadDocDeleteCan(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 102) 
		void Delete() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- To check whether the user is able to Delete document or not");
			
			MyReportsMethods.Delete(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 103) 
		void DeleteCan() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Reg 26(3) of SEBI (LODR)':- To check whether the user is able to Delete - Cancel document or not");
			
			MyReportsMethods.DeleteCan(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 104) 
		void IndependenceDeclaration() throws InterruptedException, IOException
		{
			test = extent.startTest("To check whether the 'My Reports > Independance Decleration' tab is clickable or not");
			
			MyReportsMethods.IndependenceDeclaration(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 105) 
		void AddNewIndependenceDeclaration() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration' :- To check whether the user is able to add 'New' Independance Decleration details or not ");
			
			MyReportsMethods.AddNewIndependenceDeclaration(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 106) 
		void AddNewIndependenceDeclarationWD() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration' :- Verify that the validation message is displayed when we click on save button without selecting a data");
			
			MyReportsMethods.AddNewIndependenceDeclarationWD(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 107) 
		void UploadID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration' :- To check whether the user is able to upload the Independance Decleration sample excel file with valid data");
			
			MyReportsMethods.UploadID(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 108) 
		void UploadIDVal() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- Verify that the validation message is displayed when we enter Invalid DIN number and upload it");
			
			MyReportsMethods.UploadIDVal(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 109) 
		void UploadIDVal1() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- Verify that the validation message is displayed when we enter Invalid CIN number and upload it");
			
			MyReportsMethods.UploadIDVal1(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 110) 
		void UploadIDValD1() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- Verify that the validation message is displayed when we enter Invalid Date and upload it");
			
			MyReportsMethods.UploadIDValD1(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 111) 
		void UploadIDValDE1() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- Verify that the validation message is displayed when we upload different extension file");
			
			MyReportsMethods.UploadIDValDE1(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	//	@Test(priority = 112) 
		void CompanyAllClickIn() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration' :- To check whether the compliance 'Company - All' dropdown is Clickable or not");
			
			MyReportsMethods.CompanyAllClickIn(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 113) 
		void CompanyAllFilterIn() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration' :- Verify that the user can able to select a specific company name option from 'Company - All' dropdown");
			
			MyReportsMethods.CompanyAllFilterIn(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 114) 
		void DirectorAllClickIn() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration' :- To check whether the Director-All dropdown is working or not");
			
			MyReportsMethods.DirectorAllClickIn(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 115) 
		void DirectorAllFilterIn() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration' :- Verify that the user can able to select a specific Dirctor option from Director-All dropdown");
			
			MyReportsMethods.DirectorAllFilterIn(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 116) 
		void FinancialYearAllIn() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration' :- To check whether the 'Financial Year-All' dropdown is working or not");
			
			MyReportsMethods.FinancialYearAllIn(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 117) 
		void FinancialYearAllFilterIn() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration' :- Verify that the user can able to select a specific financial year option from 'Financial year-All' dropdown");
			
			MyReportsMethods.FinancialYearAllFilterIn(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//@Test(priority = 118) 
		void ExportID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- To check whether the 'Export to Excel' functionality is working or not");
			
			MyReportsMethods.ExportID(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority = 119) 
		void EditID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- To check whether the user is able to edit Independance Decleration Report or not");
			
			MyReportsMethods.EditID(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 120) 
		void EditRegUploadID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- To check whether the user is able to upload pdf file which is present under edit tab");
			
			MyReportsMethods.EditRegUploadID(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 121) 
		void EditDraftDocumentID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- To check whether the user is able to download 'Draft Document' which is present under edit tab");
			
			MyReportsMethods.EditDraftDocumentID(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 122) 
		void ViewID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- To check whether the 'View' button is clickable or not");
			
			MyReportsMethods.ViewID(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}

	//	@Test(priority = 123) 
		void ViewDownloadID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- View :- To check whether the user is able to download uploaded document or not");
			
			MyReportsMethods.ViewDownload(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 124) 
		void ViewUploadDocID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- View :- To check whether the user is able to View uploaded document or not");
			
			MyReportsMethods.ViewUploadDocID(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 125) 
		void ViewUploadDocDeleteID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- View :- To check whether the user is able to Delete uploaded document or not");
			
			MyReportsMethods.ViewUploadDocDeleteID(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 126) 
		void ViewUploadDocDeleteCanID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- View :- To check whether the user is able to Delete - Cancels uploaded document or not");
			
			MyReportsMethods.ViewUploadDocDeleteCanID(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 127) 
		void DeleteID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- To check whether the user is able to Delete document or not");
			
			MyReportsMethods.DeleteID(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority = 128) 
		void DeleteCanID() throws InterruptedException, IOException
		{
			test = extent.startTest("'My Reports > Independance Decleration':- To check whether the user is able to Delete - Cancel document or not");
			
			MyReportsMethods.DeleteCanID(driver,test);
			
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
