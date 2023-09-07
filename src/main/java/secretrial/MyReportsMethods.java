package secretrial;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyReportsMethods {

	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	public static void ReportsClick(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
		if(MyReportsLocators.MyReportsMenu(driver).isEnabled()) {
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS, "'My Reports' tab is clickable ");
		}else {
			test.log(LogStatus.FAIL, " 'My Reports' tab is not clickable");
		}
	
		Thread.sleep(3000);
		
	}
	
	public static void ComplianceStatusReport(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
		if(MyReportsLocators.ComplianceStatusReport(driver).isEnabled()) {
			MyReportsLocators.ComplianceStatusReport(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the Compliance Status Report page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the Compliance Status Report page.");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ComplianceStatusReportTypeAll(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.ComplianceStatusReport(driver).click();
			Thread.sleep(3000);
		if(MyReportsLocators.TypeAll(driver).isEnabled()) {
			MyReportsLocators.TypeAll(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "Type-All  dropdown is working .");
		}else {
			test.log(LogStatus.FAIL, " Type-All  dropdown is not working .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void StatusAll (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.ComplianceStatusReport(driver).click();
			Thread.sleep(3000);
			
		if(MyReportsLocators.StatusAll(driver).isEnabled()) {
			MyReportsLocators.StatusAll(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Status-All' dropdown is working .");
		}else {
			test.log(LogStatus.FAIL, " 'Status-All' dropdown is not working .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void StatusAllFilter (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.ComplianceStatusReport(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.StatusAll(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.Overdue(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.Overdue(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.ApplyBtn(driver).click();
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("Status");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridStatusReport']/div[2]/table/tbody/tr/td[22]")); //column list

				
				
				
				Thread.sleep(2000);

				for(int i=0; i<li.size(); i++){
					
					List<String> text= new ArrayList<String>();
					HashSet<String> pass=new LinkedHashSet<>();
					HashSet<String> fail=new LinkedHashSet<>();
					List<WebElement> raw=new ArrayList<WebElement>();

						if(i==0)
						{
							raw.addAll(Statuscol);
						}
						
						
					for(int k=0;k<raw.size();k++)
						{
							text.add(raw.get(k).getText());
						}

						for(int l=0;l<text.size();l++)
							{
						if(text.get(l).equals(li.get(i)))
							{
								pass.add(text.get(l));	
								System.out.println("pass : "+text.get(l)+" : "+li.get(i));

							}
						else
						{
							fail.add(text.get(l));		
							System.out.println("fail : "+text.get(l)+" : "+li.get(i));
							System.out.println(i);

						}
						 }
				 
			for(String Fal : fail)
				 {
						test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
				 }	
				 for(String Pas : pass)
				 {
					 test.log(LogStatus.PASS,  filter.get(i)+" dropdown working properly.");
						test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
						System.out.println(filter.get(i)+" : "+Pas);
			 }
				 text.clear();
				pass.clear();
				fail.clear();
				raw.clear();
				
				
				}
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ClearFilter (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.ComplianceStatusReport(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.StatusAll(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.Overdue(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.Overdue(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.ApplyBtn(driver).click();
			Thread.sleep(4000);
			
			if(MyReportsLocators.ClearFilter(driver).isEnabled()) {
				MyReportsLocators.ClearFilter(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "Clicking on Clear Button : - The data should revert to its original state without any filters applied");
			}else {
				test.log(LogStatus.FAIL, " Clear Button  is not working .");
				
			}
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ExportCSR(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.ComplianceStatusReport(driver).click();
			Thread.sleep(3000);
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.Export(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);//C://Users//jiya//Downloads//
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, compliance status report should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void  AttendanceReport(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
		if(MyReportsLocators.AttendanceReport(driver).isEnabled()) {
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the Attendance Report page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the Attendance Report page.");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void FinancialYearAllClick (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			
		if(MyReportsLocators.FinancialYearAllClick(driver).isEnabled()) {
			MyReportsLocators.FinancialYearAllClick(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Financial Year-All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Financial Year-All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void FinancialYearAllFilter (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.FinancialYearAllClick(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.FinancialYearAll(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.FinancialYearAll(driver).click();
			Thread.sleep(3000);
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("Financial Year");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridReport']/div[2]/table/tbody/tr/td[4]")); //column list
				 
				Thread.sleep(2000);

				for(int i=0; i<li.size(); i++){
					
					List<String> text= new ArrayList<String>();
					HashSet<String> pass=new LinkedHashSet<>();
					HashSet<String> fail=new LinkedHashSet<>();
					List<WebElement> raw=new ArrayList<WebElement>();

						if(i==0)
						{
							raw.addAll(Statuscol);
						}
						
						
					for(int k=0;k<raw.size();k++)
						{
							text.add(raw.get(k).getText());
						}

						for(int l=0;l<text.size();l++)
							{
						if(text.get(l).equals(li.get(i)))
							{
								pass.add(text.get(l));	
								System.out.println("pass : "+text.get(l)+" : "+li.get(i));

							}
						else
						{
							fail.add(text.get(l));		
							System.out.println("fail : "+text.get(l)+" : "+li.get(i));
							System.out.println(i);

						}
						 }
				 
			for(String Fal : fail)
				 {
						test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
				 }	
				 for(String Pas : pass)
				 {
					 test.log(LogStatus.PASS,  filter.get(i)+" displayed accourding to the selected  financial year from dropdown.");
						test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
						System.out.println(filter.get(i)+" : "+Pas);
			 }
				 text.clear();
				pass.clear();
				fail.clear();
				raw.clear();
				
				
				}
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClick (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			
		if(MyReportsLocators.CompanyAllClick(driver).isEnabled()) {
			MyReportsLocators.CompanyAllClick(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Company - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Company - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllFilter (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllClick(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.AGDL(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.AGDL(driver).click();
			Thread.sleep(4000);
			MyReportsLocators.CompanyAllClick1(driver).click();
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.Noitemstodisplay(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("company name");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridReport']/div[2]/table/tbody/tr/td[2]")); //column list
				 
				Thread.sleep(2000);

				for(int i=0; i<li.size(); i++){
					
					List<String> text= new ArrayList<String>();
					HashSet<String> pass=new LinkedHashSet<>();
					HashSet<String> fail=new LinkedHashSet<>();
					List<WebElement> raw=new ArrayList<WebElement>();

						if(i==0)
						{
							raw.addAll(Statuscol);
						}
						
						
					for(int k=0;k<raw.size();k++)
						{
							text.add(raw.get(k).getText());
						}

						for(int l=0;l<text.size();l++)
							{
						if(text.get(l).equals(li.get(i)))
							{
								pass.add(text.get(l));	
								System.out.println("pass : "+text.get(l)+" : "+li.get(i));

							}
						else
						{
							fail.add(text.get(l));		
							System.out.println("fail : "+text.get(l)+" : "+li.get(i));
							System.out.println(i);

						}
						 }
				 
			for(String Fal : fail)
				 {
						test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
				 }	
				 for(String Pas : pass)
				 {
					 test.log(LogStatus.PASS,  filter.get(i)+" displayed accourding to the selected company name from Company - All dropdown.");
						test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
						System.out.println(filter.get(i)+" : "+Pas);
			 }
				 text.clear();
				pass.clear();
				fail.clear();
				raw.clear();
				
				
				}
		}else {
			test.log(LogStatus.PASS, "No items to display ");	
		}
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ExportAR(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClick(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.AGDL(driver).click();
			Thread.sleep(4000);
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.Export(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);//C://Users//jiya//Downloads//
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, Attendance report should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AllFilters (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.FinancialYearAllClick(driver).click();
			Thread.sleep(3000);
		String FY=	MyReportsLocators.FinancialYearAll(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.FinancialYearAll(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllClick(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.AGDL(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.AGDL(driver).click();
			Thread.sleep(4000);
			MyReportsLocators.CompanyAllClick1(driver).click();
			Thread.sleep(4000);
			
			String GridText =	MyReportsLocators.Noitemstodisplay(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(FY);
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
				filter.add("Financial Year");	
				filter.add("company name");	
			
				 List<WebElement> FYcol=driver.findElements(By.xpath("//*[@id='gridReport']/div[2]/table/tbody/tr/td[4]")); //column list
				 List<WebElement> Companycol=driver.findElements(By.xpath("//*[@id='gridReport']/div[2]/table/tbody/tr/td[2]")); //column list
				 
				Thread.sleep(2000);

				for(int i=0; i<li.size(); i++){
					
					List<String> text= new ArrayList<String>();
					HashSet<String> pass=new LinkedHashSet<>();
					HashSet<String> fail=new LinkedHashSet<>();
					List<WebElement> raw=new ArrayList<WebElement>();

						if(i==0)
						{
							raw.addAll(FYcol);
						}else if(i==1)
						{
							raw.addAll(Companycol);
						}
						
						
					for(int k=0;k<raw.size();k++)
						{
							text.add(raw.get(k).getText());
						}

						for(int l=0;l<text.size();l++)
							{
						if(text.get(l).equals(li.get(i)))
							{
								pass.add(text.get(l));	
								System.out.println("pass : "+text.get(l)+" : "+li.get(i));

							}
						else
						{
							fail.add(text.get(l));		
							System.out.println("fail : "+text.get(l)+" : "+li.get(i));
							System.out.println(i);

						}
						 }
				 
			for(String Fal : fail)
				 {
						test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
				 }	
				 for(String Pas : pass)
				 {
					 test.log(LogStatus.PASS,  filter.get(i)+" displayed accourding to the selected  from  dropdown.");
						test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
						System.out.println(filter.get(i)+" : "+Pas);
			 }
				 text.clear();
				pass.clear();
				fail.clear();
				raw.clear();
				
				
				}
		}else {
			test.log(LogStatus.PASS, "No items to display ");	
		}
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewAR(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.View(driver).click();
			Thread.sleep(5000);
			MyReportsLocators.ViewClose(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'View' functionality is working ");
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewARDownload(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.View(driver).click();
			Thread.sleep(5000);
			driver.switchTo().frame(MyReportsLocators.Frame(driver));
			Thread.sleep(5000);
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ViewDownload(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "The file should be downloaded after clicking on 'download' button");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			driver.switchTo().defaultContent();
			MyReportsLocators.ViewClose(driver).click();
			Thread.sleep(3000);
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ARDownload(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.Download(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "The file  downloaded after clicking on 'download' button");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void   AuditorDetails(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
		if(MyReportsLocators.AuditorDetails(driver).isEnabled()) {
			MyReportsLocators.AuditorDetails(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the  Auditor Details page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the  Auditor Details page.");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClickAD (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AuditorDetails(driver).click();
			Thread.sleep(3000);
			
		if(MyReportsLocators.CompanyAllClickAD(driver).isEnabled()) {
			MyReportsLocators.CompanyAllClickAD(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Company - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Company - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllFilterAD(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AuditorDetails(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllClickAD(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.CompanyAllClickAD1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClickAD1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayAD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("company name");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridReport']/div[2]/table/tbody/tr/td[2]")); //column list
				 
				Thread.sleep(2000);

				for(int i=0; i<li.size(); i++){
					
					List<String> text= new ArrayList<String>();
					HashSet<String> pass=new LinkedHashSet<>();
					HashSet<String> fail=new LinkedHashSet<>();
					List<WebElement> raw=new ArrayList<WebElement>();

						if(i==0)
						{
							raw.addAll(Statuscol);
						}
						
						
					for(int k=0;k<raw.size();k++)
						{
							text.add(raw.get(k).getText());
						}

						for(int l=0;l<text.size();l++)
							{
						if(text.get(l).equals(li.get(i)))
							{
								pass.add(text.get(l));	
								System.out.println("pass : "+text.get(l)+" : "+li.get(i));

							}
						else
						{
							fail.add(text.get(l));		
							System.out.println("fail : "+text.get(l)+" : "+li.get(i));
							System.out.println(i);

						}
						 }
				 
			for(String Fal : fail)
				 {
						test.log(LogStatus.FAIL, filter.get(i)+" column shows incorrect value : "+Fal);
				 }	
				 for(String Pas : pass)
				 {
					 test.log(LogStatus.PASS,  filter.get(i)+" displayed accourding to the selected company name from Company - All dropdown.");
						test.log(LogStatus.PASS, filter.get(i)+" displayed : "+Pas);	
						System.out.println(filter.get(i)+" : "+Pas);
			 }
				 text.clear();
				pass.clear();
				fail.clear();
				raw.clear();
				
				
				}
		}else {
			test.log(LogStatus.PASS, "No items to display ");	
		}
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ExportAD(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AuditorDetails(driver).click();
			Thread.sleep(3000);
		
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ExportAD(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, Auditor details should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void  DirectorDetails(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
		if(MyReportsLocators.DirectorDetails(driver).isEnabled()) {
			MyReportsLocators.DirectorDetails(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the  Director Details page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the  Director Details page.");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClickDD (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DirectorDetails(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.CompanyAllClickDD(driver).isEnabled()) {
			MyReportsLocators.CompanyAllClickDD(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Company - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Company - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	
	
}
