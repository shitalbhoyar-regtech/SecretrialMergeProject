package secretrial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator {
	
 

private static WebElement secretrial = null;				//WebElement variable created for 'Categories' click
	
	private static List<WebElement> secretrialList = null;		
	

	public static WebElement Master(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']/a/img"));
		return secretrial;
	}
	
	public static  List<WebElement> EditPL(WebDriver driver)		//Method for closing Message Popup
	{
		secretrialList = driver.findElements(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])"));
		return secretrialList;
	}
	
	public static  List<WebElement> DeletePL(WebDriver driver)		//Method for closing Message Popup
	{
		secretrialList = driver.findElements(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])"));
		return secretrialList;
	}
	
	public static WebElement Entity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']/ul/li[3]/a/span"));
		return secretrial;
	}
	
	public static WebElement EntityEdit(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button']"));
		return secretrial;
	}

	public static WebElement BusinessActivity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytabBA']/a"));
		return secretrial;
	}

	public static WebElement AddNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnAddActivity']"));
		return secretrial;
	}
	
	public static WebElement MainActivityCode(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmBusinessActivity']/div[1]/div/span[2]/span/span[1]"));
		return secretrial;
	}

	public static WebElement  Agricultureforestryfishing(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MainActivityCode_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement  BusinessActivity1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmBusinessActivity']/div[2]/div/span[2]/span/span[1]"));
		return secretrial;
	}
	
	public static WebElement  Productionofcropsandanimals(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='BusinessActivityCode_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement  Save(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='command_name']"));
		return secretrial;
	}
	
	public static WebElement  SaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmBusinessActivity']/div[1]/div/div/lable"));
		return secretrial;                      
	}
	
	public static WebElement  ClosePop(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[13]"));
		return secretrial;
	}
	
	public static WebElement  ClosePopEntity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[5]"));
		return secretrial;
	}
	
	public static WebElement  EditBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[11]"));
		return secretrial;
	}
	
	public static WebElement  EditBAPL(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[6]"));
		return secretrial;
	}
	
	public static WebElement  ExtractionofCrudePetroleumNaturalgas(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='BusinessActivityCode_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  Percentage(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Percentages']"));
		return secretrial;
	}
	
	public static WebElement  DeleteBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Delete k-grid-delete hoverCircle k-grid-button']"));
		return secretrial;                        
	}
	
	public static WebElement  YesBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='yesBA']"));
		return secretrial;
	}
	
	public static WebElement  ClickArrow(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-more-vertical'])[5]"));
		return secretrial;
	}
	
	public static WebElement  ClickFilter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-item k-filter-item k-state-default k-last'])[5]"));
		return secretrial;
	}
	
	public static WebElement  Search(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-textbox k-space-right'])[5]"));
		return secretrial;
	}
	
	public static WebElement  CheckBox(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-item k-state-focused']/label/input"));
		return secretrial;
	}
	
	public static WebElement  ClickFilter1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-primary'])[5]"));
		return secretrial;
	}
	
	public static WebElement  Documents(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab2']"));
		return secretrial;
	}
	
	
	public static WebElement AddNewDocuments(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='customCommand1']"));
		return secretrial;
	}
	
	public static WebElement Type(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[3]/div/div[1]/div/div[2]/span/span"));
		return secretrial;
	}
	
	public static WebElement TypeAOA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement TypeMOA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement TypeCOI(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement TypePolicy(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[4]"));
		return secretrial;
	}
	
	
	public static WebElement LicenseRegistration(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[5]"));
		return secretrial;
	}
	
	public static WebElement AnnualReport(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DocumentType_listbox']/li[6]"));
		return secretrial;
	}
	
	public static WebElement LicenseNo(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='LicenceNo']"));
		return secretrial;
	}
	
	public static WebElement LastRenewDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='BMDate']"));
		return secretrial;
	}
	
	public static WebElement UpcomingRenewDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='GMDate']"));
		return secretrial;
	}
	
	
	public static WebElement Description(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Discription']"));
		return secretrial;
	}
	
	public static WebElement Upload(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='files1']"));
		return secretrial;
	}
	
	public static WebElement SaveDoc(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[10]"));
		return secretrial;
	}
	
	public static WebElement SaveDoc1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[11]"));
		return secretrial;
	}
	
	public static WebElement SaveDocMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement SaveDocMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[2]/div/div/lable"));
		return secretrial;
	}
	
	
	public static WebElement Close(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[18]"));
		return secretrial;
	}
	
	public static WebElement Download(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle']"));
		return secretrial;
	}
	
	public static WebElement DownloadPolicy(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[11]"));
		return secretrial;
	}
	
	public static WebElement DownloadPolicy1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[6]"));
		return secretrial;
	}
	
	public static WebElement DownloadLicense(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[11]"));
		return secretrial;
	}
	
	public static WebElement DownloadLicense1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[12]"));
		return secretrial;
	}
	
	public static WebElement DownloadLicenseLC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[7]"));
		return secretrial;
	}
	
	public static WebElement DownloadLicenseLC1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[8]"));
		return secretrial;
	}
	
	
	public static WebElement DownloadAR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[11]"));
		return secretrial;
	}
	
	public static WebElement DownloadAR1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[13]"));
		return secretrial;
	}
	
	public static WebElement DownloadARLC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[6]"));
		return secretrial;
	}
	
	public static WebElement DownloadARLC1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle'])[8]"));
		return secretrial;
	}
	
	
	public static WebElement View(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle']"));
		return secretrial;
	}
	
	public static WebElement ViewPolicy(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[11]"));
		return secretrial;
	}
	
	public static WebElement ViewPolicy1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[6]"));
		return secretrial;
	}
	
	public static WebElement ViewLICENSE_REGISTRATION(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[12]"));
		return secretrial;
	}
	
	public static WebElement ViewLICENSE_REGISTRATION1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[12]"));
		return secretrial;
	}
	
	public static WebElement ViewLICENSE_REGISTRATIONLC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[7]"));
		return secretrial;
	}
	
	public static WebElement ViewLICENSE_REGISTRATIONLC1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[8]"));
		return secretrial;
	}
	
	
	public static WebElement ViewAnnual(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[11]"));
		return secretrial;
	}
	
	public static WebElement ViewAnnual1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[13]"));
		return secretrial;
	}
	
	public static WebElement ViewAnnualLC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[8]"));
		return secretrial;
	}
	
	public static WebElement ViewAnnualLC1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[6]"));
		return secretrial;
	}
	
	public static WebElement ViewMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='wndDocViewer_wnd_title']"));
		return secretrial;
	}
	
	public static WebElement Viewclose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[14]"));
		return secretrial;
	}
	
	public static WebElement DocDelete(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Delete k-grid-delete k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement DocDeletePolicy(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[11]"));
		return secretrial;
	}
	
	public static WebElement DocDeletePolicy1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[6]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteLICENSE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[11]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteLICENSE1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[12]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteLICENSElc(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[7]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteLICENSElc1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[8]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteAR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[11]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteAR1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[13]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteARLC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[8]"));
		return secretrial;
	}
	
	public static WebElement DocDeleteARLC1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[6]"));
		return secretrial;
	}
	
	
	public static WebElement DocDeletemsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='modalWindow']/h5"));
		return secretrial;
	}
	
	public static WebElement DocDeleteYes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='yes']"));
		return secretrial;
	}
	
	public static WebElement ClickDashboard(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='leftdashboardmenu']"));
		return secretrial;
	}
	
	public static WebElement BankDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab4']"));
		return secretrial;
	}
	
	public static WebElement New(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CreateNewAccount']"));
		return secretrial;
	}
	
	public static WebElement AccountNo(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AccNo']"));
		return secretrial;
	}
	
	public static WebElement  NameofBank(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='BankName']"));
		return secretrial;
	}
	
	public static WebElement  TypeOfAccount(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewBankDetails']/div[3]/div[3]/div/div[2]/span/span/span[1]"));
		return secretrial;
	}
	
	public static WebElement  Savingsaccount(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlType_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  OpeningDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='dpOpenDate']"));
		return secretrial;
	}
	
	public static WebElement  SaveBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='command_name']"));
		return secretrial;
	}
	
	public static WebElement  SaveBDMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewBankDetails']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  CloseBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
		return secretrial;
	}
	
	public static WebElement  InvalidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error']"));
		return secretrial;
	}
	
	public static WebElement  InvalidMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[2]"));
		return secretrial;
	}
	
	public static WebElement  InvalidMsg2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[3]"));
		return secretrial;
	}
	
	public static WebElement  InvalidMsg3(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[4]"));
		return secretrial;
	}
	
	public static WebElement  EditBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[16]"));
		return secretrial;
	}
	
	public static WebElement  IFSC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Ifsc']"));
		return secretrial;
	}
	
	public static WebElement  DeleteBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-delete k-grid-cancel hoverCircle k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement  Yes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='yes']"));
		return secretrial;
	}
	
	public static WebElement  No(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='no']"));
		return secretrial;
	}
	
	public static WebElement  EntityView(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-View k-grid-view hoverCircle k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement  CompanyMasterDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='windowReportViewer']/div/div[2]/div[2]/div[1]/div[3]/div[1]/div/div/div[1]/div/div[6]/div"));
		return secretrial;
	}
	
	public static WebElement  CloseView(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-close'])[54]"));
		return secretrial;
	}
	
	public static WebElement  MoreAction(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-dropdown-wrap k-state-default']"));
		return secretrial;
	}
	
	public static WebElement  RelatedCompanies(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement  RelatedCompaniesClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btncloseCompanySubType']"));
		return secretrial;
	}
	
	public static WebElement  RelatedCompaniesVali(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='wndCompanySubTpe_wnd_title']"));
		return secretrial;
	}
	
	public static WebElement  Capital(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  AddNewRC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='wndCompanySubTpe']/div/div/div[2]/div/div[3]/button"));
		return secretrial;
	}
	
	public static WebElement  CIN(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CIN']"));
		return secretrial;
	}
	
	public static WebElement  NameOfCompany(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='KendoGridEntitySubType']/div[2]/table/tbody/tr[1]/td[2]"));
		return secretrial;
	}
	
	public static WebElement  NameOfCompanyText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='SubCompanyName']"));
		return secretrial;
	}
	
	public static WebElement  SaveRC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnSaveCompanySubType']"));
		return secretrial;
	}
	
	public static WebElement  SaveRCMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divgridNewMessage']/div/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  SharesHeld(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='KendoGridEntitySubType']/div[2]/table/tbody/tr[1]/td[4]"));
		return secretrial;
	}
	
	public static WebElement  SharesHeldText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PersentageofShareholding']"));
		return secretrial;
	}
	
	public static WebElement  validationRC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PersentageofShareholding_validationMessage']"));
		return secretrial;
	}
	
	public static WebElement  search(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterassosiate']"));
		return secretrial;
	}
	
	public static WebElement  searchText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='KendoGridEntitySubType']/div[2]/table/tbody/tr/td[1]"));
		return secretrial;
	}
	
	public static WebElement  DeleteRc(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='KendoGridEntitySubType']/div[2]/table/tbody/tr[1]/td[5]/a"));
		return secretrial;
	}
	
	public static WebElement  AuthorizedCapitalIn (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAuthorizedCapital']/div/div/div/div[2]/span[1]/span/span[2]/span[1]"));
		return secretrial;
	}
	
	public static WebElement  SaveC (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='home']"));
		return secretrial;
	}
	
	public static WebElement  SaveCMsg (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divfrmUpdateAuthorizedCapital']/div/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  EntityCap (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='main-content']/header/div[1]/ul/li[1]/a"));
		return secretrial;
	}
	
	public static WebElement  AuthorizedCapital(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-link k-link-increase']"));
		return secretrial;
	}
	
	public static WebElement  PreferenceShareCapital(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab3']"));
		return secretrial;
	}
	
	public static WebElement  PreferenceShareCapitalYes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmPrif']/div[3]/div/div[2]/label[1]"));
		return secretrial;
	}
	
	public static WebElement  ClassofSecurities(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tblClassPShares']"));
		return secretrial;
	}
	
	public static WebElement  PreferancecapitalType(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-dropdown-wrap k-state-default'])[2]"));
		return secretrial;
	}
	
	public static WebElement  OptionallyConvertible(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-item k-state-selected k-state-focused'])[2]"));
		return secretrial;
	}
	
	public static WebElement  AuthorisedCapital(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-formatted-value text-right txtpAuthorisedCapital1Equ k-input k-valid valid']"));
		return secretrial;
	}
	
	public static WebElement  PageAuthorizationTab(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("//*[@id='Mastermenu']/ul/li[7]/a"));
		return secretrial;
	}
	
	public static WebElement  MasterMenu(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']"));
		return secretrial;
	}
	
	public static WebElement  SelectRole(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-60-down'])[1]"));
		return secretrial;
	}
	
	public static List<WebElement>  SelectDropdownOption(WebDriver driver)		//Method for closing Message Popup
	{
		secretrialList = driver.findElements(By.xpath("//*[@id='RoleId_listbox']/li"));
		return secretrialList;
	}
	
	public static WebElement  SelectUser(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//span[@class='k-icon k-i-arrow-60-down'])[2]"));
		return secretrial;
	}
	
	public static List<WebElement>  SelectUserDropdownOption(WebDriver driver)		//Method for closing Message Popup
	{
		secretrialList = driver.findElements(By.xpath("//*[@id='UserId_listbox']/li[2]"));
		return secretrialList;
	}
	
	public static WebElement  viewIcon(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//input[@type='checkbox'])[5]"));
		return secretrial;
	}
	
	public static WebElement  addIcon(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		return secretrial;
	}
	
	public static WebElement  editIcon(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
		return secretrial;
	}
	
	public static WebElement  deleteIcon(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		return secretrial;
	}
	
	public static WebElement  SavePA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//button[@name='submitButton']"));
		return secretrial;
	}
	
	public static WebElement  SavePAmsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='success']/div/div/strong"));
		return secretrial;
	}
	
	public static WebElement  UserEntityAssignmenMaster(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']/ul/li[10]"));
		return secretrial;
	}
	
	public static WebElement  NewBtn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Createnewuserassignment']"));
		return secretrial;
	}
	
	public static WebElement  SelectUserUE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateEntityUserMaster']/div[1]/div/div[2]/span/span/span[1]"));
		return secretrial;
	}
	
	public static WebElement  UserSelectDropdown(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlState_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  SelectEntity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateEntityUserMaster']/div[2]/div[2]/div[1]/div"));
		return secretrial;
	}
	
	public static WebElement  EntitySelectDropdown(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlEntityId_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  BtnSave(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnsave']"));
		return secretrial;
	}
	
	public static WebElement  BtnSaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='window']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  closepopup(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnuserassinmentclose']"));
		return secretrial;
	}
	
	public static WebElement  ClickEdit(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Edit k-grid-edit k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement  ClickAssignment(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Meetings k-grid-compliance']"));
		return secretrial;
	}
	
	public static WebElement  Meeting(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateEntityUserMaster']/div[1]/div[2]/div/div"));
		return secretrial;
	}
	
	public static WebElement  Meeting1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlMeetingType_listbox']/li[4]"));
		return secretrial;
	}
	
	public static WebElement  delete(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-delete k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement  YesUE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='yes']"));
		return secretrial;
	}
	
	public static WebElement  Notes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']/ul/li[12]"));
		return secretrial;
	}
	
	public static WebElement  TextArea(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@autocorrect='off']"));
		return secretrial;
	}
	
	public static WebElement  SaveNotes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNotesFormate']/div[4]/div/button"));
		return secretrial;
	}
	
	public static WebElement  ValidationMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNotesFormate']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement  ApplicabilityClick(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement  ApplicabilityClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose1']"));
		return secretrial;
	}
	
	public static WebElement  AmountinINR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-dropdown-wrap k-state-default'])[12]"));
		return secretrial;
	}
	
	public static WebElement  AmountinINR1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='col-md-6']"));
		return secretrial;
	}
	
	public static WebElement  Lakh(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-item k-state-selected k-state-focused'])[8]"));
		return secretrial;
	}
	
	public static WebElement  Shareholding(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[4]"));
		return secretrial;
	}

	public static WebElement  ShareholdingNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='customCommand']"));
		return secretrial;
	}

	public static WebElement  FOLIONO(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtfollioNo']"));
		return secretrial;
	}
	
	public static WebElement  Classofshares(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-dropdown-wrap k-state-default'])[2]"));
		return secretrial;
	}
	
	public static WebElement  EquityShares(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlShares_Class_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement  Totalsharesheld(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.id("txttotshareheld"));
		return secretrial;
	}
	
	public static WebElement  TypeS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div/span[2]/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement  Individual(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddltype_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  Nameofthemember(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtmemberName']"));
		return secretrial;
	}
	
	public static WebElement  Address(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtbodycorporate_Address']"));
		return secretrial;
	}
	
	public static WebElement  Nationality(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[4]/div/div[5]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  Indian(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NationalityId_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  SaveS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateDetailsofShareHolding1']/div[2]/div/button[1]"));
		return secretrial;
	}
	
	public static WebElement  Email(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtEmail_Id']"));
		return secretrial;
	}
	
	public static WebElement  SaveMsgS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tabe1']/div[1]/div[2]/div/lable"));
		return secretrial;
	}
	
	public static WebElement  CloseS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose4']"));
		return secretrial;
	}
	
	public static WebElement  ErrorMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error']"));
		return secretrial;
	}
	
	public static WebElement  ErrorMsg2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[2]"));
		return secretrial;
	}
	
	public static WebElement  ErrorMsg3(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[3]"));
		return secretrial;
	}
	
	public static WebElement  Validation(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error']"));
		return secretrial;
	}
	
	public static WebElement  Validation1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[2]"));
		return secretrial;
	}
	
	public static WebElement  Validation2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[3]"));
		return secretrial;
	}
	
	public static WebElement  Validation3(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[4]"));
		return secretrial;
	}
	
	public static WebElement  Validation4(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-widget k-tooltip k-tooltip-validation k-invalid-msg field-validation-error'])[5]"));
		return secretrial;
	}
	
	public static WebElement  ValidationBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='BusinessActivityCode-list']/div[4]/div"));
		return secretrial;
	}
	
	
	public static WebElement  ClickTriangle(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-more-vertical'])[8]"));
		return secretrial;
	}
	
	public static WebElement  ClickTriangleBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-more-vertical'])[5]"));
		return secretrial;
	}
	
	
	public static WebElement  Filter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-icon k-i-arrow-60-right k-menu-expand-arrow']"));
		return secretrial;
	}
	
	public static WebElement  FilterBA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-arrow-60-right k-menu-expand-arrow'])[2]"));
		return secretrial;
	}
	
	public static WebElement  SearchBox(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-textbox k-space-right']"));
		return secretrial;
	}
	
	public static WebElement  CheckBoxMoa(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-label'])[2]"));
		return secretrial;
	}
	
	public static WebElement  ClickFiter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-button k-primary']"));
		return secretrial;
	}
	
	public static WebElement  CheckBoxAoa(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-label'])[3]"));
		return secretrial;
	}
	
	public static WebElement  CheckBoxCOI(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-label'])[4]"));
		return secretrial;
	}
	
	public static WebElement  ClickPolicies(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PolicesDocument']"));
		return secretrial;
	}
	
	public static WebElement  LICENSE_REGISTRATION(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='LICENSE_REGISTRATION']"));
		return secretrial;
	}
	
	
	public static WebElement  FY(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divFY']/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  FY2223(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FYID_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  StartTime(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divStartTime']/div/div[2]/span/span/span/span"));
		return secretrial;
	}
	
	public static WebElement  StartTime8(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='startTiming_timeview']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  EndTime(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divEndTime']/div/div[2]/span/span/span/span"));
		return secretrial;
	}
	
	public static WebElement  EndTime8(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EndTiming_timeview']/li[3]"));
		return secretrial;
	}
	
	public static WebElement  Annual(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Annual']"));
		return secretrial;
	}
	
	public static WebElement  BranchDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab3']"));
		return secretrial;
	}
	
	public static WebElement  AddNewBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[7]"));
		return secretrial;
	}
	
	public static WebElement  Name(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tbxName']"));
		return secretrial;
	}
	
	
	public static WebElement  Status(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCustomerStatus_chosen']"));
		return secretrial;
	}
	
	public static WebElement  ACtive(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCustomerStatus_chosen']/div/ul/li[2]"));
		return secretrial;
	}
	
	public static WebElement  BranchType(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlType_chosen']"));
		return secretrial;
	}
	
	public static WebElement  HeadOffice(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlType_chosen']/div/ul/li[4]"));
		return secretrial;
	}
	
	public static WebElement ContactPerson(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tbxContactPerson']"));
		return secretrial;
	}
	
	public static WebElement ContactNumber(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tbxLandline']"));
		return secretrial;
	}
	
	public static WebElement EmailBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tbxEmail']"));
		return secretrial;
	}
	
	public static WebElement AddressBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tbxAddressLine1']"));
		return secretrial;
	}
	
	public static WebElement State(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlState_chosen']"));
		return secretrial;
	}
	
	public static WebElement Maharashtra(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlState_chosen']/div/ul/li[23]"));
		return secretrial;
	}
	
	public static WebElement City(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCity_chosen']"));
		return secretrial;
	}
	
	
	public static WebElement Ahmadnagar(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCity_chosen']/div/ul/li[3]"));
		return secretrial;
	}
	
	public static WebElement ClickSave(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnSave']"));
		return secretrial;
	}
	
	public static WebElement ClickSaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='vsEntityBranchPage']/ul/li"));
		return secretrial;
	}
	
	public static WebElement CloseBranchD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[28]"));
		return secretrial;
	}
	
	public static WebElement ClickSaveMsgInvalid(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='vsEntityBranchPage']/ul"));
		return secretrial;
	}
	
	public static WebElement EditBranchD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[15]"));
		return secretrial;
	}
	
	public static WebElement EditBranchD1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[3]"));
		return secretrial;
	}
	
	
	public static WebElement UploadBranchD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Upload k-grid-upload hoverCircle k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement SelectFile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-button k-upload-button']"));
		return secretrial;
	}
	
	public static WebElement UploadBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div/div/div[2]/p[2]/button"));
		return secretrial;
	}
	
	public static WebElement UploadMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div[1]/div/div/label"));
		return secretrial;                        
	}
	
	public static WebElement UploadMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div[1]/div/div/lable"));
		return secretrial;                        
	}
	
	public static WebElement UploadClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[19]"));
		return secretrial;
	}
	
	public static WebElement InvalidUploadMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div/div/div[2]/div/ul/li/span[3]/span[2]"));
		return secretrial;//*[@id="frmUpdateUploadEntity"]/div[1]/div/div/lable
	}
	
	public static WebElement InvalidUploadMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmAgendaDocumentUpload']/div/div/div[2]/div/ul/li[2]/span[3]/span[2]"));
		return secretrial;
	}
	
	public static WebElement AddNewEP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='btn btn-primary add-button']"));
		return secretrial;
	}
	
	public static WebElement EntityType(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='window']/div[1]/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement PublicLimitedSelect(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlEntityType_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement ListedCompanySelect(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlEntityType_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement CloseEntity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose2']"));
		return secretrial;
	}
	
	
	public static WebElement EntityName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtEntityName']"));
		return secretrial;
	}
	
	public static WebElement CINEntity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCIN']"));
		return secretrial;
	}
	
	public static WebElement CalendorIcon(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_DetailsPrivatepublicCompany']/li/div/div[1]/div[4]/span[2]/span/span/span"));
		return secretrial;
	}
	
	
	public static WebElement Date(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("5"));
		return secretrial;
	}
	
	public static WebElement PAN(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtPan']"));
		return secretrial;
	}
	
	public static WebElement Roc(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_DetailsPrivatepublicCompany']/li/div/div[2]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Ahmedabad(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("Ahmedabad"));
		return secretrial;
	}
	
	
	public static WebElement CompanyCategory(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_DetailsPrivatepublicCompany']/li/div/div[2]/div/div[2]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Companylimitedbyshares(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("Company limited by shares"));
		return secretrial;
	}
	
	public static WebElement EmailE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtEmailId']"));
		return secretrial;
	}
	
	public static WebElement FinancialYear(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_DetailsPrivatepublicCompany']/li/div/div[4]/div/div[2]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement JAnDec(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FY_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement AddressE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtRegAddress1']"));
		return secretrial;
	}
	
	public static WebElement StateE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div/div[1]/div/div[3]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement MaharashtraS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='stateId_listbox']/li[28]"));
		return secretrial;
	}
	
	public static WebElement CityE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div/div[1]/div/div[4]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement AhmadnagarE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlreg_cityId_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement SaveE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='saveppcom']"));
		return secretrial;
	}
	
	public static WebElement SaveEMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdatePublicprivatelisted']/div[1]/div/div/lable"));
		return secretrial;                       
	}
	
	public static WebElement SaveEMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdatePublicprivatelisted']/div[2]/div/div/lable"));
		return secretrial;   //Entity/Company with same CIN already exists                     
	}
	
	public static WebElement Searche(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-textbox'])[31]"));
		return secretrial;                       
	}
	
	public static WebElement InvalidMsgName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EntityName_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgePan(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PAN_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeCIN(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CIN_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='IncorporationDate_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeEmail(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Email_Id_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement DateBox(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='dpIncdate']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeRoc(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ROC_Code_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeFY(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FY_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeAddress(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Regi_Address_Line1_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgeState(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Regi_StateId_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement InvalidMsgecity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Regi_CityId_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement SearchFilter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterSearch']"));
		return secretrial;                     
	}
	
	public static WebElement UpdateMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdatePublicprivatelisted']/div[1]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement RegisteredADD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtbodycorporate_Address']"));
		return secretrial;                     
	}
	
	public static WebElement Pan(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtPAN']"));
		return secretrial;                     
	}
	
	public static WebElement Noofshares(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtshares_abeyance']"));
		return secretrial;                     
	}
	
	public static WebElement ValiPan(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PAN_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement ValiShaAb(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='shares_abeyance_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement DebentureHolding(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[5]"));
		return secretrial;                     
	}
	
	public static WebElement SearchDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterSearch']"));
		return secretrial;                     
	}
	
	public static WebElement FolioNoValue(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridKendo']/div[2]/table/tbody/tr/td[3]"));
		return secretrial;                     
	}
	
	public static WebElement NoDataFound(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterSearch-list']/div[3]/div"));
		return secretrial;                     
	}
	
	public static WebElement ClassAll(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div/div/div[2]/div/div[2]/span/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement ClassAllNCD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("Non Convertible Debentures"));
		return secretrial;                     
	}
	
	public static WebElement NCDText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridKendo']/div[2]/table/tbody/tr/td[1]"));
		return secretrial;                     
	}
	
	public static WebElement ClearFilter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='clearfillter']"));
		return secretrial;                     
	}
	
	public static WebElement AddNewDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='customCommand']"));
		return secretrial;                     
	}
	
	public static WebElement Follio_No(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtfollioNo']"));
		return secretrial;                     
	}
	
	public static WebElement  ClassofDebenture(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PanelbarEditPrivatepublicCompany']/li[1]/div/div/div/div[2]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  CouponRate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCouponrate']"));
		return secretrial;                     
	}
	
	public static WebElement  TotalDebentureheld(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PanelbarEditPrivatepublicCompany']/li[1]/div/div/div/div[5]/span[2]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement  TypeDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  NameDebentureHolder(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtmemberName']"));
		return secretrial;                     
	}
	
	public static WebElement  AddressDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtbodycorporate_Address']"));
		return secretrial;                     
	}
	
	public static WebElement  CINDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCIN']"));
		return secretrial;                     
	}
	
	public static WebElement  EmailId(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtEmail_Id']"));
		return secretrial;                     
	}
	
	public static WebElement  NationalityDh(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[3]/div/div[5]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  SaveBtn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateDetailsofShareHolding1']/div[2]/div/button[1]"));
		return secretrial;                     
	}
	
	public static WebElement  SaveMsgDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tabe1']/div[1]/div[2]/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement  CloseDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose4']"));
		return secretrial;                     
	}
	
	public static WebElement  TypeVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Type_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  AddressVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='bodycorporate_Address_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  Email_IdVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Email_Id_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  PanDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtPAN']"));
		return secretrial;                     
	}
	
	public static WebElement  PanDHVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PAN_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  FOLIOVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Follio_No_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  DebentureVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Debenture_Class_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  DHD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement  CloseDHD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
		return secretrial;                     
	}
	
	public static WebElement  DHDAddNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Addshareholdingdetails']"));
		return secretrial;                     
	}
	
	public static WebElement  AllotmentNo(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtAllotmentNo']"));
		return secretrial;                     
	}
	
	public static WebElement   Dateofallotment(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-calendar'])[5]"));
		return secretrial;                     
	}
	
	public static WebElement   DateDHD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("10"));
		return secretrial;                     
	}
	
	public static WebElement  NoofDebentures(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNoOfShareTransfered']"));
		return secretrial;                     
	}
	
	public static WebElement  Nameofthetransferor(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNameOfTransferor']"));
		return secretrial;                     
	}
	
	public static WebElement   Dateofissue(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-calendar'])[6]"));
		return secretrial;                     
	}
	
	public static WebElement   CertificateNo(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCertificateNo']"));
		return secretrial;                     
	}
	
	public static WebElement   SaveDHD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmupdateshareholdindetails']/div[2]/div/button[1]"));
		return secretrial;                     
	}
	
	public static WebElement   CloseADDDHD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclosesharedetilas']"));
		return secretrial;                     
	}
	
	public static WebElement   CloseADDDHDC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[8]"));
		return secretrial;                     
	}
	
	public static WebElement   SavehdMsgDhd(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='lblsuccessI_sub']"));
		return secretrial;                        
	}
	
	public static WebElement   DNFrom(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDistinctiveFroms']"));
		return secretrial;                     
	}
	
	public static WebElement   DNTo(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DistinctiveTo']"));
		return secretrial;                     
	}
	
	public static WebElement   Foliooftransferor(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtFolioOfTransferor']"));
		return secretrial;                     
	}
	
	public static WebElement   issuedforconsideration(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtThereof']"));
		return secretrial;                     
	}
	
	public static WebElement   Dateoftransfer(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-icon k-i-calendar'])[7]"));
		return secretrial;                     
	}
	
	public static WebElement  	NoofDebenturestransferred(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNumberOfShares']"));
		return secretrial;                     
	}
	
	
	public static WebElement   DNFromT(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDistinctiveFrom1']"));
		return secretrial;                     
	}
	
	public static WebElement   DNToT(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDistinctiveTo']"));
		return secretrial;                     
	}
	
	public static WebElement   txtFolioOfTransferee(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtFolioOfTransferee']"));
		return secretrial;                     
	}
	
	public static WebElement  txtNameOfTransferee(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNameOfTransferee']"));
		return secretrial;                     
	}
	
	public static WebElement  txtBalanceShare(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtBalanceShare']"));
		return secretrial;                     
	}
	
	public static WebElement  Remark(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtRemarks']"));
		return secretrial;                     
	}
	
	public static WebElement  Authentication(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDebAuthentication']"));
		return secretrial;                     
	}
	
	public static WebElement  uploadButton(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnShareDetails']"));
		return secretrial;                 
	}
	
	public static WebElement  DownloadFile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divShareDtls']/img"));
		return secretrial;                     
	}
	
	public static WebElement  ChooseFile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='File']"));
		return secretrial;                     
	}
	
	public static WebElement  UploadFile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[10]"));
		return secretrial;                     
	}
	
	public static WebElement  UploadFileDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[8]"));
		return secretrial;                     
	}
	
	public static WebElement  UploadMSg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement  InvalidUploadMSg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/ul/li/label"));
		return secretrial;             
	}
	
	public static WebElement  UploadClosed(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[9]"));
		return secretrial;                     
	}
	
	public static WebElement  UploadClosedDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
		return secretrial;                     
	}
	
	public static WebElement  uploadButtonDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnDebentureHolding']"));
		return secretrial;                     
	}
	
	public static WebElement  MasterDH(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='customCommandmaster']"));
		return secretrial;                     
	}
	
	public static WebElement  MasterDHView(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='popforDebentureMaster_wnd_title']"));
		return secretrial;                     
	}
	
	public static WebElement  MasterClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[4]"));
		return secretrial;                     
	}
	
	public static WebElement  DHEdit(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridKendo']/div[2]/table/tbody/tr[1]/td[7]/a[1]"));
		return secretrial;                     
	}
	
	public static WebElement  DHEditview(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='popforsharholder_wnd_title']"));
		return secretrial;                     
	}
	
	public static WebElement  DHDelete(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridKendo']/div[2]/table/tbody/tr[1]/td[7]/a[2]"));
		return secretrial;                     
	}
	
	public static WebElement  DHDeleteYes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='yes']"));
		return secretrial;                     
	}
	
	public static WebElement  DHDeleteNo(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='no']"));
		return secretrial;                     
	}
	
	public static WebElement  PanVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PAN_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  NoDebenVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NumberOfDebenture_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  Auditors(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[9]"));
		return secretrial;                     
	}
	
	public static WebElement  SecretarialAuditor(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab3']"));
		return secretrial;                     
	}
	
	public static WebElement  SAAddNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='SecreterialCreatenew']"));
		return secretrial;                     
	}
	
	public static WebElement  SACategory(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[1]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  SAIndividual(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCriteria_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement  SAAuditorFirm(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCriteria_listbox']/li[3]"));
		return secretrial;                     
	}
	
	
	public static WebElement  SAauditorfirmName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[1]/div/div[2]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  SAauditorfirmNameLi(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AuditorID_listbox']/li[1]"));
		return secretrial;                     
	}
	
	public static WebElement  Certificate_of_Practice(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCertificateofPractice']"));
		return secretrial;                     
	}
	
	public static WebElement  FYPOA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[3]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  FYPOA1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FYID_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement  DOA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[3]/div/div[3]/div/div[2]/span[2]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement  DOA16(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("16"));
		return secretrial;                     
	}
	
	public static WebElement  SaveMsgSA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[1]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement  SaveAEMsgSA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateInternalAuditor']/div[2]/div/div/lable"));
		return secretrial;                     
	}
	
	
	public static WebElement  SaveSA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnllp']"));
		return secretrial;               
	}
	
	public static WebElement  CloseSA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose2']"));
		return secretrial;                     
	}
	
	public static WebElement  DOAVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Date_of_appointment_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  CategoryVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Category_of_SecreterialAuditor_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  Status_All(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Section3']/div[1]/div/div[1]/div[2]/span/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  Status_All4(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Section4']/div[1]/div/div[1]/div[2]/span/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  Current(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Istenuarsec_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement  Current4(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Istenuarcost_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement  ClearBtn(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='clearfilltersc']"));
		return secretrial;                     
	}
	
	public static WebElement  ClearBtn4(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='clearfilltercost']"));
		return secretrial;                     
	}
	
	
	public static WebElement  Edit(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit k-grid-button'])[2]"));
		return secretrial;                     
	}
	
	public static WebElement  ResignationofAuditor(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-R k-grid-resignation'])[2]"));
		return secretrial;                     
	}
	
	public static WebElement  ResignationofAuditorCA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-R'])[2]"));
		return secretrial;                     
	}
	
	public static WebElement  LeaveType(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateResignation']/div[1]/div/div[1]/div/div[2]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  Resignation(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlLeaveType_listbox']/li[3]"));
		return secretrial;                     
	}
		
	public static WebElement  Dateofsubmission(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateResignation']/div[1]/div/div[1]/div/div[3]/span[2]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement  Dated(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateResignation']/div[1]/div/div[1]/div/div[4]/span[2]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement  Dated20(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("20"));
		return secretrial;                     
	}
	
	public static WebElement  Reason(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='textareaResonForLeave']"));
		return secretrial;                     
	}
	
	public static WebElement  ChooseFileRA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Resignation_Doc']"));
		return secretrial;                     
	}
	
	public static WebElement  SaveRA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnregignation']"));
		return secretrial;                     
	}
	
	public static WebElement  SaveMsgRA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DivAuditorResignation']/div[1]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement  Cancel(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnCancelAuditorResignation']"));
		return secretrial;                     
	}
	
	public static WebElement  CloseRA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose2']"));
		return secretrial;                     
	}
	
	public static WebElement  LeaveVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='LeaveType_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  DatedVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DateOfResignation_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement  CostAuditor(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab4']"));
		return secretrial;                     
	}
	
	public static WebElement  CostAuditorNew(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CostAuditorCreatenew']"));
		return secretrial;                     
	}
	
	public static WebElement  NatureofIntimation(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[3]/div/div[1]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement  Originalappointment(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlNatuerofIntemateCost_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement  CategoryCA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[3]/div/div[1]/div/div[2]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement IndividualCA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCriteria_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement AuditorCA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCriteria_listbox']/li[3]"));
		return secretrial;                     
	}
	
	public static WebElement AuditorName(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[3]/div/div[1]/div/div[3]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement AuditorName1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AuditorId_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement AuditorName2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AuditorId_listbox']/li[1]"));
		return secretrial;                     
	}
	
	
	public static WebElement NameoftheCostauditor(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCost_auditor_firm_Original']"));
		return secretrial;                     
	}
	
	public static WebElement Dateboardmeeting(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[3]/div/div[2]/div/div[2]/span[2]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement Dateboardmeeting15(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("15"));
		return secretrial;                     
	}
	
	public static WebElement ResulationNumber(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtResulationNumber']"));
		return secretrial;                     
	}
	
	public static WebElement FYNo(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[3]/div/div[3]/div/div/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement FYNo2223(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FYID_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement SaveCA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnllp']"));
		return secretrial;                     
	}
	
	public static WebElement CloseCA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose2']"));
		return secretrial;                     
	}
	
	public static WebElement SaveMsgCA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[1]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement SaveMsgCA1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateCostAuditorAuditor']/div[2]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement AuditorNameVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AuditorId_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement LLPVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Cost_auditor_firm_Original_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement NatureIntimationVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Nature_of_intimation_cost_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement EditCA(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit k-grid-button'])[11]"));
		return secretrial;                     
	}
	
	public static WebElement StatutoryRegisters(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='griDDLActionMenu_listbox']/li[10]"));
		return secretrial;                     
	}
	
	public static WebElement SRDEPOSIT(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab2']"));
		return secretrial;                     
	}
	
	public static WebElement SRDEPOSITAN(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='StaturoryRegisterNew'])[2]"));
		return secretrial;                     
	}
	
	
	public static WebElement NameOfDepositor(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NameOfDepositor']"));
		return secretrial;                     
	}
	
	public static WebElement AddressOfDepositor(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AddressOfDepositor']"));
		return secretrial;                     
	}
	
	public static WebElement PANofDepositor(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PANofDepositor']"));
		return secretrial;                     
	}
	
	public static WebElement ParticularsOfGuardian(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ParticularsOfGuardian']"));
		return secretrial;                     
	}
	
	public static WebElement ParticularOfNominee(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ParticularOfNominee']"));
		return secretrial;                     
	}
	
	public static WebElement Depositreceiptno(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Depositreceiptno']"));
		return secretrial;                     
	}
	
	public static WebElement DateOfeachdeposit(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDepositRegister']/div[2]/div[2]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOfeachdeposit13(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("13"));
		return secretrial;                     
	}
	
	public static WebElement AmtOfeachDeposit(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AmtOfeachDeposit']"));
		return secretrial;                     
	}
	
	public static WebElement DurationOfdeposit(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DurationOfdeposit']"));
		return secretrial;                     
	}
	
	public static WebElement DateOfdepositrepayable(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDepositRegister']/div[2]/div[5]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOfdepositrepayable15(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("15"));
		return secretrial;                     
	}
	
	public static WebElement RateOfInterest(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDepositRegister']/div[2]/div[6]/span[1]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement DuedateforPayment(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDepositRegister']/div[3]/div[1]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DuedateforPayment20(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("20"));
		return secretrial;                     
	}
	
	public static WebElement mandateandInstructions(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mandateandInstructions']"));
		return secretrial;                     
	}
	
	public static WebElement DateOfInterestmade(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDepositRegister']/div[3]/div[3]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOfInterestmade21(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("18"));
		return secretrial;                     
	}
	
	public static WebElement DtlsOfDepositInsurance(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DtlsOfDepositInsurance']"));
		return secretrial;                     
	}
	
	public static WebElement Particularsofseccharge(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Particularsofseccharge']"));
		return secretrial;                     
	}
	
	public static WebElement SaveSR(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDepositRegister']/div[5]/div/button"));
		return secretrial;                     
	}
	
	public static WebElement SaveMsgSR(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDepositRegister']/div[1]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement CloseSR(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[4]"));
		return secretrial;                     
	}
	
	public static WebElement InavlidMsg(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDepositRegister']/div[4]/div[5]/span"));
		return secretrial;                     
	}
	
	public static WebElement UploadSRD(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnUplaodDeposit']"));
		return secretrial;                     
	}
	
	public static WebElement UploadSRSH(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnUplaodSH2']"));
		return secretrial;                     
	}
	
	public static WebElement UploadSRSH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnUplaodSH3']"));
		return secretrial;                     
	}
	
	public static WebElement SampleFormRD(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divDeposit']"));
		return secretrial;                     
	}
	
	public static WebElement SampleFormRDSH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divSH3']/img"));
		return secretrial;                     
	}
	
	public static WebElement ChooseFileRD(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='File']"));
		return secretrial;                     
	}
	
	public static WebElement SampleFormSH(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divSH2']"));
		return secretrial;                     
	}
	
	public static WebElement UploadRD(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[3]/button"));
		return secretrial;                    
	}
	
	public static WebElement UploadCHG(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DivUploadChargeEform']/div[5]/button"));
		return secretrial;                    
	}
	
	public static WebElement UploadMSgCHG(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DivUploadChargeEform']/div[1]/div/lable"));
		return secretrial;                   
	}
	
	public static WebElement UploadMsgRD(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
		return secretrial;                        
	}
	
	public static WebElement UploadMsgRD1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[1]/div/div/lable"));
		return secretrial;                        
	}
	
	public static WebElement UploadMsgRD2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[2]/div/div/lable"));
		return secretrial;                        
	}
	
	
	public static WebElement UploadMsgRDSH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/ul"));
		return secretrial;             
	}
	
	
	public static WebElement CloseSRU(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
		return secretrial;                     
	}
	
	public static WebElement CloseSRSH(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[5]"));
		return secretrial;                     
	}
	
	public static WebElement CloseSRMB3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[25]"));
		return secretrial;                     
	}
	
	public static WebElement CloseSRSH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[7]"));
		return secretrial;                     
	}
	
	public static WebElement CloseSRSH6(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[9]"));
		return secretrial;                     
	}
	
	public static WebElement CloseChg7(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[13]"));
		return secretrial;                     
	}
	
	public static WebElement CloseMB2U(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[23]"));
		return secretrial;                     
	}
	
	
	public static WebElement GenerateRegister(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnGenerateDeposit']"));
		return secretrial;                     
	}
	
	public static WebElement GenerateRegisterSH(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnGenerateSH2']"));
		return secretrial;                     
	}
	
	public static WebElement GenerateRegisterSH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnGenerateSH3']"));
		return secretrial;                     
	}
	
	
	public static WebElement SRSH2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab3']"));
		return secretrial;                     
	}
	
	public static WebElement SRSHAN(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='StaturoryRegisterNew'])[3]"));
		return secretrial;                     
	}
	
	public static WebElement SRSHFolio_No(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Folio_No']"));
		return secretrial;                     
	}
	
	public static WebElement NameOftheGurantee(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NameOfShareholder']"));
		return secretrial;                     
	}
	
	public static WebElement DateOfIssuedApproval(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH2Register']/div[1]/div[3]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement ClassOfShares(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH2Register']/div[1]/div[4]/span/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement EquitySharesSH(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlShares_Class_listbox']/li[1]"));
		return secretrial;                     
	}
	
	public static WebElement DateOfIssueOriginal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH2Register']/div[1]/div[5]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement CertificateNoSH(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CertificateNo']"));
		return secretrial;                     
	}
	
	public static WebElement Tot_SharesHeld(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH2Register']/div[2]/div[2]/span[1]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement DistinctiveFrom(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DistinctiveFrom']"));
		return secretrial;                     
	}
	
	public static WebElement DistinctiveTo(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DistinctiveTo']"));
		return secretrial;                     
	}
	
	public static WebElement DateOfIssuedRenewed(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH2Register']/div[2]/div[5]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOfIssuedRenewed19(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("19"));
		return secretrial;                     
	}
	
	public static WebElement ReasonforIssueRenewed(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ReasonforIssueRenewed']"));
		return secretrial;                     
	}
	
	public static WebElement NoOfShareRenewed(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH2Register']/div[3]/div[2]/span[1]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement Tot_SharesHeldIn(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH2Register']/div[3]/div[3]/span[1]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement ReftoEntryInROM(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ReftoEntryInROM']"));
		return secretrial;                     
	}
	
	public static WebElement Remarks(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Remarks']"));
		return secretrial;                     
	}
	
	public static WebElement SaveSH(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH2Register']/div[5]/div/button"));
		return secretrial;                     
	}
	
	public static WebElement SaveMsgSH(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH2Register']/div[1]/div/div/lable"));
		return secretrial;                    
	}
	
	
	public static WebElement CloseSH(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[6]"));
		return secretrial;                     
	}
	
	public static WebElement EditSH(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[13]"));
		return secretrial;                     
	}
	
	public static WebElement EditSH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[18]"));
		return secretrial;                     
	}
	
	public static WebElement EditSH6(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[28]"));
		return secretrial;                     
	}
	
	
	public static WebElement EditDiposit(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])"));
		return secretrial;                     
	}
	
	public static WebElement SRSH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab4']"));
		return secretrial;                     
	}
	
	public static WebElement SRSH3AddNew(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='StaturoryRegisterNew'])[4]"));
		return secretrial;                     
	}
	
	public static WebElement RefInROM(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='RefInROM']"));
		return secretrial;                     
	}
	
	public static WebElement NameOfAllotee(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NameOfAllotee']"));
		return secretrial;                     
	}
	
	public static WebElement StatusofAllottee(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[1]/div[3]/span/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement Employee(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlAlloteeStatus_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement DateOfPassBoardResolution(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[1]/div[4]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOfPassBoardResolution1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("5"));
		return secretrial;                     
	}
	
	public static WebElement DateOfSpclResoltn(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[1]/div[5]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOfSpclResoltn1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("8"));
		return secretrial;                     
	}
	
	public static WebElement DateOfIssue_EqShare(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[2]/div[1]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOfIssue_EqShare1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("10"));
		return secretrial;                     
	}
	
	public static WebElement NoOfSwt_EqShare(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[2]/div[2]/span[1]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement CertificateORfolioNo(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CertificateORfolioNo']"));
		return secretrial;                     
	}
	
	public static WebElement FaceValOfShare(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[2]/div[4]/span[1]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement PriceAtShareIssued(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[2]/div[5]/span[1]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement AmtOfPaidUp(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[2]/div[6]/span[1]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement Considertaion_Cash(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[3]/div[1]/span[1]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement ParticularsConsidertaion_Cash(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[3]/div[2]/span[1]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement LockinPeriod(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='LockinPeriod']"));
		return secretrial;                     
	}
	
	public static WebElement DateOfExpLockInPeriod(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[3]/div[4]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOfExpLockInPeriod1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("3"));
		return secretrial;                     
	}
	
	public static WebElement RemarksSH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Remarks']"));
		return secretrial;                     
	}
	
	public static WebElement DateOfJoining(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[4]/div[1]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement FairValbyValuer(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[4]/div[2]/span[1]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement BasisOfValuation(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='BasisOfValuation']"));
		return secretrial;                     
	}
	
	public static WebElement NameOfValuer(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NameOfValuer']"));
		return secretrial;                     
	}
	
	public static WebElement SaveSH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[5]/div/button"));
		return secretrial;                     
	}
	
	public static WebElement SaveMsgSH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[1]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement CloseSH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[8]"));
		return secretrial;                     
	}
	
	public static WebElement Dateofex(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DateOfExpLockInPeriod']"));
		return secretrial;                     
	}
	
	public static WebElement DateofexVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH3Register']/div[4]/div[4]/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement SRSH6(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab5']"));
		return secretrial;                     
	}
	
	public static WebElement SRSH6AddNew(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='StaturoryRegisterNew'])[5]"));
		return secretrial;              
	}
	
	public static WebElement NameOfGrantee(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NameOfGrantee']"));
		return secretrial;                     
	}
	
	public static WebElement NoOfOptGranted(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NoOfOptGranted']"));
		return secretrial;                     
	}
	
	public static WebElement DateOnOptVested(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH6Register']/div[1]/div[3]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOnOptVested1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("1"));
		return secretrial;                     
	}
	
	public static WebElement ExercisedPeriod(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ExercisedPeriod']"));
		return secretrial;                     
	}
	
	
	public static WebElement DateOnOptExercised(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH6Register']/div[2]/div[1]/span[2]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOnOptExercised1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("2"));
		return secretrial;                     
	}
	
	public static WebElement OptExercised(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='OptExercised']"));
		return secretrial;                     
	}
	
	public static WebElement ExercisePrice(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ExercisePrice']"));
		return secretrial;                     
	}
	
	public static WebElement NoOfSharesArise(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NoOfSharesArise']"));
		return secretrial;                     
	}
	
	public static WebElement Folio_No(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Folio_No']"));
		return secretrial;                     
	}
	
	public static WebElement LockInPeriod(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='LockInPeriod']"));
		return secretrial;                     
	}
	
	public static WebElement OptionLapsed(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='OptionLapsed']"));
		return secretrial;                     
	}
	
	public static WebElement NoOfOptInForce(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NoOfOptInForce']"));
		return secretrial;                     
	}
	
	public static WebElement AmtRefunded(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AmtRefunded']"));
		return secretrial;                     
	}
	
	public static WebElement VariationOfTerms_Effects(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='VariationOfTerms_Effects']"));
		return secretrial;                     
	}
	
	public static WebElement Signature(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Signature']"));
		return secretrial;                     
	}
	
	public static WebElement RemarksSH6(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Remarks']"));
		return secretrial;                     
	}
	
	public static WebElement SaveSH6(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH6Register']/div[5]/div/button"));
		return secretrial;                     
	}
	
	
	public static WebElement SaveMsgSH6(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH6Register']/div[1]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement CloseSH6(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[10]"));
		return secretrial;                     
	}
	
	public static WebElement DateOnOptVested2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DateOnOptVested']"));
		return secretrial;                     
	}
	
	public static WebElement DateOnOptExercised2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DateOnOptExercised']"));
		return secretrial;                     
	}
	
	public static WebElement NoOfOptGrantedVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH6Register']/div[2]/div[2]/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement DateOnOptVestedVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH6Register']/div[2]/div[3]/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement DateOnOptExercisedVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH6Register']/div[3]/div[1]/span[3]"));
		return secretrial;                     
	}
	
	public static WebElement ExercisePriceVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH6Register']/div[3]/div[3]/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement NoOfSharesAriseVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH6Register']/div[3]/div[4]/span"));
		return secretrial;                     
	}
	
	public static WebElement NoOfOptInForceVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH6Register']/div[4]/div[3]/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement AmtRefundedVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmSH6Register']/div[4]/div[4]/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement UploadSRSH6(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnUplaodSH6']"));
		return secretrial;                     
	}
	
	
	public static WebElement SampleFormRDSH6(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divSH6']"));
		return secretrial;                     
	}
	
	public static WebElement GenerateRegisterSH6(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnGenerateSH6']"));
		return secretrial;                     
	}
	
	public static WebElement SRCHG7(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab6']"));
		return secretrial;                     
	}
	
	public static WebElement SRCHG7AddNew(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='StaturoryRegisterNew'])[6]"));
		return secretrial;              
	}
	
	public static WebElement ChargeId(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ChargeId']"));
		return secretrial;              
	}
	
	public static WebElement ChargeType(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[1]/div[2]/span[2]/span/span[2]"));
		return secretrial;              
	}
	
	public static WebElement ChargeType1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ChargeTypeId_listbox']/li[2]"));
		return secretrial;              
	}
	
	public static WebElement CreationDate(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[1]/div[3]/span[2]/span/span/span"));
		return secretrial;              
	}
	
	public static WebElement CreationDate1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("2"));
		return secretrial;              
	}
	
	public static WebElement RegistrationChargeCreateDate(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[1]/div[4]/span[2]/span/span/span"));
		return secretrial;              
	}
	
	public static WebElement RegistrationChargeCreateDate1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("3"));
		return secretrial;              
	}
	
	public static WebElement ShortDescPropertyCharged(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ShortDescPropertyCharged']"));
		return secretrial;              
	}
	
	public static WebElement PeriodInMonth(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ChargeTerm']"));
		return secretrial;              
	}
	
	public static WebElement ChargeAmount(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[2]/div/div[2]/span[2]/span/input[1]"));
		return secretrial;              
	}
	
	public static WebElement NamesOfChargeholder(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Namesaddresseschargeholder']"));
		return secretrial;              
	}
	
	public static WebElement AddressOfChargeHolder(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AddressOfChargeHolder']"));
		return secretrial;              
	}
	
	public static WebElement TermsconditionsOfcharge(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='TermsconditionsOfcharge']"));
		return secretrial;              
	}
	
	public static WebElement Descinstrument(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Descinstrument']"));
		return secretrial;              
	}
		
	public static WebElement ModificationDate(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[3]/div/div[2]/span[1]/span/span/span"));
		return secretrial;              
	}
	
	public static WebElement RegistrationChargeModificationDate(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[3]/div/div[3]/span[1]/span/span/span"));
		return secretrial;              
	}
	
	public static WebElement RegistrationChargeModificationDate1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("4"));
		return secretrial;              
	}
	
	public static WebElement Descinstrumentchargemodify(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Descinstrumentchargemodify']"));
		return secretrial;              
	}
	
	public static WebElement SatisfactionDate(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[4]/div/div[1]/span[1]/span/span/span"));
		return secretrial;              
	}
	
	public static WebElement RegistrationsatisfactionDate(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[4]/div/div[2]/span[1]/span/span/span"));
		return secretrial;              
	}
	
	public static WebElement RegistrationsatisfactionDate1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("5"));
		return secretrial;              
	}
	
	public static WebElement FactsDelaycondonationDate(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[4]/div/div[3]/span[1]/span/span/span"));
		return secretrial;              
	}
	
	public static WebElement Particularsmodification(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Particularsmodification']"));
		return secretrial;              
	}
	
	public static WebElement Reasonsdelayfiling(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Reasonsdelayfiling']"));
		return secretrial;              
	}
	
	public static WebElement SaveCHG(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='command_name']"));
		return secretrial;              
	}
	
	public static WebElement SaveCHGMsg(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[2]/div/div/lable"));
		return secretrial;           
	}
	
	public static WebElement SaveCHGMsg1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[1]/div/div/lable"));
		return secretrial;                       
	}
	
	public static WebElement SaveMB2Msg(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmMBP2Transaction']/div[1]/div/div/lable"));
		return secretrial;                       
	}
	
	public static WebElement SaveMB3Msg(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmMBP3Register']/div[1]/div/div/lable"));
		return secretrial;                       
	}
	
	
	public static WebElement CloseCHG(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[12]"));
		return secretrial;                     
	}
	
	public static WebElement CloseMB2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[22]"));
		return secretrial;                     
	}
	
	public static WebElement CloseMB3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[26]"));
		return secretrial;                     
	}
	
	
	public static WebElement CloseCHGView(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[15]"));
		return secretrial;                     
	}
	
	public static WebElement RegistrationChargeCreateDate11(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='RegistrationChargeCreateDate']"));
		return secretrial;                     
	}
	
	public static WebElement ChargeIdVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[1]/div[1]/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement RegistrationChargeCreateDateVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[1]/div[4]/span[3]"));
		return secretrial;                     //*[@id="frmNewChargeDetails"]/div[3]/div[1]/div[3]/span[3]
	}
	
	public static WebElement RegistrationChargeCreateDateVal2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[1]/div[3]/span[3]"));
		return secretrial;                       
	}
	
	
	
	public static WebElement CreationDate_validationMessage(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CreationDate_validationMessage']"));
		return secretrial;                     
	}
	
	
	public static WebElement RegistrationChargeCreateDateVal1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='RegistrationChargeCreateDate_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement UploadSRChG7(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='UplaodChargeDetails']"));
		return secretrial;                     
	}
	
	public static WebElement UploadSRMB2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnUplaodMBP2']"));
		return secretrial;                     
	}
	
	
	public static WebElement ExcelCheckBox(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DivUploadChargeEform']/div[3]/div[2]/label[1]"));
		return secretrial;                     
	}
	
	public static WebElement SampleFormRDChg(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DIVChargeExcel']/img"));
		return secretrial;                     
	}
	
	public static WebElement SampleFormRDMB2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DIVMBP2Excel']/img"));
		return secretrial;                     
	}
	
	public static WebElement UploadMSgCHG1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DivUploadChargeEform']/div[1]/div/ul"));
		return secretrial;                     
	}
	
	public static WebElement UploadMB2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUploadMBP2Excel']/div[3]/button"));
		return secretrial;                     
	}
	
	public static WebElement UploadMsgMB2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUploadMBP2Excel']/div[1]/div/div/lable"));
		return secretrial;                        
	}
	
	public static WebElement GenerateRegisterCHG7(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnGenerateCHG7']"));
		return secretrial;                     
	}
	
	public static WebElement GenerateRegisterMB2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnGenerateMBP2']"));
		return secretrial;                     
	}
	
	public static WebElement ViewCHG7(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-view k-grid-button hoverCircle']"));
		return secretrial;                     
	}
	
	public static WebElement ViewANCHG7(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='StaturoryRegisterNew'])[8]"));
		return secretrial;                     
	}
	
	public static WebElement ChargeTypeCHG7(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[1]/div[1]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement ChargeTypeCHG71(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ChargeTypeId_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement CreationDate_dateview(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[1]/div[2]/span[2]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement RegistrationChargeCreateDate_dateview(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[1]/div[3]/span[2]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement ShortDescPropertyCharged1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ShortDescPropertyCharged']"));
		return secretrial;                     
	}
	
	public static WebElement PeriodInMonth1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ChargeTerm']"));
		return secretrial;                     
	}
	
	public static WebElement ChargeAmountNumeric(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[2]/div/div[1]/span[2]/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement NamesOfChargeholder1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Namesaddresseschargeholder']"));
		return secretrial;                     
	}
	
	public static WebElement AddressOfChargeHolder1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AddressOfChargeHolder']"));
		return secretrial;                     
	}
	
	
	public static WebElement TermsconditionsOfcharge1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='TermsconditionsOfcharge']"));
		return secretrial;                     
	}
	
	public static WebElement Descinstrument1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Descinstrument']"));
		return secretrial;                     
	}
	
	public static WebElement ModificationDate1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[3]/div/div[2]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement RegistrationChargeModificationDate2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmNewChargeDetails']/div[3]/div[3]/div/div[3]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement Descinstrumentchargemodify1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Descinstrumentchargemodify']"));
		return secretrial;                     
	}
	
	public static WebElement ViewEdit(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[41]"));
		return secretrial;                     
	}
	
	public static WebElement ViewUpload(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Upload k-grid-upload hoverCircle k-grid-button'])[13]"));
		return secretrial;                     
	}
	
	public static WebElement ParticularCharge(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[3]/div[1]/div[1]/div/div[2]/span/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement Modification(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PId_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement Discription(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Discription']"));
		return secretrial;                     
	}
	
	public static WebElement SaveUpload(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='saveppcom']"));
		return secretrial;                     
	}
	
	
	public static WebElement CloseUpload(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[16]"));
		return secretrial;                     
	}
	
	public static WebElement Document(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-document k-grid-document hoverCircle k-grid-button'])[11]"));
		return secretrial;                     
	}
	
	public static WebElement CloseDocument(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[19]"));
		return secretrial;                     
	}
	
	public static WebElement DocumentDownload(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle']"));
		return secretrial;                     
	}
	
	public static WebElement DocumentView(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle']"));
		return secretrial;                     
	}
	
	public static WebElement DocumentViewClose(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[17]"));
		return secretrial;                     
	}
	
	public static WebElement DocumentViewText(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='wndDocViewer_wnd_title']"));
		return secretrial;                     
	}
	
	public static WebElement SRMBP2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab7']"));
		return secretrial;                     
	}
	
	public static WebElement SRMBP2AddNew(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='customCommandCreateBMP2Trans']"));
		return secretrial;                     
	}
	
	public static WebElement NatureOfTransactionId(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmMBP2Transaction']/div[1]/div[1]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement NatureOfTransactionId1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NatureOfTransactionId_listbox']/li[1]"));
		return secretrial;                     
	}
	
	public static WebElement NatureOfTransactionId2(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NatureOfTransactionId_listbox']/li[2]"));
		return secretrial;                     
	}
	
	public static WebElement NatureOfTransactionId3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NatureOfTransactionId_listbox']/li[3]"));
		return secretrial;                     
	}
	
	public static WebElement NatureOfTransactionId4(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NatureOfTransactionId_listbox']/li[4]"));
		return secretrial;                     
	}
	
	public static WebElement DateofTransaction(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmMBP2Transaction']/div[1]/div[2]/span[2]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement NameofCompany(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Name_']"));
		return secretrial;                     
	}
	
	public static WebElement AddressMBP(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Address_']"));
		return secretrial;                     
	}
	
	public static WebElement Currency(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmMBP2Transaction']/div[2]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;                     
	}
	
	public static WebElement Currency1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CurrencyId_listbox']/li[1]"));
		return secretrial;                     
	}
	
	public static WebElement Amount(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Amount']"));
		return secretrial;                     
	}
	
	public static WebElement TimePeriod(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='TimePeriod']"));
		return secretrial;                     
	}
	
	public static WebElement Purpose(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Purpose']"));
		return secretrial;                     
	}
	
	public static WebElement PercentageOfReserve(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PercentageOfReserve']"));
		return secretrial;                     
	}
	
	public static WebElement DateOfBoardResolution(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmMBP2Transaction']/div[2]/div/div[6]/span[2]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOfPassingResolution(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmMBP2Transaction']/div[2]/div/div[7]/span[2]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement NoOfSecurity(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NoOfSecurity']"));
		return secretrial;                     
	}
	
	public static WebElement KindOfSecurity(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='KindOfSecurity']"));
		return secretrial;                     
	}
	
	public static WebElement NominalValue(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NominalValue']"));
		return secretrial;                     
	}
	
	public static WebElement PaidUp(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PaidUp']"));
		return secretrial;                     
	}
	
	public static WebElement CostOfAuisition(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CostOfAuisition']"));
		return secretrial;                     
	}
	
	public static WebElement DateOfSelling(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divAquisitionDetails']/div/div[6]/span[1]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement RemarksBH(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Remarks']"));
		return secretrial;                     
	}
	
	public static WebElement SaveBH3(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='command_name']"));
		return secretrial;                     
	}
	
	public static WebElement DateTran(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DateOfMaking']"));
		return secretrial;                     
	}
	
	public static WebElement DateTranval(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmMBP2Transaction']/div[2]/div[2]/span[3]"));
		return secretrial;                     
	}
	
	public static WebElement Name__validationMessage(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Name__validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement CurrencyId_validationMessage(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CurrencyId_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement NatureOfTransactionId_validationMessage(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='NatureOfTransactionId_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement DateOfMaking_validationMessage(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DateOfMaking_validationMessage']"));
		return secretrial;                     
	}
	
	public static WebElement RateOfInterest1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='RateOfInterest']"));
		return secretrial;                     
	}
	
	public static WebElement DateOfMaturity(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divLoanDetails']/div[2]/span[2]/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement EditAL(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnEditLimit']/span/img"));
		return secretrial;                     
	}
	
	public static WebElement ApprovedLimit(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmApprovedLimitDetails']/div[1]/div/div[2]/span/span/input[1]"));
		return secretrial;                     
	}
	
	public static WebElement UsedLimit(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmApprovedLimitDetails']/div[2]/div/div[2]/span/span/input[1]"));
		return secretrial;                     
	}
	
	
	public static WebElement DateOfBoardResolutionAE(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmApprovedLimitDetails']/div[3]/div/div[2]/span/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOfBoardResolutionAE1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("3"));
		return secretrial;                     
	}
	
	public static WebElement DateOfPassingResolutionAE(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmApprovedLimitDetails']/div[4]/div/div[2]/span/span/span/span"));
		return secretrial;                     
	}
	
	public static WebElement DateOfPassingResolutionAE1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.linkText("2"));
		return secretrial;                     
	}
	
	
	public static WebElement SaveAE(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmApprovedLimitDetails']/div[5]/div/button[1]"));
		return secretrial;                     
	}
	
	public static WebElement SaveAEMsg(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmApprovedLimitDetails']/div[1]/div/div/lable"));
		return secretrial;                     
	}
	
	public static WebElement CloseAE(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmApprovedLimitDetails']/div[6]/div/button[2]"));
		return secretrial;                     
	}//*[@id="frmApprovedLimitDetails"]/div[5]/div/button[2]
	
	public static WebElement CloseAE1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmApprovedLimitDetails']/div[5]/div/button[2]"));
		return secretrial;                     
	}
	
	public static WebElement MB2edit(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-edit k-grid-button'])[2]"));
		return secretrial;                     
	}
	
	public static WebElement MB2ActionUpload(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Upload k-grid-upload hoverCircle k-grid-button']"));
		return secretrial;                     
	}
	
	public static WebElement MB2Discription(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Discription']"));
		return secretrial;                     
	}
	
	public static WebElement MB2Save(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='saveppcom']"));
		return secretrial;                     
	}
	
	public static WebElement MB2SaveMsg(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[1]/div/div/lable"));
		return secretrial;                    
	}
	
	public static WebElement MB2SaveMsg1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmEntityDocumentsTypes']/div[2]/div/div/lable"));
		return secretrial;                    
	}
	
	public static WebElement MB2UploadClose(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[23]"));
		return secretrial;                     
	}
	
	
	public static WebElement  clickMBP4(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab9']/a"));
		return secretrial;
	}
	public static WebElement  clickUploadBtn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='btnUplaodDeposit'])[2]"));
		return secretrial;
	}
	public static WebElement  clickUploadBtn1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//button[@type='submit']"));
		return secretrial;
	}
	public static WebElement  clickUploadfileInValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/ul/li/label"));
		return secretrial;
	}
	public static WebElement  clickUploadfileValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
		return secretrial;
	}
	public static WebElement SelectFile1(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='File']"));
		return secretrial;
	}
	public static WebElement clickInvalidMsg(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div"));
		return secretrial;
	}
	public static WebElement clickOld(WebDriver driver)
	{
		secretrial=driver.findElement(By.cssSelector("label[for='IsExistingMBP4_2']"));
		return secretrial;
	}
   
	public static WebElement clickDocument(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@class='k-grid-document k-grid-document hoverCircle k-grid-button']"));
		return secretrial;
	}
   
	public static WebElement ClosekDocument(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[21]"));
		return secretrial;
	}
   
	public static WebElement DocumentDownLoad(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle']"));
		return secretrial;
	}
   
	public static WebElement DocumentView1(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle']"));
		return secretrial;
	}
   
	public static WebElement DocumentView1Text(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='wndDocViewer_wnd_title']"));
		return secretrial;
	}
	
	public static WebElement DocumentView1Close(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[17]"));
		return secretrial;
	}
	
	public static WebElement SRMBP3(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='mytab8']"));
		return secretrial;
	}
	
	public static WebElement SRMBP3AddNew(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("(//*[@id='StaturoryRegisterNew'])[7]"));
		return secretrial;
	}
	
	public static WebElement DateOfBoardResolution3(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='frmMBP3Register']/div[1]/div[1]/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement DateOfInvestment_date(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='frmMBP3Register']/div[1]/div[2]/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement NameOfPerson(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='NameOfPerson']"));
		return secretrial;
	}
	
	public static WebElement Address_Email(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='Address_Email']"));
		return secretrial;
	}
	
	public static WebElement PurposeOfInvestment(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='PurposeOfInvestment']"));
		return secretrial;
	}
	
	public static WebElement NameOfCompanyMB3(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='NameOfCompany']"));
		return secretrial;
	}
	
	public static WebElement ClassOfSecurities(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='ClassOfSecurities']"));
		return secretrial;
	}
	
	public static WebElement NoOfSecurities(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='NoOfSecurities']"));
		return secretrial;
	}
	
	public static WebElement CilentId_DpNo(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='CilentId_DpNo']"));
		return secretrial;
	}
	
	public static WebElement FaceValueOfSecurities(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='FaceValueOfSecurities']"));
		return secretrial;
	}
	
	public static WebElement PaidUpValueOfSecurities(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='PaidUpValueOfSecurities']"));
		return secretrial;
	}
	
	public static WebElement CostOfAcquisition(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='CostOfAcquisition']"));
		return secretrial;
	}
	
	public static WebElement DateOfDisposal(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='frmMBP3Register']/div[3]/div[4]/span[1]/span/span"));
		return secretrial;
	}
	
	public static WebElement NoOfSecuritiesDisposedOff(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='NoOfSecuritiesDisposedOff']"));
		return secretrial;
	}
	
	public static WebElement SaleConsideration(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='SaleConsideration']"));
		return secretrial;
	}
	
	public static WebElement BalanceSecuritiesLeft(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='BalanceSecuritiesLeft']"));
		return secretrial;
	}
	
	public static WebElement RemarksMB3(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='Remarks']"));
		return secretrial;
	}
	
	public static WebElement DateOfBoardResolutiontext(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='DateOfBoardResolution']"));
		return secretrial;
	}
	
	public static WebElement DateOfBoardResolutiontext1(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='frmMBP3Register']/div[2]/div[1]/span[2]"));
		return secretrial;
	}
	
	public static WebElement UploadMB3(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='btnUplaodMBP3']"));
		return secretrial;
	}
	
	public static WebElement SampleFormMB3(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='divMBP3']"));
		return secretrial;
	}
	
	public static WebElement UploadMsgMB3(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='lblsuccessI']"));
		return secretrial;
	}
	
	public static WebElement btnGenerateMBP3(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='btnGenerateMBP3']"));
		return secretrial;
	}
	
	public static WebElement EditMB3(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("(//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button'])[38]"));
		return secretrial;
	}
	
	public static WebElement clickGenerateRegistor(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("(//*[@id='btnGenerateDeposit'])[2]"));
		return secretrial;
	}
	public static WebElement clickExistingDropdown(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='divExisting']/span/span/span[1]"));
		return secretrial;
	}
	public static WebElement clickOldDropdown(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='divOld']/span/span/span[1]"));
		return secretrial;
	}
	public static WebElement clickExistingDropdown1(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='ddlDirector_listbox']/li[2]"));
		return secretrial;
	}
	public static WebElement clickDownloadBtn(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='btnDirectorRegisters']"));
		return secretrial;
	}
	public static WebElement clickOldBtn(WebDriver driver)
	{
		secretrial=driver.findElement(By.cssSelector("label[for='IsCheckregister_2']"));
		return secretrial;
	}
	public static WebElement clickOldDropdown1(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='ddlPastDirector_listbox']/li[2]"));
		return secretrial;
	}
	public static WebElement clickAllBtn(WebDriver driver)
	{
		secretrial=driver.findElement(By.cssSelector("label[for='IsCheckregister_3']"));
		return secretrial;
	}
	public static WebElement clickViewBtn(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("(//*[@id='btnDirectorRegisters'])[2]"));
		return secretrial;
	}
	public static WebElement clickViewPage(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("//*[@id='wndDocViewer_wnd_title']"));
		return secretrial;
	}
	public static WebElement clickViewClosePage(WebDriver driver)
	{
		secretrial=driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[17]"));
		return secretrial;
	}
	public static WebElement  clickPASTROD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab10']/a"));
		return secretrial;
	}
	public static WebElement  clickPASTRODUpload(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnUploadPastdirector']"));
		return secretrial;
	}
	public static WebElement clickPASTRODUploadButton(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[3]/button"));
		return secretrial;
	}
	public static WebElement clickPASTRODValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div[2]/div/lable"));
		return secretrial;
	}
	public static WebElement  clickPASTRODInValidMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div[2]/div/lable"));
		return secretrial;
	}
	
	public static WebElement  clickPASTRODInValidMsg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/ul/li/label"));
		return secretrial;
	}
	
	public static WebElement  clickPASTRODGenerateRegostor(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnGeneratePastdirector']"));
		return secretrial;
	}
	public static WebElement  clickPASTRODGenerateRegostorDropdown(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='wndRegisterPastROD']/div/div/div/table/tbody/tr/td[1]/div/span/span/span[1]"));
		return secretrial;
	}
	public static WebElement  clickPASTRODGenerateRegostorDropdown1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='ddlDirector_listbox']/li[2])"));
		return secretrial;
	}
	
	public static WebElement  clickChooseFile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='File']"));
		return secretrial;
	}
	
	public static WebElement  Address2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtRegAddress2']"));
		return secretrial;
	}
	
	public static WebElement  CloseLR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
		return secretrial;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
