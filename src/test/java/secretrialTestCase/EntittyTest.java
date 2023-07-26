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

import secretrial.Methods;

public class EntittyTest {
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
		
		
	/*	XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);		*/			//Method of Login class to set browser.
		
		test.log(LogStatus.PASS, "Test Passed.");
		extent.endTest(test);
		extent.flush();
	}
	
	@BeforeMethod
	void Login() throws InterruptedException, IOException
	{
	
	//	test = extent.startTest("Secreterial Logging In - Company Secretory");
		
		XSSFSheet sheet = ReadExcel();
		Row row0 = sheet.getRow(0);						//Selected 0th index row (First row)
		Cell c1 = row0.getCell(1);						//Selected cell (0 row,1 column)
		String URL = c1.getStringCellValue();			//Got the URL stored at position 0,1
		
		login.Login.BrowserSetup(URL);	

	//	XSSFSheet sheet = ReadExcel();
		Row row1 = sheet.getRow(1);						//Selected 1st index row (Second row)
		Cell c2 = row1.getCell(1);						//Selected cell (1 row,1 column)
		String uname = c2.getStringCellValue();			//Got the URL stored at position 1,1
		
		Row row2 = sheet.getRow(2);						//Selected 2nd index row (Third row)
		Cell c3 = row2.getCell(1);						//Selected cell (2 row,1 column)
		String password = c3.getStringCellValue();		//Got the URL stored at position 2,1
		
		driver = login.Login.UserLogin(uname,password,"Compnay Secretory");		//Method of Login class to login user.
		
	//	test.log(LogStatus.PASS, "Test Passed.");
	//	extent.endTest(test);
	//	extent.flush();
	}
/*
	@Test(priority = 2)
	void BusinessActivityClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Business Activity  ");
		
		Methods.BusinessActivityClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 3)
	void AddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Business Activity -Add New ");
		
		Methods.BusinessActivity(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
@Test(priority = 4)
	void validationofsave() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Business Activity -Add New - To check validation of save button without entering a data");
		
		Methods.validationofsave(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 5)
	void validationofedit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity -Edit");
		
		Methods.validationofedit(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 6)
	void CheckInvaliddata() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity -Edit - Check Invalid Data");
		
		Methods.CheckInvaliddata(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 7)
	void DeleteBusinessActivity() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity - Delete");
		
		Methods.DeleteBusinessActivity(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	//@Test(priority = 7) Not Completed
	void CheckFilterWork() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity - Filter");
		
		Methods.CheckFilterWork(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 8)
	void BusinessActivityValidation() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Business Activity -Add New - withOut Selecting 'Main Activity Code' dropdown");
		
		Methods.BusinessActivityValidation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 9)
	void DocumentClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents ");
		
		Methods.DocumentClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 10)
	void DocumentsADDMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting MOA");
		
		Methods.DocumentsADDMOA(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 11)
	void WithoutDocument() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Type MOA - Without Document ");
		
		Methods.WithoutDocument(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 12)
	void DocumentsADDMOAAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - with existing data ");
		
		Methods.DocumentsADDMOAAE(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 13)//start
	void ViewMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-view-MOA ");
		
		Methods.ViewMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 14)
	void DownloadMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Download - MOA ");
		
		Methods.DownloadMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 15)
	void DeleteMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Delete - MOA ");
		
		Methods.DeleteMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}	
	
	//@Test(priority = 16)
	void AddNewDocuments() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting AOA");
		
		Methods.DocumentsADD(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 17)
	void DocumentsADDExisting() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -AOA - with existing data ");
		
		Methods.DocumentsADDExisting(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 18)
	void ViewAOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-View - AOA");
		
		Methods.ViewAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 19)
	void DownloadAOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Download -AOA ");
		
		Methods.DownloadAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 20)
	void DocumentDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Delete - AOA ");
		
		Methods.DeleteAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 21)
	void WithoutDocumentAOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Type AOA - Without Document ");
		
		Methods.WithoutDocumentAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 22)
	void DocumentsADDCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting COI ");
		
		Methods.DocumentsADDCOI(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 23)
	void WithoutDocumentCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Type COI - Without Document ");
		
		Methods.WithoutDocumentCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
/*	
	@Test(priority = 24)
	void DocumentsADDCOIExisting() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -COI - with existing data ");
		
		Methods.DocumentsADDCOIExisting(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 25)
	void ViewCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-View - COI");
		
		Methods.ViewCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 26)
	void DownloadCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Download -COI ");
		
		Methods.DownloadCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 27)
	void DeleteCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Delete - COI ");
		
		Methods.DeleteCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 28)
	void DocumentsADDPolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting Policy ");
		
		Methods.DocumentsADDPolicy(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 29)
	void WithoutDocumentPolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Type Policy - Without Document ");
		
		Methods.WithoutDocumentPolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 30)
	void DocumentsADDPolicyAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Policy - with existing data ");
		
		Methods.DocumentsADDPolicyAE(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority = 31)
	void ViewPolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents- Policies -View ");
		
		Methods.ViewPolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 32)
	void DownloadPolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Policies -Download  ");
		
		Methods.DownloadPolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 33)
	void DeletePolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Policies - Delete  ");
		
		Methods.DeletePolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	*/
//	@Test(priority = 34)
	void DocumentsADDLicenseRegi() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting Licence/Registration  ");
		
		Methods.DocumentsADDLicenseRegi(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 35)
	void DocumentsADDLicenseRegiInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting Licence/Registration :- Invalid data ");
		
		Methods.DocumentsADDLicenseRegiInvalid(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 36)
	void WithoutDocumentLicense() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting Licence/Registration :- Without Document ");
		
		Methods.WithoutDocumentLicense(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 37)
	void DocumentsADDLicenseRegiED() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New -Licence/Registration  - with existing data ");
		
		Methods.DocumentsADDLicenseRegiED(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 38)
	void ViewLicenseRegi() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents- LICENSE_REGISTRATION -View ");
		
		Methods.ViewLicenseRegi(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 39)
	void DownloadLicenseRegi() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-LICENSE_REGISTRATION -Download  ");
		
		Methods.DownloadLicenseRegi(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 40)
	void DeleteLicenseRegi() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-LICENSE_REGISTRATION - Delete  ");
		
		Methods.DeleteLicenseRegi(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	//@Test(priority = 41)
	void DocumentsADDAnnualReport() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Selecting  Annual Report ");
		
		Methods.DocumentsADDAnnualReport(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 42)
	void DocumentsADDAnnualReportED() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Annual Reportn  - with existing data ");
		
		Methods.DocumentsADDAnnualReportED(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 43)
	void DocumentsADDAnnualReportWD() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Annual Report :- Without Document ");
		
		Methods.DocumentsADDAnnualReportWD(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 44)
	void ViewAnnualReport() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents- Annual report -View ");
		
		Methods.ViewAnnualReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 45)
	void DownloadAnnualReport() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Annual report -Download  ");
		
		Methods.DownloadAnnualReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 46)
	void DeleteAnnualReport() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Annual report - Delete  ");
		
		Methods.DeleteAnnualReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 47)
	void DocumentsADDClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Documents-Add New - Close   ");
		
		Methods.DocumentsADDClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 48)
	void BranchDetailsClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details   ");
		
		Methods.BranchDetailsClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 49)
	void AddNewBranchDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Add New -With Valid Data  ");
		
		Methods.AddNewBranchDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 50)
	void AddNewBranchDetailsinvalidData() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Add New - With Invalid Data ");
		
		Methods.AddNewBranchDetailsinvalidData(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 51)
	void AddNewBranchDetailsMandatoryfield() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Add New - With 2 Mandatory field ");
		
		Methods.AddNewBranchDetailsMandatoryfield(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 52)
	void AddNewBranchDetailsWithOutData() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Add New - WithOut Data ");
		
		Methods.AddNewBranchDetailsWithOutData(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 53)
	void EditBranchDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Edit ");
		
		Methods.EditBranchDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 54)
	void UploadBranchDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Upload Document -With Valid Extention ");
		
		Methods.UploadBranchDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 55)
	void UploadBranchDetailsInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Upload Document - With Invalid Extention  ");
		
		Methods.UploadBranchDetailsInvalid(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 56)
	void UploadBranchDetailsMulvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Upload Document - With  multiple valid file extensions upload  ");
		
		Methods.UploadBranchDetailsMulvalid(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 57)
	void UploadBranchDetailsMulInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Upload Document - With  multiple invalid file extensions upload  ");
		
		Methods.UploadBranchDetailsMulInvalid(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 58)//19/04/2023
	void UploadBranchDetailsWF() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Upload Document - WithOut Document  ");
		
		Methods.UploadBranchDetailsWF(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 59)
	void AddNewBranchDetailsClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Branch Details - Add New -Close  ");
		
		Methods.AddNewBranchDetailsClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 60)
	void BankDetailsClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details  ");
		
		Methods.BankDetailsClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 61)
	void BankDetailAddnew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add New -with valid data ");
		
		Methods.BankDetailAddnew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

//	@Test(priority = 62)
	void BankDetailInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add New - with Invalid account number  ");
		
		Methods.BankDetailInvalid(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 63)
	void BankDetailInvalidBName() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add New - with Invalid Bank Name  ");
		
		Methods.BankDetailInvalidBName(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 64)
	void BankDetailInvalidIFC() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add New - with Invalid IFSC ");
		
		Methods.BankDetailInvalidIFC(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 65)
	void WithOutBankDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details- add bank details without filling out required fields.");
		
		Methods.WithOutBankDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 66)
	void BankDetailEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Edit");
		
		Methods.BankDetailEdit(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 67)
	void BankDetailEditInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Edit - Invalid Data");
		
		Methods.BankDetailEditInvalid(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 68)
	void BankDetailDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Delete");
		
		Methods.BankDetailDelete(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 69)
	void BankDetailDeleteCan() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Delete - cancel");
		
		Methods.BankDetailDeleteCan(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 70) //20/04/2023  //not complete
		void EntityView() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - View");
			
			Methods.EntityView(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
//   ----------------------------------   Public Limited   -------------------------------------------
	/*
	@Test(priority = 71) 
	void PublicLimitedSelect() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited");
			
			Methods.PublicLimitedSelect(driver,test);
			
			extent.endTest(test);
			extent.flush();
	}
	
	@Test(priority = 72) 
	void PublicLimitedAdd() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited -With Valid Data");
			
			Methods.PublicLimitedAdd(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
	@Test(priority = 73) 
	void PublicLimitedAddInvalid() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited - -With Invalid Data");
			
			Methods.PublicLimitedAddInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
	@Test(priority = 74) 
	void PublicLimitedAddWith2man() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited - -With two mandatory fields");
			
			Methods.PublicLimitedAddWith2man(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
	@Test(priority = 75) 
	void PublicLimitedAddWithoutdata() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited - -withOut Data");
			
			Methods.PublicLimitedAddWithoutdata(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
	@Test(priority = 76) 
	void PublicLimitedAddClose() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Public Limited - Close");
			
			Methods.PublicLimitedAddClose(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
	@Test(priority = 77) 
	void PublicLimitedEdit() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Public Limited -Edit");
			
			Methods.PublicLimitedEdit(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
	@Test(priority = 78) 
	void PublicLimitedEditInvalid() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Public Limited -Edit-with Invalid Name");
			
			Methods.PublicLimitedEditInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
	@Test(priority = 79) 
	void PublicLimitedEditClose() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Public Limited -Edit- Close Button");
			
			Methods.PublicLimitedEditClose(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	
	@Test(priority = 80) //  21/04/2023
	void PLBusinessActivityClick() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Public Limited -Edit-Business Activity ");
			
			Methods.PLBusinessActivityClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
	}
	
	@Test(priority = 81)
	void PLBusinessActivity() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Public Limited -Edit-Business Activity - Add New ");
			
			Methods.PLBusinessActivity(driver,test);
			
			extent.endTest(test);
			extent.flush();
	}
	
	@Test(priority = 82)
	void PLBusinessActivityValidation() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Public Limited - Business Activity -Add New - withOut Selecting 'Main Activity Code' dropdown");
		
		Methods.PLBusinessActivityValidation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 83)
	void PLvalidationofsave() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Business Activity -Add New - To check validation of save button without entering a data");
		
		Methods.PLvalidationofsave(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 84)
	void PLvalidationofedit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Business Activity -Edit - With Valid Data");
		
		Methods.PLvalidationofedit(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 85)
	void PLCheckInvaliddata() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited -Edit- Business Activity -Edit -With Invalid Data");
		
		Methods.PLCheckInvaliddata(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 86)
	void PLDeleteBusinessActivity() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Business Activity - Delete");
		
		Methods.PLDeleteBusinessActivity(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 87)
	void PLBusinessActivityADDNewClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Business Activity - Add New -Close");
		
		Methods.PLBusinessActivityADDNewClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 88)
	void PLDocumentClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Documents ");
		
		Methods.PLDocumentClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 89)
	void PLDocumentsADDMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting MOA");
		
		Methods.PLDocumentsADDMOA(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 90)
	void PLWithoutDocument() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New -Type MOA - Without Document ");
		
		Methods.PLWithoutDocument(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 91)
	void PLDocumentsADDMOAAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - with existing data ");
		
		Methods.PLDocumentsADDMOAAE(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 92)
	void PLViewMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Public Limited - Edit - Documents-view-MOA ");
		
		Methods.PLViewMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 93)
	void PLDownloadMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Public Limited -Edit - Documents-Download - MOA ");
		
		Methods.PLDownloadMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 94) //  24/04/2023
	void PLDeleteMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Public Limited - Edit - Documents-Delete - MOA ");
		
		Methods.PLDeleteMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}	
	
	@Test(priority = 95)
		void PLDocumentsADD() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New - Selecting AOA");
			
			Methods.PLDocumentsADD(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 96)
		void PLWithoutDocumentAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New -Type AOA - Without Document ");
			
			Methods.PLWithoutDocumentAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 97)
		void PLDocumentsADDExisting() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -AOA - with existing data ");
			
			Methods.PLDocumentsADDExisting(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 98)
		void PLViewAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-View - AOA");
			
			Methods.PLViewAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 99)
		void PLDownloadAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Download -AOA ");
			
			Methods.PLDownloadAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 100)
		void PLDeleteAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Delete - AOA ");
			
			Methods.PLDeleteAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 101)
		void PLDocumentsADDCOI() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New - Selecting COI ");
			
			Methods.PLDocumentsADDCOI(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
			
		@Test(priority = 102)
		void PLWithoutDocumentCOI() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Type COI - Without Document ");
			
			Methods.PLWithoutDocumentCOI(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 103)
		void PLDocumentsADDCOIExisting() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New -COI - with existing data ");
			
			Methods.PLDocumentsADDCOIExisting(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 104)
		void PLViewCOI() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited -Edit - Documents-View - COI");
			
			Methods.PLViewCOI(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 105)
		void PLDownloadCOI() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Download -COI ");
			
			Methods.PLDownloadCOI(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 106)
		void PLDeleteCOI() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Delete - COI ");
			
			Methods.PLDeleteCOI(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 107)
		void PLDocumentsADDPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting Policy ");
			
			Methods.PLDocumentsADDPolicy(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
    	@Test(priority = 108)
		void PLWithoutDocumentPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Type Policy - Without Document ");
			
			Methods.PLWithoutDocumentPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 109)
		void PLDocumentsADDPolicyAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Policy - with existing data ");
			
			Methods.PLDocumentsADDPolicyAE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	
		@Test(priority = 110)
		void PLViewPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited  - Edit - Documents- Policies -View ");
			
			Methods.PLViewPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 111)
		void PLDownloadPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Policies -Download  ");
			
			Methods.PLDownloadPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 112)
		void PLDeletePolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Policies - Delete  ");
			
			Methods.PLDeletePolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 113)
		void PLDocumentsADDLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting Licence/Registration  ");
			
			Methods.PLDocumentsADDLicenseRegi(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 114) // 25/04/2023
		void PLDocumentsADDLicenseRegiInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting Licence/Registration :- Invalid data ");
			
			Methods.PLDocumentsADDLicenseRegiInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 115)
		void PLWithoutDocumentLicense() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting Licence/Registration :- Without Document ");
			
			Methods.PLWithoutDocumentLicense(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
			
		@Test(priority = 116)
		void PLDocumentsADDLicenseRegiED() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Licence/Registration  - with existing data ");
			
			Methods.PLDocumentsADDLicenseRegiED(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 117)
		void PLViewLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited -Edit - Documents- LICENSE_REGISTRATION -View ");
			
			Methods.PLViewLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 118)
		void PLDownloadLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-LICENSE_REGISTRATION -Download  ");
			
			Methods.PLDownloadLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 119)
		void PlDeleteLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-LICENSE_REGISTRATION - Delete  ");
			
			Methods.PlDeleteLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 120)
		void PLDocumentsADDAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting  Annual Report ");
			
			Methods.PLDocumentsADDAnnualReport(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 121)
		void PLDocumentsADDAnnualReportED() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New - Annual Reportn  - with existing data ");
			
			Methods.PLDocumentsADDAnnualReportED(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 122)
		void PlDocumentsADDAnnualReportWD() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Annual Report :- Without Document ");
			
			Methods.PlDocumentsADDAnnualReportWD(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 123)
		void PLViewAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Documents- Annual report -View ");
			
			Methods.PLViewAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 124)
		void PLDownloadAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Annual report -Download  ");
			
			Methods.PLDownloadAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 125)
		void PLDeleteAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Documents-Annual report - Delete  ");
			
			Methods.PLDeleteAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 126)
		void PLBranchDetailsClick() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Branch Details   ");
			
			Methods.PLBranchDetailsClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 127)
		void PLAddNewBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Add New -With Valid Data  ");
			
			Methods.PLAddNewBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 128)
		void PLAddNewBranchDetailsinvalidData() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Add New - With Invalid Data ");
			
			Methods.PLAddNewBranchDetailsinvalidData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 129)
		void PLAddNewBranchDetailsMandatoryfield() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Add New - With 2 Mandatory field ");
			
			Methods.PLAddNewBranchDetailsMandatoryfield(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 130)
		void PLAddNewBranchDetailsWithOutData() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Add New - WithOut Data ");
			
			Methods.PLAddNewBranchDetailsWithOutData(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
	   @Test(priority = 131)
		void PLEditBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Edit ");
			
			Methods.PLEditBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 132) // 26/04/2023
		void PLUploadBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited  - Edit - Branch Details - Upload Document -With Valid Extention ");
			
			Methods.PLUploadBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 133)
		void PLUploadBranchDetailsInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited  - Edit - Branch Details - Upload Document - With Invalid Extention  ");
			
			Methods.PLUploadBranchDetailsInvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 134)
		void PLUploadBranchDetailsMulvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Upload Document - With  multiple valid file extensions upload  ");
			
			Methods.PLUploadBranchDetailsMulvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 135)
		void PLUploadBranchDetailsMulInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Upload Document - With  multiple invalid file extensions upload  ");
			
			Methods.PLUploadBranchDetailsMulInvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 136)
		void PLUploadBranchDetailsWF() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Upload Document - WithOut Document  ");
			
			Methods.PLUploadBranchDetailsWF(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 137)
		void PLAddNewBranchDetailsClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Add New -Close  ");
			
			Methods.PLAddNewBranchDetailsClose(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 138)
		void PLBankDetailsClick() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details  ");
			
			Methods.PLBankDetailsClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 139)
		void PLBankDetailAddnew() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Public Limited - Edit - Bank Details-Add New -with valid data ");
			
			Methods.PLBankDetailAddnew(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}

		@Test(priority = 140)
		void PLBankDetailInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Public Limited - Edit - Bank Details-Add New - with Invalid account number  ");
			
			Methods.PLBankDetailInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 141)
		void PLBankDetailInvalidBName() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details-Add New - with Invalid Bank Name  ");
			
			Methods.PLBankDetailInvalidBName(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 142)
		void PLBankDetailInvalidIFC() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details-Add New - with Invalid IFSC ");
			
			Methods.PLBankDetailInvalidIFC(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 143)
		void PLWithOutBankDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details- add bank details without filling out required fields.");
			
			Methods.PLWithOutBankDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 144)
		void PLBankDetailEdit() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details -Edit");
			
			Methods.PLBankDetailEdit(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 145)
		void PLBankDetailEditInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details -Edit - Invalid Data");
			
			Methods.PLBankDetailEditInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 146)
		void PLBankDetailDeleteCan() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details -Delete - cancel");
			
			Methods.PLBankDetailDeleteCan(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 147)
		void PLBankDetailDelete() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Public Limited - Edit - Bank Details -Delete");
			
			Methods.PLBankDetailDelete(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		*/
		/*
	//   ----------------------------------   Listed Company   -------------------------------------------
		
		@Test(priority = 148) 
		void ListedCompanySelect() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New -  Listed Company ");
				
				Methods.ListedCompanySelect(driver,test);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 149) 
		void ListedCompanyAdd() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New -Listed Company -With Valid Data");
				
				Methods.ListedCompanyAdd(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 150) 
		void ListedCompanyAddInvalid() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New - Listed Company- -With Invalid Data");
				
				Methods.ListedCompanyAddInvalid(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 151) 
		void ListedCompanyAddWith2man() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New - Listed Company - With two mandatory fields");
				
				Methods.ListedCompanyAddWith2man(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 152) 
		void ListedCompanyAddWithoutdata() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New - Listed Company - -withOut Data");
				
				Methods.ListedCompanyAddWithoutdata(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 153) 
		void ListedCompanyAddClose() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Add New - Listed Company - Close");
				
				Methods.ListedCompanyAddClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 154) 
		void ListedCompanyEdit() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Listed Company -Edit");
				
				Methods.ListedCompanyEdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
	
		@Test(priority = 155) 
		void ListedCompanyEditInvalid() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Listed Company  -Edit-with Invalid Name");
				
				Methods.ListedCompanyEditInvalid(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 156) 
		void ListedCompanyEditClose() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Listed Company -Edit- Close Button");
				
				Methods.ListedCompanyEditClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority =157 ) 
		void LCBusinessActivityClick() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity - Listed Company -Edit-Business Activity ");
				
				Methods.LCBusinessActivityClick(driver,test);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 158)
		void LCBusinessActivity() throws InterruptedException, IOException
		{
				test = extent.startTest("Entity -  Listed Company  -Edit-Business Activity - Add New ");
				
				Methods.LCBusinessActivity(driver,test);
				
				extent.endTest(test);
				extent.flush();
		}
		
		@Test(priority = 159)
		void LCBusinessActivityValidation() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Business Activity -Add New - withOut Selecting 'Main Activity Code' dropdown");
			
			Methods.LCBusinessActivityValidation(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 160)
		void LCvalidationofsave() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company- Edit - Business Activity -Add New - To check validation of save button without entering a data");
			
			Methods.LCvalidationofsave(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 161)
		void LCvalidationofedit() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Business Activity -Edit - With Valid Data");
			
			Methods.LCvalidationofedit(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 162)
		void LCCheckInvaliddata() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company -Edit- Business Activity -Edit -With Invalid Data");
			
			Methods.LCCheckInvaliddata(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 163)
		void LCDeleteBusinessActivity() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Business Activity - Delete");
			
			Methods.LCDeleteBusinessActivity(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 164)
		void LCBusinessActivityADDNewClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Business Activity - Add New -Close");
			
			Methods.LCBusinessActivityADDNewClose(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 165)
		void LCDocumentClick() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents ");
			
			Methods.LCDocumentClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 166)
		void LCDocumentsADDMOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New - Selecting MOA");
			
			Methods.LCDocumentsADDMOA(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 167)
		void LCWithoutDocument() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New -Type MOA - Without Document ");
			
			Methods.LCWithoutDocument(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 168)
		void LCDocumentsADDMOAAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - with existing data ");
			
			Methods.LCDocumentsADDMOAAE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 169)
		void LCViewMOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-view-MOA ");
			
			Methods.LCViewMOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 170)
		void LCDownloadMOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company -Edit - Documents-Download - MOA ");
			
			Methods.LCDownloadMOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 171) 
		void LCDeleteMOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Delete - MOA ");
			
			Methods.LCDeleteMOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}	
		
		
		@Test(priority = 172)  //28/04/2023
		void LCDocumentsADD() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Selecting AOA");
			
			Methods.LCDocumentsADD(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
	    @Test(priority = 173)
		void LCWithoutDocumentAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Type AOA - Without Document ");
			
			Methods.LCWithoutDocumentAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 174)
		void LCDocumentsADDExisting() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Listed Company - Edit - Documents-Add New -AOA - with existing data ");
			
			Methods.LCDocumentsADDExisting(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 175)
		void LCViewAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Listed Company - Edit - Documents-View - AOA");
			
			Methods.LCViewAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 176)
		void LCDownloadAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Download -AOA ");
			
			Methods.LCDownloadAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 177)
		void LCDeleteAOA() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Listed Company - Edit - Documents-Delete - AOA ");
			
			Methods.LCDeleteAOA(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 178)
			void LCDocumentsADDCOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity -  Listed Company - Edit - Documents-Add New - Selecting COI ");
				
				Methods.LCDocumentsADDCOI(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
				
	     	@Test(priority = 179)
			void LCWithoutDocumentCOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity -  Listed Company - Edit - Documents-Add New -Type COI - Without Document ");
				
				Methods.LCWithoutDocumentCOI(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}	
		
			@Test(priority = 180)
			void LCDocumentsADDCOIExisting() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -COI - with existing data ");
				
				Methods.LCDocumentsADDCOIExisting(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
		
			@Test(priority = 181)
			void LCViewCOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity -  Listed Company -Edit - Documents-View - COI");
				
				Methods.LCViewCOI(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 182)
			void LCDownloadCOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity -  Listed Company - Edit - Documents-Download -COI ");
				
				Methods.LCDownloadCOI(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 183)
			void LCDeleteCOI() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity -  Listed Company- Edit - Documents-Delete - COI ");
				
				Methods.LCDeleteCOI(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
		
		@Test(priority = 184)
		void LCDocumentsADDPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Selecting Policy ");
			
			Methods.LCDocumentsADDPolicy(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}	
		
		
    	@Test(priority = 185)
		void LCWithoutDocumentPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Type Policy - Without Document ");
			
			Methods.LCWithoutDocumentPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
			
		@Test(priority = 186)  // 02/05/2023
		void LCDocumentsADDPolicyAE() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Policy - with existing data ");
			
			Methods.LCDocumentsADDPolicyAE(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 187)
		void LCViewPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company  - Edit - Documents- Policies -View ");
			
			Methods.LCViewPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 188)
		void LCDownloadPolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Policies -Download  ");
			
			Methods.LCDownloadPolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 189)
		void LCDeletePolicy() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Policies - Delete  ");
			
			Methods.LCDeletePolicy(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 190)
		void LCDocumentsADDLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Selecting Licence/Registration  ");
			
			Methods.LCDocumentsADDLicenseRegi(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 191) 
		void LCDocumentsADDLicenseRegiInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New - Selecting Licence/Registration :- Invalid data ");
			
			Methods.LCDocumentsADDLicenseRegiInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 192)
		void LCWithoutDocumentLicense() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New - Selecting Licence/Registration :- Without Document ");
			
			Methods.LCWithoutDocumentLicense(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
			
		@Test(priority = 193)
		void LCDocumentsADDLicenseRegiED() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Licence/Registration  - with existing data ");
			
			Methods.LCDocumentsADDLicenseRegiED(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 194)
		void LCViewLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company -Edit - Documents- LICENSE_REGISTRATION -View ");
			
			Methods.LCViewLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 195)
		void LCDownloadLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-LICENSE_REGISTRATION -Download  ");
			
			Methods.LCDownloadLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 196)
		void lCDeleteLicenseRegi() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company- Edit - Documents-LICENSE_REGISTRATION - Delete  ");
			
			Methods.lCDeleteLicenseRegi(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		
		@Test(priority = 197)
		void LCDocumentsADDAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New - Selecting  Annual Report ");
			
			Methods.LCDocumentsADDAnnualReport(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 198)
		void LCDocumentsADDAnnualReportED() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Annual Reportn  - with existing data ");
			
			Methods.LCDocumentsADDAnnualReportED(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 199)
		void lCDocumentsADDAnnualReportWD() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company- Edit - Documents-Add New - Annual Report :- Without Document ");
			
			Methods.lCDocumentsADDAnnualReportWD(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 200)
		void LCViewAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Documents- Annual report -View ");
			
			Methods.LCViewAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 201)
		void LCDownloadAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Annual report -Download  ");
			
			Methods.LCDownloadAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 202)
		void LCDeleteAnnualReport() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Documents-Annual report - Delete  ");
			
			Methods.LCDeleteAnnualReport(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 203)
		void LCBranchDetailsClick() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Branch Details  ");
			
			Methods.LCBranchDetailsClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 204)
		void LCAddNewBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -Listed Company - Edit - Branch Details - Add New -With Valid Data  ");
			
			Methods.LCAddNewBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 205)
		void LCAddNewBranchDetailsinvalidData() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Add New - With Invalid Data ");
			
			Methods.LCAddNewBranchDetailsinvalidData(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 206)
		void LCAddNewBranchDetailsMandatoryfield() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Add New - With 2 Mandatory field ");
			
			Methods.LCAddNewBranchDetailsMandatoryfield(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 207) //03/05/2023
		void LCAddNewBranchDetailsWithOutData() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Add New - WithOut Data ");
			
			Methods.LCAddNewBranchDetailsWithOutData(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	   @Test(priority = 208)
		void LCEditBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company  - Edit - Branch Details - Edit ");
			
			Methods.LCEditBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 209) 
		void LCUploadBranchDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company   - Edit - Branch Details - Upload Document -With Valid Extention ");
			
			Methods.LCUploadBranchDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 210)
		void LCUploadBranchDetailsInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Listed Company   - Edit - Branch Details - Upload Document - With Invalid Extention  ");
			
			Methods.LCUploadBranchDetailsInvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 211)
		void LCUploadBranchDetailsMulvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Upload Document - With  multiple valid file extensions upload  ");
			
			Methods.LCUploadBranchDetailsMulvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 212)
		void LCUploadBranchDetailsMulInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company  - Edit - Branch Details - Upload Document - With  multiple invalid file extensions upload  ");
			
			Methods.LCUploadBranchDetailsMulInvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 213)
		void LCUploadBranchDetailsWF() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Upload Document - WithOut Document  ");
			
			Methods.LCUploadBranchDetailsWF(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 214)
		void LCAddNewBranchDetailsClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company  - Edit - Branch Details - Add New -Close  ");
			
			Methods.LCAddNewBranchDetailsClose(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority =215 )
		void LCBankDetailsClick() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details  ");
			
			Methods.LCBankDetailsClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		@Test(priority = 216)
		void LCBankDetailAddnew() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details-Add New -with valid data ");
			
			Methods.LCBankDetailAddnew(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 217)
		void LCBankDetailInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity -  Listed Company- Edit - Bank Details-Add New - with Invalid account number  ");
			
			Methods.LCBankDetailInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 218)
		void LCBankDetailInvalidBName() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details-Add New - with Invalid Bank Name  ");
			
			Methods.LCBankDetailInvalidBName(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 219)
		void PLBankDetailInvalidIFC() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details-Add New - with Invalid IFSC ");
			
			Methods.LCBankDetailInvalidIFC(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 220)
		void LCWithOutBankDetails() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details- add bank details without filling out required fields.");
			
			Methods.LCWithOutBankDetails(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
			
		@Test(priority = 221)
		void LCBankDetailEdit() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details -Edit");
			
			Methods.LCBankDetailEdit(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 222)
		void LCBankDetailEditInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details -Edit - Invalid Data");
			
			Methods.LCBankDetailEditInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 223)
		void LCBankDetailDeleteCan() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company - Edit - Bank Details -Delete - cancel");
			
			Methods.LCBankDetailDeleteCan(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 224)
		void LCBankDetailDelete() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - Listed Company  - Edit - Bank Details -Delete");
			
			Methods.LCBankDetailDelete(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	*/
		//--------------------------'More Action'- 'Related Companies'-------------------------
	/*	 
		@Test(priority = 225) // 04/05/2023
		void EntityMoreOption() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action");
			
			Methods.EntityMoreOption(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	
	@Test(priority = 226) 
	void RCAddNew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies -Add New");
		
		Methods.RCAddNew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 227) 
	void RCSharesHeld() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies -Shares Held");
		
		Methods.RCSharesHeld(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 228) 
	void RCClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies - close Button");
		
		Methods.RCClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 229) 
	void RCSearchField() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies - Search - with Valid Data");
		
		Methods.RCSearchField(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 230) 
		void RCSearchFieldINvalidData() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action -Related Companies - Search - with InValid Data");
			
			Methods.RCSearchFieldINvalidData(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	@Test(priority = 231) 
	void RCDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action -Related Companies - Delete");
		
		Methods.RCDelete(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}	
	
	//--------------------------'More Action'- 'Capital'-------------------------
	
	@Test(priority = 232) 
	void EntityMoreOption1() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Capital");
		
		Methods.EntityMoreOption1(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 233) 
	void Capital() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Capital");
		
		Methods.Capital(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
		
		//--------------------------'More Action'- //'Shareholding'-------------------------
		
		@Test(priority = 234) 
		void Shareholding() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding");
			
			Methods.Shareholding(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 235) 
		void Shareholdingnew() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding - New");
			
			Methods.Shareholdingnew(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 236) 
		void ShareholdingInvalid() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding - New -with Invalid data");
			
			Methods.ShareholdingInvalid(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		@Test(priority = 237) 
		void ShareholdingValidation() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding -Enter two mandatory fields");
			
			Methods.ShareholdingValidation(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		@Test(priority = 238) 
		void ShareholdingValidationEmpty() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding - 'New' tab with empty field");
			
			Methods.ShareholdingValidationEmpty(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
	
		
		@Test(priority = 239) 
		void ShareholdingnewClose() throws InterruptedException, IOException
		{
			test = extent.startTest("Entity - More Action - Shareholding - 'New' tab - Close");
			
			Methods.ShareholdingnewClose(driver,test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		
		//--------------------------'More Action'- 'Debenture Holding'-------------------------
		
				@Test(priority = 240) //16/05/2023
				void DebentureHolding() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding");
					
					Methods.DebentureHolding(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 241) 
				void DebentureHoldingSearch() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Search-With Valid data");
					
					Methods.DebentureHoldingSearch(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 242) 
				void DebentureHoldingSearchInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Search-With InValid data");
					
					Methods.DebentureHoldingSearchInvalid(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 243) 
				void ClassAllDS() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding -Class-All");
					
					Methods.ClassAllDS(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 244) 
				void ClassAllNCD() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding -Class-All -NCD");
					
					Methods.ClassAllNCD(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 245) 
				void ClassAllPCD() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding -Class-All -PCD");
					
					Methods.ClassAllPCD(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 246) 
				void ClassAllFCD() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding -Class-All -FCD");
					
					Methods.ClassAllFCD(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 247) 
				void ClearFilter() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Clear Filter");
					
					Methods.ClearFilter(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 248) 
				void AddNewDH() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -with Valid Data");
					
					Methods.AddNewDH(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 249) 
				void AddNewDHTwoMan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New - with Two mandatory field");
					
					Methods.AddNewDHTwoMan(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 250) //17/05/2023
				void AddNewInvalidData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New - with invalid Data");
					
					Methods.AddNewInvalidData(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 251)
				void AddNewDHEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New - with empty File");
					
					Methods.AddNewDHEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 252)
				void AddNewClose() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New - Close");
					
					Methods.AddNewClose(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 253) 
				void DHD() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details");
					
					Methods.DHD(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 254) 
				void DHDAddNew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details -Add New");
					
					Methods.DHDAddNew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 255) 
				void DHDAddNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details -Add New - with Empty Feilds ");
					
					Methods.DHDAddNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 256) 
				void DHDAddNewClose() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details -Add New -Close Button ");
					
					Methods.DHDAddNewClose(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 257) //18/05/2023
				void DHDUpload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - Valid Data");
					
					Methods.DHDUpload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 258) 
				void DHDUploadED() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with Existing data");
					
					Methods.DHDUploadED(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 259) 
				void DHDUploadInvalidData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with Invalid data");
					
					Methods.DHDUploadInvalidData(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 260) 
				void DHDUploadEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with Empty File");
					
					Methods.DHDUploadEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 261) 
				void DHDUploadInvalidEx() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with invalid File type extension");
					
					Methods.DHDUploadInvalidEx(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 262) 
				void DHDUploadwithoutFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - withOut File");
					
					Methods.DHDUploadwithoutFile(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 263) 
				void DHUpload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with Valid Data File");
					
					Methods.DHUpload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 264) 
				void DHUploadInvalidData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with InValid Data File");
					
					Methods.DHUploadInvalidData(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 265) 
				void DHUploadED() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with Existing Data ");
					
					Methods.DHUploadED(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 266) 
				void DHUploadEmptyFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with empty File ");
					
					Methods.DHUploadEmptyFile(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 267) 
				void DHUploadinvalidExten() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with invalid File type extension ");
					
					Methods.DHUploadinvalidExten(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 268) 
				void DHUploadWithOutFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Upload - without File ");
					
					Methods.DHUploadWithOutFile(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 269) //19/05/2023
				void DHMaster() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Master ");
					
					Methods.DHMaster(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 270) 
				void DHEdit() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Edit - Click");
					
					Methods.DHEdit(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 271) 
				void DHEditE() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Edit ");
					
					Methods.DHEditE(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 272) 
				void DHEditClose() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Edit - Close");
					
					Methods.DHEditClose(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 273) 
				void DHDelete() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Delete -YES");
					
					Methods.DHDelete(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 274) 
				void DHDeleteCan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Delete - NO");
					
					Methods.DHDeleteCan(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 275) 
				void DHEditInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Edit - With Invalid Data");
					
					Methods.DHEditInvalid(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 276) 
				void DHDAddNewInvalidData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Add New - With Invalid Data");
					
					Methods.DHDAddNewInvalidData(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				*/
		/*snehal		// ------------------- More Action -Auditors - Secretarial Auditor  --------------------------------
				
			//	@Test(priority = 277) //22/05/2023
				void SecretarialAuditor() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - click ");
					
					Methods.SecretarialAuditor(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
		//		@Test(priority = 278) 
				void SAAddNew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Add New ");
					
					Methods.SAAddNew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
		//		@Test(priority = 279) 
				void SAAddNewAE() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Add New - With Existing data");
					
					Methods.SAAddNewAE(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
		//		@Test(priority = 280) 
				void SAAddNewTwoMan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Add New - With two mandatory fields");
					
					Methods.SAAddNewTwoMan(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 281) 
				void SAAddNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Add New - With Empty fields");
					
					Methods.SAAddNewEmpty(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 282) 
				void SAAddNewClose() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Add New - Close");
					
					Methods.SAAddNewClose(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
		//		@Test(priority = 283) 
				void SAClearFilter() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Clear Filter");
					
					Methods.SAClearFilter(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 284) 
				void SAEditClose() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Edit - Close");
					
					Methods.SAEditClose(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 285) 
				void ResignationofAuditor() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Resignation of Auditor - With Valid data ");
					
					Methods.ResignationofAuditor(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 286) 
				void ResignationofAuditorEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Resignation of Auditor - With Empty Fileds ");
					
					Methods.ResignationofAuditorEmpty(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 287) //23/05/2023
				void ResignationofAuditorCancel() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Resignation of Auditor - Cancel ");
					
					Methods.ResignationofAuditorCancel(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 288) 
				void ResignationofAuditorClose() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Resignation of Auditor - Close ");
					
					Methods.ResignationofAuditorClose(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				
				// ------------------- More Action -Auditors - Cost Auditor --------------------------------
				
			//	@Test(priority = 289) 
				void CostAuditor() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Click  ");
					
					Methods.CostAuditor(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 290) 
				void CostAuditorAddNew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Add New  ");
					
					Methods.CostAuditorAddNew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 291) 
				void CostAuditorAddNewED() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Add New - with Existing data ");
					
					Methods.CostAuditorAddNewED(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 292) 
				void CostAuditorAddNewTwoMan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Add New - with two mandatory fields ");
					
					Methods.CostAuditorAddNewTwoMan(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 293) 
				void CostAuditorAddNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Add New - with Empty fields ");
					
					Methods.CostAuditorAddNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
		//		@Test(priority = 294) 
				void CAAddNewClose() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Add New - Close ");
					
					Methods.CAAddNewClose(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 295) 
				void CAClearFilter() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Clear Filter ");
					
					Methods.CAClearFilter(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}		
				
			//	@Test(priority = 296) 
				void CAEditClose() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Edit - Close ");
					
					Methods.CAEditClose(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}		
				
			//	@Test(priority = 297) 
				void ResignationofAuditorCA() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Resignation of Auditor - With Valid data ");
					
					Methods.ResignationofAuditorCA(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
		//		@Test(priority = 298) //24/05/2023
				void ResignationofAuditorEmptyCA() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Resignation of Auditor - With Empty fields ");
					
					Methods.ResignationofAuditorEmptyCA(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 299) 
				void ResignationofAuditorCancelCA() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Resignation of Auditor - Cancel ");
					
					Methods.ResignationofAuditorCancelCA(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 300) 
				void ResignationofAuditorCloseCA() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Resignation of Auditor - Close ");
					
					Methods.ResignationofAuditorCloseCA(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	*/
				
				// ------------------- More Action - Statutory Registers --------------------------------
				
				@Test(priority = 301) 
				void StatutoryRegisters() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - Click ");
					
					Methods.StatutoryRegisters(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			@Test(priority = 302) 
				void SRDEPOSIT() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Click ");
					
					Methods.SRDEPOSIT(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 303) 
				void SRDEPOSITAddnew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers - Deposit - Add New ");
					
					Methods.SRDEPOSITAddnew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				
				@Test(priority = 304) 
				void SRDEPOSITAddnewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Add New - with Empty Field ");
					
					Methods.SRDEPOSITAddnewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			@Test(priority = 305) 
				void SRDEPOSITUpload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action- Statutory Registers - Deposit - Upload - With valid data");
					
					Methods.SRDEPOSITUpload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 306) 
				void SRDEPOSITUploadInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Upload - With Invalid data");
					
					Methods.SRDEPOSITUploadInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			@Test(priority = 307) 
				void SRDEPOSITUploadEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Upload - With Empty File");
					
					Methods.SRDEPOSITUploadEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 308) 
				void SRDEPOSITUploadInvalidEx() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Upload - With Invalid File Format");
					
					Methods.SRDEPOSITUploadInvalidEx(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 309) 
				void SRDEPOSITDwonGR() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Generate Register");
					
					Methods.SRDEPOSITDwonGR(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 310) 
				void SRDEPOSITEdit() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Edit");
					
					Methods.SRDEPOSITEdit(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				
				@Test(priority = 311) //1/06/2023
				void SRSH2() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Click ");
					
					Methods.SRSH2(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 312) 
				void SRSH2AddNew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Add New ");
					
					Methods.SRSH2AddNew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 313) 
				void SRSH2AddNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Add New -With Empty Fields ");
					
					Methods.SRSH2AddNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
					
				@Test(priority = 314) 
				void SRSH2Upload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Upload - With Vaild Data");
					
					Methods.SRSH2Upload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
					
				@Test(priority = 315) 
				void SRSH2UploadInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Upload - With InVaild Data");
					
					Methods.SRSH2UploadInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 317) 
				void SRSH2UploadEmptyFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Upload - With Empty File");
					
					Methods.SRSH2UploadEmptyFile(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
		     	@Test(priority = 318) 
				void SRSH2UploadInValidEx() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Upload - With Invalid File Format");
					
					Methods.SRSH2UploadInValidEx(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 319) 
				void SRSh2DwonGR() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  SH-2 - Generate Register");
					
					Methods.SRSh2DwonGR(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 320) 
				void SRSh2Edit() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  SH-2 - Edit");
					
					Methods.SRSh2Edit(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 321) //2/06/2023
				void SRSH3() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Click ");
					
					Methods.SRSH3(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 322) 
				void SRSH3AddNew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Add New - With valid Data");
					
					Methods.SRSH3AddNew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 323) 
				void SRSH3AddNewInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Add New - With Invalid Data");
					
					Methods.SRSH3AddNewInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 324) 
				void SRSH3AddNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Add New - With Empty Fields");
					
					Methods.SRSH3AddNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 325) 
				void SRSH3Upload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Upload - With valid data");
					
					Methods.SRSH3Upload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 326) 
				void SRSH3UploadInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Upload - With Invalid data");
					
					Methods.SRSH3UploadInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 327) 
				void SRSH3UploadWithoutData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Upload -   without filling data in Excel file");
					
					Methods.SRSH3UploadWithoutData(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 328) 
				void SRSH3UploadInValidEx() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Upload - With Invalid File Format");
					
					Methods.SRSH3UploadInValidEx(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 329) 
				void SRSh3DwonGR() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  SH-3 - Generate Register");
					
					Methods.SRSh3DwonGR(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 330) 
				void SRSH3Edit() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  SH-3 - Edit - with Valid Data");
					
					Methods.SRSH3Edit(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 331) 
				void SRSH3EditInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  SH-3 - Edit - with Invalid Data");
					
					Methods.SRSH3EditInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 332) 
				void SRSH6() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Click ");
					
					Methods.SRSH6(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 333) //5/06/2023
				void SRSH6AddNew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Add New - with valid Data");
					
					Methods.SRSH6AddNew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 334) 
				void SRSH6AddNewInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Add New - with Invalid Data");
					
					Methods.SRSH6AddNewInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 335) 
				void SRSH6AddNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Add New - with Empty Fields");
					
					Methods.SRSH6AddNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 336) 
				void SRSH6Upload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Upload - With valid data");
					
					Methods.SRSH6Upload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 337) 
				void SRSH6UploadInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Upload - With Invalid data");
					
					Methods.SRSH6UploadInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 338) 
				void SRSH6UploadInValidEx() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Upload - With Invalid File Format");
					
					Methods.SRSH6UploadInValidEx(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
	   			@Test(priority = 339) 
				void SRSh6DwonGR() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  SH-6 - Generate Register");
					
					Methods.SRSh6DwonGR(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 340) 
				void SRSH6Edit() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  SH-6 - Edit");
					
					Methods.SRSH6Edit(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 341) 
				void SRSH6EditInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  SH-6 - Edit - with Invalid data");
					
					Methods.SRSH6EditInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 342) 
				void SRCHG7() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Click ");
					
					Methods.SRCHG7(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 343) //06/06/2023
				void SRCHG7AddNew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Add New - With Valid Data ");
					
					Methods.SRCHG7AddNew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 344) 
				void SRCHG7AddNewInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Add New - With InValid Data ");
					
					Methods.SRCHG7AddNewInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 345) 
				void SRCHG7AddnewTwoman() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Add New -  with two mandatory field ");
					
					Methods.SRCHG7AddnewTwoman(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
	         	@Test(priority = 346) 
				void SRCHG7AddnewEmptyFields() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Add New -  with Empty fields ");
					
					Methods.SRCHG7AddnewEmptyFields(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 347) 
				void SRCHG7Upload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Upload-  with Valid Data ");
					
					Methods.SRCHG7Upload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 348) 
				void SRCHG7UploadInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Upload-  with InValid Data ");
					
					Methods.SRCHG7UploadInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 349) 
				void SRCHG7UploadEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Upload-  without filling data in Excel file ");
					
					Methods.SRCHG7UploadEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 350) 
				void SRCHG7UploadInvalidFormat() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Upload -  with Invalid File Format ");
					
					Methods.SRCHG7UploadInvalidFormat(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 351) 
				void SRCHG7UploadwithOutFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Upload-  without selecting a file");
					
					Methods.SRCHG7UploadwithOutFile(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 352) 
				void SRCHG7DwonGR() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7 - Generate Register");
					
					Methods.SRCHG7DwonGR(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 353) 
				void ChargeDetailsAddNew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Add New - With Valid Data ");
					
					Methods.ChargeDetailsAddNew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
			
				@Test(priority = 354) //07/06/2023
				void SRCHG7ViewAddNewInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7 - View - Add New - With InValid Data ");
					
					Methods.SRCHG7ViewAddNewInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 355) 
				void ChargeDetailsAddNewtwoMan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Add New -  with two mandatory field ");
					
					Methods.ChargeDetailsAddNewtwoMan(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 356) 
				void ChargeDetailsAddNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Add New -  with Empty field ");
					
					Methods.ChargeDetailsAddNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
		//		@Test(priority = 357) not run
				void ChargeDetailsEdit() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Edit -  with valid data ");
					
					Methods.ChargeDetailsEdit(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			//	@Test(priority = 358) 
				void SRCHG7ViewEditInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Edit -  with Invalid data ");
					
					Methods.SRCHG7ViewEditInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 359) 
				void SRCHG7ViewUpload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Upload -  with valid data ");
					
					Methods.SRCHG7ViewUpload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 360) 
				void SRCHG7ViewUploadWF() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Upload -  without selecting a file ");
					
					Methods.SRCHG7ViewUploadWF(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 361) 
				void SRCHG7ViewDoc() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Document -  'document' button is clickable or not Verification ");
					
					Methods.SRCHG7ViewDoc(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			@Test(priority = 362) 
				void SRCHG7ViewDocument() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Document -  download  or not Verification ");
					
					Methods.SRCHG7ViewDocument(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 363) 
				void SRCHG7View2Document() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Document - View");
					
					Methods.SRCHG7View2Document(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 364) //09/06/2023
				void SRMBP2() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Click ");
					
					Methods.SRMBP2(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
		//	@Test(priority = 365) 
				void SRMBP2AddNew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - With valid Data ");
					
					Methods.SRMBP2AddNew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
					
				@Test(priority = 366) 
				void SRMBP2AddNewInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - with Invalid Data ");
					
					Methods.SRMBP2AddNewInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 367) 
				void SRMBP2AddNewTwoMan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - with two mandatory field ");
					
					Methods.SRMBP2AddNewTwoMan(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 368) 
				void SRMBP2AddNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - with Empty data");
					
					Methods.SRMBP2AddNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 369) 
				void SRMBP2AddNewGurantee() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Gurantee With valid Data ");
					
					Methods.SRMBP2AddNewGurantee(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 370) 
				void SRMBP2AddNewInvalidGura() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Gurantee With Invalid Data ");
					
					Methods.SRMBP2AddNewInvalidGura(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 371) 
				void SRMBP2AddNewGuraTwoMan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Gurantee with two mandatory field ");
					
					Methods.SRMBP2AddNewGuraTwoMan(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 372) 
				void SRMBP2AddGuraNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Gurantee with Empty data");
					
					Methods.SRMBP2AddGuraNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 373) 
				void SRMBP2AddNewLoan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Loan With valid Data ");
					
					Methods.SRMBP2AddNewLoan(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 374) 
				void SRMBP2AddNewInvalidLoan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Loan With Invalid Data ");
					
					Methods.SRMBP2AddNewInvalidLoan(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 375) 
				void SRMBP2AddNewLoanTwoMan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Loan with two mandatory field ");
					
					Methods.SRMBP2AddNewLoanTwoMan(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 376) 
				void SRMBP2AddLoanNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Loan with Empty data");
					
					Methods.SRMBP2AddGuraNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 377) 
				void SRMBP2AddNewSecurity() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Security With valid Data ");
					
					Methods.SRMBP2AddNewSecurity(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 378) 
				void SRMBP2AddNewInvalidSecurity() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Security With Invalid Data ");
					
					Methods.SRMBP2AddNewInvalidSecurity(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			//	@Test(priority = 379) 
				void SRMBP2AddNewSecuTwoMan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Security with two mandatory field ");
					
					Methods.SRMBP2AddNewSecuTwoMan(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 380) 
				void SRMBP2AddSecuNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Security with Empty data");
					
					Methods.SRMBP2AddSecuNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 381)  //12/09/2023
				void SRMB2Upload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Upload - with Valid Data");
					
					Methods.SRMB2Upload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 382) 
				void SRMB2UploadInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Upload - with Invalid Data");
					
					Methods.SRMB2UploadInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 383) 
				void SRMB2UploadWithoutData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Upload - without filling data in Excel file ");
					
					Methods.SRMB2UploadWithoutData(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 384) 
				void SRMB2UploadInvalidformate() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Upload -  with Invalid File Format ");
					
					Methods.SRMB2UploadInvalidformat(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 385) 
				void SRMB2GR() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Generate Register'  ");
					
					Methods.SRMB2GR(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 386) 
				void SRMB2approvedLimitEdit() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - edit approved limit details  ");
					
					Methods.SRMB2approvedLimitEdit(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
			
				@Test(priority = 387) 
				void SRMB2approvedLimitEditClosed() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - edit approved limit details - Close ");
					
					Methods.SRMB2approvedLimitEditClosed(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 388) 
				void SRMBP2Edit() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - edit - With Valid data ");
					
					Methods.SRMBP2Edit(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 389) 
				void SRMBP2EditInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - edit - With InValid data ");
					
					Methods.SRMBP2EditInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 390) 
				void SRMB2UploadActionTab() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Upload' button which is present under Action tab - With Valid data ");
					
					Methods.SRMB2UploadActionTab(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 391) 
				void SRMB2UploadwithoutFileActionTab() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Upload' button which is present under Action tab - WithOut Selecting File ");
					
					Methods.SRMB2UploadwithoutFileActionTab(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 392) //13/06/2023
				void SRMB2DocActionTab() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - 'document' button is clickable or not verification");
					
					Methods.SRMB2DocActionTab(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 393) 
				void SRMB2DocDwonActionTab() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - 'document' - download or not verification ");
					
					Methods.SRMB2DocDwonActionTab(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 394) 
				void SRMB2DocViewActionTab() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - 'document' - View or not verification ");
					
					Methods.SRMB2DocViewActionTab(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}
				
			@Test(priority = 395) 
				void SRMBP3() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-3 - Click ");
					
					Methods.SRMBP3(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 396) 
				void SRMBP3AddNew() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-3 - Add New - with Valid data ");
					
					Methods.SRMBP3AddNew(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 397) //14/06/2023
				void SRMBP3AddNewInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-3 - Add New - with InValid data ");
					
					Methods.SRMBP3AddNewInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 398) 
				void SRMBP3AddNewTwoMan() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-3 - Add New -  with two mandatory field ");
					
					Methods.SRMBP3AddNewTwoMan(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			@Test(priority = 399) 
				void SRMBP3AddNewEmpty() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-3 - Add New -  with two Empty data ");
					
					Methods.SRMBP3AddNewEmpty(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 400) 
				void SRMB3Upload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action- Statutory Registers -   MBP-3  - Upload - With valid data");
					
					Methods.SRMB3Upload(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				
				@Test(priority = 401) 
				void SRMB3UploadInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action- Statutory Registers -   MBP-3  - Upload - With Invalid data");
					
					Methods.SRMB3UploadInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 402) 
				void SRMB3UploadWithOutData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action- Statutory Registers -   MBP-3  - Upload - without filling data in Excel file ");
					
					Methods.SRMB3UploadWithOutData(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
			
				@Test(priority = 403) 
				void SRMB3UploadInvalidFormate() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action- Statutory Registers -   MBP-3  - Upload - with Invalid File Format ");
					
					Methods.SRMB3UploadInvalidFormate(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 404) 
				void SRMB3DwonGR() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - MBP-3  - Generate Register");
					
					Methods.SRMB3DwonGR(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 405) 
				void SRMBP3Edit() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - MBP-3  -Edit - With Valid Data");
					
					Methods.SRMBP3Edit(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 406) 
				void SRMBP3EditInvalid() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Registers - MBP-3  -Edit - With InValid Data");
					
					Methods.SRMBP3EditInvalid(driver,test,workbook);
					
					extent.endTest(test);
					extent.flush();
				}		
				
				
				//Snehal
				@Test(priority =407) 
				void ClickMBP4() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab ");
					
					Methods.ClickMBP4(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority =408) 
				void ClickUploadExistingRegistor() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Upload File with valid data ");
					
					Methods.ClickUploadExistingRegistorValidData(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 409) 
				void ClickUploadExistingRegistorInvalidData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Upload File with Invalid data ");
					
					Methods.ClickUploadExistingRegistorInvalidData(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority = 410) 
				void ClickUploadExistingRegistorDupliacteData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Upload File with Duplicate data ");
					
					Methods.ClickUploadExistingRegistorDupliacteData(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
			@Test(priority = 411) 
				void ClickUploadExistingRegistorWithoutData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Upload File without data ");
					
					Methods.ClickUploadExistingRegistorWithoutData(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 412) 
				void ClickUploadExistingRegistorInvalidFileFormat() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Invalid File Format ");
					
					Methods.ClickUploadExistingRegistorInvalidFileFormat(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				
				@Test(priority = 413) 
				void ClickUploadExistingRegistorWithoutSelectingFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Without selecting file ");
					
					Methods.ClickUploadExistingRegistorWithoutSelectingFile(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority = 414) 
				void ClickUploadOldRegistorWithValidFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old-with valid file ");
					
					Methods.ClickUploadOldRegistorWithValidFile(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority =415) 
				void ClickUploadOldRegistorWithInValidFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old-with invalid Data ");
					
					Methods.ClickUploadOldRegistorWithInValidFile(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority =416) 
				void ClickUploadOldRegistorWithDuplicateData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old-with Duplicate data ");
					
					Methods.ClickUploadOldRegistorWithDuplicateData(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority =417) 
				void ClickUploadOldRegistorWithoutData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old Btn-without data ");
					
					Methods.ClickUploadOldRegistorWithoutData(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =418) 
				void ClickUploadOldRegistorInvalidFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old Btn-Invalid File ");
					
					Methods.ClickUploadOldRegistorInvalidFile(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority =419) 
				void ClickUploadOldRegistorWithoutSelectFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old Btn- Without selecting file ");
					
					Methods.ClickUploadOldRegistorWithoutSelectFile(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =420) 
				void ClickGenerateRegistor() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab");
					
					Methods.ClickGenerateRegistor(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =421) 
				void ClickDownloadExisitingRegisterOfMBP4() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-Existing Download Report");
					
					Methods.ClickDownloadExisitingRegisterOfMBP4(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
			@Test(priority =422) 
				void ClickDownloadOldRegisterOfMBP4() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-Old Download Report");
					
					Methods.ClickDownloadOldRegisterOfMBP4(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =423) 
				void ClickDownloadAllRegisterOfMBP4() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-All btn -Download Report");
					
					Methods.ClickDownloadAllRegisterOfMBP4(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority =424) 
				void ClickViewExisitingRegisterOfMBP4() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-Existing- Viewed Document");
					
					Methods.ClickViewExisitingRegisterOfMBP4(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
			
				@Test(priority =425) 
				void ClickViewOldRegisterOfMBP4() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-Old Btn- Viewed Document");
					
					Methods.ClickViewOldRegisterOfMBP4(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}	
				
				@Test(priority =426) 
				void ClickViewAllRegisterOfMBP4() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-All Btn- Viewed Document");
					
					Methods.ClickViewAllRegisterOfMBP4(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =427) 
				void clickPASTROD() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab");
					
					Methods.clickPASTROD(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =428) 
				void clickPASTRODwithValidData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-With valid data");
					
					Methods.clickPASTRODwithValidData(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =429) 
				void clickPASTRODwithInValidData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-With invalid data");
					
					Methods.clickPASTRODwithInValidData(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =430) 
				void clickPASTRODwithDuplicateData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-With Duplicate data");
					
					Methods.clickPASTRODwithDuplicateData(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =431) 
				void clickPASTRODwithoutData() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-Without data");
					
					Methods.clickPASTRODwithoutData(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =432) 
				void clickPASTRODInvalidFile() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-Invliad File Format");
					
					Methods.clickPASTRODInvalidFile(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =433) 
				void clickPASTRODGenerateRegistor() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-Generate Registor Tab");
					
					Methods.clickPASTRODGenerateRegistor(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				
				@Test(priority =434) 
				void clickPASTRODGenerateRegistorDownload() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-Generate Registor Tab - Download Report");
					
					Methods.clickPASTRODGenerateRegistorDownload(driver,test);
					
					extent.endTest(test);
					extent.flush();
				}
				@Test(priority =435) 
				void clickPASTRODGenerateRegistorview() throws InterruptedException, IOException
				{
					test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-Generate Registor Tab - View Document");
					
					Methods.clickPASTRODGenerateRegistorDownload(driver,test);
					
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
			
	/*
//	@Test(priority = 32) //not completed
	void CapitalA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Capital");
		
		Methods.CapitalA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 33) //not completed
	void PreferenceShareCapital() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Capital");
		
		Methods.PreferenceShareCapital(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 34) 
	void ApplicabilityClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Applicability");
		
		Methods.ApplicabilityClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 35) //not completed
	void Applicability() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Applicability");
		
		Methods.Applicability(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 36) //not completed
	void ApplicabilityClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - More Action - Applicability");
		
		Methods.ApplicabilityClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	*/
	
//	@Test(priority = 16)
	void BankDetailInvalidSC() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add bank details with Special charecter");
		
		Methods.BankDetailInvalidSC(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	
}
