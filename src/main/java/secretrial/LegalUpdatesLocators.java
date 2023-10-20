package secretrial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LegalUpdatesLocators {
	
private static WebElement secretrial = null;				//WebElement variable created for 'Categories' click
	
	private static List<WebElement> secretrialList = null;		
	
	public static WebElement LegalUpdates(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/a/i)[12]"));
		return secretrial;
	}
	
	public static WebElement ActAll(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divDDLAct']/div/div"));
		return secretrial;
	}
	
	public static WebElement ActAll1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-in']"));
		return secretrial;
	}
	
	public static WebElement ActAllChk(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-checkbox-label']"));
		return secretrial;
	}
	
	public static WebElement CentralStateChk(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-checkbox-label'])[2]"));
		return secretrial;
	}
	
	public static WebElement CentralStates(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divDDLStateCentral']/div/div/span[1]"));
		return secretrial;
	}
	
	public static WebElement States(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//span[normalize-space()='Maharashtra']"));
		return secretrial;
	}
	
	public static WebElement Central(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//span[normalize-space()='Central']"));
		return secretrial;
	}
	
	public static WebElement CentralText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@title='Central']"));
		return secretrial;
	}
	
	public static WebElement MinistryAll(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divDDLMinistry']/div/div/span[1]"));
		return secretrial;
	}
	
	public static WebElement MinistryAll1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-top k-bot']/span)[2]"));
		return secretrial;
	}
	
	public static WebElement Newsletter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tabNewsLetters']/a"));
		return secretrial;
	}
	
	public static WebElement HelpUpdates(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/a/i)[13]"));
		return secretrial;
	}
	
	public static WebElement WhatsNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[3]/a/span)[9]"));
		return secretrial;
	}
	
	public static WebElement WhatsNewView(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle']"));
		return secretrial;
	}
	
	public static WebElement WhatsNewClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='docViewer']/div/div/div[1]/button"));
		return secretrial;
	}
	
	public static WebElement HelpVideos(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[4]/a/span)[9]"));
		return secretrial;
	}
	
	
	public static WebElement MYWORKSPACE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[1]/span"));
		return secretrial;
	}
	
	public static WebElement BoardMeeting(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[1]/ul/li[1]/a"));
		return secretrial;
	}
	
	public static WebElement BoardMeetingPlay(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='videoHelpControl']"));
		return secretrial;
	}
	
	public static WebElement GeneralMeeting(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[1]/ul/li[2]/a"));
		return secretrial;
	}
	
	public static WebElement MyTask(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[1]/ul/li[3]/a"));
		return secretrial;
	}
	
	public static WebElement MYDOCUMENTS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[2]/span"));
		return secretrial;
	}
	
	public static WebElement ComplianceDocuments(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[2]/ul/li[1]/a"));
		return secretrial;
	}
	
	public static WebElement Registers(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[2]/ul/li[2]/a"));
		return secretrial;
	}
	
	public static WebElement HistoricalDocuments(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[2]/ul/li[3]/a"));
		return secretrial;
	}
	
	public static WebElement MASTERS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[3]/span"));
		return secretrial;
	}
	
	public static WebElement EntityMaster(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[3]/ul/li[1]/a"));
		return secretrial;
	}
	
	public static WebElement DirectorMasters(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[3]/ul/li[2]/a"));
		return secretrial;
	}
	
	public static WebElement CommitteeComposition(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[3]/ul/li[3]/a"));
		return secretrial;
	}
	
	public static WebElement AuditorMaster(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar']/li[3]/ul/li[3]/a"));
		return secretrial;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
