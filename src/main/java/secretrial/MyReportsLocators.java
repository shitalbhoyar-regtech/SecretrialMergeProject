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
	
	public static WebElement ExportDD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divBtnExport']/img[1]"));
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
		secretrial = driver.findElement(By.xpath("//*[@id='myReportMenu']/ul/li[7]/a/span"));
		return secretrial;
	}
	
	public static WebElement CompanyAll(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div/div[1]/span/span/span[2]/span"));
		return secretrial;
	}
	
	public static WebElement ExportBD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnExcel']"));
		return secretrial;
	}
	
	public static WebElement DIR3KYCDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='myReportMenu']/ul/li[8]/a/span"));
		return secretrial;
	}
	
	public static WebElement StatusAllKYC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div[1]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement FYClickKYC(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div[1]/div/div[2]/span/span/span[2]"));
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
		secretrial = driver.findElement(By.xpath("//*[@id='myReportMenu']/ul/li[9]/a/span"));
		return secretrial;
	}
	
	public static WebElement DPT3StatusReport(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='myReportMenu']/ul/li[10]/a/span"));
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

	public static WebElement MSMEReport(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='myReportMenu']/ul/li[11]"));
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
