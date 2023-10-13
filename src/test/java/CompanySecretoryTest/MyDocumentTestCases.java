package CompanySecretoryTest;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CompnaySecretory.MyDocumentMethod;
import CompnaySecretory.MyWorkspaceMethod;

public class MyDocumentTestCases {
	
	
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

		fis = new FileInputStream("E:\\Secreterial Project Git Folder\\Avasec Merge\\Secreterial Project 26JULY23\\Secretarial-Project-26JULY23\\TestData\\SecreterialSheet3.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		String workingDir = System.getProperty("user.dir");
		extent = new com.relevantcodes.extentreports.ExtentReports(workingDir+"//Reports//MyWorkspace.html",true);
		test = extent.startTest("Verify OpenBrowser");
		
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}
	@BeforeMethod

	void Login() throws InterruptedException, IOException
	{
	    XSSFSheet sheet = ReadExcel();
		//
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);					//Method of Login class to set browser.
		
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		
		driver = login.Login.UserLogin(uname,password,"Compnay Secretory");		//Method of Login class to login user.

	}
	
 //  @Test(priority=1)

	  void MyDocument() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Document tab Verification");
		
		MyDocumentMethod.ClickMyDocument(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
 //  @Test(priority=2)

	  void ClickStatutoryRegistor() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab Verification");
		
		MyDocumentMethod.ClickStatutoryRegistor(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
// @Test(priority=3)

	  void RegisterOfMember() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Register Of Member View Button Verification");
		
		MyDocumentMethod.RegisterOfMember(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
 //  @Test(priority=4)

	  void DownloadButton() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -View Button -Select Members -Download button  Verification");
		
		MyDocumentMethod.DownloadButton(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//   @Test(priority=5)

	  void ViewButton() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -View Button -Select Members -View button  Verification");
		
		MyDocumentMethod.ViewButton1(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
   
  //@Test(priority=6)

	  void RegistorOfDirectorKMP() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Registor Of Director/KMP View Button Verification");
		
		MyDocumentMethod.RegistorOfDirectorKMP(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//   @Test(priority=7)

	  void ExistingDownloadButton() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Registor Of Director/KMP - View Button -Existing tab - Select Director - - Download button  Verification");
		
		MyDocumentMethod.ExistingDownloadButton(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
 //  @Test(priority=8)

	  void ExistingViewButton() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Registor Of Director/KMP View Button -Existing tab - Select Director  -View button  Verification");
		
		MyDocumentMethod.ExistingViewButton(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}

//   @Test(priority=9)

	  void OldViewButton() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Registor Of Director/KMP View Button -Old tab - Select Director  -View button  Verification");
		
		MyDocumentMethod.OldViewButton(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//   @Test(priority=10)

	  void OldDownloadButton() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Registor Of Director/KMP View Button -Old tab - Select Director  -Download button  Verification");
		
		MyDocumentMethod.OldDownloadButton(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
  // @Test(priority=11)

	  void AllViewButton() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Registor Of Director/KMP View Button -All tab - Select Director  -View button  Verification");
		
		MyDocumentMethod.AllViewButton(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//@Test(priority=12)

	  void AllDownloadButton() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Registor Of Director/KMP View Button -All tab - Select Director  -Download button  Verification");
		
		MyDocumentMethod.AllDownloadButton(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	  
//@Test(priority=12)

	  void RegistorOfCharge() throws InterruptedException, IOException
	  {
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Registor Of Charge View Button Verification");
		
		MyDocumentMethod.RegistorOfCharge(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//@Test(priority=13)

	 void DownloadRegisterOfCharge() throws InterruptedException, IOException
	 {
		 test = extent.startTest("Statutory Registor tab -Select Entity/Location -Registor Of Charge View Button -Select ChargeID -Download button  Verification");
	
		 MyDocumentMethod.DownloadRegisterOfCharge(driver, test);
	
		 extent.endTest(test);
		 extent.flush();
	 }
//@Test(priority=14)

	 void ViewRegisterOfCharge() throws InterruptedException, IOException
	 {
		 test = extent.startTest("Statutory Registor tab -Select Entity/Location -Registor Of Charge View Button -Select ChargeID   -View button  Verification");
	
		 MyDocumentMethod.ViewRegisterOfCharge(driver, test);
	
		 extent.endTest(test);
		 extent.flush();
	 }
//@Test(priority=15)

	void RegistorOfLoan() throws InterruptedException, IOException
	{
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Register of Loans, Guarantee, Security and Acquisition made by the Company View Button Verification");
	
		MyDocumentMethod.RegistorOfLoan(driver, test);
	
		extent.endTest(test);
		extent.flush();
	}
//@Test(priority=16)

	void DownloadRegisterOfLoan() throws InterruptedException, IOException
	{
	 	test = extent.startTest("Statutory Registor tab -Select Entity/Location -Register of Loans, Guarantee, Security and Acquisition made by the Company View Button -Select Nature Of Transaction -Download button  Verification");

	 	MyDocumentMethod.DownloadRegisterOfLoan(driver, test);

	 	extent.endTest(test);
	 	extent.flush();
	}
//@Test(priority=17)

	void ViewRegisterOfLoan() throws InterruptedException, IOException
	{
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Register of Loans, Guarantee, Security and Acquisition made by the Company View Button -Select Nature Of Transaction-View button  Verification");

		MyDocumentMethod.ViewRegisterOfLoan(driver, test);

		extent.endTest(test);
		extent.flush();
	}
//@Test(priority=18)

	void RegistorOfDebentureHolder() throws InterruptedException, IOException
	{
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Register of Debenture holders/Other securities holders View Button Verification");

		MyDocumentMethod.RegistorOfDebentureHolder(driver, test);

		extent.endTest(test);
		extent.flush();
	}
//@Test(priority=19)

	void DownloadRegisterOfDebentureHolder() throws InterruptedException, IOException
	{
 		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Register of Debenture holders/Other securities holders View Button -Select Debenture Class and Holder -Download button  Verification");

 		MyDocumentMethod.DownloadRegisterOfDebentureHolder(driver, test);

 		extent.endTest(test);
 		extent.flush();
	}
//@Test(priority=20)

	void ViewRegisterOfDebentureOfHolder() throws InterruptedException, IOException
	{
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Register of Debenture holders/Other securities holders View Button -Select Debenture Class and Holder -View button  Verification");

		MyDocumentMethod.ViewRegisterOfDebentureOfHolder(driver, test);

		extent.endTest(test);
		extent.flush();
	}
//@Test(priority=21)

void DownloadButtonWithoutSelectingData() throws InterruptedException, IOException
{
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Register of Debenture holders/Other securities holders View Button -Select Debenture Class and Holder -Download Button Without Selecting Data  Verification");

		MyDocumentMethod.DownloadButtonWithoutSelectingData(driver, test);

		extent.endTest(test);
		extent.flush();
}
//@Test(priority=22)

void ViewButtonWithoutSelectingData() throws InterruptedException, IOException
{
		test = extent.startTest("Statutory Registor tab -Select Entity/Location -Register of Debenture holders/Other securities holders View Button -Select Debenture Class and Holder -View Button Without Selecting Data  Verification");

		MyDocumentMethod.ViewButtonWithoutSelectingData(driver, test);

		extent.endTest(test);
		extent.flush();
}
 //@Test(priority=23)

void ClickHistoricalRegistor() throws InterruptedException, IOException
{
	test = extent.startTest("Historical Document tab Verification");
	
	MyDocumentMethod.ClickHistoricalRegistor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
// @Test(priority=24)

 void AddHistoricalRegistor() throws InterruptedException, IOException
 {
 	test = extent.startTest("Add Historical Document Verification");
 	
 	MyDocumentMethod.AddHistoricalRegistor(driver, test);
 	
 	extent.endTest(test);
 	extent.flush();
 }
// @Test(priority=25)

 void WithoutEnterDataHistoricalRegistor() throws InterruptedException, IOException
 {
 	test = extent.startTest("Witthout Enter Data  Historical Document Verification");
 	
 	MyDocumentMethod.WithoutEnterDataHistoricalRegistor(driver, test);
 	
 	extent.endTest(test);
 	extent.flush();
 }
// @Test(priority=26)

 void AddDocumentHistoricalRegistor() throws InterruptedException, IOException
 {
 	test = extent.startTest("Add Document  Historical Document Verification");
 	
 	MyDocumentMethod.AddDocumentHistoricalRegistor(driver, test);
 	
 	extent.endTest(test);
 	extent.flush();
 }
// @Test(priority=27)

 void AddMultipleDocumentHistoricalRegistor() throws InterruptedException, IOException
 {
 	test = extent.startTest("Add  Multiple Document  Historical Document Verification");
 	
 	MyDocumentMethod.AddMultipleDocumentHistoricalRegistor(driver, test);
 	
 	extent.endTest(test);
 	extent.flush();
 }
// @Test(priority=28)

 void AgendaItems() throws InterruptedException, IOException
 {
 	test = extent.startTest("Agenda Items Verification");
 	
 	MyDocumentMethod.AgendaItems(driver, test);
 	
 	extent.endTest(test);
 	extent.flush();
 }
//@Test(priority=29)

void EditHistoricalRegistor() throws InterruptedException, IOException
{
	test = extent.startTest("Edit icon  Historical Document Verification");
	
	MyDocumentMethod.EditHistoricalRegistor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=30)

void UpdateHistoricalRegistor() throws InterruptedException, IOException
{
	test = extent.startTest("Update  Historical Document Verification");
	
	MyDocumentMethod.UpdateHistoricalRegistor(driver, test);
	
	extent.endTest(test);
	extent.flush();
} 
//@Test(priority=31)

void DeleteRegisterDoc() throws InterruptedException, IOException
{
	test = extent.startTest("Delete (Yes Button)  Historical Document Verification");
	
	MyDocumentMethod.DeleteRegisterDoc(driver, test);
	
	extent.endTest(test);
	extent.flush();
} 
//@Test(priority=32)

void DeleteRegisterDoc1() throws InterruptedException, IOException
{
	test = extent.startTest("Delete (No Button)  Historical Document Verification");
	
	MyDocumentMethod.DeleteRegisterDocNo(driver, test);
	
	extent.endTest(test);
	extent.flush();
} 
//@Test(priority=33)

void HistoricalDocTypeFilter() throws InterruptedException, IOException
{
	test = extent.startTest(" Type Filter Historical Document Verification");
	
	MyDocumentMethod.HistoricalDocTypeFilter(driver, test);
	
	extent.endTest(test);
	extent.flush();
} 
//@Test(priority=34)

void HistoricalDocFilter() throws InterruptedException, IOException
{
	test = extent.startTest(" Filter Historical Document Verification");
	
	MyDocumentMethod.HistoricalDocFilter(driver, test);
	
	extent.endTest(test);
	extent.flush();
} 
//@Test(priority=35)

void HistoricalDocClearButton() throws InterruptedException, IOException
{
	test = extent.startTest("Clear Button  Historical Document Verification");
	
	MyDocumentMethod.HistoricalDocClearButton(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=36)

void EFormRepositorytab() throws InterruptedException, IOException
{
	test = extent.startTest("E-Form Repository tab Verification");
	
	MyDocumentMethod.EFormRepositorytab(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=37)

void UploadEFormRepository() throws InterruptedException, IOException
{
	test = extent.startTest("Upload E-Form Verification");
	
	MyDocumentMethod.UploadEFormRepository(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=38)

void WithoutUploadEFormRepository() throws InterruptedException, IOException
{
	test = extent.startTest("Without Upload E-Form Verification");
	
	MyDocumentMethod.WithoutUploadEFormRepository(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=39)

void EditUploadEFormRepository() throws InterruptedException, IOException
{
	test = extent.startTest("Edit - Upload E-Form Verification");
	
	MyDocumentMethod.EditUploadEFormRepository(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=40)

void DownloadDoc() throws InterruptedException, IOException
{
	test = extent.startTest("Download Document -  E-Form Verification");
	
	MyDocumentMethod.DownloadDoc(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=41)

void DeleteDoc() throws InterruptedException, IOException
{
	test = extent.startTest("Delete Document(Ok Button) -  E-Form Verification");
	
	MyDocumentMethod.DeleteDoc(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=42)

void DeleteDocCancelBtn() throws InterruptedException, IOException
{
	test = extent.startTest("Delete Document(Cancel Button) -  E-Form Verification");
	
	MyDocumentMethod.DeleteDocCancelBtn(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=43)

void SearchFilter() throws InterruptedException, IOException
{
	test = extent.startTest("Search filter -  E-Form Verification");
	
	MyDocumentMethod.SearchFilter(driver, test,"Form CRL-7");
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority=44)
void EFormClearBtn() throws InterruptedException, IOException
{
	test = extent.startTest("Clear button -  E-Form Verification");
	
	MyDocumentMethod.EFormClearBtn(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

//@AfterMethod
 
	void close()
	{
		driver.close();
	}
}