package secretrial;

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

public class LegalUpdatesMethods {

	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	public static void LegalUpdatesClick(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[12]"))); 
		Thread.sleep(1000);
		
		if(LegalUpdatesLocators.LegalUpdates(driver).isEnabled()) {
			LegalUpdatesLocators.LegalUpdates(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS, "User should be redirected to the Legal Updates page");
		}else {
			test.log(LogStatus.FAIL, "User should not redirected to the Legal Updates page");
			
		}
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void CentralFilter (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[12]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.LegalUpdates(driver).click();
		Thread.sleep(7000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divDDLAct']/div/div"))); 
		
		Thread.sleep(3000);
		LegalUpdatesLocators.CentralStates(driver).click();
			Thread.sleep(3000);
		String centext=	LegalUpdatesLocators.Central(driver).getText();
			Thread.sleep(3000);
			LegalUpdatesLocators.Central(driver).click();
			Thread.sleep(3000);
		
		//	JavascriptExecutor js = (JavascriptExecutor) driver;
		//	js.executeScript("window.scrollBy(0,1000)");
		
			
			Thread.sleep(2000);
		        List<String> li=new ArrayList<String>();
		        
		        li.add(centext);
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("Central");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//div[@id='legalUpdatesListView']//div//div[1]//ul[1]//li[2]//a[1]")); //column list

				
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
	
	public static void StatusAllChk(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[12]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.LegalUpdates(driver).click();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divDDLAct']/div/div"))); 
		Thread.sleep(3000);
		LegalUpdatesLocators.ActAll(driver).click();
			Thread.sleep(3000);
			if(LegalUpdatesLocators.ActAllChk(driver).isEnabled()) {
				LegalUpdatesLocators.ActAllChk(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "All act should be displayed on the grid");
			}else {
				test.log(LogStatus.FAIL, "All act should be displayed on the grid");
				
			}
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	

	public static void CentralStatesChk(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[12]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.LegalUpdates(driver).click();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divDDLAct']/div/div"))); 
		Thread.sleep(3000);
		LegalUpdatesLocators.CentralStates(driver).click();
			Thread.sleep(3000);
			if(LegalUpdatesLocators.CentralStateChk(driver).isEnabled()) {
				LegalUpdatesLocators.CentralStateChk(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "All Central/States should be displayed on the grid");
			}else {
				test.log(LogStatus.FAIL, "All Central/States should be displayed on the grid");
				
			}
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	
	public static void CentralStates(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[12]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.LegalUpdates(driver).click();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divDDLAct']/div/div"))); 
		
		Thread.sleep(3000);
		
			if(LegalUpdatesLocators.CentralStates(driver).isEnabled()) {
				LegalUpdatesLocators.CentralStates(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to see two options in dropdown i.e. - Center, State");
			}else {
				test.log(LogStatus.FAIL, "User should not able to see two options in dropdown i.e. - Center, State");
				
			}
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void StateFilter (WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[12]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.LegalUpdates(driver).click();
		Thread.sleep(7000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divDDLAct']/div/div"))); 
		
		Thread.sleep(3000);
		LegalUpdatesLocators.CentralStates(driver).click();
			Thread.sleep(3000);
		String centext=	LegalUpdatesLocators.States(driver).getText();
			Thread.sleep(3000);
			LegalUpdatesLocators.States(driver).click();
			Thread.sleep(3000);
			
			Thread.sleep(2000);
		        List<String> li=new ArrayList<String>();
		        
		        li.add("State");
		       
		        Thread.sleep(3000);
		        
				List<String> filter=new ArrayList<String>();	
			
				filter.add("State");	
			
				 List<WebElement> Statuscol=driver.findElements(By.xpath("//div[@id='legalUpdatesListView']//div//div[1]//ul[1]//li[2]//a[1]")); //column list
					
				
				
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
	

	public static void MinistryAll(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[12]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.LegalUpdates(driver).click();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divDDLAct']/div/div"))); 
		
		Thread.sleep(3000);
		
			if(LegalUpdatesLocators.MinistryAll(driver).isEnabled()) {
				LegalUpdatesLocators.MinistryAll(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to see 'Ministry of Corporation Affair' option in the dropdown");
			}else {
				test.log(LogStatus.FAIL, "User should not able to see 'Ministry of Corporation Affair' option in the dropdown");
				
			}
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void MinistryAll1(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[12]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.LegalUpdates(driver).click();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divDDLAct']/div/div"))); 
		
		Thread.sleep(3000);
		LegalUpdatesLocators.MinistryAll(driver).click();
		Thread.sleep(3000);
		
			if(LegalUpdatesLocators.MinistryAll1(driver).isEnabled()) {
				LegalUpdatesLocators.MinistryAll1(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "Legal update displayes on the screen accourding to the 'Ministry of Corporation Affair' selection");
			}else {
				test.log(LogStatus.FAIL, "Legal update  not displayes on the screen accourding to the 'Ministry of Corporation Affair' selection");
				
			}
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void Newsletter(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[12]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.LegalUpdates(driver).click();
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='divDDLAct']/div/div"))); 
		
		Thread.sleep(3000);
			if(LegalUpdatesLocators.Newsletter(driver).isEnabled()) {
				LegalUpdatesLocators.Newsletter(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should be redirected to the Newsletter Page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the Newsletter Page");
				
			}
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void HelpUpdates(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
	
		Thread.sleep(3000);
			if(LegalUpdatesLocators.HelpUpdates(driver).isEnabled()) {
				LegalUpdatesLocators.HelpUpdates(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should be redirected to see the following two options i.e. Whats New , Help Video");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to see the following two options i.e. Whats New , Help Video");
				
			}
		
		Thread.sleep(3000);
	//	DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void WhatsNew(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.WhatsNew(driver).isEnabled()) {
				LegalUpdatesLocators.WhatsNew(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should be redirected to the Whats New page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the Whats New page");
				
			}
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void WhatsNewView(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.WhatsNew(driver).click();
		Thread.sleep(6000);
	
		LegalUpdatesLocators.WhatsNewView(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.WhatsNewClose(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS, "User should be able to view Relese Note successfully");
		
		Thread.sleep(3000);
		DirectorLocator.ClickDashboard(driver).click();
		Thread.sleep(2000);
		
	}
	
	public static void HelpVideos(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.HelpVideos(driver).isEnabled()) {
				LegalUpdatesLocators.HelpVideos(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should be redirected to the Help Video New page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the Help Video New page");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void MYWORKSPACE(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.MYWORKSPACE(driver).isEnabled()) {
				LegalUpdatesLocators.MYWORKSPACE(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to see three options in the 'My Workspace' tab i.e. Board Meeting (E-Meeting), General Meeting, My Task");
			}else {
				test.log(LogStatus.FAIL, "User should  not able to see three options in the 'My Workspace' tab i.e. Board Meeting (E-Meeting), General Meeting, My Task");
				
			}
		
		Thread.sleep(3000);
		
	}
	
	public static void BoardMeeting(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYWORKSPACE(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.BoardMeeting(driver).isEnabled()) {
				LegalUpdatesLocators.BoardMeeting(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to redirected to.the Board Meeting (E-Meeting) page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to.the Board Meeting (E-Meeting) page");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void BoardMeetingPlay(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYWORKSPACE(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.BoardMeeting(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.BoardMeetingPlay(driver).isEnabled()) {
				LegalUpdatesLocators.BoardMeetingPlay(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to Play/Pause video successfully");
			}else {
				test.log(LogStatus.FAIL, "User should not Play/Pause video");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void GeneralMeeting(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYWORKSPACE(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.GeneralMeeting(driver).isEnabled()) {
				LegalUpdatesLocators.GeneralMeeting(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to redirected to the General Meeting page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the General Meeting  page");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void GeneralMeetingPlay(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYWORKSPACE(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.GeneralMeeting(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.BoardMeetingPlay(driver).isEnabled()) {
				LegalUpdatesLocators.BoardMeetingPlay(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to Play/Pause video successfully");
			}else {
				test.log(LogStatus.FAIL, "User should not Play/Pause video");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void MyTask(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYWORKSPACE(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.MyTask(driver).isEnabled()) {
				LegalUpdatesLocators.MyTask(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to redirected to the My Task page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the My Task page");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void MyTaskPlay(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYWORKSPACE(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MyTask(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.BoardMeetingPlay(driver).isEnabled()) {
				LegalUpdatesLocators.BoardMeetingPlay(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to Play/Pause video successfully");
			}else {
				test.log(LogStatus.FAIL, "User should not Play/Pause video");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void MYDOCUMENTS(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.MYDOCUMENTS(driver).isEnabled()) {
				LegalUpdatesLocators.MYDOCUMENTS(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to see three options in the 'My Documents' tab i.e. Compliance Document ,Registers, Historical Documents");
			}else {
				test.log(LogStatus.FAIL, "User should not see three options in the 'My Documents' tab i.e. Compliance Document ,Registers, Historical Documents");
				
			}
		
		Thread.sleep(3000);
		
	}
	
	public static void ComplianceDocuments(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYDOCUMENTS(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.ComplianceDocuments(driver).isEnabled()) {
				LegalUpdatesLocators.ComplianceDocuments(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to redirected to the Compliance Document page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the Compliance Document page");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void ComplianceDocumentsPlay(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYDOCUMENTS(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.ComplianceDocuments(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.BoardMeetingPlay(driver).isEnabled()) {
				LegalUpdatesLocators.BoardMeetingPlay(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to Play/Pause video successfully");
			}else {
				test.log(LogStatus.FAIL, "User should not Play/Pause video");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void Registers(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYDOCUMENTS(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.Registers(driver).isEnabled()) {
				LegalUpdatesLocators.Registers(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to redirected to the Register  page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the Register  page");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void RegistersPlay(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYDOCUMENTS(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.Registers(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.BoardMeetingPlay(driver).isEnabled()) {
				LegalUpdatesLocators.BoardMeetingPlay(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to Play/Pause video successfully");
			}else {
				test.log(LogStatus.FAIL, "User should not Play/Pause video");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void HistoricalDocuments(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYDOCUMENTS(driver).click();
		Thread.sleep(3000);
		
			if(LegalUpdatesLocators.HistoricalDocuments(driver).isEnabled()) {
				LegalUpdatesLocators.HistoricalDocuments(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to redirected to the Historical Documents  page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the Historical Documents  page");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void HistoricalDocumentsPlay(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MYDOCUMENTS(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HistoricalDocuments(driver).click();
		Thread.sleep(3000);
		//play video
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById(\"videoHelpControl\").play()");
		
		Thread.sleep(3000);
		//pause playing video 
		 jse.executeScript("document.getElementById(\"videoHelpControl\").pause()");
		 Thread.sleep(4000);
		 
		 jse.executeScript("document.getElementById(\"videoHelpControl\").play()");
		 Thread.sleep(3000);
		
		 test.log(LogStatus.PASS, "Check Video file User should able to Play/Pause video ");
	
		/*	if(LegalUpdatesLocators.BoardMeetingPlay(driver).isEnabled()) {
				LegalUpdatesLocators.BoardMeetingPlay(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to Play/Pause video successfully");
			}else {
				test.log(LogStatus.FAIL, "User should not Play/Pause video");
				
			}
		*/
		Thread.sleep(3000);
	
		
	}
	
	public static void MASTERS(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
	
			if(LegalUpdatesLocators.MASTERS(driver).isEnabled()) {
				LegalUpdatesLocators.MASTERS(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "'Master' tab is clickable");
			}else {
				test.log(LogStatus.FAIL, "'Master' tab is not clickable");
				
			}
		
		Thread.sleep(3000);
		
	}
	
	public static void EntityMaster(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MASTERS(driver).click();
		Thread.sleep(3000);
		
			if(LegalUpdatesLocators.EntityMaster(driver).isEnabled()) {
				LegalUpdatesLocators.EntityMaster(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to redirected to the Entity Master page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the Entity Master  page");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void EntityMasterPlay(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MASTERS(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.EntityMaster(driver).click();
		Thread.sleep(3000);
		//play video
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById(\"videoHelpControl\").play()");
		
		Thread.sleep(3000);
		//pause playing video 
		 jse.executeScript("document.getElementById(\"videoHelpControl\").pause()");
		 Thread.sleep(4000);
		 
		 jse.executeScript("document.getElementById(\"videoHelpControl\").play()");
		 Thread.sleep(3000);
		
		 test.log(LogStatus.PASS, "Check Video file User should able to Play/Pause video ");
	
	
		
	}
	
	public static void DirectorMasters(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MASTERS(driver).click();
		Thread.sleep(3000);
		
			if(LegalUpdatesLocators.DirectorMasters(driver).isEnabled()) {
				LegalUpdatesLocators.DirectorMasters(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to redirected to the Director Masters page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the Director Master  page");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void DirectorMasterPlay(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MASTERS(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.DirectorMasters(driver).click();
		Thread.sleep(3000);
		//play video
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById(\"videoHelpControl\").play()");
		
		Thread.sleep(3000);
		//pause playing video 
		 jse.executeScript("document.getElementById(\"videoHelpControl\").pause()");
		 Thread.sleep(4000);
		 
		 jse.executeScript("document.getElementById(\"videoHelpControl\").play()");
		 Thread.sleep(3000);
		
		 test.log(LogStatus.PASS, "Check Video file User should able to Play/Pause video ");
	
	
		
	}
	
	public static void CommitteeComposition(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MASTERS(driver).click();
		Thread.sleep(3000);
		
			if(LegalUpdatesLocators.CommitteeComposition(driver).isEnabled()) {
				LegalUpdatesLocators.CommitteeComposition(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to redirected to the Committees and Committee Composition page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the Committees and Committee Composition page");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void CommitteeCompositionPlay(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MASTERS(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.CommitteeComposition(driver).click();
		Thread.sleep(3000);
		//play video
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById(\"videoHelpControl\").play()");
		
		Thread.sleep(3000);
		//pause playing video 
		 jse.executeScript("document.getElementById(\"videoHelpControl\").pause()");
		 Thread.sleep(4000);
		 
		 jse.executeScript("document.getElementById(\"videoHelpControl\").play()");
		 Thread.sleep(3000);
		
		 test.log(LogStatus.PASS, "Check Video file User should able to Play/Pause video ");
	
	
		
	}
	
	public static void AuditorMaster(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MASTERS(driver).click();
		Thread.sleep(3000);
		
			if(LegalUpdatesLocators.AuditorMaster(driver).isEnabled()) {
				LegalUpdatesLocators.AuditorMaster(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS, "User should able to redirected to the Auditor Master page");
			}else {
				test.log(LogStatus.FAIL, "User should not redirected to the Auditor Master page");
				
			}
		
		Thread.sleep(3000);
	
		
	}
	
	public static void AuditorMasterPlay(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (80));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"))); 
		Thread.sleep(1000);
		
		LegalUpdatesLocators.HelpUpdates(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.HelpVideos(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.MASTERS(driver).click();
		Thread.sleep(3000);
		LegalUpdatesLocators.AuditorMaster(driver).click();
		Thread.sleep(3000);
		//play video
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById(\"videoHelpControl\").play()");
		
		Thread.sleep(3000);
		//pause playing video 
		 jse.executeScript("document.getElementById(\"videoHelpControl\").pause()");
		 Thread.sleep(4000);
		 
		 jse.executeScript("document.getElementById(\"videoHelpControl\").play()");
		 Thread.sleep(3000);
		
		 test.log(LogStatus.PASS, "Check Video file User should able to Play/Pause video ");
	
	
		
	}
	
	
}
