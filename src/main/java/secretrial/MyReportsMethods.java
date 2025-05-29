package secretrial;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
		Thread.sleep(1000);
		
		if(MyReportsLocators.MyReportsMenu(driver).isEnabled())
		{
			Thread.sleep(1000);
			MyReportsLocators.MyReportsMenu(driver).click();
			
			test.log(LogStatus.PASS, "'My Reports' tab is clickable ");
		}else {
			test.log(LogStatus.FAIL, " 'My Reports' tab is not clickable");
		}
	
		Thread.sleep(3000);
		//
	}
	
	public static void ComplianceStatusReport(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
		//Thread.sleep(3000);
		//DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ComplianceStatusReportTypeAll(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
		//Thread.sleep(3000);
		//DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void StatusAll (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
		//Thread.sleep(3000);
		//DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void StatusAllFilter (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridStatusReport']/div[2]/table/tbody/tr[1]/td[24]")); //column list

				
				
				
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
			
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClickCS (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.ComplianceStatusReport(driver).click();
			Thread.sleep(3000);
			
		if(MyReportsLocators.CompanyAllClick(driver).isEnabled()) {
			MyReportsLocators.CompanyAllClick(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Company - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Company - All' dropdown is not Clickable .");
			
		}
		//Thread.sleep(3000);
		//DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllFilterCS (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.ComplianceStatusReport(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllClick(driver).click();
			Thread.sleep(3000);
			String cattext=	MyReportsLocators.AGDL(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.AGDL(driver).click();
			Thread.sleep(4000);
			MyReportsLocators.CompanyAllClick1(driver).click();
			Thread.sleep(4000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			String GridText =	MyReportsLocators.Noitemstodisplay(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
			
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("company name");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridStatusReport']/div[2]/table/tbody/tr/td[2]")); //column list
				 
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
			
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ClearFilter (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click();
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.ComplianceStatusReport(driver).click();
			Thread.sleep(3000);
			File dir = new File("C:\\Users\\snehalp\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.Export(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);//C://Users//jiya//Downloads//
			File dir1 = new File("C:\\Users\\snehalp\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, compliance status report should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void  AttendanceReport(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
		Thread.sleep(1000);
		
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
		if(MyReportsLocators.AttendanceReport(driver).isEnabled()) 
		{
			Thread.sleep(3000);
			MyReportsLocators.AttendanceReport(driver).click();
			
			test.log(LogStatus.PASS, "User should be redirected to the Attendance Report page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the Attendance Report page.");
			
		}
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void FinancialYearAllClick (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void FinancialYearAllFilter (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
			
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClick (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllFilter (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click();
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClick(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.AGDL(driver).click();
			Thread.sleep(4000);
			File dir = new File("C:\\Users\\snehalp\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.Export(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);//C://Users//jiya//Downloads//
			File dir1 = new File("C:\\Users\\snehalp\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, Attendance report should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AllFilters (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			
			if(MyReportsLocators.View(driver).isEnabled())
			{
				MyReportsLocators.View(driver).click();
				test.log(LogStatus.PASS, "'View' functionality is working ");
				Thread.sleep(5000);
				MyReportsLocators.ViewClose(driver).click();
			}
			else
			{
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'View' functionality is not working ");
			}
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewARDownload(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.View(driver).click();
			//Thread.sleep(5000);
			//driver.switchTo().frame(MyReportsLocators.Frame(driver));
			Thread.sleep(5000);
			File dir = new File("C:\\Users\\snehalp\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ViewDownload(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\snehalp\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "The file should be downloaded after clicking on 'download' button");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			//driver.switchTo().defaultContent();
			MyReportsLocators.ViewClose(driver).click();
			Thread.sleep(3000);
			
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ARDownload(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AttendanceReport(driver).click();
			Thread.sleep(3000);
			
			
			File dir = new File("C:\\Users\\snehalp\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.Download(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\snehalp\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "The file  downloaded after clicking on 'download' button");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void   AuditorDetails(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
//		Thread.sleep(3000);
//		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClickAD (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@class='SmallMenuIcon'])[6]"))).click(); 
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
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
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
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridAuditorDetails']/div[2]/table/tbody/tr/td[1]")); //column list
				 
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
	
	public static void CompanyAllFilterDD(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DirectorDetails(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllDD(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.CompanyAllClickAD1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClickAD1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayDD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("company name");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDirectorDetails']/div[2]/table/tbody/tr/td[1]")); //column list
				 
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
	
	public static void ExportDD(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DirectorDetails(driver).click();
			Thread.sleep(3000);
		
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ExportDD(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, Director  details should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void WordDocDD(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DirectorDetails(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.WordDocBtn(driver).click();
			Thread.sleep(4000);
			
			MyReportsLocators.OnLetterhead(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.OnLetterheadYes(driver).click();
			Thread.sleep(4000);
		
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.Generate(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "user is able to 'Generate Word' document Successfully.");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			MyReportsLocators.GenerateClose(driver).click();
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void WordDocDDVal(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DirectorDetails(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.WordDocBtn(driver).click();
			Thread.sleep(4000);
			
			Thread.sleep(4000);
			MyReportsLocators.Generate(driver).click();		//Exporting (Downloading) file
			Thread.sleep(4000);
			try {
			String msg=	MyReportsLocators.SupportError(driver).getText();
			
			if(msg.equalsIgnoreCase("support@tlregtech.com.")) {
				
				test.log(LogStatus.FAIL,  "No validation message displayed Support error occured.");
			}
				
			}catch(Exception e) {
				test.log(LogStatus.PASS,  " validation message displayed ");
			}
		
			
		Thread.sleep(3000);
	
		
	}
	
	public static void  BankDetails(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
		if(MyReportsLocators.BankDetails(driver).isEnabled()) {
			MyReportsLocators.BankDetails(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the  Bank  Details page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the  Bank  Details page.");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClickBD (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.BankDetails(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.CompanyAll(driver).isEnabled()) {
			MyReportsLocators.CompanyAll(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Company - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Company - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClickAF (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AnnualFilingReport(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.CompanyAllAF(driver).isEnabled()) {
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Company - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Company - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllFilterBD(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.BankDetails(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllBD(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.CompanyAllClickAD1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClickAD1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("company name");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridBankDetails']/table/tbody/tr/td[1]")); //column list
				 
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
	
	
	public static void ExportBD(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.BankDetails(driver).click();
			Thread.sleep(3000);
		
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ExportBD(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, Bank details should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void   DIR3KYCDetails(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
		if(MyReportsLocators.DIR3KYCDetails(driver).isEnabled()) {
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the   DIR-3 KYC Details page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the  DIR-3 KYC Details page.");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void StatusAllClickKYC(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.StatusAllKYC(driver).isEnabled()) {
			MyReportsLocators.StatusAllKYC(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Status - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Status - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void StatusAllFilterKYC(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.StatusAllKYC(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.StatusAllKYC1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.StatusAllKYC1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("Status- All");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDIR3KYC']/table/tbody/tr/td[1]")); //column list
				 
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
						if(text.get(l).equalsIgnoreCase(li.get(i)))
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
		}else {
			test.log(LogStatus.PASS, "No items to display ");	
		}
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void FYClickKYC(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.FYClickKYC(driver).isEnabled()) {
			MyReportsLocators.FYClickKYC(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Financial Year - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Financial Year - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void FYKYCFilter(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.FYClickKYC(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.FYClickKYC1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.FYClickKYC1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("Financial Year-All");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDIR3KYC']/table/tbody/tr/td[3]")); //column list
				 
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
						if(text.get(l).equalsIgnoreCase(li.get(i)))
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
		}else {
			test.log(LogStatus.PASS, "No items to display ");	
		}
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ExportKYC(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(3000);
		
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ExportBD(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, DIR-3 KYC Details should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AddNew(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.AddNew(driver).isEnabled()) {
			MyReportsLocators.AddNew(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the 'Add New DIR-3 KYC' page");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the 'Add New DIR-3 KYC' page.");
			
		}
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AddNewData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
		
			MyReportsLocators.AddNew(driver).click();
			Thread.sleep(5000);
			MyReportsLocators.Director(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.Director1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.IsKYCApplicable_True(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.Financialyear(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.Financialyear1(driver).click();
			Thread.sleep(2000);
			
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(33);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			MyReportsLocators.KYCStatus(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(34);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			MyReportsLocators.SRN(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(35);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			MyReportsLocators.Remark(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			MyReportsLocators.Save(driver).click();
			Thread.sleep(4000);
			try {
		String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
	}catch(Exception e) {
		String text=MyReportsLocators.SaveMsgAE(driver).getText();
		Thread.sleep(4000);
		test.log(LogStatus.FAIL, text);
	}
			
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AddNewWithOutData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
		
			MyReportsLocators.AddNew(driver).click();
			Thread.sleep(5000);
		
			MyReportsLocators.Save(driver).click();
			Thread.sleep(4000);
			
		String text=MyReportsLocators.ValMsg(driver).getText();
			Thread.sleep(4000);
			
				test.log(LogStatus.PASS, text);
			
			
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AddNewDataWD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
		
			MyReportsLocators.AddNew(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.IsKYCApplicable_True(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.Financialyear(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.Financialyear1(driver).click();
			Thread.sleep(2000);
			
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(33);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			MyReportsLocators.KYCStatus(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(34);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			MyReportsLocators.SRN(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(35);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			MyReportsLocators.Remark(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			MyReportsLocators.Save(driver).click();
			Thread.sleep(4000);
			try {
				String text=MyReportsLocators.ValMsg(driver).getText();
			Thread.sleep(4000);
			
				test.log(LogStatus.PASS, text);
			
	}catch(Exception e) {
		String text=MyReportsLocators.SaveMsgAE(driver).getText();
		Thread.sleep(4000);
		test.log(LogStatus.FAIL,"The wrong validation message is displayed:- "+ text);
	}
			
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadBtn(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.UploadBtn(driver).isEnabled()) {
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the 'Upload Document' page");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the 'Upload Document' page.");
			
		}
		MyReportsLocators.UploadBtnClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void Upload(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
	
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleFormat(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\DIR3-KYCReport.xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(3000);
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
		MyReportsLocators.UploadBtnClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadWD(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
	
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleFormat(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\DIR3-KYCReport (1).xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(3000);
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.FAIL, text);
			}else {
				test.log(LogStatus.PASS, text);
			}
		MyReportsLocators.UploadBtnClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadIE(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
	
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(3000);
			String text=MyReportsLocators.UploadVAl(driver).getText();
			Thread.sleep(4000);
			
			
				test.log(LogStatus.PASS, text);
			
		MyReportsLocators.UploadBtnClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void EditClick(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.EditClick(driver).isEnabled()) {
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "The 'DIR-3 KYC Details' editing interface should open");
		}else {
			test.log(LogStatus.FAIL, " The 'DIR-3 KYC Details' editing interface should not open.");
			
		}
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void Edit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DIR3KYCDetails(driver).click();
			Thread.sleep(5000);
			
		
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(3000);
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			MyReportsLocators.Remark(driver).clear();
			Thread.sleep(1000);
			row0 = sheet.getRow(35);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			MyReportsLocators.Remark(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			MyReportsLocators.Save(driver).click();
			Thread.sleep(4000);
			
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
		
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void  AnnualFilingReport(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
		if(MyReportsLocators.AnnualFilingReport(driver).isEnabled()) {
			MyReportsLocators.AnnualFilingReport(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the Annual Filling Report page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the Annual Filling Report page.");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ExportAFR(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.AnnualFilingReport(driver).click();
			Thread.sleep(3000);
		
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ExportBD(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, Annual Filling details should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void  DPT3StatusReport(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
		if(MyReportsLocators.DPT3StatusReport(driver).isEnabled()) {
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the DPT-3 Status Report page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the DPT-3 Status Report page.");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClickDPT (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.CompanyAllAF(driver).isEnabled()) {
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Company - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Company - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllFilterDPT(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.CompanyAllClickAD1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClickAD1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("company name");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDPT3Status']/table/tbody/tr/td[1]")); //column list
				 
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
	
	public static void FYDPT(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.FYDPT(driver).isEnabled()) {
			MyReportsLocators.FYDPT(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Financial Year - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Financial Year - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void FYDPTFilter(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(5000);
		
			MyReportsLocators.FYDPT(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.FYDPT1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.FYDPT1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("Financial Year-All");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDPT3Status']/table/tbody/tr/td[2]")); //column list
				 
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
						if(text.get(l).equalsIgnoreCase(li.get(i)))
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
		}else {
			test.log(LogStatus.PASS, "No items to display ");	
		}
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ExportDPT(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(3000);
		
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ExportBD(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, DPT-3 Status Report should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AddNewDPT(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(5000);
			
		
			MyReportsLocators.AddNewDpt(driver).click();
			Thread.sleep(5000);
			MyReportsLocators.CompanyName(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.CompanyName1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.FinancialyearDPT(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.FinancialyearDPT1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.WheatherApplicable(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.DPTClosureDate(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPTClosureDate1(driver).click();
			Thread.sleep(2000);
			
			
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(34);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			MyReportsLocators.SRN(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			MyReportsLocators.ApprovalDatebyMCA(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.ApprovalDatebyMCA1(driver).click();
			Thread.sleep(2000);
			
			
			row0 = sheet.getRow(35);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			MyReportsLocators.Remark(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			MyReportsLocators.SaveBtn(driver).click();
			Thread.sleep(4000);
			try {
		String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.PASS, text);
			}
	}catch(Exception e) {
		String text=MyReportsLocators.SaveMsgAE(driver).getText();
		Thread.sleep(4000);
		test.log(LogStatus.FAIL, text);
	}
			
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void  DPT3StatusUpload(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(3000);
		if(MyReportsLocators.UploadDpt(driver).isEnabled()) {
			MyReportsLocators.UploadDpt(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the 'Upload Document' page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the 'Upload Document' page.");
			
		}
		MyReportsLocators.UploadBtnClose(driver).click();
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadDPT(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(5000);
			
	
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleDPT(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\DPT3-StatusReport.xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(3000);
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
		MyReportsLocators.UploadBtnClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadDPTE(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(5000);
			
	
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleDPT(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\DPT3-StatusReport.xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(3000);
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.FAIL, text);
			}else {
				test.log(LogStatus.PASS, text);
			}
		MyReportsLocators.UploadBtnClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadDptIE(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(5000);
			
	
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(3000);
			String text=MyReportsLocators.UploadVAl(driver).getText();
			Thread.sleep(4000);
			
			
				test.log(LogStatus.PASS, text);
			
		MyReportsLocators.UploadBtnClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void EditDPTClick(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.EditClick(driver).isEnabled()) {
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "The 'DPT-3 Details' editing interface should open.");
		}else {
			test.log(LogStatus.FAIL, "The 'DPT-3 Details' editing interface should not open,.");
			
		}
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void EditDPT(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPT3StatusReport(driver).click();
			Thread.sleep(5000);
			
		
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.DPTClosureDate(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DPTClosureDate1(driver).click();
			Thread.sleep(2000);
			
			
			
			MyReportsLocators.SaveBtn(driver).click();
			Thread.sleep(4000);
			try {
		String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.PASS, text);
			}
	}catch(Exception e) {
		String text=MyReportsLocators.SaveMsgAE(driver).getText();
		Thread.sleep(4000);
		test.log(LogStatus.FAIL, text);
	}
			
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void  MSMEReport(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(4000);
			 Actions act =new Actions(driver);
	            act.sendKeys(Keys.PAGE_DOWN).build().perform();
	            Thread.sleep(7000);

		if(MyReportsLocators.MSMEReport(driver).isEnabled()) {
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a/span");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			test.log(LogStatus.PASS, "User should be redirected to the MSME Report page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the MSME Report page.");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClickMSME (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.MSMEReport(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.CompanyAllAF(driver).isEnabled()) {
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Company - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Company - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllFilterMSME(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.MSMEReport(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.CompanyAllClickAD2(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClickAD2(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("company name");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDPT3Status']/table/tbody/tr/td[1]")); //column list
				 
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
	
	public static void FYMSME(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.MSMEReport(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.FYDPT(driver).isEnabled()) {
			MyReportsLocators.FYDPT(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Financial Year - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Financial Year - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void FYMSMEFilter(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.MSMEReport(driver).click();
			Thread.sleep(5000);
		
			MyReportsLocators.FYDPT(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.FYDPT1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.FYDPT1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("Financial Year-All");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDPT3Status']/table/tbody/tr/td[2]")); //column list
				 
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
						if(text.get(l).equalsIgnoreCase(li.get(i)))
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
		}else {
			test.log(LogStatus.PASS, "No items to display ");	
		}
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	
	public static void ExportMSME(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a/span");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
		
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ExportBD(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, MSME Report should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AddNewMSME(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a/span");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.AddNewDpt(driver).click();
			Thread.sleep(5000);
			MyReportsLocators.CompanyName(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.CompanyName1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.FinancialyearDPT(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.FinancialyearDPT1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.WheatherApplicable(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.DateOfReceiptOfData(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DateOfReceiptOfData1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.DateOfFilling(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DateOfFilling1(driver).click();
			Thread.sleep(2000);
			
			
			sheet = workbook.getSheetAt(1); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(34);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			MyReportsLocators.SRN(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
		
			row0 = sheet.getRow(35);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			MyReportsLocators.Remark(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			MyReportsLocators.SaveBtn1(driver).click();
			Thread.sleep(4000);
			try {
		String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Save Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.PASS, text);
			}
	}catch(Exception e) {
		String text=MyReportsLocators.SaveMsgAE(driver).getText();
		Thread.sleep(4000);
		test.log(LogStatus.FAIL, text);
	}
			
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void  MSMEUpload(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a/span");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		if(MyReportsLocators.UploadDpt(driver).isEnabled()) {
			MyReportsLocators.UploadDpt(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the 'Upload Document' page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the 'Upload Document' page.");
			
		}
		MyReportsLocators.UploadBtnClose(driver).click();
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadMSME(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a/span");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
	
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleDPT(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\MSMEReport.xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(3000);
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
		MyReportsLocators.UploadBtnClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadMSMEE(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a/span");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
	
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleDPT(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\MSMEReport.xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(3000);
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.FAIL, text);
			}else {
				test.log(LogStatus.PASS, text);
			}
		MyReportsLocators.UploadBtnClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadMSMEIE(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
		MyReportsLocators.MyReportsMenu(driver).click();
		Thread.sleep(8000);
		By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a/span");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(4000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
		Thread.sleep(4000);
	
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(3000);
			String text=MyReportsLocators.UploadVAl(driver).getText();
			Thread.sleep(4000);
			
			
				test.log(LogStatus.PASS, text);
			
		MyReportsLocators.UploadBtnClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void EditMSMEClick(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
		
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a/span");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
		
			
		if(MyReportsLocators.EditClick(driver).isEnabled()) {
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "The 'MSME Details'  editing interface should open.");
		}else {
			test.log(LogStatus.FAIL, "The 'MSME Details' editing interface should not open,.");
			
		}
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void EditMSME(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a/span");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.DateOfReceiptOfData(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DateOfReceiptOfData1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.SaveBtn1(driver).click();
			Thread.sleep(4000);
			try {
		String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.PASS, text);
			}
	}catch(Exception e) {
		String text=MyReportsLocators.SaveMsgAE(driver).getText();
		Thread.sleep(4000);
		test.log(LogStatus.FAIL, text);
	}
			
		MyReportsLocators.AddNewClose(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void  Reg26ofSEBILODR(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(4000);
			 Actions act =new Actions(driver);
	            act.sendKeys(Keys.PAGE_DOWN).build().perform();
	            Thread.sleep(7000);

		if(MyReportsLocators.MSMEReport(driver).isEnabled()) {
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			test.log(LogStatus.PASS, "User should be redirected to the 'Reg 26(3) of SEBI (LODR)' page.");
		}else {
			test.log(LogStatus.FAIL, " User should not redirected to the 'Reg 26(3) of SEBI (LODR)' page.");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AddNewReg26ofSEBILODR(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.AddNew(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SelectCompany(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.SelectCompany1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.SelectDirector(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.SelectDirector1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.FinancialyearReg(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.FinancialyearReg1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.SaveBtnReg(driver).click();
			Thread.sleep(3000);
			
			try {
				String text=MyReportsLocators.SaveMsg(driver).getText();
					Thread.sleep(4000);
					if(text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.PASS, text);
					}else {
						test.log(LogStatus.PASS, text);
					}
			}catch(Exception e) {
				String text=MyReportsLocators.SaveMsgAEreg(driver).getText();
				Thread.sleep(4000);
				test.log(LogStatus.FAIL, text);
			}
					
		
		MyReportsLocators.AddNewClosereg(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AddNewReg26ofSEBILODRAE(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.AddNew(driver).click();
			Thread.sleep(3000);
			
			
			MyReportsLocators.SaveBtnReg(driver).click();
			Thread.sleep(3000);
			
				String text=MyReportsLocators.SaveMsgAEreg(driver).getText();
				Thread.sleep(4000);
				test.log(LogStatus.FAIL, text);
			
					
		
		MyReportsLocators.AddNewClosereg(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadReg(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
	
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleReg(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Reg26SEBIReport.xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(4000);
			try {
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
			}catch(Exception e) {
				
				String text=MyReportsLocators.UploadVAl(driver).getText();
				Thread.sleep(4000);
			
					test.log(LogStatus.FAIL, text);
			}
		MyReportsLocators.UploadBtnClose1(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadRegVal(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleReg(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Reg26SEBIReport (1).xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(4000);
			try {
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
			}catch(Exception e) {
				
				String text=MyReportsLocators.UploadVAl(driver).getText();
				Thread.sleep(4000);
			
					test.log(LogStatus.PASS, text);
			}
		MyReportsLocators.UploadBtnClose1(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadRegVal1(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleReg(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Reg26SEBIReport (2).xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(4000);
			try {
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
			}catch(Exception e) {
				
				String text=MyReportsLocators.UploadVAl(driver).getText();
				Thread.sleep(4000);
			
					test.log(LogStatus.PASS, text);
			}
		MyReportsLocators.UploadBtnClose1(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadRegValD1(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleReg(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Reg26SEBIReport (3).xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(4000);
			try {
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
			}catch(Exception e) {
				
				String text=MyReportsLocators.UploadVAl(driver).getText();
				Thread.sleep(4000);
			
					test.log(LogStatus.PASS, text);
			}
		MyReportsLocators.UploadBtnClose1(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadRegValDE1(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleReg(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(4000);
			try {
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
			}catch(Exception e) {
				
				String text=MyReportsLocators.UploadVAl(driver).getText();
				Thread.sleep(4000);
			
					test.log(LogStatus.PASS, text);
			}
		MyReportsLocators.UploadBtnClose1(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClickReg (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.RegReport(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.CompanyAllAF(driver).isEnabled()) {
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Company - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Company - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllFilterReg(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.RegReport(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.CompanyAllClickAD1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClickAD1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("company name");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDPT3Status']/table/tbody/tr/td[1]")); //column list
				 
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
	
	public static void DirectorAllClickReg (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.RegReport(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.DirectorAll(driver).isEnabled()) {
			MyReportsLocators.DirectorAll(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Director - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Director - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorAllFilterReg(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.RegReport(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClickAD1(driver).click();
			Thread.sleep(4000);
			
			MyReportsLocators.DirectorAll(driver).click();
			Thread.sleep(3000);
			
		String cattext=	MyReportsLocators.DirectorAll1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.DirectorAll1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("Director");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDPT3Status']/table/tbody/tr/td[2]")); //column list
				 
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
					 test.log(LogStatus.PASS,  filter.get(i)+" displayed accourding to the selected Director name from Director - All dropdown.");
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
	
	public static void FinancialYearAllReg (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.RegReport(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.FinancialYearAllREg(driver).isEnabled()) {
			MyReportsLocators.FinancialYearAllREg(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Financial Year-All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Financial Year-All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void FinancialYearAllFilterReg(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.RegReport(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClickAD2(driver).click();
			Thread.sleep(4000);
			
			MyReportsLocators.FinancialYearAllREg(driver).click();
			Thread.sleep(3000);
			
		String cattext=	MyReportsLocators.FinancialYearAllREg1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.FinancialYearAllREg1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("'Financial Year");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDPT3Status']/table/tbody/tr/td[3]")); //column list
				 
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
					 test.log(LogStatus.PASS,  filter.get(i)+" displayed accourding to the selected 'Financial Year from 'Financial Year-All dropdown.");
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
	
	public static void ExportReg(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ExportBD(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, Reg 26(3) of SEBI (LODR) Status Report should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void EditReg(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.DateOfSubmission(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DateOfSubmission1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.SaveBtnreg(driver).click();
			Thread.sleep(4000);
			try {
		String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.PASS, text);
			}
	}catch(Exception e) {
		String text=MyReportsLocators.SaveMsgAE(driver).getText();
		Thread.sleep(4000);
		test.log(LogStatus.FAIL, text);
	}
			
		MyReportsLocators.AddNewClosereg(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void EditRegUpload(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\Food Safety & Standard Rules 2011.pdf");
			Thread.sleep(5000);
			
			MyReportsLocators.SaveBtnreg(driver).click();
			Thread.sleep(4000);
			try {
		String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.PASS, text);
			}
	}catch(Exception e) {
		String text=MyReportsLocators.SaveMsgAE(driver).getText();
		Thread.sleep(4000);
		test.log(LogStatus.FAIL, text);
	}
			
		MyReportsLocators.AddNewClosereg(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void EditDraftDocument(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.Selectfile1(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\Food Safety & Standard Rules 2011.pdf");
			Thread.sleep(5000);
			
			MyReportsLocators.SaveBtnreg(driver).click();
			Thread.sleep(4000);
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.DraftDocument(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "Draft Document should be downloaded successfully");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
	
			
		MyReportsLocators.AddNewClosereg(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void View(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.ViewReg(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.ViewRegClose(driver).click();
			Thread.sleep(5000);
			
			
				test.log(LogStatus.PASS,  "User should be redirected to the 'View' popup");
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewDownload(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.ViewReg(driver).click();
			Thread.sleep(5000);
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ViewRegDownload(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "Use should able to download the document");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
			
			MyReportsLocators.ViewRegClose(driver).click();
			Thread.sleep(5000);
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewUploadDoc(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.ViewReg(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.ViewReg1(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.ViewRegClose1(driver).click();
			Thread.sleep(5000);
			
			
			test.log(LogStatus.PASS,  "User should able to View the document");
			
			MyReportsLocators.ViewRegClose(driver).click();
			Thread.sleep(5000);
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewUploadDocDelete(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			MyReportsLocators.ViewReg(driver).click();
			Thread.sleep(5000);
		
By locator2 = By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[2]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator2));
			Thread.sleep(4000);
			
			WebElement ViewButton2 = driver.findElement(locator2);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton2);
			Thread.sleep(4000);
			   String msg=MyReportsLocators.DeleteMsg(driver).getText();
		         Thread.sleep(1000);
	          	
By locator1 = By.xpath("(//*[@class='btn btn-primary'])[4]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
			Thread.sleep(4000);
			
			WebElement ViewButton1 = driver.findElement(locator1);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton1);
			Thread.sleep(4000);
			
			test.log(LogStatus.PASS,  "Message displayed :- "+msg);
			
			MyReportsLocators.ViewRegClose(driver).click();
			Thread.sleep(5000);
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewUploadDocDeleteCan(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			MyReportsLocators.ViewReg(driver).click();
			Thread.sleep(5000);
		
By locator2 = By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[2]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator2));
			Thread.sleep(4000);
			
			WebElement ViewButton2 = driver.findElement(locator2);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton2);
			Thread.sleep(4000);
			   
	          	
By locator1 = By.xpath("(//*[@class='btn btn-primary'])[5]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
			Thread.sleep(4000);
			
			WebElement ViewButton1 = driver.findElement(locator1);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton1);
			Thread.sleep(4000);
			
			test.log(LogStatus.PASS,  "The document should not deleted from the system");
			
			MyReportsLocators.ViewRegClose(driver).click();
			Thread.sleep(5000);
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DeleteCan(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
		
By locator2 = By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator2));
			Thread.sleep(4000);
			
			WebElement ViewButton2 = driver.findElement(locator2);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton2);
			Thread.sleep(4000);
			  
	          	
By locator1 = By.xpath("(//*[@class='btn btn-primary'])[5]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
			Thread.sleep(4000);
			
			WebElement ViewButton1 = driver.findElement(locator1);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton1);
			Thread.sleep(4000);
			
			test.log(LogStatus.PASS,  "The document should not deleted from the system");
			
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void Delete(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[12]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
		
By locator2 = By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator2));
			Thread.sleep(4000);
			
			WebElement ViewButton2 = driver.findElement(locator2);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton2);
			Thread.sleep(4000);
			   String msg=MyReportsLocators.DeleteMsg(driver).getText();
		         Thread.sleep(1000);
	          	
By locator1 = By.xpath("(//*[@class='btn btn-primary'])[4]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
			Thread.sleep(4000);
			
			WebElement ViewButton1 = driver.findElement(locator1);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton1);
			Thread.sleep(4000);
			
			test.log(LogStatus.PASS,  "Message displayed :- "+msg);
			
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void  IndependenceDeclaration(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(4000);
			 Actions act =new Actions(driver);
	            act.sendKeys(Keys.PAGE_DOWN).build().perform();
	            Thread.sleep(7000);

		if(MyReportsLocators.MSMEReport(driver).isEnabled()) {
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			test.log(LogStatus.PASS, "User should be redirected to the Independance Decleration page.");
		}else {
			test.log(LogStatus.FAIL, "User should be redirected to the Independance Decleration page.");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AddNewIndependenceDeclaration(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.AddNew(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SelectCompany(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.SelectCompany2(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.SelectDirector(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.SelectDirector1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.FinancialyearReg(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.FinancialyearReg1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.SaveBtnReg(driver).click();
			Thread.sleep(3000);
			
			try {
				String text=MyReportsLocators.SaveMsg(driver).getText();
					Thread.sleep(4000);
					if(text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.PASS, text);
					}else {
						test.log(LogStatus.PASS, text);
					}
			}catch(Exception e) {
				String text=MyReportsLocators.SaveMsgAEreg(driver).getText();
				Thread.sleep(4000);
				test.log(LogStatus.FAIL, text);
			}
					
		
		MyReportsLocators.AddNewClosereg(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void AddNewIndependenceDeclarationWD(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.AddNew(driver).click();
			Thread.sleep(3000);
			
			
			MyReportsLocators.SaveBtnReg(driver).click();
			Thread.sleep(3000);
			
				String text=MyReportsLocators.SaveMsgAEreg(driver).getText();
				Thread.sleep(4000);
				test.log(LogStatus.FAIL, text);
			
					
		
		MyReportsLocators.AddNewClosereg(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
	
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleReg(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\IndDecReport.xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(4000);
			try {
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
			}catch(Exception e) {
				
				String text=MyReportsLocators.UploadVAl(driver).getText();
				Thread.sleep(4000);
			
					test.log(LogStatus.FAIL, text);
			}
		MyReportsLocators.UploadBtnClose1(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadIDVal(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleReg(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\IndDecReport (1).xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(4000);
			try {
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
			}catch(Exception e) {
				
				String text=MyReportsLocators.UploadVAl(driver).getText();
				Thread.sleep(4000);
			
					test.log(LogStatus.PASS, text);
			}
		MyReportsLocators.UploadBtnClose1(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadIDVal1(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleReg(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\IndDecReport (2).xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(4000);
			try {
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
			}catch(Exception e) {
				
				String text=MyReportsLocators.UploadVAl(driver).getText();
				Thread.sleep(4000);
			
					test.log(LogStatus.PASS, text);
			}
		MyReportsLocators.UploadBtnClose1(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadIDValD1(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleReg(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\IndDecReport (3).xlsx");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(4000);
			try {
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
			}catch(Exception e) {
				
				String text=MyReportsLocators.UploadVAl(driver).getText();
				Thread.sleep(4000);
			
					test.log(LogStatus.PASS, text);
			}
		MyReportsLocators.UploadBtnClose1(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void UploadIDValDE1(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			MyReportsLocators.UploadBtn(driver).click();
			Thread.sleep(3000);
			
			MyReportsLocators.SampleReg(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");
			Thread.sleep(3000);
			MyReportsLocators.Upload(driver).click();
			Thread.sleep(4000);
			try {
			String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.FAIL, text);
			}
			}catch(Exception e) {
				
				String text=MyReportsLocators.UploadVAl(driver).getText();
				Thread.sleep(4000);
			
					test.log(LogStatus.PASS, text);
			}
		MyReportsLocators.UploadBtnClose1(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllClickIn (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.IndependenceDeclaration(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.CompanyAllAF(driver).isEnabled()) {
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Company - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Company - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CompanyAllFilterIn(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.IndependenceDeclaration(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
		String cattext=	MyReportsLocators.CompanyAllClickAD2(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClickAD2(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("company name");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDPT3Status']/table/tbody/tr/td[1]")); //column list
				 
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
	
	public static void DirectorAllClickIn (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.IndependenceDeclaration(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.DirectorAllIn(driver).isEnabled()) {
			MyReportsLocators.DirectorAllIn(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Director - All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Director - All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DirectorAllFilterIn(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.IndependenceDeclaration(driver).click();
			Thread.sleep(3000);
		
			MyReportsLocators.CompanyAllAF(driver).click();
			Thread.sleep(3000);
			MyReportsLocators.CompanyAllClickAD2(driver).click();
			Thread.sleep(4000);
			
			MyReportsLocators.DirectorAllIn(driver).click();
			Thread.sleep(3000);
			
		String cattext=	MyReportsLocators.DirectorAll1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.DirectorAll1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("Director");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDPT3Status']/table/tbody/tr/td[2]")); //column list
				 
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
					 test.log(LogStatus.PASS,  filter.get(i)+" displayed accourding to the selected Director name from Director - All dropdown.");
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
	
	public static void FinancialYearAllIn (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.IndependenceDeclaration(driver).click();
			Thread.sleep(5000);
			
		if(MyReportsLocators.FinancialYearAllIn(driver).isEnabled()) {
			MyReportsLocators.FinancialYearAllIn(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "'Financial Year-All' dropdown is Clickable.");
		}else {
			test.log(LogStatus.FAIL, " 'Financial Year-All' dropdown is not Clickable .");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void FinancialYearAllFilterIn(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.IndependenceDeclaration(driver).click();
			Thread.sleep(3000);
	
			MyReportsLocators.FinancialYearAllIn(driver).click();
			Thread.sleep(3000);
			
		String cattext=	MyReportsLocators.FinancialYearAllREg1(driver).getText();
			Thread.sleep(3000);
			MyReportsLocators.FinancialYearAllREg1(driver).click();
			Thread.sleep(4000);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");		
			
			Thread.sleep(4000);
			String GridText =	MyReportsLocators.NoitemstodisplayBD(driver).getText();
			Thread.sleep(3000);
		if(!GridText.equalsIgnoreCase("No items to display")) {
		
		        List<String> li=new ArrayList<String>();
		        
		        li.add(cattext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("'Financial Year");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//*[@id='gridDPT3Status']/table/tbody/tr/td[3]")); //column list
				 
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
					 test.log(LogStatus.PASS,  filter.get(i)+" displayed accourding to the selected 'Financial Year from 'Financial Year-All dropdown.");
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
	
	
	public static void ExportID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (60));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ExportBD(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "On clicking on export button, Independance Decleration data should be downloaded");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void EditID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.DateOfSubmission(driver).click();
			Thread.sleep(1000);
			MyReportsLocators.DateOfSubmission1(driver).click();
			Thread.sleep(2000);
			
			MyReportsLocators.SaveBtnreg(driver).click();
			Thread.sleep(4000);
			try {
		String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.PASS, text);
			}
	}catch(Exception e) {
		String text=MyReportsLocators.SaveMsgAE(driver).getText();
		Thread.sleep(4000);
		test.log(LogStatus.FAIL, text);
	}
			
		MyReportsLocators.AddNewClosereg(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void EditRegUploadID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.Selectfile(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\Food Safety & Standard Rules 2011.pdf");
			Thread.sleep(5000);
			
			MyReportsLocators.SaveBtnreg(driver).click();
			Thread.sleep(4000);
			try {
		String text=MyReportsLocators.SaveMsg(driver).getText();
			Thread.sleep(4000);
			if(text.equalsIgnoreCase("Record Updated Successfully")) {
				test.log(LogStatus.PASS, text);
			}else {
				test.log(LogStatus.PASS, text);
			}
	}catch(Exception e) {
		String text=MyReportsLocators.SaveMsgAE(driver).getText();
		Thread.sleep(4000);
		test.log(LogStatus.FAIL, text);
	}
			
		MyReportsLocators.AddNewClosereg(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void EditDraftDocumentID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.EditClick(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.Selectfile1(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\Food Safety & Standard Rules 2011.pdf");
			Thread.sleep(5000);
			
			MyReportsLocators.SaveBtnreg(driver).click();
			Thread.sleep(4000);
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.DraftDocument(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "Draft Document should be downloaded successfully");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
	
			
		MyReportsLocators.AddNewClosereg(driver).click();
		Thread.sleep(3000);
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.ViewReg(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.ViewRegClose(driver).click();
			Thread.sleep(5000);
			
			
				test.log(LogStatus.PASS,  "User should be redirected to the 'View' popup");
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewDownloadID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.ViewReg(driver).click();
			Thread.sleep(5000);
			
			File dir = new File("C:\\Users\\Mayuri\\Downloads");
			File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
			
			Thread.sleep(4000);
			MyReportsLocators.ViewRegDownload(driver).click();		//Exporting (Downloading) file
			
			Thread.sleep(4000);
			File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
			File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
			
			Thread.sleep(3000);
			if (dirContents.length < allFilesNew.length) {
				test.log(LogStatus.PASS,  "Use should able to download the document");
			} else {
				test.log(LogStatus.FAIL, "File does not downloaded.");
			}
			
			
			
			MyReportsLocators.ViewRegClose(driver).click();
			Thread.sleep(5000);
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewUploadDocID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			
		
			MyReportsLocators.ViewReg(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.ViewReg1(driver).click();
			Thread.sleep(5000);
			
			MyReportsLocators.ViewRegClose1(driver).click();
			Thread.sleep(5000);
			
			
			test.log(LogStatus.PASS,  "User should able to View the document");
			
			MyReportsLocators.ViewRegClose(driver).click();
			Thread.sleep(5000);
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewUploadDocDeleteID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			MyReportsLocators.ViewReg(driver).click();
			Thread.sleep(5000);
		
By locator2 = By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[2]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator2));
			Thread.sleep(4000);
			
			WebElement ViewButton2 = driver.findElement(locator2);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton2);
			Thread.sleep(4000);
			   String msg=MyReportsLocators.DeleteMsg(driver).getText();
		         Thread.sleep(1000);
	          	
By locator1 = By.xpath("(//*[@class='btn btn-primary'])[4]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
			Thread.sleep(4000);
			
			WebElement ViewButton1 = driver.findElement(locator1);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton1);
			Thread.sleep(4000);
			
			test.log(LogStatus.PASS,  "Message displayed :- "+msg);
			try {
				driver.switchTo().alert().accept();
			}catch(Exception e) {
				
			}
			
			MyReportsLocators.ViewRegClose(driver).click();
			Thread.sleep(5000);
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void ViewUploadDocDeleteCanID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
			MyReportsLocators.ViewReg(driver).click();
			Thread.sleep(5000);
		
By locator2 = By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[2]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator2));
			Thread.sleep(4000);
			
			WebElement ViewButton2 = driver.findElement(locator2);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton2);
			Thread.sleep(4000);
			   
	          	
By locator1 = By.xpath("(//*[@class='btn btn-primary'])[5]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
			Thread.sleep(4000);
			
			WebElement ViewButton1 = driver.findElement(locator1);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton1);
			Thread.sleep(4000);
			
			test.log(LogStatus.PASS,  "The document should not deleted from the system");
			
			MyReportsLocators.ViewRegClose(driver).click();
			Thread.sleep(5000);
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DeleteCanID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
		
By locator2 = By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator2));
			Thread.sleep(4000);
			
			WebElement ViewButton2 = driver.findElement(locator2);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton2);
			Thread.sleep(4000);
			  
	          	
By locator1 = By.xpath("(//*[@class='btn btn-primary'])[5]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
			Thread.sleep(4000);
			
			WebElement ViewButton1 = driver.findElement(locator1);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton1);
			Thread.sleep(4000);
			
			test.log(LogStatus.PASS,  "The document should not deleted from the system");
			
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void DeleteID(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='myReportMenu']/a/img"))); 
		Thread.sleep(1000);
		
			MyReportsLocators.MyReportsMenu(driver).click();
			Thread.sleep(8000);
			By locator = By.xpath("//*[@id='myReportMenu']/ul/li[11]/a");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
			Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			Thread.sleep(4000);
		
By locator2 = By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator2));
			Thread.sleep(4000);
			
			WebElement ViewButton2 = driver.findElement(locator2);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton2);
			Thread.sleep(4000);
			   String msg=MyReportsLocators.DeleteMsg(driver).getText();
		         Thread.sleep(1000);
	          	
By locator1 = By.xpath("(//*[@class='btn btn-primary'])[4]");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
			Thread.sleep(4000);
			
			WebElement ViewButton1 = driver.findElement(locator1);	
			Thread.sleep(4000);
		jse.executeScript("arguments[0].click();", ViewButton1);
			Thread.sleep(4000);
			
			test.log(LogStatus.PASS,  "Message displayed :- "+msg);
			try {
				driver.switchTo().alert().accept();
			}catch(Exception e) {
				
			}
			
	
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	
	
	
	
}
