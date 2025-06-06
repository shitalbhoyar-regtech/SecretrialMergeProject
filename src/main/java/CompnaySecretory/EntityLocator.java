package CompnaySecretory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntityLocator

{
	private static WebElement Secreterial;
	private static List<WebElement> elementsList = null;
	
	
	public static WebElement selectImg(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@class='SmallMenuIcon'])[3]")));
		return Secreterial;
	}
	public static WebElement selectMaster(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Mastermenu']/span")));
		return Secreterial;
	}
	public static WebElement clickEntity(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver,30);
		Secreterial =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='fly-out-top-item-name SubSmallMenunameStyle'][normalize-space()='Entity']")));
		return Secreterial;
	}
	public static WebElement clickAddNewBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.cssSelector("#customCommand"));
		return Secreterial;
	}
	public static WebElement clickEntityType(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='window']/div[1]/div[1]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement selectEntityType1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='ddlEntityType_listbox']/li[1]"));
		return Secreterial;
	}
	public static WebElement selectEntityType(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='ddlEntityType_listbox']/li[4]"));
		return Secreterial;
	}
	public static WebElement EntityName(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtEntityName']"));
		return Secreterial;
	}
	
	public static WebElement CINEntity(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtCIN']"));
		return Secreterial;
	}
	
	public static WebElement CalendorIcon(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@class='k-icon k-i-calendar']"));
		return Secreterial;
	}
	
	
	public static WebElement Date(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.linkText("1"));
		return Secreterial;
	}
	
	public static WebElement PAN(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtPan']"));
		return Secreterial;
	}
	
	public static WebElement Roc(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='PanelbarEditPrivatepublicCompany']/li/div/div[2]/div/div[1]/span[2]/span/span[1]"));
		return Secreterial;
	}
	
	public static WebElement Ahmedabad(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.linkText("Ahmedabad"));
		return Secreterial;
	}
	
	
	public static WebElement CompanyCategory(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='PanelbarEditPrivatepublicCompany']/li/div/div[2]/div/div[2]/span[2]/span/span[1]"));
		return Secreterial;
	}
	
	public static WebElement Companylimitedbyshares(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.linkText("Company limited by shares"));
		return Secreterial;
	}
	
	public static WebElement EmailE(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtEmailId']"));
		return Secreterial;
	}
	
	public static WebElement FinancialYear(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='PanelbarEditPrivatepublicCompany']/li/div/div[3]/div/div[2]/span[2]/span/span[1]"));
		return Secreterial;
	}
	
	public static WebElement JAnDec(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='FY_listbox']/li[2]"));
		return Secreterial;
	}
	
	public static WebElement AddressE(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtRegAddress1']"));
		return Secreterial;
	}
	public static WebElement AddressE1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtRegAddress2']"));
		return Secreterial;
	}
	
	public static WebElement StateE(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='step1Content']/div/div[1]/div/div[3]/span[2]/span/span[2]"));
		return Secreterial;
	}
	
	public static WebElement MaharashtraS(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='stateId_listbox']/li[28]"));
		return Secreterial;
	}
	
	public static WebElement CityE(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='step1Content']/div/div[1]/div/div[4]/span[2]/span/span[2]"));
		return Secreterial;
	}
	
	public static WebElement AhmadnagarE(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ddlreg_cityId_listbox']/li[3]"));
		return Secreterial;
	}
	
	public static WebElement SaveE(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='saveppcom']"));
		return Secreterial;
	}
	
	public static WebElement SaveEMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdatePublicprivatelisted']/div[1]/div/div/lable"));
		return Secreterial;                       
	}
	
	public static WebElement SaveEMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdatePublicprivatelisted']/div[2]/div/div/lable"));
		return Secreterial;   //Entity/Company with same CIN already exists                     
	}
	
	public static WebElement CloseEntity(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnclose2']"));
		return Secreterial;               
	}
	public static WebElement CloseEntity1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//button[normalize-space()='Close'])[1]"));
		return Secreterial;                 
	}
	public static WebElement ClickDashboard(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='lefthomemenu']/span/span[1]"));
		return Secreterial;                 
	}
	public static WebElement InValidDate(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdatePublicprivatelisted']/div[2]/div/div/lable"));
		return Secreterial;                 
	}
	public static WebElement InValidPan(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='PAN_validationMessage']"));
		return Secreterial;                 
	}
	public static WebElement InValidROC(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ROC_Code_validationMessage']"));
		return Secreterial;                 
	}
	public static WebElement InValidEmail(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Email_Id_validationMessage']"));
		return Secreterial;                 
	}
	public static WebElement InValidFY(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='FY_validationMessage']"));
		return Secreterial;                 
	}
	public static WebElement InValidAddress(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Regi_Address_Line1_validationMessage']"));
		return Secreterial;                 
	}
	public static WebElement InValidState(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Regi_StateId_validationMessage']"));
		return Secreterial;                 
	}
	public static WebElement InValidCity(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Regi_CityId_validationMessage']"));
		return Secreterial;                 
	}
	public static WebElement InvalidMsgName(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='EntityName_validationMessage']"));
		return Secreterial;                     
	}
	public static WebElement InvalidMsgeCIN(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='CIN_validationMessage']"));
		return Secreterial;                     
	}
	public static WebElement ClickFilter(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='filterSearch']"));
		return Secreterial;                     
	}
	public static WebElement clickEditIcon1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@class='k-button-icontext k-grid-Edit k-gridEdit']"));
		return Secreterial;                     
	}
	public static WebElement clickEditIcon(WebDriver driver)		//Method for closing Message Popup
	{
		
		
		Secreterial = driver.findElement(By.xpath("//td[@class='k-command-cell']/a/span/img"));
		return Secreterial;                     
	}
	public static WebElement clickUpdateBtn(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdatePublicprivatelisted']/div[1]/div/div/lable"));
		return Secreterial;                     
	}
	public static WebElement clickInvalidDate(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='dpIncdate']"));
		return Secreterial;                     
	}
	public static WebElement clickBusinessActivity(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='mytabBA']/a"));
		return Secreterial;                     
	}
	public static WebElement clickcloseIcon(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[5]"));
		return Secreterial;                     
	}
	public static WebElement clickNewBusinessActivity(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnAddActivity']"));
		return Secreterial;                     
	}
	public static WebElement clickMainActivityCode(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmBusinessActivity']/div[1]/div/span[2]/span/span[1]"));
		return Secreterial;                     
	}
	public static WebElement clickMainActivityCodeDropdwon(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='MainActivityCode_listbox']/li[1]"));
		return Secreterial;                     
	}
	public static WebElement clickMainActivityCodeDropdwon1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='MainActivityCode_listbox']/li[2]"));
		return Secreterial;                     
	}
	public static WebElement clickBA(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmBusinessActivity']/div[2]/div/span[2]/span/span[1]"));
		return Secreterial;                     
	}
	public static WebElement clickBADropdown(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='BusinessActivityCode_listbox']/li[1]"));
		return Secreterial;                     
	}
	public static WebElement clickBADropdown1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='BusinessActivityCode_listbox']/li[1]"));
		return Secreterial;                     
	}
	public static WebElement clickSave(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='command_name']"));
		return Secreterial;                     
	}
	public static WebElement clickcloseIcon1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[14]"));
		return Secreterial;                     
	}
	
	public static WebElement BAValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmBusinessActivity']/div[1]/div/div/lable"));
		return Secreterial;                     
	}
	
	public static WebElement GridLoad(WebDriver driver)
	{
		Secreterial = driver.findElement(By.xpath("//div[@class='k-grid-content k-auto-scrollable']"));
		return Secreterial;
	}
	public static WebElement NoDataFound(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//*[@id='BusinessActivityCode-list']/div[4]/div)"));
		return Secreterial;
	}
	public static WebElement EditBA(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//*[@class='k-button-icontext k-grid-Edit k-gridEdit'])[2]"));
		return Secreterial;
	}
	public static WebElement ClickPercentage(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='Percentages']"));
		return Secreterial;
	}
	public static WebElement ClickDeleteIcon(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@class='k-button-icontext k-grid-Del k-gridDelete']"));
		return Secreterial;
	}
	public static WebElement ClickDelete(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='yesBA']"));
		return Secreterial;
	}
	public static WebElement ClickDeleteMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='modalWindowBA']/h5"));
		return Secreterial;
	}
	
	public static WebElement ClickDocumentTab(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='mytab2']/a"));
		return Secreterial;
	}
	public static WebElement ClickNewBtn(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='customCommand1']"));
		return Secreterial;
	}
	public static WebElement ClickDocType(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[3]/div/div[1]/div/div[2]/span/span/span[1]"));
		return Secreterial;
	}
	public static WebElement ClickDocTypeDropDown(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[1]"));
		return Secreterial;
	}
	public static WebElement ClickDocTypeDropDownDEED(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[5]"));
		return Secreterial;
	}
	public static WebElement ClickFile(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='files']"));
		return Secreterial;
	}
	public static WebElement ClickSaveBtn(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//*[@id='saveppcom'])[2]"));
		return Secreterial;
	}
	public static WebElement ClickSaveBtnLLPDOC(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//*[@id='saveppcom'])"));
		return Secreterial;
	}
	public static WebElement ClickValidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[1]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement ClickInValidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[2]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement ClickCloseIcon(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[18]"));
		return Secreterial;
	}
	public static WebElement ClickValidMsgFile(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[2]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement ClickValidMsgFile1(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[2]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement ClickDescrition (WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='Discription']"));
		return Secreterial;
	}
	public static WebElement ClickViewIcon (WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@class='k-button k-button-icontext k-grid-Vi k-gridPreviewIcon']"));
		return Secreterial;
	}
	public static WebElement ClickViewAOAIcon (WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id=\"IncorporateKendoGrid\"]/table/tbody/tr[1]/td[3]/a[2](//a[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[2]"));
		return Secreterial;
	}
	public static WebElement ClickViewCOIIcon (WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//a[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])"));
		return Secreterial;
	}
	public static WebElement ClickClose (WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//*[@aria-label='Close'])[5]"));
		return Secreterial;
	}
	public static WebElement ClickDownloadIcon (WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@class='k-button-icontext k-grid-Do k-gridDownload']"));
		return Secreterial;
	}
	public static WebElement ClickDownloadAOAIcon (WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@class='k-button k-buton-icontext k-grid-Do k-gridDownloadIcont']"));
		return Secreterial;
	}
	public static WebElement ClickDownloadCOIIcon (WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//a[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[3]"));
		return Secreterial;
	}
	public static WebElement ClickDeleteIcon1 (WebDriver driver)
	{
		Secreterial=driver.findElement(By.cssSelector("#IncorporateKendoGrid_active_cell > a.k-button-icontext.k-grid-Del.k-gridDelete"));
		return Secreterial;
	}
	public static WebElement ClickDeleteAOAIcon1 (WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@class='k-button k-button-icontext k-grid-Del k-button k-button-icontext k-grid-View k-gridDeleteIcon']"));
		return Secreterial;
	}
	public static WebElement ClickDeleteCOIIcon1 (WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//a[@class='k-grid-Delete k-grid-delete k-grid-button'])[3]"));
		return Secreterial;
	}
	public static WebElement ClickYes(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='yes']"));
		return Secreterial;
	}
	public static WebElement ClickDeleteValidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='modalWindow']/h5"));
		return Secreterial;
	}
	public static WebElement ClickPolicies(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='PolicesDocument']/a"));
		return Secreterial;
	}
	public static WebElement ClickPoliciesType(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[4]"));
		return Secreterial;
	}
	public static WebElement ClickAOA(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement ClickPolicyLLP(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[2])[9]"));
		return Secreterial;
	}
	public static WebElement ClickCOI(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[3]"));
		return Secreterial;
	}
	public static WebElement ClickPolicy(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[4]"));
		return Secreterial;
	}
	public static WebElement ClickLicenseRegistration(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[5]"));
		return Secreterial;
	}
	public static WebElement ClickLicenseRegistrationNo(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='LicenceNo']"));
		return Secreterial;
	}
	public static WebElement ClickLastRenewDate(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='BMDate']"));
		return Secreterial;
	}
	public static WebElement ClickLastRenewCalender(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='divBMDate']/div/div[2]/span/span/span/span"));
		return Secreterial;
	}
	public static WebElement ClickUpcomingRenewDate(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='GMDate']"));
		return Secreterial;
	}
	public static WebElement ClickAnnualReport(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[6]"));
		return Secreterial;
	}
	public static WebElement ClickSerialNoOfAGM(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='LicenceNo']"));
		return Secreterial;
	}
	public static WebElement ClickFY(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='divFY']/div/div[2]/span/span/span[1]"));
		return Secreterial;
	}
	public static WebElement SelectFY(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='FYID_listbox']/li[1]"));
		return Secreterial;
	}
	public static WebElement ClickBranchDetailes(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='mytab3']"));
		return Secreterial;
	}
	public static WebElement ClickName(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='txtboxName']"));
		return Secreterial;
	}
	public static WebElement ClickContactPerson(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='txtboxPerson']"));
		return Secreterial;
	}
	public static WebElement ClickContactNumber(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='txtboxPhNo']"));
		return Secreterial;
	}
	public static WebElement ClickEmail(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='txtboxemail']"));
		return Secreterial;
	}
	public static WebElement ClickAddressLine(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='txtboxAddress']"));
		return Secreterial;
	}
	public static WebElement ClickBtnSave(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='command_name']"));
		return Secreterial;
	}
	public static WebElement ClickAddNew(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='btnaddBranch']"));
		return Secreterial;
	}
	public static WebElement ClickBranchType(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmBranchDetails']/div[3]/div[1]/div[2]/div[2]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement SelectBranchType(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='ddlBranchType_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement ClickState(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='stateDiv']/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement SelectState(WebDriver driver)
	{
		Secreterial=driver.findElement(By.linkText("Maharashtra"));
		return Secreterial;
	}
	public static WebElement ClickCity(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='cityDiv']/div[1]/span[2]/span/span[1]"));
		return Secreterial;
	}
	
	public static WebElement PinCode(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='txtboxpincode']"));
		return Secreterial;
	}

	public static WebElement OtherCityName(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='txtboxcity']"));
		return Secreterial;
	}

	
	public static WebElement SelectCity(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='branch_cityId_listbox']/li[4]"));
		return Secreterial;
	}
	
	public static WebElement SearchState(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='branch_stateId-list']/span/input"));
		return Secreterial;
	}
	
	public static WebElement ValidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmBranchDetails']/div[2]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement CloseIcon(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[36]"));
		return Secreterial;
	}
	public static WebElement InvalidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmBranchDetails']/div[2]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement ClickStatus(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='ddlCustomerStatus_chosen']"));
		return Secreterial;
	}
	public static WebElement SelectStatus(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='ddlCustomerStatus_chosen']/div/ul/li[1]"));
		return Secreterial;
	}
	public static WebElement ClickEditIcon(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//a[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[6]"));
		return Secreterial;
	}
	public static WebElement ClickEditIcon2(WebDriver driver)
	{
		Secreterial=driver.findElement(By.cssSelector("#gridKendobranchdetils > div.k-grid-content.k-auto-scrollable > table > tbody > tr:nth-child(1) > td.k-command-cell > a.k-button.k-button-icontext.k-grid-Edit.k-gridEditIcon > i"));
		return Secreterial;
	}
	public static WebElement ClickEditIcon1(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//a[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[4]"));
		return Secreterial;
	}
	public static WebElement ClickUploadDoc(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@class='k-button-icontext k-grid-Up k-gridUpload']"));
		return Secreterial;
	}
	public static WebElement SelectFile(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='files']"));
		return Secreterial;
	}
	public static WebElement ClickUpload(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div/div/div[2]/p[2]/button"));
		return Secreterial;
	}
	public static WebElement ClickCloseicon(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[20]"));
		return Secreterial;
	}
	public static WebElement ClickUploadValidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div[1]/div/div/label"));
		return Secreterial;
	}
	
	public static WebElement ClickUploadInValidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div[1]/div/div/lable"));
		return Secreterial;
	}
	
	public static WebElement BankDetailes(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='mytab4']"));
		return Secreterial;
	}
	public static WebElement AddBankDetailes(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='CreateNewAccount']"));
		return Secreterial;
	}
	public static WebElement ClickAccNo(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='txtAccountN0']"));
		return Secreterial;
	}
	public static WebElement ClickBankName(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='txtBankName']"));
		return Secreterial;
	}
	public static WebElement ClickAccType(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmNewBankDetails']/div[3]/div[2]/div[1]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement SelectAccType(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='ddlType_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement ClickSave(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='command_name']"));
		return Secreterial;
	}
	public static WebElement ClickCloseIcon1(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
		return Secreterial;
	}
	public static WebElement ClickOpeningDate(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='dpOpenDate']"));
		return Secreterial;
	}
	public static WebElement ClickRemark1(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='txtRemarks']"));
		return Secreterial;
	}
	public static WebElement ClickClosingDate(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='dpCloseDate']"));
		return Secreterial;
	}
	public static WebElement BankvalidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmNewBankDetails']/div[1]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement BankInvalidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmNewBankDetails']/div[2]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement AccnoBankInavalidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='AccNo_validationMessage']"));
		return Secreterial;
    }
	public static WebElement BankNameBankInavalidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='BankName_validationMessage']"));
		return Secreterial;
	}
	public static WebElement IFSCBankInavalidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='Ifsc_validationMessage']"));
		return Secreterial;
	}
	public static WebElement ClickIfsc(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='Ifsc']"));
		return Secreterial;
	}
	public static WebElement ClickTypeOfAccount(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='AccTypeId_validationMessage']"));
		return Secreterial;
	}
	public static WebElement InvalidOpenDate(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='OpenDate_validationMessage']"));
		return Secreterial;
	}
	public static WebElement InvalidOpenDate1(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmNewBankDetails']/div[3]/div[6]/div/div[2]/span[2]"));
		return Secreterial;
	}
	public static WebElement UpdateBankDetailes(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//a[@class='k-button k-button-icontext k-grid-Edit k-gridEditIcon'])[17]"));
		return Secreterial;
	}
	public static WebElement DeleteBankDetailes(WebDriver driver)
	{
		Secreterial=driver.findElement(By.cssSelector("tbody tr[role='row'] td[id='gridbank_active_cell'] a:nth-child(2) span:nth-child(1) img:nth-child(1)"));
		return Secreterial;
	}
	public static WebElement DeleteBankDetailes1(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='no']"));
		return Secreterial;
	}
	public static WebElement LimitedLiabilityPartnership(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='ddlEntityType_listbox']/li[6]"));
		return Secreterial;
	}public static WebElement LLPEntityName(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtllpEntityName']"));
		return Secreterial;
	}
	public static WebElement LLPPin(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtCINllp']"));
		return Secreterial;
	}
	public static WebElement GSTIN(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtGstnllp']"));
		return Secreterial;
	}
	public static WebElement ClickCalenderIcon(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']"));
		return Secreterial;
	}
	public static WebElement ClickRoc(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='llpRocJurisdiction']"));
		return Secreterial;
	}
	public static WebElement ClickEmailLLP(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtEmailIdllp']"));
		return Secreterial;
	}
	public static WebElement LLPFinancialYear(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='panelbar_LLPDetails']/li/div/div[1]/div/div[3]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement LLPAddressE(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtRegAddressllp1']"));
		return Secreterial;
	}
	public static WebElement LLPAddressC(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtCorpAddress1llp']"));
		return Secreterial;
	}
	public static WebElement LLPStateE(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div[3]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement LLPStateC(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='step1Content']/div[4]/div/div[3]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement LLPCityE(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div[4]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement LLPCityC(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='step1Content']/div[4]/div/div[4]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement LLPPan(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtPANllp']"));
		return Secreterial;
	}
	public static WebElement LLPSaveE(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnllp']"));
		return Secreterial;
	}
	public static WebElement LLPAddress2(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtRegAddress2llp']"));
		return Secreterial;
	}
	public static WebElement LLPSaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateEntityLLP']/div[1]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement LLPSaveMsg2(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateEntityLLP']/div[2]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement FYValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='llpFY_validationMessage']"));
		return Secreterial;
	}
	public static WebElement DateValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='llpIncorporationDate_validationMessage']"));
		return Secreterial;
	}
	public static WebElement RocValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='llpROC_Code_validationMessage']"));
		return Secreterial;
	}
	public static WebElement EmailValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='llpEmail_Id_validationMessage']"));
		return Secreterial;
	}
	public static WebElement PANValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='llpPAN_validationMessage']"));
		return Secreterial;
	}
	public static WebElement AddressValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='llpRegi_Address_Line1_validationMessage']"));
		return Secreterial;
	}
	public static WebElement Address2ValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='llpRegi_Address_Line2_validationMessage']"));
		return Secreterial;
	}
	public static WebElement CompnayNameValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='EntityName_validationMessage']"));
		return Secreterial;
	}
	public static WebElement LLPINValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='LLPIN_validationMessage']"));
		return Secreterial;
	}
	public static WebElement LLPInvalidNameMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='panelbar_LLPDetails']/li/div/div[1]/div/div[1]/span[2]"));
		return Secreterial;
	}
	public static WebElement LLPInvalidPINMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='panelbar_LLPDetails']/li/div/div[1]/div/div[2]/span[2]"));
		return Secreterial;
	}
	public static WebElement UpdateLLPValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateEntityLLP']/div[1]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement EditBALLP(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//a[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[2]"));
		return Secreterial;
	}
	public static WebElement ViewDocLLPDEED(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//a[@class='k-grid-View k-grid-view k-grid-button hoverCircle']"));
		return Secreterial;
	}
	public static WebElement DownloadDocLLPDEED(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//a[@class='k-grid-Download k-grid-download k-grid-button hoverCircle']"));
		return Secreterial;
	}
	public static WebElement DeleteDocLLPDEED(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//a[@class='k-grid-Delete k-grid-delete k-grid-button'])[2]"));
		return Secreterial;
	}
	public static WebElement LicenseRegistrationLLP(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='LICENSE_REGISTRATION']/a"));
		return Secreterial;
	}
	public static WebElement PolicyLLP(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='PolicesDocument']/a"));
		return Secreterial;
	}
	public static WebElement ViewLicenseRegistrationLLP(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div[3]/div/div/div/table/tbody/tr/td[5]/a[2]"));
		return Secreterial;
	}
	public static WebElement DownloadLicenseRegistrationLLP(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div[3]/div/div/div/table/tbody/tr/td[5]/a[1]"));
		return Secreterial;
	}
	public static WebElement DeleteLicenseRegistrationLLP(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div[3]/div/div/div/table/tbody/tr/td[5]/a[3]"));
		return Secreterial;
	}
	public static WebElement AnnualReportLLP(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Annual']/a"));
		return Secreterial;
	}
	public static WebElement ViewAnnualReportLLP(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div[4]/div/div/div/div[2]/table/tbody/tr/td[7]/a[2]"));
		return Secreterial;
	}
	public static WebElement DownloadAnnualReportLLP(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div[4]/div/div/div/div[2]/table/tbody/tr/td[7]/a[1]"));
		return Secreterial;
	}
	public static WebElement DeleteAnnualReportLLP(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/div/div/div/div/div[4]/div/div/div/div[2]/table/tbody/tr/td[7]/a[3]"));
		return Secreterial;
	}
	public static WebElement ViewAnnualReport(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//a[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[9]"));
		return Secreterial;
	}
	public static WebElement DownloadAnnualReport(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//a[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[9]"));
		return Secreterial;
	}
	public static WebElement DeleteAnnualReport(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//a[@class='k-grid-Delete k-grid-delete k-grid-button'])[9]"));
		return Secreterial;
	}
	public static WebElement clickUploadButton(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnUpload']"));
		return Secreterial;
	}
	public static WebElement clickEntityExcel(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//label[text()='Entity Excel']"));
		return Secreterial;
	}
	public static WebElement clickLLPExcel(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//label[text()='LLP-Excel']"));
		return Secreterial;
	}
	public static WebElement clickMGT7Excel(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//label[text()='MGT-7']"));
		return Secreterial;
	}
	public static WebElement clickChooseFile(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='File']"));
		return Secreterial;
	}
	public static WebElement clickUploadButton1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='uploadbutton']"));
		return Secreterial;
	}
	public static WebElement clickCloseIcon(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[16]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement EntityExcelInvalidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/lable"));
		return Secreterial;
	}
	public static WebElement EntityExcelValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]"));
		return Secreterial;
	}
	public static WebElement EntityExcelValidMsg2(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/lable"));
		return Secreterial;
	}
	public static WebElement EntityExcelValidMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/ul/li"));
		return Secreterial;
	}
	public static WebElement ClickImport(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnImport']"));
		return Secreterial;
	}
	public static WebElement CloseBtn(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//a[@aria-label='Close'])[14]"));
		return Secreterial;
	}
	public static WebElement ClickImportChcekbox(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//input[@class='chkbx']"));
		return Secreterial;
	}
	public static WebElement ClickImportSaveBtn(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnSaveAgendaItemSelected']"));
		return Secreterial;
	}
	public static WebElement ValidationOfSaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.cssSelector("div[class='alert alert-success'] lable"));
		return Secreterial;
	}
	public static WebElement ClickImportFilter(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.cssSelector("//*[@id='filterEntityName']"));
		return Secreterial;
	}
	public static WebElement ClickMoreAction(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//span[@class='k-input']"));
		return Secreterial;
	}
	public static WebElement ClickMoreActionApplicability(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[3]"));
		return Secreterial;
	}
	public static WebElement ClickApplicabilityCloseBtn(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnclose1']"));
		return Secreterial;
	}
	public static WebElement ClickMgmtPersonalCloseBtn(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[13]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement ClickShareHoldingDetailesCloseBtn(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[12]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement ClickAmountInINRCrore(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//*[@id='AmountInvariable_listbox']/li[1])[16]"));
		return Secreterial;
	}
	public static WebElement ClickAmountInINRThousand(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//*[@id='AmountInvariable_listbox']/li[2])[3]"));
		return Secreterial;
	}
	public static WebElement ClickAmountInINR(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='divfrmApplicability1']/div/fieldset/div[1]/div[1]/div[2]/span/span/span[1]"));
		return Secreterial;
	}
	public static WebElement ClickAmountInLack(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//li[@class='k-item k-state-selected k-state-focused'])[13]"));
		return Secreterial;
	}
	public static WebElement ClickTurnOver(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Turnover']"));
		return Secreterial;
	}
	public static WebElement ClickNetWorth(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='divAmount']/div/div[3]/div[2]/span[2]/span/input[1]"));
		return Secreterial;
	}
	public static WebElement ClickNetProfit(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='NetProfit']"));
		return Secreterial;
	}
	public static WebElement ClickBorrowings(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Borrowings']"));
		return Secreterial;
	}
	public static WebElement ClickDeposit(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Deposit']"));
		return Secreterial;
	}
	public static WebElement ClickSaveBtn1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='command_name']"));
		return Secreterial;
	}
	public static WebElement ClickSaveApplicabilityMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='divfrmApplicability1']/div[1]/div[2]/div/lable"));
		return Secreterial;
	}
	public static WebElement ClickYesRadioBtn(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='tblDetailsOfSon']/tbody/tr[1]/td[3]/label[1]"));
		return Secreterial;
	}
	public static WebElement ClickNoRadioBtn(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='tblDetailsOfSon']/tbody/tr[1]/td[3]/label[2]"));
		return Secreterial;
	}
	public static WebElement ClickCloseApplicability(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnclose1']"));
		return Secreterial;
	}
	public static WebElement ClickShareHolding(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//*[@id='griDDLActionMenu_listbox']/li[4])[11]"));
		return Secreterial;
	}
	public static WebElement ClickNewBtnShareHolding(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='customCommand']"));
		return Secreterial;
	}
	public static WebElement ClickFOLIONO(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtfollioNo']"));
		return Secreterial;
	}
	public static WebElement ClickNameofthemember(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtmemberName']"));
		return Secreterial;
	}
	public static WebElement ClickNameofjointholders(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtjointholderName']"));
		return Secreterial;
	}
	public static WebElement ClickAddress(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtbodycorporate_Address']"));
		return Secreterial;
	}
	public static WebElement ClickCIN(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtCIN']"));
		return Secreterial;
	}
	public static WebElement ClickSpousename(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtfatherspousename']"));
		return Secreterial;
	}
	public static WebElement ClickEmailId(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtEmail_Id']"));
		return Secreterial;
	}
	public static WebElement ClickOccupation(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtOccupation']"));
		return Secreterial;
	}
	public static WebElement ClickPAN(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtPAN']"));
		return Secreterial;
	}
	public static WebElement ClickDateofbecomingmemberCalender(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Panelbareditcompany']/li[3]/div/div[1]/div/div[1]/span[1]/span/span/span"));
		return Secreterial;
	}
	public static WebElement ClickDateofbecomingmember(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.linkText("1"));
		return Secreterial;
	}
	public static WebElement ClickModeOfShareHolding(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='step1Content']/div[5]/div/div[1]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement selectModeOfShareHolding(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ddlModeofHoldingShares1_listbox']/li[1]"));
		return Secreterial;
	}
	public static WebElement ClickSaveShareHolding(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateDetailsofShareHolding1']/div[2]/div/button[1]"));
		return Secreterial;
	}
	public static WebElement ClickSaveShareHoldingDetailes(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmupdateshareholdindetails']/div[2]/div/button[1]"));
		return Secreterial;
	}
	public static WebElement ClickClassOfShares(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Panelbareditcompany']/li[1]/div/div[1]/div/div[2]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement ClickClassOfShares1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ddlShares_Class_listbox']/li[1]"));
		return Secreterial;
	}
	public static WebElement ClickNominalvaluepershare(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Panelbareditcompany']/li[1]/div/div[1]/div/div[3]/span[2]/span/span[2]/span[1]"));
		return Secreterial;
	}
	public static WebElement ClickTotalsharesheld(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Panelbareditcompany']/li[1]/div/div[1]/div/div[4]/span[2]/span/span[2]/span[1]"));
		return Secreterial;
	}
	public static WebElement ClickType(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement ClickType1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ddltype_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement ClickNationality(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='step1Content']/div[4]/div/div[5]/span[2]/span/span[1]"));
		return Secreterial;
	}
	public static WebElement ClickNationality1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='NationalityId_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement ClickSaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='tabe1']/div[1]/div[2]/div/lable"));
		return Secreterial;
	}
	public static WebElement ClickInvalidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='lblerrormsgI_sub']"));
		return Secreterial;
	}
	public static WebElement ClickSaveMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='lblsuccessI_sub']"));
		return Secreterial;
	}
	public static WebElement ClickCloseBtn(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[13]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement ClickCloseBtn5(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
		return Secreterial;
	}
	public static WebElement ClickCloseBtn1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[24]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement ClickCloseBtnSHD(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("/html/body/div[25]/div[1]/div/a"));
		return Secreterial;
	}
	public static WebElement ClickCloseBtn2(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[10]"));
		return Secreterial;
	}
	public static WebElement ClickShareHoldingDetailes(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Equity']"));
		return Secreterial;
	}
	public static WebElement ClickAddShareHoldingDetailes(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Addshareholdingdetails']"));
		return Secreterial;
	}
	public static WebElement ClickEditShareHoldingDetailes(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='gridKendo']/div[2]/table/tbody/tr[1]/td[8]/a[1]"));
		return Secreterial;
	}
	public static WebElement ClickAddNewShareHoldingDetailes(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Addshareholdingdetails']/span"));
		return Secreterial;
	}
	public static WebElement ClickAllotmentNo(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtAllotmentNo']"));
		return Secreterial;
	}
	public static WebElement ClickDateOfAllotmentCalender(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='PanelbarEdit']/li/div/div[1]/div/div[2]/span/span/span/span"));
		return Secreterial;
	}
	public static WebElement ClickDateOfAllotment(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='dpDated']"));
		return Secreterial;
	}
	public static WebElement ClickNoOfSharesAlloted(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtNoOfShareTransfered']"));
		return Secreterial;
	}
	public static WebElement ClickDistinctivenumbersFroms(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtDistinctiveFroms']"));
		return Secreterial;
	}
	public static WebElement ClickDistinctivenumbersTo(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='DistinctiveTo']"));
		return Secreterial;
	}
	public static WebElement ClickFoliooftransferor(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtFolioOfTransferor']"));
		return Secreterial;
	}
	public static WebElement ClickNameOftransferor(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtNameOfTransferor']"));
		return Secreterial;
	}
	public static WebElement ClickDateofissueCalender(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='PanelbarEdit']/li/div/div[2]/div/div[2]/span/span/span"));
		return Secreterial;
	}
	public static WebElement ClickDateofissue(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.linkText("6"));
		return Secreterial;
	}
	public static WebElement ClickCertificateNo(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtCertificateNo']"));
		return Secreterial;
	}
	public static WebElement ClickLockInPeriod(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtLockInPeriod']"));
		return Secreterial;
	}
	public static WebElement ClickAmountPayable(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='PanelbarEdit']/li/div/div[3]/div/div[1]/div[2]/span[2]/span/span[2]/span[1]"));
		return Secreterial;
	}
	public static WebElement ClickDeemedtobepaid(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='PanelbarEdit']/li/div/div[3]/div/div[1]/div[3]/span/span/span[2]/span[1]"));
		return Secreterial;
	}
	public static WebElement ClickDueAmount(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='PanelbarEdit']/li/div/div[3]/div/div[1]/div[4]/span[2]/span/span[2]/span[1]"));
		return Secreterial;
	}
	public static WebElement ClickIfsharesareissuedforconsiderationotherthancashbrieparticularsthereof(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtThereof']"));
		return Secreterial;
	}
	public static WebElement ClickDateOfTransferCalender(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='PanelbarEdit']/li/div/div[4]/div/div[2]/span/span/span"));
		return Secreterial;
	}
	public static WebElement ClickDateOfTransfer(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.linkText("1"));
		return Secreterial;
	}
	
	public static WebElement ClickDateOfTransfer1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.linkText("12"));
		return Secreterial;
	}
	public static WebElement ClickNoofsharestransferred(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtNumberOfShares']"));
		return Secreterial;
	}
	
	public static WebElement ClickDistinctivenumbersFroms1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtDistinctiveFrom1']"));
		return Secreterial;
	}
	public static WebElement ClickDistinctivenumbersTo1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtDistinctiveTo']"));
		return Secreterial;
	}
	public static WebElement ClickFoliooftransferee(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtFolioOfTransferee']"));
		return Secreterial;
	}
	public static WebElement ClickNameOftransferee(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtNameOfTransferee']"));
		return Secreterial;
	}
	public static WebElement ClickBalanceshares(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtBalanceShare']"));
		return Secreterial;
	}
	public static WebElement ClickRemark(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtRemarks']"));
		return Secreterial;
	}
	public static WebElement ClickCloseBtnShareHoldingDeatiles(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnclosesharedetilas']"));
		return Secreterial;
	}
	public static WebElement ClickUploadBtnShareHolding(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnShareHolding']"));
		return Secreterial;
	}
	public static WebElement ClickUploadBtnShareHoldingDetailes(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnShareDetails']"));
		return Secreterial;
	}
	public static WebElement ClickChooseFileShareHolding(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='File']"));
		return Secreterial;
	}
	public static WebElement ClickUploadBtnShareHolding1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[3]/button"));
		return Secreterial;
	}
	public static WebElement ClickUploadValidationMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
		return Secreterial;
	}

    public static WebElement ClickInvalidUploadValidationMsg(WebDriver driver)		//Method for closing Message Popup
    {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
	  return Secreterial;//*[@id="frmUpdateUploadEntity"]/div[1]/div/div/lable
    }
   public static WebElement WithoutSelectingFileUploadShareHolding(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
	  return Secreterial;
   }
   
   public static WebElement ClickShareHoldingPattern(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='customCommand1']"));
	  return Secreterial;
   }
   public static WebElement ClickCatgoryMaster(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='customCommandcat']"));
	  return Secreterial;
   }
   public static WebElement ClickPromoterandPromoterGroup(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='panelbarAgendaItems_PartA']/li/span"));
	  return Secreterial;
   }
   public static WebElement ClickNumberOfPromoter(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='txtNumberOfPromoter']"));
	  return Secreterial;
   }
   public static WebElement ClickCategorySrNo(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setSrNoNumber(this);'])[1]"));
	  return Secreterial;
   }
   public static WebElement ClickCategorySrNo11(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setSrNoNumber(this);'])[2]"));
	  return Secreterial;
   }
   public static WebElement ClickCategorySrNo12(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setSrNoNumber(this);'])[3]"));
	  return Secreterial;
   }
   public static WebElement ClickCategoryName(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setCategory(this);'])[1]"));
	  return Secreterial;
   }
   public static WebElement ClickCategoryName11(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setCategory(this);'])[2]"));
	  return Secreterial;
   }
   public static WebElement ClickCategoryName12(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setCategory(this);'])[3]"));
	  return Secreterial;
   }
   public static WebElement ClickNonPromoter(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='spanAgendaItemB']"));
	  return Secreterial;
   }
   
   public static WebElement ClickNumberOfNonPromoter(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='txtNumberOfNonPromoter']"));
	  return Secreterial;
   }
   
   public static WebElement ClickCategorySrNo1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setNonProSrNoNumber(this);'])[1]"));
	  return Secreterial;
   }
   public static WebElement ClickCategorySrNo2(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setNonProSrNoNumber(this);'])[2]"));
	  return Secreterial;
   }
   public static WebElement ClickCategorySrNo3(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setNonProSrNoNumber(this);'])[3]"));
	  return Secreterial;
   }
   public static WebElement ClickCategoryName1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setNonProCategory(this);'])[1]"));
	  return Secreterial;
   }
   public static WebElement ClickCategoryName2(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setNonProCategory(this);'])[2]"));
	  return Secreterial;
   }
   public static WebElement ClickCategoryName3(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//input[@onchange='setNonProCategory(this);'])[3]"));
	  return Secreterial;
   }
   public static WebElement ClickSubmitCategoryMaster(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='btnSaveAgendaItemNumber']"));
	  return Secreterial;
   }
   public static WebElement ClickCloseCategoryMaster(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("/html/body/div[24]/div[1]/div/a"));
	  return Secreterial;
   }
   public static WebElement UploadShareholdingCategoryMaster(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='UplaodShareCat']"));
	  return Secreterial;
   }
   public static WebElement ClickUploadShareholdingCategoryMaster(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='btnuploadEntity']"));
	  return Secreterial;
   }
   public static WebElement UploadShareholdingCategoryMasterValidationMsg(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='DivChargeUpload']/div/form/div[1]/div/lable"));
	  return Secreterial;
   }
   public static WebElement CloseBtn1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[9]"));
	  return Secreterial;
   }
   public static WebElement ClickShareholdingHistorical(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='ShareHist']/a"));
	  return Secreterial;
   }
   public static WebElement ClickShareholdingHistoricalStartDate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='ShareHist1']/div[1]/div/div[1]/div[1]/span/span/span"));
	  return Secreterial;
   }
   public static WebElement ClickShareholdingHistoricalEndDate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='ShareHist1']/div[1]/div/div[1]/div[2]/span/span/span/span"));
	  return Secreterial;
   }
   public static WebElement ClickShareholdingHistoricalApplyBtn(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='ShareHist1']/div[1]/div/div[2]/button"));
	  return Secreterial;
   }
   public static WebElement ClickShareholdingHistoricalNoRecordFound(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='GridOfAllShareholdingHist']/div[2]/div[1]/div"));
	  return Secreterial;
   }
   public static WebElement ClickSearchField(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='filterEntityName']"));
	  return Secreterial;
   }
   public static WebElement ClickArrow(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//span[@class='k-icon k-i-filter']"));
	  return Secreterial;
   }
   public static WebElement ClickStartDate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//input[@title='Value']"));
	  return Secreterial;
   }
   public static WebElement ClickEndDate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//input[@title='Additional value']"));
	  return Secreterial;
   }
   public static WebElement ClickFilter1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	  return Secreterial;
   }
   public static WebElement ClickClearBtn(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='clearfillter1']/button"));
	  return Secreterial;
   }
   public static WebElement ClickViewBtn(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@class='k-button-icontext k-grid-Edit k-grid-view']"));
	  return Secreterial;
   }
   public static WebElement ClickDownloadBtn(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@class='k-button-icontext k-grid-Download k-grid-download']"));
	  return Secreterial;
   }
   public static WebElement ClickCloseBtn4(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("/html/body/div[29]/div[1]/div/a"));
	  return Secreterial;
   }
   public static WebElement ClickEditIconSH(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@class='k-button k-button-icontext k-grid-Edit1 k-gridEditIcon']"));
	  return Secreterial;
   }
   public static WebElement ClickCloseBtn3(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='btnclose4']"));
	  return Secreterial;
   }
   public static WebElement ClickDeleteValidationMsg(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='wndDelete']/h5"));
	  return Secreterial;
   }
   public static WebElement ClickShareCertificateBtn(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@class='k-grid-Document k-grid-document k-grid-button']"));
	  return Secreterial;
   }
   public static WebElement ClickSelectTransaction(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div/div[1]/span[2]/span/span[2]"));
	  return Secreterial;
   }
   public static WebElement ClickSelectTransaction1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='AllotmentNo_listbox']/li"));
	  return Secreterial;
   }
   public static WebElement ClickDirectorAutorized(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div/div[2]/span[2]/span/span[2]/span"));
	  return Secreterial;
   }
   public static WebElement SelectDirectorAutorized(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='Director1_listbox']/li"));
	  return Secreterial;
   }
   public static WebElement ClickDirectorAutorized1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div/div[3]/span[2]/span/span[2]/span"));
	  return Secreterial;
   }
   public static WebElement SelectDirectorAutorized1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='Director2_listbox']/li"));
	  return Secreterial;
   }
   public static WebElement ClickAuthorizedSignatory(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[4]/div/div[1]/span[2]/span/span[2]/span"));
	  return Secreterial;
   }
   public static WebElement SelectAuthorizedSignatory(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='AuthSecreatory_listbox']/li"));
	  return Secreterial;
   }
   public static WebElement ClickDateOfIssueCalender(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[4]/div/div[2]/span[2]/span/span/span"));
	  return Secreterial;
   }
   public static WebElement ClickTypeOfShare(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[4]/div/div[3]/span[2]/span/span[2]/span"));
	  return Secreterial;
   }
   public static WebElement SelectTypeOfShare(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='TypeOfShare_listbox']/li[1]"));
	  return Secreterial;
   }
   public static WebElement ValidMsgShareCertificate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[1]/div/div/lable"));
	  return Secreterial;
   }
   public static WebElement InValidMsgShareCertificate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div/div[1]/span[3]"));
	  return Secreterial;//*[@id="frmNewChargeDetails"]/div[1]/div/div/lable
   }
   public static WebElement InValidMsgShareCertificate1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div/div[2]/span[3]"));
	  return Secreterial;
   }
   public static WebElement InValidMsgShareCertificate2(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div/div[3]/span[3]"));
	  return Secreterial;
   }
   public static WebElement InValidMsgShareCertificate3(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[4]/div/div[1]/span[3]"));
	  return Secreterial;
   }
   public static WebElement InValidMsgShareCertificate4(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[4]/div/div[2]/span[3]"));
	  return Secreterial;
   }
   public static WebElement InValidMsgShareCertificate5(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[4]/div/div[3]/span[3]"));
	  return Secreterial;
   }
   public static WebElement ViewShareCertificate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='btnShareCertificatePreview']"));
	  return Secreterial;
   }
   public static WebElement DownloadShareCertificate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='btnShareCertificateDownload']"));
	  return Secreterial;
   }
   public static WebElement NoDataFoundShareCertificate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("/html/body/pre"));
	  return Secreterial;
   }
   public static WebElement ClickManagementPersonnel(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//li[@role='option'][normalize-space()='Management Personnel'])[6]"));
	  return Secreterial;
   }
   public static WebElement ClickManagementPersonnelExportToPDF(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//span[@class='k-icon k-i-file-pdf']"));
	  return Secreterial;
   }
   public static WebElement ClickCommittees(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//body/div[52]/div[1]/div[3]/ul[1]/li[7]"));
	  return Secreterial;
   }
   public static WebElement ClickCommitteeMatrix(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//*[@id='griDDLActionMenu_listbox']/li[8])[11]"));
	  return Secreterial;
   }
   public static WebElement ClickAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	
	Secreterial = driver.findElement(By.xpath("(//*[@id='griDDLActionMenu_listbox']/li[9])[26]"));
	  return Secreterial;
   }
   public static WebElement ClickStatutoryNewBtn(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='StaturoryCreatenew']"));
	  return Secreterial;
   }
   public static WebElement ClickStatutoryYes(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//span[@class='checkmark1']"));
	  return Secreterial;
   }
   public static WebElement ClickNaturOfAppointment(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//span[@class='k-dropdown-wrap k-state-default'])[9]"));
	  return Secreterial;
   }
   public static WebElement SelectNaturOfAppointment(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='txtNature_of_Appointment_listbox']/li[3]"));
	  return Secreterial;
   }
   public static WebElement SelectNaturOfAppointment1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='txtNature_of_Appointment_listbox']/li[6]"));
	  return Secreterial;
   }
   public static WebElement ClickDateOfAppointment(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.linkText("(//span[@class='k-icon k-i-calendar'])[2]"));
	  return Secreterial;
   }
   public static WebElement ClickDateOfAGM(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//span[@class='k-icon k-i-calendar']"));
	  return Secreterial;
   }
   
   public static WebElement FromDate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//span[@class='k-icon k-i-calendar'])[3]"));
	  return Secreterial;
   }
   
   public static WebElement ClickSRN(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='SRN']"));
	  return Secreterial;
   }
   public static WebElement ClickStatutoryNo(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//span[@class='checkmark1'])[6]"));
	  return Secreterial;
   }
   public static WebElement ClickCategoryOfAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='tblStatutoryInfo']/tbody/tr/td[1]/span/span/span[1]"));
	  return Secreterial;
   }
   public static WebElement ClickCategoryOfAuditor1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='ddlCriteria0_listbox']/li[1]"));
	  return Secreterial;
   }
   public static WebElement SelectCategoryOfAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='ddlCriteria0_listbox']/li[3]"));
	 
	  return Secreterial;
   }
   public static WebElement ClickAuditorFirm(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='tblStatutoryInfo']/tbody/tr/td[2]/div/span/span/span[1]"));
	  return Secreterial;
   }
   public static WebElement SelectAuditorFirm(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='AuditDeatilsList_0__Auditor_Id_listbox']/li"));
	  return Secreterial;
   }
   public static WebElement SelectAuditorFirm1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='AuditDeatilsList_0__Auditor_Id_listbox']/li[3]"));
	  return Secreterial;
   }
   public static WebElement ClickNumberofFYforwhichAuditorisappointed(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='tblStatutoryInfo']/tbody/tr/td[4]/span[1]/span/span[1]"));
	  return Secreterial;
   }
   public static WebElement SelectNumberofFYforwhichAuditorisappointed1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='ddlNumberofFY0_listbox']/li[1]"));
	  return Secreterial;
   }
   public static WebElement SelectNumberofFYforwhichAuditorisappointed(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='ddlNumberofFY0_listbox']/li[3]"));
	  return Secreterial;
   }
  
   public static WebElement ClickDueDate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//span[@class='k-icon k-i-calendar'])[4]"));
	  return Secreterial;
   }
   public static WebElement ClickFYStartDateDate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//span[@class='k-icon k-i-calendar'])[5]"));
	  return Secreterial;
   }
   public static WebElement ClickFYLastDateDate(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//span[@class='k-icon k-i-calendar'])[6]"));
	  return Secreterial;
   }
   public static WebElement ClickSaveStatutory(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@name='submitButton']"));
	  return Secreterial;
   }
   public static WebElement ClickValidMsgStatutory(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdatestatutoryAuditor']/div[1]/div/div/lable"));
	  return Secreterial;
   }
   public static WebElement ClickValidMsgStatutory1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdatestatutoryAuditor']/div[2]/div/div/lable"));
	  return Secreterial;
   }
   public static WebElement ClickInValidMsgStatutory(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdatestatutoryAuditor']/div[3]/div/div[5]/div[2]/span[2]"));
	  return Secreterial;
   }
   public static WebElement ClickStatusStatutoryAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='Section1']/div[1]/div/div[1]/div[2]/span/span/span[1]"));
	  return Secreterial;
   }
   
   public static WebElement SearchAuditors(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='filterSTATUTORY']"));
	  return Secreterial;
   }
   
   public static WebElement SearchStatutory(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='filter']"));
	  return Secreterial;
   }
   
   public static WebElement SearchAuditorsIn(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='filteriNTERNAL']"));
	  return Secreterial;
   }
   public static WebElement ClickStatusInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='Section2']/div[1]/div/div[1]/div[2]/span/span/span[1]"));
	  return Secreterial;
   }
   public static WebElement SelectStatusStatutoryAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='Istenuar_listbox']/li[2]"));
	  return Secreterial;
   }
   public static WebElement SelectStatusInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='IstenuarInter_listbox']/li[2]"));
	  return Secreterial;
   }
   public static WebElement ClickClearFilterStatutoryAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='clearfillter']"));
	  return Secreterial;
   }
   public static WebElement ClickClearFilterInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='clearfillterin']"));
	  return Secreterial;
   }
   public static WebElement ClickUpdateStatutoryAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@class='k-button-icontext k-grid-Ed k-gridEdit']"));
	  return Secreterial;
   }
   public static WebElement ClickResignationofAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//a[@class='k-grid-R k-grid-resignation'])[2]"));
	  return Secreterial;
   }
   public static WebElement ClickResignationofInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//a[@class='k-grid-R'])"));
	  return Secreterial;
   }
   public static WebElement ClickLeaveType(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateResignation']/div[1]/div/div[1]/div/div[2]/span[2]/span/span[1]"));
	  return Secreterial;
   }
   public static WebElement SelectLeaveType1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("(//*[@id='ddlLeaveType_listbox']/li[3])"));
	  return Secreterial;
   }
   public static WebElement SelectInternalLeaveType(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='ddlLeaveType_listbox']/li[3]"));
	  return Secreterial;
   }
   public static WebElement ClickDateOfSubmission(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateResignation']/div[1]/div/div[1]/div/div[3]/span[2]/span/span/span"));
	  return Secreterial;
   }
   public static WebElement ClickDated(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateResignation']/div[1]/div/div[1]/div/div[4]/span[2]/span/span/span"));
	  return Secreterial;
   }
   public static WebElement ClickReason(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='textareaResonForLeave']"));
	  return Secreterial;
   }
   public static WebElement ClickUploadDocument(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='files']"));
	  return Secreterial;
   }
   public static WebElement SaveResignation(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='btnregignation']"));
	  return Secreterial;
   }
   public static WebElement SaveValidMsgResignation(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='DivAuditorResignation']/div[1]/div/div/lable"));
	  return Secreterial;
   }
   public static WebElement NatureofAppointment(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='txtNature_of_Appointment-list']/div[1]"));
	  return Secreterial;
   }
   public static WebElement ClickValidAuditorsFirm(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//div[@id='AuditDeatilsList[0].Auditor_Id_validationMessage']"));
	  return Secreterial;
   }
   public static WebElement ClickCloseCommittee(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("/html/body/div[20]/div[1]/div/a"));
	  return Secreterial;
   }
   public static WebElement ClickCancelResignation(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='btnCancelAuditorResignation']"));
	  return Secreterial;
   }
   public static WebElement InvalidMsgResignation(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateResignation']/div[1]/div/div[1]/div/div[3]/span[3]"));
	  return Secreterial;
   }
   public static WebElement InvalidMsgResignation1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateResignation']/div[1]/div/div[1]/div/div[4]/span[3]"));
	  return Secreterial;
   }
   public static WebElement InvalidMsgResignation2(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='LeaveType_validationMessage']"));
	  return Secreterial;
   }
   public static WebElement InvalidMsgResignation3(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='DateOfResignation_validationMessage']"));
	  return Secreterial;
   }
   public static WebElement NewInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='InternalCreatenew']"));
	  return Secreterial;
   }
   public static WebElement ClickInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='mytab2']/a"));
	  return Secreterial;
   }
   public static WebElement ClickInternalAuditorCategory(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[1]/div[1]/span[2]/span/span[1]"));
	  return Secreterial;
   }
   public static WebElement SelectInternalAuditorCategory(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='ddlCriteria_listbox']/li[2]"));
	  return Secreterial;
   }
   public static WebElement ClickInternalAuditorName(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[1]/div[2]/span[2]/span/span[1]"));
	  return Secreterial;
   }
   public static WebElement SelectInternalAuditorName(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='Auditor_Id_listbox']/li"));
	  return Secreterial;
   }
   public static WebElement SelectInternalAuditorName1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='Auditor_Id_listbox']/li[1]"));
	  return Secreterial;
   }
   public static WebElement ClickFYInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[1]/div[3]/span[2]/span/span[1]"));
	  return Secreterial;
   }
   public static WebElement SelectFYInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='FYID_listbox']/li[1]"));
	  return Secreterial;
   }
   public static WebElement ClickDateOfAppointmentIA(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[1]/div[4]/span[2]/span/span/span"));
	  return Secreterial;
   }
   public static WebElement ClickWhetherEmployee(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='divEmployee']/div[1]/span[2]/span/span[1]"));
	  return Secreterial;
   }
   public static WebElement SelectWhetherEmployee(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='ddlIsEmployee_listbox']/li[2]"));
	  return Secreterial;
   }
   public static WebElement ClickEmployeeNo(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='txtEmployeeNo']"));
	  return Secreterial;
   }
   public static WebElement ClickSaveIA(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='btnllp']"));
	  return Secreterial;
   }
   public static WebElement InValidMsgInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[2]/div/div/lable"));
	  return Secreterial;
   }

   public static WebElement ValidMsgInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[1]/div/div/lable"));
	  return Secreterial;
   }
   public static WebElement InvalidMsgInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='InternalAuditor_CategoryId_validationMessage']"));
	  return Secreterial;
   }
   public static WebElement InvalidMsgInternalAuditor1(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@id='Date_of_appointment_validationMessage']"));
	  return Secreterial;
   }
   public static WebElement EditInternalAuditor(WebDriver driver)		//Method for closing Message Popup
   {
	  Secreterial = driver.findElement(By.xpath("//*[@class='k-button-icontext k-grid-Et k-gridEdit']"));
	  return Secreterial;
   }
   public static WebElement  Auditors(WebDriver driver)		//Method for closing Message Popup
	{
	   Secreterial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[9]"));
		return Secreterial;                     
	}
	
	public static WebElement  SecretarialAuditor(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='mytab3']"));
		return Secreterial;                     
	}
	
	public static WebElement  SAAddNew(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='SecreterialCreatenew']"));
		return Secreterial;                     
	}
	
	public static WebElement  SACategory(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[1]/div/div[1]/span[2]/span/span[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  SAIndividual(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ddlCriteria_listbox']/li[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  SAAuditorFirm(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ddlCriteria_listbox']/li[3]"));
		return Secreterial;                     
	}
	
	
	public static WebElement  SAauditorfirmName(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[1]/div/div[2]/span[2]/span/span[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  SAauditorfirmNameLi(WebDriver driver)		//Method for closing Message Popup
	{
		//Secreterial = driver.findElement(By.xpath("//*[@id='AuditorID_listbox']/li[1]"));
		Secreterial = driver.findElement(By.xpath("//*[@id='AuditorID_listbox']/li"));
		return Secreterial;                     
	}
	
	public static WebElement  Certificate_of_Practice(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtCertificateofPractice']"));
		return Secreterial;                     
	}
	
	public static WebElement   NameofPracticingCompany(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtPracticingCompSec']"));
		return Secreterial;                     
	}
	
	public static WebElement  FYPOA(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[3]/div/div[1]/span[2]/span/span[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  FYPOA1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='FYID_listbox']/li[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  Natureofappointment(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[4]/div/div[1]/span[2]/span/span[2]/span"));
		return Secreterial;                     
	}
	
	public static WebElement  Natureofappointment1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Nature_Of_Appointment_listbox']/li[3]"));
		return Secreterial;                     
	}
	
	public static WebElement  TermofAuditor(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[4]/div/div[2]/span[2]/span/span[2]/span"));
		return Secreterial;                     
	}
	
	public static WebElement  TermofAuditor1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='TermOfAuditor_listbox']/li[2]"));
		return Secreterial;                     
	}
	
	public static WebElement    AppointedforNoofYears(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[4]/div/div[3]/span[2]/span/span[2]/span"));
		return Secreterial;                     
	}
	
	public static WebElement  AppointedforNoofYears1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='No_Of_Years_Appointed_listbox']/li[2]"));
		return Secreterial;                     
	}
	
	public static WebElement    AGNoTillAppointed(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='AGM_NoTill_Appointed']"));
		return Secreterial;                     
	}
	
	
	
	
	public static WebElement  DOA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[3]/div/div[2]/span[2]/span/span/span"));
		return Secreterial;                     
	}
	
	public static WebElement  FYstartDate(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[5]/div/div[1]/span[2]/span/span/span"));
		return Secreterial;                     
	}
	
	public static WebElement  FYEndDate(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[5]/div/div[2]/span[2]/span/span/span"));
		return Secreterial;                     
	}
	
	public static WebElement  DateofAppointment(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[5]/div/div[3]/span[2]/span/span/span"));
		return Secreterial;                     
	}
	
	public static WebElement  DOA16(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//a[@title='Thursday, April 03, 2025']"));
		return Secreterial;                     
	}
	
	public static WebElement  DOA161(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.linkText("15"));
		return Secreterial;                     
	}
	public static WebElement  NameOfPractice(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtPracticingCompSec']"));
		return Secreterial;                     
	}
	public static WebElement  MembershipType(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='DivSecreterialAuditorDtlsforlistedentity']/div/div[1]/span[2]/span/span[1]"));
		return Secreterial;                     
	}
	public static WebElement  ACSFCSno(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtACSFCSNo']"));
		return Secreterial;                     
	}
	public static WebElement  Place(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtPlace']"));
		return Secreterial;                     
	}
	public static WebElement  SelectMembershipType(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ddlMembershipType_listbox']/li[2]"));
		return Secreterial;                     
	}
	public static WebElement  SaveMsgSA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[1]/div/div/lable"));
		return Secreterial;                     
	}
	
	public static WebElement  SaveAEMsgSA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[2]/div/div/lable"));
		return Secreterial;                     
	}
	public static WebElement  SaveAEMsgCA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[2]/div/div/lable"));
		return Secreterial;                     
	}
	
	public static WebElement  AGMDueDatetillwhichAppointment(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[6]/div/div/span[2]/span/span/span"));
		return Secreterial;                     
	}
	
	public static WebElement  CertificateNumber(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='CertificateNumber']"));
		return Secreterial;                     
	}
	
	public static WebElement  DateofIssue(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[8]/div/div[2]/span[2]/span/span/span"));
		return Secreterial;                     
	}
	
	public static WebElement  CertificateValidUpto(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[8]/div/div[3]/span[2]/span/span/span"));
		return Secreterial;                     
	}
	
	public static WebElement  SaveSA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnllp']"));
		return Secreterial;               
	}
	
	public static WebElement  CloseSA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnclose2']"));
		return Secreterial;                     
	}
	
	public static WebElement  DOAVal(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Date_of_appointment_validationMessage']"));
		return Secreterial;                     
	}
	
	public static WebElement  CategoryVal(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Category_of_SecreterialAuditor_validationMessage']"));
		return Secreterial;                     
	}
	
	public static WebElement  Status_All(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Section3']/div[1]/div/div[1]/div[2]/span/span/span[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  Status_All4(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Section4']/div[1]/div/div[1]/div[2]/span/span/span[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  Current(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Istenuarsec_listbox']/li[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  Current4(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Istenuarcost_listbox']/li[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  ClearBtn(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='clearfilltersc']"));
		return Secreterial;                     
	}
	
	public static WebElement  ClearBtn4(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='clearfilltercost']"));
		return Secreterial;                     
	}
	
	
	public static WebElement  Edit(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@class='k-button-icontext k-grid-Edit k-gridEdit']"));
		return Secreterial;                     
	}
	
	public static WebElement  searchCost(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='filtercost']"));
		return Secreterial;                     
	}
	
	
	public static WebElement  ResignationofAuditor(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("(//*[@class='k-grid-R k-grid-resignation'])[4]"));
		return Secreterial;  
	}
	
	
	public static WebElement  ResignationofAuditorCA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.cssSelector("#gridKendoCost > div.k-grid-content.k-auto-scrollable > table > tbody > tr:nth-child(1) > td.k-command-cell > a.k-grid-R > span > img"));
		return Secreterial;                     
	}
	
	public static WebElement  LeaveType(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateResignation']/div[1]/div/div[1]/div/div[2]/span[2]/span/span[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  Resignation(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ddlLeaveType_listbox']/li[3]"));
		return Secreterial;                     
	}
		
	public static WebElement  Dateofsubmission(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateResignation']/div[1]/div/div[1]/div/div[3]/span[2]/span/span/span"));
		return Secreterial;                     
	}
	
	public static WebElement  Dated(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateResignation']/div[1]/div/div[1]/div/div[4]/span[2]/span/span/span"));
		return Secreterial;                     
	}
	
	public static WebElement  Dated20(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.linkText("20"));
		return Secreterial;                     
	}
	
	public static WebElement  Reason(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='textareaResonForLeave']"));
		return Secreterial;                     
	}
	
	public static WebElement  ChooseFileRA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='files']"));
		return Secreterial;                     
	}
	
	public static WebElement  SaveRA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnregignation']"));
		return Secreterial;                     
	}
	
	public static WebElement  SaveMsgRA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='DivAuditorResignation']/div[1]/div/div/lable"));
		return Secreterial;                     
	}
	
	public static WebElement  Cancel(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnCancelAuditorResignation']"));
		return Secreterial;                     
	}
	
	public static WebElement  CloseRA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnclose2']"));
		return Secreterial;                     
	}
	
	public static WebElement  LeaveVal(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='LeaveType_validationMessage']"));
		return Secreterial;                     
	}
	
	public static WebElement  DatedVal(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='DateOfResignation_validationMessage']"));
		return Secreterial;                     
	}
	
	public static WebElement  CostAuditor(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='mytab4']"));
		return Secreterial;                     
	}
	
	public static WebElement  CostAuditorNew(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='CostAuditorCreatenew']"));
		return Secreterial;                     
	}
	
	public static WebElement  NatureofIntimation(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[3]/div/div[1]/div/div[1]/span[2]/span/span[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  Originalappointment(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ddlNatuerofIntemateCost_listbox']/li[2]"));
		return Secreterial;                     
	}
	
	public static WebElement  CategoryCA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[3]/div/div[1]/div/div[2]/span[2]/span/span[2]"));
		return Secreterial;                     
	}
	
	public static WebElement IndividualCA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ddlCriteria_listbox']/li[2]"));
		return Secreterial;                     
	}
	
	public static WebElement AuditorCA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='ddlCriteria_listbox']/li[3]"));
		return Secreterial;                     
	}
	
	public static WebElement AuditorName(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[3]/div/div[1]/div/div[3]/span[2]/span/span[2]"));
		return Secreterial;                     
	}
	
	public static WebElement AuditorName1(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='AuditorId_listbox']/li"));
		return Secreterial;                     
	}
	
	public static WebElement AuditorName2(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='AuditorId_listbox']/li[1]"));
		return Secreterial;                     
	}
	
	
	public static WebElement NameoftheCostauditor(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtCost_auditor_firm_Original']"));
		return Secreterial;                     
	}
	
	public static WebElement Dateboardmeeting(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[3]/div/div[2]/div/div[2]/span[2]/span/span/span"));
		return Secreterial;                     
	}
	
	public static WebElement Dateboardmeeting15(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.linkText("15"));
		return Secreterial;                     
	}
	
	public static WebElement ResulationNumber(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='txtResulationNumber']"));
		return Secreterial;                     
	}
	
	public static WebElement FYNo(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[3]/div/div[3]/div/div/span[2]/span/span[2]"));
		return Secreterial;                     
	}
	
	public static WebElement FYNo2223(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='FYID_listbox']/li[2]"));
		return Secreterial;                     
	}
	
	public static WebElement SaveCA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnllp']"));
		return Secreterial;                     
	}
	
	public static WebElement CloseCA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnclose2']"));
		return Secreterial;                     
	}
	
	public static WebElement SaveMsgCA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[1]/div/div/lable"));
		return Secreterial;                     
	}
	
	public static WebElement SaveMsgCA1(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[2]/div/div/lable"));
		return Secreterial;                     
	}
	
	public static WebElement AuditorNameVal(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='AuditorId_validationMessage']"));
		return Secreterial;                     
	}
	
	public static WebElement LLPVal(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Cost_auditor_firm_Original_validationMessage']"));
		return Secreterial;                     
	}
	
	public static WebElement NatureIntimationVal(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='Nature_of_intimation_cost_validationMessage']"));
		return Secreterial;                     
	}
	
	public static WebElement EditCA(WebDriver driver)		
	{
		Secreterial = driver.findElement(By.xpath("(//*[@class='k-button k-button-icontext k-grid-Edit k-gridEditIcon'])[5]"));
		return Secreterial;                     
	}
	public static WebElement  EntityCap (WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='main-content']/header/div[1]/ul/li[1]/a"));
		return Secreterial;
	}
	public static WebElement  clickStatutoryRegistor (WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[10]"));
		return Secreterial;
	}
	public static WebElement  clickMBP4(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='mytab13']/a"));
		return Secreterial;
	}
	public static WebElement  clickUploadBtn(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//*[@id='btnUplaodDeposit'])[2]"));
		return Secreterial;
	}
	public static WebElement  clickUploadBtn1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//button[@type='submit']"));
		return Secreterial;
	}
	public static WebElement  clickUploadfileInValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement  clickUploadfileValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement SelectFile1(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='File']"));
		return Secreterial;
	}
	public static WebElement clickInvalidMsg(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
		return Secreterial;
	}
	public static WebElement clickOld(WebDriver driver)
	{
		Secreterial=driver.findElement(By.cssSelector("label[for='IsExistingMBP4_2']"));
		return Secreterial;
	}
	public static WebElement clickGenerateRegistor(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//*[@id='btnGenerateDeposit'])[2]"));
		return Secreterial;
	}
	public static WebElement clickExistingDropdown(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='divExistingMBP4']/span/span/span[2]/span"));
		return Secreterial;
	}
	public static WebElement clickOldDropdown(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='divOldMBP4']/span/span/span[2]/span"));
		return Secreterial;
	}
	public static WebElement clickExistingDropdown1(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='ddlDirectorMBP4_listbox']/li[3]"));
		return Secreterial;
	}
	public static WebElement clickDownloadBtn(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//button[normalize-space()='Download'])[1]"));
		return Secreterial;
	}
	public static WebElement clickOldBtn(WebDriver driver)
	{
		Secreterial=driver.findElement(By.cssSelector("label[for='IsCheckregisterMBP4_2']"));
		return Secreterial;
	}
	public static WebElement clickOldDropdown1(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='ddlPastDirectorMBP4_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement clickAllBtn(WebDriver driver)
	{
		Secreterial=driver.findElement(By.cssSelector("label[for='IsCheckregisterMBP4_3']"));
		return Secreterial;
	}
	public static WebElement clickViewBtn(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//button[@id='btnDirectorRegisters'])[4]"));
		return Secreterial;
	}
	public static WebElement clickViewPage(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("//*[@id='wndDocViewer_wnd_title']"));
		return Secreterial;
	}
	public static WebElement clickViewClosePage(WebDriver driver)
	{
		Secreterial=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[17]"));
		return Secreterial;
	}
	public static WebElement  clickPASTROD(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='mytab10']/a"));
		return Secreterial;
	}
	public static WebElement  clickPASTRODUpload(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnUploadPastdirector']"));
		return Secreterial;
	}
	public static WebElement clickPASTRODUploadButton(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[2]/button"));
		return Secreterial;
	}
	public static WebElement clickPASTRODValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/ul/li/label"));
		return Secreterial;//*[@id="frmUpdateUploadEntity"]/div[1]/div/div/ul/li/label
	}
	public static WebElement  clickPASTRODInValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/ul/li/label"));
		return Secreterial;
	}
	public static WebElement  clickPASTRODInValidMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/ul"));
		return Secreterial;
	}
	public static WebElement  clickPASTRODGenerateRegostor(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='btnGeneratePastdirector']"));
		return Secreterial;
	}
	public static WebElement  clickPASTRODGenerateRegostorDropdown(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='wndRegisterPastROD']/div/div/div/table/tbody/tr/td[1]/div/span/span/span[1]"));
		return Secreterial;
	}
	public static WebElement  clickPASTRODGenerateRegostorDropdown1(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("(//*[@id='ddlDirector_listbox']/li[2])"));
		return Secreterial;
	}
	
	public static WebElement  LogoUpload(WebDriver driver)		//Method for closing Message Popup
	{
		Secreterial = driver.findElement(By.xpath("//*[@id='files1']"));
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
