package CompnaySecretory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyWorkspaceLocator 
{

	private static WebElement Secreterial;
	private static List<WebElement> elementsList = null;
	
	
	public static WebElement MyWorkspaceimg(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='lefthomemenu']/a/i)[7]")));
		return Secreterial;
	}
	
	public static WebElement ConcludedMeeting(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='myWorkspacemenu']/ul/li[4]/a/span")));
		return Secreterial;
	}
	public static WebElement NewButton(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='customCommand1']")));
		return Secreterial;
	}
	public static WebElement EditButton(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button']")));
		return Secreterial;
	}
	public static WebElement MoreAction(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='k-input'])[5]")));
		return Secreterial;
	}
	public static WebElement ComplianceTab(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='griDDLActionMenu_listbox']/li[1]/span)[11]")));
		return Secreterial;
	}
	public static WebElement CloseIcon(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[4]")));
		return Secreterial;
	}
	public static WebElement CloseIcon1(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[10]/div[1]/div/a")));
		return Secreterial;
	}
	public static WebElement CloseIcon2(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[15]/div[1]/div/a")));
		return Secreterial;
	}
	public static WebElement DraftResolutionandMinuteTab(WebDriver driver)
	{
		//WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =driver.findElement(By.xpath("(//*[@class='k-item'])[206]"));
	  
		return Secreterial;
	}
	public static WebElement DraftResolutionandMinuteDonloadIcon(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='lnkDownloadDoc']")));
		return Secreterial;
	}
	public static WebElement Anneture(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='divTabPanel1']/ul/li[2]/a")));
		return Secreterial;
	}
	public static WebElement selectFile(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='files']"));
		return Secreterial;
	}
	public static WebElement clickUpload(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='submit'])[2]")));
		return Secreterial;
	}
	public static WebElement clickValidationMsg(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='frmAgendaDocumentUpload']/div[1]/div/div/label")));
		return Secreterial;
	}
	public static WebElement clickValidationMsg1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@class='k-file-validation-message']"));
		return Secreterial;
	}
	public static WebElement clickValidationMsg2(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div[1]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement clickViewIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-View k-grid-view k-grid-button hoverCircle']"));
		return Secreterial;
	}
	public static WebElement clickCloseIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html[1]/body[1]/div[70]/div[1]/div[1]/a[1]"));
		return Secreterial;
	}
	public static WebElement clickDownloadIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-Download k-grid-download k-grid-button hoverCircle']"));
		return Secreterial;
	}
	public static WebElement clickDeleteIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html/body/div[15]/div[2]/div/div/div[2]/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[3]/a[3]"));
		return Secreterial;
	}
	public static WebElement clickValidMsg2(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='divAgendaDocsDeleteMsg']/div/div/div/lable"));
		return Secreterial;
	}
	
	public static WebElement MinutesTab(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='k-item'])[207]")));
		return Secreterial;
	}
	
	public static WebElement clickCloseIcon2(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html[1]/body[1]/div[15]/div[1]/div[1]/a[1]"));
		return Secreterial;
	}
	public static WebElement clickDownloadLicon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@id='downloadButton']"));
		return Secreterial;
	}
	public static WebElement clickiframe(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//iframe[@id='docViewerStatutory']"));
		return Secreterial;
	}
	public static WebElement clickiframe1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//iframe[@id='7885']"));
		return Secreterial;
	}
	

	public static WebElement CertifiedTrueCopyTab(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='k-item'])[208]")));
		return Secreterial;
	}
	public static WebElement clickCloseIcon3(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html[1]/body[1]/div[19]/div[1]/div[1]/a[1]"));
		return Secreterial;
	}
	public static WebElement clickPreviewCTC(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@id='btnPriview1']"));
		return Secreterial;
	}
	
	public static WebElement clickCloseIcon4(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html[1]/body[1]/div[70]/div[1]/div[1]/a[1]"));
		return Secreterial;
	}
	public static WebElement clickDownloadCTCIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@id='btnDownloadword1']"));
		return Secreterial;
	}
	public static WebElement clickDownloadCTCPDFIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@id='btnDownloadpdf1']"));
		return Secreterial;
	}
	
	public static WebElement UploadDocTab(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='k-item'])[209]")));
		return Secreterial;
	}
	public static WebElement clickCloseIcon5(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[30]/div[1]/div[1]/a[1]")));
		return Secreterial;
	}
	public static WebElement clickvalidmsg(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//lable[@id='lblsuccessI']")));
		return Secreterial;
	}
	public static WebElement clickViewIcon1(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='k-grid-View k-grid-view k-grid-button hoverCircle']")));
		return Secreterial;
	}
	public static WebElement clickError(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =driver.findElement(By.xpath("//div[@class='jconfirm-content']"));
		return Secreterial;
	}
	public static WebElement clickCloseIcon6(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =driver.findElement(By.xpath("/html/body/div[14]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement clickIframe(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =driver.findElement(By.xpath("/html/body/div[14]/div[2]/form/div[3]/span[2]/div/iframe"));
		return Secreterial;
	}
	
	public static WebElement clickDownloadIcon1(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='k-grid-Download k-grid-download k-grid-button hoverCircle']")));
		return Secreterial;
	}
	public static WebElement clickDeleteIcon1(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[30]/div[2]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[3]/span[1]/img[1]")));
		return Secreterial;
	}
	public static WebElement CopyMeetingTab(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='k-item'])[212]")));
		return Secreterial;
	}
	public static WebElement clickCloseIcon7(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html[1]/body[1]/div[40]/div[1]/div[1]/a[1]"));
		return Secreterial;
	}
	public static WebElement clickEntityName(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@class='k-input k-readonly']"));
		return Secreterial;
	}
	public static WebElement clickEntityName1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='lstEntityId_taglist']/li/span[1]"));
		return Secreterial;
	}
	public static WebElement selectEntityName(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//*[@type='checkbox'])[5]"));
		return Secreterial;
	}
	public static WebElement selectEntityName1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//*[@type='checkbox'])[6]"));
		return Secreterial;
	}
	public static WebElement clickCheckbox(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@class='chkbxCopyAgenda']"));
		return Secreterial;
	}
	public static WebElement clickCheckbox1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='CopyAgendaHeader_chb']"));
		return Secreterial;
	}
	public static WebElement clickSave(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnSaveAgendaItemSelected']"));
		return Secreterial;
	}
	public static WebElement clickClose(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnCloseCopyMeetingWnd']"));
		return Secreterial;
	}
	public static WebElement clickValidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='divCopyMeetingMessage']/div/div/div/lable"));
		return Secreterial;
	}
	public static WebElement clickLog(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-link k-header'])[10]"));
		return Secreterial;
	}
	public static WebElement clickLogDelete(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html[1]/body[1]/div[40]/div[2]/div[1]/form[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/a[1]/span[1]/img[1]"));
		return Secreterial;
	}
	public static WebElement clickLogDelete1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@type='Submit']"));
		return Secreterial;
	}
	public static WebElement clickLogDeleteMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='frmDeleteMeeting']/div[1]/div/div"));
		return Secreterial;
	}
	public static WebElement clickLogDeleteMsg1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//lable[@id='lblsuccessI']"));
		return Secreterial;
	}
	public static WebElement clickLogDeleteClose(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/a[1]"));
		return Secreterial;
	}
	public static WebElement clickLogDeleteNoBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnCloseDeleteAgendaItem']"));
		return Secreterial;
	}
	public static WebElement clickAddBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@title='Add Agenda']"));
		return Secreterial;
	}
	public static WebElement clickCloseBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[1]/div[1]/a[1]"));
		return Secreterial;
	}
	public static WebElement clickMyCompliance(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='myWorkspacemenu']/ul/li[5]/a/span"));
		return Secreterial;
	}
	public static WebElement clickMyComplianceEdit(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-edit k-grid-button']"));
		return Secreterial;
	}
	public static WebElement clickCloseIcon9(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html[1]/body[1]/div[16]/div[1]/div[1]/a[1]"));
		return Secreterial;
	}
	
	public static WebElement clickMyTask(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='myWorkspacemenu']/ul/li[6]/a/span"));
		return Secreterial;
	}
	public static WebElement clickNewTask(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='customCommand']"));
		return Secreterial;
	}
	public static WebElement clickType(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-dropdown-wrap k-state-default'])[2]"));
		return Secreterial;
	}
	public static WebElement clickEntity(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-dropdown-wrap k-state-default'])[3]"));
		return Secreterial;
	}
	public static WebElement ClickTaskTitle(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='TaskTitle']"));
		return Secreterial;
	}
	public static WebElement ClickTaskDescription(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='Description']"));
		return Secreterial;
	}
	public static WebElement ClickCalender(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']"));
		return Secreterial;
	}
	public static WebElement SelectDate(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.linkText("31"));
		return Secreterial;
	}
	public static WebElement Save(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnsave']"));
		return Secreterial;
	}
	public static WebElement ValidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='DivTask']/div/div/div[1]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement CloseBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnholidayclose']"));
		return Secreterial;
	}
	public static WebElement Close(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html/body/div[11]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement EditBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-Edit k-grid-edit k-grid-button']"));
		return Secreterial;
	}
	public static WebElement closeBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
		return Secreterial;
	}
	public static WebElement TaskDetailesTab(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='panelbarEditDirector']/li[1]/span[1]"));
		return Secreterial;
	}
	public static WebElement Status(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='panelbarEditDirector']/li[2]/div/div[1]/div/div/div[2]/label[1]"));
		return Secreterial;
	}
	public static WebElement Remark(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='txtRemark']"));
		return Secreterial;
	}
	public static WebElement File(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='files1']"));
		return Secreterial;
	}
	public static WebElement Savebtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnsave1']"));
		return Secreterial;
	}
	public static WebElement validMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='panelbarEditDirector']/li[2]/div/div[2]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement InvalidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//div[@id='Remark_validationMessage']"));
		return Secreterial;
	}
	public static WebElement DownloadIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-d k-grid-download k-grid-button hoverCircle']"));
		return Secreterial;
	}
	public static WebElement closeBtnEditTask(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnholidayclose']"));
		return Secreterial;
	}
	public static WebElement DeleteIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-Del k-grid-delete k-grid-button']"));
		return Secreterial;
	}
	public static WebElement DeleteIconYes(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='yes']"));
		
		return Secreterial;
	}
	public static WebElement DeleteIconNo(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='no']"));
		
		return Secreterial;
	}
	public static WebElement Deletevalidmsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='wndDelete']/h5"));
		return Secreterial;
	}
	public static WebElement Deletevalidmsg1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='divDeleteTaskMessage']/div/div/div/lable"));
		return Secreterial;
	}
	public static WebElement closeIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html/body/div[9]/div[1]/div/a"));
		return Secreterial;
	}
	
	public static WebElement MeetingCalender(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='myWorkspacemenu']/ul/li[7]/a/span")));
		return Secreterial;
	}
	public static WebElement ValidMsg1(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='divgridNewMessage']/div/div/div/lable")));
		return Secreterial;
	}
	public static WebElement NewBtn(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='customCommand1']")));
		return Secreterial;
	}
	public static WebElement AddBtn(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-primary'])[2]")));
		return Secreterial;
	}
	public static WebElement Entity(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='k-input'])[3]")));
		return Secreterial;
	}
	public static WebElement SelectEntity(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='EntityId_listbox']/li[1]")));
		return Secreterial;
	}
	public static WebElement ClickFY1(WebDriver driver)
	{

		Secreterial =driver.findElement(By.xpath("//*[@id='gridADDAnnualMeeting_active_cell']/span[1]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement ClickFY(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='gridADDAnnualMeeting_active_cell']"));
		return Secreterial;
	}
	

	public static WebElement SelectFY(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='FYID_listbox']/li[1]")));
		return Secreterial;
	}
	public static WebElement ClickMeetingType(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='gridADDAnnualMeeting_active_cell']/span[1]/span/span[1]")));
		return Secreterial;
	}
	public static WebElement SelectMeetingType(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Id_listbox']/li")));
		return Secreterial;
	}
	public static WebElement ClickMeetingNumber(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='MeetingSrNumber']")));
		return Secreterial;
	}
	public static WebElement MeetingDate(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='gridADDAnnualMeeting_active_cell']/span/span/span/span")));
		return Secreterial;
	}
	public static WebElement StarDate(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='k-icon k-i-clock']")));
		return Secreterial;
	}
	public static WebElement StarDateTime(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='k-item'])[64]")));
		return Secreterial;
	}
	public static WebElement EndDate(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='k-icon k-i-clock'])[2]")));
		return Secreterial;
	}
	public static WebElement EndDateTime(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='k-item'])[78]")));
		return Secreterial;
	}
	public static WebElement savebtn(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnSaveAnnualMeeting']")));
		return Secreterial;
	}
	public static WebElement ClickEntity(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@class='k-input']"));
		return Secreterial;
	}
	public static WebElement clearFilter(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='clearfillter']"));
		return Secreterial;
	}
	public static WebElement MyMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[3]/a/span)[5]"));
		return Secreterial;
	}
	public static WebElement AddRegularMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@title='Add New']"));
		return Secreterial;
	}
	public static WebElement clickEntity1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-input'])[16]"));
		return Secreterial;
	}
	public static WebElement clickType1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-input'])[17]"));
		return Secreterial;
	}
	public static WebElement clickFY1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-input'])[18]"));
		return Secreterial;
	}
	public static WebElement clickSave1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='command_name']"));
		return Secreterial;
	}
	public static WebElement clickErrorMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//lable[@id='lblerrormsgI']"));
		return Secreterial;
	}
	public static WebElement clickEntityOrCompnay(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//label[@class='control-label']"));
		return Secreterial;
	}
	public static WebElement close(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html/body/div[12]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement Shorter(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='checkmark1'])[4]"));
		return Secreterial;
	}
	public static WebElement eMetting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='checkmark1'])[5]"));
		return Secreterial;
	}
	public static WebElement circular(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='checkmark1'])[2]"));
		return Secreterial;
	}
	public static WebElement clickTime(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@class='k-icon k-i-clock']"));
		return Secreterial;
	}
	public static WebElement selectTime(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//li[normalize-space()='09:30 AM']"));
		return Secreterial;
	}
	public static WebElement clickVenue(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[contains(text(),'Select')]"));
		return Secreterial;
	}
	public static WebElement clickVenue1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-input'][normalize-space()='Select'])[1]"));
		return Secreterial;
	}
	public static WebElement SelectVenue(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//li[normalize-space()='Registered Office']"));
		return Secreterial;
	}
	public static WebElement SelectVenue1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//*[@id='AvailabilityAddressType_listbox']/li[1])[5]"));
		return Secreterial;
	}
	public static WebElement ClickUpdte(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnUpdateMeeting']"));
		return Secreterial;
	}
	public static WebElement UpdateValidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//lable[@id='lblsuccessI']"));
		return Secreterial;
	}
	public static WebElement ClickRadioBtnShoerterNotice(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//label[normalize-space()='Shorter']"));
		return Secreterial;
	}
	public static WebElement ClickRadioBtnAvailabilty(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='checkmark1'])[1]"));
		return Secreterial;
	}
	public static WebElement ClickCheckAvailabilty(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='divIsSeekAvailabilityRadio']/label[1]"));
		return Secreterial;
	}
	public static WebElement ClickAvailabiltyTab(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@id='mytabSA']"));
		return Secreterial;
	}
	public static WebElement ClickAddBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[normalize-space()='Add New']"));
		return Secreterial;
	}
	public static WebElement ClickPrefrence(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='divAvailabilityCtrl']/div/div[5]/div[2]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement SelectPrefrence(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//li[@class='k-item'][normalize-space()='1']"));
		return Secreterial;
	}
	public static WebElement clickSaveBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@value='Save']"));
		return Secreterial;
	}
	public static WebElement clickSaveValidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//lable[@id='lblsuccessI_sub']"));
		return Secreterial;
	}
	public static WebElement clickcloseIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@aria-label='Close'])[1]"));
		return Secreterial;
	}
	public static WebElement clickInvaliMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='lblerrormsgI_sub']"));
		return Secreterial;
	}
	public static WebElement clickCancelBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@value='Cancel']"));
		return Secreterial;
	}
	public static WebElement clickMailFormat(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@id='mytab2_sub'])[2]"));
		return Secreterial;
	}
	public static WebElement clickFrame(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//iframe[@title='Editable area. Press F10 for toolbar.']"));
		return Secreterial;
	}

	public static WebElement clickText(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.cssSelector("body > h1:nth-child(1) > strong:nth-child(1)"));
		return Secreterial;
	}
	public static WebElement clickUpdate(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='command_name']"));
		return Secreterial;
	}
	public static WebElement clickValidMsg1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//lable[@id='lblsuccessI']"));
		return Secreterial;
	}
	public static WebElement clickAvailabiltyDueDate(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@aria-controls='SeekAvailability_DueDate_dateview'])[1]"));
		return Secreterial;
	}
	public static WebElement SelectAvailabiltyDueDate(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.linkText("31"));
		return Secreterial;
	}
	public static WebElement clickSendBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//button[@id='command_name'])[2]"));
		return Secreterial;
	}
	public static WebElement clickErrorMsg1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//lable[@id='lblerrormsgI']"));
		return Secreterial;
	}
	public static WebElement clickAgendaItem(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@id='mytab2']"));
		return Secreterial;
	}
	public static WebElement clickEditIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button']"));
		return Secreterial;
	}
	public static WebElement clickNotingAgenda(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='btnAddNewSubAgendaItemA']"));
		return Secreterial;
	}
	public static WebElement clickCloseNotingAgendaPopup(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath(" (//a[@aria-label='Close'])[41]"));
		return Secreterial;
	}
	public static WebElement clickValidMsg3(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='divgridAgendaSelectMessage']/div/div/div/lable"));
		return Secreterial;
	}
	public static WebElement clickSaveBtn1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnSaveAgendaItemSelected']"));
		return Secreterial;
	}
	public static WebElement clickCheckboxNotingAgenda(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		return Secreterial;
	}
	public static WebElement clickCheckboxNotingAgenda1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		return Secreterial;
	}
	public static WebElement clickCheckboxNotingAgenda2(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		return Secreterial;
	}
	public static WebElement clickCheckboxNotingAgenda3(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		return Secreterial;
	}
	public static WebElement clickIicon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-grid-i k-grid-ainfo'])[6]"));
		return Secreterial;
	}
	public static WebElement clickIicon1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-grid-i k-grid-ainfo'])[8]"));
		return Secreterial;
	}
	public static WebElement clickAgendaItemInfo(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@aria-label='Close'])[14]"));
		return Secreterial;
	}
	public static WebElement clickVottingAgenda(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='btnAddNewSubAgendaItem']"));
		return Secreterial;
	}
	public static WebElement clickNewAgenda(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='btnAddNewAgendaItem']"));
		return Secreterial;
	}
	public static WebElement clickNewAgendaCloseBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnclose2']"));
		return Secreterial;
	}
	public static WebElement clickAgendaItem1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='AgendaHeading']"));
		return Secreterial;
	}
	public static WebElement clickAgendaHeading(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//textarea[@id='Agenda']"));
		return Secreterial;
	}
	public static WebElement clickVoting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='IsVoting']"));
		return Secreterial;
	}
	public static WebElement clickFrameAgendaTemplte(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//iframe[@title='Editable area. Press F10 for toolbar.'])[8]"));
		return Secreterial;
	}
	public static WebElement clickTextAgendaTemplte(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//body[@autocorrect='off']"));
		return Secreterial;
	}
	public static WebElement clickResolutionTemplte(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@id='mytab2'])[2]"));
		return Secreterial;
	}
	public static WebElement clickFrameResolutionTemplte(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//iframe[@title='Editable area. Press F10 for toolbar.'])[9]"));
		return Secreterial;
	}
	public static WebElement clickMinuteTemplte(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@id='mytab3'])[2]"));
		return Secreterial;
	}
	public static WebElement clickMinutesTemplteHeading(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//textarea[@id='MinutesFormatHeading']"));
		return Secreterial;
	}
	public static WebElement clickApproveRecommended(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//iframe[@title='Editable area. Press F10 for toolbar.'])[10]"));
		return Secreterial;
	}
	public static WebElement clickDisapproveNonRecommended(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@id='mytabM2']"));
		return Secreterial;
	}
	public static WebElement clickFrameDisapproveNonRecommended(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//iframe[@title='Editable area. Press F10 for toolbar.'])[11]"));
		return Secreterial;
	}
	public static WebElement clickDefer(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//a[@id='mytabM3']"));
		return Secreterial;
	}
	public static WebElement clickFrameDefer(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//iframe[@title='Editable area. Press F10 for toolbar.'])[12]"));
		return Secreterial;
	}
	public static WebElement clickSaveButton(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//button[@id='command_name'])[3]"));
		return Secreterial;
	}
	public static WebElement clickCloseButton(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnclose2']"));
		return Secreterial;
	}
	public static WebElement clickAgendaSequence(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='btnChangeAgendaNo']"));
		return Secreterial;
	}
	public static WebElement clickAgendaSequenceCloseBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@aria-label='Close'])[20]"));
		return Secreterial;
	}
	public static WebElement clickAgendaSequenceSubmitBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnSaveAgendaItemNumber']"));
		return Secreterial;
	}
	public static WebElement clickEntityfilter(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[contains(text(),'Entity-All')]"));
		return Secreterial;
	}
	public static WebElement selectEntityfilter(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//li[normalize-space()='A LIMITED']"));
		
		return Secreterial;
	}
	public static WebElement clickCheckboxAgendaSequnce(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@class='k-textbox k-valid']"));
		return Secreterial;
	}
	public static WebElement clickValidationOfAgendaSequence(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='divgridAgendaItemNumberMsg']/div/div/div/lable"));
		return Secreterial;
	}
	public static WebElement clickCloseMeetignBorad(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@aria-label='Close'])[4]"));
		return Secreterial;
	}
	public static WebElement clickSigningAuthority(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='btnSetSigningAuthority']"));
		return Secreterial;
	}
	public static WebElement clickCloseSigningAuthority(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@aria-label='Close'])[24]"));
		return Secreterial;
	}
	public static WebElement SelectNameSigningAuthority(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='SigningAuthorityId_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement ClickNameSigningAuthority(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.cssSelector("#frmAddEditMeetingOtherDetails > div.row.colpadding0 > div > div > span.k-widget.k-dropdown.k-header > span > span.k-input"));
		return Secreterial;
	}
	public static WebElement clickCopyMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='btnCopyMeetingcmd']"));
		return Secreterial;
	}
	public static WebElement clickCloseCopyMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnCloseCopyMeetingWnd']"));
		return Secreterial;
	}
	public static WebElement clickEntityCopyMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']"));
		return Secreterial;
	}
	public static WebElement selectEntityCopyMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='lstEntityId_listbox']/li[1]"));
		return Secreterial;
	}
	public static WebElement selectEntityCopyMeeting1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='lstEntityId_listbox']/li[3]"));
		return Secreterial;
	}
	public static WebElement ValidMsgCopyMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='divCopyMeetingMessage']/div/div/div/lable"));
		return Secreterial;
	}
	public static WebElement SaveCopyMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnSaveAgendaItemSelected']"));
		return Secreterial;
	}
	public static WebElement ClickOpenAgenda(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnAddPendingAgendaItem']"));
		return Secreterial;
	}
	public static WebElement ClickCheckbox(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		return Secreterial;
	}
	public static WebElement ClickCheckbox1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		return Secreterial;
	}
	public static WebElement ClickOpenAgendaInfo(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-grid-i k-grid-ainfo'])[4]"));
		return Secreterial;
	}
	public static WebElement ClickOpenAgendaSearchFilter(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='filterAgendaItem']"));
		return Secreterial;
	}
	public static WebElement ClickOpenAgendaCheckbox(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@class='chkbxCopyAgenda']"));
		return Secreterial;
	}
	public static WebElement CloseBtnCopyMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnCloseCopyMeetingWnd']"));
		return Secreterial;
	}
	public static WebElement ClickLogDetailes(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-link k-header'])[3]"));
		return Secreterial;
	}
	public static WebElement ClickCloseLogDetailesCopyMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@aria-label='Close'])[33]"));
		return Secreterial;
	}
	public static WebElement ClickDeleteLogDetailesCopyMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-grid-Delete k-grid-delete k-grid-button'])[2]"));
		return Secreterial;
	}
	public static WebElement ClickYesDeleteLogDetailesCopyMeeting(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//button[@type='Submit'])[7]"));
		return Secreterial;
	}
	
	public static WebElement ClickValidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='lblsuccessI']"));
		return Secreterial;
	}
	public static WebElement ClickNoBtnLogDetailes(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnCloseDeleteAgendaItem']"));
		return Secreterial;
	}
	public static WebElement ClickCloseLogDetailesCopyMeeting1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='btnCloseDeleteAgendaItem']"));
		return Secreterial;
	}
	public static WebElement ClickAgendaPreperation(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='btnAgendaPreparation']"));
		return Secreterial;
	}
	public static WebElement ClickAgendaPreperationcloseBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html/body/div[43]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement ClickAgendaPreperationMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='agendaprocessMsg']/lable"));
		return Secreterial;
	}
	public static WebElement ClickRefreshBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='btnRefreshForm']"));
		return Secreterial;
	}
	public static WebElement ClickDownloadAgenda(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='lnkDownloadDocPortrait']/span"));
		return Secreterial;
	}
	public static WebElement ClickPreviewAgenda(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='lnkPreviewAgenda']/span"));
		return Secreterial;
	}
	public static WebElement ClickClosePopupPreviewAgenda(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html/body/div[37]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement ClickAgendaVersion(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='lnkPreviewAgendaVersion']/span"));
		return Secreterial;
	}
	public static WebElement ClickCloseAgendaVersion(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("/html/body/div[42]/div[1]/div/a"));
		return Secreterial;
	}
	 static void selectOptionFromDropDown_bs(List<WebElement> options, String value) {
			
			for(WebElement option:options) {
				if(option.getText().equals(value)) {
					option.click();
					break;
				}
			}
		 }



}
