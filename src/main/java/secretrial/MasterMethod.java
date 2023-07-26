package secretrial;

import java.io.FileInputStream;
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

public class MasterMethod {
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	private static List<WebElement> elementsList = null;
	
	public static void PageAuthoriation(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(1000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(1000);
		Locator.PageAuthorizationTab(driver).click();
		Thread.sleep(3000);
		Locator.SelectRole(driver).click();
		Thread.sleep(1000);
		Locator.SelectDropdownOption(driver).get(0).click();
		Thread.sleep(1000);
		
		Locator.SelectUser(driver).click();
		Thread.sleep(1000);
		Locator.SelectUserDropdownOption(driver).get(0).click();
		Thread.sleep(1000);
		Locator.viewIcon(driver).click();
		Thread.sleep(1000);
		Locator.addIcon(driver).click();
		Thread.sleep(1000);
		Locator.editIcon(driver).click();
		Thread.sleep(1000);
		Locator.deleteIcon(driver).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(4000);
		Locator.SavePA(driver).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
	    String text =Locator.SavePAmsg(driver).getText();
	    Thread.sleep(2000);
	    test.log(LogStatus.PASS,  "Page Authoriation" +text);
	    Thread.sleep(1000);
		Locator.ClickDashboard(driver).click();
	}
	
	public static void PageAuthoriationCheck(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(1000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(5000);
		
		By locator = By.xpath("//*[@id='Mastermenu']/ul/li[7]/a");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.click();
		Thread.sleep(3000);
		Locator.SelectRole(driver).click();
		Thread.sleep(1000);
		Locator.SelectDropdownOption(driver).get(0).click();
		Thread.sleep(1000);
		
		Locator.SelectUser(driver).click();
		Thread.sleep(1000);
		Locator.SelectUserDropdownOption(driver).get(0).click();
		Thread.sleep(1000);
		if(Locator.viewIcon(driver).isEnabled()&&Locator.addIcon(driver).isEnabled()&&Locator.editIcon(driver).isEnabled()&&Locator.deleteIcon(driver).isEnabled()) {
			
			Locator.viewIcon(driver).click();
			Thread.sleep(1000);
			Locator.addIcon(driver).click();
			Thread.sleep(1000);
			Locator.editIcon(driver).click();
			Thread.sleep(1000);
			Locator.deleteIcon(driver).click();
			Thread.sleep(1000);
			  test.log(LogStatus.PASS,  "user able to check or uncheck  Every view,add,edit and delete option  ");
			
		}else {
			  test.log(LogStatus.FAIL,  "user not able to check or uncheck  Every view,add,edit and delete option  ");
		}
		Thread.sleep(3000);
		Locator.ClickDashboard(driver).click();
		Thread.sleep(3000);
	}
	
	
	public static void PageAuthoriationDirector(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(1000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(1000);
		Locator.PageAuthorizationTab(driver).click();
		Thread.sleep(3000);
		Locator.SelectRole(driver).click();
		Thread.sleep(1000);
		Locator.SelectDropdownOption(driver).get(1).click();
		Thread.sleep(1000);
		
		Locator.SelectUser(driver).click();
		Thread.sleep(1000);
		Locator.SelectUserDropdownOption(driver).get(0).click();
		Thread.sleep(1000);
		Locator.viewIcon(driver).click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(4000);
		Locator.SavePA(driver).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
	    String text =Locator.SavePAmsg(driver).getText();
	    Thread.sleep(2000);
	    test.log(LogStatus.PASS,   text);
	    Thread.sleep(1000);
		Locator.ClickDashboard(driver).click();
	}

	
	public static void PageAuthoriationManagement(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(1000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(1000);
		Locator.PageAuthorizationTab(driver).click();
		Thread.sleep(3000);
		Locator.SelectRole(driver).click();
		Thread.sleep(1000);
		Locator.SelectDropdownOption(driver).get(2).click();
		Thread.sleep(1000);
		
	/*	Locator.SelectUser(driver).click();
		Thread.sleep(1000);
		Locator.SelectUserDropdownOption(driver).get(0).click();
		Thread.sleep(1000);*/
		Locator.viewIcon(driver).click();
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	   	js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(4000);
		Locator.SavePA(driver).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-600)");
		Thread.sleep(2000);
	    String text =Locator.SavePAmsg(driver).getText();
	    Thread.sleep(2000);
	    test.log(LogStatus.PASS,   text);
	    Thread.sleep(1000);
		Locator.ClickDashboard(driver).click();
	}

	public static void UserEntityAssignmentMaster(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(1000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(1000);
		Locator.UserEntityAssignmenMaster(driver).click();
		Thread.sleep(3000);
		Locator.NewBtn(driver).click();
		Thread.sleep(3000);
		Locator.SelectUserUE(driver).click();
		Thread.sleep(1000);
		Locator.UserSelectDropdown(driver).click();
		Thread.sleep(1000);
		Locator.SelectEntity(driver).click();
		Thread.sleep(1000);
		Locator.EntitySelectDropdown(driver).click();
		Thread.sleep(1000);
		Locator.BtnSave(driver).click();
		Thread.sleep(2000);
		 String text =Locator.BtnSaveMsg(driver).getText();
		    Thread.sleep(2000);
		
		if (text.equalsIgnoreCase("Saved Successfully.")) {
			test.log(LogStatus.PASS, ""+ text);
		} else {
			test.log(LogStatus.FAIL, text);
		}
		Locator.closepopup(driver).click();
		Thread.sleep(2000);
		
		Locator.ClickDashboard(driver).click();
	}

	public static void UEAMUpdate(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(1000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(1000);
		Locator.UserEntityAssignmenMaster(driver).click();
		Thread.sleep(3000);
		Locator.ClickEdit(driver).click();
		Thread.sleep(3000);
		Locator.SelectUserUE(driver).click();
		Thread.sleep(1000);
		Locator.UserSelectDropdown(driver).click();
		Thread.sleep(1000);
		
		Locator.BtnSave(driver).click();
		Thread.sleep(2000);
		 String text =Locator.BtnSaveMsg(driver).getText();
		    Thread.sleep(2000);
		
		if (text.equalsIgnoreCase("Updated Successfully.")) {
			test.log(LogStatus.PASS, ""+ text);
		} else {
			test.log(LogStatus.FAIL, text);
		}
		Locator.closepopup(driver).click();
		Thread.sleep(2000);
		
		Locator.ClickDashboard(driver).click();
	}
	
	public static void UEAMassignment(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(1000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(1000);
		Locator.UserEntityAssignmenMaster(driver).click();
		Thread.sleep(3000);
		Locator.ClickAssignment(driver).click();
		Thread.sleep(1000);
		Locator.Meeting(driver).click();
		Thread.sleep(1000);
		Locator.Meeting1(driver).click();
		Thread.sleep(1000);
		Locator.BtnSave(driver).click();
		Thread.sleep(2000);
		 String text =Locator.BtnSaveMsg(driver).getText();
		    Thread.sleep(2000);
		
		if (text.equalsIgnoreCase("Record Save Successfully")) {
			test.log(LogStatus.PASS, ""+ text);
		} else {
			test.log(LogStatus.FAIL, text);
		}
		Locator.closepopup(driver).click();
		Thread.sleep(2000);
		
		Locator.ClickDashboard(driver).click();
	}

	public static void UEADelete(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(1000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(1000);
		Locator.UserEntityAssignmenMaster(driver).click();
		Thread.sleep(3000);
		Locator.ClickAssignment(driver).click();
		Thread.sleep(1000);
		Locator.delete(driver).click();
		Thread.sleep(2000);
		Locator.YesUE(driver).click();
		Thread.sleep(1000);
		String text=driver.switchTo().alert().getText();
		test.log(LogStatus.PASS, ""+ text);
		driver.switchTo().alert().accept();
Thread.sleep(2000);
		
		Locator.ClickDashboard(driver).click();
	}
	
	public static void Notes(WebDriver driver, ExtentTest test) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(1000);
		Locator.MasterMenu(driver).click();
		Thread.sleep(4000);
		Locator.Notes(driver).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		Locator.TextArea(driver).clear();
		Locator.TextArea(driver).sendKeys("Auto23");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		Locator.SaveNotes(driver).click();
		Thread.sleep(3000);
		String text=Locator.ValidationMsg(driver).getText();
		test.log(LogStatus.PASS, ""+ text);
		
       Thread.sleep(2000);
		
		Locator.ClickDashboard(driver).click();
	}

}
