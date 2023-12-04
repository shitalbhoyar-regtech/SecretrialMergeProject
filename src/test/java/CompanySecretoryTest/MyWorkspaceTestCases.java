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

import CompnaySecretory.MyWorkspaceMethod;

public class MyWorkspaceTestCases 

{
	
	
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

	//@Test(priority=1)

	  void MyWorkspace() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace tab Verification");
		
		MyWorkspaceMethod.ClickMyWorkspace(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=2)

	  void ClickConcludedMeeting() throws InterruptedException, IOException
	  {
		test = extent.startTest("Concluded Meeting tab Verification");
		
		MyWorkspaceMethod.ClickConcludedMeeting(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//@Test(priority=3)

	  void ClickNewButton() throws InterruptedException, IOException
	  {
		test = extent.startTest("New Button Verification");
		
		MyWorkspaceMethod.ClickNewButton(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=4)

	  void ClickEditButton() throws InterruptedException, IOException
	  {
		test = extent.startTest("Edit Button Verification");
		
		MyWorkspaceMethod.ClickEditButton(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=5)

	  void ClickMoreAction() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown Verification");
		
		MyWorkspaceMethod.ClickMoreAction(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=6)

	  void ClickComplianceTab() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Compliances tab Verification");
		
		MyWorkspaceMethod.ClickComplianceTab(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//	@Test(priority=7)

	  void ClickDraftResolutionandMinuteTabTab() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Draft Resolution and Minute tab Verification");
		
		MyWorkspaceMethod.ClickDraftResolutionandMinuteTab(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//	@Test(priority=8)

	  void ClickDraftResolutionandMinuteDownloadIcon() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Draft Resolution and Minute tab- Download Icon Verification");
		
		MyWorkspaceMethod.ClickDraftResolutionandMinuteDownloadIcon(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=9)

	  void ClickAnnetureTab() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Draft Resolution and Minute tab -Annexure tab Verification");
		
		MyWorkspaceMethod.ClickAnnetureTab(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority=10)

	  void ClickAnnetureTabValidUploadFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Draft Resolution and Minute tab -Annexure tab -File Upload Verification");
		
		MyWorkspaceMethod.ClickAnnetureTabValidUploadFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=11)

	  void ClickAnnetureTabMultipleUploadFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Draft Resolution and Minute tab -Annexure tab - Multiple File Upload Verification");
		
		MyWorkspaceMethod.ClickAnnetureTabMultipleUploadFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=12)

	  void ClickAnnetureTabInvalidUploadFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Draft Resolution and Minute tab -Annexure tab - Invalid File Upload Verification");
		
		MyWorkspaceMethod.ClickAnnetureTabInvalidUploadFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=13)

	  void ClickAnnetureTabMultipleInvalidUploadFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Draft Resolution and Minute tab -Annexure tab - Multiple Invalid File Upload Verification");
		
		MyWorkspaceMethod.ClickAnnetureTabMultipleInvalidUploadFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=14)

	  void ClickAnnetureTabWithoutSelectingUploadFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Draft Resolution and Minute tab -Annexure tab - Without Selecting File Upload Verification");
		
		MyWorkspaceMethod.ClickAnnetureTabWithoutSelectingUploadFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//	@Test(priority=15)

	  void ClickAnnetureTabViewFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Draft Resolution and Minute tab -Annexure tab - View  file Verification");
		
		MyWorkspaceMethod.ClickAnnetureTabViewFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=16)

	  void ClickAnnetureTabDownloadFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Draft Resolution and Minute tab -Annexure tab - Download file Verification");
		
		MyWorkspaceMethod.ClickAnnetureTabDownloadFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=17)

	  void ClickAnnetureTabDeleteFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown-Draft Resolution and Minute tab -Annexure tab - Delete file Verification");
		
		MyWorkspaceMethod.ClickAnnetureTabDeleteFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//	@Test(priority=18)

	  void ClickMinutesTab() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown - Minutes  tab Verification");
		
		MyWorkspaceMethod.ClickMinutesTab(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=19)

	  void ClickMinutesTabDownloadIcon() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown - Minutes  tab - Download file  Verification");
		
		MyWorkspaceMethod.ClickMinutesTabDownloadIcon(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=20)

	  void ClickCertifiedTrueCopy() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown -Certified True Copy Tab  Verification");
		
		MyWorkspaceMethod.ClickCertifiedTrueCopy(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=21)

	  void ClickCTCPreviewIcon() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown -Certified True Copy Tab -Preview CTC View Icon  Verification");
		
		MyWorkspaceMethod.ClickCTCPreviewIcon(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=22)

	  void ClickCTCDownloadIcon() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown -Certified True Copy Tab - Download CTC in word  Icon  Verification");
		
		MyWorkspaceMethod.ClickCTCDownloadIcon(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=23)

	  void ClickCTCDownloadpdfIcon() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown -Certified True Copy Tab - Download CTC in PDF  Icon  Verification");
		
		MyWorkspaceMethod.ClickCTCDownloadpdfIcon(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=24)

	  void ClickUploadDocTab() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown -Upload document tab Verification");
		
		MyWorkspaceMethod.ClickUploadDocTab(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=25)

	  void ClickUploadDoc() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown -Upload document tab-Upload document file Verification");
		
		MyWorkspaceMethod.ClickUploadDoc(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=26)

	  void ClickMultipleUploadDoc() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown - Upload document tab-Upload Multiple document file Verification");
		
		MyWorkspaceMethod.ClickMultipleUploadDoc(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=27)

	  void ClickWithoutSelectingFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown - Upload document tab-Without Selecting file Verification");
		
		MyWorkspaceMethod.ClickWithoutSelectingFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=28)

	  void ClickViewFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown -Upload document tab- View file Verification");
		
		MyWorkspaceMethod.ClickViewFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=29)

	  void ClickDownloadFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown -Upload document tab- Download file Verification");
		
		MyWorkspaceMethod.ClickDownloadFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority=30)

	  void ClickDeleteFile() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown -Upload document tab- Delete file Verification");
		
		MyWorkspaceMethod.ClickDeleteFile(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//	@Test(priority=31)

	  void ClickCopyMeetingTab() throws InterruptedException, IOException
	  {
		test = extent.startTest("More Action dropdown -Copy Meeting tab- Delete file Verification");
		
		MyWorkspaceMethod.ClickCopyMeetingTab(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
		//@Test(priority=32)

		  void ClickCopyMeetingAgenda() throws InterruptedException, IOException
		  {
			test = extent.startTest("More Action dropdown -Copy Meeting tab- Copy Meeting Agenda Verification");
			
			MyWorkspaceMethod.ClickCopyMeetingAgenda(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=33)

		  void ClickCopyMeetingMultipleAgenda() throws InterruptedException, IOException
		  {
			test = extent.startTest("More Action dropdown -Copy Meeting tab- Copy Meeting Agenda(Select multiple entity from dropdown) Verification");
			
			MyWorkspaceMethod.ClickCopyMeetingMultipleAgenda(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=34)

		  void ClickCopyMeetingMultiplecheckboxAgenda() throws InterruptedException, IOException
		  {
			test = extent.startTest("More Action dropdown -Copy Meeting tab- Copy Meeting Agenda(all agenda should be selected after clicking on agenda checkbox button) Verification");
			
			MyWorkspaceMethod.ClickCopyMeetingMultiplecheckboxAgenda(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority=35)

		  void ClickCopyMeetingAgendaWithoutEnterData() throws InterruptedException, IOException
		  {
			test = extent.startTest("More Action dropdown -Copy Meeting tab- Copy Meeting Agenda-Without Enter Data Verification");
			
			MyWorkspaceMethod.ClickCopyMeetingAgendaWithoutEnterData(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=36)

		  void ClickCopyMeetingAgendaCloseBtn() throws InterruptedException, IOException
		  {
			test = extent.startTest("More Action dropdown -Copy Meeting tab- Copy Meeting Agenda- Close button Verification");
			
			MyWorkspaceMethod.ClickCopyMeetingAgendaCloseBtn(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=37)

		  void ClickCopyMeetingAgendaLog() throws InterruptedException, IOException
		  {
			test = extent.startTest("More Action dropdown -Copy Meeting tab- Copy Meeting Agenda- Delete Log Verification");
			
			MyWorkspaceMethod.ClickCopyMeetingAgendaLog(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=38)

		  void ClickCopyMeetingAgendaDeleteNoBtn() throws InterruptedException, IOException
		  {
			test = extent.startTest("More Action dropdown -Copy Meeting tab- Copy Meeting Agenda- Delete Log (No Button) Verification");
			
			MyWorkspaceMethod.ClickCopyMeetingAgendaDeleteNoBtn(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		
	//	@Test(priority=39)

		  void ClickConcludedMeetingAdd() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- Concluded Meeting -Add Tab Verification");
			
			MyWorkspaceMethod.ClickConcludedMeetingAdd(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=40)

		  void ClickMyCompliance() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Compliance tab Verification");
			
			MyWorkspaceMethod.ClickMyCompliance(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority=41)

		  void ClickMyComplianceEditBtn() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Compliance tab -Edit Icon Verification");
			
			MyWorkspaceMethod.ClickMyComplianceEditBtn(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=42)

		  void ClickMyTask() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab Verification");
			
			MyWorkspaceMethod.ClickMyTask(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=43)

		  void AddTask() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Add Task -Meeting Type Verification");
			
			MyWorkspaceMethod.AddMyTaskMetting(driver, test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
	//	@Test(priority=44)

		  void AddMyTaskAgenda() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Add Task- Agenda Type Verification");
			
			MyWorkspaceMethod.AddMyTaskAgenda(driver, test,workbook,sheet);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=45)

		  void AddMyTaskOther() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Add Task- Other Type Verification");
			
			MyWorkspaceMethod.AddMyTaskOther(driver, test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		
		//@Test(priority=46)

		  void WithoutEnterDataTask() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Add Task-Without Enter Data Verification");
			
			MyWorkspaceMethod.WithoutEnterDataTask(driver, test,workbook);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=47)

		  void AddMyTaskCloseBtn() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Add Task-close button Verification");
			
			MyWorkspaceMethod.AddMyTaskCloseBtn(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=48)

		  void EditBtn() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Edit button Verification");
			
			MyWorkspaceMethod.EditBtn(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=49)

		  void TaskViewDeatiles() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Task View Detailes Tab Verification");
			
			MyWorkspaceMethod.TaskViewDeatiles(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=50)

		  void EditTask() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Edit Task Verification");
			
			MyWorkspaceMethod.EditTask(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=51)

		  void EditTaskWithoutEnterData() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Without Enter data edit task Verification");
			
			MyWorkspaceMethod.EditTaskWithoutEnterData(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=52)

		  void DownloadDocument() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Download Document Verification");
			
			MyWorkspaceMethod.DownloadDocument(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=53)

		  void closeBtnEditTask() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Close button Verification");
			
			MyWorkspaceMethod.CloseBtn(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=54)

		  void DeleteBtn() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Delete button -'Yes' button Verification");
			
			MyWorkspaceMethod.DeleteBtn(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=55)

		  void DeleteBtnNo() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Task tab - Delete button -'No'button Verification");
			
			MyWorkspaceMethod.DeleteBtnNo(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=56)

		  void MeetingCalender() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- Meeting Calender tab Verification");
			
			MyWorkspaceMethod.MeetingCalender(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=57)

		  void AddMeetingCalender() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- Meeting Calender tab -Add Meeting Calender tab Verification");
			
			MyWorkspaceMethod.AddMeetingCalender(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=58)

		  void MeetingCalenderWithoutEnterData() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- Meeting Calender tab -New button -Without Enter Data Verification");
			
			MyWorkspaceMethod.MeetingCalenderWithoutEnterData(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=59)

		  void ClearBtn() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- Meeting Calender tab -Clear button Verification");
			
			MyWorkspaceMethod.ClearBtn(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		//@Test(priority=60)

		  void MyMeeting() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Meeting  tab - Verification");
			
			MyWorkspaceMethod.MyMeeting(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
//    @Test(priority=61)

		  void NewRegularMeeting() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Meeting  tab -New button- Regular Meeting Verification");
			
			MyWorkspaceMethod.NewRegularMeeting(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		  
//	@Test(priority=62)

		  void NewShorterMeeting() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Meeting  tab -New button- Shorter Meeting Verification");
			
			MyWorkspaceMethod.NewShorterMeeting(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
//	@Test(priority=63)

		  void NewEMeeting() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Meeting  tab -New button-  e-Meeting Verification");
			
			MyWorkspaceMethod.NewEMeeting(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
	//@Test(priority=64)

		  void CircularMeeting() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Meeting  tab -New button- Circular Meeting Verification");
			
			MyWorkspaceMethod.CircularMeeting(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
		  
	//@Test(priority=65)

		  void NewRegularNoticeMeeting() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting Verification");
			
			MyWorkspaceMethod.NewRegularNoticeMeeting(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
	//@Test(priority=66)

		  void NewShorterNoticeMeeting() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Meeting  tab -New button - Notice Shorter Meeting Verification");
			
			MyWorkspaceMethod.NewShorterNoticeMeeting(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
	//@Test(priority=67)

		  void WithoutEnterRegularNoticeMeeting() throws InterruptedException, IOException
		  {
			test = extent.startTest("My Workspace- My Meeting  tab -New button - Without Enter data  Meeting Verification");
			
			MyWorkspaceMethod.WithoutEnterRegularNoticeMeeting(driver, test);
			
			extent.endTest(test);
			extent.flush();
		}
//	@Test(priority=68)

	  void AvailabiltyOption() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Availabilty Option Verification");
		
		MyWorkspaceMethod.AvailabiltyOption(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//@Test(priority=69)

	  void ClickAvailabiltyOption() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Availabilty Tab Verification");
		
		MyWorkspaceMethod.ClickAvailabiltyOption(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//@Test(priority=70)

	  void AddNewAvailability() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Availabilty Tab -Add Availabilty Verification");
		
		MyWorkspaceMethod.AddNewAvailability(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
///@Test(priority=71)

	  void AddExistingAvailability() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Availabilty Tab -Add Exsiting Availabilty Verification");
		
		MyWorkspaceMethod.AddExistingAvailability(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//@Test(priority=72)

	  void WithoutEnterDataAvailability() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Availabilty Tab -Without Enter data Availabilty Verification");
		
		MyWorkspaceMethod.WithoutEnterDataAvailability(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//	@Test(priority=73)
	  void CancelBtnAvailability() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Availabilty Tab -Add New Btn - Cancel Button Verification");
		
		MyWorkspaceMethod.CancelBtnAvailability(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	 // @Test(priority=74)
	  void MailFormatBtn() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Availabilty Tab - Mail Format Button Verification");
		
		MyWorkspaceMethod.MailFormatBtn(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	//@Test(priority=75)
	  void UpdateMailFormat() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Availabilty Tab  - Update Mail Format  Verification");
		
		MyWorkspaceMethod.UpdateMailFormat(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
//	 @Test(priority=76)
	  void SendMail() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Availabilty Tab  - Send Mail   Verification");
		
		MyWorkspaceMethod.SendMail(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}	
	// @Test(priority=77)
	  void WithoutEnterDataSendMail() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Availabilty Tab  - Without entering detailes Send Mail  Verification");
		
		MyWorkspaceMethod.WithoutEnterDataSendMail(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}	
 //@Test(priority=78)
	  void AgendaItem() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Agenda Item Tab  Verification");
		
		MyWorkspaceMethod.AgendaItem(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}	
//@Test(priority=79)
	  void OpenAgenda() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Open Agenda Tab  Verification");
		
		MyWorkspaceMethod.OpenAgenda(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}	  
//@Test(priority=80)
void AddOpenAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Add Open Agenda Tab  Verification");
	
	MyWorkspaceMethod.AddOpenAgenda(driver, test);
	
	extent.endTest(test);
	extent.flush();
}		  
//@Test(priority=81)
void AddMultipleOpenAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Add Multiple Open Agenda Tab  Verification");
	
	MyWorkspaceMethod.AddMultipleOpenAgenda(driver, test);
	
	extent.endTest(test);
	extent.flush();
}		  
//@Test(priority=82)
void OpenAgendaInfo() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -New button - Regular Meeting  -Open Agenda Info Tab  Verification");
	
	MyWorkspaceMethod.OpenAgendaInfo(driver, test);
	
	extent.endTest(test);
	extent.flush();
}		  	 	  
	  
	  
//@Test(priority=79)
	  void NotingAgenda() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Workspace- My Meeting  tab  - Edit icon - Agenda Item -Noting agenda Tab  Verification");
		
		MyWorkspaceMethod.NotingAgenda(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}	
//@Test(priority=80)
void AddNotingAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab  - Edit icon - Agenda Item - Noting Agenda -Add Noting agenda Tab  Verification");
	
	MyWorkspaceMethod.AddNotingAgenda(driver, test);
	
	extent.endTest(test);
	extent.flush();
}	
//@Test(priority=81)
void AddMultipleNotingAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab  - Edit icon - Agenda Item - Noting Agenda-Add Multiple Noting agenda Tab  Verification");
	
	MyWorkspaceMethod.AddMultipleNotingAgenda(driver, test);
	
	extent.endTest(test);
	extent.flush();
}	
//@Test(priority=82)
void AgendaItemInformation() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab  - Edit icon - Agenda Item - Noting Agenda-View Agenda Item Information Verification");
	
	MyWorkspaceMethod.AgendaItemInformation(driver, test);
	
	extent.endTest(test);
	extent.flush();
}	
//@Test(priority=83)
void VotingAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item -Voting agenda Tab  Verification");
	
	MyWorkspaceMethod.VotingAgenda(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=84)
void AddVotingAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab  - Edit icon - Agenda Item - Voting Agenda-Add Voting agenda Tab  Verification");
	
	MyWorkspaceMethod.AddVotingAgenda(driver, test);
	
	extent.endTest(test);
	extent.flush();
}	

//@Test(priority=85)
void AddMultipleVotingAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab  - Edit icon - Agenda Item -Voting Agenda- Add Multiple Voting agenda Tab  Verification");
	
	MyWorkspaceMethod.AddMultipleVotingAgenda(driver, test);
	
	extent.endTest(test);
	extent.flush();
}	
//@Test(priority=86)
void VotingAgendaItemInformation() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab  - Edit icon - Agenda Item - Voting Agenda - View Agenda Item Information Verification");
	
	MyWorkspaceMethod.VotingAgendaItemInformation(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

//@Test(priority=87)
void NewAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab  -  Edit icon - Agenda Item -New agenda Tab  Verification");
	
	MyWorkspaceMethod.NewAgenda(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=88)
void AddNewVotingAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab  -  Edit icon - Agenda Item -Add New Voting agenda   Verification");
	
	MyWorkspaceMethod.AddNewVotingAgenda(driver, test,workbook,sheet);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=89)
void AddNewNotingAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab  -  Edit icon - Agenda Item -Add New Voting agenda   Verification");
	
	MyWorkspaceMethod.AddNewNotingAgenda(driver, test,workbook,sheet);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=90)
void WithoutEnteringData() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab  -  Edit icon - Agenda Item -Without entering agenda   Verification");
	
	MyWorkspaceMethod.WithoutEnteringData(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=91)
void CloseButton() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item -Close Button  Verification");
	
	MyWorkspaceMethod.CloseButton(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=92)
void AgendaSequence() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item -Agenda Sequence  Verification");
	
	MyWorkspaceMethod.AgendaSequence(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=93)
void AddAgendaSequence() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Add Agenda Sequence  Verification");
	
	MyWorkspaceMethod.AddAgendaSequence(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=94)
void DuplicateAgendaSequence() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Dupliacte Agenda Sequence  Verification");
	
	MyWorkspaceMethod.DuplicateAgendaSequence(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=95)
void WithoutEnterDataAgendaSequence() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Without enter sequence Agenda Sequence  Verification");
	
	MyWorkspaceMethod.WithoutEnterDataAgendaSequence(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=96)
void SigningAuthority() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Signing Authority Tab Verification");
	
	MyWorkspaceMethod.SigningAuthority(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=97)
void AddSigningAuthority() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Add Signing Authority Tab Verification");
	
	MyWorkspaceMethod.AddSigningAuthority(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=98)
void CopyMeeting() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Copy Meeting Tab Verification");
	
	MyWorkspaceMethod.CopyMeeting(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=99)
void CopyMeetingSelectEntity() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Copy Meeting Tab -Select Entity Verification");
	
	MyWorkspaceMethod.CopyMeetingSelectEntity(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=100)
void CopyMeetingSelectMultipleEntity() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Copy Meeting Tab -Select Multiple Entity Verification");
	
	MyWorkspaceMethod.CopyMeetingSelectMultipleEntity(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=101)
void AddCopyMeeting() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Add Copy Meeting Tab Verification");
	
	MyWorkspaceMethod.AddCopyMeeting(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=102)
void CloseBtnCopyMeeting() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Close Button Copy Meeting Tab Verification");
	
	MyWorkspaceMethod.CloseBtnCopyMeeting(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=103)
void WithoutEnteringCopyMeeting() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Without entering data in Copy Meeting  Verification");
	
	MyWorkspaceMethod.WithoutEnteringCopyMeeting(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=104)
void LogDetailesCopyMeeting() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item -  Copy Meeting  -Log Detailes Verification");
	
	MyWorkspaceMethod.LogDetailesCopyMeeting(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=105)
void CancelLogDetailesCopyMeeting() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Copy Meeting -Cancel Log Detailes Verification");
	
	MyWorkspaceMethod.CancelLogDetailesCopyMeeting(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=106)
void DleteLogDetailesCopyMeeting() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Copy Meeting -Delete Log Detailes Verification");
	
	MyWorkspaceMethod.DelteLogDetailesCopyMeeting(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=107)
void AgendaPrepration() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Agenda Preperation Verification");
	
	MyWorkspaceMethod.AgendaPrepration(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=108)
void AgendaPreprationClosePopupMessage() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Agenda Preperation -Close Popup Message Verification");
	
	MyWorkspaceMethod.AgendaPreprationClosePopupMessage(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=109)
void AgendaPreprationRefreshBtn() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Refresh Button Verification");
	
	MyWorkspaceMethod.AgendaPreprationRefreshBtn(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=110)
void DownloadAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Download Agenda Verification");
	
	MyWorkspaceMethod.DownloadAgenda(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=111)
void PreviewAgenda() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Preview  Agenda Verification");
	
	MyWorkspaceMethod.PreviewAgenda(driver, test);
	
	extent.endTest(test);
	extent.flush();
}
//@Test(priority=112)
void AgendaVersion() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - Agenda Version Verification");
	
	MyWorkspaceMethod.AgendaVersion(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

//@Test(priority=113)
void AgendaVersionInfo() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item - To verify whether the user can view the selected open agenda item in the \"Voting/Noting Agenda Item\" field and View the corresponding information.");
	
	MyWorkspaceMethod.AgendaVersionInfo(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

//@Test(priority=114)
void Template() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item -Voting/Noting Agenda -Verify that the user is able to close the template UI form or not ");
	
	MyWorkspaceMethod.Template(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority=115)
void VotingAgendaDelete() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item -Voting/Noting Agenda - To check whether the user is able to delete the open agenda or not");
	
	MyWorkspaceMethod.VotingAgendaDelete(driver, test);
	
	extent.endTest(test);
	extent.flush();
}

@Test(priority=116)
void VotingAgendaDeleteCan() throws InterruptedException, IOException
{
	test = extent.startTest("My Workspace- My Meeting  tab -  Edit icon - Agenda Item -Voting/Noting Agenda - To check whether the user is able to cancel delete agenda or not");
	
	MyWorkspaceMethod.VotingAgendaDeleteCan(driver, test);
	
	extent.endTest(test);
	extent.flush();
}


	@AfterMethod
	 
	 void Close()
	 {
		 driver.close(); 
	 }

}
