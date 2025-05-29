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

import CompnaySecretory.MyWorkspaceMethod;
import CompnaySecretory.UserMasterMethod;
import secretrial.DirectorMethod;
import secretrial.MasterMethod;

public class Dashboard {

	
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
		
		fis = new FileInputStream("D:\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\TestData\\Scretrial.xlsx");
		
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheetAt(0);					//Retrieving second sheet of Workbook
		return sheet;
	}
	
	@BeforeTest

	void setBrowser() throws Exception
	{
		
		extent = new com.relevantcodes.extentreports.ExtentReports("D:\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Secretarial-Project-26JULY23\\Report\\Secretrial.html",true);
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
	
	
	@Test(priority=1)//d

	  void Dashboard1() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard Verification");
		
		MyWorkspaceMethod.Dashboard(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority=2)//d

	  void EntityBox() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Entity box Verification");
		
		MyWorkspaceMethod.EntityBox(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=3)//d

	  void DirectorskpmBox() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Director box Verification");
		
		MyWorkspaceMethod.DirectorskpmBox(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=4)//d

	  void MeetingsBox() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Meeting box Verification");
		
		MyWorkspaceMethod.MeetingsBox(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=5)//d

	  void AgendasBox() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Agenda box Verification");
		
		MyWorkspaceMethod.AgendasBox(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=6)//d

	  void DraftMinutesBox() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Draft box Verification");
		
		MyWorkspaceMethod.DraftMinutesBox(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=7)//d

	  void DashboardClear() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Clear button Verification");
		
		MyWorkspaceMethod.DashboardClear(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	@Test(priority=8)//d

	  void OverduecountMatchRiskWiseEventFun() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Overall Completion Status - Overdue - Event Function - count match with Overdue Compliances by Company Verification");
		
		MyWorkspaceMethod.OverduecountMatchRiskWiseEventFun(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=9)//d

	  void OverduecountMatchRiskWiseStatutryFun() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Overall Completion Status - Overdue - Statutory Function - count match with Overdue Compliances by Company Verification");
		
		MyWorkspaceMethod.OverduecountMatchRiskWiseStatutryFun(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=10)//d

	  void OverduecountMatchRiskWiseEvenChec() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Overall Completion Status - Overdue - Event Checklist - count match with Overdue Compliances by Company Verification");
		
		MyWorkspaceMethod.OverduecountMatchRiskWiseEvenChec(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=11)//d

	  void OverduecountMatchRiskWise() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Overall Completion Status - Overdue - Statutory Checklist - count match with Overdue Compliances by Company Verification");
		
		MyWorkspaceMethod.OverduecountMatchRiskWise(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	
	@Test(priority=12)
	void ComByComOverdue() throws InterruptedException, IOException {
	    test = extent.startTest("My Dashboard - Overall Completion Status - Overdue - Statutory Checklist -SPRESSO Count match Verification");

	    for (String risk : new String[]{"High", "Medium", "Low"}) {
	        MyWorkspaceMethod.StatCheckOverdueRiskWise(driver, test, risk);
	        Thread.sleep(2000);
	    }

	    extent.endTest(test);
	    extent.flush();
	}
	
	@Test(priority=13)
	void EventCheckOverdueRiskWise() throws InterruptedException, IOException {
	    test = extent.startTest("My Dashboard - Overall Completion Status - Overdue - Event Checklist -SPRESSO Count match Verification");

	    for (String risk : new String[]{ "Medium"}) {
	        MyWorkspaceMethod.EventCheckOverdueRiskWise(driver, test, risk);
	        Thread.sleep(2000);
	    }

	    extent.endTest(test);
	    extent.flush();
	}
	
	@Test(priority=14)
	void StatFuncOverdueRiskWise() throws InterruptedException, IOException {
	    test = extent.startTest("My Dashboard - Overall Completion Status - Overdue - Statutory Function -SPRESSO Count match Verification");

	    for (String risk : new String[]{"High", "Medium", "Low"}) {
	        MyWorkspaceMethod.StatFuncOverdueRiskWise(driver, test, risk);
	        Thread.sleep(2000);
	    }

	    extent.endTest(test);
	    extent.flush();
	}
	
	@Test(priority=15)
	void EventFuncOverdueRiskWise() throws InterruptedException, IOException {
	    test = extent.startTest("My Dashboard - Overall Completion Status - Overdue - Event Function -SPRESSO Count match Verification");

	    for (String risk : new String[]{"High", "Low"}) {
	        MyWorkspaceMethod.EventFuncOverdueRiskWise(driver, test, risk);
	        Thread.sleep(2000);
	    }

	    extent.endTest(test);
	    extent.flush();
	}
	
	@Test(priority=16)
	void MyCalender() throws InterruptedException, IOException {
	    test = extent.startTest("My Dashboard - My Calender Verification");
	    MyWorkspaceMethod.MyCalender(driver, test);
	    Thread.sleep(2000);
	    extent.endTest(test);
	    extent.flush();
	}
	
	@Test(priority=17)
	void MyCalendercount() throws InterruptedException, IOException {
	    test = extent.startTest("My Dashboard - My Calender Count match Verification");
	    MyWorkspaceMethod.MyCalendercount(driver, test);
	    Thread.sleep(2000);
	    extent.endTest(test);
	    extent.flush();
	}
	
	@Test(priority=18)
	void ActionTakenReportStatus() throws InterruptedException, IOException {
	    test = extent.startTest("My Dashboard - Action Taken Report Verification");
	    MyWorkspaceMethod.ActionTakenReportStatus(driver, test);
	    Thread.sleep(2000);
	    extent.endTest(test);
	    extent.flush();
	}
	
	@Test(priority=19)
	void ActionTakenReportStatusShowAll() throws InterruptedException, IOException {
	    test = extent.startTest("My Dashboard - Action Taken Report - show All link  Verification");
	    MyWorkspaceMethod.ActionTakenReportStatusShowAll(driver, test);
	    Thread.sleep(2000);
	    extent.endTest(test);
	    extent.flush();
	}
	
	@Test(priority=20)
	void UpcomingMeetings() throws InterruptedException, IOException {
	    test = extent.startTest("My Dashboard - Upcoming Meetings Verification");
	    MyWorkspaceMethod.UpcomingMeetings(driver, test);
	    Thread.sleep(2000);
	    extent.endTest(test);
	    extent.flush();
	}
	
	@Test(priority=21)
	void UpcomingMeetingsShowAll() throws InterruptedException, IOException {
	    test = extent.startTest("My Dashboard - Upcoming Meetings - show All link  Verification");
	    MyWorkspaceMethod.UpcomingMeetingsShowAll(driver, test);
	    Thread.sleep(2000);
	    extent.endTest(test);
	    extent.flush();
	}
	
	@Test(priority=22)//d

	  void OverviewMaster() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Overview Master tab Verification");
		
		MyWorkspaceMethod.OverviewMaster(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=23)//d

	  void BasicDetails() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Basic Details Verification");
		
		MyWorkspaceMethod.BasicDetails(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=24)//d

	  void BusinessActivity() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Business Activity Details Verification");
		
		MyWorkspaceMethod.BusinessActivity(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=25)//d

	  void DirectorPrfl() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Director's tab Verification");
		
		MyWorkspaceMethod.DirectorPrfl(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=26)//d

	  void Commitee() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Committee tab Verification");
		
		MyWorkspaceMethod.Commitee(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=27)//d

	  void Shareholder() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Shareholder tab Verification");
		
		MyWorkspaceMethod.Shareholder(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=28)//d

	  void ShareholdingCategory() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Shareholding category tab Verification");
		
		MyWorkspaceMethod.ShareholdingCategory(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	
	
	/*
	@Test(priority=9)//pending

	  void OverallComplStatusOverdue() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Overall Completion Status - Overdue - SPRESSO Count match Verification");
		
		MyWorkspaceMethod.OverallComplStatusOverdue(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	  
	  
	  
	
	@Test(priority=9)//d

	  void ComByComClosedTimelyRiskwise() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Overall Completion Status - Closed-Timely - SPRESSO Count match Verification");
		
		MyWorkspaceMethod.ComByComClosedTimely(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=9)//d

	  void ComByComClosedDelayedRiskwise() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Compliances by Company - Closed-Delayed - SPRESSO Count match Verification");
		
		MyWorkspaceMethod.ComByComClosedTimely(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	
	
	@Test(priority=10)//d

	  void Function() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Clear button Verification");
		
		MyWorkspaceMethod.DashboardClear(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=11)//d

	  void DashboardChecklist() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Clear button Verification");
		
		MyWorkspaceMethod.DashboardClear(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=12)//d

	  void EventFunDashboard() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Clear button Verification");
		
		MyWorkspaceMethod.DashboardClear(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=13)//d

	  void StatutoryFunctionDashboard() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Clear button Verification");
		
		MyWorkspaceMethod.DashboardClear(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=14)//d

	  void EventChecklistDashboard() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Clear button Verification");
		
		MyWorkspaceMethod.DashboardClear(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
/*	@Test(priority=15)//d

	  void DashboardClear() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Clear button Verification");
		
		MyWorkspaceMethod.DashboardClear(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=16)//d

	  void DashboardClear() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Clear button Verification");
		
		MyWorkspaceMethod.DashboardClear(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=17)//d

	  void DashboardClear() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Clear button Verification");
		
		MyWorkspaceMethod.DashboardClear(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=18)//d

	  void DashboardClear() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Clear button Verification");
		
		MyWorkspaceMethod.DashboardClear(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	@Test(priority=19)//d

	  void DashboardClear() throws InterruptedException, IOException
	  {
		test = extent.startTest("My Dashboard - Clear button Verification");
		
		MyWorkspaceMethod.DashboardClear(driver, test);
		
		extent.endTest(test);
		extent.flush();
	}
	*/
	
/*	@AfterMethod
  	void browserClosing() throws InterruptedException
  	{
  		Thread.sleep(1000);
  		driver.close();
  	}	       
  		       		
 	@AfterTest
  	void Closing() throws InterruptedException
  	{
  		
  	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}