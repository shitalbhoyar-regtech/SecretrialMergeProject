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
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/a/i)[9]"));
		return secretrial;
	}
	
	public static WebElement ComplianceStatusReport(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[3]/a/span)[7]"));
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
	
	public static WebElement CompanyAllDD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div/div[1]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement CompanyAllBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div[1]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Noitemstodisplay(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridStatusReport']/div[3]/span[2]"));
		return secretrial;
	}
	
	public static WebElement NoitemstodisplayAD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridAuditorDetails']/div[3]/span[2]"));
		return secretrial;
	}
	
	public static WebElement NoitemstodisplayDD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridDirectorDetails']/div[3]/span[2]"));
		return secretrial;
	}
	
	public static WebElement NoitemstodisplayBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-pager-info k-label']"));
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
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[5]/a/span)[6]"));
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
	

	public static WebElement CompanyAllClickAD2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlEntityFilter_listbox']/li[3]"));
		return secretrial;
	}
	
	
	public static WebElement ExportAD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnExcel']"));
		return secretrial;
	}
	
	public static WebElement ExportDD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divBtnExport']/img[1]"));
		return secretrial;
	}
	
	public static WebElement DirectorDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[6]/a/span)[6]"));
		return secretrial;
	}
	
	public static WebElement CompanyAllClickDD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div/div[1]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement WordDocBtn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divBtnExport']/img[2]"));
		return secretrial;
	}
	
	public static WebElement OnLetterhead(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='GenerateDirDtls']/div[1]/div[2]/span/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement OnLetterheadYes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='LetterHead_listbox']/li[1]"));
		return secretrial;
	}

	public static WebElement Generate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnDownload']"));
		return secretrial;
	}
	
	public static WebElement GenerateClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-button k-bare k-button-icon k-window-action']"));
		return secretrial;
	}
	
	public static WebElement SupportError(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='first_div']/p[2]/a"));
		return secretrial;
	}
	
	public static WebElement BankDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[7]/a/span)[4]"));
		return secretrial;
	}
	
	public static WebElement CompanyAll(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div[1]/span/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement CompanyAllAF(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div/div/div[1]/span/span/span[1]"));
		return secretrial;
	}
	
	public static WebElement ExportBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnExcel']"));
		return secretrial;
	}
	
	public static WebElement DIR3KYCDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[8]/a/span)[4]"));
		return secretrial;
	}
	
	public static WebElement StatusAllKYC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div[1]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement StatusAllKYC1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddldirector_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement FYClickKYC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement FYClickKYC1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FYid_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement FYDPT(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement FYDPT1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlfyFilter_listbox']/li[2]"));
		return secretrial;
	}
	
	
	public static WebElement AddNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CreateNewDirector']"));
		return secretrial;
	}
	
	public static WebElement AddNewClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
		return secretrial;
	}
	
	public static WebElement AddNewClosereg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
		return secretrial;
	}
	
	public static WebElement Director(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDIR3']/div[1]/div[2]/span[1]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Director1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='directorid_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement IsKYCApplicable_True(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDIR3']/div[2]/div[2]/label[1]"));
		return secretrial;
	}
	
	
	public static WebElement Financialyear(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divShowHide1']/div[2]/span/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement Financialyear1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Fyid_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement KYCStatus(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='KYCStatus']"));
		return secretrial;
	}
	
	public static WebElement SRN(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='SRN']"));
		return secretrial;
	}
	
	public static WebElement Remark(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Remark']"));
		return secretrial;
	}
	//*[@id="lblsuccessI"]
	public static WebElement Save(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDIR3']/div[7]/div/button"));
		return secretrial;
	}
	
	public static WebElement SaveMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='lblsuccessI']"));
		return secretrial;
	}
	
	public static WebElement SaveMsgAE(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDIR3']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement SaveMsgAEreg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement ValMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDIR3']/div[1]/div[2]/span[2]"));
		return secretrial;
	}
	
	public static WebElement UploadBtn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnDIR3Details']"));
		return secretrial;
	}
	
	public static WebElement UploadBtnClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-button k-bare k-button-icon k-window-action']"));
		return secretrial;
	}
	
	public static WebElement UploadBtnClose1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
		return secretrial;
	}
	
	public static WebElement SampleFormat(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divDIR3']/img"));
		return secretrial;
	}
	
	public static WebElement Selectfile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='File']"));
		return secretrial;
	}
	
	public static WebElement Selectfile1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='files1']"));
		return secretrial;
	}
	
	
	public static WebElement Upload(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[3]/button"));
		return secretrial;
	}
	
	public static WebElement UploadVAl(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUploadEntity']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement EditClick(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Edit k-grid-edit hoverCircle k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement AnnualFilingReport(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[9]/a/span)[3]"));
		return secretrial;
	}
	
	public static WebElement DPT3StatusReport(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[10]/a/span)[3]"));
		return secretrial;
	}
	
	public static WebElement AddNewDpt(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='CreateNewDirector']"));
		return secretrial;
	}
	
	public static WebElement CompanyName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[1]/div[2]/span[1]/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement CompanyName1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='entityid_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement FinancialyearDPT(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[2]/div[2]/span/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement FinancialyearDPT1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Fyid_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement WheatherApplicable(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[3]/div[2]/label[1]"));
		return secretrial;
	}
	
	public static WebElement DPTClosureDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divShowHide1']/div[2]/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement DPTClosureDate1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("4"));
		return secretrial;
	}
	
	public static WebElement ApprovalDatebyMCA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divShowHide3']/div[2]/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement ApprovalDatebyMCA1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("10"));
		return secretrial;
	}
	
	public static WebElement SaveBtn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[8]/div/button"));
		return secretrial;
	}
	
	public static WebElement SaveBtn1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[9]/div/button"));
		return secretrial;
	}
	
	public static WebElement SaveBtnreg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[3]/div/button"));
		return secretrial;
	}
	
	
	public static WebElement DptMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[8]/div/button"));
		return secretrial;
	}
	
	public static WebElement UploadDpt(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnDIR3Details']"));
		return secretrial;
	}
	
	public static WebElement SampleDPT(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divDPT3']/img"));
		return secretrial;
	}
	
	public static WebElement SampleReg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Reg26SEBI']/img"));
		return secretrial;
	}

	public static WebElement MSMEReport(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[11]/a/span)[3]"));
		return secretrial;
	}
	
	public static WebElement RegReport(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='lefthomemenu']/ul/li[12]/a/span)[2]"));
		return secretrial;
	}

	public static WebElement DateOfReceiptOfData(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[5]/div[2]/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement DateOfReceiptOfData1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("8"));
		return secretrial;
	}
	
	public static WebElement DateOfFilling(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[6]/div[2]/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement DateOfFilling1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("10"));
		return secretrial;
	}
	
	public static WebElement SelectCompany(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[1]/div[2]/span[1]/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement SelectCompany1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EntityId_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement SelectCompany2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EntityId_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement SelectDirector(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[2]/div[2]/span[1]/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement SelectDirector1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DirectorId_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement FinancialyearReg (WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[3]/div[2]/span/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement FinancialyearReg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Fyid_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement SaveBtnReg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[4]/div/button"));
		return secretrial;
	}
	
	public static WebElement DateOfSubmission(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDPT3']/div[1]/div[2]/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement DateOfSubmission1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("4"));
		return secretrial;
	}
	
	public static WebElement DraftDocument(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnReg26SebiDownload']"));
		return secretrial;
	}
	
	public static WebElement ViewReg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle']"));
		return secretrial;
	}
	
	public static WebElement ViewRegClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[4]"));
		return secretrial;
	}
	
	public static WebElement ViewRegDownload(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Download k-grid-download k-grid-button hoverCircle']"));
		return secretrial;
	}
	
	public static WebElement ViewReg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-View k-grid-view k-grid-button hoverCircle'])[2]"));
		return secretrial;
	}
	
	public static WebElement ViewRegClose1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[7]"));
		return secretrial;
	}
	
	public static WebElement Delete(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-grid-Delete k-grid-delete k-grid-button'])[2]"));
		return secretrial;
	}
	
	public static WebElement DeleteYes(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='btn btn-primary'])[4]"));
		return secretrial;
	}
	
	public static WebElement DeleteMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='modalWindow']/h5"));
		return secretrial;
	}
	
	public static WebElement DirectorAll(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement DirectorAllIn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div/div/div[3]/span/span/span[2]"));
		return secretrial;
	}
	

	public static WebElement DirectorAll1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddldirectorFilter_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement FinancialYearAllREg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div/div/div[3]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement FinancialYearAllIn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement FinancialYearAllREg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlfyFilter_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement IndependenceDeclaration(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='lefthomemenu']/ul/li[13]/a/span"));
		return secretrial;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
