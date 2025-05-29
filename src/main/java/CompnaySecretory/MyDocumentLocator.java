package CompnaySecretory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyDocumentLocator {

	private static WebElement Secreterial;
	private static List<WebElement> elementsList = null;
	
	public static WebElement MyDocumentimg(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='lefthomemenu']/a/i)[8]")));
		return Secreterial;
	}
	public static WebElement StatutoryRegisters(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='Documentmenu']/ul/li[4]/a/span"));
		return Secreterial;
	}
	public static WebElement ClickEntityLocation(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@class='k-dropdown-wrap k-state-default']"));
		return Secreterial;
	}
	public static WebElement SelectEntityLocation(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='ddlEntity_listbox']/li[1]"));
		return Secreterial;
	}
	public static WebElement ClickViewIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-Edit k-grid-view hoverCircle k-grid-button']"));
		//img[@src='/Areas/BM_Management/img/View.png\']
		return Secreterial;
	}
	public static WebElement ClickcloseIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html/body/div[10]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement ClickMembers(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-dropdown-wrap k-state-default'])[3]"));
		return Secreterial;
	}
	public static WebElement SelectMembers(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='ddlMember_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement SelectMembers1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//*[@id='ddlDirector_listbox']/li[2])[2]"));
		return Secreterial;
	}
	public static WebElement ClickDownload(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnDirectorRegisters']"));
		return Secreterial;
	}
	public static WebElement ClickView(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnManegrRegisters']"));
		return Secreterial;
	}
	public static WebElement ClickView1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@onclick='Directordetailsview()']"));
		return Secreterial;
	}
	public static WebElement closeViewIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[4]"));
		return Secreterial;
	}
	public static WebElement ClickViewIcon1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-grid-Edit k-grid-view hoverCircle k-grid-button'])[2]"));
		//img[@src='/Areas/BM_Management/img/View.png\']
		return Secreterial;
	}
	public static WebElement ClickOldRadioButton(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//label[@class='k-radio-label'])[2]"));
		return Secreterial;
	}
	public static WebElement ClickAllRadioButton(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//label[@class='k-radio-label'])[3]"));
		return Secreterial;
	}
	public static WebElement ClickMembers1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-dropdown-wrap k-state-default'])[4]"));
		return Secreterial;
	}
	public static WebElement ClickRegisterOfChargeView(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-grid-Edit k-grid-view hoverCircle k-grid-button'])[3]"));
		return Secreterial;
	}
	public static WebElement SelectChargeID(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='ddlCharge_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement DownloadRegisterOfCharge(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@class='btn btn-primary btndownload']"));
		return Secreterial;
	}
	public static WebElement ViewRegisterOfCharge(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnChargeRegisters']"));
		return Secreterial;
	}
	public static WebElement ClickRegisterofLoansView(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-grid-Edit k-grid-view hoverCircle k-grid-button'])[4]"));
		return Secreterial;
	}
	public static WebElement SelectNatureOfTransaction(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='ddlNatureOftransaction_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement ViewRegisterOfLoan(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnMBP2Registers']"));
		return Secreterial;
	}
	public static WebElement ClickRegisterofDebentureholdersView(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-grid-Edit k-grid-view hoverCircle k-grid-button'])[5]"));
		return Secreterial;
	}
	public static WebElement ClickDebentureHolder(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-input'])[4]"));
		return Secreterial;
	}
	public static WebElement SelectDebentureClass(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//*[@id='ddlDebentureClass_listbox'])[3]/li[1]"));
		return Secreterial;
	}
	public static WebElement SelectDebentureHolder(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='ddlNameOfDebHolder_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement ClickRegisterofDebentureholdersView1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='btnDebentureRegisters']"));
		return Secreterial;
	}
	public static WebElement closeViewIcon1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])"));
		return Secreterial;
	}
	public static WebElement HistiricalDoc(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[5]/a/span)[5]"));
		return Secreterial;
	}
	public static WebElement HistiricalDocNew(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='customCommand1']"));
		return Secreterial;
	}
	public static WebElement ClickEntity(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-dropdown-wrap k-state-default'])[4]"));
		return Secreterial;
	}
	public static WebElement SelectEntity(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='EntityId_listbox']/li[8]"));
		return Secreterial;
	}
	public static WebElement ClickMeetingType(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']"));
		return Secreterial;
	}
	public static WebElement ClickFY(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-dropdown-wrap k-state-default'])[5]"));
		return Secreterial;
	}
	public static WebElement SelectFY(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='FYID_listbox']/li[1]"));
		return Secreterial;
	}
	public static WebElement ClickNoOfMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='MeetingNo']"));
		return Secreterial;
	}
	public static WebElement ClickCalender(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']"));
		return Secreterial;
	}
	public static WebElement SelectDate(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.linkText("1"));
		return Secreterial;
	}
	public static WebElement clickSrNo(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='MeetingSRNo']"));
		return Secreterial;
	}
	public static WebElement clickSave(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@value='save']"));
		return Secreterial;
	}
	
	public static WebElement clickSaveValidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//lable[@id='lblsuccessI']"));
		return Secreterial;
	}
	public static WebElement clickclosePopup(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
		return Secreterial;
	}
	public static WebElement clickSaveInValidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//lable[@id='lblerrormsgI']"));
		return Secreterial;
	}
	public static WebElement ValidEntityMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//div[@id='EntityId_validationMessage']"));
		return Secreterial;
	}
	public static WebElement ClickEdtIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button']"));
		return Secreterial;
	}
	public static WebElement ClickFiles(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='files']"));
		return Secreterial;
	}
	
	public static WebElement ClickAgendaItems(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//li[@id='AgnedaItems']"));
		return Secreterial;
	}
	public static WebElement ClickHistoricalDocDelete(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-Delete k-grid-delete k-grid-button']"));
		return Secreterial;
	}
	public static WebElement ClickYesButton(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='yes']"));
		return Secreterial;
	}
	public static WebElement ClickNoButton(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='no']"));
		return Secreterial;
	}
	public static WebElement ClickTypeFilter(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@class='k-input']"));
		return Secreterial;
	}
	public static WebElement SelectTypeFilter(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//li[@class='k-item']"));
		return Secreterial;
	}
	public static WebElement ClickEntityFilter(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-input'])[2]"));
		return Secreterial;
	}
	public static WebElement SelectEntityFilter(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//li[@class='k-item'])[4]"));
		return Secreterial;
	}
	public static WebElement ClickFYFilter(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-input'])[3]"));
		return Secreterial;
	}
	public static WebElement SelectFYFilter(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='Fyear_listbox']/li[1]"));
		return Secreterial;
	}
	public static WebElement ReadTotalItem(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@class='k-pager-info k-label']"));
		return Secreterial;
	}
	public static WebElement clearBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='clearfillter']"));
		return Secreterial;
	}
	public static WebElement EFormRepositorytab(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[6]/a/span)[4]"));
		return Secreterial;
	}
	public static WebElement UploadButton(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='btnUplaodSH2']"));
		return Secreterial;
	}
	public static WebElement clickFromName(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@name='EFormName']"));
		return Secreterial;
	}
	public static WebElement clickFromDescription(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@name='EFormDescription']"));
		return Secreterial;
	}
	public static WebElement clickUploadFile(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@name='File']"));
		return Secreterial;
	}
	public static WebElement clickSavebtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[7]/button"));
		return Secreterial;
	}
	public static WebElement clickValidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement clickInvalidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[2]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement clickCloseIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html/body/div[11]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement clickEditIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button']"));
		return Secreterial;
	}
	public static WebElement clickDownlodIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-Download k-grid-download k-grid-button hoverCircle']"));
		return Secreterial;
	}
	public static WebElement clickDeleteIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-Delete k-grid-delete k-grid-button']"));
		return Secreterial;
	}
	public static WebElement clickDeleteValidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='divEformDeleteMsg']/div/div/div/lable"));
		return Secreterial;
	}
	public static WebElement clickSearch(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='filterSearch']"));
		return Secreterial;
	}
	public static WebElement clickSearchIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='childrow']/div/div[2]/div/div[1]/div/div/button"));
		return Secreterial;
	}
}
