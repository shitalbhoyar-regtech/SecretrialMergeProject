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
import secretrial.LegalUpdatesMethods;
import secretrial.MyScreenRecorder;

public class LegalUpdatesTest {

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
	void Login() throws Exception
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
	
	//@Test(priority = 1) 
	void LegalUpdatesClick() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'Legal Updates' tab is clickable or not");
		
		LegalUpdatesMethods.LegalUpdatesClick(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 2) 
	void StatusAllChk() throws InterruptedException, IOException
	{
		test = extent.startTest("Legal Updates :- Verify that the 'Select-All' checkbox is working in Act-all dropdown");
		
		LegalUpdatesMethods.StatusAllChk(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 3) 
	void CentralStates() throws InterruptedException, IOException
	{
		test = extent.startTest("Legal Updates :-To check whether the 'Center/State' dropdown is clickable or not");
		
		LegalUpdatesMethods.CentralStates(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 4) //Pending
	void CentralFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Legal Updates :- To check whether the user is able to see legal updates on the screen accourding to the 'Central' vise");
		
		LegalUpdatesMethods.CentralFilter(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 5) //pending
	void StateFilter() throws InterruptedException, IOException
	{
		test = extent.startTest("Legal Updates :- To check whether the user is able to see legal updates on the screen accourding to the 'State' vise");
		
		LegalUpdatesMethods.StateFilter(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 6) 
	void CentralStatesChk() throws InterruptedException, IOException
	{
		test = extent.startTest("Legal Updates :- Verify that the 'Select-All' checkbox is working in Center/State dropdown");
		
		LegalUpdatesMethods.CentralStatesChk(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 7) 
	void MinistryAll() throws InterruptedException, IOException
	{
		test = extent.startTest("Legal Updates :- To check whether the 'Ministry-All' dropdown is clickable or not");
		
		LegalUpdatesMethods.MinistryAll(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 8) 
	void MinistryAll1() throws InterruptedException, IOException
	{
		test = extent.startTest("Legal Updates :- Verify that the 'Ministry of Corporation Affair' option is clickable or not");
		
		LegalUpdatesMethods.MinistryAll1(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 9) 
	void Newsletter() throws InterruptedException, IOException
	{
		test = extent.startTest("Legal Updates :- To check whether the 'Newsletter' tab is clickable or not");
		
		LegalUpdatesMethods.Newsletter(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}  
	
	// ---------------------------------------- Help and Updates -----------------------------------------------------
	
//	@Test(priority = 10) 
	void HelpUpdates() throws InterruptedException, IOException
	{
		test = extent.startTest("To check whether the 'Help and Updates' tab is clickable or not");
		
		LegalUpdatesMethods.HelpUpdates(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 11) 
	void WhatsNew() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- To check whether the 'Whats New' tab is clickable or not");
		
		LegalUpdatesMethods.WhatsNew(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
//	@Test(priority = 12) 
	void WhatsNewView() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Whats New' :- To check whether the user is able to 'View' the Release Note or not");
		
		LegalUpdatesMethods.WhatsNewView(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
 //@Test(priority = 13) 
	void HelpVideos() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- To check whether the 'Help Video' tab is clickable or not");
		
		LegalUpdatesMethods.HelpVideos(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 14) 
	void MYWORKSPACE() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : - To check whether the 'My Workspace' tab is clickable or not");
		
		LegalUpdatesMethods.MYWORKSPACE(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	

	//@Test(priority = 15) 
	void BoardMeeting() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Workspace' : To check whether the 'Board Meeting (E-Meeting)' tab is clickable or not");
		
		LegalUpdatesMethods.BoardMeeting(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 16) 
	void BoardMeetingPlay() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Workspace' :'Board Meeting : erify that the Board Meeting (E-Meeting) video starts playing when the play button is clicked, and it pauses when the pause button is clicked. ");
		
		LegalUpdatesMethods.BoardMeetingPlay(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 17) 
	void GeneralMeeting() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Workspace' : To check whether the 'General Meeting' tab is clickable or not");
		
		LegalUpdatesMethods.GeneralMeeting(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 18) 
	void GeneralMeetingPlay() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Workspace' :'General Meeting' : Verify that the General Meeting video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		
		LegalUpdatesMethods.GeneralMeetingPlay(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 19) 
	void MyTask() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Workspace' : To check whether the 'My Task' tab is clickable or not");
		
		LegalUpdatesMethods.MyTask(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 20) 
	void MyTaskPlay() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Workspace' :'My Task' : Verify that the My Task video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		
		LegalUpdatesMethods.MyTaskPlay(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 21) 
	void MYDOCUMENTS() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : To check whether the 'My Documents' tab is clickable or not");
		
		LegalUpdatesMethods.MYDOCUMENTS(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 22) 
	void ComplianceDocuments() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Documents' : To check whether the 'Compliance Document' tab is clickable or not");
		
		LegalUpdatesMethods.ComplianceDocuments(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 23) 
	void ComplianceDocumentsPlay() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Documents' :'Compliance Document' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		
		LegalUpdatesMethods.ComplianceDocumentsPlay(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 24) 
	void Registers() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Documents' : To check whether the 'Registers' tab is clickable or not");
		
		LegalUpdatesMethods.Registers(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 25) 
	void RegistersPlay() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Documents' :'Registers' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		
		LegalUpdatesMethods.RegistersPlay(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 26) 
	void HistoricalDocuments() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Documents' : To check whether the ' Historical Documents' tab is clickable or not");
		
		LegalUpdatesMethods.HistoricalDocuments(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 27) 
	void HistoricalDocumentsPlay() throws Exception
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'My Documents' :' Historical Documents' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		MyScreenRecorder.startRecording("HistoricalDocumentsPlay");
		LegalUpdatesMethods.HistoricalDocumentsPlay(driver,test);
		MyScreenRecorder.stopRecording();
  		Thread.sleep(1000);
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 28) 
	void MASTERS() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : To check whether the 'Master' tab is clickable or not");
		
		LegalUpdatesMethods.MASTERS(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 29) 
	void EntityMaster() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' :'Master' - To check whether the 'Entity Master' tab is clickable or not");
		
		LegalUpdatesMethods.EntityMaster(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 30) 
	void EntityMasterPlay() throws Exception
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'Master' :'Entity Master' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		MyScreenRecorder.startRecording("EntityMasterPlay");
		LegalUpdatesMethods.EntityMasterPlay(driver,test);
		MyScreenRecorder.stopRecording();
  		Thread.sleep(1000);
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 31) 
	void DirectorMasters() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' :'Master' - To check whether the 'Director Master' tab is clickable or not");
		
		LegalUpdatesMethods.DirectorMasters(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 32) 
	void DirectorMasterPlay() throws Exception
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'Master' :'Director Master' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		MyScreenRecorder.startRecording("DirectorMasterPlay");
		
		LegalUpdatesMethods.DirectorMasterPlay(driver,test);
		
		MyScreenRecorder.stopRecording();
  		Thread.sleep(1000);
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 33) 
	void CommitteeComposition() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' :'Master' - To check whether the 'Committees and Committee Composition' tab is clickable or not");
		
		LegalUpdatesMethods.CommitteeComposition(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 34) 
	void CommitteeCompositionPlay() throws Exception
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'Master' :'Committees and Committee Composition' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		MyScreenRecorder.startRecording("CommitteeCompositionPlay");
		
		LegalUpdatesMethods.CommitteeCompositionPlay(driver,test);
		
		MyScreenRecorder.stopRecording();
  		Thread.sleep(1000);
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 35) 
	void AuditorMaster() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' :'Master' - To check whether the 'Auditor Master' tab is clickable or not");
		
		LegalUpdatesMethods.AuditorMaster(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 36) 
	void AuditorMasterPlay() throws Exception
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'Master' :'Auditor Master' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		MyScreenRecorder.startRecording("AuditorMasterPlay");
		
		LegalUpdatesMethods.AuditorMasterPlay(driver,test);
		
		MyScreenRecorder.stopRecording();
  		Thread.sleep(1000);
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 37) 
	void Configuration() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' :'Master' - To check whether the 'Configuration' tab is clickable or not");
		
		LegalUpdatesMethods.Configuration(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 38) 
	void ConfigurationPlay() throws Exception
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'Master' :'Configuration' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		MyScreenRecorder.startRecording("ConfigurationPlay");
		
		LegalUpdatesMethods.ConfigurationPlay(driver,test);
		
		MyScreenRecorder.stopRecording();
  		Thread.sleep(1000);
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 39) 
	void ComplianceAssignmenCC() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' :'Master' - To check whether the 'Compliance Assignment and Compliance Closure' tab is clickable or not");
		
		LegalUpdatesMethods.ComplianceAssignmenCC(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 40) 
	void ComplianceAssignmenCCPlay() throws Exception
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'Master' :'Compliance Assignment and Compliance Closure' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		MyScreenRecorder.startRecording("Compliance Assignment and Compliance Closure");
		
		LegalUpdatesMethods.ComplianceAssignmenCCPlay(driver,test);
		
		MyScreenRecorder.stopRecording();
  		Thread.sleep(1000);
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 41) 
	void MYREPORTS() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : To check whether the 'MY REPORTS' tab is clickable or not");
		
		LegalUpdatesMethods.MYREPORTS(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 42) 
	void ComplianceStatusReport() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' :'MY REPORTS' - To check whether the 'Compliance Status Report' tab is clickable or not");
		
		LegalUpdatesMethods.ComplianceStatusReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 43) 
	void ComplianceStatusReportPlay() throws Exception
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'MY REPORTS' :'Compliance Status Report' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		MyScreenRecorder.startRecording("ComplianceStatusReportPlay");
		LegalUpdatesMethods.ComplianceStatusReportPlay(driver,test);
		MyScreenRecorder.stopRecording();
  		Thread.sleep(1000);
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 44) 
	void AttendanceReport() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' :'MY REPORTS' - To check whether the 'Attendance Report' tab is clickable or not");
		
		LegalUpdatesMethods.AttendanceReport(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 45) 
	void AttendanceReportPlay() throws Exception
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'MY REPORTS' :'Attendance Report' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		MyScreenRecorder.startRecording("AttendanceReportPlay");
		LegalUpdatesMethods.AttendanceReportPlay(driver,test);
		MyScreenRecorder.stopRecording();
  		Thread.sleep(1000);
		extent.endTest(test);
		extent.flush();
	}
	
	//@Test(priority = 46) 
	void MYFORMS() throws Exception
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : To check whether the 'MY FORMS' tab is clickable or not.");
		
		LegalUpdatesMethods.MYFORMS(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority = 47) 
	void Dpt3() throws InterruptedException, IOException
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' :'MY FORMS' - To check whether the 'DPT-3' tab is clickable or not");
		
		LegalUpdatesMethods.Dpt3(driver,test);
		
		extent.endTest(test);
		extent.flush();
	}
	
//	@Test(priority = 48) 
	void MyFormsPlay() throws Exception
	{
		test = extent.startTest("'Help and Updates' :- 'Help Video' : 'MY FORMS' :'DPT-3' :- Verify that the video starts playing when the play button is clicked, and it pauses when the pause button is clicked.");
		MyScreenRecorder.startRecording("MyFormsPlay");
		LegalUpdatesMethods.MyFormsPlay(driver,test);
		MyScreenRecorder.stopRecording();
  		Thread.sleep(1000);
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@AfterMethod
  	void browserClosing() throws Exception
  	{
	
  		Thread.sleep(1000);
  		driver.close();
  	}	       
  		       		
  	@AfterTest
  	void Closing() throws Exception
  	{
  		
  	}
	
}
