package secretrial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyReportsLocators {

private static WebElement secretrial = null;				//WebElement variable created for 'Categories' click
	
	private static List<WebElement> secretrialList = null;		
	
	public static WebElement MyReportsMenu(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='myReportMenu']/a/img"));
		return secretrial;
	}
	
	public static WebElement ComplianceStatusReport(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='myReportMenu']/ul/li[3]/a/span"));
		return secretrial;
	}
	
	public static WebElement TypeAll (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div[1]/div/div/div[1]/span/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement StatusAll (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divDDLStatus']/div/div/span[1]"));
		return secretrial;
	}
	
	public static WebElement Overdue (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-in'])[57]"));
		return secretrial;
	}
	
	public static WebElement ApplyBtn (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div[1]/div/div/div[9]/button"));
		return secretrial;
	}
	
	public static WebElement ClearFilter (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='clearfillter']/button"));
		return secretrial;
	}
	
	public static WebElement Export(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnExcel']"));
		return secretrial;
	}
	
	public static WebElement AttendanceReport(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='myReportMenu']/ul/li[4]/a/span"));
		return secretrial;
	}
	
	public static WebElement FinancialYearAllClick(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divDDLFY']/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement FinancialYearAll(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlFY_listbox']/li"));
		return secretrial;
	}
	
	public static WebElement CompanyAllClick(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divddlEntityId']/div/div/span[1]"));
		return secretrial;
	}
	
	public static WebElement Noitemstodisplay(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridReport']/div[3]/span[2]"));
		return secretrial;
	}
	
	public static WebElement NoitemstodisplayAD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridAuditorDetails']/div[1]/span[2]"));
		return secretrial;
	}
	
	public static WebElement AGDL(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-in'])[11]"));
		return secretrial;
	}
	
	public static WebElement AGDL1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-in'])[4]"));
		return secretrial;
	}
	
	public static WebElement CompanyAllClick1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divddlEntityId']/div/div"));
		return secretrial;
	}
	
	public static WebElement View(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridReport']/div[2]/table/tbody/tr[1]/td[10]/a[1]/span/img"));
		return secretrial;
	}
	
	public static WebElement ViewClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-button k-bare k-button-icon k-window-action']"));
		return secretrial;
	}
	
	public static WebElement ViewDownload(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='downloadButton']"));
		return secretrial;
	}
	
	public static WebElement Frame(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='doccontrol']/iframe"));
		return secretrial;
	}
	
	public static WebElement Download(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridReport']/div[2]/table/tbody/tr[1]/td[10]/a[2]/span/img"));
		return secretrial;
	}
	
	public static WebElement AuditorDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='myReportMenu']/ul/li[5]/a/span"));
		return secretrial;
	}
	
	public static WebElement CompanyAllClickAD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div[1]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement CompanyAllClickAD1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlEntityFilter_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement ExportAD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnExcel']"));
		return secretrial;
	}
	
	public static WebElement DirectorDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='myReportMenu']/ul/li[6]/a/span"));
		return secretrial;
	}
	
	public static WebElement CompanyAllClickDD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div/div[1]/span/span/span[2]"));
		return secretrial;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
