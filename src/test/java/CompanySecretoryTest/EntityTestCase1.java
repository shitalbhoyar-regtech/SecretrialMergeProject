package CompanySecretoryTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import CompnaySecretory.EntityMasterMethod;
import secretrial.Methods;

public class EntityTestCase1 {
	
	public static WebDriver driver = null;		//WebDriver instance created
	public static WebElement upload = null;		//WebElement to get upload button
	public static ExtentReports extent;			//Instance created for report file
	public static ExtentTest test;				//Instance created for tests
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	public static List<WebElement> elemeList = null;
	
	public static XSSFSheet ReadExcel() throws IOException
	{
		//String workingDir = System.getProperty("user.dir");
		fis = new FileInputStream("D:\\DotNetScretarial\\Secretarial-Project-26JULY23\\TestData\\SecreterialSheet3.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		String workingDir =  System.getProperty("user.dir");
		extent = new com.relevantcodes.extentreports.ExtentReports(workingDir+"//Reports//EntityMaster.html",true);
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
	//------------------------------Deemed Public Company---------------------------
	
	
	@Test(priority = 0)
	
	void EntityTab() throws InterruptedException, IOException
	{
		test = extent.startTest(" Entity Tab Verification");
		
		Methods.EntityTab(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}

	
	@Test(priority = 1)
	
		void EntityType() throws InterruptedException, IOException
		{
			test = extent.startTest(" Entity Type Verification");
			
			EntityMasterMethod. DeemedPublicCompany(driver, test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}

	@Test(priority =2 )
	void TwoMandatoryFields() throws InterruptedException, IOException
	{
		test = extent.startTest("Two Mandatory Fields Verification");
		
		EntityMasterMethod. TwoMandatoryFields(driver, test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
   @Test(priority = 3)
	void WithoutEnteringField() throws InterruptedException, IOException
	{
		test = extent.startTest("Without Entering  Fields Verification");
		
		EntityMasterMethod. WithouEnteringField(driver, test,workbook);
		 
		extent.endTest(test);
		extent.flush();
	}
  @Test(priority = 4)

  void CloseBtn() throws InterruptedException, IOException
  {
	test = extent.startTest("Close Button Verification");
	
	EntityMasterMethod.CloseBtn(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

  @Test(priority =5)

  void AddEntity() throws InterruptedException, IOException
 {
	test = extent.startTest(" Add DeemedPublic Company Verification");
	
	EntityMasterMethod.AddDeemedPublicCompany(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
 }
 @Test(priority = 6)

void EnterInvalidData() throws InterruptedException, IOException
{
	test = extent.startTest(" Invalid Data Verification");
	
	EntityMasterMethod.EnterInvalidData(driver, test);
	
	extent.endTest(test);
	extent.flush();
}


@Test(priority = 7)

void EditIcon() throws InterruptedException, IOException
{
	test = extent.startTest("Update Entity Verification");
	
	EntityMasterMethod.EditIcon(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}


@Test(priority = 8)

void InvalidEditIcon() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid field Entity Verification");
	
	EntityMasterMethod.InvalidEditIcon(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 9)

void EditCloseBtn() throws InterruptedException, IOException
{
	test = extent.startTest("Edit = Close Button Verification");
	
	EntityMasterMethod.EditCloseBtn(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 10)

void BuisnessActivity() throws InterruptedException, IOException
{
	test = extent.startTest("Buisness Activity Tab Verification");
	
	EntityMasterMethod.BuisnessActivity(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 11)

void AddBuisnessActivity() throws InterruptedException, IOException
{
	test = extent.startTest("Buisness Activity - Add Tab Verification");
	
	EntityMasterMethod.AddBuisnessActivity(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 12)

void NoDataFound() throws InterruptedException, IOException
{
	test = extent.startTest("Buisness Activity Tab Verification");
	
	EntityMasterMethod.BAnotFound(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 13)

void WithOutEnterData() throws InterruptedException, IOException
{
	test = extent.startTest("Without Enter Data Buisness Activity  Verification");
	
	EntityMasterMethod.WithoutEnterData(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 14)

void EditBA() throws InterruptedException, IOException
{
	test = extent.startTest("Update Buisness Activity  Verification");
	
	EntityMasterMethod.EditBA(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 15)

void BADeleteIcon() throws InterruptedException, IOException
{
	test = extent.startTest("Delete Icon Buisness Activity  Verification");
	
	EntityMasterMethod.BADeleteIcon(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 16)

void BACloseBtn() throws InterruptedException, IOException
{
	test = extent.startTest("Close Button Buisness Activity  Verification");
	
	EntityMasterMethod.BACloseBtn(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 17)

void DocumentTab() throws InterruptedException, IOException
{
	test = extent.startTest("Document tab  Verification");
	
	EntityMasterMethod.DocumentTab(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 18)

void AddDocument() throws InterruptedException, IOException
{
	test = extent.startTest("Add Document Verification");
	
	EntityMasterMethod.AddNewDocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 19)

void AlreadyExistDocument() throws InterruptedException, IOException
{
	test = extent.startTest("Already Exists Document Verification");
	
	EntityMasterMethod.AlreadyExistDocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 20)

void WithoutEnteringDoc() throws InterruptedException, IOException
{
	test = extent.startTest("Without Upload Document Verification");
	
	EntityMasterMethod.WithoutEnteringDocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 21)

void DownloadDocument() throws InterruptedException, IOException
{
	test = extent.startTest("Download Document Verification");
	
	EntityMasterMethod.DownloadDocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 22)

void DeleteDocument() throws InterruptedException, IOException
{
	test = extent.startTest("Delete Document Verification");
	
	EntityMasterMethod.DeleteDocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 23)

void AddAOA() throws InterruptedException, IOException
{
	test = extent.startTest("Add Article of Association(AOA) Document Verification");
	
	EntityMasterMethod.AddAOA(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 24)

void ExistingAOADocument() throws InterruptedException, IOException
{
	test = extent.startTest("Existing Article of Association(AOA) Document Verification");
	
	EntityMasterMethod.ExistingAOADocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}


@Test(priority = 25)

void WithoutEnterignAOADocument() throws InterruptedException, IOException
{
	test = extent.startTest("Without enetring Article of Association(AOA) Document Verification");
	
	EntityMasterMethod.WithoutEnteringAOADocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 26)

void DownloadAOADocument() throws InterruptedException, IOException
{
	test = extent.startTest("Article of Association(AOA)  Download Document Verification");
	
	EntityMasterMethod.DownloadAOADocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 27)

void DeleteAOADocument() throws InterruptedException, IOException
{
	test = extent.startTest("Article of Association(AOA)  Delete Document Verification");
	
	EntityMasterMethod.DeleteAOADocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}


@Test(priority = 28)
void AddCOI() throws InterruptedException
{
	test=extent.startTest("Certificate of Incorporation(COI) Add Document Verification");
	
	EntityMasterMethod.AddCOI(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 29)
void ExistingCOIDocument() throws InterruptedException
{
	test=extent.startTest("Existing Certificate of Incorporation(COI)  Document Verification");
	
	EntityMasterMethod.ExistingCOIDocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 30)

void WithoutEnterignCOIDocument() throws InterruptedException, IOException
{
	test = extent.startTest("Without enetring Certificate of Incorporation(COI) Document Verification");
	
	EntityMasterMethod.WithoutEnteringCOIDocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 31)
void AddPolicyDoc() throws InterruptedException, IOException
{
	test = extent.startTest("Add Policy  Document Verification");
	
	EntityMasterMethod.AddPolicyDoc(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 32)

void ExistingPolicyDoc() throws InterruptedException, IOException
{
	test = extent.startTest("Existing Policy  Document Verification");
	
	EntityMasterMethod.ExistingPolicyDoc(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 33)

void WithoutEnterignPolicyDocument() throws InterruptedException, IOException
{
	test = extent.startTest("Without enetring Policy Document Verification");
	
	EntityMasterMethod.WithoutEnteringPolicyDocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 34)

void AddLicenseRegistration() throws InterruptedException, IOException
{
	test = extent.startTest("Add License/Registration  Document Verification");
	
	EntityMasterMethod.AddLicenseRegistration(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 35)

void WithoutEnteringLicenseRegistrationDocument() throws InterruptedException, IOException
{
	test = extent.startTest("Without upload  License/Registration  Document Verification");
	
	EntityMasterMethod.WithoutEnteringLicenseRegistrationDocument(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 36)

void AddExistingLicenseRegistration() throws InterruptedException, IOException
{
	test = extent.startTest("Add Existing License/Registration  Document Verification");
	
	EntityMasterMethod.AddExistingLicenseRegistration(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 37)

void AddAnnualReport() throws InterruptedException, IOException
{
	test = extent.startTest("Add Annual Report  Document Verification");
	
	EntityMasterMethod.AddAnnualReport(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 38)

void AddExistingDataAnnualReport() throws InterruptedException, IOException
{
	test = extent.startTest("Add Existing Data Annual Report  Document Verification");
	
	EntityMasterMethod.AddExistingDataAnnualReport(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 39)

void WithoutUploadFileAnnualReport() throws InterruptedException, IOException
{
	test = extent.startTest("Without Upload File Annual Report Verification");
	
	EntityMasterMethod.WithoutUploadFileAnnualReport(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 40)

void BranchDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Branch Detailes Verification");
	
	EntityMasterMethod.BranchDetailes(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 41) //pending

void AddBranchDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Add Branch Detailes Verification");
	
	EntityMasterMethod.AddBranchDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 42)

void InvaliddBranchDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid Branch Detailes Verification");
	
	EntityMasterMethod.InvaliddBranchDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 43)

void TwoMandatoryFieldsBranchDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Two Mandatory Fields Branch Detailes Verification");
	
	EntityMasterMethod.TwoMandatoryFieldsBranchDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority = 44)// msg not displayed

void WithoutEnteringDataBranchDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Without Entering Fields Branch Detailes Verification");
	
	EntityMasterMethod.WithoutEnteringDataBranchDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 45)  //after clicking on edit loader 

void EditBranchDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Update Branch Detailes Verification");
	
	EntityMasterMethod.EditBranchDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 46)

void UploadDocBranchDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Upload Document  Branch Detailes Verification");
	
	EntityMasterMethod.UploadDocBranchDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 47)

void InvalidUploadDocBranchDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid Upload Document  Branch Detailes Verification");
	
	EntityMasterMethod.InvalidUploadDocBranchDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 48)

void MultipleFileUploadDocBranchDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Multiple File Upload Branch Detailes Verification");
	
	EntityMasterMethod.MultipleFileUploadDocBranchDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 49)

void WithoutUploadDocBranchDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Without Upload File Branch Detailes Verification");
	
	EntityMasterMethod.WithoutUploadDocBranchDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 50)

void CloseBranchDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Close Button Branch Detailes Verification");
	
	EntityMasterMethod.CloseBranchDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
		
@Test(priority = 51)

void BankDetailes() throws InterruptedException, IOException
{
	test = extent.startTest(" Bank Detailes Verification");
	
	EntityMasterMethod.BankDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}


@Test(priority = 52)

void AddBankDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Add Bank Detailes Verification");
	
	EntityMasterMethod.AddBankDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 53)

void DuplicateBankDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Duplicate Bank Detailes Verification");
	
	EntityMasterMethod.DuplicateBankDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 54)  //message not displayed box highlight in red

void InvalidAccountNo() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid Account No Verification");
	
	EntityMasterMethod.InvalidAccountNo(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 55)//message not displayed box highlight in red

void InvalidBankName() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid Bank Name Verification");
	
	EntityMasterMethod.InvalidBankName(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 56)//message not displayed box highlight in red


void InvalidIFSC() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid Bank IFSC Number Verification");
	
	EntityMasterMethod.InvalidIFSC(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
		
@Test(priority = 57)//pending

void DeleteBankDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Delete Confirmation Bank Detailes Verification");
	
	EntityMasterMethod.DeleteBankDetailes(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 58)////pending

void DeleteBankDetailes1() throws InterruptedException, IOException
{
	test = extent.startTest(" Cancel button Bank Detailes Verification");
	
	EntityMasterMethod.DeleteBankDetailes1(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 59)

void LimitedLiabilityPartnership() throws InterruptedException, IOException
{
	test = extent.startTest("Limited Liability Partnership Verification");
	
	EntityMasterMethod.LimitedLiabilityPartnership(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 60)

void BranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Branch Detailes LLP Verification");
	
	EntityMasterMethod.BranchDetailesLLP(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 61)

void AddBranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Add  Branch Detailes LLP Verification");
	
	EntityMasterMethod.AddBranchDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 62)

void InvaliddBranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid LLP Branch Detailes Verification");
	
	EntityMasterMethod.InvaliddBranchDetailes(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

//@Test(priority = 63) //msg not displayed

void WithoutEnteringDataBranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Without Entering Fields LLP Branch Detailes Verification");
	
	EntityMasterMethod.WithoutEnteringDataBranchDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 64)

void TwoMandatoryFieldsBranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Two Mandatory Fields Branch Detailes LLP Verification");
	
	EntityMasterMethod.TwoMandatoryFieldsBranchDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 65) //pending

void EditBranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Update Branch Detailes LLP Verification");
	
	EntityMasterMethod.EditBranchDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 66)

void UploadDocBranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Upload Document  Branch Detailes LLP Verification");
	
	EntityMasterMethod.UploadDocBranchDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 67)

void InvalidUploadDocBranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid Upload Document  Branch Detailes LLP Verification");
	
	EntityMasterMethod.InvalidUploadDocBranchDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 68)

void MultipleFileUploadDocBranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Multiple File Upload Branch Detailes LLP Verification");
	
	EntityMasterMethod.MultipleFileUploadDocBranchDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =69)

void InvalidMultipleFileUploadDocBranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid Multiple File Upload Branch Detailes LLP Verification");
	
	EntityMasterMethod.InvalidMultipleFileUploadDocBranchDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 70)

void WithoutUploadDocBranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Without Upload File Branch Detailes LLP Verification");
	
	EntityMasterMethod.WithoutUploadDocBranchDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 71)

void CloseBranchDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Close Button Branch Detailes LLP Verification");
	
	EntityMasterMethod.CloseBranchDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 72)

void BankDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest(" Bank Detailes LLP Verification");
	
	EntityMasterMethod.BankDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}


@Test(priority = 73)

void AddBankDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Add Bank Detailes LLP Verification");
	
	EntityMasterMethod.AddBankDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 74)

void DuplicateBankDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Duplicate Bank Detailes LLP Verification");
	
	EntityMasterMethod.DuplicateBankDetailesLLP(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority = 75)//message not displayed box highlight in red

void InvalidAccountNoLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid Account No LLP Verification");
	
	EntityMasterMethod.InvalidAccountNoLLP(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority = 76)//message not displayed box highlight in red

void InvalidBankNameLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid Bank Name LLP Verification");
	
	EntityMasterMethod.InvalidBankNameLLP(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority = 77)//message not displayed box highlight in red

void InvalidIFSCLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid IFSC LLP Verification");
	
	EntityMasterMethod.InvalidIFSCLLP(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 78)

void DeleteBankDetailesLLP() throws InterruptedException, IOException
{
	test = extent.startTest("Delete Confirmation Bank Detailes LLP Verification");
	
	EntityMasterMethod.DeleteBankDetailesLLP(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 79)

void DeleteBankDetailes1LLP() throws InterruptedException, IOException
{
	test = extent.startTest("Delete  Cancel Bank Detailes LLP Verification");
	
	EntityMasterMethod.DeleteBankDetailes1LLP(driver, test);
	
	extent.endTest(test);
	extent.flush();
}


//------------------------Upload File------------------------------------//
@Test(priority = 80)

void ValidDataEntityExcelUpload() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Valid Data Entity Excel Upload File Verification");
	
	EntityMasterMethod.EntityExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 81)
void InvalidDataEntityExcelUpload() throws InterruptedException, IOException
{
	test = extent.startTest("Enter InValid Data Entity Excel Upload File Verification");
	
	EntityMasterMethod.InvalidDataEntityExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 82)

void ExistingDataEntityExcelUpload() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Existing Data Entity Excel Upload File Verification");
	
	EntityMasterMethod.EnterExistingDataEntityExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 83)

void WithoutEnteringDataEntityExcelUpload() throws InterruptedException, IOException
{
	test = extent.startTest("Without Entering Data Entity Excel Upload File Verification");
	
	EntityMasterMethod.WithoutEnteringDataEntityExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 84)
void EnterInvalidEntityExcelUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Upload Invalid file Entity Excel Verification");
	
	EntityMasterMethod.EnterInvalidEntityExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 85)

void WithoutselectingfileEntityExcelUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Without selecting a file Entity Excel Verification");
	
	EntityMasterMethod.WithoutSelectingFileEntityExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 86)

void LLPExcelUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Valid LLP Excel Verification");
	
	EntityMasterMethod.LLPExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 87)

void InvalidDataLLPExcelUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Enter InValid Data In LLP Excel Verification");
	
	EntityMasterMethod.InvalidDataLLPExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 88)

void EnterExistingDataInvalidDataLLPExcelUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Existing Data In LLP Excel Verification");
	
	EntityMasterMethod.EnterExistingDataLLPExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 89)

void WithoutEnteringDataLLPExcelUpload() throws InterruptedException, IOException
{
	test = extent.startTest("Without Entering Data LLP Excel Upload File Verification");
	
	EntityMasterMethod.WithoutEnteringDataLLPExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 90)

void EnterInvalidLLPExcelUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Upload Invalid file LLP Excel Verification");
	
	EntityMasterMethod.EnterInvalidLLPExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 91)

void WithoutselectingfileLLPExcelUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Without selecting a file LLP Excel Verification");
	
	EntityMasterMethod.WithoutSelectingFileLLPExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 92)

void MGT7ExcelUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Upload Valid file MGT-7 Excel Verification");
	
	EntityMasterMethod.MGT7ExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 93)

void MGT7ExcelInvalidUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Upload InValid file(uploading a different file format except pdf) MGT-7 Excel Verification");
	
	EntityMasterMethod.MGT7ExcelInvalidUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 94)

void MGT7ExcelDiffInvalidUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Upload InValid Multiple(PDF file) file MGT-7 Excel Verification");
	
	EntityMasterMethod.MGT7ExcelDiffPDFInvalidUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =95)

void MGT7ExcelExistingUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Upload Existing file MGT-7 Excel Verification");
	
	EntityMasterMethod.MGT7ExcelExistingUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 96) //17/04/2025

void WithoutselectingfileMGT7ExcelUploadFile() throws InterruptedException, IOException
{
	test = extent.startTest("Without selecting a file MGT-7 Excel Verification");
	
	EntityMasterMethod.WithoutSelectingFileMGT7ExcelUploadFile(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 97)

void ClickApplicabilty() throws InterruptedException, IOException
{
	test = extent.startTest("Applicability Option is clickable or not ");
	
	EntityMasterMethod.ClickApplicabilty(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 98)

void ClickAmountInINR() throws InterruptedException, IOException
{
	test = extent.startTest("Save Applicability Verification");
	
	EntityMasterMethod.SaveApplicability(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 99)

void YesRadioBtnApplicability() throws InterruptedException, IOException
{
	test = extent.startTest("Yes Radio Btn Applicability Verification");
	
	EntityMasterMethod.YesRadioBtnApplicability(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 100)

void NoRadioBtnApplicability() throws InterruptedException, IOException
{
	test = extent.startTest("No Radio Btn Applicability Verification");
	
	EntityMasterMethod.NoRadioBtnApplicability(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 101)

void CloseApplicability() throws InterruptedException, IOException
{
	test = extent.startTest("Close Button Applicability Verification ");
	
	EntityMasterMethod.CloseApplicability(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//---------------------ShareHolding --------------------------------//
@Test(priority = 102)

void ClickShareHoldingOption() throws InterruptedException, IOException
{
	test = extent.startTest("ShareHolding Verification ");
	
	EntityMasterMethod.ClickShareHoldingOption(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 103)

void AddShareHolding() throws InterruptedException, IOException
{
	test = extent.startTest("ShareHolding Verification ");
	
	EntityMasterMethod.AddShareHolding(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 104)

void ClickShareHoldingDeatils() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action > Shareholding - edit -  To check whether user is able to click on 'Share Holding Details' tab Verification ");
	
	EntityMasterMethod.ClickShareHoldingDeatils(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 105)

void AddShareHoldingDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action > Shareholding - edit - To check whether the user is able to add 'share holding details' through 'New' tab with valid data Verification ");
	
	EntityMasterMethod.ShareHoldingDeatils(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 106)

void EnterInvaliddataFoliooftransferor() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action > Shareholding - edit - Enter Invalid data ShareHolding Detailes Verification ");
	
	EntityMasterMethod.EnterInvaliddataFoliooftransferor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 107)

void WithoutEnterDataInSahreHoldingDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action > Shareholding - edit - Without Enter Data In ShareHolding Detailes Verification ");
	
	EntityMasterMethod.WithoutEnterDataInSahreHoldingDetailes(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 108)

void CloseBtnSahreHoldingDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action > Shareholding - edit - add new - Close Button ShareHolding Detailes Verification ");
	
	EntityMasterMethod.CloseBtnSahreHoldingDetailes(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 109)

void UploadFileShareHoldingDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action > Shareholding - edit - Upload File ShareHolding Detailes Verification ");
	
	EntityMasterMethod.UploadFileShareHoldingDeatils(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 110)

void UploadExistingFileShareHoldingDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action > Shareholding - edit - Upload Existing File ShareHolding Detailes Verification ");
	
	EntityMasterMethod.UploadExistingFileShareHoldingDeatils(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 111)

void InvalidDataUploadFileShareHoldingDeatils() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action > Shareholding - edit - Enter Invalid Data in Upload File ShareHolding Detailes Verification ");
	
	EntityMasterMethod.InvalidDataUploadFileShareHoldingDeatils(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 112)

void EmptyDataUploadshareHoldingDeatils() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action > Shareholding - edit - Enter Empty Data in Upload file ShareHolding Detailes Verification ");
	
	EntityMasterMethod.EmptyDataUploadshareHoldingDeatils(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =113)

void InvalidFileUploadShareHoldingDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action > Shareholding - edit - Invalid Upload file ShareHolding Detailes Verification ");
	
	EntityMasterMethod.InvalidFileUploadShareHoldingDetailes(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 114)

void WithoutSelectingFileUploadShareHoldingDetailes() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action > Shareholding - edit - Without Selecting Upload file ShareHolding Detailes Verification ");
	
	EntityMasterMethod.WithoutSelectingFileUploadShareHoldingDetailes(driver, test);
	
	extent.endTest(test);
	extent.flush();
}


@Test(priority = 115)

void UploadFileSahreHolding() throws InterruptedException, IOException
{
	test = extent.startTest("Upload File ShareHolding  Verification ");
	
	EntityMasterMethod.UploadShareHolding(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 116)

void ExistingUploadFileSahreHolding() throws InterruptedException, IOException
{
	test = extent.startTest("Upload Existing File ShareHolding  Verification ");
	
	EntityMasterMethod.UploadExistingFileShareHolding(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =117)
void InvalidUploadShareHolding() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Invalid  Data  Upload Existing File ShareHolding  Verification ");
	
	EntityMasterMethod.InvalidUploadShareHolding(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 118)
void EmptyFileUploadShareHolding() throws InterruptedException, IOException
{
	test = extent.startTest("Empty File Uploads shareHolding  Verification ");
	
	EntityMasterMethod.EmptyFileUploadShareHolding(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 119)
void InvalidFileUploadShareHolding() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid File Upload ShareHolding Verification ");
	
	EntityMasterMethod.InvalidFileUploadShareHolding(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 120)
void WithoutSelectingFileUploadShareHolding() throws InterruptedException, IOException
{
	test = extent.startTest("Without selecting File Upload ShareHolding Verification ");
	
	EntityMasterMethod.WithoutSelectingFileUploadShareHolding(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 121)
void ClickShareHoldingPattern() throws InterruptedException, IOException
{
	test = extent.startTest("ShareHolding Pattern Button is clickable or not ");
	
	EntityMasterMethod.ClickShareHoldingPattern(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 122)
void AddCategoryMaster() throws InterruptedException, IOException
{
	test = extent.startTest("Add Category Master ShareHolding Verification ");
	
	EntityMasterMethod.AddCategoryMaster(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 123)
void UploadShareholdingCategoryMaster() throws InterruptedException, IOException
{
	test = extent.startTest("Upload file  Category Master ShareHolding Verification ");
	
	EntityMasterMethod.UploadShareholdingCategoryMaster(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =124)
void EnterInvalidDataUploadShareholdingCategoryMaster() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Invalid Data Upload file Category Master ShareHolding Verification ");
	
	EntityMasterMethod.EnterInvalidDataUploadShareholdingCategoryMaster(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 125)
void EnterInvalidDateUploadShareholdingCategoryMaster() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Invalid Date Upload file Category Master ShareHolding Verification ");
	
	EntityMasterMethod.EnterInvalidDateUploadShareholdingCategoryMaster(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 126)
void EnterEmptyDataUploadShareholdingCategoryMaster() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Empty data Upload file Category Master ShareHolding Verification ");
	
	EntityMasterMethod.EnterEmptyDataUploadShareholdingCategoryMaster(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 127)
void InvalidUploadFileShareholdingCategoryMaster() throws InterruptedException, IOException
{
	test = extent.startTest("Invalid Upload file Category Master ShareHolding Verification ");
	
	EntityMasterMethod.InvalidUploadFileShareholdingCategoryMaster(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 128)
void WithoutUploadFileShareholdingCategoryMaster() throws InterruptedException, IOException
{
	test = extent.startTest("Without Selecting File Category Master ShareHolding Verification ");
	
	EntityMasterMethod.WithoutUploadFileShareholdingCategoryMaster(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 129)
void ClickShareHoldingHistorical() throws InterruptedException, IOException
{
	test = extent.startTest("ShareHolding Historical Button is clickable or not ");
	
	EntityMasterMethod.ClickShareHoldingHistorical(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority = 130)//Pending
void EnterInvalidDateShareHoldingHistorical() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Invalid Date In ShareHolding Historical Verification ");
	
	EntityMasterMethod.EnterInvalidDateShareHoldingHistorical(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 131)
void ClearButtonShareHoldingHistorical() throws InterruptedException, IOException
{
	test = extent.startTest("Clear Button ShareHolding Historical Verification ");
	
	EntityMasterMethod.ClearButtonShareHoldingHistorical(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 132)
void ViewButtonShareHoldingHistorical() throws InterruptedException, IOException
{
	test = extent.startTest("View Button ShareHolding Historical Verification ");
	
	EntityMasterMethod.ViewButtonShareHoldingHistorical(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 133)
void DownloadButtonShareHoldingHistorical() throws InterruptedException, IOException
{
	test = extent.startTest("Download Button ShareHolding Historical Verification ");
	
	EntityMasterMethod.DownloadButtonShareHoldingHistorical(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 134)
void EditBtnShareHolding() throws InterruptedException, IOException
{
	test = extent.startTest("Edit Button ShareHolding Verification ");
	
	EntityMasterMethod.EditBtnShareHoldingDetailes(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =135)
void UpdateShareHolding() throws InterruptedException, IOException
{
	test = extent.startTest("Update ShareHolding Verification ");
	
	EntityMasterMethod.UpdateShareHolding(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =136) //23/04/2025
void CloseBtnShareHolding() throws InterruptedException, IOException
{
	test = extent.startTest("Close Button ShareHolding Verification ");
	
	EntityMasterMethod.CloseBtnShareHolding(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 137)
void DeleteNoIconShareHolding() throws InterruptedException, IOException
{
	test = extent.startTest("Cancel Button ShareHolding Verification ");
	
	EntityMasterMethod.DeleteNoIconShareHolding(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =138)
void DeleteYesShareHolding() throws InterruptedException, IOException
{
	test = extent.startTest("Delete Button ShareHolding Verification ");
	
	EntityMasterMethod.DeleteShareHolding(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 139)
void ClickShareCertificateBtn() throws InterruptedException, IOException
{
	test = extent.startTest("Share Certificate Button is clickable or not ");
	
	EntityMasterMethod.ClickShareCertificateBtn(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =140)
void WithoutEnteringDataShareCertificate() throws InterruptedException, IOException
{
	test = extent.startTest("Without Entering data  Share Certificate Verification ");
	
	EntityMasterMethod.WithoutEnteringDataShareCertificate(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 141)
void AddShareCertificate() throws InterruptedException, IOException
{
	test = extent.startTest("Add Share Certificate Verification ");
	
	EntityMasterMethod.AddShareCertificate(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 142)
void ViewShareCertificate() throws InterruptedException, IOException
{
	test = extent.startTest(" Preview  Share Certificate Document  Verification ");
	
	EntityMasterMethod.ViewShareCertificate(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 143)
void DownloadShareCertificate() throws InterruptedException, IOException
{
	test = extent.startTest(" Download Share Certificate Document  Verification ");
	
	EntityMasterMethod.DownloadShareCertificate(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 143)
void DownloadShareCertificateAfterSaving() throws InterruptedException, IOException
{
	test = extent.startTest("After Saving Download Share Certificate Document  Verification ");
	
	EntityMasterMethod.DownloadShareCertificateAfterSaving(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 144)
void Managementpersonnel() throws InterruptedException, IOException
{
	test = extent.startTest("Management personnel Option is Clickable or not ");
	
	EntityMasterMethod.Managementpersonnel(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 145)
void ManagementpersonnelExportToPDF() throws InterruptedException, IOException
{
	test = extent.startTest("Export To Pdf File Management personnel Verification");
	
	EntityMasterMethod.ManagementpersonnelExportToPDF(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 146)
void ClickCommitte() throws InterruptedException, IOException
{
	test = extent.startTest("Committees option is clickable or not");
	
	EntityMasterMethod.ClickCommitte(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 147)
void ClickCloseBtnOfCommitte() throws InterruptedException, IOException
{
	test = extent.startTest("Close Button of Committees option is clickable or not");
	
	EntityMasterMethod.ClickCloseBtnOfCommitte(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 148)
void ClickCommitteeMatrix() throws InterruptedException, IOException
{
	test = extent.startTest("Committee Matrix option is clickable or not");
	
	EntityMasterMethod.ClickCommitteeMatrix(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 149)
void ClickAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Auditor option is clickable or not");
	
	EntityMasterMethod.ClickAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =150)
void AddStatutoryAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Add Statutory Auditor Verification");
	
	EntityMasterMethod.AddStatutoryAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 151)
void EnterTwoMandatoryFiledStatutoryAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Two Mandatory Filed Statutory Auditor Verification");
	
	EntityMasterMethod.EnterTwoMandatoryFiledStatutoryAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 152)
void EmptyFiledStatutoryAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Empty Field Statutory Auditor Verification");
	
	EntityMasterMethod.EmptyFiledStatutoryAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 153)
void CloseBtnStatutoryAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Add=Close button is clickable or not  Statutory Auditor Verification");
	
	EntityMasterMethod.CloseBtnStatutoryAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority =153)
void ClearBtnStatutoryAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Clear button is clickable or not  Statutory Auditor Verification");
	
	EntityMasterMethod.ClearBtnStatutoryAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 154)
void UpdateStatutoryAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Update Statutory Auditor Verification");
	
	EntityMasterMethod.UpdateStatutoryAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
	
@Test(priority = 155)
void UpdateEnterEmptyFieldsStatutoryAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Edit= Enter Empty Data Statutory Auditor Verification");
	
	EntityMasterMethod.UpdateEnterEmptyFieldsStatutoryAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 156)
void CloseBtnUpdateStatutoryAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Edit=Close button is clickable or not  Statutory Auditor Verification");
				
	EntityMasterMethod.CloseBtnUpdateStatutoryAuditor(driver, test);
				
	extent.endTest(test);
	extent.flush();
}
//@Test(priority = 157)pending
void Resignationofauditor() throws InterruptedException, IOException
{
	test = extent.startTest("Add Resignation Statutory Auditor Verification");
	
	EntityMasterMethod.ResignationofAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

//@Test(priority = 158)pending
void CloseBtnResignationofAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Close Button is clickable or not Resignation Statutory Auditor Verification");
	
	EntityMasterMethod.CloseBtnResignationofAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 159)
void ClickInternalAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Internal Auditor Verification");
	
	EntityMasterMethod.ClickInternalAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =160)
void AddInternalAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Add-Internal Auditor Verification");
	
	EntityMasterMethod.AddInternalAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 161)
void EnterExistingDataInternalAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Enter Existing Data-Internal Auditor Verification");
	
	EntityMasterMethod.EnterExistingDataInternalAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 162)
void CloseBtnInternalAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Close Button -Internal Auditor Verification");
	
	EntityMasterMethod.CloseBtnInternalAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 162)
void ClearBtnInternalAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Clear button - Internal Auditor Verification");
	
	EntityMasterMethod.ClearBtnInternalAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
	
@Test(priority = 163)
void EditInternalAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Update - Internal Auditor Verification");
	
	EntityMasterMethod.UpdateInternalAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 163)
void CloseBtnInternalAuditoredit() throws InterruptedException, IOException
{
	test = extent.startTest("Edit - Close Button -Internal Auditor Verification");
	
	EntityMasterMethod.CloseBtnInternalAuditoredit(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 164)
void ResignationofInternalAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Add Resignation - Internal Auditor Verification");
	
	EntityMasterMethod.ResignationofInternalAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority =164)
void EmptyFiledsCloseBtnResignationofInternalAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Verify that the 'close' button is working which is present inside the Resignation of Auditor button");
	
	EntityMasterMethod.EmptyFiledsCloseBtnResignationofInternalAuditor(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 165) 
void SecretarialAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor Verification ");
	
	EntityMasterMethod.SecretarialAuditor(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 166) 
void SAAddNew() throws InterruptedException, IOException
{
	test = extent.startTest("Add New- Secretarial Auditor Verification");
	
	EntityMasterMethod.SAAddNew(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority = 167)
void SAAddNewClose() throws InterruptedException, IOException
{
	test = extent.startTest("Close Button - Secretarial Auditor Verification");
	
	EntityMasterMethod.SAAddNewClose(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =168) 
void SAClearFilter() throws InterruptedException, IOException
{
	test = extent.startTest("Clear Filter  - Secretarial Auditor Verification");
	
	EntityMasterMethod.SAClearFilter(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 169) 
void SAEditClose() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Edit - Close");
	
	EntityMasterMethod.SAEditClose(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
//@Test(priority =170) pending
void ResignationofAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Resignation of Auditor - With Valid data ");
	
	EntityMasterMethod.ResignationofSecretarialAuditor(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
//@Test(priority = 171) 
void ResignationofAuditorClose() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Resignation of Auditor - Close ");
	
	EntityMasterMethod.ResignationofAuditorClose(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority = 172) 
void CostAuditor() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Click  ");
	
	EntityMasterMethod.CostAuditor(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority = 173) 
void CostAuditorAddNew() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Add New  ");
	
	EntityMasterMethod.CostAuditorAddNew(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}	

@Test(priority = 173) 
void CostAuditorAddNewED() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Add New - with Existing data ");
	
	EntityMasterMethod.CostAuditorAddNewED(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority =174) 
void CAAddNewClose() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Add New - Close ");
	
	EntityMasterMethod.CAAddNewClose(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =175) 
void CAEditClose() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Edit - Close ");
	
	EntityMasterMethod.CAEditClose(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	

@Test(priority = 0) 
void CAClearFilter() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Clear Filter ");
	
	EntityMasterMethod.CAClearFilter(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 176) 
void ResignationofAuditorCA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Resignation of Auditor - With Valid data ");
	
	EntityMasterMethod.ResignationofAuditorCA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 177) 
void ResignationofAuditorCloseCA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Resignation of Auditor - Close ");
	
	EntityMasterMethod.ResignationofAuditorCloseCA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =178) 
void ClickMBP4() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Register-MBP-4 tab ");
	
	EntityMasterMethod.ClickMBP4(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =179) 
void ClickUploadExistingRegistor() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Upload File with valid data ");
	
	EntityMasterMethod.ClickUploadExistingRegistorValidData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority = 180) 
void ClickUploadExistingRegistorInvalidData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Upload File with Invalid data ");
	
	EntityMasterMethod.ClickUploadExistingRegistorInvalidData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 181) 
void ClickUploadExistingRegistorWithoutData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Upload File without data ");
	
	EntityMasterMethod.ClickUploadExistingRegistorWithoutData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority = 182) 
void ClickUploadExistingRegistorInvalidFileFormat() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Invalid File Format ");
	
	EntityMasterMethod.ClickUploadExistingRegistorInvalidFileFormat(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority = 183) 
void ClickUploadExistingRegistorWithoutSelectingFile() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Without selecting file ");
	
	EntityMasterMethod.ClickUploadExistingRegistorWithoutSelectingFile(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority = 184) 
void ClickUploadOldRegistorWithValidFile() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old Btn-with valid file ");
	
	EntityMasterMethod.ClickUploadOldRegistorWithValidData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =185) 
void ClickUploadOldRegistorWithInValidData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old Btn-with invalid data ");
	
	EntityMasterMethod.ClickUploadOldRegistorWithInValidData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =186) 
void ClickUploadOldRegistorWithDuplicateData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old Btn-with Duplicate data ");
	
	EntityMasterMethod.ClickUploadOldRegistorWithDuplicateData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =187) 
void ClickUploadOldRegistorWithoutData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old Btn-without data ");
	
	EntityMasterMethod.ClickUploadOldRegistorWithoutData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =188) 
void ClickUploadOldRegistorInvalidFile() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old Btn-Invalid File ");
	
	EntityMasterMethod.ClickUploadOldRegistorInvalidFile(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =189) 
void ClickUploadOldRegistorWithoutSelectFile() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab -Select Old Btn- Without selecting file ");
	
	EntityMasterMethod.ClickUploadOldRegistorWithoutSelectFile(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =190) 
void ClickGenerateRegistor() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab");
	
	EntityMasterMethod.ClickGenerateRegistor(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =191) 
void ClickDownloadExisitingRegisterOfMBP4() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-Existing Download Report");
	
	EntityMasterMethod.ClickDownloadExisitingRegisterOfMBP4(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =192) 
void ClickDownloadOldRegisterOfMBP4() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-Old Download Report");
	
	EntityMasterMethod.ClickDownloadOldRegisterOfMBP4(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =193) 
void ClickDownloadAllRegisterOfMBP4() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-All btn -Download Report");
	
	EntityMasterMethod.ClickDownloadAllRegisterOfMBP4(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =194) //05/05/2025
void ClickViewExisitingRegisterOfMBP4() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-Existing- Viewed Document");
	
	EntityMasterMethod.ClickViewExisitingRegisterOfMBP4(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =195) 
void ClickViewOldRegisterOfMBP4() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-Old Btn- Viewed Document");
	
	EntityMasterMethod.ClickViewOldRegisterOfMBP4(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority =196) 
void ClickViewAllRegisterOfMBP4() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-MBP-4 tab - click Generate Registor tab-All Btn- Viewed Document");
	
	EntityMasterMethod.ClickViewAllRegisterOfMBP4(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =197) 
void clickPASTROD() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab");
	
	EntityMasterMethod.clickPASTROD(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =198) 
void clickPASTRODwithValidData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-With valid data");
	
	EntityMasterMethod.clickPASTRODwithValidData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =199) 
void clickPASTRODwithInValidData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-With invalid data");
	
	EntityMasterMethod.clickPASTRODwithInValidData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =200) 
void clickPASTRODwithDuplicateData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-With Duplicate data");
	
	EntityMasterMethod.clickPASTRODwithDuplicateData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =201) 
void clickPASTRODwithoutData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-Without data");
	
	EntityMasterMethod.clickPASTRODwithoutData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =202) 
void clickPASTRODInvalidFile() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-Invliad File Format");
	
	EntityMasterMethod.clickPASTRODInvalidFile(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =203) 
void clickPASTRODGenerateRegistor() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-Generate Registor Tab");
	
	EntityMasterMethod.clickPASTRODGenerateRegistor(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =204) 
void clickPASTRODGenerateRegistorDownload() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-Generate Registor Tab - Download Report");
	
	EntityMasterMethod.clickPASTRODGenerateRegistorDownload(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =205) 
void clickPASTRODGenerateRegistorview() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - More Action - Statutory Auditors-Past ROD Tab-Generate Registor Tab - View Document");
	
	EntityMasterMethod.clickPASTRODGenerateRegistorDownload(driver,test);
	
	extent.endTest(test);
	extent.flush();  
}



//------------------------------Private Limited-------------------------

@Test(priority = 206)
void PrivateLimitedCompany() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Add New-Private Limited Company with valid data");
	
	Methods.AddPrivateLimitedCompany(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 207)
void EnterInvalidDataPrivateLtd() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Add New-Private Limited Company with Invalid data");
	
	Methods.EnterInvalidDataPrivateLtd(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 208)
void TwoMandatoryFieldsPrivateLtd() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Add New-Private Limited Company with two mandatory field");
	
	Methods.TwoMandatoryFieldsPrivateLtd(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 209)

void CloseBtnPrivateLtd() throws InterruptedException, IOException
{
	test = extent.startTest("Close Button Verification");
	
	Methods.CloseBtnPrivateLtd(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 210)

void EditIconPrivateLtd() throws InterruptedException, IOException
{
	test = extent.startTest("Update Private Limitited Company Verification");
	
	Methods.EditIconPrivateLtd(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 211)

void InvalidEditIconPrivateLtd() throws InterruptedException, IOException
{
	test = extent.startTest("Edit Icon-Invalid data- Private Limitited Company Verification");
	
	Methods.InvalidEditIconPrivateLtd(driver, test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 206)
void BusinessActivityClick() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Business Activity  ");
	
	Methods.BusinessActivityClick(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 207)
void AddNew() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Business Activity -Add New ");
	
	Methods.BusinessActivity(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 208)
void validationofedit() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Business Activity -Edit");
	
	Methods.validationofedit(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =209)
void DeleteBusinessActivity() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Business Activity - Delete");
	
	Methods.DeleteBusinessActivity(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 210)
void BusinessActivityValidation() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Business Activity -Add New - withOut Selecting 'Main Activity Code' dropdown");
	
	Methods.BusinessActivityValidation(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 211)
void DocumentClick() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents ");
	
	Methods.DocumentClick(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 211)
void DocumentsADDMOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New - Selecting MOA");
	
	Methods.DocumentsADDMOA(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 212)
void WithoutDocument() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New -Type MOA - Without Document ");
	
	Methods.WithoutDocument(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 213)
void DocumentsADDMOAAE() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New - with existing data ");
	
	Methods.DocumentsADDMOAAE(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 214)//start
void ViewMOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-view-MOA ");
	
	Methods.ViewMOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 215)
void DownloadMOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Download - MOA ");
	
	Methods.DownloadMOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 216)
void DeleteMOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Delete - MOA ");
	
	Methods.DeleteMOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority = 217)
void AddNewDocuments() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New - Selecting AOA");
	
	Methods.DocumentsADD(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 218)
void DocumentsADDExisting() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New -AOA - with existing data ");
	
	Methods.DocumentsADDExisting(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 219)
void ViewAOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-View - AOA");
	
	Methods.ViewAOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 220)
void DownloadAOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Download -AOA ");
	
	Methods.DownloadAOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 221)
void DocumentDelete() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Delete - AOA ");
	
	Methods.DeleteAOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 222)
void WithoutDocumentAOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New -Type AOA - Without Document ");
	
	Methods.WithoutDocumentAOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 223)
void DocumentsADDCOI() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New - Selecting COI ");
	
	Methods.DocumentsADDCOI(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 224)
void WithoutDocumentCOI() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New -Type COI - Without Document ");
	
	Methods.WithoutDocumentCOI(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 225)
void DocumentsADDCOIExisting() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New -COI - with existing data ");
	
	Methods.DocumentsADDCOIExisting(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 226)
void ViewCOI() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-View - COI");
	
	Methods.ViewCOI(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 227)
void DownloadCOI() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Download -COI ");
	
	Methods.DownloadCOI(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 228)
void DeleteCOI() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Delete - COI ");
	
	Methods.DeleteCOI(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 229)
void DocumentsADDPolicy() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New - Selecting Policy ");
	
	Methods.DocumentsADDPolicy(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 230)
void WithoutDocumentPolicy() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New -Type Policy - Without Document ");
	
	Methods.WithoutDocumentPolicy(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 231)
void DocumentsADDPolicyAE() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New -Policy - with existing data ");
	
	Methods.DocumentsADDPolicyAE(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 232)
void DownloadPolicy() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Policies -Download  ");
	
	Methods.DownloadPolicy(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 233)
void ViewPolicy() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents- Policies -View ");
	
	Methods.ViewPolicy(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 233)
void DeletePolicy() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Policies - Delete  ");
	
	Methods.DeletePolicy(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 234)
void DocumentsADDLicenseRegi() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New - Selecting Licence/Registration  ");
	
	Methods.DocumentsADDLicenseRegi(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority = 235)
void WithoutDocumentLicense() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New - Selecting Licence/Registration :- Without Document ");
	
	Methods.WithoutDocumentLicense(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 236)
void DocumentsADDLicenseRegiED() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New -Licence/Registration  - with existing data ");
	
	Methods.DocumentsADDLicenseRegiED(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 237)
void ViewLicenseRegi() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents- LICENSE_REGISTRATION -View ");
	
	Methods.ViewLicenseRegi(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 237)
void DownloadLicenseRegi() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-LICENSE_REGISTRATION -Download  ");
	
	Methods.DownloadLicenseRegi(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 237)
void DeleteLicenseRegi() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-LICENSE_REGISTRATION - Delete  ");
	
	Methods.DeleteLicenseRegi(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =238)
void DocumentsADDAnnualReport() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New - Selecting  Annual Report ");
	
	Methods.DocumentsADDAnnualReport(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority =239)
void DocumentsADDAnnualReportED() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New - Annual Reportn  - with existing data ");
	
	Methods.DocumentsADDAnnualReportED(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 240)
void DocumentsADDAnnualReportWD() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New - Annual Report :- Without Document ");
	
	Methods.DocumentsADDAnnualReportWD(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 241)
void ViewAnnualReport() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents- Annual report -View ");
	
	Methods.ViewAnnualReport(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 241)
void DownloadAnnualReport() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Annual report -Download  ");
	
	Methods.DownloadAnnualReport(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 242)
void DeleteAnnualReport() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Annual report - Delete  ");
	
	Methods.DeleteAnnualReport(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 243)
void DocumentsADDClose() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Documents-Add New - Close   ");
	
	Methods.DocumentsADDClose(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 244)
void BranchDetailsClick() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Branch Details   ");
	
	Methods.BranchDetailsClick(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 245)
void AddNewBranchDetails() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Branch Details - Add New -With Valid Data  ");
	
	Methods.AddNewBranchDetails(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 246)
void AddNewBranchDetailsinvalidData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Branch Details - Add New - With Invalid Data ");
	
	Methods.AddNewBranchDetailsinvalidData(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 249)
void UploadBranchDetails() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Branch Details - Upload Document -With Valid Extention ");
	
	Methods.UploadBranchDetails(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 250)
void UploadBranchDetailsInvalid() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Branch Details - Upload Document - With Invalid Extention  ");
	
	Methods.UploadBranchDetailsInvalid(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 251)
void UploadBranchDetailsMulvalid() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Branch Details - Upload Document - With  multiple valid file extensions upload  ");
	
	Methods.UploadBranchDetailsMulvalid(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 252)
void UploadBranchDetailsMulInvalid() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Branch Details - Upload Document - With  multiple invalid file extensions upload  ");
	
	Methods.UploadBranchDetailsMulInvalid(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 253)//19/04/2023
void UploadBranchDetailsWF() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Branch Details - Upload Document - WithOut Document  ");
	
	Methods.UploadBranchDetailsWF(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 254)
void BankDetailsClick() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Bank Details  ");
	
	Methods.BankDetailsClick(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 255)
void BankDetailAddnew() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Bank Details-Add New -with valid data ");
	
	Methods.BankDetailAddnew(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 256)
	void BankDetailInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details-Add New - with Invalid account number  ");
		
		Methods.BankDetailInvalid(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}

@Test(priority = 66)
void BankDetailDelete1() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Bank Details -Delete");
	
	Methods.BankDetailDelete(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 67)
void BankDetailDeleteCan1() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Edit - Bank Details -Delete - cancel");
	
	Methods.BankDetailDeleteCan(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
//----------------------------------   Public Limited   -------------------------------------------

@Test(priority = 256) 
void PublicLimitedSelect() throws InterruptedException, IOException
{
		test = extent.startTest("Entity - Add New - Public Limited");
		
		Methods.PublicLimitedSelect(driver,test);
		
		extent.endTest(test);
		extent.flush();
}

@Test(priority = 257) 
void PublicLimitedAdd() throws InterruptedException, IOException
{
		test = extent.startTest("Entity - Add New - Public Limited -With Valid Data");
		
		Methods.PublicLimitedAdd(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
}

@Test(priority = 258) 
void PublicLimitedAddInvalid() throws InterruptedException, IOException
{
		test = extent.startTest("Entity - Add New - Public Limited - -With Invalid Data");
		
		Methods.PublicLimitedAddInvalid(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
}
@Test(priority = 259) 
void PublicLimitedAddWith2man() throws InterruptedException, IOException
{
		test = extent.startTest("Entity - Add New - Public Limited - -With two mandatory fields");
		
		Methods.PublicLimitedAddWith2man(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
}
@Test(priority = 260) 
void PublicLimitedAddWithoutdata() throws InterruptedException, IOException
{
		test = extent.startTest("Entity - Add New - Public Limited - -withOut Data");
		
		Methods.PublicLimitedAddWithoutdata(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
}
@Test(priority = 261) 
void PublicLimitedAddClose() throws InterruptedException, IOException
{
		test = extent.startTest("Entity - Add New - Public Limited - Close");
		
		Methods.PublicLimitedAddClose(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
}

@Test(priority = 262) 
void PublicLimitedEdit() throws InterruptedException, IOException
{
		test = extent.startTest("Entity - Public Limited -Edit");
		
		Methods.PublicLimitedEdit(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
}
@Test(priority = 263) 
void PublicLimitedEditInvalid() throws InterruptedException, IOException
{
		test = extent.startTest("Entity - Public Limited -Edit-with Invalid Name");
		
		Methods.PublicLimitedEditInvalid(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
}
@Test(priority = 264) 
void PublicLimitedEditClose() throws InterruptedException, IOException
{
		test = extent.startTest("Entity - Public Limited -Edit- Close Button");
		
		Methods.PublicLimitedEditClose(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
}
@Test(priority = 265) //  21/04/2023
void PLBusinessActivityClick() throws InterruptedException, IOException
{
		test = extent.startTest("Entity - Public Limited -Edit-Business Activity ");
		
		Methods.PLBusinessActivityClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
}
@Test(priority = 266)
void PLBusinessActivity() throws InterruptedException, IOException
{
		test = extent.startTest("Entity - Public Limited -Edit-Business Activity - Add New ");
		
		Methods.PLBusinessActivity(driver,test);
		
		extent.endTest(test);
		extent.flush();
}
@Test(priority = 267)
void PLBusinessActivityValidation() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Business Activity -Add New - withOut Selecting 'Main Activity Code' dropdown");
	
	Methods.PLBusinessActivityValidation(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 268)
void PLvalidationofedit() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Business Activity -Edit - With Valid Data");
	
	Methods.PLvalidationofedit(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 269)
void PLCheckInvaliddata() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited -Edit- Business Activity -Edit -With Invalid Data");
	
	Methods.PLCheckInvaliddata(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 270)
void PLDeleteBusinessActivity() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Business Activity - Delete");
	
	Methods.PLDeleteBusinessActivity(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 271)
void PLBusinessActivityADDNewClose() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Business Activity - Add New -Close");
	
	Methods.PLBusinessActivityADDNewClose(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 272)
void PLDocumentClick() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents ");
	
	Methods.PLDocumentClick(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 273)
void PLDocumentsADDMOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting MOA");
	
	Methods.PLDocumentsADDMOA(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =274)
void PLWithoutDocument() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New -Type MOA - Without Document ");
	
	Methods.PLWithoutDocument(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 275)
void PLDocumentsADDMOAAE() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - with existing data ");
	
	Methods.PLDocumentsADDMOAAE(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =276)
void PLViewMOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-view-MOA ");
	
	Methods.PLViewMOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 277)
void PLDownloadMOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited -Edit - Documents-Download - MOA ");
	
	Methods.PLDownloadMOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 278) //  24/04/2023
void PLDeleteMOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Delete - MOA ");
	
	Methods.PLDeleteMOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}	
@Test(priority = 279)
void PLDocumentsADD() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New - Selecting AOA");
	
	Methods.PLDocumentsADD(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 280)
void PLWithoutDocumentAOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New -Type AOA - Without Document ");
	
	Methods.PLWithoutDocumentAOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 281)
void PLDocumentsADDExisting() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -AOA - with existing data ");
	
	Methods.PLDocumentsADDExisting(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 282)
void PLViewAOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-View - AOA");
	
	Methods.PLViewAOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 283)
void PLDownloadAOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Download -AOA ");
	
	Methods.PLDownloadAOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 284)
void PLDeleteAOA() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Delete - AOA ");
	
	Methods.PLDeleteAOA(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 285)
void PLDocumentsADDCOI() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New - Selecting COI ");
	
	Methods.PLDocumentsADDCOI(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 286)
void PLWithoutDocumentCOI() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Type COI - Without Document ");
	
	Methods.PLWithoutDocumentCOI(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 287)
void PLDocumentsADDCOIExisting() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New -COI - with existing data ");
	
	Methods.PLDocumentsADDCOIExisting(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 288)
void PLViewCOI() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited -Edit - Documents-View - COI");
	
	Methods.PLViewCOI(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 289)
void PLDownloadCOI() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Download -COI ");
	
	Methods.PLDownloadCOI(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 290)
void PLDeleteCOI() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Delete - COI ");
	
	Methods.PLDeleteCOI(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 291)
void PLDocumentsADDPolicy() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting Policy ");
	
	Methods.PLDocumentsADDPolicy(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 292)
void PLWithoutDocumentPolicy() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Type Policy - Without Document ");
	
	Methods.PLWithoutDocumentPolicy(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 293)
void PLDocumentsADDPolicyAE() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Policy - with existing data ");
	
	Methods.PLDocumentsADDPolicyAE(driver,test);
	
	extent.endTest(test);
	extent.flush();
}


@Test(priority = 294)
void PLDownloadPolicy() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Policies -Download  ");
	
	Methods.PLDownloadPolicy(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 294)
void PLViewPolicy() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited  - Edit - Documents- Policies -View ");
	
	Methods.PLViewPolicy(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 295)
void PLDeletePolicy() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Policies - Delete  ");
	
	Methods.PLDeletePolicy(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 296)
void PLDocumentsADDLicenseRegi() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting Licence/Registration  ");
	
	Methods.PLDocumentsADDLicenseRegi(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 297)
void PLWithoutDocumentLicense() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting Licence/Registration :- Without Document ");
	
	Methods.PLWithoutDocumentLicense(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority =298)
void PLDocumentsADDLicenseRegiED() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New -Licence/Registration  - with existing data ");
	
	Methods.PLDocumentsADDLicenseRegiED(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 299)
void PLViewLicenseRegi() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited -Edit - Documents- LICENSE_REGISTRATION -View ");
	
	Methods.PLViewLicenseRegi(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 299)
void PLDownloadLicenseRegi() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-LICENSE_REGISTRATION -Download  ");
	
	Methods.PLDownloadLicenseRegi(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 300)
void PlDeleteLicenseRegi() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-LICENSE_REGISTRATION - Delete  ");
	
	Methods.PlDeleteLicenseRegi(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 301)
void PLDocumentsADDAnnualReport() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Selecting  Annual Report ");
	
	Methods.PLDocumentsADDAnnualReport(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 302)
void PLDocumentsADDAnnualReportED() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents-Add New - Annual Reportn  - with existing data ");
	
	Methods.PLDocumentsADDAnnualReportED(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 303)
void PlDocumentsADDAnnualReportWD() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Add New - Annual Report :- Without Document ");
	
	Methods.PlDocumentsADDAnnualReportWD(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 304)
void PLDownloadAnnualReport() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Annual report -Download  ");
	
	Methods.PLDownloadAnnualReport(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 304)
void PLViewAnnualReport() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Documents- Annual report -View ");
	
	Methods.PLViewAnnualReport(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 305)
void PLDeleteAnnualReport() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Documents-Annual report - Delete  ");
	
	Methods.PLDeleteAnnualReport(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 306)
void PLBranchDetailsClick() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Branch Details   ");
	
	Methods.PLBranchDetailsClick(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 307)
void PLAddNewBranchDetails() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Add New -With Valid Data  ");
	
	Methods.PLAddNewBranchDetails(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 308)
void PLAddNewBranchDetailsinvalidData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Add New - With Invalid Data ");
	
	Methods.PLAddNewBranchDetailsinvalidData(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 309)
void PLAddNewBranchDetailsMandatoryfield() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Add New - With 2 Mandatory field ");
	
	Methods.PLAddNewBranchDetailsMandatoryfield(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 310)
void PLAddNewBranchDetailsWithOutData() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Add New - WithOut Data ");
	
	Methods.PLAddNewBranchDetailsWithOutData(driver,test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 311)
void PLEditBranchDetails() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Edit ");
	
	Methods.PLEditBranchDetails(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority = 311) // 26/04/2023
void PLUploadBranchDetails() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited  - Edit - Branch Details - Upload Document -With Valid Extention ");
	
	Methods.PLUploadBranchDetails(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 312)
void PLUploadBranchDetailsInvalid() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited  - Edit - Branch Details - Upload Document - With Invalid Extention  ");
	
	Methods.PLUploadBranchDetailsInvalid(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 314)
void PLUploadBranchDetailsMulvalid() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Upload Document - With  multiple valid file extensions upload  ");
	
	Methods.PLUploadBranchDetailsMulvalid(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 315)
void PLUploadBranchDetailsMulInvalid() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Branch Details - Upload Document - With  multiple invalid file extensions upload  ");
	
	Methods.PLUploadBranchDetailsMulInvalid(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 316)
void PLUploadBranchDetailsWF() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Upload Document - WithOut Document  ");
	
	Methods.PLUploadBranchDetailsWF(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 317)
void PLAddNewBranchDetailsClose() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Branch Details - Add New -Close  ");
	
	Methods.PLAddNewBranchDetailsClose(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 318)
void PLBankDetailsClick() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Bank Details  ");
	
	Methods.PLBankDetailsClick(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 319)
void PLBankDetailAddnew() throws InterruptedException, IOException
{
	test = extent.startTest("Entity - Public Limited - Edit - Bank Details-Add New -with valid data ");
	
	Methods.PLBankDetailAddnew(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 320)
void PLBankDetailEdit() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Bank Details -Edit");
	
	Methods.PLBankDetailEdit(driver,test,workbook);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 321)
void PLBankDetailDeleteCan() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Bank Details -Delete - cancel");
	
	Methods.PLBankDetailDeleteCan(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
@Test(priority = 322)
void PLBankDetailDelete() throws InterruptedException, IOException
{
	test = extent.startTest("Entity -Public Limited - Edit - Bank Details -Delete");
	
	Methods.PLBankDetailDelete(driver,test);
	
	extent.endTest(test);
	extent.flush();
}
//----------------------------------   Listed Company   -------------------------------------------

	@Test(priority = 323) 
	void ListedCompanySelect() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New -  Listed Company ");
			
			Methods.ListedCompanySelect(driver,test);
			
			extent.endTest(test);
			extent.flush();
	}
	@Test(priority =324) 
	void ListedCompanyAdd() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New -Listed Company -With Valid Data");
			
			Methods.ListedCompanyAdd(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	@Test(priority = 325) 
	void ListedCompanyAddInvalid() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Listed Company- -With Invalid Data");
			
			Methods.ListedCompanyAddInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	@Test(priority = 326) 
	void ListedCompanyAddWith2man() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Listed Company - With two mandatory fields");
			
			Methods.ListedCompanyAddWith2man(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	@Test(priority = 327) 
	void ListedCompanyAddWithoutdata() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Listed Company - -withOut Data");
			
			Methods.ListedCompanyAddWithoutdata(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	@Test(priority = 328) 
	void ListedCompanyAddClose() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Add New - Listed Company - Close");
			
			Methods.ListedCompanyAddClose(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	@Test(priority = 329) 
	void ListedCompanyEdit() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Listed Company -Edit");
			
			Methods.ListedCompanyEdit(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	@Test(priority = 330) 
	void ListedCompanyEditInvalid() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Listed Company  -Edit-with Invalid Name");
			
			Methods.ListedCompanyEditInvalid(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	@Test(priority = 331) 
	void ListedCompanyEditClose() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Listed Company -Edit- Close Button");
			
			Methods.ListedCompanyEditClose(driver,test,workbook);
			
			extent.endTest(test);
			extent.flush();
	}
	@Test(priority =332) 
	void LCBusinessActivityClick() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity - Listed Company -Edit-Business Activity ");
			
			Methods.LCBusinessActivityClick(driver,test);
			
			extent.endTest(test);
			extent.flush();
	}
	@Test(priority = 333)
	void LCBusinessActivity() throws InterruptedException, IOException
	{
			test = extent.startTest("Entity -  Listed Company  -Edit-Business Activity - Add New ");
			
			Methods.LCBusinessActivity(driver,test);
			
			extent.endTest(test);
			extent.flush();
	}
	@Test(priority = 334)
	void LCBusinessActivityValidation() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Business Activity -Add New - withOut Selecting 'Main Activity Code' dropdown");
		
		Methods.LCBusinessActivityValidation(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 335)
	void LCvalidationofedit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Business Activity -Edit - With Valid Data");
		
		Methods.LCvalidationofedit(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 336)
	void LCDeleteBusinessActivity() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Business Activity - Delete");
		
		Methods.LCDeleteBusinessActivity(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 337)
	void LCBusinessActivityADDNewClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Business Activity - Add New -Close");
		
		Methods.LCBusinessActivityADDNewClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 338)
	void LCDocumentClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Edit - Documents ");
		
		Methods.LCDocumentClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 339)
	void LCDocumentsADDMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New - Selecting MOA");
		
		Methods.LCDocumentsADDMOA(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 340)
	void LCWithoutDocument() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New -Type MOA - Without Document ");
		
		Methods.LCWithoutDocument(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 341)
	void LCDocumentsADDMOAAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - with existing data ");
		
		Methods.LCDocumentsADDMOAAE(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 342)
	void LCViewMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Edit - Documents-view-MOA ");
		
		Methods.LCViewMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 343)
	void LCDownloadMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company -Edit - Documents-Download - MOA ");
		
		Methods.LCDownloadMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 344) 
	void LCDeleteMOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Delete - MOA ");
		
		Methods.LCDeleteMOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 345)  //28/04/2023
	void LCDocumentsADD() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Selecting AOA");
		
		Methods.LCDocumentsADD(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 346)
	void LCWithoutDocumentAOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Type AOA - Without Document ");
		
		Methods.LCWithoutDocumentAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 347)
	void LCDocumentsADDExisting() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -  Listed Company - Edit - Documents-Add New -AOA - with existing data ");
		
		Methods.LCDocumentsADDExisting(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 348)
	void LCViewAOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -  Listed Company - Edit - Documents-View - AOA");
		
		Methods.LCViewAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 349)
	void LCDownloadAOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Download -AOA ");
		
		Methods.LCDownloadAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 350)
	void LCDeleteAOA() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -  Listed Company - Edit - Documents-Delete - AOA ");
		
		Methods.LCDeleteAOA(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 351)
	void LCDocumentsADDCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -  Listed Company - Edit - Documents-Add New - Selecting COI ");
		
		Methods.LCDocumentsADDCOI(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 352)
	void LCWithoutDocumentCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -  Listed Company - Edit - Documents-Add New -Type COI - Without Document ");
		
		Methods.LCWithoutDocumentCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}	
	@Test(priority = 353)
	void LCDocumentsADDCOIExisting() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -COI - with existing data ");
		
		Methods.LCDocumentsADDCOIExisting(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 354)
	void LCViewCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -  Listed Company -Edit - Documents-View - COI");
		
		Methods.LCViewCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 355)
	void LCDownloadCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -  Listed Company - Edit - Documents-Download -COI ");
		
		Methods.LCDownloadCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 356)
	void LCDeleteCOI() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -  Listed Company- Edit - Documents-Delete - COI ");
		
		Methods.LCDeleteCOI(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 357)
	void LCDocumentsADDPolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Selecting Policy ");
		
		Methods.LCDocumentsADDPolicy(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}	
	@Test(priority = 358)
	void LCWithoutDocumentPolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Type Policy - Without Document ");
		
		Methods.LCWithoutDocumentPolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 359)  // 02/05/2023
	void LCDocumentsADDPolicyAE() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Policy - with existing data ");
		
		Methods.LCDocumentsADDPolicyAE(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 360)
	void LCViewPolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company  - Edit - Documents- Policies -View ");
		
		Methods.LCViewPolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}

	@Test(priority = 361)
	void LCDownloadPolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Edit - Documents-Policies -Download  ");
		
		Methods.LCDownloadPolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 362)
	void LCDeletePolicy() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Policies - Delete  ");
		
		Methods.LCDeletePolicy(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 363)
	void LCDocumentsADDLicenseRegi() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Selecting Licence/Registration  ");
		
		Methods.LCDocumentsADDLicenseRegi(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 364)
	void LCWithoutDocumentLicense() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New - Selecting Licence/Registration :- Without Document ");
		
		Methods.LCWithoutDocumentLicense(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 365)
	void LCDocumentsADDLicenseRegiED() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New -Licence/Registration  - with existing data ");
		
		Methods.LCDocumentsADDLicenseRegiED(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority =366)
	void LCDownloadLicenseRegi() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-LICENSE_REGISTRATION -Download  ");
		
		Methods.LCDownloadLicenseRegi(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 367)
	void lCDeleteLicenseRegi() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company- Edit - Documents-LICENSE_REGISTRATION - Delete  ");
		
		Methods.lCDeleteLicenseRegi(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 368)
	void LCDocumentsADDAnnualReport() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Edit - Documents-Add New - Selecting  Annual Report ");
		
		Methods.LCDocumentsADDAnnualReport(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 369)
	void LCDocumentsADDAnnualReportED() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Documents-Add New - Annual Reportn  - with existing data ");
		
		Methods.LCDocumentsADDAnnualReportED(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 370)
	void lCDocumentsADDAnnualReportWD() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company- Edit - Documents-Add New - Annual Report :- Without Document ");
		
		Methods.lCDocumentsADDAnnualReportWD(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 371)
	void LCDownloadAnnualReport() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Edit - Documents-Annual report -Download  ");
		
		Methods.LCDownloadAnnualReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 372)
	void LCDeleteAnnualReport() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Edit - Documents-Annual report - Delete  ");
		
		Methods.LCDeleteAnnualReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority =373)
	void LCBranchDetailsClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Edit - Branch Details  ");
		
		Methods.LCBranchDetailsClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority =374)
	void LCAddNewBranchDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Listed Company - Edit - Branch Details - Add New -With Valid Data  ");
		
		Methods.LCAddNewBranchDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 375)
	void LCAddNewBranchDetailsinvalidData() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Add New - With Invalid Data ");
		
		Methods.LCAddNewBranchDetailsinvalidData(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 376)
	void LCAddNewBranchDetailsMandatoryfield() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Add New - With 2 Mandatory field ");
		
		Methods.LCAddNewBranchDetailsMandatoryfield(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 377) //03/05/2023
	void LCAddNewBranchDetailsWithOutData() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Add New - WithOut Data ");
		
		Methods.LCAddNewBranchDetailsWithOutData(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 378) 
	void LCUploadBranchDetails() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company   - Edit - Branch Details - Upload Document -With Valid Extention ");
		
		Methods.LCUploadBranchDetails(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 379)
	void LCUploadBranchDetailsInvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -  Listed Company   - Edit - Branch Details - Upload Document - With Invalid Extention  ");
		
		Methods.LCUploadBranchDetailsInvalid(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 380)
	void LCUploadBranchDetailsMulvalid() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Upload Document - With  multiple valid file extensions upload  ");
		
		Methods.LCUploadBranchDetailsMulvalid(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 380)
	void LCUploadBranchDetailsMulInvalid() throws InterruptedException, IOException
	{
	test = extent.startTest("Entity - Listed Company  - Edit - Branch Details - Upload Document - With  multiple invalid file extensions upload  ");
	
	Methods.LCUploadBranchDetailsMulInvalid(driver,test);
	
	extent.endTest(test);
	extent.flush();
	}
	
	@Test(priority = 381)
	void LCUploadBranchDetailsWF() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Branch Details - Upload Document - WithOut Document  ");
		
		Methods.LCUploadBranchDetailsWF(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 382)
	void LCAddNewBranchDetailsClose() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company  - Edit - Branch Details - Add New -Close  ");
		
		Methods.LCAddNewBranchDetailsClose(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority =383)
	void LCBankDetailsClick() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Bank Details  ");
		
		Methods.LCBankDetailsClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 384)
	void LCBankDetailAddnew() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Bank Details-Add New -with valid data ");
		
		Methods.LCBankDetailAddnew(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 385)
	void LCBankDetailEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Bank Details -Edit");
		
		Methods.LCBankDetailEdit(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 386)
	void LCBankDetailDeleteCan() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company - Edit - Bank Details -Delete - cancel");
		
		Methods.LCBankDetailDeleteCan(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority =387)
	void LCBankDetailDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity - Listed Company  - Edit - Bank Details -Delete");
		
		Methods.LCBankDetailDelete(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 388)
	void BankDetailEdit() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Edit");
		
		Methods.BankDetailEdit(driver,test,workbook);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority = 389)
	void BankDetailDeleteCan() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Delete - cancel");
		
		Methods.BankDetailDeleteCan(driver,test);
		
		extent.endTest(test);
		extent.flush();
		
	}
	@Test(priority = 390)
	void BankDetailDelete() throws InterruptedException, IOException
	{
		test = extent.startTest("Entity -Edit - Bank Details -Delete");
		
		Methods.BankDetailDelete(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	//--------------------------'More Action'- 'Related Companies'-------------------------
	 
			@Test(priority = 391) // 04/05/2023
			void EntityMoreOption() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action");
				
				Methods.EntityMoreOption(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 392) 
			void RCSharesHeld() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action -Related Companies -Shares Held");
				
				Methods.RCSharesHeld(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 393) 
			void RCClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action -Related Companies - close Button");
				
				Methods.RCClose(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 394) 
			void RCSearchField() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action -Related Companies - Search - with Valid Data");
				
				Methods.RCSearchField(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 395) 
			void RCDelete() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action -Related Companies - Delete");
				
				Methods.RCDelete(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}	
			//--------------------------'More Action'- 'Capital'-------------------------
			
			@Test(priority = 396) 
			void EntityMoreOption1() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Capital");
				
				Methods.EntityMoreOption1(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 397) 
			void Capital() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Capital");
				
				Methods.Capital(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			
			//--------------------------'More Action'- //'Shareholding'-------------------------
			
			@Test(priority = 398) 
			void Shareholding() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Shareholding");
				
				
				Methods.Shareholding(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			//--------------------------'More Action'- 'Debenture Holding'-------------------------
			
			@Test(priority = 399) //16/05/2023
			void DebentureHolding() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding");
				
				Methods.DebentureHolding(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 400) 
			void AddNewDH() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -with Valid Data");
				
				Methods.AddNewDH(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 401) 
			void AddNewDHTwoMan() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New - with Two mandatory field");
				
				Methods.AddNewDHTwoMan(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 401)
			void AddNewDHEmpty() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New - with empty File");
				
				Methods.AddNewDHEmpty(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			
			@Test(priority = 401)
			void AddNewClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New - Close");
				
				Methods.AddNewClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 402) 
			void DebentureHoldingSearch() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Search-With Valid data");
				
				Methods.DebentureHoldingSearch(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 403) 
			void ClassAllDS() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding -Class-All");
				
				Methods.ClassAllDS(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 404) 
			void ClassAllNCD() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding -Class-All -NCD");
				
				Methods.ClassAllNCD(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 405) 
			void ClassAllPCD() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding -Class-All -PCD");
				
				Methods.ClassAllPCD(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 406) 
			void ClassAllFCD() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding -Class-All -FCD");
				
				Methods.ClassAllFCD(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 407) 
			void ClearFilter() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Clear Filter");
				
				Methods.ClearFilter(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 408) 
			void DHD() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details");
				
				Methods.DHD(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 409) 
			void DHDAddNew() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details -Add New");
				
				Methods.DHDAddNew(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 410) 
			void DHDAddNewEmpty() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details -Add New - with Empty Feilds ");
				
				Methods.DHDAddNewEmpty(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 411) 
			void DHDAddNewClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details -Add New -Close Button ");
				
				Methods.DHDAddNewClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 412) //18/05/2023
			void DHDUpload() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - Valid Data");
				
				Methods.DHDUpload(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 413) 
			void DHDUploadED() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with Existing data");
				
				Methods.DHDUploadED(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 414) 
			void DHDUploadInvalidData() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with Invalid data");
				
				Methods.DHDUploadInvalidData(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 415) 
			void DHDUploadEmpty() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with Empty File");
				
				Methods.DHDUploadEmpty(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 416) 
			void DHDUploadInvalidEx() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - with invalid File type extension");
				
				Methods.DHDUploadInvalidEx(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 417) 
			void DHDUploadwithoutFile() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Upload - withOut File");
				
				Methods.DHDUploadwithoutFile(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 418) 
			void DHUpload() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with Valid Data File");
				
				Methods.DHUpload(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 419) 
			void DHUploadInvalidData() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with InValid Data File");
				
				Methods.DHUploadInvalidData(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 420) 
			void DHUploadED() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with Existing Data ");
				
				Methods.DHUploadED(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 421) 
			void DHUploadEmptyFile() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with empty File ");
				
				Methods.DHUploadEmptyFile(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 422) 
			void DHUploadinvalidExten() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Upload - with invalid File type extension ");
				
				Methods.DHUploadinvalidExten(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 423) 
			void DHUploadWithOutFile() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Upload - without File ");
				
				Methods.DHUploadWithOutFile(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 424) //19/05/2023
			void DHMaster() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Master ");
				
				Methods.DHMaster(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}	
			@Test(priority = 425) 
			void DHEdit() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Edit - Click");
				
				Methods.DHEdit(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}	
			@Test(priority = 426) 
			void DHEditE() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Edit ");
				
				Methods.DHEditE(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 427) 
			void DHEditClose() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Edit - Close");
				
				Methods.DHEditClose(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}	
			@Test(priority = 428) 
			void DHDeleteCan() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Delete - NO");
				
				Methods.DHDeleteCan(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}
			@Test(priority = 429) 
			void DHDelete() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Delete -YES");
				
				Methods.DHDelete(driver,test);
				
				extent.endTest(test);
				extent.flush();
			}	
			@Test(priority = 430) 
			void DHDAddNewInvalidData() throws InterruptedException, IOException
			{
				test = extent.startTest("Entity - More Action - Debenture Holding - Add New -Debenture Holding Details - Add New - With Invalid Data");
				
				Methods.DHDAddNewInvalidData(driver,test,workbook);
				
				extent.endTest(test);
				extent.flush();
			}	

			//snehal		// ------------------- More Action -Auditors - Secretarial Auditor  --------------------------------
					
				/*	//@Test(priority = 431) //22/05/2023 double
					void SecretarialAuditorLC() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - click ");
						
						Methods.SecretarialAuditor(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 432) 
					void SAAddNewLC() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Add New ");
						
						Methods.SAAddNew(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 433) 
					void SAAddNewAE() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Add New - With Existing data");
						
						Methods.SAAddNewAE(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 434) 
					void SAAddNewCloseLC() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Add New - Close");
						
						Methods.SAAddNewClose(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 435) 
					void SAClearFilterlc() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Clear Filter");
						
						Methods.SAClearFilter(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 436) 
					void SAEditCloseLC() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Edit - Close");
						
						Methods.SAEditClose(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 437) 
					void ResignationofAuditorLC() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Resignation of Auditor - With Valid data ");
						
						Methods.ResignationofAuditor(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 438) 
					void ResignationofAuditorCloseLC() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Secretarial Auditor - Resignation of Auditor - Close ");
						
						Methods.ResignationofAuditorClose(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					// ------------------- More Action -Auditors - Cost Auditor --------------------------------
					
					@Test(priority = 439) 
					void CostAuditorlc() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Click  ");
						
						Methods.CostAuditor(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 440) 
					void CostAuditorAddNewLC() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Add New  ");
						
						Methods.CostAuditorAddNew(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 441) 
					void CAAddNewCloseLC() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Add New - Close ");
						
						Methods.CAAddNewClose(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 442) //24/05/2023
					void ResignationofAuditorEmptyCA() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Resignation of Auditor - With Empty fields ");
						
						Methods.ResignationofAuditorEmptyCA(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 443) 
					void ResignationofAuditorCloseCALC() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Auditors - Cost Auditor - Resignation of Auditor - Close ");
						
						Methods.ResignationofAuditorCloseCA(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	*/
					// ------------------- More Action - Statutory Registers --------------------------------
					
					@Test(priority = 444) 
					void StatutoryRegisters() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - Click ");
						
						Methods.StatutoryRegisters(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 445) 
					void SRDEPOSIT() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Click ");
						
						Methods.SRDEPOSIT(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 446) 
					void SRDEPOSITAddnew() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action  - Statutory Registers - Deposit - Add New ");
						
						Methods.SRDEPOSITAddnew(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 447) 
					void SRDEPOSITAddnewEmpty() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Add New - with Empty Field ");
						
						Methods.SRDEPOSITAddnewEmpty(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 448) 
					void SRDEPOSITUpload() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action- Statutory Registers - Deposit - Upload - With valid data");
						
						Methods.SRDEPOSITUpload(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 449) 
					void SRDEPOSITUploadInvalid() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Upload - With Invalid data");
						
						Methods.SRDEPOSITUploadInvalid(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 450) //29/05/2025
					void SRDEPOSITUploadEmpty() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Upload - With Empty File");
						
						Methods.SRDEPOSITUploadEmpty(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 451) 
					void SRDEPOSITUploadInvalidEx() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Upload - With Invalid File Format");
						
						Methods.SRDEPOSITUploadInvalidEx(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 452) 
					void SRDEPOSITDwonGR() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Generate Register");
						
						Methods.SRDEPOSITDwonGR(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}
					
					@Test(priority = 453) 
					void SRDEPOSITEdit() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - Deposit - Edit");
						
						Methods.SRDEPOSITEdit(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	

					@Test(priority = 454) //1/06/2023
					void SRSH2() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Click ");
						
						Methods.SRSH2(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	

					@Test(priority = 455) 
					void SRSH2AddNew() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Add New ");
						
						Methods.SRSH2AddNew(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					
					@Test(priority = 456) 
					void SRSH2AddNewEmpty() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Add New -With Empty Fields ");
						
						Methods.SRSH2AddNewEmpty(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 457) 
					void SRSH2Upload() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Upload - With Vaild Data");
						
						Methods.SRSH2Upload(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 458) 
					void SRSH2UploadInvalid() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Upload - With InVaild Data");
						
						Methods.SRSH2UploadInvalid(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 459) 
					void SRSH2UploadEmptyFile() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Upload - With Empty File");
						
						Methods.SRSH2UploadEmptyFile(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority =460) 
					void SRSH2UploadInValidEx() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-2 - Upload - With Invalid File Format");
						
						Methods.SRSH2UploadInValidEx(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 461) 
					void SRSh2DwonGR() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  SH-2 - Generate Register");
						
						Methods.SRSh2DwonGR(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 462) 
					void SRSh2Edit() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  SH-2 - Edit");
						
						Methods.SRSh2Edit(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 463) //2/06/2023
					void SRSH3() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Click ");
						
						Methods.SRSH3(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 464) 
					void SRSH3AddNew() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Add New - With valid Data");
						
						Methods.SRSH3AddNew(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 465) 
					void SRSH3AddNewInvalid() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Add New - With Invalid Data");
						
						Methods.SRSH3AddNewInvalid(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 466) 
					void SRSH3AddNewEmpty() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Add New - With Empty Fields");
						
						Methods.SRSH3AddNewEmpty(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 467) 
					void SRSH3Upload() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Upload - With valid data");
						
						Methods.SRSH3Upload(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	

					@Test(priority = 468) 
					void SRSH3UploadInvalid() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Upload - With Invalid data");
						
						Methods.SRSH3UploadInvalid(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 469) 
					void SRSH3UploadWithoutData() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Upload -   without filling data in Excel file");
						
						Methods.SRSH3UploadWithoutData(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 470) 
					void SRSH3UploadInValidEx() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-3 - Upload - With Invalid File Format");
						
						Methods.SRSH3UploadInValidEx(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					
					@Test(priority = 471) 
					void SRSh3DwonGR() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  SH-3 - Generate Register");
						
						Methods.SRSh3DwonGR(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority =472) 
					void SRSH3Edit() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  SH-3 - Edit - with Valid Data");
						
						Methods.SRSH3Edit(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 473) 
					void SRSH3EditInvalid() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  SH-3 - Edit - with Invalid Data");
						
						Methods.SRSH3EditInvalid(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 474) 
					void SRSH6() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Click ");
						
						Methods.SRSH6(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 475) //5/06/2023
					void SRSH6AddNew() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Add New - with valid Data");
						
						Methods.SRSH6AddNew(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 476) 
					void SRSH6AddNewEmpty() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Add New - with Empty Fields");
						
						Methods.SRSH6AddNewEmpty(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 477) 
					void SRSH6Upload() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Upload - With valid data");
						
						Methods.SRSH6Upload(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority =478) 
					void SRSH6UploadInvalid() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Upload - With Invalid data");
						
						Methods.SRSH6UploadInvalid(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 479) 
					void SRSH6UploadInValidEx() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - SH-6 - Upload - With Invalid File Format");
						
						Methods.SRSH6UploadInValidEx(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 480) 
					void SRSh6DwonGR() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  SH-6 - Generate Register");
						
						Methods.SRSh6DwonGR(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 481) 
					void SRSH6Edit() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  SH-6 - Edit");
						
						Methods.SRSH6Edit(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 482) 
					void SRCHG7() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Click ");
						
						Methods.SRCHG7(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 483) //06/06/2023
					void SRCHG7AddNew() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Add New - With Valid Data ");
						
						Methods.SRCHG7AddNew(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 484) 
					void SRCHG7AddnewTwoman() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Add New -  with two mandatory field ");
						
						Methods.SRCHG7AddnewTwoman(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 485) 
					void SRCHG7AddnewEmptyFields() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Add New -  with Empty fields ");
						
						Methods.SRCHG7AddnewEmptyFields(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority =486) 
					void SRCHG7Upload() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Upload-  with Valid Data ");
						
						Methods.SRCHG7Upload(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 487) 
					void SRCHG7UploadInvalid() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Upload-  with InValid Data ");
						
						Methods.SRCHG7UploadInvalid(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 488) 
					void SRCHG7UploadEmpty() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Upload-  without filling data in Excel file ");
						
						Methods.SRCHG7UploadEmpty(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 489) 
					void SRCHG7UploadInvalidFormat() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Upload -  with Invalid File Format ");
						
						Methods.SRCHG7UploadInvalidFormat(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 490) 
					void SRCHG7UploadwithOutFile() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- Upload-  without selecting a file");
						
						Methods.SRCHG7UploadwithOutFile(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 491) 
					void SRCHG7DwonGR() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7 - Generate Register");
						
						Methods.SRCHG7DwonGR(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority =492) 
					void ChargeDetailsAddNew() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Add New - With Valid Data ");
						
						Methods.ChargeDetailsAddNew(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority =493) 
					void ChargeDetailsEdit() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Edit -  with valid data ");
						
						Methods.ChargeDetailsEdit(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 494) 
					void SRCHG7ViewUpload() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Upload -  with valid data ");
						
						Methods.SRCHG7ViewUpload(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 495) 
					void SRCHG7ViewUploadWF() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Upload -  without selecting a file ");
						
						Methods.SRCHG7ViewUploadWF(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 496) 
					void SRCHG7ViewDoc() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Document -  'document' button is clickable or not Verification ");
						
						Methods.SRCHG7ViewDoc(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 497) 
					void SRCHG7ViewDocument() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Document -  download  or not Verification ");
						
						Methods.SRCHG7ViewDocument(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 498) 
					void SRCHG7View2Document() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - CHG-7- View - Document - View");
						
						Methods.SRCHG7View2Document(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 499) //09/06/2023
					void SRMBP2() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Click ");
						
						Methods.SRMBP2(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 500) 
					void SRMBP2AddNew() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - With valid Data ");
						
						Methods.SRMBP2AddNew(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority =501) 
					void SRMBP2AddNewEmpty() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - with Empty data");
						
						Methods.SRMBP2AddNewEmpty(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 502) 
					void SRMBP2AddNewGurantee() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Gurantee With valid Data ");
						
						Methods.SRMBP2AddNewGurantee(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 503) 
					void SRMBP2AddNewGuraTwoMan() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Gurantee with two mandatory field ");
						
						Methods.SRMBP2AddNewGuraTwoMan(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 504) 
					void SRMBP2AddGuraNewEmpty() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Gurantee with Empty data");
						
						Methods.SRMBP2AddGuraNewEmpty(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 505) 
					void SRMBP2AddNewLoan() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Loan With valid Data ");
						
						Methods.SRMBP2AddNewLoan(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 506) 
					void SRMBP2AddNewLoanTwoMan() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Loan with two mandatory field ");
						
						Methods.SRMBP2AddNewLoanTwoMan(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 507) 
					void SRMBP2AddLoanNewEmpty() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Loan with Empty data");
						
						Methods.SRMBP2AddLoanNewEmpty(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 508) 
					void SRMBP2AddNewSecurity() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Security With valid Data ");
						
						Methods.SRMBP2AddNewSecurity(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 509) 
					void SRMBP2AddNewSecuTwoMan() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Security with two mandatory field ");
						
						Methods.SRMBP2AddNewSecuTwoMan(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 510) 
					void SRMBP2AddSecuNewEmpty() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Add New - Security with Empty data");
						
						Methods.SRMBP2AddSecuNewEmpty(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 511)  //12/09/2023
					void SRMB2Upload() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-2 - Upload - with Valid Data");
						
						Methods.SRMB2Upload(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 512) 
					void SRMB2UploadInvalid() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Upload - with Invalid Data");
						
						Methods.SRMB2UploadInvalid(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 513) 
					void SRMB2UploadWithoutData() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Upload - without filling data in Excel file ");
						
						Methods.SRMB2UploadWithoutData(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 514) 
					void SRMB2UploadInvalidformate() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Upload -  with Invalid File Format ");
						
						Methods.SRMB2UploadInvalidformat(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 515) 
					void SRMB2GR() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Generate Register'  ");
						
						Methods.SRMB2GR(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 516) 
					void SRMBP2Edit() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - edit - With Valid data ");
						
						Methods.SRMBP2Edit(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 517) 
					void SRMB2UploadActionTab() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Upload' button which is present under Action tab - With Valid data ");
						
						Methods.SRMB2UploadActionTab(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 518) 
					void SRMB2UploadwithoutFileActionTab() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - Upload' button which is present under Action tab - WithOut Selecting File ");
						
						Methods.SRMB2UploadwithoutFileActionTab(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 519) //13/06/2023
					void SRMB2DocActionTab() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - 'document' button is clickable or not verification");
						
						Methods.SRMB2DocActionTab(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 520) 
					void SRMB2DocDwonActionTab() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - 'document' - download or not verification ");
						
						Methods.SRMB2DocDwonActionTab(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 521) 
					void SRMB2DocViewActionTab() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action  - Statutory Registers -  MBP-2 - 'document' - View or not verification ");
						
						Methods.SRMB2DocViewActionTab(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}
					@Test(priority = 522) 
					void SRMBP3() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-3 - Click ");
						
						Methods.SRMBP3(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 524) 
					void SRMBP3AddNew() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers -  MBP-3 - Add New - with Valid data ");
						
						Methods.SRMBP3AddNew(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
	
					@Test(priority = 525) 
					void SRMB3Upload() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action- Statutory Registers -   MBP-3  - Upload - With valid data");
						
						Methods.SRMB3Upload(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 526) 
					void SRMB3UploadInvalid() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action- Statutory Registers -   MBP-3  - Upload - With Invalid data");
						
						Methods.SRMB3UploadInvalid(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					
					
				//	-----------------------------------------------------------------------------------
					@Test(priority = 527) 
					void SRMB3UploadWithOutData() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action- Statutory Registers -   MBP-3  - Upload - without filling data in Excel file ");
						
						Methods.SRMB3UploadWithOutData(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 528) 
					void SRMB3UploadInvalidFormate() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action- Statutory Registers -   MBP-3  - Upload - with Invalid File Format ");
						
						Methods.SRMB3UploadInvalidFormate(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	

					@Test(priority = 529) 
					void SRMB3DwonGR() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - MBP-3  - Generate Register");
						
						Methods.SRMB3DwonGR(driver,test);
						
						extent.endTest(test);
						extent.flush();
					}	
					@Test(priority = 530) 
					void SRMBP3Edit() throws InterruptedException, IOException
					{
						test = extent.startTest("Entity - More Action - Statutory Registers - MBP-3  -Edit - With Valid Data");
						
						Methods.SRMBP3Edit(driver,test,workbook);
						
						extent.endTest(test);
						extent.flush();
					}	
				
//@AfterMethod
void Close()
{
	 driver.close(); 
}


}
