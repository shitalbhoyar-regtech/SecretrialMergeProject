package secretrial;

import java.io.File;
import java.io.FileInputStream;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Methods {
	
	public static FileInputStream fis = null;	//File input stream variable
	public static XSSFWorkbook workbook = null;	//Excel sheet workbook variable
	public static XSSFSheet sheet = null;		//Sheet variable
	
	public static void BusinessActivityClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	if(Locator.BusinessActivity(driver).isEnabled()) {
		Locator.BusinessActivity(driver).click();
		test.log(LogStatus.PASS, " Business Activity  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Business Activity  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void BusinessActivity(WebDriver driver, ExtentTest test) throws InterruptedException
		 {
	
		WebDriverWait wait = new WebDriverWait(driver, (40));
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
		Thread.sleep(1000);
		Locator.Master(driver).click();
		Thread.sleep(1000);
	//	Locator.Entity(driver).click();
		Thread.sleep(4000);
		Locator.EntityEdit(driver).click();
		Thread.sleep(2000);
		Locator.BusinessActivity(driver).click();
		Thread.sleep(1000);
		Locator.AddNew(driver).click();
		Thread.sleep(1000);
		Locator.MainActivityCode(driver).click();
		Thread.sleep(1000);
		Locator.Agricultureforestryfishing(driver).click();
		Thread.sleep(1000);
		Locator.BusinessActivity1(driver).click();
		Thread.sleep(1000);
		Locator.Productionofcropsandanimals(driver).click();
		Thread.sleep(1000);
		Locator.Save(driver).click();
		Thread.sleep(1000);
		
		
		String msg = Locator.SaveMsg(driver).getText();
		if (msg.equalsIgnoreCase("Record Save Successfully")) {
			test.log(LogStatus.PASS,  "Business Activity -Add New -" +msg);
		} else {
			test.log(LogStatus.FAIL, " Business Activity -Add New -" +msg);
		}
		Locator.ClosePop(driver).click();
		Thread.sleep(1000);
		Locator.ClosePopEntity(driver).click();
		Thread.sleep(1000);
		Locator.ClickDashboard(driver).click();
		}
	
	public static void BusinessActivityValidation(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);
String Msg=	Locator.ValidationBA(driver).getText();
	Thread.sleep(1000);
	if(Msg.equalsIgnoreCase("No data found.")) {
		
		test.log(LogStatus.PASS,  "Business activity' dropdown is not Activated" );
	} else {
		test.log(LogStatus.FAIL, "Business activity' dropdown is  Activated" );
	}
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);

	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}

	public static void validationofsave(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Save Successfully")) {
		test.log(LogStatus.FAIL,  "Business Activity -Add New -" +msg);
	} else {
		test.log(LogStatus.PASS, " Business Activity -Add New -" +msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void validationofedit(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.EditBA(driver).click();
	Thread.sleep(1000);
	
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);
	Locator.ExtractionofCrudePetroleumNaturalgas(driver).click();
	Thread.sleep(1000);
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Updated Successfully")) {
		test.log(LogStatus.PASS,  "Business Activity -Edit -" +msg);
	} else {
		test.log(LogStatus.FAIL, " Business Activity -Edit -" +msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	
	 }

	
	public static void CheckInvaliddata(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.EditBA(driver).click();
	Thread.sleep(1000);
	
	
	Locator.Percentage(driver).sendKeys("e");
	Thread.sleep(1000);
	
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Updated Successfully")) {
		test.log(LogStatus.FAIL,  "Business Activity -Edit - " +msg);
	} else {
		test.log(LogStatus.PASS, " Business Activity -Edit -" +msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void DeleteBusinessActivity(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.DeleteBA(driver).click();
	Thread.sleep(2000);
	//Locator.YesBA(driver).click();
	By locator = By.xpath("//*[@id='yesBA']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	Thread.sleep(1000);
	String Msg=driver.switchTo().alert().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS,  "Delete Business Activity :- " +Msg);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void CheckFilterWork(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(3000);
	Locator.ClickArrow(driver).click();
	Thread.sleep(2000);
	By locator = By.xpath("(//*[@class='k-item k-filter-item k-state-default k-last'])[5]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
//	Locator.ClickFilter(driver).click();
	Thread.sleep(1000);
	Locator.Search(driver).sendKeys("Agriculture, forestry, fishing");
	Thread.sleep(1000);
	Locator.CheckBox(driver).click();
	Thread.sleep(1000);
	Locator.ClickFilter1(driver).click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	if(Locator.Documents(driver).isEnabled()) {
		Locator.Documents(driver).click();
		test.log(LogStatus.PASS, " Document  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Document  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void DocumentsADD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(1000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(16);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
	if(msg1.equalsIgnoreCase("Record saved successfully")) {
		test.log(LogStatus.PASS,  msg1);
	}else {
		test.log(LogStatus.FAIL,  msg1);
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDExisting(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(1000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,"To check whether user is able to add existing data or not. (For Type AOA) " + msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DocumentsADDMOA(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeMOA(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
//	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_21_45 PM.zip");
	Thread.sleep(5000);
	
	//Locator.Upload(driver).sendKeys("C:\\Users\\Mayuri Gaikwad\\Downloads\\Report  (1).xlsx");
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a MOA option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  " selecting a MOA option Type :- " +msg1);
		}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDMOAAE(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeMOA(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	//Locator.Upload(driver).sendKeys("C:\\Users\\Mayuri Gaikwad\\Downloads\\Report  (1).xlsx");
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		
		if(msg1.equalsIgnoreCase("Record already exist")) {
			test.log(LogStatus.PASS,  " To check whether user is able to add existing data or not. (For Type MOA) " +msg1);
		}
		else {
			test.log(LogStatus.FAIL,  " To check whether user is able to add existing data or not. (For Type MOA) " +msg1);
		}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void ViewMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
     if(msg1.equalsIgnoreCase("Viewer")) {
    	 test.log(LogStatus.PASS,  " document Type MOA :- View  successfully.");
     }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	
	public static void DownloadMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\trainee\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\trainee\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeleteMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void ViewAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
    if(msg1.equalsIgnoreCase("Viewer")) {
   	 test.log(LogStatus.PASS,  " document Type AOA :- View  successfully.");
    }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DownloadAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\trainee\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\trainee\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeleteAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDCOI(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		test.log(LogStatus.PASS,  " selecting a COI option Type :- " +msg1);
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a COI option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  " selecting a COI option Type :- " +msg1);
		}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDCOIExisting(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a COI option Type :- " +msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void ViewCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
   if(msg1.equalsIgnoreCase("Viewer")) {
  	 test.log(LogStatus.PASS,  " document Type AOA :- View  successfully.");
   }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DownloadCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\trainee\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\trainee\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeleteCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DocumentsADDPolicy(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(17);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
	
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  " selecting a Policy option Type :- " +msg1);
		}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDPolicyAE(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void ViewPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Locator.ViewPolicy(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
  if(msg1.equalsIgnoreCase("Viewer")) {
 	 test.log(LogStatus.PASS,  " document Type AOA :- View  successfully.");
  }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DownloadPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\trainee\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.DownloadPolicy(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\trainee\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeletePolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Locator.DocDeletePolicy(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDLicenseRegi(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(18);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\trainee\\Downloads\\4_13_2023 4_33_27 PM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a Licence/Registration option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  " selecting a Licence/Registration option Type :- " +msg1);
		}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDLicenseRegiED(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	
	Locator.LicenseNo(driver).sendKeys("13"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a  Licence/Registration option Type :- " +msg1);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void ViewLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	
	Locator.ViewLICENSE_REGISTRATION(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
 if(msg1.equalsIgnoreCase("Viewer")) {
	 test.log(LogStatus.PASS,  " document Type LICENSE_REGISTRATION :- View  successfully.");
 }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DownloadLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.DownloadLicense(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeleteLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	
	Locator.DocDeleteLICENSE(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DocumentsADDLicenseRegiInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(18);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
	if(msg1.equalsIgnoreCase("Record saved successfully")) {
		test.log(LogStatus.FAIL,  "Try to entering Last Renewal date is Greater than Next renewal Date :- " +msg1);
	}else {
		test.log(LogStatus.PASS,  "Try to entering Last Renewal date is Greater than Next renewal Date :-  " +msg1);
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDAnnualReport(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(18);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);

	
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[10]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		Thread.sleep(3000);
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a Annual Report option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  " selecting a Annual Report option Type :- " +msg1);
		}
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDAnnualReportED(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	Locator.LicenseNo(driver).sendKeys("17"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);

	
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[10]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Annual Report option Type :- " +msg1);
		Thread.sleep(3000);
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDAnnualReportWD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	Locator.LicenseNo(driver).sendKeys("17"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[10]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Annual Report option Type :- " +msg1);
		Thread.sleep(3000);
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	
	public static void ViewAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	
	Locator.ViewAnnual(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
if(msg1.equalsIgnoreCase("Viewer")) {
	 test.log(LogStatus.PASS,  " document Type Annual Report :- View  successfully.");
}
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void DownloadAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.DownloadAR(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DeleteAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	
	Locator.DocDeleteAR(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	
	public static void WithoutDocument(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	
	
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void WithoutDocumentAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void WithoutDocumentCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void WithoutDocumentPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void WithoutDocumentLicense(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void DocumentsADDClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	//Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	Locator.Documents(driver).click();
	Thread.sleep(4000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	if(Locator.Close(driver).isEnabled()) {
		Locator.Close(driver).click();
		Thread.sleep(3000);
		
		test.log(LogStatus.PASS,  " close or exit button is working Successfully");
	}else {
		test.log(LogStatus.FAIL,  "close or exit button is not working");
	}
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void BankDetailsClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	if(Locator.BankDetails(driver).isEnabled()) {
		Locator.BankDetails(driver).click();
		test.log(LogStatus.PASS, " Bank Details  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, "Bank Details  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void BankDetailAddnew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(4);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.SaveBDMsg(driver).getText();
	test.log(LogStatus.PASS,  "Bank Details -Add New - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void BankDetailInvalidBName(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(4);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	row0 = sheet.getRow(8);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }

	public static void BankDetailInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(6);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	Locator.AccountNo(driver).sendKeys(c1.getStringCellValue());
//	int No = (int) c1.getNumericCellValue();
//	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(2000);
	
	String	msg=Locator.InvalidMsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "Bank Details -Add New - " +msg);
	Thread.sleep(2000);
Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void BankDetailInvalidIFC(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(4);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(10);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.IFSC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	
	
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	

	public static void BankDetailInvalidSC(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(7);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	Locator.AccountNo(driver).sendKeys(c1.getStringCellValue());

	Thread.sleep(1000);
	
	row0 = sheet.getRow(8);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(2000);
	
	String	msg=Locator.InvalidMsg(driver).getText();
	Thread.sleep(3000);
	String	msg1=Locator.InvalidMsg1(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "Bank Details -Add New - " +msg +","+msg1);
	Thread.sleep(2000);
Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }

	public static void WithOutBankDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);

	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	
	Locator.SaveBD(driver).click();
	Thread.sleep(2000);
	
	String	msg=Locator.InvalidMsg(driver).getText();
	Thread.sleep(3000);
	String	msg1=Locator.InvalidMsg1(driver).getText();
	Thread.sleep(3000);
	String	msg2=Locator.InvalidMsg2(driver).getText();
	Thread.sleep(3000);
	String	msg3=Locator.InvalidMsg3(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "message Display " +msg +", "+msg1+", "+ msg2 +", "+msg3);
	Thread.sleep(2000);
Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }

	public static void BankDetailEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
//	Thread.sleep(5000);
//	Locator.EditBD(driver).click();
	Thread.sleep(3000);
	By locator = By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[19]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	Thread.sleep(4000);
	Locator.NameofBank(driver).clear();
	Thread.sleep(2000);
	row0 = sheet.getRow(9);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.SaveBDMsg(driver).getText();
	test.log(LogStatus.PASS,  "Edit - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void BankDetailEditInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
//	Locator.EditBD(driver).click();
	Thread.sleep(3000);
	By locator = By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[18]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.IFSC(driver).clear();
	Thread.sleep(1000);
	row0 = sheet.getRow(10);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.IFSC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  "Edit - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	
	public static void BankDetailDelete(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);

	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.DeleteBD(driver).click();
	Thread.sleep(3000);
	Locator.Yes(driver).click();
	Thread.sleep(2000);
	
	
	
	String	msg1=driver.switchTo().alert().getText();
	
	test.log(LogStatus.PASS, msg1);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
  Locator.ClosePopEntity(driver).click();
  Thread.sleep(1000);
  Locator.ClickDashboard(driver).click();
  Thread.sleep(1000);
	 }
	
	public static void BankDetailDeleteCan(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);

	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.DeleteBD(driver).click();
	Thread.sleep(3000);
	if(Locator.No(driver).isEnabled()) {
	Locator.No(driver).click();
	Thread.sleep(2000);
	test.log(LogStatus.PASS,  "user deletes an item and cancels deletion Successfully");
	}
	
 Locator.ClosePopEntity(driver).click();
 Thread.sleep(1000);
 Locator.ClickDashboard(driver).click();
 Thread.sleep(1000);
	 }
	
	
	public static void EntityView(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.EntityView(driver).click();
	Thread.sleep(3000);
/*	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='windowReportViewer']/div/div[2]/div[2]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[6]/div"))); 
	Thread.sleep(3000);
	if(Locator.CompanyMasterDetails(driver).isDisplayed()) {
		
		test.log(LogStatus.PASS,  "view Entity details Successfully");
		}*/
	//Thread.sleep(3000);
	By locator = By.cssSelector("a[class='k-button k-bare k-button-icon k-window-action']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	//Locator.CloseView(driver).click();
	Thread.sleep(3000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void PublicLimitedSelect(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(3000);
	
	Locator.EntityType(driver).click();
	Thread.sleep(3000);
	if(Locator.PublicLimitedSelect(driver).isEnabled()) {
		Thread.sleep(3000);
		Locator.PublicLimitedSelect(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  "The 'Public Limited Company' entity  selected from dropdown");
	}else {
		test.log(LogStatus.FAIL,  "The 'Public Limited Company' entity Not selected from dropdown");
	}
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	Locator.CloseEntity(driver).click();
	
	Thread.sleep(3000);

	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
public static void selectOptionFromDropDown_bs(List<WebElement> options, String value) {
		
		for(WebElement option:options) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}
	
	public static void PublicLimitedAdd(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(3000);
	
	Locator.EntityType(driver).click();
	Thread.sleep(3000);
	
	Locator.PublicLimitedSelect(driver).click();
		
	Thread.sleep(3000);
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(27);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.EntityName(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	row0 = sheet.getRow(28);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.CINEntity(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.CalendorIcon(driver).click();
	Thread.sleep(2000);
	Locator.Date(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(29);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.PAN(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.Roc(driver).click();
	Thread.sleep(4000);
	
	List<WebElement>roc = driver.findElements(By.xpath("//ul[@id='ddlRocJuris_listbox']//li"));
	selectOptionFromDropDown_bs(roc, "Mumbai");
	
	
	
	Locator.CompanyCategory(driver).click();
	Thread.sleep(2000);
	List<WebElement>comCat = driver.findElements(By.xpath("//ul[@id='ddlComCategary_listbox']//li"));
	selectOptionFromDropDown_bs(comCat, "Company limited by shares");
	
	row0 = sheet.getRow(30);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.EmailE(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.FinancialYear(driver).click();
	Thread.sleep(2000);
	List<WebElement>finYr = driver.findElements(By.xpath("//ul[@id='FY_listbox']//li"));
	selectOptionFromDropDown_bs(finYr, "1 Apr - 31 Mar");
	
	row0 = sheet.getRow(31);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.AddressE(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	row0 = sheet.getRow(31);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.Address2(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.StateE(driver).click();
	Thread.sleep(2000);
	List<WebElement>state = driver.findElements(By.xpath("(//ul[@id='stateId_listbox'])[2]//li"));
	selectOptionFromDropDown_bs(state, "Maharashtra");
	
	Locator.CityE(driver).click();
	Thread.sleep(2000);
	List<WebElement>city = driver.findElements(By.xpath("//ul[@id='ddlreg_cityId_listbox']//li"));
	selectOptionFromDropDown_bs(city, "Mumbai");
	Locator.SaveE(driver).click();
	Thread.sleep(3000);
	try {
	
String msg=	Locator.SaveEMsg(driver).getText();
if(msg.equalsIgnoreCase("Entity Saved Successfully")) {
	test.log(LogStatus.PASS, msg );
}else {
	test.log(LogStatus.FAIL, msg );
}
	}catch(Exception  e) {
		String msg=	Locator.SaveEMsg1(driver).getText();
		test.log(LogStatus.PASS, msg );
		
	}
Thread.sleep(4000);
Locator.CloseEntity(driver).click();
	Thread.sleep(3000);

	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void PublicLimitedAddWith2man(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(3000);
	
	Locator.EntityType(driver).click();
	Thread.sleep(3000);
	
	Locator.PublicLimitedSelect(driver).click();
		
	Thread.sleep(3000);
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(27);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.EntityName(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	row0 = sheet.getRow(28);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.CINEntity(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.SaveE(driver).click();
	Thread.sleep(3000);
	
	
	String msg=	Locator.InvalidMsgeDate(driver).getText();
	String msg1=	Locator.InvalidMsgePan(driver).getText();
      Thread.sleep(1000);
	String msg2=	Locator.InvalidMsgeEmail(driver).getText();
	Thread.sleep(1000);
	String msg3=	Locator.InvalidMsgeRoc(driver).getText();
	Thread.sleep(1000);
	String msg4=	Locator.InvalidMsgeFY(driver).getText();
	Thread.sleep(1000);
	String msg5=	Locator.InvalidMsgeAddress(driver).getText();
	Thread.sleep(1000);
	String msg6=	Locator.InvalidMsgeState(driver).getText();
	Thread.sleep(1000);
	String msg7=	Locator.InvalidMsgecity(driver).getText();
	Thread.sleep(1000);
	Thread.sleep(4000);
	
//	Locator.SaveE(driver).click();
	Thread.sleep(3000);
	

	test.log(LogStatus.PASS,"Message Display ; -"+ msg+ ", "+ msg1+", "+msg2+", "+msg3+", "+msg4+", "+msg5+", "+msg6+", "+msg7);
	
Thread.sleep(4000);
Locator.CloseEntity(driver).click();
	Thread.sleep(3000);

	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void PublicLimitedAddWithoutdata(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(3000);
	
	Locator.EntityType(driver).click();
	Thread.sleep(3000);
	
	Locator.PublicLimitedSelect(driver).click();
		
	Thread.sleep(3000);
	Locator.SaveE(driver).click();
	Thread.sleep(3000);
	
	String msg8=	Locator.InvalidMsgName(driver).getText();
	Thread.sleep(1000);
	String msg9=	Locator.InvalidMsgeCIN(driver).getText();
	Thread.sleep(1000);
	Thread.sleep(4000);
	String msg=	Locator.InvalidMsgeDate(driver).getText();
	Thread.sleep(1000);
	String msg1=	Locator.InvalidMsgePan(driver).getText();
     Thread.sleep(1000);
	String msg2=	Locator.InvalidMsgeEmail(driver).getText();
	Thread.sleep(1000);
	String msg3=	Locator.InvalidMsgeRoc(driver).getText();
	Thread.sleep(1000);
	String msg4=	Locator.InvalidMsgeFY(driver).getText();
	Thread.sleep(1000);
	String msg5=	Locator.InvalidMsgeAddress(driver).getText();
	Thread.sleep(1000);
	String msg6=	Locator.InvalidMsgeState(driver).getText();
	Thread.sleep(1000);
	String msg7=	Locator.InvalidMsgecity(driver).getText();
	Thread.sleep(1000);
	Thread.sleep(4000);
	
//	Locator.SaveE(driver).click();
	Thread.sleep(3000);
	

	test.log(LogStatus.PASS,"Message Display ; -"+ msg+ ", "+ msg1+", "+msg2+", "+msg3+", "+msg4+", "+msg5+", "+msg6+", "+msg7+", "+msg8+", "+msg9);
	
Thread.sleep(4000);
Locator.CloseEntity(driver).click();
	Thread.sleep(3000);

	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void PublicLimitedAddClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(4000);

if(Locator.CloseEntity(driver).isEnabled())	{
Thread.sleep(4000);
Locator.CloseEntity(driver).click();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "Close Button Working Successfully");
	
}
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void PublicLimitedEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	
	
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	
	Thread.sleep(5000);
	Locator.CalendorIcon(driver).click();
	Thread.sleep(2000);
	Locator.Date(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveE(driver).click();
	Thread.sleep(4000);
	String msg=	Locator.UpdateMsg(driver).getText();
	if(msg.equalsIgnoreCase("Entity updated successfully")) {
		test.log(LogStatus.PASS, msg );
	}else {
		test.log(LogStatus.FAIL, msg );
	}
	Locator.CloseEntity(driver).click();
	Thread.sleep(3000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void PublicLimitedEditInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	
	
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	
	Thread.sleep(3000);
	Locator.PAN(driver).clear();
	Thread.sleep(3000);
	
	Locator.PAN(driver).sendKeys("ASS122");
	Thread.sleep(4000);
	
	Locator.SaveE(driver).click();
	Thread.sleep(4000);
	String msg=	Locator.InvalidMsgePan(driver).getText();
	Thread.sleep(1000);
		test.log(LogStatus.PASS, msg );

	Locator.CloseEntity(driver).click();
	Thread.sleep(3000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void PublicLimitedEditClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	
	
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	
	
	
	if(Locator.CloseEntity(driver).isEnabled())	{
		Thread.sleep(4000);
		Locator.CloseEntity(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS,  " Edit - Close Button Working Successfully");
			
		}
	
	Thread.sleep(3000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	
	public static void PublicLimitedAddInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(3000);
	
	Locator.EntityType(driver).click();
	Thread.sleep(3000);
	
	Locator.PublicLimitedSelect(driver).click();
		
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.Roc(driver).click();
	Thread.sleep(4000);
	
	List<WebElement>roc = driver.findElements(By.xpath("//ul[@id='ddlRocJuris_listbox']//li"));
	selectOptionFromDropDown_bs(roc, "Mumbai");
	
	Locator.EntityName(driver).sendKeys("$NAME");
	Thread.sleep(4000);
	
	
	Locator.CINEntity(driver).sendKeys("2");
	Thread.sleep(4000);
	
	Locator.DateBox(driver).sendKeys("12/04");
	Thread.sleep(2000);
	
	Locator.PAN(driver).sendKeys("234");
	Thread.sleep(4000);
	
	
	
	
	Locator.CompanyCategory(driver).click();
	Thread.sleep(2000);
	List<WebElement>comCat = driver.findElements(By.xpath("//ul[@id='ddlComCategary_listbox']//li"));
	selectOptionFromDropDown_bs(comCat, "Company limited by shares");
	
	
	Locator.EmailE(driver).sendKeys("ABC@");
	Thread.sleep(4000);
	
	Locator.FinancialYear(driver).click();
	Thread.sleep(2000);
	List<WebElement>finYr = driver.findElements(By.xpath("//ul[@id='FY_listbox']//li"));
	selectOptionFromDropDown_bs(finYr, "1 Apr - 31 Mar");
	Thread.sleep(4000);
	String msg=	Locator.InvalidMsgName(driver).getText();
	String msg1=	Locator.InvalidMsgeCIN(driver).getText();
	Thread.sleep(1000);
	String msg2=	Locator.InvalidMsgeDate(driver).getText();
	Thread.sleep(1000);
	String msg3=	Locator.InvalidMsgePan(driver).getText();
	Thread.sleep(1000);
	String msg4=	Locator.InvalidMsgeEmail(driver).getText();
	Thread.sleep(1000);
	Thread.sleep(4000);
	row0 = sheet.getRow(31);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.AddressE(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.StateE(driver).click();
	Thread.sleep(2000);
	List<WebElement>state = driver.findElements(By.xpath("(//ul[@id='stateId_listbox'])[2]//li"));
	selectOptionFromDropDown_bs(state, "Maharashtra");
	
	Locator.CityE(driver).click();
	Thread.sleep(2000);
	List<WebElement>city = driver.findElements(By.xpath("//ul[@id='ddlreg_cityId_listbox']//li"));
	selectOptionFromDropDown_bs(city, "Mumbai");


	test.log(LogStatus.PASS,"Message Display ; -"+ msg+ ", "+ msg1+", "+msg2+", "+msg3+", "+msg4);
	Locator.SaveE(driver).click();
	Thread.sleep(3000);
Thread.sleep(4000);
Locator.CloseEntity(driver).click();
	Thread.sleep(3000);

	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void PLBusinessActivityClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	
	
	Locator.EntityEdit(driver).click();
	
	Thread.sleep(2000);
	if(Locator.BusinessActivity(driver).isEnabled()) {
		Locator.BusinessActivity(driver).click();
		test.log(LogStatus.PASS, " Business Activity  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Business Activity  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLBusinessActivity(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);

	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	Locator.MainActivityCode(driver).click();
	Thread.sleep(1000);
	Locator.Agricultureforestryfishing(driver).click();
	Thread.sleep(1000);
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);
	Locator.Productionofcropsandanimals(driver).click();
	Thread.sleep(1000);
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Save Successfully")) {
		test.log(LogStatus.PASS,  msg);
	} else {
		test.log(LogStatus.FAIL, msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}

	public static void  PLBusinessActivityValidation(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);
String Msg=	Locator.ValidationBA(driver).getText();
	Thread.sleep(1000);
	if(Msg.equalsIgnoreCase("No data found.")) {
		
		test.log(LogStatus.PASS,  "Business activity' dropdown is not Activated" );
	} else {
		test.log(LogStatus.FAIL, "Business activity' dropdown is  Activated" );
	}
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);

	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	
	public static void PLvalidationofsave(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	
	
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Save Successfully")) {
		test.log(LogStatus.FAIL,  "Business Activity -Add New -" +msg);
	} else {
		test.log(LogStatus.PASS, " Business Activity -Add New -" +msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLvalidationofedit(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(4000);
	Locator.EditPL(driver).get(1).click();

     Thread.sleep(4000);
	
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);
	Locator.ExtractionofCrudePetroleumNaturalgas(driver).click();
	Thread.sleep(1000);
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Updated Successfully")) {
		test.log(LogStatus.PASS,  msg);
	} else {
		test.log(LogStatus.FAIL, msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void PLCheckInvaliddata(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	
	Thread.sleep(4000);
	Locator.EditPL(driver).get(1).click();
Thread.sleep(4000);
	
	Locator.Percentage(driver).sendKeys("e");
	Thread.sleep(1000);
	
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Updated Successfully")) {
		test.log(LogStatus.FAIL,  "Business Activity -Edit - " +msg);
	} else {
		test.log(LogStatus.PASS, " Business Activity -Edit -" +msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void PLDeleteBusinessActivity(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.DeleteBA(driver).click();
	Thread.sleep(2000);
	//Locator.YesBA(driver).click();
	By locator = By.xpath("//*[@id='yesBA']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	Thread.sleep(1000);
	String Msg=driver.switchTo().alert().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS,  "Delete Business Activity :- " +Msg);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLBusinessActivityADDNewClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(3000);
	
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	if(Locator.ClosePop(driver).isEnabled()) {
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	test.log(LogStatus.PASS,  "close or exit button is working ");
	}
	
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	
	public static void EntityMoreOption(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(4000);
	if(Locator.RelatedCompaniesVali(driver).isDisplayed()) {
		test.log(LogStatus.PASS,  "user is able to clicks on the More action dropdown and selects a valid option Successfully");
	}
	Locator.RelatedCompaniesClose(driver).click();
	Thread.sleep(3000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void EntityMoreOptionRC(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	
	if(Locator.RelatedCompanies(driver).isEnabled()) {
		Locator.RelatedCompanies(driver).click();
		test.log(LogStatus.PASS,  " 'More Actions > Related Companies' option is working  Successfully");
	}
	Locator.RelatedCompaniesClose(driver).click();
	Thread.sleep(2000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void EntityMoreOption1(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	
	if(Locator.Capital(driver).isEnabled()) {
		Locator.Capital(driver).click();
		test.log(LogStatus.PASS,  "More Actions > Capital' option is working Successfully");
	}
	
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void RCAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(2000);
	
	Locator.AddNewRC(driver).click();
	Thread.sleep(2000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(12);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.CIN(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.NameOfCompany(driver).click();
	Thread.sleep(2000);
	Locator.NameOfCompany(driver).click();
	Thread.sleep(2000);
	row0 = sheet.getRow(13);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOfCompanyText(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);

	
	Locator.SaveRC(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.SaveRCMsg(driver).getText();
	test.log(LogStatus.PASS, msg1);

	Locator.RelatedCompaniesClose(driver).click();
	Thread.sleep(2000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	
	public static void RCSharesHeld(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(2000);
	Locator.SharesHeld(driver).click();
	Thread.sleep(2000);
	Locator.SharesHeldText(driver).clear();
	Thread.sleep(2000);
	Locator.SharesHeld(driver).click();
	Thread.sleep(2000);
	Locator.SharesHeldText(driver).sendKeys("ad");
	Thread.sleep(2000);
	Locator.SaveRC(driver).click();
	Thread.sleep(3000);
	String	msg1=Locator.validationRC(driver).getText();
	test.log(LogStatus.PASS, msg1);
	Thread.sleep(2000);
	Locator.RelatedCompaniesClose(driver).click();
	Thread.sleep(2000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void RCClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(2000);
	
	if(Locator.RelatedCompaniesClose(driver).isEnabled()) {
		Locator.RelatedCompaniesClose(driver).click();
		Thread.sleep(2000);
		test.log(LogStatus.PASS, "Related Companies window -  close button working Successfully.");
	}
	
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void RCSearchField(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(4000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(4000);
	Locator.search(driver).sendKeys("U45200MH1981PTC025832",Keys.ENTER);
	Thread.sleep(2000);
String text=Locator.searchText(driver).getText();
	Thread.sleep(2000);
	if(text.equalsIgnoreCase("U45200MH1981PTC025832")) {
		test.log(LogStatus.PASS, "Related Companies- search Field  working Successfully.");
	}else {
		test.log(LogStatus.FAIL, "Related Companies- search Field not working");
	}
		Locator.RelatedCompaniesClose(driver).click();
		Thread.sleep(2000);
	
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void RCSearchFieldINvalidData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(2000);
	Locator.search(driver).sendKeys("U45200MH1981PTC02583",Keys.ENTER);
	Thread.sleep(2000);
String text=Locator.searchText(driver).getText();
	Thread.sleep(2000);
	if(!text.equalsIgnoreCase("U45200MH1981PTC02583")) {
		test.log(LogStatus.PASS, " No search results  displayed on the page");
	}else {
		test.log(LogStatus.FAIL, "search results  displayed on the page");
	}
		Locator.RelatedCompaniesClose(driver).click();
		Thread.sleep(2000);
	
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	
	public static void RCDelete(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
	Locator.RelatedCompanies(driver).click();
	Thread.sleep(2000);
	Locator.DeleteRc(driver).click();
	Thread.sleep(2000);
	String Msg=driver.switchTo().alert().getText();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	test.log(LogStatus.PASS,Msg );
		Locator.RelatedCompaniesClose(driver).click();
		Thread.sleep(2000);
	
	
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void Capital(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
		Locator.Capital(driver).click();
		Thread.sleep(4000);
		Locator.AuthorizedCapital(driver).click();
		Thread.sleep(2000);
	
		
		Locator.SaveC(driver).click();
		Thread.sleep(2000);
		String text=Locator.SaveCMsg(driver).getText();
		Thread.sleep(2000);
		test.log(LogStatus.PASS,"Adding 'Authorized Capital in INR' with the help of 'increase value' value' button :- "+text );
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void CapitalA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
		Locator.Capital(driver).click();
		Thread.sleep(4000);
	//	Locator.AuthorizedCapital(driver).sendKeys("300000002");
		Thread.sleep(2000);
		By locator = By.xpath("//*[@id='frmAuthorizedCapital']/div/div/div/div[2]/span[1]/span/input[1]");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(3000);
	ViewButton.click();
	Thread.sleep(3000);
		ViewButton.sendKeys("300000011");
		
		Thread.sleep(2000);
		Locator.SaveC(driver).click();
		Thread.sleep(2000);
		String text=Locator.SaveCMsg(driver).getText();
		Thread.sleep(2000);
		test.log(LogStatus.PASS,"Adding 'Authorized Capital in INR' with the help of 'increase value' value' button :- "+text );
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	
	
	public static void  PreferenceShareCapital(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(2000);
		Locator.Capital(driver).click();
		Thread.sleep(4000);
		Locator.PreferenceShareCapital(driver).click();
		Thread.sleep(4000);
		Locator.PreferenceShareCapitalYes(driver).click();
		Thread.sleep(4000);
		Locator.ClassofSecurities(driver).clear();
		Thread.sleep(1000);
		Locator.ClassofSecurities(driver).sendKeys("1",Keys.ENTER);
		Thread.sleep(4000);
	/*	Locator.PreferancecapitalType(driver).click();
		Thread.sleep(1000);
	//	Locator.OptionallyConvertible(driver).click();
		Thread.sleep(1000);
		By locator = By.xpath("(//*[@class='k-item'])[3]");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", ViewButton);*/
		Locator.AuthorisedCapital(driver).clear();
		Thread.sleep(1000);
		Locator.AuthorisedCapital(driver).sendKeys("2");
		Thread.sleep(1000);
	 }
	
	
	public static void  ApplicabilityClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
		if(Locator.ApplicabilityClick(driver).isEnabled()) {
			Locator.ApplicabilityClick(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS,  " 'More Actions > Applicability' option is Clickable  Successfully");
		}
		Locator.ApplicabilityClose(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ApplicabilityClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.ApplicabilityClick(driver).click();
	Thread.sleep(3000);
		if(Locator.ApplicabilityClose(driver).isEnabled()) {
			Locator.ApplicabilityClose(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS,  " The window should close when the close button is clicked.");
		}
		
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  Applicability(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
			Locator.ApplicabilityClick(driver).click();
			Thread.sleep(3000);
		/*	Locator.AmountinINR(driver).click();
		//	Thread.sleep(3000);
			//Locator.Lakh(driver).click();
			Thread.sleep(2000);
			By locator = By.xpath("(//*[@data-offset-index='1'])[63]");

			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		//	Thread.sleep(4000);
			
			WebElement ViewButton = driver.findElement(locator);	
		//	Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ViewButton);
			*/
			 Select select = new Select(Locator.AmountinINR1(driver));
		      // select an item with text visible
			 Thread.sleep(4000);
		      select.selectByIndex(1);
		      Thread.sleep(4000);
		Locator.ApplicabilityClose(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  Shareholding(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
		if(Locator.Shareholding(driver).isEnabled()) {
			Locator.Shareholding(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS,  " 'More Actions > Shareholding' option is Clickable  Successfully");
		}
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  Shareholdingnew(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.Shareholding(driver).click();
	Thread.sleep(3000);
			Locator.ShareholdingNew(driver).click();
			Thread.sleep(5000);
			Locator.FOLIONO(driver).sendKeys("10");
			Thread.sleep(3000);
			Locator.Classofshares(driver).click();
			Thread.sleep(1000);
			Locator.EquityShares(driver).click();
			Thread.sleep(3000);
			
			Locator.TypeS(driver).click();
			Thread.sleep(1000);
			Locator.Individual(driver).click();
			Thread.sleep(3000);
			Locator.Nameofthemember(driver).sendKeys("Mayuri");
			Thread.sleep(3000);
			Locator.Address(driver).sendKeys("Abcd");
			Thread.sleep(3000);
			Locator.Nationality(driver).click();
			Thread.sleep(1000);
			Locator.Indian(driver).click();
			Thread.sleep(3000);
			Locator.Email(driver).sendKeys("Abcd@gmail.com");
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
		   	js.executeScript("window.scrollBy(0,600)");
			Locator.SaveS(driver).click();
			Thread.sleep(3000);
		 	js.executeScript("window.scrollBy(0,-600)");
		 	  String text =Locator.SaveMsgS(driver).getText();
			    Thread.sleep(2000);
			    test.log(LogStatus.PASS,  text);
			    Thread.sleep(3000);
			 //	js.executeScript("window.scrollBy(0,600)");
				Locator.CloseS(driver).click();
				Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ShareholdingValidation(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.Shareholding(driver).click();
	Thread.sleep(3000);
			Locator.ShareholdingNew(driver).click();
			Thread.sleep(5000);
			Locator.FOLIONO(driver).sendKeys("10");
			Thread.sleep(3000);
			Locator.Classofshares(driver).click();
			Thread.sleep(1000);
			Locator.EquityShares(driver).click();
			Thread.sleep(3000);
			
			
			Locator.SaveS(driver).click();
			Thread.sleep(3000);
		 	
		 	  String text =Locator.ErrorMsg1(driver).getText();
			    Thread.sleep(2000);
			    String text1 =Locator.ErrorMsg2(driver).getText();
			    Thread.sleep(2000);
			    String text2 =Locator.ErrorMsg3(driver).getText();
			    Thread.sleep(2000);
			    test.log(LogStatus.PASS, "Error messages reflected in Other mandatory field :-"+ text+", "+text1 +", "+text2);
			    Thread.sleep(1000);
				Locator.CloseS(driver).click();
				Thread.sleep(4000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ShareholdingValidationEmpty(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.Shareholding(driver).click();
	Thread.sleep(3000);
	Locator.ShareholdingNew(driver).click();
	Thread.sleep(5000);
			
			Locator.SaveS(driver).click();
			Thread.sleep(3000);
		 	
		 	  String text =Locator.Validation(driver).getText();
			    Thread.sleep(2000);
			    String text1 =Locator.Validation1(driver).getText();
			    Thread.sleep(2000);
			    String text2 =Locator.Validation2(driver).getText();
			    Thread.sleep(2000);
			    String text3 =Locator.Validation3(driver).getText();
			    Thread.sleep(2000);
			    String text4 =Locator.Validation4(driver).getText();
			    Thread.sleep(2000);
			    test.log(LogStatus.PASS, "Error messages reflected mandatory field :-"+ text+", "+text1 +", "+text2+", "+text3 +", "+text4);
			    Thread.sleep(1000);
				Locator.CloseS(driver).click();
				Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void BranchDetailsClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	if(Locator.BranchDetails(driver).isEnabled()) {
		Locator.BranchDetails(driver).click();
		test.log(LogStatus.PASS, " Branch Details  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Branch Details  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void AddNewBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(20);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(21);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(22);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.ContactNumber(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(23);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.EmailBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	row0 = sheet.getRow(24);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.State(driver).click();
	Thread.sleep(1000);
	Locator.Maharashtra(driver).click();
	Thread.sleep(3000);
	
	Locator.City(driver).click();
	Thread.sleep(1000);
	Locator.Ahmadnagar(driver).click();
	Thread.sleep(3000);
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("Details Save Successfully")) {
		test.log(LogStatus.PASS, Msg);
	}else {
		test.log(LogStatus.FAIL, Msg);
	}
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void AddNewBranchDetailsinvalidData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(20);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ContactPerson(driver).sendKeys("123$"); // Writing Task title
	Thread.sleep(2000);
	
	
	Locator.ContactNumber(driver).sendKeys("11111111"); // Writing Task title
	Thread.sleep(4000);
	
	
	Locator.EmailBD(driver).sendKeys("123@"); // Writing Task title
	Thread.sleep(2000);
	row0 = sheet.getRow(24);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.State(driver).click();
	Thread.sleep(1000);
	Locator.Maharashtra(driver).click();
	Thread.sleep(3000);
	
	Locator.City(driver).click();
	Thread.sleep(1000);
	Locator.Ahmadnagar(driver).click();
	Thread.sleep(3000);
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS, Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void AddNewBranchDetailsMandatoryfield(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(20);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void AddNewBranchDetailsWithOutData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(4000);
	
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void AddNewBranchDetailsClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		if(Locator.CloseBranchD(driver).isEnabled()) {
			Locator.CloseBranchD(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS," close or exit button is working");
			
		}else {
			test.log(LogStatus.PASS," close or exit button is not working");
		}

		Thread.sleep(3000);
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	
	public static void EditBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.EditBranchD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.Name(driver).clear();
	Thread.sleep(2000);
	row0 = sheet.getRow(25);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsg(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void UploadBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
	//	Locator.SelectFile(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		Locator.UploadBD(driver).click();
		Thread.sleep(3000);
String Msg=	Locator.UploadMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File Upload successfully")) {
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	
	public static void UploadBranchDetailsInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_09_07 PM.zip");
	
		
		Thread.sleep(3000);
String Msg=	Locator.InvalidUploadMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File type not allowed.")) {
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void UploadBranchDetailsMulInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_09_07 PM.zip");
		Thread.sleep(3000);
		By locator1 = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
		Thread.sleep(4000);
		
		WebElement ViewButton1 = driver.findElement(locator1);	
		Thread.sleep(3000);
		ViewButton1.sendKeys("C:\\Users\\Mayuri\\Downloads\\Secretrial.html");
		Thread.sleep(3000);
String Msg=	Locator.InvalidUploadMsg(driver).getText();
	Thread.sleep(3000);
	
	String Msg1=Locator.InvalidUploadMsg1(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File type not allowed.") && Msg1.equalsIgnoreCase("File type not allowed.")) {
		test.log(LogStatus.PASS,"multiple invalid file extensions upload Same  Message Displayed :-  1)"+ Msg+", 2)"+Msg1);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void UploadBranchDetailsMulvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		By locator1 = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
		Thread.sleep(4000);
		
		WebElement ViewButton1 = driver.findElement(locator1);	
		Thread.sleep(3000);
		ViewButton1.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		
		Locator.UploadBD(driver).click();
		Thread.sleep(3000);
		String Msg=	Locator.UploadMsg(driver).getText();
		Thread.sleep(3000);
		if(Msg.equalsIgnoreCase("File Upload successfully")) {
			test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
		}else {
			test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
		}
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	
	public static void UploadBranchDetailsWF(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
//	Locator.Entity(driver).click();
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		
		Locator.UploadBD(driver).click();
		Thread.sleep(4000);
		String Msg=	Locator.UploadMsg1(driver).getText();
		Thread.sleep(3000);
		if(Msg.equalsIgnoreCase("Please select file to upload")) {
			test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
		}else {
			test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
		}
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLDocumentClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);

	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	if(Locator.Documents(driver).isEnabled()) {
		Locator.Documents(driver).click();
		test.log(LogStatus.PASS, " Document  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Document  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLDocumentsADDMOA(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);

	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeMOA(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
//	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_21_45 PM.zip");
	Thread.sleep(4000);
	
	//Locator.Upload(driver).sendKeys("C:\\Users\\Mayuri Gaikwad\\Downloads\\Report  (1).xlsx");
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		
	if(msg1.equalsIgnoreCase("Record saved successfully")) {
		test.log(LogStatus.PASS,  " selecting a MOA option Type :- " +msg1);
	}else {
		test.log(LogStatus.FAIL,  " selecting a MOA option Type :- " +msg1);
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLWithoutDocument(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	
	
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		
		if(msg1.equalsIgnoreCase("Please select File")) {
			test.log(LogStatus.PASS, msg1);
		}
		else {
			test.log(LogStatus.FAIL,  msg1);
		}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADDMOAAE(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeMOA(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_21_45 PM.zip");
	Thread.sleep(4000);
	
	//Locator.Upload(driver).sendKeys("C:\\Users\\Mayuri Gaikwad\\Downloads\\Report  (1).xlsx");
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		
		if(msg1.equalsIgnoreCase("Record already exist")) {
			test.log(LogStatus.PASS,  " To check whether user is able to add existing data or not. (For Type MOA) " +msg1);
		}
		else {
			test.log(LogStatus.FAIL,  " To check whether user is able to add existing data or not. (For Type MOA) " +msg1);
		}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLViewMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
    if(msg1.equalsIgnoreCase("Viewer")) {
   	 test.log(LogStatus.PASS,  " document Type MOA :- View  successfully.");
    }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDownloadMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDeleteMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(1000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(16);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
	Thread.sleep(3000);
	if(msg1.equalsIgnoreCase("Record saved successfully")) {
		test.log(LogStatus.PASS,  " selecting a AOA option Type :- " +msg1);
	}else {
		test.log(LogStatus.FAIL,  " selecting a AOA option Type :- " +msg1);
	}
	}catch(Exception e) {
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,"selecting a AOA option Type " + msg1);
	
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLWithoutDocumentAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
		
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADDExisting(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(1000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		Thread.sleep(4000);
		test.log(LogStatus.PASS,"To check whether user is able to add existing data or not. (For Type AOA) " + msg1);
		}catch(Exception e) {
			String	msg1=Locator.SaveDocMsg(driver).getText();
			Thread.sleep(3000);
			if(msg1.equalsIgnoreCase("Record saved successfully")) {
				test.log(LogStatus.PASS,  " selecting a AOA option Type :- " +msg1);
			}else {
				test.log(LogStatus.FAIL,  " selecting a AOA option Type :- " +msg1);
		
		}
		}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	Thread.sleep(1000);
	 }
	
	public static void PLViewAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
   if(msg1.equalsIgnoreCase("Viewer")) {
  	 test.log(LogStatus.PASS,  " document Type AOA :- View  successfully.");
   }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void PLDownloadAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDeleteAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADDCOI(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
		
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  "selecting a COI option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  " selecting a COI option Type :- " +msg1);
		}
	}catch(Exception e) {
		Thread.sleep(3000);
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a COI option Type :- " +msg1);
	
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLWithoutDocumentCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADDCOIExisting(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	try {
		String	msg1=Locator.SaveDocMsg(driver).getText();
			
			if(msg1.equalsIgnoreCase("Record saved successfully")) {
				test.log(LogStatus.PASS,  "selecting a COI option Type :- " +msg1);
			}else {
				test.log(LogStatus.FAIL,  " selecting a COI option Type :- " +msg1);
			}
		}catch(Exception e) {
			Thread.sleep(3000);
			String	msg1=Locator.SaveDocMsg1(driver).getText();
			test.log(LogStatus.PASS,  " selecting a COI option Type :- " +msg1);
		
		}
	
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLViewCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
  if(msg1.equalsIgnoreCase("Viewer")) {
 	 test.log(LogStatus.PASS,  " document Type AOA :- View  successfully.");
  }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void PLDownloadCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDeleteCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADDPolicy(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(17);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
	Thread.sleep(3000);
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  "selecting a Policy option Type :- " +msg1);
		}
	}catch(Exception e) {
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
	
	}
	Locator.Close(driver).click();
	Thread.sleep(3000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLWithoutDocumentPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADDPolicyAE(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	try {
		String	msg1=Locator.SaveDocMsg(driver).getText();
		Thread.sleep(3000);
			if(msg1.equalsIgnoreCase("Record saved successfully")) {
				test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
			}else {
				test.log(LogStatus.FAIL,  "selecting a Policy option Type :- " +msg1);
			}
		}catch(Exception e) {
			String	msg1=Locator.SaveDocMsg1(driver).getText();
			Thread.sleep(3000);
			test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
		
		}
	
	Thread.sleep(3000);
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLViewPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Locator.ViewPolicy(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
 if(msg1.equalsIgnoreCase("Viewer")) {
	 test.log(LogStatus.PASS,  " document Type AOA :- View  successfully.");
 }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void PLDownloadPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.DownloadPolicy(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDeletePolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Locator.DocDeletePolicy(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADDLicenseRegi(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(18);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a  Licence/Registration option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  "selecting a  Licence/Registration option Type :- " +msg1);
		}
	}catch(Exception e) {
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a  Licence/Registration option Type :- " +msg1);
	
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADDLicenseRegiInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(18);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
	if(msg1.equalsIgnoreCase("Record saved successfully")) {
		test.log(LogStatus.FAIL,  "Try to entering Last Renewal date is Greater than Next renewal Date :- " +msg1);
	}else {
		test.log(LogStatus.PASS,  "Try to entering Last Renewal date is Greater than Next renewal Date :-  " +msg1);
	}
	}catch(Exception e) {
		
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		if(msg1.equalsIgnoreCase("Record already exist")) {
			test.log(LogStatus.FAIL,  "Try to entering Last Renewal date is Greater than Next renewal Date :- " +msg1);
		}else {
			test.log(LogStatus.PASS,  "Try to entering Last Renewal date is Greater than Next renewal Date :-  " +msg1);
		}
		
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLWithoutDocumentLicense(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADDLicenseRegiED(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	
	Locator.LicenseNo(driver).sendKeys("17"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	try {
		String	msg1=Locator.SaveDocMsg(driver).getText();
			if(msg1.equalsIgnoreCase("Record saved successfully")) {
				test.log(LogStatus.PASS,  " selecting a  Licence/Registration option Type :- " +msg1);
			}else {
				test.log(LogStatus.FAIL,  "selecting a  Licence/Registration option Type :- " +msg1);
			}
		}catch(Exception e) {
			String	msg1=Locator.SaveDocMsg1(driver).getText();
			test.log(LogStatus.PASS,  " selecting a  Licence/Registration option Type :- " +msg1);
		
		}
	
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLViewLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	try {
		Locator.ViewLICENSE_REGISTRATION1(driver).click();
		Thread.sleep(2000);
	}catch(Exception e) {
		Locator.ViewPolicy(driver).click();
		Thread.sleep(2000);
	}
	
	String	msg1=Locator.ViewMsg(driver).getText();
if(msg1.equalsIgnoreCase("Viewer")) {
	 test.log(LogStatus.PASS,  " document Type LICENSE_REGISTRATION :- View  successfully.");
}
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void PLDownloadLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	
	try {
		Locator.DownloadLicense1(driver).click();	
	}catch(Exception e) {
		Locator.DownloadLicense(driver).click();
		Thread.sleep(2000);
	}
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PlDeleteLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	try {
		Locator.DocDeleteLICENSE1(driver).click();
		Thread.sleep(2000);
	}catch(Exception e) {
		Locator.DocDeleteLICENSE(driver).click();
		Thread.sleep(2000);
	}
	
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADDAnnualReport(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(18);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);

	
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[11]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
	try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
	
		Thread.sleep(3000);
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a Annual Report option Type  :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  "selecting a Annual Report option Type  :- " +msg1);
		}
	}catch(Exception e) {
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Annual Report option Type :- " +msg1);
		Thread.sleep(3000);
	}
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDocumentsADDAnnualReportED(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	Locator.LicenseNo(driver).sendKeys("17"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);

	
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[11]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
	
		Thread.sleep(3000);
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a Annual Report option Type  :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  "selecting a Annual Report option Type  :- " +msg1);
		}
	}catch(Exception e) {
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Annual Report option Type :- " +msg1);
		Thread.sleep(3000);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PlDocumentsADDAnnualReportWD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	Locator.LicenseNo(driver).sendKeys("17"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[11]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
	
		Thread.sleep(3000);
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a Annual Report option Type  :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  "selecting a Annual Report option Type  :- " +msg1);
		}
	}catch(Exception e) {
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Annual Report option Type :- " +msg1);
		Thread.sleep(3000);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLViewAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	try {
		Locator.ViewAnnual1(driver).click();
		Thread.sleep(2000);
	}catch(Exception e) {
		Locator.ViewAnnual(driver).click();
		Thread.sleep(2000);
	}
	
	String	msg1=Locator.ViewMsg(driver).getText();
if(msg1.equalsIgnoreCase("Viewer")) {
	 test.log(LogStatus.PASS,  " document Type Annual Report :- View  successfully.");
}
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void PLDownloadAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.DownloadAR1(driver).click();		//Exporting (Downloading) file
	try {
		Locator.DownloadAR1(driver).click();	
	}catch(Exception e) {
		Locator.DownloadAR(driver).click();
		Thread.sleep(2000);
	}
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLDeleteAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	try {
		Locator.DocDeleteAR1(driver).click();
		Thread.sleep(2000);	
	}catch(Exception e) {
		Locator.DocDeleteAR(driver).click();
		Thread.sleep(2000);
	}
	
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void PLBranchDetailsClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	if(Locator.BranchDetails(driver).isEnabled()) {
		Locator.BranchDetails(driver).click();
		test.log(LogStatus.PASS, " Branch Details  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Branch Details  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLAddNewBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(20);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(21);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(22);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.ContactNumber(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(23);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.EmailBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	row0 = sheet.getRow(24);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.State(driver).click();
	Thread.sleep(1000);
	Locator.Maharashtra(driver).click();
	Thread.sleep(3000);
	
	Locator.City(driver).click();
	Thread.sleep(1000);
	Locator.Ahmadnagar(driver).click();
	Thread.sleep(3000);
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("Details Save Successfully")) {
		test.log(LogStatus.PASS, Msg);
	}else {
		test.log(LogStatus.FAIL, Msg);
	}
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLAddNewBranchDetailsinvalidData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(20);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ContactPerson(driver).sendKeys("123$"); // Writing Task title
	Thread.sleep(2000);
	
	
	Locator.ContactNumber(driver).sendKeys("11111111"); // Writing Task title
	Thread.sleep(4000);
	
	
	Locator.EmailBD(driver).sendKeys("123@"); // Writing Task title
	Thread.sleep(2000);
	row0 = sheet.getRow(24);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.State(driver).click();
	Thread.sleep(1000);
	Locator.Maharashtra(driver).click();
	Thread.sleep(3000);
	
	Locator.City(driver).click();
	Thread.sleep(1000);
	Locator.Ahmadnagar(driver).click();
	Thread.sleep(3000);
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS, Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLAddNewBranchDetailsMandatoryfield(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(20);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLAddNewBranchDetailsWithOutData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(4000);
	
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLEditBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.EditBranchD1(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.Name(driver).clear();
	Thread.sleep(2000);
	row0 = sheet.getRow(25);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsg(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLUploadBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
	//	Locator.SelectFile(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		Locator.UploadBD(driver).click();
		Thread.sleep(3000);
String Msg=	Locator.UploadMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File Upload successfully")) {
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLUploadBranchDetailsInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_09_07 PM.zip");
	
		
		Thread.sleep(3000);
String Msg=	Locator.InvalidUploadMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File type not allowed.")) {
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLUploadBranchDetailsMulvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		By locator1 = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
		Thread.sleep(4000);
		
		WebElement ViewButton1 = driver.findElement(locator1);	
		Thread.sleep(3000);
		ViewButton1.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		
		Locator.UploadBD(driver).click();
		Thread.sleep(3000);
		String Msg=	Locator.UploadMsg(driver).getText();
		Thread.sleep(3000);
		if(Msg.equalsIgnoreCase("File Upload successfully")) {
			test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
		}else {
			test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
		}
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLUploadBranchDetailsMulInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_09_07 PM.zip");
		Thread.sleep(3000);
		By locator1 = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
		Thread.sleep(4000);
		
		WebElement ViewButton1 = driver.findElement(locator1);	
		Thread.sleep(3000);
		ViewButton1.sendKeys("C:\\Users\\Mayuri\\Downloads\\Secretrial.html");
		Thread.sleep(3000);
String Msg=	Locator.InvalidUploadMsg(driver).getText();
	Thread.sleep(3000);
	
	String Msg1=Locator.InvalidUploadMsg1(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File type not allowed.") && Msg1.equalsIgnoreCase("File type not allowed.")) {
		test.log(LogStatus.PASS,"multiple invalid file extensions upload Same  Message Displayed :-  1)"+ Msg+", 2)"+Msg1);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLUploadBranchDetailsWF(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		
		Locator.UploadBD(driver).click();
		Thread.sleep(4000);
		String Msg=	Locator.UploadMsg1(driver).getText();
		Thread.sleep(3000);
		if(Msg.equalsIgnoreCase("Please select file to upload")) {
			test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
		}else {
			test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
		}
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLAddNewBranchDetailsClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		if(Locator.CloseBranchD(driver).isEnabled()) {
			Locator.CloseBranchD(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS," close or exit button is working");
			
		}else {
			test.log(LogStatus.PASS," close or exit button is not working");
		}

		Thread.sleep(3000);
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLBankDetailsClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	if(Locator.BankDetails(driver).isEnabled()) {
		Locator.BankDetails(driver).click();
		test.log(LogStatus.PASS, " Bank Details  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, "Bank Details  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void PLBankDetailAddnew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(4);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.SaveBDMsg(driver).getText();
	test.log(LogStatus.PASS,  "Bank Details -Add New - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void PLBankDetailInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(6);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	Locator.AccountNo(driver).sendKeys(c1.getStringCellValue());
//	int No = (int) c1.getNumericCellValue();
//	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(2000);
	
	String	msg=Locator.InvalidMsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "Bank Details -Add New - " +msg);
	Thread.sleep(2000);
Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void PLBankDetailInvalidBName(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(4);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	row0 = sheet.getRow(8);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void PLBankDetailInvalidIFC(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(4);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(10);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.IFSC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	
	
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void PLWithOutBankDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(2000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	
	Locator.SaveBD(driver).click();
	Thread.sleep(2000);
	
	String	msg=Locator.InvalidMsg(driver).getText();
	Thread.sleep(3000);
	String	msg1=Locator.InvalidMsg1(driver).getText();
	Thread.sleep(3000);
	String	msg2=Locator.InvalidMsg2(driver).getText();
	Thread.sleep(3000);
	String	msg3=Locator.InvalidMsg3(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "message Display " +msg +", "+msg1+", "+ msg2 +", "+msg3);
	Thread.sleep(2000);
Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }

	public static void PLBankDetailEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
//	Thread.sleep(5000);
//	Locator.EditBD(driver).click();
	Thread.sleep(3000);
	By locator = By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[4]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	Thread.sleep(4000);
	Locator.NameofBank(driver).clear();
	Thread.sleep(2000);
	row0 = sheet.getRow(9);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.SaveBDMsg(driver).getText();
	test.log(LogStatus.PASS,  "Edit - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void PLBankDetailEditInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
//	Locator.EditBD(driver).click();
	Thread.sleep(3000);
	By locator = By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[4]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.IFSC(driver).clear();
	Thread.sleep(1000);
	row0 = sheet.getRow(10);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.IFSC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  "Edit - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void PLBankDetailDelete(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.DeleteBD(driver).click();
	Thread.sleep(3000);
	Locator.Yes(driver).click();
	Thread.sleep(2000);
	
	
	
	String	msg1=driver.switchTo().alert().getText();
	
	test.log(LogStatus.PASS, msg1);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
 Locator.ClosePopEntity(driver).click();
 Thread.sleep(1000);
 Locator.ClickDashboard(driver).click();
 Thread.sleep(1000);
	 }
	
	public static void PLBankDetailDeleteCan(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC030311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.DeleteBD(driver).click();
	Thread.sleep(3000);
	if(Locator.No(driver).isEnabled()) {
	Locator.No(driver).click();
	Thread.sleep(2000);
	test.log(LogStatus.PASS,  "user deletes an item and cancels deletion Successfully");
	}
	
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
Thread.sleep(1000);
	 }
	
	public static void  ListedCompanySelect(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(3000);
	
	Locator.EntityType(driver).click();
	Thread.sleep(3000);
	if(Locator.ListedCompanySelect(driver).isEnabled()) {
		Thread.sleep(3000);
		Locator.ListedCompanySelect(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  "The 'Public Limited Company' entity  selected from dropdown");
	}else {
		test.log(LogStatus.FAIL,  "The 'Public Limited Company' entity Not selected from dropdown");
	}
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	Locator.CloseEntity(driver).click();
	
	Thread.sleep(3000);

	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void  ListedCompanyAdd(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(3000);
	
	Locator.EntityType(driver).click();
	Thread.sleep(3000);
	
	Locator.ListedCompanySelect(driver).click();
		
	Thread.sleep(3000);
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(32);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.EntityName(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	row0 = sheet.getRow(33);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.CINEntity(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.CalendorIcon(driver).click();
	Thread.sleep(2000);
	Locator.Date(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(34);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.PAN(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.Roc(driver).click();
	Thread.sleep(4000);
	
	List<WebElement>roc = driver.findElements(By.xpath("//ul[@id='ddlRocJuris_listbox']//li"));
	selectOptionFromDropDown_bs(roc, "Mumbai");
	
	
	
	Locator.CompanyCategory(driver).click();
	Thread.sleep(2000);
	List<WebElement>comCat = driver.findElements(By.xpath("//ul[@id='ddlComCategary_listbox']//li"));
	selectOptionFromDropDown_bs(comCat, "Company limited by shares");
	
	row0 = sheet.getRow(30);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.EmailE(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.FinancialYear(driver).click();
	Thread.sleep(2000);
	List<WebElement>finYr = driver.findElements(By.xpath("//ul[@id='FY_listbox']//li"));
	selectOptionFromDropDown_bs(finYr, "1 Apr - 31 Mar");
	
	row0 = sheet.getRow(31);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.AddressE(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	row0 = sheet.getRow(31);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.Address2(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.StateE(driver).click();
	Thread.sleep(2000);
	List<WebElement>state = driver.findElements(By.xpath("(//ul[@id='stateId_listbox'])[2]//li"));
	selectOptionFromDropDown_bs(state, "Maharashtra");
	
	Locator.CityE(driver).click();
	Thread.sleep(2000);
	List<WebElement>city = driver.findElements(By.xpath("//ul[@id='ddlreg_cityId_listbox']//li"));
	selectOptionFromDropDown_bs(city, "Mumbai");
	Locator.SaveE(driver).click();
	Thread.sleep(3000);
	try {
	
String msg=	Locator.SaveEMsg(driver).getText();
if(msg.equalsIgnoreCase("Entity Saved Successfully")) {
	test.log(LogStatus.PASS, msg );
}else {
	test.log(LogStatus.FAIL, msg );
}
	}catch(Exception  e) {
		String msg=	Locator.SaveEMsg1(driver).getText();
		test.log(LogStatus.PASS, msg );
		
	}
Thread.sleep(4000);
Locator.CloseEntity(driver).click();
	Thread.sleep(3000);

	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void ListedCompanyAddInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(3000);
	
	Locator.EntityType(driver).click();
	Thread.sleep(3000);
	
	Locator.ListedCompanySelect(driver).click();
		
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.Roc(driver).click();
	Thread.sleep(4000);
	
	List<WebElement>roc = driver.findElements(By.xpath("//ul[@id='ddlRocJuris_listbox']//li"));
	selectOptionFromDropDown_bs(roc, "Mumbai");
	
	Locator.EntityName(driver).sendKeys("$NAME");
	Thread.sleep(4000);
	
	
	Locator.CINEntity(driver).sendKeys("2");
	Thread.sleep(4000);
	
	Locator.DateBox(driver).sendKeys("12/04");
	Thread.sleep(2000);
	
	Locator.PAN(driver).sendKeys("234");
	Thread.sleep(4000);
	
	
	
	
	Locator.CompanyCategory(driver).click();
	Thread.sleep(2000);
	List<WebElement>comCat = driver.findElements(By.xpath("//ul[@id='ddlComCategary_listbox']//li"));
	selectOptionFromDropDown_bs(comCat, "Company limited by shares");
	
	
	Locator.EmailE(driver).sendKeys("ABC@");
	Thread.sleep(4000);
	
	Locator.FinancialYear(driver).click();
	Thread.sleep(2000);
	List<WebElement>finYr = driver.findElements(By.xpath("//ul[@id='FY_listbox']//li"));
	selectOptionFromDropDown_bs(finYr, "1 Apr - 31 Mar");
	Thread.sleep(4000);
	String msg=	Locator.InvalidMsgName(driver).getText();
	String msg1=	Locator.InvalidMsgeCIN(driver).getText();
	Thread.sleep(1000);
	String msg2=	Locator.InvalidMsgeDate(driver).getText();
	Thread.sleep(1000);
	String msg3=	Locator.InvalidMsgePan(driver).getText();
	Thread.sleep(1000);
	String msg4=	Locator.InvalidMsgeEmail(driver).getText();
	Thread.sleep(1000);
	Thread.sleep(4000);
	row0 = sheet.getRow(31);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.AddressE(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.StateE(driver).click();
	Thread.sleep(2000);
	List<WebElement>state = driver.findElements(By.xpath("(//ul[@id='stateId_listbox'])[2]//li"));
	selectOptionFromDropDown_bs(state, "Maharashtra");
	
	Locator.CityE(driver).click();
	Thread.sleep(2000);
	List<WebElement>city = driver.findElements(By.xpath("//ul[@id='ddlreg_cityId_listbox']//li"));
	selectOptionFromDropDown_bs(city, "Mumbai");


	test.log(LogStatus.PASS,"Message Display ; -"+ msg+ ", "+ msg1+", "+msg2+", "+msg3+", "+msg4);
	Locator.SaveE(driver).click();
	Thread.sleep(3000);
Thread.sleep(4000);
Locator.CloseEntity(driver).click();
	Thread.sleep(3000);

	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void ListedCompanyAddWith2man(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(3000);
	
	Locator.EntityType(driver).click();
	Thread.sleep(3000);
	
	Locator.ListedCompanySelect(driver).click();
		
	
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(27);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.EntityName(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	row0 = sheet.getRow(28);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	
	Locator.CINEntity(driver).sendKeys(c1.getStringCellValue());
	Thread.sleep(4000);
	
	Locator.SaveE(driver).click();
	Thread.sleep(3000);
	
	
	String msg=	Locator.InvalidMsgeDate(driver).getText();
	String msg1=	Locator.InvalidMsgePan(driver).getText();
     Thread.sleep(1000);
	String msg2=	Locator.InvalidMsgeEmail(driver).getText();
	Thread.sleep(1000);
	String msg3=	Locator.InvalidMsgeRoc(driver).getText();
	Thread.sleep(1000);
	String msg4=	Locator.InvalidMsgeFY(driver).getText();
	Thread.sleep(1000);
	String msg5=	Locator.InvalidMsgeAddress(driver).getText();
	Thread.sleep(1000);
	String msg6=	Locator.InvalidMsgeState(driver).getText();
	Thread.sleep(1000);
	String msg7=	Locator.InvalidMsgecity(driver).getText();
	Thread.sleep(1000);
	Thread.sleep(4000);
	
//	Locator.SaveE(driver).click();
	Thread.sleep(3000);
	

	test.log(LogStatus.PASS,"Message Display ; -"+ msg+ ", "+ msg1+", "+msg2+", "+msg3+", "+msg4+", "+msg5+", "+msg6+", "+msg7);
	
Thread.sleep(4000);
Locator.CloseEntity(driver).click();
	Thread.sleep(3000);

	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void ListedCompanyAddWithoutdata(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(3000);
	
	Locator.EntityType(driver).click();
	Thread.sleep(3000);
	
	Locator.ListedCompanySelect(driver).click();
		
	Thread.sleep(3000);
	Locator.SaveE(driver).click();
	Thread.sleep(3000);
	
	String msg8=	Locator.InvalidMsgName(driver).getText();
	Thread.sleep(1000);
	String msg9=	Locator.InvalidMsgeCIN(driver).getText();
	Thread.sleep(1000);
	Thread.sleep(4000);
	String msg=	Locator.InvalidMsgeDate(driver).getText();
	Thread.sleep(1000);
	String msg1=	Locator.InvalidMsgePan(driver).getText();
    Thread.sleep(1000);
	String msg2=	Locator.InvalidMsgeEmail(driver).getText();
	Thread.sleep(1000);
	String msg3=	Locator.InvalidMsgeRoc(driver).getText();
	Thread.sleep(1000);
	String msg4=	Locator.InvalidMsgeFY(driver).getText();
	Thread.sleep(1000);
	String msg5=	Locator.InvalidMsgeAddress(driver).getText();
	Thread.sleep(1000);
	String msg6=	Locator.InvalidMsgeState(driver).getText();
	Thread.sleep(1000);
	String msg7=	Locator.InvalidMsgecity(driver).getText();
	Thread.sleep(1000);
	Thread.sleep(4000);
	
//	Locator.SaveE(driver).click();
	Thread.sleep(3000);
	

	test.log(LogStatus.PASS,"Message Display ; -"+ msg+ ", "+ msg1+", "+msg2+", "+msg3+", "+msg4+", "+msg5+", "+msg6+", "+msg7+", "+msg8+", "+msg9);
	
Thread.sleep(4000);
Locator.CloseEntity(driver).click();
	Thread.sleep(3000);

	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void ListedCompanyAddClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	Locator.AddNewEP(driver).click();
	Thread.sleep(4000);

if(Locator.CloseEntity(driver).isEnabled())	{
Thread.sleep(4000);
Locator.CloseEntity(driver).click();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "Close Button Working Successfully");
	
}
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void ListedCompanyEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	
	
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	Thread.sleep(5000);
	Locator.CalendorIcon(driver).click();
	Thread.sleep(2000);
	Locator.Date(driver).click();
	Thread.sleep(3000);
	
	
	Locator.SaveE(driver).click();
	Thread.sleep(4000);
	String msg=	Locator.UpdateMsg(driver).getText();
	if(msg.equalsIgnoreCase("Entity updated successfully")) {
		test.log(LogStatus.PASS, msg );
	}else {
		test.log(LogStatus.FAIL, msg );
	}
	Locator.CloseEntity(driver).click();
	Thread.sleep(3000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void ListedCompanyEditInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	
	
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	
	Thread.sleep(3000);
	Locator.PAN(driver).sendKeys("ASS122");
	Thread.sleep(4000);
	
	Locator.SaveE(driver).click();
	Thread.sleep(4000);
	String msg=	Locator.InvalidMsgePan(driver).getText();
	Thread.sleep(1000);
	
	
		test.log(LogStatus.PASS, msg );

	Locator.CloseEntity(driver).click();
	Thread.sleep(3000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void ListedCompanyEditClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	
	
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	
	
	
	if(Locator.CloseEntity(driver).isEnabled())	{
		Thread.sleep(4000);
		Locator.CloseEntity(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS,  " Edit - Close Button Working Successfully");
			
		}
	
	Thread.sleep(3000);
	Locator.ClickDashboard(driver).click();
	 Thread.sleep(1000);
	 }
	
	public static void LCBusinessActivityClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);

	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	
	
	Locator.EntityEdit(driver).click();
	
	Thread.sleep(2000);
	if(Locator.BusinessActivity(driver).isEnabled()) {
		Locator.BusinessActivity(driver).click();
		test.log(LogStatus.PASS, " Business Activity  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Business Activity  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCBusinessActivity(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);

	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	Locator.MainActivityCode(driver).click();
	Thread.sleep(1000);
	Locator.Agricultureforestryfishing(driver).click();
	Thread.sleep(1000);
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);
	Locator.Productionofcropsandanimals(driver).click();
	Thread.sleep(1000);
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Save Successfully")) {
		test.log(LogStatus.PASS,  msg);
	} else {
		test.log(LogStatus.FAIL, msg);
	}
	
	
	
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}

	public static void  LCBusinessActivityValidation(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);
String Msg=	Locator.ValidationBA(driver).getText();
	Thread.sleep(1000);
	if(Msg.equalsIgnoreCase("No data found.")) {
		
		test.log(LogStatus.PASS,  "Business activity' dropdown is not Activated" );
	} else {
		test.log(LogStatus.FAIL, "Business activity' dropdown is  Activated" );
	}
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);

	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	
	public static void LCvalidationofsave(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	
	
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Save Successfully")) {
		test.log(LogStatus.FAIL,  "Business Activity -Add New -" +msg);
	} else {
		test.log(LogStatus.PASS, " Business Activity -Add New -" +msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCvalidationofedit(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(4000);
	Locator.EditPL(driver).get(1).click();

    Thread.sleep(4000);
	
	Locator.BusinessActivity1(driver).click();
	Thread.sleep(1000);
	Locator.ExtractionofCrudePetroleumNaturalgas(driver).click();
	Thread.sleep(1000);
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Updated Successfully")) {
		test.log(LogStatus.PASS,  msg);
	} else {
		test.log(LogStatus.FAIL, msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void LCCheckInvaliddata(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	
	Thread.sleep(4000);
	Locator.EditPL(driver).get(1).click();
Thread.sleep(4000);
	
	Locator.Percentage(driver).sendKeys("e");
	Thread.sleep(1000);
	
	Locator.Save(driver).click();
	Thread.sleep(1000);
	
	String msg = Locator.SaveMsg(driver).getText();
	if (msg.equalsIgnoreCase("Record Updated Successfully")) {
		test.log(LogStatus.FAIL,  "Business Activity -Edit - " +msg);
	} else {
		test.log(LogStatus.PASS, " Business Activity -Edit -" +msg);
	}
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void LCDeleteBusinessActivity(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(1000);
	Locator.DeleteBA(driver).click();
	Thread.sleep(2000);
	//Locator.YesBA(driver).click();
	By locator = By.xpath("//*[@id='yesBA']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	Thread.sleep(1000);
	String Msg=driver.switchTo().alert().getText();
	Thread.sleep(1000);
	test.log(LogStatus.PASS,  "Delete Business Activity :- " +Msg);
	driver.switchTo().alert().accept();
	Thread.sleep(1000);
	
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCBusinessActivityADDNewClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(3000);
	
	Locator.AddNew(driver).click();
	Thread.sleep(1000);
	if(Locator.ClosePop(driver).isEnabled()) {
	Locator.ClosePop(driver).click();
	Thread.sleep(1000);
	test.log(LogStatus.PASS,  "close or exit button is working ");
	}
	
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);

	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	if(Locator.Documents(driver).isEnabled()) {
		Locator.Documents(driver).click();
		test.log(LogStatus.PASS, " Document  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Document  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCDocumentsADDMOA(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);

	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	Locator.Documents(driver).click();
	Thread.sleep(2000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeMOA(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
//	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_21_45 PM.zip");
	Thread.sleep(4000);
	
	//Locator.Upload(driver).sendKeys("C:\\Users\\Mayuri Gaikwad\\Downloads\\Report  (1).xlsx");
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
		
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  "  selecting a MOA option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  "  selecting a MOA option Type :- " +msg1);
		}
	}catch(Exception e) {
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  "  selecting a MOA option Type :- " +msg1);
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCWithoutDocument(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	
	
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		
		if(msg1.equalsIgnoreCase("Please select File")) {
			test.log(LogStatus.PASS, msg1);
		}
		else {
			test.log(LogStatus.FAIL,  msg1);
		}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADDMOAAE(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeMOA(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_21_45 PM.zip");
	Thread.sleep(4000);
	
	//Locator.Upload(driver).sendKeys("C:\\Users\\Mayuri Gaikwad\\Downloads\\Report  (1).xlsx");
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Record already exist")) {
		test.log(LogStatus.PASS,  " To check whether user is able to add existing data or not. (For Type MOA) " +msg1);
	}
	else {
		test.log(LogStatus.FAIL,  " To check whether user is able to add existing data or not. (For Type MOA) " +msg1);
	}
	}catch(Exception e) {
		
     String	msg1=Locator.SaveDocMsg(driver).getText();
		
		
			test.log(LogStatus.PASS,  "  To check whether user is able to add existing data or not. (For Type MOA) :- " +msg1);
		
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCViewMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
   if(msg1.equalsIgnoreCase("Viewer")) {
  	 test.log(LogStatus.PASS,  " document Type MOA :- View  successfully.");
   }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDownloadMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDeleteMOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(1000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(16);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
	if(msg1.equalsIgnoreCase("Record saved successfully")) {
		test.log(LogStatus.PASS,  " selecting a AOA option Type :- " +msg1);
	}else {
		test.log(LogStatus.FAIL,  " selecting a AOA option Type :- " +msg1);
	}
	}catch(Exception e) {
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,"selecting a AOA option Type : -" + msg1);
	
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCWithoutDocumentAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
		
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADDExisting(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(1000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeAOA(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
		String	msg1=Locator.SaveDocMsg(driver).getText();
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a AOA option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  " selecting a AOA option Type :- " +msg1);
		}
		}catch(Exception e) {
			String	msg1=Locator.SaveDocMsg1(driver).getText();
			test.log(LogStatus.PASS,"o check whether user is able to add existing data or not. (For Type AOA)  : -" + msg1);
		
		}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	Thread.sleep(1000);
	 }
	
	public static void LCViewAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(3000);
	String	msg1=Locator.ViewMsg(driver).getText();
	Thread.sleep(1000);
  if(msg1.equalsIgnoreCase("Viewer")) {
 	 test.log(LogStatus.PASS,  " document Type AOA :- View  successfully.");
 	Thread.sleep(1000);
  }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void LCDownloadAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDeleteAOA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxAoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADDCOI(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
		
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  "selecting a COI option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  " selecting a COI option Type :- " +msg1);
		}
	}catch(Exception e) {
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a COI option Type :- " +msg1);
	
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCWithoutDocumentCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADDCOIExisting(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypeCOI(driver).click();
	Thread.sleep(3000);
	
	Locator.Description(driver).sendKeys("ABCD");
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
		String	msg1=Locator.SaveDocMsg(driver).getText();
			
			if(msg1.equalsIgnoreCase("Record saved successfully")) {
				test.log(LogStatus.PASS,  "selecting a COI option Type :- " +msg1);
			}else {
				test.log(LogStatus.FAIL,  " selecting a COI option Type :- " +msg1);
			}
		}catch(Exception e) {
			String	msg1=Locator.SaveDocMsg1(driver).getText();
			test.log(LogStatus.PASS,  " selecting a COI option Type :- " +msg1);
		
		}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCViewCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.View(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
 if(msg1.equalsIgnoreCase("Viewer")) {
	 test.log(LogStatus.PASS,  " document Type COI :- View  successfully.");
 }
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void LCDownloadCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.Download(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDeleteCOI(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangle(driver).click();
	Thread.sleep(4000);
	Locator.Filter(driver).click();
	Thread.sleep(5000);
	Locator.CheckBoxCOI(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	Locator.DocDelete(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADDPolicy(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(17);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
	
	
	String	msg1=Locator.SaveDocMsg(driver).getText();
		
		if(msg1.equalsIgnoreCase("Record saved successfully")) {
			test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
		}else {
			test.log(LogStatus.FAIL,  "selecting a Policy option Type :- " +msg1);
		}
	}catch(Exception e) {
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
	
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCWithoutDocumentPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADDPolicyAE(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.TypePolicy(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	try {
		
		
		String	msg1=Locator.SaveDocMsg(driver).getText();
			test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
			if(msg1.equalsIgnoreCase("Record saved successfully")) {
				test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
			}else {
				test.log(LogStatus.FAIL,  "selecting a Policy option Type :- " +msg1);
			}
		}catch(Exception e) {
			String	msg1=Locator.SaveDocMsg1(driver).getText();
			test.log(LogStatus.PASS,  " selecting a Policy option Type :- " +msg1);
		
		}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void LCViewPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Locator.ViewPolicy1(driver).click();
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
if(msg1.equalsIgnoreCase("Viewer")) {
	 test.log(LogStatus.PASS,  " document Type AOA :- View  successfully.");
}
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void LCDownloadPolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.DownloadPolicy1(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDeletePolicy(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickPolicies(driver).click();
	Thread.sleep(4000);
	
	Locator.DocDeletePolicy1(driver).click();
	Thread.sleep(2000);
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADDLicenseRegi(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(18);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
		
try {
			
	String	msg1=Locator.SaveDocMsg(driver).getText();
	if(msg1.equalsIgnoreCase("Record saved successfully")) {
		test.log(LogStatus.PASS,  " selecting a  Licence/Registration option Type :- " +msg1);
	}else {
		test.log(LogStatus.FAIL,  "selecting a  Licence/Registration option Type :- " +msg1);
	}
			
				}catch(Exception  e) {
					String	msg1=Locator.SaveDocMsg1(driver).getText();
					test.log(LogStatus.PASS, msg1 );
					
				}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADDLicenseRegiInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(35);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	try {
	String	msg1=Locator.SaveDocMsg(driver).getText();
	if(msg1.equalsIgnoreCase("Record saved successfully")) {
		test.log(LogStatus.FAIL,  "Try to entering Last Renewal date is Greater than Next renewal Date :- " +msg1);
	}else {
		test.log(LogStatus.PASS,  "Try to entering Last Renewal date is Greater than Next renewal Date :-  " +msg1);
	}
	}catch(Exception e) {
		
		String	msg1=Locator.SaveDocMsg1(driver).getText();
		if(msg1.equalsIgnoreCase("Record already exist")) {
			test.log(LogStatus.FAIL,  "Try to entering Last Renewal date is Greater than Next renewal Date :- " +msg1);
		}else {
			test.log(LogStatus.PASS,  "Try to entering Last Renewal date is Greater than Next renewal Date :-  " +msg1);
		}
		
	}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCWithoutDocumentLicense(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(4000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
	if(msg1.equalsIgnoreCase("Please select File")) {
		test.log(LogStatus.PASS, msg1);
	}
	else {
		test.log(LogStatus.FAIL,  msg1);
	}
	
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADDLicenseRegiED(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.LicenseRegistration(driver).click();
	Thread.sleep(3000);
	
	Locator.LicenseNo(driver).sendKeys("17"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.UpcomingRenewDate(driver).sendKeys("20/04/2023");
	Thread.sleep(3000);
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	Thread.sleep(3000);
	Locator.SaveDoc1(driver).click();
	Thread.sleep(3000);
	
	
	
		
		try {
			
			String msg=	Locator.SaveDocMsg(driver).getText();
			
				test.log(LogStatus.PASS, msg );
			
				}catch(Exception  e) {
					String	msg1=Locator.SaveDocMsg1(driver).getText();
					test.log(LogStatus.PASS, msg1 );
					
				}
	Locator.Close(driver).click();
	Thread.sleep(1000);
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCViewLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	try {
		Locator.ViewLICENSE_REGISTRATIONLC(driver).click();
		Thread.sleep(2000);
	}catch(Exception e) {
		Locator.ViewLICENSE_REGISTRATIONLC1(driver).click();
		Thread.sleep(2000);
	}
	
	
	Thread.sleep(2000);
	String	msg1=Locator.ViewMsg(driver).getText();
if(msg1.equalsIgnoreCase("Viewer")) {
	 test.log(LogStatus.PASS,  " document Type LICENSE_REGISTRATION :- View  successfully.");
}
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void LCDownloadLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);

	try {
		Locator.DownloadLicenseLC(driver).click();	
	}catch(Exception e) {
		Locator.DownloadLicenseLC1(driver).click();
		Thread.sleep(2000);
	}
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void lCDeleteLicenseRegi(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.LICENSE_REGISTRATION(driver).click();
	Thread.sleep(4000);
	try {
		Locator.DocDeleteLICENSElc(driver).click();
		Thread.sleep(2000);
	}catch(Exception e) {
		Locator.DocDeleteLICENSElc1(driver).click();
		Thread.sleep(2000);
	}
	
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADDAnnualReport(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(18);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.LicenseNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);

	
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[11]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
		
try {
			
	String	msg1=Locator.SaveDocMsg(driver).getText();
	
	Thread.sleep(3000);
	if(msg1.equalsIgnoreCase("Record saved successfully")) {
		test.log(LogStatus.PASS,  " selecting a Annual Report option Type  :- " +msg1);
	}else {
		test.log(LogStatus.FAIL,  "selecting a Annual Report option Type  :- " +msg1);
	}
			
				}catch(Exception  e) {
					String	msg1=Locator.SaveDocMsg1(driver).getText();
					test.log(LogStatus.PASS, msg1 );
					
				}
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDocumentsADDAnnualReportED(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	Locator.LicenseNo(driver).sendKeys("17"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);

	
	
	By locator = By.xpath("(//input[@type='file'])[3]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
	Thread.sleep(4000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[11]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
	
		try {
			
			String	msg1=Locator.SaveDocMsg(driver).getText();
			
			Thread.sleep(3000);
			if(msg1.equalsIgnoreCase("Record saved successfully")) {
				test.log(LogStatus.PASS,  " selecting a Annual Report option Type  :- " +msg1);
			}else {
				test.log(LogStatus.FAIL,  "selecting a Annual Report option Type  :- " +msg1);
			}
					
						}catch(Exception  e) {
							String	msg1=Locator.SaveDocMsg1(driver).getText();
							test.log(LogStatus.PASS, msg1 );
							
						}
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void lCDocumentsADDAnnualReportWD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.Documents(driver).click();
	Thread.sleep(1000);
	Locator.AddNewDocuments(driver).click();
	Thread.sleep(3000);
	Locator.Type(driver).click();
	Thread.sleep(1000);
	Locator.AnnualReport(driver).click();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	Locator.LicenseNo(driver).sendKeys("17"); // Writing Task title
	Thread.sleep(4000);
	Locator.LastRenewDate(driver).sendKeys("13/04/2023");
	Thread.sleep(3000);
	
	Locator.FY(driver).click();
	Thread.sleep(1000);
	Locator.FY2223(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(15);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Description(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);

	Locator.StartTime(driver).click();
	Thread.sleep(1000);
	Locator.StartTime8(driver).click();
	Thread.sleep(3000);

	Locator.EndTime(driver).click();
	Thread.sleep(1000);
	Locator.EndTime8(driver).click();
	Thread.sleep(3000);
	
	
	By locator1 = By.xpath("(//*[@class='btn btn-primary'])[11]");
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	
Thread.sleep(4000);
	
	String	msg1=Locator.SaveDocMsg1(driver).getText();
		test.log(LogStatus.PASS,  " selecting a Annual Report option Type :- " +msg1);
		Thread.sleep(3000);
	Locator.Close(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(300,0)");						//Scrolling down window by 1000 px.
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCViewAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	try {
	Locator.ViewAnnualLC(driver).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		Locator.ViewAnnualLC1(driver).click();
		Thread.sleep(2000);
	}
	String	msg1=Locator.ViewMsg(driver).getText();
if(msg1.equalsIgnoreCase("Viewer")) {
	 test.log(LogStatus.PASS,  " document Type Annual Report :- View  successfully.");
}
	Locator.Viewclose(driver).click();
	Thread.sleep(3000);
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	
	public static void LCDownloadAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	
	Thread.sleep(1000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	try {
	Locator.DownloadARLC1(driver).click();		//Exporting (Downloading) file
	}catch(Exception e) {
		Locator.DownloadARLC(driver).click();
	}
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCDeleteAnnualReport(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.Documents(driver).click();
	Thread.sleep(5000);
	
	Locator.Annual(driver).click();
	Thread.sleep(4000);
	try {
	Locator.DocDeleteARLC(driver).click();
	Thread.sleep(2000);
	}catch(Exception e) {
		Locator.DocDeleteARLC1(driver).click();
		Thread.sleep(2000);
	}
	String Msg=Locator.DocDeletemsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS, Msg);
	Thread.sleep(1000);
	Locator.DocDeleteYes(driver).click();
	Thread.sleep(2000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void LCBranchDetailsClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	if(Locator.BranchDetails(driver).isEnabled()) {
		Locator.BranchDetails(driver).click();
		test.log(LogStatus.PASS, " Branch Details  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, " Branch Details  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCAddNewBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(36);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(21);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ContactPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(22);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.ContactNumber(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(23);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.EmailBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	row0 = sheet.getRow(24);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.State(driver).click();
	Thread.sleep(1000);
	Locator.Maharashtra(driver).click();
	Thread.sleep(3000);
	
	Locator.City(driver).click();
	Thread.sleep(1000);
	Locator.Ahmadnagar(driver).click();
	Thread.sleep(3000);
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("Details Save Successfully")) {
		test.log(LogStatus.PASS, Msg);
	}else {
		test.log(LogStatus.FAIL, Msg);
	}
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCAddNewBranchDetailsinvalidData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(20);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ContactPerson(driver).sendKeys("123$"); // Writing Task title
	Thread.sleep(2000);
	
	
	Locator.ContactNumber(driver).sendKeys("11111111"); // Writing Task title
	Thread.sleep(4000);
	
	
	Locator.EmailBD(driver).sendKeys("123@"); // Writing Task title
	Thread.sleep(2000);
	row0 = sheet.getRow(24);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressBD(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.State(driver).click();
	Thread.sleep(1000);
	Locator.Maharashtra(driver).click();
	Thread.sleep(3000);
	
	Locator.City(driver).click();
	Thread.sleep(1000);
	Locator.Ahmadnagar(driver).click();
	Thread.sleep(3000);
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS, Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCAddNewBranchDetailsMandatoryfield(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(36);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	Locator.Status(driver).click();
	Thread.sleep(1000);
	Locator.ACtive(driver).click();
	Thread.sleep(3000);
	Locator.BranchType(driver).click();
	Thread.sleep(1000);
	Locator.HeadOffice(driver).click();
	Thread.sleep(3000);
	
	
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCAddNewBranchDetailsWithOutData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(4000);
	
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsgInvalid(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCEditBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.EditBranchD1(driver).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IframeMyCompliances"));	//Wait until frame get visible and switch to it.
		Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.Name(driver).clear();
	Thread.sleep(2000);
	row0 = sheet.getRow(37);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Name(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.ClickSave(driver).click();
	Thread.sleep(3000);
String Msg=	Locator.ClickSaveMsg(driver).getText();
	Thread.sleep(3000);
	
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	
	driver.switchTo().parentFrame();
	Thread.sleep(1000);
	Locator.CloseBranchD(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCUploadBranchDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
	//	Locator.SelectFile(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		Locator.UploadBD(driver).click();
		Thread.sleep(3000);
String Msg=	Locator.UploadMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File Upload successfully")) {
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCUploadBranchDetailsInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_09_07 PM.zip");
	
		
		Thread.sleep(3000);
String Msg=	Locator.InvalidUploadMsg(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File type not allowed.")) {
		test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCUploadBranchDetailsMulvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		By locator1 = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
		Thread.sleep(4000);
		
		WebElement ViewButton1 = driver.findElement(locator1);	
		Thread.sleep(3000);
		ViewButton1.sendKeys("C:\\Users\\Mayuri\\Downloads\\Committee Composition (5).pdf");
		Thread.sleep(3000);
		
		Locator.UploadBD(driver).click();
		Thread.sleep(3000);
		String Msg=	Locator.UploadMsg(driver).getText();
		Thread.sleep(3000);
		if(Msg.equalsIgnoreCase("File Upload successfully")) {
			test.log(LogStatus.PASS,"multiple valid file extensions upload Message Displayed :-  "+ Msg);
		}else {
			test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
		}
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCUploadBranchDetailsMulInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		By locator = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		Thread.sleep(4000);
		
		WebElement ViewButton = driver.findElement(locator);	
		Thread.sleep(3000);
		ViewButton.sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 1_09_07 PM.zip");
		Thread.sleep(3000);
		By locator1 = By.xpath("//*[@id='files']");

		wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
		Thread.sleep(4000);
		
		WebElement ViewButton1 = driver.findElement(locator1);	
		Thread.sleep(3000);
		ViewButton1.sendKeys("C:\\Users\\Mayuri\\Downloads\\Secretrial.html");
		Thread.sleep(3000);
String Msg=	Locator.InvalidUploadMsg(driver).getText();
	Thread.sleep(3000);
	
	String Msg1=Locator.InvalidUploadMsg1(driver).getText();
	Thread.sleep(3000);
	if(Msg.equalsIgnoreCase("File type not allowed.") && Msg1.equalsIgnoreCase("File type not allowed.")) {
		test.log(LogStatus.PASS,"multiple invalid file extensions upload Same  Message Displayed :-  1)"+ Msg+", 2)"+Msg1);
	}else {
		test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
	}
	
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCUploadBranchDetailsWF(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.UploadBranchD(driver).click();
		Thread.sleep(3000);
		
		Locator.UploadBD(driver).click();
		Thread.sleep(4000);
		String Msg=	Locator.UploadMsg1(driver).getText();
		Thread.sleep(3000);
		if(Msg.equalsIgnoreCase("Please select file to upload")) {
			test.log(LogStatus.PASS,"Message Displayed :-  "+ Msg);
		}else {
			test.log(LogStatus.FAIL,"Message Displayed :-  "+ Msg);
		}
	Thread.sleep(1000);
	Locator.UploadClose(driver).click();
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCAddNewBranchDetailsClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(3000);
	
		Locator.BranchDetails(driver).click();
		Thread.sleep(3000);
		Locator.AddNewBD(driver).click();
		Thread.sleep(3000);
		
		if(Locator.CloseBranchD(driver).isEnabled()) {
			Locator.CloseBranchD(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS," close or exit button is working");
			
		}else {
			test.log(LogStatus.PASS," close or exit button is not working");
		}

		Thread.sleep(3000);
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCBankDetailsClick(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(4000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	if(Locator.BankDetails(driver).isEnabled()) {
		Locator.BankDetails(driver).click();
		test.log(LogStatus.PASS, " Bank Details  tab is clickable ");
	}else {
		test.log(LogStatus.FAIL, "Bank Details  tab is not clickable");
		
	}
	
	Thread.sleep(1000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	}
	
	public static void LCBankDetailAddnew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(38);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.SaveBDMsg(driver).getText();
	test.log(LogStatus.PASS,  "Bank Details -Add New - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void LCBankDetailInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(6);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	Locator.AccountNo(driver).sendKeys(c1.getStringCellValue());
//	int No = (int) c1.getNumericCellValue();
//	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(2000);
	
	String	msg=Locator.InvalidMsg(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "Bank Details -Add New - " +msg);
	Thread.sleep(2000);
Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	

	
	public static void LCBankDetailInvalidBName(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(4);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	row0 = sheet.getRow(8);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void LCBankDetailInvalidIFC(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	row0 = sheet.getRow(4);
	c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
	int No = (int) c1.getNumericCellValue();
	Locator.AccountNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(5);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	row0 = sheet.getRow(10);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.IFSC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	Locator.TypeOfAccount(driver).click();
	Thread.sleep(1000);
	Locator.Savingsaccount(driver).click();
	Thread.sleep(1000);
	
	
	Locator.OpeningDate(driver).sendKeys("03/04/2023");
	Thread.sleep(1000);
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void LCWithOutBankDetails(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(2000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.New(driver).click();
	Thread.sleep(3000);
	
	
	Locator.SaveBD(driver).click();
	Thread.sleep(2000);
	
	String	msg=Locator.InvalidMsg(driver).getText();
	Thread.sleep(3000);
	String	msg1=Locator.InvalidMsg1(driver).getText();
	Thread.sleep(3000);
	String	msg2=Locator.InvalidMsg2(driver).getText();
	Thread.sleep(3000);
	String	msg3=Locator.InvalidMsg3(driver).getText();
	Thread.sleep(3000);
	test.log(LogStatus.PASS,  "message Display " +msg +", "+msg1+", "+ msg2 +", "+msg3);
	Thread.sleep(2000);
Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }

	public static void LCBankDetailEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
//	Thread.sleep(5000);
//	Locator.EditBD(driver).click();
	Thread.sleep(3000);
	By locator = By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[6]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	Thread.sleep(4000);
	Locator.NameofBank(driver).clear();
	Thread.sleep(2000);
	row0 = sheet.getRow(9);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofBank(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.SaveBDMsg(driver).getText();
	test.log(LogStatus.PASS,  "Edit - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void LCBankDetailEditInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
//	Locator.EditBD(driver).click();
	Thread.sleep(3000);
	By locator = By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[6]");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.IFSC(driver).clear();
	Thread.sleep(1000);
	row0 = sheet.getRow(10);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.IFSC(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(1000);
	
	Locator.SaveBD(driver).click();
	Thread.sleep(1000);
	
	String	msg1=Locator.InvalidMsg(driver).getText();
	test.log(LogStatus.PASS,  "Edit - " +msg1);

Locator.CloseBD(driver).click();
Thread.sleep(1000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
	
	 }
	
	public static void LCBankDetailDelete(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.DeleteBD(driver).click();
	Thread.sleep(3000);
	Locator.Yes(driver).click();
	Thread.sleep(2000);
	
	
	
	String	msg1=driver.switchTo().alert().getText();
	
	test.log(LogStatus.PASS, msg1);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
Thread.sleep(1000);
	 }
	
	public static void LCBankDetailDeleteCan(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Locator.SearchFilter(driver).sendKeys("U72200KA2002PLC040311",Keys.ENTER);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(2000);
	Locator.BankDetails(driver).click();
	Thread.sleep(3000);
	Locator.DeleteBD(driver).click();
	Thread.sleep(3000);
	if(Locator.No(driver).isEnabled()) {
	Locator.No(driver).click();
	Thread.sleep(2000);
	test.log(LogStatus.PASS,  "user deletes an item and cancels deletion Successfully");
	}
	
Locator.ClosePopEntity(driver).click();
Thread.sleep(1000);
Locator.ClickDashboard(driver).click();
Thread.sleep(1000);
	 }
	
	
	public static void FilterBA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (40));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(1000);
	Thread.sleep(3000);
	Locator.EntityEdit(driver).click();
	Thread.sleep(4000);
	Locator.BusinessActivity(driver).click();
	Thread.sleep(5000);
	
	Locator.ClickTriangleBA(driver).click();
	Thread.sleep(4000);
	Locator.FilterBA(driver).click();
	Thread.sleep(5000);
	
	
	Locator.CheckBoxMoa(driver).click();
	Thread.sleep(4000);
	Locator.ClickFiter(driver).click();
	Thread.sleep(5000);
	List<WebElement> ColName =driver.findElements(By.xpath("//table[@aria-activedescendant='gridBusinessActivity_active_cell']/tbody/tr/td[1]"));
	 int columns_count = ColName.size();
	 Thread.sleep(4000);
	for(int i=0;i<columns_count; i++) {
		 String celtext = ColName.get(i).getText();
		 Thread.sleep(4000);
	if(celtext.equalsIgnoreCase("Agriculture, forestry, fishing")) {
		 test.log(LogStatus.PASS,  " Selected Value Displayed in table successfully.");
	}else {
		
		test.log(LogStatus.FAIL,  " Selected Value not Displayed in Table.");
		break;
	}
	Thread.sleep(4000);
	}
	
	Thread.sleep(3000);
	
	
	Locator.ClosePopEntity(driver).click();
	Thread.sleep(1000);
	Locator.ClickDashboard(driver).click();
	 }
	
	public static void  ShareholdingInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.Shareholding(driver).click();
	Thread.sleep(3000);
			Locator.ShareholdingNew(driver).click();
			Thread.sleep(5000);
			Locator.FOLIONO(driver).sendKeys("10");
			Thread.sleep(3000);
			Locator.Classofshares(driver).click();
			Thread.sleep(1000);
			Locator.EquityShares(driver).click();
			Thread.sleep(3000);
			
			Locator.TypeS(driver).click();
			Thread.sleep(1000);
			Locator.Individual(driver).click();
			Thread.sleep(3000);
			Locator.Nameofthemember(driver).sendKeys("Mayuri");
			Thread.sleep(3000);
			Locator.Address(driver).sendKeys("<>!");
			Thread.sleep(3000);
			Locator.Nationality(driver).click();
			Thread.sleep(1000);
			Locator.Indian(driver).click();
			Thread.sleep(3000);
			Locator.Email(driver).sendKeys("Abcd@gmail.com");
			Thread.sleep(3000);
			
			Locator.Pan(driver).sendKeys("12w");
			Thread.sleep(3000);
			Locator.Noofshares(driver).sendKeys("w");
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
		   	js.executeScript("window.scrollBy(0,600)");
			Locator.SaveS(driver).click();
			Thread.sleep(3000);
		 	js.executeScript("window.scrollBy(0,-600)");
		  String text =Locator.ValiPan(driver).getText();
			    Thread.sleep(2000);
			    String text1 =Locator.ValiShaAb(driver).getText();
			    Thread.sleep(2000);
			 test.log(LogStatus.PASS, "Massage Dispalyed : -" +text+", "+text1);
			    Thread.sleep(3000);
			 //	js.executeScript("window.scrollBy(0,600)");
				Locator.CloseS(driver).click();
				Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ShareholdingnewClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.Shareholding(driver).click();
	Thread.sleep(3000);
			Locator.ShareholdingNew(driver).click();
			Thread.sleep(5000);
			
			if(Locator.CloseS(driver).isEnabled()) {

				Locator.CloseS(driver).click();
				Thread.sleep(2000);
				 test.log(LogStatus.PASS,"new - Close Button Working Successfully");
			}else {
				 test.log(LogStatus.PASS,"new - Close Button Not Working ");
			}
			 	
				
				Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  DebentureHolding(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
		if(Locator.DebentureHolding(driver).isEnabled()) {
			Locator.DebentureHolding(driver).click();
			Thread.sleep(1000);
			test.log(LogStatus.PASS,  " 'More Actions > 'Debenture Holding' option is Clickable  Successfully");
		}
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  DebentureHoldingSearch(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(1000);
			Locator.SearchDH(driver).sendKeys("123A",Keys.ENTER);
			Thread.sleep(3000);
	String Text =Locator.FolioNoValue(driver).getText();
	if(Text.equalsIgnoreCase("123A")) {
		test.log(LogStatus.PASS,  " ' Debenture Holding '- Search feild Working  Successfully");
	}else {
	
		test.log(LogStatus.FAIL,  " ' Debenture Holding' - Search feild not Working  Successfully");
	}
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  DebentureHoldingSearchInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(1000);
			Locator.SearchDH(driver).sendKeys("123AAA");
			Thread.sleep(3000);
	String Text =Locator.NoDataFound(driver).getText();
	if(Text.equalsIgnoreCase("No data found.")) {
		test.log(LogStatus.PASS,  " Search feild Working  Successfully");
	}else {
	
		test.log(LogStatus.FAIL,  " Search feild not Working  Successfully");
	}
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ClassAllDS(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
	if(Locator.ClassAll(driver).isEnabled()) {
		Thread.sleep(1000);
		Locator.ClassAll(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.PASS,  " Class-All Button is Clickable  Successfully");
	}else {
	
		test.log(LogStatus.FAIL,  " Class-All Button is not Clickable  Successfully");
	}
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ClassAllNCD(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			Locator.ClassAll(driver).click();
			Thread.sleep(3000);
		//	Locator.ClassAllNCD(driver).click();
		//	Thread.sleep(3000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Non Convertible Debentures");
			
			String Text =Locator.NCDText(driver).getText();
	if(Text.equalsIgnoreCase("Non Convertible Debentures")) {
		Thread.sleep(1000);
		test.log(LogStatus.PASS,  " The page  updated and filtered according to the non-convertable option");
		Thread.sleep(2000);
	}else {
	
		test.log(LogStatus.FAIL,  " The page Not updated and filtered according to the non-convertable option");
	}
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ClassAllPCD(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			Locator.ClassAll(driver).click();
			Thread.sleep(3000);
	
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Partly Convertible Debentures");
			
			String Text =Locator.NCDText(driver).getText();
	if(Text.equalsIgnoreCase("Partly Convertible Debentures")) {
		Thread.sleep(2000);
		test.log(LogStatus.PASS,  " The page  updated and filtered according to the Partly Convertible Debentures");
		Thread.sleep(2000);
	}else {
	
		test.log(LogStatus.FAIL,  " The page Not updated and filtered according to the Partly Convertible Debentures");
	}
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ClassAllFCD(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			Locator.ClassAll(driver).click();
			Thread.sleep(3000);
	
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			
			String Text =Locator.NCDText(driver).getText();
	if(Text.equalsIgnoreCase("Fully Convertible Debentures")) {
		Thread.sleep(2000);
		test.log(LogStatus.PASS,  " The page  updated and filtered according to the Fully Convertible Debentures");
		Thread.sleep(2000);
	}else {
	
		test.log(LogStatus.FAIL,  " The page Not updated and filtered according to the Fully Convertible Debentures");
	}
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  ClearFilter(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			Locator.ClassAll(driver).click();
			Thread.sleep(3000);
	
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			
			
	if(Locator.ClearFilter(driver).isEnabled()) {
		Thread.sleep(2000);
		Locator.ClearFilter(driver).click();
		test.log(LogStatus.PASS,  "Clear Filter Button Working Successfully");
		Thread.sleep(2000);
	}else {
	
		test.log(LogStatus.FAIL,  " Clear Filter Button not Working");
	}
	Thread.sleep(1000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	
	public static void  AddNewDH(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(2000);
	Thread.sleep(1000);
	String Text =Locator.SaveMsgDH(driver).getText();
	Thread.sleep(1000);
	if(Text.equalsIgnoreCase("Saved Successfully")) {
		test.log(LogStatus.PASS,Text );
	}else {
	
		test.log(LogStatus.FAIL,  Text);
	}
	Locator.CloseDH(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  AddNewDHTwoMan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(2000);
	Thread.sleep(1000);
	String Text =Locator.TypeVal(driver).getText();
	Thread.sleep(1000);
	String Text1 =Locator.AddressVal(driver).getText();
	Thread.sleep(1000);
	String Text2 =Locator.Email_IdVal(driver).getText();
	Thread.sleep(2000);
	
		test.log(LogStatus.PASS,"Validation Message Displayed :- "+Text +" ,"+Text1+" ,"+Text2);
		Thread.sleep(1000);
	Locator.CloseDH(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  AddNewInvalidData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			 
			Locator.EmailId(driver).sendKeys("ASS"); // Writing Task title
			Thread.sleep(2000);
			Locator.PanDH(driver).sendKeys("ASS1"); // Writing Task title
			Thread.sleep(2000);
			
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(2000);
	Thread.sleep(1000);
	String Text =Locator.Email_IdVal(driver).getText();
	Thread.sleep(1000);
	String Text1 =Locator.PanDHVal(driver).getText();
	Thread.sleep(1000);

		test.log(LogStatus.PASS,"validation Massage Displayed"+Text+" ,"+ Text1 );
	
	Locator.CloseDH(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  AddNewDHEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
		
			Locator.SaveBtn(driver).click();
			Thread.sleep(2000);
	Thread.sleep(1000);
	String Text3 =Locator.FOLIOVal(driver).getText();
	Thread.sleep(1000);
	String Text4 =Locator.DebentureVal(driver).getText();
	Thread.sleep(1000);
	String Text =Locator.TypeVal(driver).getText();
	Thread.sleep(1000);
	String Text1 =Locator.AddressVal(driver).getText();
	Thread.sleep(1000);
	String Text2 =Locator.Email_IdVal(driver).getText();
	Thread.sleep(2000);
	
		test.log(LogStatus.PASS,"Validation Message Displayed :- "+Text +" ,"+Text1+" ,"+Text2+", "+Text3+" ,"+Text4);
		Thread.sleep(1000);
	Locator.CloseDH(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void  AddNewClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(4000);
			if(Locator.CloseDH(driver).isEnabled()) {
			Locator.CloseDH(driver).click();
			test.log(LogStatus.PASS,"The window  closed successfully");
			}else {
				test.log(LogStatus.FAIL,"The window not closed ");
			}
		
		Thread.sleep(1000);

	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHD(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(3000);
	
	
	Thread.sleep(1000);
	if(Locator.DHD(driver).isEnabled()) {
		Thread.sleep(2000);
		Locator.DHD(driver).click();
		test.log(LogStatus.PASS,"The user  redirected to the 'Debenture Holding Details' page" );
	}else {
	
		test.log(LogStatus.FAIL,  "The user not redirected to the 'Debenture Holding Details' page");
	}
	Locator.CloseDHD(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(3000);
	
		Thread.sleep(2000);
		Locator.DHD(driver).click();
		Thread.sleep(3000);
		Locator.DHDAddNew(driver).click();
		Thread.sleep(3000);
		row0 = sheet.getRow(48);
		c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
		Locator.AllotmentNo(driver).sendKeys("" + No + ""); // Writing Task title
		Thread.sleep(3000);
		Locator.Dateofallotment(driver).click();
		Thread.sleep(2000);
		Locator.DateDHD(driver).click();
		Thread.sleep(2000);
		row0 = sheet.getRow(49);
		c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
		Locator.NoofDebentures(driver).sendKeys("" + No + ""); // Writing Task title
		Thread.sleep(3000);
		
		Locator.DNFrom(driver).sendKeys("2"); // Writing Task title
		Thread.sleep(2000);
		Locator.DNTo(driver).sendKeys("3"); // Writing Task title
		Thread.sleep(2000);
		Locator.Foliooftransferor(driver).sendKeys("2"); // Writing Task title
		Thread.sleep(2000);
		row0 = sheet.getRow(50);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Nameofthetransferor(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.Dateofissue(driver).click();
		Thread.sleep(2000);
		Locator.DateDHD(driver).click();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(51);
		c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
		Locator.CertificateNo(driver).sendKeys("" + No + ""); // Writing Task title
		Thread.sleep(2000);
		
		Locator.issuedforconsideration(driver).sendKeys("ASDF");
		Thread.sleep(2000);
		
		Locator.Dateoftransfer(driver).click();
		Thread.sleep(2000);
		Locator.DateDHD(driver).click();
		Thread.sleep(2000);
		
		Locator.NoofDebenturestransferred(driver).sendKeys("2");
		Thread.sleep(2000);
		Locator.DNFromT(driver).sendKeys("2"); // Writing Task title
		Thread.sleep(2000);
		Locator.DNToT(driver).sendKeys("3"); // Writing Task title
		Thread.sleep(2000);
		Locator.txtFolioOfTransferee(driver).sendKeys("35"); // Writing Task title
		Thread.sleep(2000);
		Locator.txtNameOfTransferee(driver).sendKeys("PQRS"); // Writing Task title
		Thread.sleep(2000);
		Locator.txtBalanceShare(driver).sendKeys("5"); // Writing Task title
		Thread.sleep(2000);
		
		Locator.Remark(driver).sendKeys("Remark"); // Writing Task title
		Thread.sleep(2000);
		Locator.Authentication(driver).sendKeys("yes"); // Writing Task title
		Thread.sleep(2000);
		
		Locator.SaveDHD(driver).click();
		Thread.sleep(2000);
		String Text =Locator.SavehdMsgDhd(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("Saved Successfully.")) {
			test.log(LogStatus.PASS,Text );
		}else {
		
			test.log(LogStatus.FAIL,  Text);
		}
		Thread.sleep(2000);
		Locator.CloseADDDHDC(driver).click();
		Thread.sleep(3000);
		
		
		
	Locator.CloseDHD(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDAddNewClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(3000);
	
		Thread.sleep(2000);
		Locator.DHD(driver).click();
		Thread.sleep(3000);
		Locator.DHDAddNew(driver).click();
		Thread.sleep(3000);
		
		if(Locator.CloseADDDHD(driver).isEnabled()) {
			Locator.CloseADDDHD(driver).click();
			test.log(LogStatus.PASS,"Close button working Successfully" );
		}else {
		
			test.log(LogStatus.FAIL,  "Close button not working");
		}
		
		
		Thread.sleep(3000);
		
		
		
	Locator.CloseDHD(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDAddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(3000);
	
		Thread.sleep(2000);
		Locator.DHD(driver).click();
		Thread.sleep(3000);
		Locator.DHDAddNew(driver).click();
		Thread.sleep(3000);
		
		
		Locator.SaveDHD(driver).click();
		Thread.sleep(2000);
		String Text =Locator.SavehdMsgDhd(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("Saved Successfully.")) {
			test.log(LogStatus.FAIL,Text );
		}else {
		
			test.log(LogStatus.PASS,  Text);
		}
		Thread.sleep(2000);
		Locator.CloseADDDHDC(driver).click();
		Thread.sleep(3000);
		
		
		
	Locator.CloseDHD(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDUpload(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(3000);
	
		Thread.sleep(2000);
		Locator.DHD(driver).click();
		Thread.sleep(3000);
		Locator.uploadButton(driver).click();
		Thread.sleep(3000);
		Locator.DownloadFile(driver).click();
		Thread.sleep(3000);
		Locator.ChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\DebentureholdingDetails.xlsx");
		Thread.sleep(4000);
		
		
		Locator.UploadFile(driver).click();
		Thread.sleep(3000);
		String Text =Locator.UploadMSg(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("Record Save Successfully")) {
			test.log(LogStatus.PASS,Text );
		}else {
		
			test.log(LogStatus.FAIL,  Text);
		}
		Thread.sleep(2000);
		Locator.UploadClosed(driver).click();
		Thread.sleep(3000);
		
		
		
	Locator.CloseDHD(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDUploadED(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(3000);
	
		Thread.sleep(2000);
		Locator.DHD(driver).click();
		Thread.sleep(3000);
		Locator.uploadButton(driver).click();
		Thread.sleep(3000);
		Locator.DownloadFile(driver).click();
		Thread.sleep(3000);
		Locator.ChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\DebentureholdingDetails.xlsx");
		Thread.sleep(4000);
		
		
		Locator.UploadFile(driver).click();
		Thread.sleep(3000);
		String Text =Locator.UploadMSg(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("Record Save Successfully")) {
			test.log(LogStatus.FAIL,Text );
		}else {
		
			test.log(LogStatus.PASS,  Text);
		}
		Thread.sleep(2000);
		Locator.UploadClosed(driver).click();
		Thread.sleep(3000);
		
		
		
	Locator.CloseDHD(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDUploadInvalidData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(3000);
	
		Thread.sleep(2000);
		Locator.DHD(driver).click();
		Thread.sleep(3000);
		Locator.uploadButton(driver).click();
		Thread.sleep(3000);
		Locator.DownloadFile(driver).click();
		Thread.sleep(3000);
		Locator.ChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\DebentureholdingDetails (2).xlsx");
		Thread.sleep(4000);
		
		
		Locator.UploadFile(driver).click();
		Thread.sleep(3000);
		String Text =Locator.InvalidUploadMSg(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("Please enter valid Date Of Allotment at row - 2")) {
			test.log(LogStatus.PASS,Text );
		}else {
		
			test.log(LogStatus.FAIL,  Text);
		}
		Thread.sleep(2000);
		Locator.UploadClosed(driver).click();
		Thread.sleep(3000);
		
		
		
	Locator.CloseDHD(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDUploadEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(3000);
	
		Thread.sleep(2000);
		Locator.DHD(driver).click();
		Thread.sleep(3000);
		Locator.uploadButton(driver).click();
		Thread.sleep(3000);
		Locator.DownloadFile(driver).click();
		Thread.sleep(3000);
		Locator.ChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\DebentureholdingDetails (2).xlsx");
		Thread.sleep(4000);
		
		
		Locator.UploadFile(driver).click();
		Thread.sleep(3000);
		String Text =Locator.UploadMSg(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("Record Save Successfully")) {
			test.log(LogStatus.FAIL,Text );
		}else {
		
			test.log(LogStatus.PASS,  Text);
		}
		Thread.sleep(2000);
		Locator.UploadClosed(driver).click();
		Thread.sleep(3000);
		
	Locator.CloseDHD(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDUploadInvalidEx(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(3000);
	
		Thread.sleep(2000);
		Locator.DHD(driver).click();
		Thread.sleep(3000);
		Locator.uploadButton(driver).click();
		Thread.sleep(3000);
		Locator.DownloadFile(driver).click();
		Thread.sleep(3000);
		Locator.ChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Downloads\\4_17_2023 11_08_48 AM.zip");
		Thread.sleep(4000);
		
		
		Locator.UploadFile(driver).click();
		Thread.sleep(3000);
		String Text =Locator.UploadMSg(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("No Data Found in Excel Document or Sheet Name must be 'DebentureholdingDetails'")) {
			test.log(LogStatus.PASS,Text );
		}else {
		
			test.log(LogStatus.FAIL,  Text);
		}
		Thread.sleep(2000);
		Locator.UploadClosed(driver).click();
		Thread.sleep(3000);
		
		
		
	Locator.CloseDHD(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDUploadwithoutFile(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(3000);
	
		Thread.sleep(2000);
		Locator.DHD(driver).click();
		Thread.sleep(3000);
		Locator.uploadButton(driver).click();
		Thread.sleep(4000);
		
		Locator.UploadFile(driver).click();
		Thread.sleep(3000);
		
		
			test.log(LogStatus.FAIL,"validation message Not displayed" );
		
		Thread.sleep(2000);
		Locator.UploadClosed(driver).click();
		Thread.sleep(3000);
		
		
		
	Locator.CloseDHD(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHUpload(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.uploadButtonDH(driver).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
		Locator.DownloadFile(driver).click();
		Thread.sleep(3000);
		Locator.ChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\DebentureHolding_BasicDetails.xlsx");
		Thread.sleep(4000);
	
		Locator.UploadFileDH(driver).click();
		Thread.sleep(3000);
		String Text =Locator.UploadMSg(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("Record Save Successfully")) {
			test.log(LogStatus.PASS,Text );
		}else {
		
			test.log(LogStatus.FAIL,  Text);
		}
		Thread.sleep(2000);
		Locator.UploadClosedDH(driver).click();
		Thread.sleep(3000);		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHUploadInvalidData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.uploadButtonDH(driver).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
		Locator.DownloadFile(driver).click();
		Thread.sleep(3000);
		Locator.ChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\DebentureHolding_BasicDetails (1).xlsx");
		Thread.sleep(4000);
	
		Locator.UploadFileDH(driver).click();
		Thread.sleep(3000);
		String Text =Locator.InvalidUploadMSg(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("Please enter valid Date Of Allotment at row - 2")) {
			test.log(LogStatus.PASS,Text );
		}else {
		
			test.log(LogStatus.FAIL,  Text);
		}
		Thread.sleep(2000);
		Locator.UploadClosedDH(driver).click();
		Thread.sleep(3000);		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHUploadED(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.uploadButtonDH(driver).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
		Locator.DownloadFile(driver).click();
		Thread.sleep(3000);
		Locator.ChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\DebentureHolding_BasicDetails.xlsx");
		Thread.sleep(4000);
	
		Locator.UploadFileDH(driver).click();
		Thread.sleep(3000);
		String Text =Locator.UploadMSg(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("Record Save Successfully")) {
			test.log(LogStatus.FAIL,Text );
		}else {
		
			test.log(LogStatus.PASS,  Text);
		}
		Thread.sleep(2000);
		Locator.UploadClosedDH(driver).click();
		Thread.sleep(3000);		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHUploadEmptyFile(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.uploadButtonDH(driver).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
		Locator.DownloadFile(driver).click();
		Thread.sleep(3000);
		Locator.ChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\DebentureHolding_BasicDetails (2).xlsx");
		Thread.sleep(4000);
	
		Locator.UploadFileDH(driver).click();
		Thread.sleep(3000);
		String Text =Locator.UploadMSg(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("Record Save Successfully")) {
			test.log(LogStatus.FAIL,Text );
		}else {
		
			test.log(LogStatus.PASS,  Text);
		}
		Thread.sleep(2000);
		Locator.UploadClosedDH(driver).click();
		Thread.sleep(3000);		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHUploadinvalidExten(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.uploadButtonDH(driver).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
		Locator.DownloadFile(driver).click();
		Thread.sleep(3000);
		Locator.ChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");
		Thread.sleep(4000);
	
		Locator.UploadFileDH(driver).click();
		Thread.sleep(3000);
		String Text =Locator.UploadMSg(driver).getText();
		Thread.sleep(1000);
		if(Text.equalsIgnoreCase("No Data Found in Excel Document or Sheet Name must be 'DebentureHoldings'")) {
			test.log(LogStatus.PASS,Text );
		}else {
		
			test.log(LogStatus.FAIL,  Text);
		}
		Thread.sleep(2000);
		Locator.UploadClosedDH(driver).click();
		Thread.sleep(3000);		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHUploadWithOutFile(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.uploadButtonDH(driver).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
	
	
		Locator.UploadFileDH(driver).click();
		Thread.sleep(3000);
		test.log(LogStatus.FAIL,"validation message Not displayed" );
		Thread.sleep(2000);
		Locator.UploadClosedDH(driver).click();
		Thread.sleep(3000);		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHMaster(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.MasterDH(driver).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
	
	
	String text=	Locator.MasterDHView(driver).getText();
		Thread.sleep(3000);
		if(text.equalsIgnoreCase("Debentureholding Master")) {
			test.log(LogStatus.PASS,"Clicking on Master -The user  redirected to the 'Debenture Holding Master' page" );
		}else {
			test.log(LogStatus.FAIL,"Clicking on Master -The user  not redirected to the 'Debenture Holding Master' page" );
		}
		
		Thread.sleep(2000);
		Locator.MasterClose(driver).click();
		Thread.sleep(3000);		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.DHEdit(driver).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
	
	
	String text=	Locator.DHEditview(driver).getText();
		Thread.sleep(3000);
		if(text.equalsIgnoreCase("Add/Edit - Debenture Holding")) {
			test.log(LogStatus.PASS,"Clicking on Debenture Holding -Edit -The user is redirected to the Add/Edit debenture holding detail page where the existing data is pre-filled." );
		}else {
			test.log(LogStatus.FAIL,"Clicking on Debenture Holding -Edit -The user is not redirected to the Add/Edit debenture holding detail page where the existing data is pre-filled." );
		}
		
		Thread.sleep(2000);
		Locator.CloseDH(driver).click();
		Thread.sleep(3000);		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHEditE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.DHEdit(driver).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
		Locator.Follio_No(driver).clear();
		Thread.sleep(3000);
		sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
		int row = 0;
		Thread.sleep(500);
		Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
		Cell c1 = null;
		
		
		row0 = sheet.getRow(52);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.SaveBtn(driver).click();
		Thread.sleep(2000);
        Thread.sleep(1000);
        String Text =Locator.SavehdMsgDhd(driver).getText();
        Thread.sleep(1000);
       if(Text.equalsIgnoreCase("Updated Successfully.")) {
	    test.log(LogStatus.PASS,Text );
      }else {

	test.log(LogStatus.FAIL,  Text);
}
		Thread.sleep(2000);
		Locator.CloseDH(driver).click();
		Thread.sleep(3000);		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHEditClose(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.DHEdit(driver).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
	
		
		if(Locator.CloseDH(driver).isEnabled()) {
			Locator.CloseDH(driver).click();
			test.log(LogStatus.PASS,"The window  closed successfully");
			}else {
				test.log(LogStatus.FAIL,"The window not closed ");
			}
		Thread.sleep(2000);
		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDelete(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.DHDelete(driver).click();
			Thread.sleep(3000);
			Locator.DHDeleteYes(driver).click();
		Thread.sleep(3000);
String msg =	driver.switchTo().alert().getText();
		
		if(msg.equalsIgnoreCase("Deleted Successfully")) {
			
			test.log(LogStatus.PASS,"Message Displayed :- "+msg);
			}else {
				test.log(LogStatus.FAIL,"Message Displayed :- "+msg);
			}
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDeleteCan(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.DHDelete(driver).click();
			Thread.sleep(3000);

		if(Locator.DHDeleteNo(driver).isEnabled()) {
			Locator.DHDeleteNo(driver).click();
			Thread.sleep(3000);
			test.log(LogStatus.PASS," Clicking on No : - The entity is not deleted from the system ");
			}else {
				test.log(LogStatus.FAIL,"Clicking on No : - The entity is deleted from the system");
			}
		Thread.sleep(2000);
		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	
	public static void DHEditInvalid(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.DHEdit(driver).click();
			Thread.sleep(3000);
		Thread.sleep(3000);
		Locator.PanDH(driver).clear();
		Thread.sleep(3000);
		Locator.PanDH(driver).sendKeys("ssd");
		
		
		Locator.SaveBtn(driver).click();
		Thread.sleep(2000);
       Thread.sleep(1000);
       String Text =Locator.PanVal(driver).getText();
       Thread.sleep(1000);
    
	    test.log(LogStatus.PASS,Text );
    
		Thread.sleep(2000);
		Locator.CloseDH(driver).click();
		Thread.sleep(3000);		
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void DHDAddNewInvalidData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(3000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.DebentureHolding(driver).click();
			Thread.sleep(3000);
			
			Locator.AddNewDH(driver).click();
			Thread.sleep(3000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(40);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Follio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.ClassofDebenture(driver).click();
			Thread.sleep(2000);
			List<WebElement>comCat = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(comCat, "Fully Convertible Debentures");
			Thread.sleep(2000);
			row0 = sheet.getRow(41);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
			int No = (int) c1.getNumericCellValue();
			Locator.CouponRate(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(42);
			c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
			Locator.TotalDebentureheld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(2000);
			Locator.TypeDH(driver).click();
			Thread.sleep(2000);
			List<WebElement> type = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type, "Individual");
			Thread.sleep(2000);
			row0 = sheet.getRow(43);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameDebentureHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(44);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.AddressDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(45);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.CINDH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			row0 = sheet.getRow(46);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.EmailId(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			Locator.NationalityDh(driver).click();
			Thread.sleep(2000);
			List<WebElement> type1 = driver.findElements(By.xpath("//li[@class='k-item']"));
			selectOptionFromDropDown_bs(type1, "Indian");
			Thread.sleep(2000);
			Locator.SaveBtn(driver).click();
			Thread.sleep(3000);
	
		Thread.sleep(2000);
		Locator.DHD(driver).click();
		Thread.sleep(3000);
		Locator.DHDAddNew(driver).click();
		Thread.sleep(3000);
		row0 = sheet.getRow(48);
		c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
		Locator.AllotmentNo(driver).sendKeys("" + No + ""); // Writing Task title
		Thread.sleep(3000);
		Locator.Dateofallotment(driver).click();
		Thread.sleep(2000);
		Locator.DateDHD(driver).click();
		Thread.sleep(2000);
		
		Locator.NoofDebentures(driver).sendKeys("dddd"); // Writing Task title
		Thread.sleep(3000);
		
		Locator.DNFrom(driver).sendKeys("2"); // Writing Task title
		Thread.sleep(2000);
		Locator.DNTo(driver).sendKeys("3"); // Writing Task title
		Thread.sleep(2000);
		Locator.Foliooftransferor(driver).sendKeys("2"); // Writing Task title
		Thread.sleep(2000);
		row0 = sheet.getRow(50);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		Locator.Nameofthetransferor(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.Dateofissue(driver).click();
		Thread.sleep(2000);
		Locator.DateDHD(driver).click();
		Thread.sleep(2000);
		
		row0 = sheet.getRow(51);
		c1 = row0.getCell(1); // Selected cell (4 row,1 column) 
		 No = (int) c1.getNumericCellValue();
		Locator.CertificateNo(driver).sendKeys("" + No + ""); // Writing Task title
		Thread.sleep(2000);
		
		Locator.issuedforconsideration(driver).sendKeys("ASDF");
		Thread.sleep(2000);
		
		Locator.Dateoftransfer(driver).click();
		Thread.sleep(2000);
		Locator.DateDHD(driver).click();
		Thread.sleep(2000);
		
		Locator.NoofDebenturestransferred(driver).sendKeys("2");
		Thread.sleep(2000);
		Locator.DNFromT(driver).sendKeys("2"); // Writing Task title
		Thread.sleep(2000);
		Locator.DNToT(driver).sendKeys("3"); // Writing Task title
		Thread.sleep(2000);
		Locator.txtFolioOfTransferee(driver).sendKeys("35"); // Writing Task title
		Thread.sleep(2000);
		Locator.txtNameOfTransferee(driver).sendKeys("PQRS"); // Writing Task title
		Thread.sleep(2000);
		Locator.txtBalanceShare(driver).sendKeys("5"); // Writing Task title
		Thread.sleep(2000);
		
		Locator.Remark(driver).sendKeys("Remark"); // Writing Task title
		Thread.sleep(2000);
		Locator.Authentication(driver).sendKeys("yes"); // Writing Task title
		Thread.sleep(2000);
		
		Locator.SaveDHD(driver).click();
		Thread.sleep(3000);
		String Text =Locator.NoDebenVal(driver).getText();
		Thread.sleep(1000);
		
			test.log(LogStatus.PASS,Text );
		
		Thread.sleep(2000);
		Locator.CloseADDDHDC(driver).click();
		Thread.sleep(3000);
		
		
	Locator.CloseDHD(driver).click();
	Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SecretarialAuditor(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
			if(Locator.SecretarialAuditor(driver).isEnabled()) {
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				   test.log(LogStatus.PASS,"The system  navigate to the Secretarial Auditor page" );
			}else {
				 test.log(LogStatus.PASS,"The system  not navigate to the Secretarial Auditor page" );
			}	
			Thread.sleep(2000);
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SAAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.SAAddNew(driver).click();
				Thread.sleep(3000);
				
				Locator.SACategory(driver).click();
				Thread.sleep(1000);	
				Locator.SAIndividual(driver).click();
				Thread.sleep(3000);
				
				Locator.SAauditorfirmName(driver).click();
				Thread.sleep(1000);	
				Locator.SAauditorfirmNameLi(driver).click();
				Thread.sleep(3000);
				
				sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
				int row = 0;
				Thread.sleep(500);
				Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
				Cell c1 = null;
				
				
				row0 = sheet.getRow(54);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.Certificate_of_Practice(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(2000);
	
				Locator.FYPOA(driver).click();
				Thread.sleep(1000);	
				Locator.FYPOA1(driver).click();
				Thread.sleep(3000);
				
				Locator.DOA(driver).click();
				Thread.sleep(1000);	
				Locator.DOA16(driver).click();
				Thread.sleep(3000);
				Locator.SaveSA(driver).click();
				Thread.sleep(3000);
				try {
				String Text =Locator.SaveMsgSA(driver).getText();
				Thread.sleep(1000);
				if(Text.equalsIgnoreCase("Saved Successfully.")) {
					test.log(LogStatus.PASS,Text );
					
				}else {
					test.log(LogStatus.FAIL,Text );
					
				}
				}catch(Exception e) {
					Thread.sleep(3000);
					String Text =Locator.SaveAEMsgSA(driver).getText();
					
					test.log(LogStatus.PASS,Text );
					Thread.sleep(3000);
				}
				Thread.sleep(3000);
				Locator.CloseSA(driver).click();
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SAAddNewAE(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.SAAddNew(driver).click();
				Thread.sleep(3000);
				
				Locator.SACategory(driver).click();
				Thread.sleep(1000);	
				Locator.SAAuditorFirm(driver).click();
				Thread.sleep(3000);
				
				Locator.SAauditorfirmName(driver).click();
				Thread.sleep(1000);	
				Locator.SAauditorfirmNameLi(driver).click();
				Thread.sleep(3000);
				
				sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
				int row = 0;
				Thread.sleep(500);
				Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
				Cell c1 = null;
				
				
				row0 = sheet.getRow(54);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				Locator.Certificate_of_Practice(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(2000);
	
				Locator.FYPOA(driver).click();
				Thread.sleep(1000);	
				Locator.FYPOA1(driver).click();
				Thread.sleep(3000);
				
				Locator.DOA(driver).click();
				Thread.sleep(1000);	
				Locator.DOA16(driver).click();
				Thread.sleep(3000);
				Locator.SaveSA(driver).click();
				Thread.sleep(3000);
				try {
				String Text =Locator.SaveMsgSA(driver).getText();
				Thread.sleep(1000);
				if(Text.equalsIgnoreCase("Saved Successfully.")) {
					test.log(LogStatus.PASS,Text );
					
				}else {
					test.log(LogStatus.FAIL,Text );
					
				}
				}catch(Exception e) {
					Thread.sleep(3000);
					String Text =Locator.SaveAEMsgSA(driver).getText();
					
					test.log(LogStatus.PASS,Text );
					Thread.sleep(3000);
				}
				Thread.sleep(3000);
				Locator.CloseSA(driver).click();
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	
	public static void SAAddNewTwoMan(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.SAAddNew(driver).click();
				Thread.sleep(3000);
				
				Locator.SACategory(driver).click();
				Thread.sleep(1000);	
				Locator.SAAuditorFirm(driver).click();
				Thread.sleep(3000);
				
				Locator.SAauditorfirmName(driver).click();
				Thread.sleep(1000);	
				Locator.SAauditorfirmNameLi(driver).click();
				Thread.sleep(3000);
				
				Locator.SaveSA(driver).click();
				Thread.sleep(3000);
			
				String Text =Locator.DOAVal(driver).getText();
				Thread.sleep(1000);
				
					test.log(LogStatus.PASS,"Message Displayed : -"+Text );
					
				
			
				Thread.sleep(3000);
				Locator.CloseSA(driver).click();
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SAAddNewEmpty(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.SAAddNew(driver).click();
				Thread.sleep(3000);
				
			
				Locator.SaveSA(driver).click();
				Thread.sleep(3000);
			
				String Text =Locator.DOAVal(driver).getText();
				Thread.sleep(2000);
				String Text1 =Locator.CategoryVal(driver).getText();
				Thread.sleep(1000);
				
					test.log(LogStatus.PASS,"Message Displayed : -"+Text +" ,"+Text1);
					
				
			
				Thread.sleep(3000);
				Locator.CloseSA(driver).click();
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SAAddNewClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.SAAddNew(driver).click();
				Thread.sleep(3000);
				
			
				if(Locator.CloseSA(driver).isEnabled()) {
					Locator.CloseSA(driver).click();
					Thread.sleep(3000);
					   test.log(LogStatus.PASS,"Page  closed without saving data and the user should be redirected to the previous page." );
				}else {
					 test.log(LogStatus.PASS,"Page not closed without saving data and the user should be redirected to the previous page." );
				}	
				
				
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SAClearFilter(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.Status_All(driver).click();
				Thread.sleep(1000);
				Locator.Current(driver).click();
				Thread.sleep(3000);	
				
			
				if(Locator.ClearBtn(driver).isEnabled()) {
					Locator.ClearBtn(driver).click();
					Thread.sleep(3000);
					   test.log(LogStatus.PASS,"The system  remove status filter applied After Clicking On Clear Button" );
				}else {
					 test.log(LogStatus.PASS,"The system not remove status filter applied After Clicking On Clear Button" );
				}	
				
				
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SAEditClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.Edit(driver).click();
				Thread.sleep(3000);
				
			
				if(Locator.CloseSA(driver).isEnabled()) {
					Locator.CloseSA(driver).click();
					Thread.sleep(3000);
					   test.log(LogStatus.PASS,"Page  closed without saving data and the user should be redirected to the previous page." );
				}else {
					 test.log(LogStatus.PASS,"Page not closed without saving data and the user should be redirected to the previous page." );
				}	
				
				
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ResignationofAuditor(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.ResignationofAuditor(driver).click();
				Thread.sleep(3000);
				Locator.LeaveType(driver).click();
				Thread.sleep(1000);
				
				Locator.Resignation(driver).click();
				Thread.sleep(3000);
			
				Locator.Dateofsubmission(driver).click();
				Thread.sleep(1000);	
				Locator.DOA16(driver).click();
				Thread.sleep(3000);
				
				Locator.Dated(driver).click();
				Thread.sleep(1000);	
				Locator.Dated20(driver).click();
				Thread.sleep(3000);
				
				
				Locator.Reason(driver).sendKeys("xyz"); // Writing Task title
				Thread.sleep(2000);
				
				Locator.ChooseFileRA(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Department1.html"); // Writing Task title
				Thread.sleep(2000);
				Locator.SaveRA(driver).click();
				Thread.sleep(3000);
				
				
				String Text =Locator.SaveMsgRA(driver).getText();
				Thread.sleep(1000);
				if(Text.equalsIgnoreCase("Saved Successfully.")) {
					test.log(LogStatus.PASS,Text );
					
				}else {
					test.log(LogStatus.FAIL,Text );
					
				}
				Locator.Cancel(driver).click();
				Thread.sleep(3000);
				Locator.CloseRA(driver).click();
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ResignationofAuditorEmpty(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.ResignationofAuditor(driver).click();
				Thread.sleep(3000);
				
				
				
				
				Locator.SaveRA(driver).click();
				Thread.sleep(3000);
				
				
				String Text =Locator.LeaveVal(driver).getText();
				Thread.sleep(1000);
				String Text1 =Locator.DatedVal(driver).getText();
				Thread.sleep(1000);
				
					test.log(LogStatus.PASS,"Message Displayed : -"+Text +" ,"+Text1);
					
					Thread.sleep(3000);
				
				Locator.CloseRA(driver).click();
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ResignationofAuditorCancel(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.ResignationofAuditor(driver).click();
				Thread.sleep(3000);
				Locator.LeaveType(driver).click();
				Thread.sleep(1000);
				
				Locator.Resignation(driver).click();
				Thread.sleep(3000);
			
				Locator.Dateofsubmission(driver).click();
				Thread.sleep(1000);	
				Locator.DOA16(driver).click();
				Thread.sleep(3000);
				
				Locator.Dated(driver).click();
				Thread.sleep(1000);	
				Locator.Dated20(driver).click();
				Thread.sleep(3000);
				
				
				Locator.Reason(driver).sendKeys("xyz"); // Writing Task title
				Thread.sleep(2000);
				
				Locator.ChooseFileRA(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Department1.html"); // Writing Task title
				Thread.sleep(2000);
				Locator.SaveRA(driver).click();
				Thread.sleep(3000);
				
				
				
				if(Locator.Cancel(driver).isEnabled()) {
				Locator.Cancel(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS," resignation cancellation has been successful but No Message Displayed ");
				}else {
					test.log(LogStatus.FAIL," resignation not cancel ");
				}
				
				Locator.CloseRA(driver).click();
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ResignationofAuditorClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.SecretarialAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.ResignationofAuditor(driver).click();
				Thread.sleep(3000);
				
				
				if(Locator.CloseRA(driver).isEnabled()) {
				Locator.CloseRA(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS," Clicking on Close - The user is redirected to the previous page ");
				}else {
					test.log(LogStatus.FAIL," Clicking on Close - The user is not redirected to the previous page ");
				}
				
				
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void CostAuditor(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
			if(Locator.CostAuditor(driver).isEnabled()) {
				Locator.CostAuditor(driver).click();
				Thread.sleep(3000);
				   test.log(LogStatus.PASS,"TThe system  navigate to the Cost Auditor page" );
			}else {
				 test.log(LogStatus.PASS,"The system  not navigate to the Cost Auditor page" );
			}	
			Thread.sleep(2000);
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void CostAuditorAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
			
				Locator.CostAuditor(driver).click();
			Thread.sleep(2000);
			
			Locator.CostAuditorNew(driver).click();
			Thread.sleep(2000);
			
			Locator.NatureofIntimation(driver).click();
			Thread.sleep(2000);
			Locator.Originalappointment(driver).click();
			Thread.sleep(2000);
			
			Locator.CategoryCA(driver).click();
			Thread.sleep(2000);
			Locator.IndividualCA(driver).click();
			Thread.sleep(2000);
			
			Locator.AuditorName(driver).click();
			Thread.sleep(2000);
			Locator.AuditorName1(driver).click();
			Thread.sleep(2000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(56);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameoftheCostauditor(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator.Dateboardmeeting(driver).click();
			Thread.sleep(2000);
			Locator.Dateboardmeeting15(driver).click();
			Thread.sleep(2000);
			
			row0 = sheet.getRow(57);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			int No = (int) c1.getNumericCellValue();
			Locator.ResulationNumber(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			Locator.FYNo(driver).click();
			Thread.sleep(2000);
			Locator.FYNo2223(driver).click();
			Thread.sleep(2000);
			
			Locator.SaveCA(driver).click();
			Thread.sleep(2000);
	String Msg=		Locator.SaveMsgCA(driver).getText();
			if(Msg.equalsIgnoreCase("Saved Successfully.")) {
				
				 test.log(LogStatus.PASS,"Message Displayed : -"+Msg );
			}else {
				 test.log(LogStatus.FAIL,"Message Displayed : -"+Msg );
			}
			Thread.sleep(2000);
			Locator.CloseCA(driver).click();
			Thread.sleep(2000);
			
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void CostAuditorAddNewED(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
			
				Locator.CostAuditor(driver).click();
			Thread.sleep(2000);
			
			Locator.CostAuditorNew(driver).click();
			Thread.sleep(2000);
			
			Locator.NatureofIntimation(driver).click();
			Thread.sleep(2000);
			Locator.Originalappointment(driver).click();
			Thread.sleep(2000);
			
			Locator.CategoryCA(driver).click();
			Thread.sleep(2000);
			Locator.AuditorCA(driver).click();
			Thread.sleep(2000);
			
			Locator.AuditorName(driver).click();
			Thread.sleep(2000);
			Locator.AuditorName2(driver).click();
			Thread.sleep(2000);
			
			sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
			int row = 0;
			Thread.sleep(500);
			Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
			Cell c1 = null;
			
			
			row0 = sheet.getRow(56);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameoftheCostauditor(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator.Dateboardmeeting(driver).click();
			Thread.sleep(2000);
			Locator.Dateboardmeeting15(driver).click();
			Thread.sleep(2000);
			
			row0 = sheet.getRow(57);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			int No = (int) c1.getNumericCellValue();
			Locator.ResulationNumber(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			Locator.FYNo(driver).click();
			Thread.sleep(2000);
			Locator.FYNo2223(driver).click();
			Thread.sleep(2000);
			
			Locator.SaveCA(driver).click();
			Thread.sleep(2000);
			try {
	String Msg=		Locator.SaveMsgCA(driver).getText();
			if(Msg.equalsIgnoreCase("Saved Successfully.")) {
				
				 test.log(LogStatus.PASS,"Message Displayed : -"+Msg );
			}else {
				 test.log(LogStatus.FAIL,"Message Displayed : -"+Msg );
			}
			Thread.sleep(2000);
			}catch(Exception e) {
				
				String Msg=		Locator.SaveMsgCA1(driver).getText();
				 test.log(LogStatus.PASS,"Message Displayed : -"+Msg );
				
			}
			Locator.CloseCA(driver).click();
			Thread.sleep(2000);
			
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void CostAuditorAddNewTwoMan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
			
				Locator.CostAuditor(driver).click();
			Thread.sleep(2000);
			
			Locator.CostAuditorNew(driver).click();
			Thread.sleep(2000);
			
			Locator.NatureofIntimation(driver).click();
			Thread.sleep(2000);
			Locator.Originalappointment(driver).click();
			Thread.sleep(2000);
			
			Locator.CategoryCA(driver).click();
			Thread.sleep(2000);
			Locator.AuditorCA(driver).click();
			Thread.sleep(2000);
			
		
			Locator.SaveCA(driver).click();
			Thread.sleep(2000);
			
	String Msg=	Locator.AuditorNameVal(driver).getText();
	Thread.sleep(2000);
	String Msg1=Locator.LLPVal(driver).getText();
			
				
				 test.log(LogStatus.PASS,"Message Displayed : -"+Msg +" ,"+Msg1);
			
			Thread.sleep(2000);
			
			Locator.CloseCA(driver).click();
			Thread.sleep(2000);
			
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void CostAuditorAddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
			
				Locator.CostAuditor(driver).click();
			Thread.sleep(2000);
			
			Locator.CostAuditorNew(driver).click();
			Thread.sleep(2000);
			
			
			Locator.SaveCA(driver).click();
			Thread.sleep(2000);
			
	String Msg=	Locator.AuditorNameVal(driver).getText();
	Thread.sleep(2000);
	String Msg1=Locator.LLPVal(driver).getText();
	Thread.sleep(2000);
	String Msg2=Locator.NatureIntimationVal(driver).getText();
	Thread.sleep(2000);
				
				 test.log(LogStatus.PASS,"Message Displayed : -"+Msg +" ,"+Msg1+" ,"+Msg2);
			
			Thread.sleep(2000);
			
			Locator.CloseCA(driver).click();
			Thread.sleep(2000);
			
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void CAAddNewClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.CostAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.CostAuditorNew(driver).click();
				Thread.sleep(3000);
				
			
				if(Locator.CloseCA(driver).isEnabled()) {
					Locator.CloseCA(driver).click();
					Thread.sleep(3000);
					   test.log(LogStatus.PASS,"Page  closed without saving data and the user should be redirected to the previous page." );
				}else {
					 test.log(LogStatus.PASS,"Page not closed without saving data and the user should be redirected to the previous page." );
				}	
				
				
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void CAClearFilter(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.CostAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.Status_All4(driver).click();
				Thread.sleep(1000);
				Locator.Current4(driver).click();
				Thread.sleep(3000);	
				
			
				if(Locator.ClearBtn4(driver).isEnabled()) {
					Locator.ClearBtn4(driver).click();
					Thread.sleep(3000);
					   test.log(LogStatus.PASS,"The system  remove status filter applied After Clicking On Clear Button" );
				}else {
					 test.log(LogStatus.PASS,"The system not remove status filter applied After Clicking On Clear Button" );
				}	
				
				
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void CAEditClose(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.CostAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.EditCA(driver).click();
				Thread.sleep(4000);
				
				if(Locator.CloseCA(driver).isEnabled()) {
					Locator.CloseCA(driver).click();
					Thread.sleep(3000);
					   test.log(LogStatus.PASS,"Page  closed without saving data and the user should be redirected to the previous page." );
				}else {
					 test.log(LogStatus.PASS,"Page not closed without saving data and the user should be redirected to the previous page." );
				}	
				
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ResignationofAuditorCA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.CostAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.ResignationofAuditorCA(driver).click();
				Thread.sleep(3000);
				Locator.LeaveType(driver).click();
				Thread.sleep(1000);
				
				Locator.Resignation(driver).click();
				Thread.sleep(3000);
			
				Locator.Dateofsubmission(driver).click();
				Thread.sleep(1000);	
				Locator.DOA16(driver).click();
				Thread.sleep(3000);
				
				Locator.Dated(driver).click();
				Thread.sleep(1000);	
				Locator.Dated20(driver).click();
				Thread.sleep(3000);
				
				
				Locator.Reason(driver).sendKeys("xyz"); // Writing Task title
				Thread.sleep(2000);
				
				Locator.ChooseFileRA(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Department1.html"); // Writing Task title
				Thread.sleep(2000);
				Locator.SaveRA(driver).click();
				Thread.sleep(3000);
				
				
				String Text =Locator.SaveMsgRA(driver).getText();
				Thread.sleep(1000);
				if(Text.equalsIgnoreCase("Saved Successfully.")) {
					test.log(LogStatus.PASS,Text );
					
				}else {
					test.log(LogStatus.FAIL,Text );
					
				}
				Locator.Cancel(driver).click();
				Thread.sleep(3000);
				Locator.CloseRA(driver).click();
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ResignationofAuditorEmptyCA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.CostAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.ResignationofAuditorCA(driver).click();
				Thread.sleep(3000);
				
				Locator.SaveRA(driver).click();
				Thread.sleep(3000);
				
				
				String Text =Locator.LeaveVal(driver).getText();
				Thread.sleep(1000);
				String Text1 =Locator.DatedVal(driver).getText();
				Thread.sleep(1000);
				
					test.log(LogStatus.PASS,"Message Displayed : -"+Text +" ,"+Text1);
					
					Thread.sleep(3000);
				
				Locator.CloseRA(driver).click();
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ResignationofAuditorCancelCA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.CostAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.ResignationofAuditorCA(driver).click();
				Thread.sleep(3000);
				Locator.LeaveType(driver).click();
				Thread.sleep(1000);
				
				Locator.Resignation(driver).click();
				Thread.sleep(3000);
			
				Locator.Dateofsubmission(driver).click();
				Thread.sleep(1000);	
				Locator.DOA16(driver).click();
				Thread.sleep(3000);
				
				Locator.Dated(driver).click();
				Thread.sleep(1000);	
				Locator.Dated20(driver).click();
				Thread.sleep(3000);
				
				
				Locator.Reason(driver).sendKeys("xyz"); // Writing Task title
				Thread.sleep(2000);
				
				Locator.ChooseFileRA(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Department1.html"); // Writing Task title
				Thread.sleep(2000);
				Locator.SaveRA(driver).click();
				Thread.sleep(3000);
				
				
				
				if(Locator.Cancel(driver).isEnabled()) {
				Locator.Cancel(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS," resignation cancellation has been successful but No Message Displayed ");
				}else {
					test.log(LogStatus.FAIL," resignation not cancel ");
				}
				
				Locator.CloseRA(driver).click();
				Thread.sleep(3000);
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ResignationofAuditorCloseCA(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			Locator.Auditors(driver).click();
			Thread.sleep(3000);
				Locator.CostAuditor(driver).click();
				Thread.sleep(3000);
				
				Locator.ResignationofAuditorCA(driver).click();
				Thread.sleep(3000);
				
				
				if(Locator.CloseRA(driver).isEnabled()) {
				Locator.CloseRA(driver).click();
				Thread.sleep(3000);
				test.log(LogStatus.PASS," Clicking on Close - The user is redirected to the previous page ");
				}else {
					test.log(LogStatus.FAIL," Clicking on Close - The user is not redirected to the previous page ");
				}
				
				
				
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void StatutoryRegisters(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
		
			
			if(Locator.StatutoryRegisters(driver).isEnabled()) {
				Locator.StatutoryRegisters(driver).click();
				Thread.sleep(3000);
				   test.log(LogStatus.PASS,"User redirected to the new window of 'Statutory Register' page" );
			}else {
				 test.log(LogStatus.PASS,"User should be redirected to the new window of 'Statutory Register' page" );
			}	
			Thread.sleep(2000);
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRDEPOSIT(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
			if(Locator.SRDEPOSIT(driver).isEnabled()) {
				Locator.SRDEPOSIT(driver).click();
				Thread.sleep(3000);
				   test.log(LogStatus.PASS,"UThe user should redirected to the 'Deposite' page" );
			}else {
				 test.log(LogStatus.PASS,"The user should redirected to the 'Deposite' page" );
			}	
			Thread.sleep(2000);
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRDEPOSITAddnew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRDEPOSIT(driver).click();		
	Thread.sleep(5000);
	Locator.SRDEPOSITAN(driver).click();		
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(59);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOfDepositor(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(60);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressOfDepositor(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(61);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.PANofDepositor(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(62);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ParticularsOfGuardian(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(63);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ParticularOfNominee(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(64);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.Depositreceiptno(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	Locator.DateOfeachdeposit(driver).click();		
	Thread.sleep(2000);
	Locator.DateOfeachdeposit13(driver).click();		
	Thread.sleep(3000);
	
	row0 = sheet.getRow(65);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.AmtOfeachDeposit(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(66);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 Locator.DurationOfdeposit(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.DateOfdepositrepayable(driver).click();		
		Thread.sleep(2000);
		Locator.DateOfdepositrepayable15(driver).click();		
		Thread.sleep(3000);
		
		row0 = sheet.getRow(67);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		 No = (int) c1.getNumericCellValue();
		Locator.RateOfInterest(driver).sendKeys("" + No + ""); // Writing Task title
		Thread.sleep(4000);
		
		Locator.DuedateforPayment(driver).click();		
		Thread.sleep(2000);
		Locator.DuedateforPayment20(driver).click();		
		Thread.sleep(3000);
		
		row0 = sheet.getRow(68);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		 Locator.mandateandInstructions(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator.DateOfInterestmade(driver).click();		
			Thread.sleep(2000);
			Locator.DateOfInterestmade21(driver).click();		
			Thread.sleep(3000);
			
			row0 = sheet.getRow(69);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 Locator.DtlsOfDepositInsurance(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(2000);
				
				row0 = sheet.getRow(70);
				c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
				 No = (int) c1.getNumericCellValue();
					Locator.Particularsofseccharge(driver).sendKeys("" + No + ""); // Writing Task title
					Thread.sleep(4000);
				
					Locator.SaveSR(driver).click();
					Thread.sleep(2000);
					String Text =Locator.SaveMsgSR(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSR(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRDEPOSITEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRDEPOSIT(driver).click();		
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,500)");
	Thread.sleep(5000);
	Locator.EditDiposit(driver).click();		
	Thread.sleep(3000);
	Locator.EditDiposit(driver).click();		
	Thread.sleep(3000);
	Locator.NameOfDepositor(driver).clear();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(59);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOfDepositor(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	
				
					Locator.SaveSR(driver).click();
					Thread.sleep(2000);
					String Text =Locator.SaveMsgSR(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Updated Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSR(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	
	public static void SRDEPOSITAddnewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRDEPOSIT(driver).click();		
	Thread.sleep(5000);
	Locator.SRDEPOSITAN(driver).click();		
	Thread.sleep(3000);
	
					Locator.SaveSR(driver).click();
					Thread.sleep(2000);
					String Text =Locator.SaveMsgSR(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSR(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRDEPOSITAddNewInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRDEPOSIT(driver).click();		
	Thread.sleep(5000);
	Locator.SRDEPOSITAN(driver).click();		
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(59);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOfDepositor(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(60);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressOfDepositor(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(61);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.PANofDepositor(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(62);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ParticularsOfGuardian(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(63);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ParticularOfNominee(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(64);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.Depositreceiptno(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	Locator.DateOfeachdeposit(driver).click();		
	Thread.sleep(2000);
	Locator.DateOfeachdeposit13(driver).click();		
	Thread.sleep(3000);
	
	row0 = sheet.getRow(65);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.AmtOfeachDeposit(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(66);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 Locator.DurationOfdeposit(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
		Thread.sleep(2000);
		
		Locator.DateOfdepositrepayable(driver).click();		
		Thread.sleep(2000);
		Locator.DateOfdepositrepayable15(driver).click();		
		Thread.sleep(3000);
		
		row0 = sheet.getRow(67);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		 No = (int) c1.getNumericCellValue();
		Locator.RateOfInterest(driver).sendKeys("" + No + ""); // Writing Task title
		Thread.sleep(4000);
		
		Locator.DuedateforPayment(driver).click();		
		Thread.sleep(2000);
		Locator.DuedateforPayment20(driver).click();		
		Thread.sleep(3000);
		
		row0 = sheet.getRow(68);
		c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
		 Locator.mandateandInstructions(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator.DateOfInterestmade(driver).click();		
			Thread.sleep(2000);
			Locator.DateOfInterestmade21(driver).click();		
			Thread.sleep(3000);
			
			row0 = sheet.getRow(69);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 Locator.DtlsOfDepositInsurance(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
				Thread.sleep(2000);
				
				
					Locator.Particularsofseccharge(driver).sendKeys("aa"); // Writing Task title
					Thread.sleep(4000);
				
					Locator.SaveSR(driver).click();
					Thread.sleep(2000);
					String Text =Locator.InavlidMsg(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						
					Thread.sleep(2000);
					Locator.CloseSR(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRDEPOSITUpload(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRDEPOSIT(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRD(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRD(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_Deposit.xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRU(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRDEPOSITUploadInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRDEPOSIT(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRD(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRD(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_Deposit (1).xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					
					Thread.sleep(2000);
					Locator.CloseSRU(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRDEPOSITUploadEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRDEPOSIT(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRD(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRD(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_Deposit (2).xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRU(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRDEPOSITUploadInvalidEx(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRDEPOSIT(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRD(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRD(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("No Data Found in Excel Document or Sheet Name must be 'SH-2'")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRU(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRDEPOSITDwonGR(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRDEPOSIT(driver).click();		
	Thread.sleep(5000);
	
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

	Thread.sleep(500);
	Locator.GenerateRegister(driver).click();		//Exporting (Downloading) file

	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "Generate Register :-  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, " Generate Register : - File does not downloaded.");
	}

	
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH2(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
			if(Locator.SRSH2(driver).isEnabled()) {
				Locator.SRSH2(driver).click();
				Thread.sleep(3000);
				   test.log(LogStatus.PASS,"The user should redirected to the 'SH-2' page" );
			}else {
				 test.log(LogStatus.PASS,"The user should redirected to the 'SH-2' page" );
			}	
			Thread.sleep(2000);
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	
	public static void SRSH2AddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRSHAN(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(72);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.SRSHFolio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(73);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOftheGurantee(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.DateOfIssuedApproval(driver).click();		
	Thread.sleep(2000);
	Locator.DateOfeachdeposit13(driver).click();		
	Thread.sleep(3000); 
	
	Locator.ClassOfShares(driver).click();		
	Thread.sleep(2000);
	Locator.EquitySharesSH(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateOfIssueOriginal(driver).click();		
	Thread.sleep(2000);
	Locator.DuedateforPayment20(driver).click();		
	Thread.sleep(3000);
	
	row0 = sheet.getRow(74);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.CertificateNoSH(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
			Thread.sleep(2000);
			
			row0 = sheet.getRow(75);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.Tot_SharesHeld(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(76);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.DistinctiveFrom(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(77);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.DistinctiveTo(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			Locator.DateOfIssuedRenewed(driver).click();		
			Thread.sleep(2000);
			Locator.DateOfIssuedRenewed19(driver).click();		
			Thread.sleep(3000);
			row0 = sheet.getRow(78);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.ReasonforIssueRenewed(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			row0 = sheet.getRow(79);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.NoOfShareRenewed(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(80);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.Tot_SharesHeldIn(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(81);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.ReftoEntryInROM(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			row0 = sheet.getRow(82);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.Remarks(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
					
					Locator.SaveSH(driver).click();
					Thread.sleep(2000);
					
					String Text =Locator.SaveMsgSH(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSH(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH2AddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRSHAN(driver).click();
	Thread.sleep(3000);
	
	
			Thread.sleep(2000);
					
					Locator.SaveSH(driver).click();
					Thread.sleep(2000);
					
					String Text =Locator.SaveMsgSH(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSH(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH2Upload(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH2(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRSH(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormSH(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_SH-2.xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRSH(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH2UploadInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH2(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRSH(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormSH(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_SH-2 (1).xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					
					Thread.sleep(2000);
					Locator.CloseSRSH(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH2UploadEmptyFile(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH2(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRSH(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormSH(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_SH-2 (2).xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRSH(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH2UploadInValidEx(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH2(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRSH(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormSH(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("No Data Found in Excel Document or Sheet Name must be 'SH-2'")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRSH(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSh2DwonGR(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH2(driver).click();		
	Thread.sleep(5000);
	
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

	Thread.sleep(500);
	Locator.GenerateRegisterSH(driver).click();		//Exporting (Downloading) file

	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "Generate Register  :-  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, " Generate Register : - File does not downloaded.");
	}

	
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSh2Edit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH2(driver).click();		
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
//	js.executeScript("window.scrollBy(0,500)");
//	js.executeScript("document.querySelector(\"div[id='grid'] div[class='k-grid-content k-auto-scrollable']\").scrollLeft=5000");
	Locator.EditSH(driver).click();		
	Thread.sleep(5000);
	Locator.EditSH(driver).click();	
	Thread.sleep(5000);
	Locator.SRSHFolio_No(driver).clear();
	Thread.sleep(3000);
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(83);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.SRSHFolio_No(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.SaveSH(driver).click();
	Thread.sleep(2000);
	
	String Text =Locator.SaveMsgSH(driver).getText();
	Thread.sleep(2000);
	if(Text.equalsIgnoreCase("Record Updated Successfully")) {
		Thread.sleep(1000);
		test.log(LogStatus.PASS,  " Message displayed : -"+Text);
		Thread.sleep(2000);
	}else {
	
		test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
	}
	Thread.sleep(2000);
	Locator.CloseSH(driver).click();
	Thread.sleep(2000);
	
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH3(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
			if(Locator.SRSH3(driver).isEnabled()) {
				Locator.SRSH3(driver).click();
				Thread.sleep(3000);
				   test.log(LogStatus.PASS,"The user should redirected to the 'SH-3' page" );
			}else {
				 test.log(LogStatus.PASS,"The user should redirected to the 'SH-3' page" );
			}	
			Thread.sleep(2000);
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH3AddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH3(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRSH3AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(85);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.RefInROM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(86);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOfAllotee(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.StatusofAllottee(driver).click();		
	Thread.sleep(2000);
	Locator.Employee(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateOfPassBoardResolution(driver).click();		
	Thread.sleep(2000);
	Locator.DateOfPassBoardResolution1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateOfSpclResoltn(driver).click();		
	Thread.sleep(2000);
	Locator.DateOfSpclResoltn1(driver).click();		
	Thread.sleep(3000);
	
	Locator.DateOfIssue_EqShare(driver).click();		
	Thread.sleep(2000);
	Locator.DateOfIssue_EqShare1(driver).click();		
	Thread.sleep(3000);
	
	row0 = sheet.getRow(87);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.NoOfSwt_EqShare(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
			Thread.sleep(2000);
			
			row0 = sheet.getRow(88);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.CertificateORfolioNo(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(89);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.FaceValOfShare(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(90);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.PriceAtShareIssued(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(91);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.AmtOfPaidUp(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(92);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.Considertaion_Cash(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(93);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.ParticularsConsidertaion_Cash(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(94);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.LockinPeriod(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator.DateOfExpLockInPeriod(driver).click();		
			Thread.sleep(2000);
			Locator.DateOfExpLockInPeriod1(driver).click();		
			Thread.sleep(3000);
			
			
			row0 = sheet.getRow(95);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.RemarksSH3(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
			
			Locator.DateOfJoining(driver).click();		
			Thread.sleep(2000);
			Locator.DateOfExpLockInPeriod1(driver).click();		
			Thread.sleep(3000);
			
			row0 = sheet.getRow(96);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.FairValbyValuer(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(97);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			 No = (int) c1.getNumericCellValue();
			Locator.BasisOfValuation(driver).sendKeys("" + No + ""); // Writing Task title
			Thread.sleep(4000);
			
			row0 = sheet.getRow(98);
			c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
			Locator.NameOfValuer(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
			Thread.sleep(2000);
					//Done
					Locator.SaveSH3(driver).click();
					Thread.sleep(2000);
					
					String Text =Locator.SaveMsgSH3(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSH3(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH3AddNewInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH3(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRSH3AddNew(driver).click();
	Thread.sleep(3000);
	
			Locator.Dateofex(driver).sendKeys("07/06/");		
			Thread.sleep(2000);
	
					Locator.SaveSH3(driver).click();
					Thread.sleep(2000);
					
					String Text =Locator.DateofexVal(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					
					Thread.sleep(2000);
					Locator.CloseSH3(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH3AddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH3(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRSH3AddNew(driver).click();
	Thread.sleep(3000);
	
			
					Locator.SaveSH3(driver).click();
					Thread.sleep(2000);
					
					String Text =Locator.SaveMsgSH3(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Locator.CloseSH3(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH3Upload(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH3(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRSH3(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRDSH3(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_SH-3.xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRSH3(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH3UploadInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH3(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRSH3(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRDSH3(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_SH-3 (1).xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(3000);
				
					
					String Text =Locator.UploadMsgRDSH3(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					
					Thread.sleep(3000);
					Locator.CloseSRSH3(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH3UploadWithoutData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH3(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRSH3(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRDSH3(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_SH-3 (2).xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(5000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(3000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRSH3(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH3UploadInValidEx(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH3(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRSH3(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRDSH3(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("No Data Found in Excel Document or Sheet Name must be 'SH-3'")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRSH3(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSh3DwonGR(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH3(driver).click();		
	Thread.sleep(5000);
	
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

	Thread.sleep(500);
	Locator.GenerateRegisterSH3(driver).click();		//Exporting (Downloading) file

	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "Generate Register  :-  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, " Generate Register : - File does not downloaded.");
	}

	
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH3Edit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH3(driver).click();
	Thread.sleep(4000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");	
	Thread.sleep(5000);
				   
	Locator.EditSH3(driver).click();		
	Thread.sleep(5000);
	Locator.EditSH3(driver).click();	
	Thread.sleep(5000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	Locator.RefInROM(driver).clear();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(85);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.RefInROM(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	
					Locator.SaveSH3(driver).click();
					Thread.sleep(2000);
					
					String Text =Locator.SaveMsgSH3(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Updated Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSH3(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH3EditInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH3(driver).click();
	Thread.sleep(4000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");	
	Thread.sleep(5000);
				   
	Locator.EditSH3(driver).click();		
	Thread.sleep(5000);
	Locator.EditSH3(driver).click();	
	Thread.sleep(5000);
	
			Locator.Dateofex(driver).sendKeys("07/06/");		
			Thread.sleep(2000);
	
					Locator.SaveSH3(driver).click();
					Thread.sleep(2000);
					
					
					String Text =Locator.DateofexVal(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.SaveMsgSH3(driver).getText();
					Thread.sleep(2000);
					
				 if(Text.equalsIgnoreCase("07/06/ is an invalid date format")&&Text1.equalsIgnoreCase("Record Updated Successfully")) {
						test.log(LogStatus.FAIL,  " Along with Error validation message :-"+Text+" ,"+Text1+" message also displayed ");
					}else {
						test.log(LogStatus.PASS,  "  validation message :-"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSH3(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH6(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
			if(Locator.SRSH6(driver).isEnabled()) {
				Locator.SRSH6(driver).click();
				Thread.sleep(3000);
				   test.log(LogStatus.PASS,"The user should redirected to the 'SH-6' page" );
			}else {
				 test.log(LogStatus.PASS,"The user should redirected to the 'SH-6' page" );
			}	
			Thread.sleep(2000);
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH6AddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH6(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRSH6AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(100);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOfGrantee(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(101);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.NoOfOptGranted(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
			Thread.sleep(2000);
	
	Locator.DateOnOptVested(driver).click();		
	Thread.sleep(2000);
	Locator.DateOnOptVested1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(102);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ExercisedPeriod(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.DateOnOptExercised(driver).click();		
	Thread.sleep(2000);
	Locator.DateOnOptExercised1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(103);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.OptExercised(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(104);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.ExercisePrice(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(105);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.NoOfSharesArise(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(106);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.Folio_No(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(107);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.LockInPeriod(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(108);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.OptionLapsed(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(109);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.NoOfOptInForce(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(110);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.AmtRefunded(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(111);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.VariationOfTerms_Effects(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(112);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Signature(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(113);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.RemarksSH6(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(4000);
	
					Locator.SaveSH6(driver).click();
					Thread.sleep(3000);
					
					String Text =Locator.SaveMsgSH6(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSH6(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH6AddNewInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH6(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRSH6AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	row0 = sheet.getRow(100);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOfGrantee(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	
	Locator.NoOfOptGranted(driver).sendKeys("e"); // Writing Task title
	Thread.sleep(4000);
			Thread.sleep(2000);
	
	Locator.DateOnOptVested2(driver).sendKeys("01/06/");		
	Thread.sleep(2000);
	
	
	row0 = sheet.getRow(102);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ExercisedPeriod(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	Locator.DateOnOptExercised2(driver).sendKeys("02/06");		
	Thread.sleep(2000);
	
	
	row0 = sheet.getRow(103);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.OptExercised(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	
	Locator.ExercisePrice(driver).sendKeys("d"); // Writing Task title
	Thread.sleep(4000);
	
	
	Locator.NoOfSharesArise(driver).sendKeys("s"); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(106);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.Folio_No(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(107);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.LockInPeriod(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(108);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.OptionLapsed(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	
	Locator.NoOfOptInForce(driver).sendKeys("s"); // Writing Task title
	Thread.sleep(4000);
	
	
	Locator.AmtRefunded(driver).sendKeys("s"); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(111);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.VariationOfTerms_Effects(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(112);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Signature(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(113);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.RemarksSH6(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
					Locator.SaveSH6(driver).click();
					Thread.sleep(2000);
					
					String Text =Locator.NoOfOptGrantedVal(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.DateOnOptVestedVal(driver).getText();
					Thread.sleep(2000);
					String Text2 =Locator.DateOnOptExercisedVal(driver).getText();
					Thread.sleep(2000);
					String Text3 =Locator.ExercisePriceVal(driver).getText();
					Thread.sleep(2000);
					String Text4 =Locator.NoOfSharesAriseVal(driver).getText();
					Thread.sleep(2000);
					String Text5 =Locator.NoOfOptInForceVal(driver).getText();
					Thread.sleep(2000);
					String Text6 =Locator.AmtRefundedVal(driver).getText();
					Thread.sleep(2000);
					
		test.log(LogStatus.PASS,  "Validation Message displayed : -"+Text+" ,"+Text1+" ,"+Text2+" ,"+Text3+" ,"+Text4+" ,"+Text5+" ,"+Text6);
					
					Thread.sleep(2000);
					Locator.CloseSH6(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH6AddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH6(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRSH6AddNew(driver).click();
	Thread.sleep(3000);
	
	
	
					Locator.SaveSH6(driver).click();
					Thread.sleep(2000);
					
					String Text =Locator.SaveMsgSH6(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseSH6(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH6Upload(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH6(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRSH6(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRDSH6(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_SH-6.xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("1 Records saved successfully.")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRSH6(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH6UploadInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH6(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRSH6(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRDSH6(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_SH-6 (1).xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(3000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					
					Thread.sleep(3000);
					Locator.CloseSRSH6(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH6UploadInValidEx(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH6(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRSH6(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRDSH6(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgRD(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("No Data Found in Excel Document or Sheet Name must be 'SH-6'")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRSH6(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSh6DwonGR(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRSH6(driver).click();		
	Thread.sleep(5000);
	
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

	Thread.sleep(500);
	Locator.GenerateRegisterSH6(driver).click();		//Exporting (Downloading) file

	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "Generate Register  :-  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, " Generate Register : - File does not downloaded.");
	}

	
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH6Edit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH6(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");	
	Thread.sleep(5000);   
	Locator.EditSH6(driver).click();
	Thread.sleep(3000);
	Locator.EditSH6(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.NameOfGrantee(driver).clear();
	Thread.sleep(3000);
	
	row0 = sheet.getRow(100);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOfGrantee(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	

	
					Locator.SaveSH6(driver).click();
					Thread.sleep(2000);
					
					String Text =Locator.SaveMsgSH6(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Updated Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSH6(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRSH6EditInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRSH6(driver).click();
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");	
	Thread.sleep(5000);
	Locator.EditSH6(driver).click();
	Thread.sleep(3000);
	Locator.EditSH6(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	Locator.NoOfOptGranted(driver).clear();
	
	Locator.NoOfOptGranted(driver).sendKeys("e"); // Writing Task title
	Thread.sleep(4000);
			Thread.sleep(2000);
	
			Locator.DateOnOptVested2(driver).clear();
			Thread.sleep(2000);
	Locator.DateOnOptVested2(driver).sendKeys("01/06/");		
	Thread.sleep(2000);
	
	
	Locator.DateOnOptExercised2(driver).clear();
	Thread.sleep(2000);
	
	Locator.DateOnOptExercised2(driver).sendKeys("02/06");		
	Thread.sleep(2000);
	
	
	Locator.ExercisePrice(driver).clear();
	Thread.sleep(2000);
	
	
	Locator.ExercisePrice(driver).sendKeys("d"); // Writing Task title
	Thread.sleep(4000);
	Locator.NoOfSharesArise(driver).clear();
	Thread.sleep(2000);
	
	Locator.NoOfSharesArise(driver).sendKeys("s"); // Writing Task title
	Thread.sleep(4000);
	
	Locator.NoOfOptInForce(driver).clear();
	Thread.sleep(2000);
	Locator.NoOfOptInForce(driver).sendKeys("s"); // Writing Task title
	Thread.sleep(4000);
	
	Locator.AmtRefunded(driver).clear();
	Thread.sleep(2000);
	Locator.AmtRefunded(driver).sendKeys("s"); // Writing Task title
	Thread.sleep(4000);
	
	
					Locator.SaveSH6(driver).click();
					Thread.sleep(2000);
					
					String Text =Locator.NoOfOptGrantedVal(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.DateOnOptVestedVal(driver).getText();
					Thread.sleep(2000);
					String Text2 =Locator.DateOnOptExercisedVal(driver).getText();
					Thread.sleep(2000);
					String Text3 =Locator.ExercisePriceVal(driver).getText();
					Thread.sleep(2000);
					String Text4 =Locator.NoOfSharesAriseVal(driver).getText();
					Thread.sleep(2000);
					String Text5 =Locator.NoOfOptInForceVal(driver).getText();
					Thread.sleep(2000);
					String Text6 =Locator.AmtRefundedVal(driver).getText();
					Thread.sleep(2000);
					
		test.log(LogStatus.PASS,  "Validation Message displayed : -"+Text+" ,"+Text1+" ,"+Text2+" ,"+Text3+" ,"+Text4+" ,"+Text5+" ,"+Text6);
					
					Thread.sleep(2000);
					Locator.CloseSH6(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
			if(Locator.SRCHG7(driver).isEnabled()) {
				Locator.SRCHG7(driver).click();
				Thread.sleep(3000);
				   test.log(LogStatus.PASS,"The user should redirected to the 'CHG-7' page" );
			}else {
				 test.log(LogStatus.PASS,"The user should redirected to the 'CHG-7' page" );
			}	
			Thread.sleep(2000);
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7AddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRCHG7AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(115);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.ChargeId(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	Locator.ChargeType(driver).click();		
	Thread.sleep(2000);
	Locator.ChargeType1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.CreationDate(driver).click();		
	Thread.sleep(2000);
	Locator.CreationDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.RegistrationChargeCreateDate(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(116);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ShortDescPropertyCharged(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(117);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.PeriodInMonth(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(118);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.ChargeAmount(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(119);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NamesOfChargeholder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(120);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressOfChargeHolder(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(121);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.TermsconditionsOfcharge(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(122);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Descinstrument(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.ModificationDate(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.RegistrationChargeModificationDate(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeModificationDate1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(123);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Descinstrumentchargemodify(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.SatisfactionDate(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeModificationDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.RegistrationsatisfactionDate(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationsatisfactionDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.FactsDelaycondonationDate(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationsatisfactionDate1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(124);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Particularsmodification(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(125);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Reasonsdelayfiling(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(5000);
	jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(5000);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='frmNewChargeDetails']/div[2]/div/div/lable")));
	Thread.sleep(5000);
					String Text =Locator.SaveCHGMsg(driver).getText();
					Thread.sleep(4000);
					if(Text.equalsIgnoreCase("Charge Details Uploaded Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseCHG(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7AddNewInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRCHG7AddNew(driver).click();
	Thread.sleep(3000);
	
	Locator.ChargeId(driver).sendKeys("w"); // Writing Task title
	Thread.sleep(4000);
	Locator.CreationDate(driver).click();		
	Thread.sleep(2000);
	Locator.CreationDate1(driver).click();		
	Thread.sleep(3000); 
	

	Locator.RegistrationChargeCreateDate11(driver).sendKeys("01/06/");		
	Thread.sleep(3000); 
	
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.ChargeIdVal(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.RegistrationChargeCreateDateVal(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text+" ,"+Text1);
						
					Thread.sleep(2000);
					Locator.CloseCHG(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7AddnewTwoman(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRCHG7AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	row0 = sheet.getRow(115);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.ChargeId(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	Locator.ChargeType(driver).click();		
	Thread.sleep(2000);
	Locator.ChargeType1(driver).click();		
	Thread.sleep(3000); 
	
	
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.CreationDate_validationMessage(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.RegistrationChargeCreateDateVal1(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text+" ,"+Text1);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseCHG(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7AddnewEmptyFields(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRCHG7AddNew(driver).click();
	Thread.sleep(3000);
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.CreationDate_validationMessage(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.RegistrationChargeCreateDateVal1(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text+" ,"+Text1);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseCHG(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7Upload(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRCHG7(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRChG7(driver).click();		
	Thread.sleep(5000);
By locator1 = By.xpath("//*[@class='k-radio-label']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	Thread.sleep(4000);
//	Locator.ExcelCheckBox(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRDChg(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Charge.xlsx");		
	Thread.sleep(3000);
	Locator.UploadCHG(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMSgCHG(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Charge Details Uploaded Successfully")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseChg7(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7UploadInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRCHG7(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRChG7(driver).click();		
	Thread.sleep(5000);
By locator1 = By.xpath("//*[@class='k-radio-label']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	Thread.sleep(4000);
//	Locator.ExcelCheckBox(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRDChg(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Charge (1).xlsx");		
	Thread.sleep(3000);
	Locator.UploadCHG(driver).click();		
	Thread.sleep(2000);
					
					String Text =Locator.UploadMSgCHG(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Charge Details Uploaded Successfully")) {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseChg7(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7UploadEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRCHG7(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRChG7(driver).click();		
	Thread.sleep(5000);
By locator1 = By.xpath("//*[@class='k-radio-label']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	Thread.sleep(4000);
//	Locator.ExcelCheckBox(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRDChg(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Charge (2).xlsx");		
	Thread.sleep(3000);
	Locator.UploadCHG(driver).click();		
	Thread.sleep(2000);
				
					try {
					String Text =Locator.UploadMSgCHG(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Charge Details Uploaded Successfully")) {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					}catch(Exception e) {
						test.log(LogStatus.FAIL,  "no  Message displayed ");
					}
					Thread.sleep(2000);
					Locator.CloseChg7(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7UploadInvalidFormat(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRCHG7(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRChG7(driver).click();		
	Thread.sleep(5000);
By locator1 = By.xpath("//*[@class='k-radio-label']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator1));
	Thread.sleep(4000);
	
	WebElement ViewButton1 = driver.findElement(locator1);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton1);
	Thread.sleep(4000);
//	Locator.ExcelCheckBox(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormRDChg(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");		
	Thread.sleep(3000);
	Locator.UploadCHG(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMSgCHG(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("No Data Found in Excel Document or Sheet Name must be 'ChargeSheet'")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseChg7(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7UploadwithOutFile(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRCHG7(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRChG7(driver).click();		
	Thread.sleep(5000);

	Locator.UploadCHG(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMSgCHG1(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					
					Thread.sleep(2000);
					Locator.CloseChg7(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7DwonGR(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRCHG7(driver).click();		
	Thread.sleep(5000);
	
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

	Thread.sleep(500);
	Locator.GenerateRegisterCHG7(driver).click();		//Exporting (Downloading) file

	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "Generate Register  :-  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, " Generate Register : - File does not downloaded.");
	}

	
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ChargeDetailsAddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.ViewCHG7(driver).click();
	Thread.sleep(3000);
	
	Locator.ViewANCHG7(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	Locator.ChargeTypeCHG7(driver).click();		
	Thread.sleep(2000);
	Locator.ChargeTypeCHG71(driver).click();		
	Thread.sleep(3000); 
	
	Locator.CreationDate_dateview(driver).click();		
	Thread.sleep(2000);
	Locator.CreationDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.RegistrationChargeCreateDate_dateview(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(127);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ShortDescPropertyCharged1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(128);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.PeriodInMonth1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(118);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
int	 No = (int) c1.getNumericCellValue();
	Locator.ChargeAmountNumeric(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(119);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NamesOfChargeholder1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(120);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressOfChargeHolder1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(121);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.TermsconditionsOfcharge1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(122);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Descinstrument1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.ModificationDate1(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.RegistrationChargeModificationDate2(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeModificationDate1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(123);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Descinstrumentchargemodify1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.SatisfactionDate(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeModificationDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.RegistrationsatisfactionDate(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationsatisfactionDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.FactsDelaycondonationDate(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationsatisfactionDate1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(124);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Particularsmodification(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(125);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Reasonsdelayfiling(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveCHGMsg1(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(4000);
					Locator.CloseCHG(driver).click();
					Thread.sleep(4000);
					Locator.CloseCHGView(driver).click();
					Thread.sleep(4000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7ViewAddNewInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.ViewCHG7(driver).click();
	Thread.sleep(3000);
	
	Locator.ViewANCHG7(driver).click();
	Thread.sleep(3000);
	Locator.CreationDate_dateview(driver).click();		
	Thread.sleep(2000);
	Locator.CreationDate1(driver).click();		
	Thread.sleep(3000); 
	

	Locator.RegistrationChargeCreateDate11(driver).sendKeys("01/06/");		
	Thread.sleep(3000); 
	
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					
					String Text1 =Locator.RegistrationChargeCreateDateVal2(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text1);
						
					Thread.sleep(5000);
					Locator.CloseCHG(driver).click();
					Thread.sleep(4000);
					Locator.CloseCHGView(driver).click();
					Thread.sleep(4000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ChargeDetailsAddNewtwoMan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.ViewCHG7(driver).click();
	Thread.sleep(3000);
	
	Locator.ViewANCHG7(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.ChargeTypeCHG7(driver).click();		
	Thread.sleep(2000);
	Locator.ChargeTypeCHG71(driver).click();		
	Thread.sleep(3000); 
	
	
	row0 = sheet.getRow(127);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ShortDescPropertyCharged1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
	String Text1 =Locator.CreationDate_validationMessage(driver).getText();
	Thread.sleep(2000);
	
String Text =Locator.RegistrationChargeCreateDateVal1(driver).getText();
Thread.sleep(2000);

	
		test.log(LogStatus.PASS,  " Message displayed : -"+Text1+" ,"+Text);
		
					Thread.sleep(4000);
					Locator.CloseCHG(driver).click();
					Thread.sleep(4000);
					Locator.CloseCHGView(driver).click();
					Thread.sleep(4000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ChargeDetailsAddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.ViewCHG7(driver).click();
	Thread.sleep(3000);
	
	Locator.ViewANCHG7(driver).click();
	Thread.sleep(4000);
	
	
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
	String Text1 =Locator.CreationDate_validationMessage(driver).getText();
	Thread.sleep(2000);
	
String Text =Locator.RegistrationChargeCreateDateVal1(driver).getText();
Thread.sleep(2000);

	
		test.log(LogStatus.PASS,  " Message displayed : -"+Text1+" ,"+Text);
		
					Thread.sleep(4000);
					Locator.CloseCHG(driver).click();
					Thread.sleep(4000);
					Locator.CloseCHGView(driver).click();
					Thread.sleep(4000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ChargeDetailsEdit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.ViewCHG7(driver).click();
	Thread.sleep(6000);
	
	Locator.ViewEdit(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Thread.sleep(2000);
	Locator.ShortDescPropertyCharged1(driver).clear();
	Thread.sleep(2000);
	
	row0 = sheet.getRow(127);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ShortDescPropertyCharged1(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveCHGMsg1(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Updated Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(4000);
					Locator.CloseCHG(driver).click();
					Thread.sleep(4000);
					Locator.CloseCHGView(driver).click();
					Thread.sleep(4000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7ViewEditInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.ViewCHG7(driver).click();
	Thread.sleep(3000);
	
	Locator.ViewEdit(driver).click();
	Thread.sleep(3000);
	Locator.CreationDate_dateview(driver).click();		
	Thread.sleep(2000);
	Locator.CreationDate1(driver).click();		
	Thread.sleep(3000); 
	Locator.RegistrationChargeCreateDate11(driver).clear();
	Thread.sleep(3000); 
	Locator.RegistrationChargeCreateDate11(driver).sendKeys("01/06/");		
	Thread.sleep(3000); 
	
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					
					String Text1 =Locator.RegistrationChargeCreateDateVal2(driver).getText();
					Thread.sleep(2000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text1);
						
					Thread.sleep(5000);
					Locator.CloseCHG(driver).click();
					Thread.sleep(4000);
					Locator.CloseCHGView(driver).click();
					Thread.sleep(4000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7ViewUpload(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.ViewCHG7(driver).click();
	Thread.sleep(3000);
	
	Locator.ViewUpload(driver).click();
	Thread.sleep(4000);
	Locator.ParticularCharge(driver).click();		
	Thread.sleep(2000);
	Locator.Modification(driver).click();		
	Thread.sleep(3000); 
	
	Locator.Discription(driver).sendKeys("ASDF");		
	Thread.sleep(3000); 
	
	
	By locator = By.xpath("//*[@id='files1']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Charge.xlsx");		
	Thread.sleep(3000);
	Locator.SaveUpload(driver).click();		
	Thread.sleep(3000);
				
					
					String Text =Locator.UploadMsgRD1(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record saved successfully")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
	
					Thread.sleep(5000);
					Locator.CloseUpload(driver).click();
					Thread.sleep(4000);
					Locator.CloseCHGView(driver).click();
					Thread.sleep(4000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7ViewUploadWF(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.ViewCHG7(driver).click();
	Thread.sleep(3000);
	
	Locator.ViewUpload(driver).click();
	Thread.sleep(4000);
	
	
	
	Locator.SaveUpload(driver).click();		
	Thread.sleep(4000);
				
					
					String Text =Locator.UploadMsgRD2(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Please select File")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
	
					Thread.sleep(5000);
					Locator.CloseUpload(driver).click();
					Thread.sleep(4000);
					Locator.CloseCHGView(driver).click();
					Thread.sleep(4000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7ViewDoc(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.ViewCHG7(driver).click();
	Thread.sleep(3000);
	
	if(Locator.Document(driver).isEnabled()) {
	Locator.Document(driver).click();
	Thread.sleep(4000);
	test.log(LogStatus.PASS,  " The user should redirected to the 'Document' page");
	}
	
					Thread.sleep(5000);
					Locator.CloseDocument(driver).click();
					Thread.sleep(4000);
					Locator.CloseCHGView(driver).click();
					Thread.sleep(4000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7ViewDocument(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.ViewCHG7(driver).click();
	Thread.sleep(3000);
	
	
	Locator.Document(driver).click();
	Thread.sleep(3000);
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
	
	Thread.sleep(500);
	Locator.DocumentDownload(driver).click();		//Exporting (Downloading) file
	
	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
	
	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, "  File does not downloaded.");
	}
	
	
					Thread.sleep(5000);
					Locator.CloseDocument(driver).click();
					Thread.sleep(4000);
					Locator.CloseCHGView(driver).click();
					Thread.sleep(4000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRCHG7View2Document(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRCHG7(driver).click();
	Thread.sleep(3000);
				   
	Locator.ViewCHG7(driver).click();
	Thread.sleep(3000);
	
	
	Locator.Document(driver).click();
	Thread.sleep(4000);
	
	Locator.DocumentView(driver).click();
	Thread.sleep(3000);
String Text =Locator.DocumentViewText(driver).getText();
Thread.sleep(3000);
	if(Text.equalsIgnoreCase("Viewer")) {
		test.log(LogStatus.PASS,  " view a document successfully.");
	}else {
		test.log(LogStatus.FAIL,  " document not View");
	}
	Locator.DocumentViewClose(driver).click();
	Thread.sleep(3000);
					Thread.sleep(5000);
					Locator.CloseDocument(driver).click();
					Thread.sleep(4000);
					Locator.CloseCHGView(driver).click();
					Thread.sleep(4000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
			if(Locator.SRMBP2(driver).isEnabled()) {
				Locator.SRMBP2(driver).click();
				Thread.sleep(3000);
				   test.log(LogStatus.PASS,"The user should redirected to the 'MBP-2' page" );
			}else {
				 test.log(LogStatus.PASS,"The user should redirected to the 'MBP-2' page" );
			}	
			Thread.sleep(2000);
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateofTransaction(driver).click();		
	Thread.sleep(1000);
	Locator.RegistrationChargeCreateDate1(driver).click();	

	Thread.sleep(4000); 
	
	row0 = sheet.getRow(130);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofCompany(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(131);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressMBP(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.Currency(driver).click();		
	Thread.sleep(2000);
	Locator.Currency1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(132);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.Amount(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(133);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.TimePeriod(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(134);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Purpose(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(135);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.PercentageOfReserve(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	Locator.DateOfBoardResolution(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();	
	
	Thread.sleep(3000); 
	
	Locator.DateOfPassingResolution(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000);
	
	row0 = sheet.getRow(136);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.NoOfSecurity(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(137);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.KindOfSecurity(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(2000);
	
	row0 = sheet.getRow(138);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.NominalValue(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(139);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.PaidUp(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(139);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.PaidUp(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(140);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.CostOfAuisition(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	Locator.DateOfSelling(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeModificationDate1(driver).click();		
	Thread.sleep(3000); 
	
	
	row0 = sheet.getRow(141);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.RemarksBH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	

	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveMB2Msg(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(130);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofCompany(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.DateTran(driver).sendKeys("01/06");		
	Thread.sleep(3000);
	
	Locator.Currency(driver).click();		
	Thread.sleep(2000);
	Locator.Currency1(driver).click();		
	Thread.sleep(3000); 
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.DateTranval(driver).getText();
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewTwoMan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateofTransaction(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.Name__validationMessage(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.CurrencyId_validationMessage(driver).getText();
					Thread.sleep(3000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text+" , "+Text1);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000); 
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
            	String Text2 =Locator.NatureOfTransactionId_validationMessage(driver).getText();
	            Thread.sleep(2000);
              	String Text3 =Locator.DateOfMaking_validationMessage(driver).getText();
               	Thread.sleep(3000);
	
					String Text =Locator.Name__validationMessage(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.CurrencyId_validationMessage(driver).getText();
					Thread.sleep(3000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text2+" , "+Text3+" , "+Text+" , "+Text1);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewGurantee(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId2(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateofTransaction(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(130);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofCompany(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(131);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressMBP(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.Currency(driver).click();		
	Thread.sleep(2000);
	Locator.Currency1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(132);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.Amount(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(133);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.TimePeriod(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(134);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Purpose(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(135);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.PercentageOfReserve(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	Locator.DateOfBoardResolution(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateOfPassingResolution(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000);
	
	
	row0 = sheet.getRow(141);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.RemarksBH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	

	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveMB2Msg(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewInvalidGura(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId2(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(130);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofCompany(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.DateTran(driver).sendKeys("01/06");		
	Thread.sleep(3000);
	
	Locator.Currency(driver).click();		
	Thread.sleep(2000);
	Locator.Currency1(driver).click();		
	Thread.sleep(3000); 
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.DateTranval(driver).getText();
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewGuraTwoMan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId2(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateofTransaction(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.Name__validationMessage(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.CurrencyId_validationMessage(driver).getText();
					Thread.sleep(3000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text+" , "+Text1);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddGuraNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000); 
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId2(driver).click();		
	Thread.sleep(3000); 
	
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
          // 	String Text2 =Locator.NatureOfTransactionId_validationMessage(driver).getText();
	            Thread.sleep(2000);
             	String Text3 =Locator.DateOfMaking_validationMessage(driver).getText();
              	Thread.sleep(3000);
	
					String Text =Locator.Name__validationMessage(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.CurrencyId_validationMessage(driver).getText();
					Thread.sleep(3000);
					
						test.log(LogStatus.PASS,  " Message displayed :" + Text3+" , "+Text+" , "+Text1);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewLoan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId3(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateofTransaction(driver).click();		
	Thread.sleep(2000);
	Locator.DateOfPassingResolutionAE1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(130);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofCompany(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(131);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressMBP(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.Currency(driver).click();		
	Thread.sleep(2000);
	Locator.Currency1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(132);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.Amount(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(133);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.TimePeriod(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(134);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Purpose(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(135);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.PercentageOfReserve(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	Locator.DateOfBoardResolution(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateOfPassingResolution(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000);
	row0 = sheet.getRow(142);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.RateOfInterest1(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	Locator.DateOfMaturity(driver).click();		
	Thread.sleep(2000);
	Locator.CreationDate1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(141);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.RemarksBH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	

	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveMB2Msg(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewInvalidLoan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId3(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(130);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofCompany(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.DateTran(driver).sendKeys("01/06");		
	Thread.sleep(3000);
	
	Locator.Currency(driver).click();		
	Thread.sleep(2000);
	Locator.Currency1(driver).click();		
	Thread.sleep(3000); 
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.DateTranval(driver).getText();
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewLoanTwoMan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId3(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateofTransaction(driver).click();		
	Thread.sleep(2000);
	Locator.DateOfPassingResolutionAE1(driver).click();		
	Thread.sleep(3000); 
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.Name__validationMessage(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.CurrencyId_validationMessage(driver).getText();
					Thread.sleep(3000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text+" , "+Text1);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddLoanNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000); 
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId3(driver).click();		
	Thread.sleep(3000); 
	
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
         // 	String Text2 =Locator.NatureOfTransactionId_validationMessage(driver).getText();
	            Thread.sleep(2000);
            	String Text3 =Locator.DateOfMaking_validationMessage(driver).getText();
             	Thread.sleep(3000);
	
					String Text =Locator.Name__validationMessage(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.CurrencyId_validationMessage(driver).getText();
					Thread.sleep(3000);
					
						test.log(LogStatus.PASS,  " Message displayed :" + Text3+" , "+Text+" , "+Text1);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewSecurity(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId4(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateofTransaction(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(130);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofCompany(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(131);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.AddressMBP(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.Currency(driver).click();		
	Thread.sleep(2000);
	Locator.Currency1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(132);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.Amount(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(133);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.TimePeriod(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(134);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Purpose(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(135);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.PercentageOfReserve(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	Locator.DateOfBoardResolution(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateOfPassingResolution(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000);
	
	
	row0 = sheet.getRow(141);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.RemarksBH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	

	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveMB2Msg(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewInvalidSecurity(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId4(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(130);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameofCompany(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	Locator.DateTran(driver).sendKeys("01/06");		
	Thread.sleep(3000);
	
	Locator.Currency(driver).click();		
	Thread.sleep(2000);
	Locator.Currency1(driver).click();		
	Thread.sleep(3000); 
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.DateTranval(driver).getText();
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddNewSecuTwoMan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000);
	
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId4(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateofTransaction(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000); 
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.Name__validationMessage(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.CurrencyId_validationMessage(driver).getText();
					Thread.sleep(3000);
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text+" , "+Text1);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2AddSecuNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.SRMBP2AddNew(driver).click();
	Thread.sleep(3000); 
	
	Locator.NatureOfTransactionId(driver).click();		
	Thread.sleep(2000);
	Locator.NatureOfTransactionId4(driver).click();		
	Thread.sleep(3000); 
	
	
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
         // 	String Text2 =Locator.NatureOfTransactionId_validationMessage(driver).getText();
	            Thread.sleep(2000);
            	String Text3 =Locator.DateOfMaking_validationMessage(driver).getText();
             	Thread.sleep(3000);
	
					String Text =Locator.Name__validationMessage(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.CurrencyId_validationMessage(driver).getText();
					Thread.sleep(3000);
					
						test.log(LogStatus.PASS,  " Message displayed :" + Text3+" , "+Text+" , "+Text1);
						Thread.sleep(2000);
					
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2Upload(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRMB2(driver).click();		
	Thread.sleep(5000);


	Thread.sleep(5000);
	Locator.SampleFormRDMB2(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\MBP-2 Sample File.xlsx");		
	Thread.sleep(3000);
	Locator.UploadMB2(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgMB2(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB2U(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2UploadInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRMB2(driver).click();		
	Thread.sleep(5000);


	Thread.sleep(5000);
	Locator.SampleFormRDMB2(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\MBP-2 Sample File (1).xlsx");		
	Thread.sleep(3000);
	Locator.UploadMB2(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgMB2(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB2U(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2UploadWithoutData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRMB2(driver).click();		
	Thread.sleep(5000);


	Thread.sleep(5000);
	Locator.SampleFormRDMB2(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\MBP-2 Sample File (2).xlsx");		
	Thread.sleep(3000);
	Locator.UploadMB2(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgMB2(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB2U(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2UploadInvalidformat(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
	Locator.UploadSRMB2(driver).click();		
	Thread.sleep(5000);

	Thread.sleep(5000);
	Locator.SampleFormRDMB2(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");		
	Thread.sleep(3000);
	
	
	Locator.UploadMB2(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.UploadMsgMB2(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("File is only in Excel Format'")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB2U(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2GR(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
	
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

	Thread.sleep(500);
	Locator.GenerateRegisterMB2(driver).click();		//Exporting (Downloading) file

	Thread.sleep(3000);
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "Generate Register  :-  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, " Generate Register : - File does not downloaded.");
	}

	
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2approvedLimitEdit(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
	Locator.EditAL(driver).click();		
	Thread.sleep(5000);
	/*Locator.ApprovedLimit(driver).clear();		
	Thread.sleep(1000);
	
	Locator.ApprovedLimit(driver).sendKeys("3");		
	Thread.sleep(2000);
	
	Locator.UsedLimit(driver).clear();		
	Thread.sleep(1000);
	Locator.UsedLimit(driver).sendKeys("2");		
	Thread.sleep(2000);
	*/
/*	Locator.DateOfBoardResolutionAE(driver).click();
	Thread.sleep(3000);
	Locator.DateOfBoardResolutionAE1(driver).click();		
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	Locator.DateOfPassingResolutionAE(driver).click();
	Thread.sleep(1000);
	Locator.DateOfPassingResolutionAE1(driver).click();		
	Thread.sleep(2000);*/
	Locator.SaveAE(driver).click();		
	Thread.sleep(5000);
	String Text =Locator.SaveAEMsg(driver).getText();
	Thread.sleep(2000);
	if(Text.equalsIgnoreCase("Record Save Successfully")) {
		test.log(LogStatus.PASS,  " Message displayed : -"+Text);
	}else {
		test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
	}
	Locator.CloseAE(driver).click();		
	Thread.sleep(5000);
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2approvedLimitEditClosed(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
	Locator.EditAL(driver).click();		
	Thread.sleep(5000);
	
	
	
	if(Locator.CloseAE1(driver).isEnabled()) {
		Locator.CloseAE1(driver).click();		
		Thread.sleep(5000);
		
		test.log(LogStatus.PASS,  "Window close successfully without saving data");
	}else {
		test.log(LogStatus.FAIL,  "Window  not close ");
	}
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2Edit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.MB2edit(driver).click();
	Thread.sleep(3000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.RemarksBH(driver).clear();
	Thread.sleep(2000);
	row0 = sheet.getRow(141);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.RemarksBH(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	

	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveMB2Msg(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Updated Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP2EditInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP2(driver).click();
	Thread.sleep(3000);
				   
	Locator.MB2edit(driver).click();
	Thread.sleep(3000);
	
	
	Thread.sleep(3000);
	Locator.DateTran(driver).clear();
	Thread.sleep(3000);
	Locator.DateTran(driver).sendKeys("01/06");		
	Thread.sleep(3000);
	
	Locator.Currency(driver).click();		
	Thread.sleep(2000);
	Locator.Currency1(driver).click();		
	Thread.sleep(3000); 
	
	By locator = By.xpath("//*[@id='command_name']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
	String Text1 =Locator.SaveMB2Msg(driver).getText();
	Thread.sleep(2000);
					String Text =Locator.DateTranval(driver).getText();
					
						
						Thread.sleep(2000);
						if(Text1.equalsIgnoreCase("Record Updated Successfully")&&Text.equalsIgnoreCase("01/06 is an invalid date format")) {
							test.log(LogStatus.FAIL,  " Both  Message displayed : -"+Text +" & "+Text1);
						}else {
							test.log(LogStatus.PASS,  "  Message displayed : -"+Text );
						}
					Thread.sleep(2000);
					Locator.CloseMB2(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2UploadActionTab(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
	Locator.MB2ActionUpload(driver).click();		
	Thread.sleep(5000);
	Locator.MB2Discription(driver).sendKeys("ABCD");		
	Thread.sleep(3000);

	
	By locator = By.xpath("//*[@id='files1']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\MBP-2 Sample File.xlsx");		
	Thread.sleep(3000);
	Locator.MB2Save(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.MB2SaveMsg(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record saved successfully")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.MB2UploadClose(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2UploadwithoutFileActionTab(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
	Locator.MB2ActionUpload(driver).click();		
	Thread.sleep(5000);
	
	Locator.MB2Save(driver).click();		
	Thread.sleep(2000);
				
					
					String Text =Locator.MB2SaveMsg1(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Please select File")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.MB2UploadClose(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2DocActionTab(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
		
					
					Thread.sleep(2000);
					if(Locator.clickDocument(driver).isEnabled()) {
						Locator.clickDocument(driver).click();
						Thread.sleep(4000);
						test.log(LogStatus.PASS,  "The user  redirected to the 'Document' page ");
					}else {
						test.log(LogStatus.FAIL,  "The user not redirected to the 'Document' page");
					}
					Thread.sleep(2000);
					Locator.ClosekDocument(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2DocDwonActionTab(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
	
						Locator.clickDocument(driver).click();
						
					Thread.sleep(4000);
					File dir = new File("C:\\Users\\Mayuri\\Downloads");
					File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
					
					Thread.sleep(2000);
					Locator.DocumentDownLoad(driver).click();		//Exporting (Downloading) file
					
					Thread.sleep(4000);//C://Users//jiya//Downloads//
					File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
					File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
					
					Thread.sleep(3000);
					if (dirContents.length < allFilesNew.length) {
						test.log(LogStatus.PASS,  "  File downloaded successfully.");
					} else {
						test.log(LogStatus.FAIL, "  File does not downloaded.");
					}
					Thread.sleep(3000);
					Locator.ClosekDocument(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB2DocViewActionTab(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP2(driver).click();		
	Thread.sleep(5000);
	
						Locator.clickDocument(driver).click();
						
					Thread.sleep(4000);
					Locator.DocumentView1(driver).click();
					
					Thread.sleep(4000);
			String text=Locator.DocumentView1Text(driver).getText();
					Thread.sleep(2000);
					if(text.equalsIgnoreCase("Viewer")) {
						Locator.DocumentView1Close(driver).click();
						Thread.sleep(4000);
						test.log(LogStatus.PASS,  "view a document successfully ");
					}else {
						test.log(LogStatus.FAIL,  " document not View");
					}
					
					Thread.sleep(3000);
					Locator.ClosekDocument(driver).click();
					Thread.sleep(3000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	
	
	public static void ClickMBP4(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

        	WebDriverWait wait = new WebDriverWait(driver, (120));
           Thread.sleep(2000);
           Locator.Master(driver).click();
           Thread.sleep(2000);
           Locator.MoreAction(driver).click();
           Thread.sleep(2000);
           Locator.StatutoryRegisters(driver).click();
           Thread.sleep(2000);
           if(Locator.clickMBP4(driver).isEnabled())
   	    {
   	      Thread.sleep(2000);
   	   Locator.clickMBP4(driver).click();
   	      test.log(LogStatus.PASS, "MBP-4 tab is Selected");
   	    }
   	    else
   	    {
   	    	 test.log(LogStatus.FAIL, "MBP-4 tab is not Selected");
   	    }
           Thread.sleep(2000);
           Locator.ClickDashboard(driver).click();
           
           
	 }
	
	public static void ClickUploadExistingRegistorValidData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

       	WebDriverWait wait = new WebDriverWait(driver, (120));
          Thread.sleep(2000);
          Locator.Master(driver).click();
          Thread.sleep(2000);
          Locator.MoreAction(driver).click();
          Thread.sleep(2000);
          Locator.StatutoryRegisters(driver).click();
          Thread.sleep(2000);
          Locator.clickMBP4(driver).click();
          Thread.sleep(2000);
          Locator.clickUploadBtn(driver).click();
          Thread.sleep(2000);
          Locator.SelectFile1(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SampleExcelMBP4-Existing.xlsx");
          Thread.sleep(2000);
          Locator.clickUploadBtn1(driver).click();
          
          try 
		  {
		   Thread.sleep(3000);
	        String msg=	Locator.clickUploadfileValidMsg(driver).getText();
	        test.log(LogStatus.PASS,"Enter Valid Data In MBP-4 Existing Excel File  =" +msg );
	       
		  }
	      catch(Exception  e) 
		  {
	    	 Thread.sleep(3000);
			 String msg=Locator.clickUploadfileInValidMsg(driver).getText();
			  test.log(LogStatus.FAIL, "Enter Valid Data In MBP-4 Existing Excel File =" +msg );
			
		  }
          
          Thread.sleep(2000);
          Locator.ClickDashboard(driver).click();
	 }
	
	public static void ClickUploadExistingRegistorInvalidData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

      	WebDriverWait wait = new WebDriverWait(driver, (120));
         Thread.sleep(2000);
         Locator.Master(driver).click();
         Thread.sleep(2000);
         Locator.MoreAction(driver).click();
         Thread.sleep(2000);
         Locator.StatutoryRegisters(driver).click();
         Thread.sleep(2000);
         Locator.clickMBP4(driver).click();
         Thread.sleep(2000);
         Locator.clickUploadBtn(driver).click();
         Thread.sleep(2000);
         Locator.SelectFile1(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SampleExcelMBP4-Existing (1).xlsx");
         Thread.sleep(2000);
         Locator.clickUploadBtn1(driver).click();
         
         try 
		  {
		   Thread.sleep(3000);
	        String msg=	Locator.clickUploadfileInValidMsg(driver).getText();
	        test.log(LogStatus.PASS,"Enter InValid Data In MBP-4 Existing Excel File  =" +msg );
	       
		  }
	      catch(Exception  e) 
		  {
	    	 Thread.sleep(3000);
			 String msg=Locator.clickUploadfileValidMsg(driver).getText();
			  test.log(LogStatus.FAIL, "Enter InValid Data In MBP-4 Existing Excel File =" +msg );
			
		  }
         
         Thread.sleep(2000);
         Locator.ClickDashboard(driver).click();
	 }
	
	public static void ClickUploadExistingRegistorDupliacteData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

     	WebDriverWait wait = new WebDriverWait(driver, (120));
        Thread.sleep(2000);
        Locator.Master(driver).click();
        Thread.sleep(2000);
        Locator.MoreAction(driver).click();
        Thread.sleep(2000);
        Locator.StatutoryRegisters(driver).click();
        Thread.sleep(2000);
        Locator.clickMBP4(driver).click();
        Thread.sleep(2000);
        Locator.clickUploadBtn(driver).click();
        Thread.sleep(2000);
        Locator.SelectFile1(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SampleExcelMBP4-Existing.xlsx");
        Thread.sleep(2000);
        Locator.clickUploadBtn1(driver).click();
        
       
		  
	    	 Thread.sleep(3000);
			 String msg=Locator.clickUploadfileValidMsg(driver).getText();
			 if(msg.equalsIgnoreCase("Record Save Successfully")) {
			  test.log(LogStatus.FAIL, "uploading a duplicate Existing Register of MBP-4  =" +msg );
			 }else {
				 test.log(LogStatus.PASS, "uploading a duplicate Existing Register of MBP-4=" +msg );
			 }
        
        Thread.sleep(2000);
        Locator.ClickDashboard(driver).click();
	 }
	
	public static void ClickUploadExistingRegistorWithoutData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

     	WebDriverWait wait = new WebDriverWait(driver, (120));
        Thread.sleep(2000);
        Locator.Master(driver).click();
        Thread.sleep(2000);
        Locator.MoreAction(driver).click();
        Thread.sleep(2000);
        Locator.StatutoryRegisters(driver).click();
        Thread.sleep(2000);
        Locator.clickMBP4(driver).click();
        Thread.sleep(2000);
        Locator.clickUploadBtn(driver).click();
        
        Thread.sleep(2000);
        Locator.SelectFile1(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SampleExcelMBP4-Existing (2).xlsx");
       
        Thread.sleep(2000);
        Locator.clickUploadBtn1(driver).click();
        
     
        
        try 
		  {
		   Thread.sleep(3000);
	        String msg=	Locator.clickUploadfileInValidMsg(driver).getText();
	        test.log(LogStatus.PASS,"Without data In MBP-4 Existing Excel File  =" +msg );
	       
		  }
	      catch(Exception  e) 
		  {
	    	 Thread.sleep(3000);
			 String msg=Locator.clickUploadfileValidMsg(driver).getText();
			  test.log(LogStatus.FAIL, "Without data Data In MBP-4 Existing Excel File =" +msg );
			
		  }
        
        Thread.sleep(2000);
        Locator.ClickDashboard(driver).click();
	 }
	
	public static void ClickUploadExistingRegistorInvalidFileFormat(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

    	WebDriverWait wait = new WebDriverWait(driver, (120));
       Thread.sleep(2000);
       Locator.Master(driver).click();
       Thread.sleep(2000);
       Locator.MoreAction(driver).click();
       Thread.sleep(2000);
       Locator.StatutoryRegisters(driver).click();
       Thread.sleep(2000);
       Locator.clickMBP4(driver).click();
       Thread.sleep(2000);
       Locator.clickUploadBtn(driver).click();
       
       Thread.sleep(2000);
       Locator.SelectFile1(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");
      
       Thread.sleep(2000);
       Locator.clickUploadBtn1(driver).click();
       
    
       
       try 
		  {
		   Thread.sleep(3000);
	        String msg=	Locator.clickUploadfileValidMsg(driver).getText();
	        test.log(LogStatus.PASS,"Enter Invalid file format In MBP-4 Existing Excel File  =" +msg );
	       
		  }
	      catch(Exception  e) 
		  {
	    	 Thread.sleep(3000);
			 String msg=Locator.clickUploadfileInValidMsg(driver).getText();
			  test.log(LogStatus.FAIL, "Enter Invalid file format In MBP-4 Existing Excel File =" +msg );
			
		  }
       
       Thread.sleep(2000);
       Locator.ClickDashboard(driver).click();
	 }
	
	public static void ClickUploadExistingRegistorWithoutSelectingFile(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

   	WebDriverWait wait = new WebDriverWait(driver, (120));
      Thread.sleep(2000);
      Locator.Master(driver).click();
      Thread.sleep(2000);
      Locator.MoreAction(driver).click();
      Thread.sleep(2000);
      Locator.StatutoryRegisters(driver).click();
      Thread.sleep(2000);
      Locator.clickMBP4(driver).click();
      Thread.sleep(2000);
      Locator.clickUploadBtn(driver).click();
      
      
     
      Thread.sleep(2000);
      Locator.clickUploadBtn1(driver).click();
      
   
      
      try 
		  {
		   Thread.sleep(3000);
	        String msg=	Locator.clickInvalidMsg(driver).getText();
	        test.log(LogStatus.FAIL,"Without selecting file In MBP-4 Existing Excel File  =" +msg );
	       
		  }
	      catch(Exception  e) 
		  {
	    	 Thread.sleep(3000);
			 String msg=Locator.clickUploadfileInValidMsg(driver).getText();
			  test.log(LogStatus.PASS, "Without selecting file  In MBP-4 Existing Excel File =" +msg );
			
		  }
      
      Thread.sleep(2000);
      Locator.ClickDashboard(driver).click();
	 }

	public static void ClickUploadOldRegistorWithValidFile(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

   	WebDriverWait wait = new WebDriverWait(driver, (120));
     Thread.sleep(2000);
     Locator.Master(driver).click();
     Thread.sleep(2000);
     Locator.MoreAction(driver).click();
     Thread.sleep(2000);
     Locator.StatutoryRegisters(driver).click();
     Thread.sleep(2000);
     Locator.clickMBP4(driver).click();
     Thread.sleep(2000);
     Locator.clickUploadBtn(driver).click();
     
     Thread.sleep(2000);
     Locator.clickOld(driver).click();
     
     Thread.sleep(2000);
     Locator.SelectFile1(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SampleExcelMBP4-Old.xlsx");
    
     Thread.sleep(2000);
     Locator.clickUploadBtn1(driver).click();
     
  
     
     try 
		  {
		   Thread.sleep(3000);
	        String msg=	Locator.clickUploadfileValidMsg(driver).getText();
	        test.log(LogStatus.PASS,"Enter Valid Data In MBP-4 Old Excel File  =" +msg );
	       
		  }
	      catch(Exception  e) 
		  {
	    	 Thread.sleep(3000);
			 String msg=Locator.clickInvalidMsg(driver).getText();
			  test.log(LogStatus.FAIL, "Enter Valid Data In MBP-4 Old Excel File  =" +msg );
			
		  }
     
     Thread.sleep(2000);
     Locator.ClickDashboard(driver).click();
	 }

	public static void ClickUploadOldRegistorWithInValidFile(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

  	WebDriverWait wait = new WebDriverWait(driver, (120));
    Thread.sleep(2000);
    Locator.Master(driver).click();
    Thread.sleep(2000);
    Locator.MoreAction(driver).click();
    Thread.sleep(2000);
    Locator.StatutoryRegisters(driver).click();
    Thread.sleep(2000);
    Locator.clickMBP4(driver).click();
    Thread.sleep(2000);
    Locator.clickUploadBtn(driver).click();
    
    Thread.sleep(2000);
    Locator.clickOld(driver).click();
    
    Thread.sleep(2000);
    Locator.SelectFile1(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SampleExcelMBP4-Old (1).xlsx");
   
    Thread.sleep(2000);
    Locator.clickUploadBtn1(driver).click();
    
 
    
    try 
		  {
		   Thread.sleep(3000);
	        String msg=	Locator.clickUploadfileInValidMsg(driver).getText();
	        test.log(LogStatus.PASS,"Enter Invalid file format In MBP-4 Existing Excel File  =" +msg );
	       
		  }
	      catch(Exception  e) 
		  {
	    	 Thread.sleep(3000);
			 String msg=Locator.clickInvalidMsg(driver).getText();
			  test.log(LogStatus.FAIL, "Enter Invalid file format In MBP-4 Existing Excel File =" +msg );
			
		  }
    
    Thread.sleep(2000);
    Locator.ClickDashboard(driver).click();
	 }
	
	public static void ClickUploadOldRegistorWithDuplicateData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

  	WebDriverWait wait = new WebDriverWait(driver, (120));
    Thread.sleep(2000);
    Locator.Master(driver).click();
    Thread.sleep(2000);
    Locator.MoreAction(driver).click();
    Thread.sleep(2000);
    Locator.StatutoryRegisters(driver).click();
    Thread.sleep(2000);
    Locator.clickMBP4(driver).click();
    Thread.sleep(2000);
    Locator.clickUploadBtn(driver).click();
    
    Thread.sleep(2000);
    Locator.clickOld(driver).click();
    
    Thread.sleep(2000);
    Locator.SelectFile1(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SampleExcelMBP4-Old.xlsx");
   
    Thread.sleep(2000);
    Locator.clickUploadBtn1(driver).click();
    
    Thread.sleep(5000);
    
    
    String msg=Locator.clickUploadfileValidMsg(driver).getText();
	 if(msg.equalsIgnoreCase("Record Save Successfully")) {
	  test.log(LogStatus.FAIL, "uploading a duplicate Existing Register of MBP-4  =" +msg );
	 }else {
		 test.log(LogStatus.PASS, "uploading a duplicate Existing Register of MBP-4=" +msg );
	 }
    Thread.sleep(2000);
    Locator.ClickDashboard(driver).click();
	 }
	
	public static void SRMBP3(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
			if(Locator.SRMBP3(driver).isEnabled()) {
				Locator.SRMBP3(driver).click();
				Thread.sleep(3000);
				   test.log(LogStatus.PASS,"The user should redirected to the 'MBP-3' page" );
			}else {
				 test.log(LogStatus.PASS,"The user should redirected to the 'MBP-3' page" );
			}	
			Thread.sleep(3000);
	
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP3AddNew(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP3(driver).click();
	Thread.sleep(5000);
				   
	Locator.SRMBP3AddNew(driver).click();
	Thread.sleep(5000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.DateOfBoardResolution3(driver).click();		
	Thread.sleep(2000);
	Locator.CreationDate1(driver).click();		
	Thread.sleep(3000); 
	
	Locator.DateOfInvestment_date(driver).click();		
	Thread.sleep(2000);
	Locator.RegistrationChargeCreateDate1(driver).click();		
	Thread.sleep(3000);
	
	row0 = sheet.getRow(144);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOfPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(145);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Address_Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(146);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.PurposeOfInvestment(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(147);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOfCompanyMB3(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(148);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.ClassOfSecurities(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(149);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	int No = (int) c1.getNumericCellValue();
	Locator.NoOfSecurities(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(150);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.CilentId_DpNo(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(151);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.FaceValueOfSecurities(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(152);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.PaidUpValueOfSecurities(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(153);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.CostOfAcquisition(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	Locator.DateOfDisposal(driver).click();		
	Thread.sleep(2000);
	Locator.CreationDate1(driver).click();		
	Thread.sleep(3000); 
	
	row0 = sheet.getRow(154);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.NoOfSecuritiesDisposedOff(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);
	
	row0 = sheet.getRow(155);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.SaleConsideration(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(156);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	 No = (int) c1.getNumericCellValue();
	Locator.BalanceSecuritiesLeft(driver).sendKeys("" + No + ""); // Writing Task title
	Thread.sleep(4000);

	row0 = sheet.getRow(157);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.RemarksMB3(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	
	By locator = By.xpath("//*[@id='frmMBP3Register']/div[5]/div/button");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveMB3Msg(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB3(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP3AddNewInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP3(driver).click();
	Thread.sleep(5000);
				   
	Locator.SRMBP3AddNew(driver).click();
	Thread.sleep(5000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.DateOfBoardResolutiontext(driver).sendKeys("01/06/");		
	Thread.sleep(2000);
	
	
	
	By locator = By.xpath("//*[@id='frmMBP3Register']/div[5]/div/button");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveMB3Msg(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.DateOfBoardResolutiontext1(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")&&Text1.equalsIgnoreCase("01/06/ is an invalid date format")) {
						Thread.sleep(1000);
						test.log(LogStatus.FAIL,  "Both  Message displayed : -"+Text +" & "+  Text1);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text1);
					}
					Thread.sleep(2000);
					Locator.CloseMB3(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP3AddNewTwoMan(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP3(driver).click();
	Thread.sleep(5000);
				   
	Locator.SRMBP3AddNew(driver).click();
	Thread.sleep(5000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	
	
	row0 = sheet.getRow(144);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.NameOfPerson(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	row0 = sheet.getRow(145);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Address_Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	
	
	By locator = By.xpath("//*[@id='frmMBP3Register']/div[5]/div/button");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveMB3Msg(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB3(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP3AddNewEmpty(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP3(driver).click();
	Thread.sleep(5000);
				   
	Locator.SRMBP3AddNew(driver).click();
	Thread.sleep(5000);
	
	
	
	By locator = By.xpath("//*[@id='frmMBP3Register']/div[5]/div/button");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveMB3Msg(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB3(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB3Upload(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP3(driver).click();		
	Thread.sleep(5000);
	Locator.UploadMB3(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormMB3(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_MBP-3.xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(3000);
				
					
					String Text =Locator.UploadMsgMB3(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRMB3(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB3UploadInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP3(driver).click();		
	Thread.sleep(5000);
	Locator.UploadMB3(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormMB3(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_MBP-3 (1).xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(3000);
				
					
					String Text =Locator.UploadMsgMB3(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRMB3(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB3UploadWithOutData(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP3(driver).click();		
	Thread.sleep(5000);
	Locator.UploadMB3(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormMB3(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\Register_MBP-3 (2).xlsx");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(3000);
				
					
					String Text =Locator.UploadMsgMB3(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Save Successfully")) {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRMB3(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB3UploadInvalidFormate(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP3(driver).click();		
	Thread.sleep(5000);
	Locator.UploadMB3(driver).click();		
	Thread.sleep(5000);
	Locator.SampleFormMB3(driver).click();		
	Thread.sleep(5000);
	By locator = By.xpath("//*[@id='File']");

	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(3000);
	ViewButton.sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");		
	Thread.sleep(3000);
	Locator.UploadRD(driver).click();		
	Thread.sleep(3000);
				
					
					String Text =Locator.UploadMsgMB3(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("No Data Found in Excel Document or Sheet Name must be 'MBP-3'")) {
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
					}else {
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseSRMB3(driver).click();
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMB3DwonGR(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
	Locator.SRMBP3(driver).click();		
	Thread.sleep(5000);
	
	File dir = new File("C:\\Users\\Mayuri\\Downloads");
	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download

	Thread.sleep(500);
	Locator.btnGenerateMBP3(driver).click();		//Exporting (Downloading) file

	Thread.sleep(3000);//C://Users//jiya//Downloads//
	File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
	File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download

	Thread.sleep(3000);
	if (dirContents.length < allFilesNew.length) {
		test.log(LogStatus.PASS,  "Generate Register :-  File downloaded successfully.");
	} else {
		test.log(LogStatus.FAIL, " Generate Register : - File does not downloaded.");
	}

	
					Thread.sleep(2000);
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP3Edit(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP3(driver).click();
	Thread.sleep(5000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");	
	Thread.sleep(5000); 
	Locator.EditMB3(driver).click();
	Thread.sleep(5000);
	Locator.EditMB3(driver).click();
	Thread.sleep(5000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.Address_Email(driver).clear();
	Thread.sleep(3000);
	row0 = sheet.getRow(145);
	c1 = row0.getCell(1); // Selected cell (0 row,2 column) (2 column = third column)
	Locator.Address_Email(driver).sendKeys(c1.getStringCellValue()); // Writing Task title
	Thread.sleep(3000);
	
	
	
	By locator = By.xpath("//*[@id='frmMBP3Register']/div[5]/div/button");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveMB3Msg(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Updated Successfully")) {
						Thread.sleep(1000);
						test.log(LogStatus.PASS,  " Message displayed : -"+Text);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.FAIL,  " Message displayed : -"+Text);
					}
					Thread.sleep(2000);
					Locator.CloseMB3(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void SRMBP3EditInvalid(WebDriver driver, ExtentTest test,XSSFWorkbook workbook) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
	Thread.sleep(3000);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Mastermenu']/a/img"))); 
	Thread.sleep(1000);
	Locator.Master(driver).click();
	Thread.sleep(4000);
	
	Locator.MoreAction(driver).click();
	Thread.sleep(3000);
	Locator.StatutoryRegisters(driver).click();
	Thread.sleep(3000);
			
	Locator.SRMBP3(driver).click();
	Thread.sleep(5000);
				   
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");	
	Thread.sleep(5000); 
	Locator.EditMB3(driver).click();
	Thread.sleep(5000);
	Locator.EditMB3(driver).click();
	Thread.sleep(5000);
	
	sheet = workbook.getSheetAt(0); // Retrieving fourth sheet of Workbook(Named - Update Tasks)
	int row = 0;
	Thread.sleep(500);
	Row row0 = sheet.getRow(row); // Selected 0th index row (First row)
	Cell c1 = null;
	
	Locator.DateOfBoardResolutiontext(driver).sendKeys("01/06/");		
	Thread.sleep(2000);
	
	
	
	By locator = By.xpath("//*[@id='frmMBP3Register']/div[5]/div/button");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	Thread.sleep(4000);
	
	WebElement ViewButton = driver.findElement(locator);	
	Thread.sleep(4000);
JavascriptExecutor jse=(JavascriptExecutor)driver;
Thread.sleep(2000);
jse.executeScript("arguments[0].click();", ViewButton);
	Thread.sleep(4000);
					
					String Text =Locator.SaveMB3Msg(driver).getText();
					Thread.sleep(2000);
					String Text1 =Locator.DateOfBoardResolutiontext1(driver).getText();
					Thread.sleep(2000);
					if(Text.equalsIgnoreCase("Record Updated Successfully")&&Text1.equalsIgnoreCase("01/06/ is an invalid date format")) {
						Thread.sleep(1000);
						test.log(LogStatus.FAIL,  "Both  Message displayed : -"+Text +" & "+  Text1);
						Thread.sleep(2000);
					}else {
					
						test.log(LogStatus.PASS,  " Message displayed : -"+Text1);
					}
					Thread.sleep(2000);
					Locator.CloseMB3(driver).click();
					Thread.sleep(2000);
					
		Locator.EntityCap(driver).click();
		Thread.sleep(2000);
		Locator.ClickDashboard(driver).click();
		 Thread.sleep(1000);
	 }
	
	public static void ClickUploadOldRegistorWithoutData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

 	   WebDriverWait wait = new WebDriverWait(driver, (120));
      Thread.sleep(2000);
      Locator.Master(driver).click();
  	Thread.sleep(4000);
  	
  	Locator.MoreAction(driver).click();
  	Thread.sleep(3000);
  	Locator.StatutoryRegisters(driver).click();
  	Thread.sleep(3000);
  	Locator.clickMBP4(driver).click();
      Thread.sleep(2000);
      Locator.clickUploadBtn(driver).click();
   
      Thread.sleep(2000);
      Locator.clickOld(driver).click();
   
      Thread.sleep(2000);
      Locator.SelectFile1(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SampleExcelMBP4-Old (2).xlsx");
  
      Thread.sleep(2000);
      Locator.clickUploadBtn1(driver).click();

     Thread.sleep(2000);
     String msg=Locator.clickUploadfileValidMsg(driver).getText();
     if(msg.equalsIgnoreCase("Record Save Successfully"))
     {
   	  test.log(LogStatus.FAIL,"Without data in MBP-4 Old Excel file =" +msg);
     }
     else
     {
   	  test.log(LogStatus.PASS,"Without data in MBP-4 Old Excel file =" +msg);
     }
     Thread.sleep(2000);
     Locator.ClickDashboard(driver).click();
	 
	 
	 }
	
	public static void ClickUploadOldRegistorInvalidFile(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	   WebDriverWait wait = new WebDriverWait(driver, (120));
     Thread.sleep(2000);
     Locator.Master(driver).click();
   	Thread.sleep(4000);
     Locator.MoreAction(driver).click();
   	Thread.sleep(3000);
   	Locator.StatutoryRegisters(driver).click();
   	Thread.sleep(3000);
   	Locator.clickMBP4(driver).click();
       Thread.sleep(2000);
     
       Locator.clickUploadBtn(driver).click();
  
     Thread.sleep(2000);
     Locator.clickOld(driver).click();
  
     Thread.sleep(2000);
     Locator.SelectFile1(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");
 
     Thread.sleep(2000);
     Locator.clickUploadBtn1(driver).click();

    Thread.sleep(2000);
    String msg=Locator.clickUploadfileValidMsg(driver).getText();
    if(msg.equalsIgnoreCase("No Data Found in Excel Document or Sheet Name must be 'MBP-4_PartB'"))
    {
  	  test.log(LogStatus.PASS,"Invalid File in MBP-4 Old Excel file =" +msg);
    }
    else
    {
  	  test.log(LogStatus.FAIL,"Invalid File  in MBP-4 Old Excel file =" +msg);
    }
    Thread.sleep(2000);
    Locator.ClickDashboard(driver).click();
	 
	 
	 }
	
	public static void ClickUploadOldRegistorWithoutSelectFile(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	   WebDriverWait wait = new WebDriverWait(driver, (120));
    Thread.sleep(2000);
    Locator.Master(driver).click();
   	Thread.sleep(4000);
     Locator.MoreAction(driver).click();
   	Thread.sleep(3000);
   	Locator.StatutoryRegisters(driver).click();
   	Thread.sleep(3000);
   	Locator.clickMBP4(driver).click();
    Thread.sleep(2000);
    Locator.clickUploadBtn(driver).click();
 
    Thread.sleep(2000);
    Locator.clickOld(driver).click();
 
   

    Thread.sleep(2000);
    Locator.clickUploadBtn1(driver).click();

   Thread.sleep(2000);
   String msg=Locator.clickInvalidMsg(driver).getText();
   if(msg.equalsIgnoreCase(msg))
   {
 	  test.log(LogStatus.FAIL,"Without Selecting File in MBP-4 Old Excel file =" +msg);
   }
   else
   {
 	  test.log(LogStatus.PASS,"Without Selecting File  in MBP-4 Old Excel file =" +msg);
   }
   Thread.sleep(2000);
   Locator.ClickDashboard(driver).click();
	 
	 
	 }
	
	public static void ClickGenerateRegistor(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

       	WebDriverWait wait = new WebDriverWait(driver, (120));
          Thread.sleep(2000);
          Locator.Master(driver).click();
         	Thread.sleep(4000);
           Locator.MoreAction(driver).click();
         	Thread.sleep(3000);
         	Locator.StatutoryRegisters(driver).click();
         	Thread.sleep(3000);
         	Locator.clickMBP4(driver).click();
          Thread.sleep(2000);
          if(Locator.clickGenerateRegistor(driver).isEnabled())
  	    {
  	      Thread.sleep(2000);
  	    Locator.clickGenerateRegistor(driver).click();
  	      test.log(LogStatus.PASS, "User should be redirected to the 'Generate Register' page and able to see three option i.e existing,old and all");
  	    }
  	    else
  	    {
  	    	 test.log(LogStatus.FAIL, "User should be redirected to the 'Generate Register' page and able to see three option i.e existing,old and all");
  	    }
          Thread.sleep(2000);
          Locator.ClickDashboard(driver).click();
          
          
	 }
	
	public static void ClickDownloadExisitingRegisterOfMBP4(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

      	  WebDriverWait wait = new WebDriverWait(driver, (120));
         Thread.sleep(2000);
         Locator.Master(driver).click();
      	Thread.sleep(4000);
        Locator.MoreAction(driver).click();
      	Thread.sleep(3000);
      	Locator.StatutoryRegisters(driver).click();
      	Thread.sleep(3000);
      	Locator.clickMBP4(driver).click();
       Thread.sleep(2000);
       Locator.clickGenerateRegistor(driver).click();
  	      Thread.sleep(2000);
  	    Locator.clickExistingDropdown(driver).click();
	      Thread.sleep(2000);
	      Locator.clickExistingDropdown1(driver).click();
	      
	      
	      File dir = new File("C:\\Users\\Mayuri\\Downloads");
		  	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		  		
		  	Thread.sleep(2000);
		  	Locator.clickDownloadBtn(driver).click();		//Exporting (Downloading) file
		  		
		    Thread.sleep(3000);
		    File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
		    File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		  		
		  		
		  	if (dirContents.length < allFilesNew.length) 
		  	{
		  		test.log(LogStatus.PASS,  "  Document downloaded successfully.");
		  	} 
		  	else 
		  	{
		  		test.log(LogStatus.FAIL, "  Document does not downloaded.");
		  	}
		    Thread.sleep(2000);
		    Locator.ClickDashboard(driver).click();
	      
	 }

	public static void ClickDownloadOldRegisterOfMBP4(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

     	  WebDriverWait wait = new WebDriverWait(driver, (120));
        Thread.sleep(2000);
        Locator.Master(driver).click();
      	Thread.sleep(4000);
        Locator.MoreAction(driver).click();
      	Thread.sleep(3000);
      	Locator.StatutoryRegisters(driver).click();
      	Thread.sleep(3000);
      	Locator.clickMBP4(driver).click();
       Thread.sleep(2000);
       Locator.clickGenerateRegistor(driver).click();
 	    Thread.sleep(2000);
 	   Locator.clickOldBtn(driver).click();
 	      Thread.sleep(2000);
 	     Locator.clickOldDropdown(driver).click();
	      Thread.sleep(2000);
	      Locator.clickOldDropdown1(driver).click();
	      
	      
	      File dir = new File("C:\\Users\\Mayuri\\Downloads");
		  	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		  		
		  	Thread.sleep(2000);
		  	Locator.clickDownloadBtn(driver).click();		//Exporting (Downloading) file
		  		
		    Thread.sleep(3000);
		    File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
		    File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		  		
		  		
		  	if (dirContents.length < allFilesNew.length) 
		  	{
		  		test.log(LogStatus.PASS,  "  Document downloaded successfully.");
		  	} 
		  	else 
		  	{
		  		test.log(LogStatus.FAIL, "  Document does not downloaded.");
		  	}
		    Thread.sleep(2000);
		    Locator.ClickDashboard(driver).click();
	      
	 }
	
	public static void ClickDownloadAllRegisterOfMBP4(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

    	  WebDriverWait wait = new WebDriverWait(driver, (120));
       Thread.sleep(2000);
       Locator.Master(driver).click();
     	Thread.sleep(4000);
       Locator.MoreAction(driver).click();
     	Thread.sleep(3000);
     	Locator.StatutoryRegisters(driver).click();
     	Thread.sleep(3000);
     	Locator.clickMBP4(driver).click();
      Thread.sleep(2000);
      Locator.clickGenerateRegistor(driver).click();
	    Thread.sleep(2000);
	    Locator.clickAllBtn(driver).click();
	     
	      
	      
	      File dir = new File("C:\\Users\\Mayuri\\Downloads");
		  	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		  		
		  	Thread.sleep(2000);
		  	Locator.clickDownloadBtn(driver).click();		//Exporting (Downloading) file
		  		
		    Thread.sleep(3000);
		    File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
		    File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		  		
		  		
		  	if (dirContents.length < allFilesNew.length) 
		  	{
		  		test.log(LogStatus.PASS,  "  Document downloaded successfully.");
		  	} 
		  	else 
		  	{
		  		test.log(LogStatus.FAIL, "  Document does not downloaded.");
		  	}
		    Thread.sleep(2000);
		    Locator.ClickDashboard(driver).click();
	      
	 }  
	
	public static void ClickViewExisitingRegisterOfMBP4(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

     	  WebDriverWait wait = new WebDriverWait(driver, (120));
        Thread.sleep(2000);
        Locator.Master(driver).click();
     	Thread.sleep(4000);
       Locator.MoreAction(driver).click();
     	Thread.sleep(3000);
     	Locator.StatutoryRegisters(driver).click();
     	Thread.sleep(3000);
     	Locator.clickMBP4(driver).click();
      Thread.sleep(2000);
      Locator.clickGenerateRegistor(driver).click();
 	      Thread.sleep(2000);
 	     Locator.clickExistingDropdown(driver).click();
	      Thread.sleep(2000);
	      Locator.clickExistingDropdown1(driver).click();
	      
	  	 Thread.sleep(2000);
	  	Locator.clickViewBtn(driver).click();		//Exporting (Downloading) file
		  		
		 Thread.sleep(2000);
			String msg=Locator.clickViewPage(driver).getText();	
		  		
		  	if (msg.equalsIgnoreCase(msg)) 
		  	{
		  		test.log(LogStatus.PASS,  "user should be able to view 'existing' register of MBP-4");
		  	} 
		  	else 
		  	{
		  		test.log(LogStatus.FAIL, " user should not be able to view 'existing' register of MBP-4");
		  	}
		  	
		    Thread.sleep(3000);
		    Locator.clickViewClosePage(driver).click();
		    Thread.sleep(2000);
		    Locator.ClickDashboard(driver).click();
	      
	 }
	
	public static void ClickViewOldRegisterOfMBP4(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

    	  WebDriverWait wait = new WebDriverWait(driver, (120));
       Thread.sleep(2000);
       Locator.Master(driver).click();
    	Thread.sleep(4000);
      Locator.MoreAction(driver).click();
    	Thread.sleep(3000);
    	Locator.StatutoryRegisters(driver).click();
    	Thread.sleep(3000);
    	Locator.clickMBP4(driver).click();
     Thread.sleep(2000);
     Locator.clickGenerateRegistor(driver).click();
	     Thread.sleep(2000);
	     Locator.clickOldBtn(driver).click();
	      Thread.sleep(2000);
	      Locator.clickOldDropdown(driver).click();
	      Thread.sleep(2000);
	      Locator.clickOldDropdown1(driver).click();
	      
	  	 Thread.sleep(2000);
	  	Locator.clickViewBtn(driver).click();		//Exporting (Downloading) file
		  		
		 Thread.sleep(2000);
			String msg=Locator.clickViewPage(driver).getText();	
		  		
		  	if (msg.equalsIgnoreCase(msg)) 
		  	{
		  		test.log(LogStatus.PASS,  "user should be able to view 'old' register of MBP-4");
		  	} 
		  	else 
		  	{
		  		test.log(LogStatus.FAIL, "user should not be able to view 'old' register of MBP-4");
		  	}
		  	
		    Thread.sleep(2000);
		    Locator.clickViewClosePage(driver).click();
		    Thread.sleep(2000);
		    Locator.ClickDashboard(driver).click();
	      
	 }
	
	public static void ClickViewAllRegisterOfMBP4(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

   	  WebDriverWait wait = new WebDriverWait(driver, (120));
      Thread.sleep(2000);
      Locator.Master(driver).click();
  	Thread.sleep(4000);
    Locator.MoreAction(driver).click();
  	Thread.sleep(3000);
  	Locator.StatutoryRegisters(driver).click();
  	Thread.sleep(3000);
  	Locator.clickMBP4(driver).click();
   Thread.sleep(2000);
   Locator.clickGenerateRegistor(driver).click();
	      Thread.sleep(2000);
	      Locator.clickAllBtn(driver).click();
	      
	  	 Thread.sleep(2000);
	  	Locator.clickViewBtn(driver).click();		//Exporting (Downloading) file
		  		
		 Thread.sleep(2000);
			String msg=Locator.clickViewPage(driver).getText();	
		  		
		  	if (msg.equalsIgnoreCase(msg)) 
		  	{
		  		test.log(LogStatus.PASS,  "user should be able to view 'All' register of MBP-4");
		  	} 
		  	else 
		  	{
		  		test.log(LogStatus.FAIL, "user should not be able to view 'All' register of MBP-4");
		  	}
		  	
		    Thread.sleep(2000);
		    Locator.clickViewClosePage(driver).click();
		    Thread.sleep(2000);
		    Locator.ClickDashboard(driver).click();
	      
	 }
	
	public static void clickPASTROD(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

       	WebDriverWait wait = new WebDriverWait(driver, (120));
          Thread.sleep(2000);
          Locator.Master(driver).click();
        	Thread.sleep(4000);
          Locator.MoreAction(driver).click();
        	Thread.sleep(3000);
        	Locator.StatutoryRegisters(driver).click();
        	Thread.sleep(3000);
          if(Locator.clickPASTROD(driver).isEnabled())
  	    {
  	      Thread.sleep(2000);
  	    Locator.clickPASTROD(driver).click();
  	      test.log(LogStatus.PASS, "The user should be redirected to the 'Past ROD' page");
  	    }
  	    else
  	    {
  	    	 test.log(LogStatus.FAIL, "The user should not be redirected to the 'Past ROD' page");
  	    }
          Thread.sleep(2000);
          Locator.ClickDashboard(driver).click();
          
          
	 }
	
	public static void clickPASTRODwithValidData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

      	WebDriverWait wait = new WebDriverWait(driver, (120));
         Thread.sleep(2000);
         Locator.Master(driver).click();
     	Thread.sleep(4000);
       Locator.MoreAction(driver).click();
     	Thread.sleep(3000);
     	Locator.StatutoryRegisters(driver).click();
     	Thread.sleep(3000);
     	Locator.clickPASTROD(driver).click();
  	      Thread.sleep(2000);
  	    Locator.clickPASTRODUpload(driver).click();
	      Thread.sleep(2000);
	      Locator.clickChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SamplePastDirectorUpload.xlsx");
	      Thread.sleep(2000);
	      Locator.clickPASTRODUploadButton(driver).click();
	      Thread.sleep(2000);
	      String msg=Locator.clickPASTRODValidMsg(driver).getText();
	      if(msg.equalsIgnoreCase("Records Save Successfully"))
	      {
	    	  test.log(LogStatus.PASS, "Message displayed ="+msg);
	      }
	      else
	      {
	    	  test.log(LogStatus.FAIL, "Message displayed ="+msg);
	      }
	      Thread.sleep(2000);
	      Locator.ClickDashboard(driver).click();
         
	 }
	
	public static void clickPASTRODwithInValidData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

     	WebDriverWait wait = new WebDriverWait(driver, (120));
        Thread.sleep(2000);
        Locator.Master(driver).click();
     	Thread.sleep(4000);
       Locator.MoreAction(driver).click();
     	Thread.sleep(3000);
     	Locator.StatutoryRegisters(driver).click();
     	Thread.sleep(3000);
     	Locator.clickPASTROD(driver).click();
 	      Thread.sleep(2000);
 	     Locator.clickPASTRODUpload(driver).click();
	      Thread.sleep(2000);
	      Locator.clickChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SamplePastDirectorUpload (1).xlsx");
	      Thread.sleep(2000);
	      Locator.clickPASTRODUploadButton(driver).click();
	      Thread.sleep(2000);
	      String msg=Locator.clickPASTRODInValidMsg1(driver).getText();
	      if(msg.equalsIgnoreCase("Input string was not in a correct format."))
	      {
	    	  test.log(LogStatus.PASS, "Message displayed ="+msg);
	      }
	      else
	      {
	    	  test.log(LogStatus.FAIL, "Message displayed ="+msg);
	      }
	      Thread.sleep(2000);
	      Locator.ClickDashboard(driver).click();
        
	 }
	
	public static void clickPASTRODwithDuplicateData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

    	WebDriverWait wait = new WebDriverWait(driver, (120));
       Thread.sleep(2000);
       Locator.Master(driver).click();
    	Thread.sleep(4000);
      Locator.MoreAction(driver).click();
    	Thread.sleep(3000);
    	Locator.StatutoryRegisters(driver).click();
    	Thread.sleep(3000);
    	Locator.clickPASTROD(driver).click();
	      Thread.sleep(2000);
	      Locator.clickPASTRODUpload(driver).click();
	      Thread.sleep(2000);
	      Locator.clickChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SamplePastDirectorUpload.xlsx");
	      Thread.sleep(2000);
	      Locator.clickPASTRODUploadButton(driver).click();
	      Thread.sleep(2000);
	      String msg=Locator.clickPASTRODValidMsg(driver).getText();
	      if(msg.equalsIgnoreCase("Records Save Successfully"))
	      {
	    	  test.log(LogStatus.FAIL, "Message displayed ="+msg);
	      }
	      else
	      {
	    	  test.log(LogStatus.PASS, "Message displayed ="+msg);
	      }
	      Thread.sleep(2000);
	      Locator.ClickDashboard(driver).click();
       
	 }
	
	public static void clickPASTRODwithoutData(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

   	WebDriverWait wait = new WebDriverWait(driver, (120));
      Thread.sleep(2000);
      Locator.Master(driver).click();
  	Thread.sleep(4000);
    Locator.MoreAction(driver).click();
  	Thread.sleep(3000);
  	Locator.StatutoryRegisters(driver).click();
  	Thread.sleep(3000);
  	Locator.clickPASTROD(driver).click();
	      Thread.sleep(2000);
	      Locator.clickPASTRODUpload(driver).click();
	      Thread.sleep(2000);
	      Locator.clickChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\SamplePastDirectorUpload (2).xlsx");
	      Thread.sleep(2000);
	      Locator.clickPASTRODUploadButton(driver).click();
	      Thread.sleep(2000);
	      String msg=Locator.clickPASTRODValidMsg(driver).getText();
	      if(msg.equalsIgnoreCase("Records Save Successfully"))
	      {
	    	  test.log(LogStatus.FAIL, "Message displayed ="+msg);
	      }
	      else
	      {
	    	  test.log(LogStatus.PASS, "Message displayed ="+msg);
	      }
	      Thread.sleep(2000);
	      Locator.ClickDashboard(driver).click();
      
	 }
	
	public static void clickPASTRODInvalidFile(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

  	WebDriverWait wait = new WebDriverWait(driver, (120));
     Thread.sleep(2000);
     Locator.Master(driver).click();
   	Thread.sleep(4000);
     Locator.MoreAction(driver).click();
   	Thread.sleep(3000);
   	Locator.StatutoryRegisters(driver).click();
   	Thread.sleep(3000);
   	Locator.clickPASTROD(driver).click();
 	      Thread.sleep(2000);
 	      Locator.clickPASTRODUpload(driver).click();
 	      Thread.sleep(2000);
 	     Locator.clickChooseFile(driver).sendKeys("C:\\Users\\Mayuri\\Documents\\Automation File\\4_28_2023 3_09_26 PM.zip");
	      Thread.sleep(2000);
	      Locator.clickPASTRODUploadButton(driver).click();
	      Thread.sleep(2000);
	      String msg=Locator.clickPASTRODInValidMsg(driver).getText();
	      if(msg.equalsIgnoreCase("No Data Found in Excel Document or Sheet Name must be Different"))
	      {
	    	  test.log(LogStatus.PASS, "Message displayed ="+msg);
	      }
	      else
	      {
	    	  test.log(LogStatus.FAIL, "Message displayed ="+msg);
	      }
	      Thread.sleep(2000);
	      Locator.ClickDashboard(driver).click();
     
	 }
	
	public static void clickPASTRODGenerateRegistor(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

 	WebDriverWait wait = new WebDriverWait(driver, (120));
    Thread.sleep(2000);
    Locator.Master(driver).click();
   	Thread.sleep(4000);
     Locator.MoreAction(driver).click();
   	Thread.sleep(3000);
   	Locator.StatutoryRegisters(driver).click();
   	Thread.sleep(3000);
   	Locator.clickPASTROD(driver).click();
 	      Thread.sleep(2000);
	      
	      
	      if( Locator.clickPASTRODGenerateRegostor(driver).isEnabled())
	      {
	          Thread.sleep(2000);
	          Locator.clickPASTRODGenerateRegostor(driver).click();
	          test.log(LogStatus.PASS, "User should be redirected to the 'Generate Register' page");
	      }
	      else
	      {
	    	  test.log(LogStatus.FAIL, "User should be redirected to the 'Generate Register' page");
	      }
	      Thread.sleep(2000);
	      Locator.ClickDashboard(driver).click();
	     
	 }
	
	public static void clickPASTRODGenerateRegistorDownload(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

	WebDriverWait wait = new WebDriverWait(driver, (120));
   Thread.sleep(2000);
   Locator.Master(driver).click();
  	Thread.sleep(4000);
    Locator.MoreAction(driver).click();
  	Thread.sleep(3000);
  	Locator.StatutoryRegisters(driver).click();
  	Thread.sleep(3000);
  	Locator.clickPASTROD(driver).click();
	      Thread.sleep(2000);
	      Thread.sleep(2000);
	      Locator.clickPASTRODGenerateRegostor(driver).click();
	      
	      Thread.sleep(2000);
	      Locator. clickPASTRODGenerateRegostorDropdown(driver).click();
	      Thread.sleep(2000);
	      Locator. clickPASTRODGenerateRegostorDropdown1(driver).click();
	      
	      
	      File dir = new File("C:\\Users\\Mayuri\\Downloads");
		  	File[] dirContents = dir.listFiles();						//Counting number of files in directory before download
		  		
		  	Thread.sleep(2000);
		  	Locator.clickDownloadBtn(driver).click();		//Exporting (Downloading) file
		  		
		    Thread.sleep(3000);
		    File dir1 = new File("C:\\Users\\Mayuri\\Downloads");
		    File[] allFilesNew = dir1.listFiles();						//Counting number of files in directory after download
		  		
		  		
		  	if (dirContents.length < allFilesNew.length) 
		  	{
		  		test.log(LogStatus.PASS,  "Register of Past Director should be viewed successfully");
		  	} 
		  	else 
		  	{
		  		test.log(LogStatus.FAIL, "Register of Past Director should not be viewed successfully");
		  	}
		    Thread.sleep(2000);
		    Locator.ClickDashboard(driver).click();
	      
	     
	 }
	
	public static void clickPASTRODGenerateRegistorView(WebDriver driver, ExtentTest test) throws InterruptedException
	 {

		WebDriverWait wait = new WebDriverWait(driver, (120));
	    Thread.sleep(2000);
	    Locator.Master(driver).click();
	  	Thread.sleep(4000);
	    Locator.MoreAction(driver).click();
	  	Thread.sleep(3000);
	  	Locator.StatutoryRegisters(driver).click();
	  	Thread.sleep(3000);
	  	Locator.clickPASTROD(driver).click();
		      Thread.sleep(2000);
		      Thread.sleep(2000);
		      Locator.clickPASTRODGenerateRegostor(driver).click();
		      
		      Thread.sleep(2000);
		      Locator. clickPASTRODGenerateRegostorDropdown(driver).click();
		      Thread.sleep(2000);
		      Locator. clickPASTRODGenerateRegostorDropdown1(driver).click();
		      
	  	 Thread.sleep(2000);
	  	Locator.clickViewBtn(driver).click();		//Exporting (Downloading) file
		  		
		 Thread.sleep(2000);
			String msg=Locator.clickViewPage(driver).getText();	
		  		
		  	if (msg.equalsIgnoreCase(msg)) 
		  	{
		  		test.log(LogStatus.PASS,  "Register of Past Director should be Viewed successfully");
		  	} 
		  	else 
		  	{
		  		test.log(LogStatus.FAIL, "Register of Past Director should not be Viewed successfully");
		  	}
		  	
		    Thread.sleep(2000);
		    Locator.clickViewClosePage(driver).click();
		    Thread.sleep(2000);
		    Locator.ClickDashboard(driver).click();
	      
	 }
	
}
