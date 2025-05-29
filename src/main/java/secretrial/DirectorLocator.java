package secretrial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DirectorLocator {

private static WebElement secretrial = null;				//WebElement variable created for 'Categories' click
	
	private static List<WebElement> secretrialList = null;		
	
	public static WebElement Director(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[.='Director/KMP'])[2]"));
		return secretrial;
	}
	
	public static WebElement ClickDashboard(WebDriver driver)		//Method for closing Message Popup
	{
	//	secretrial = driver.findElement(By.xpath("//ul[@id='menu']//li[2] | (//img[@class='nav-link-icons MenuIconClass'])[1]"));
		try {
		//secretrial = driver.findElement(By.xpath("(//img[contains(@src,'NewUi_Images/Dashboard.svg')])[2] | //li[@id='lefthomemenu']//span[@class='MenunameStyle' and .='My Dashboard']"));
			secretrial = driver.findElement(By.xpath("(//ul[@id='menu']//li[@id='lefthomemenu'])[2]"));
		}
		catch(Exception e)
		{
			secretrial = driver.findElement(By.xpath("//li[@id='lefthomemenu']//span[@class='MenunameStyle' and .='My Dashboard']"));
		}
		return secretrial;
	}
	public static WebElement dashboardtab(WebDriver driver)		//Method for closing Message Popup
	{
		try {
		secretrial = driver.findElement(By.xpath("//li[@class='SmallMenuLi']//a[@href='/Dashboard/']"));
		}
		catch(Exception e) {
		//	secretrial = driver.findElement(By.xpath("//span[@class='fly-out-top-item-name SubSmallMenunameStyle' and .='Dashboard']"));
		}
		return secretrial;
	}
	
	
	public static WebElement NotApplicable(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.id("btnUpdateStatus"));	
		return secretrial;
	}
	public static WebElement SaveMessage(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//lable[@id='lblsuccessI']"));	
		return secretrial;
	}
	
	public static WebElement Closepopup(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[1]"));	
		return secretrial;
	}
	public static WebElement status(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//span[@aria-owns='StatusId_listbox']//span[@class='k-select']"));	
		return secretrial;
	}
	public static WebElement statusValue(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//ul[@id='StatusId_listbox'])[2]//li[2]"));	
		return secretrial;
	}
	public static WebElement compliancedoc(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//input[@id='complianceDoc']"));	
		return secretrial;
	}
	public static WebElement workdoc(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//input[@id='workingDoc']"));	
		return secretrial;
	}
	public static WebElement Date(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//span[@class='k-widget k-datepicker k-header']//span[@class='k-select']"));	
		return secretrial;
	}
	
	public static WebElement Dateselect(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//td[@class='k-today k-state-focused']"));	
		return secretrial;
	}
	public static WebElement Savebtn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//button[@id='btnsaveStatus']"));	
		return secretrial;
	}
	
	
	public static WebElement Master(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.cssSelector("body > div:nth-child(1) > section:nth-child(1) > aside:nth-child(1) > div:nth-child(7) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));
		return secretrial;
	}
	public static WebElement  MasterMenu(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//span[.='Masters'])[2]"));
		return secretrial;
	}
	public static WebElement DirectorAddNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnCreateNewDirector']"));
		return secretrial;
	}
	public static WebElement readTotalItems(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//div[@id='gridComplianceAssinged']//span[@class='k-pager-info k-label']"));
		return secretrial;
	}
	
	
	public static WebElement Salutation(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_SectionDetails']/li/div/div[1]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement SalutationMS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Salutation_listbox']/li[4]"));
		return secretrial;
	}
	
	public static WebElement FirstName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FirstName']"));
		return secretrial;
	}
	
	public static WebElement MiddleName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MiddleName']"));
		return secretrial;
	}
	
	public static WebElement LastName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='LastName']"));
		return secretrial;
	}
	
	public static WebElement Gender(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_SectionDetails']/li/div/div[1]/div/div[5]/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Female(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Gender_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement DateofBirth(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='panelbar_SectionDetails']/li/div/div[1]/div/div[5]/div[2]/span[2]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement DateofBirth1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("3"));
		return secretrial;
	}
	public static WebElement Year(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//div[@class='k-header']//a[@class='k-link k-nav-fast']"));
		return secretrial;
	}
	public static WebElement Year1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//div[@class='k-header']//a[@class='k-link k-nav-fast k-state-hover']"));
		return secretrial;
	}
	
	public static WebElement YearS(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//a[.='2000 - 2009']"));
		return secretrial;
	}
	public static WebElement YearDOB(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//table[@class='k-content k-meta-view k-decade']//tr//td[2]//a[1]"));
		return secretrial;
	}
	public static WebElement Month(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//a[.='Jan']"));
		return secretrial;
	}
	
	public static WebElement MonthDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("1"));
		return secretrial;
	}
	public static WebElement DIN(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='DIN']"));
		return secretrial;
	}
	

	public static WebElement FatherFirstName(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FatherFirstName']"));
		return secretrial;
	}
	
	public static WebElement FatherMiddleName(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FatherMiddleName']"));
		return secretrial;
	}
	
	public static WebElement FatherLastName(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FatherLastName']"));
		return secretrial;
	}
	
	public static WebElement PANofDirector(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='PAN']"));
		return secretrial;
	}
	
	public static WebElement Adhaar(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Adhaar']"));
		return secretrial;
	}
	
	public static WebElement Resident(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//span[@aria-owns='ResidentInIndia_listbox']//span[@class='k-select']"));
		return secretrial;
	}
	
	public static WebElement ResidentYes(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ResidentInIndia_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement MobileNo(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MobileNo']"));
		return secretrial;
	}
	
	public static WebElement EmailId(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EmailId']"));
		return secretrial;
	}
	
	public static WebElement EmailId_Official(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EmailId_Official']"));
		return secretrial;
	}
	
	public static WebElement DSCExpiryDate(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='col-md-1 colpadding0']//span[@class='k-select'])[4]//span"));
		return secretrial;
	}
	
	public static WebElement DSCExpiryDate1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("25"));
		return secretrial;
	}
	
	public static WebElement MotherName(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MotherName']"));
		return secretrial;
	}
	
	public static WebElement Permenant_Address_Line1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Permenant_Address_Line1']"));
		return secretrial;
	}
	
	public static WebElement Country(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//span[@aria-owns='ddlpercountry_listbox']//span[@class='k-select']"));
		return secretrial;
	}
	
	public static WebElement CountryIndia(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlpercountry_listbox']/li[.='India']"));
		return secretrial;
	}
	
	
	public static WebElement State(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//span[@aria-owns='ddlPermenant_StateId_listbox']//span[@class='k-select']"));
		return secretrial;
	}
	
	public static WebElement Maharastra(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//ul[@id='ddlPermenant_StateId_listbox']//li[.='Maharashtra']"));
		return secretrial;
	}
	
	public static WebElement City(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//span[@aria-owns='ddlPermenant_CityId_listbox']//span[@class='k-select']"));
		return secretrial;
	}
	
	public static WebElement Ahmadnagar(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("(//ul[@id='ddlPermenant_CityId_listbox'])[4]//li[3]"));
		return secretrial;                        
	}
	
	public static WebElement permanentRadio (WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[2]/div/div[2]/label[1]"));
		return secretrial;
	}
	
	public static WebElement EducationalQualification (WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div[1]/span[2]/span[1]/span[2]"));
		return secretrial;
	}
	
	public static WebElement Graduation (WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EducationalQualification_listbox']/li[4]"));
		return secretrial;
	}
	
	public static WebElement Occupation(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div[3]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Professional(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Occupation_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement AreaofOccupation(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='step1Content']/div[1]/div/div[4]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement Government(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AreaOfOccupation_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement Save(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnsub1']"));
		return secretrial;
	}
	
	public static WebElement SaveMsg(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateDetails']/div[2]/div[2]/div/lable"));
		return secretrial;
	}
	
	public static WebElement SaveMsg1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divDetailsNew']/div[2]/div[2]/div/lable"));
		return secretrial;
	}
	
	
	public static WebElement Close(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose1']"));
		return secretrial;
	}
	
	public static WebElement Close1(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnclose2']"));
		return secretrial;
	}
	
	public static WebElement Search(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterSearch']"));
		return secretrial;
	}
	
	public static WebElement Edit(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//img[@src='/NewUi_Images/edit.svg']"));
		return secretrial;
	}
	
	public static WebElement NameVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FirstName_validationMessage']"));
		return secretrial;
	}
	
	public static WebElement FatherLastNameVal(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='FatherLastName_validationMessage']"));
		return secretrial;
	}
	
	public static WebElement ListofRelatives(WebDriver driver)		
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab2']"));
		return secretrial;
	}
	
	public static WebElement  CloseLR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
		return secretrial;
	}
	
	public static WebElement  AddNew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnAddDetailsRelative']"));
		return secretrial;
	}
	
	
	public static WebElement  Relation(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmCreateDirectorRelatives']/div[3]/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  HUF(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//ul[@id='Relation_listbox'])[2]//li[1]"));
		return secretrial;
	}
	
	public static WebElement  Spouse(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//ul[@id='Relation_listbox'])[2]//li[2]"));
		return secretrial;
	}
	
	public static WebElement  Father(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='Relation_listbox'])[2]//li[3] | //li[normalize-space(text())='Father']"));
		return secretrial;
	}
	
	public static WebElement  Mother(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='Relation_listbox'])[2]//li[4] | //li[normalize-space(text())='Mother']"));
		return secretrial;
	}
	
	public static WebElement  Son(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='Relation_listbox'])[2]//li[5] | //li[normalize-space(text())='Son']"));
		return secretrial;
	}
	
	public static WebElement  Daughter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='Relation_listbox'])[2]//li[6] | //li[normalize-space(text())='Daughter']"));
		return secretrial;
	}
	
	public static WebElement  Brother(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='Relation_listbox'])[2]//li[7] | //li[normalize-space(text())='Brother']"));
		return secretrial;
	}
	
	public static WebElement  Sister(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='Relation_listbox'])[2]//li[8] | //li[normalize-space(text())='Sister']"));
		return secretrial;
	}
	
	
	public static WebElement  Name(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Name']"));
		return secretrial;
	}
	
	public static WebElement  MinorAdult(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divMinorAdult']/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  Adult(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Minor_or_Adult_listbox']/li[3]"));
		return secretrial;
	}

	public static WebElement  MaritalStatus(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divMaritalStatus']/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  Married(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MaritalStatus_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement  SpouseName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Spouse']"));
		return secretrial;
	}
	
	public static WebElement  ChangeType(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divChangeType']/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  ChangeType1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ChangeTypeId_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  ChangeDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divChangeDate']/div/div[2]/span[1]/span/span/span"));
		return secretrial;
	}
	
	public static WebElement  ChangeDate1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("1"));
		return secretrial;
	}
	
	public static WebElement  SaveLOR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmCreateDirectorRelatives']/div[10]/div/button[1]"));
		return secretrial;
	}
	public static WebElement  SaveAssignement(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//div[@class='row']//div[@class='col-md-12 colpadding0']//div[@class='alert alert-success']//lable"));
		return secretrial;
	}
	public static WebElement  SaveLORMSg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.cssSelector("div[class='col-md-12 colpadding0'] div[class='alert alert-danger alert-dismissible'] lable"));
		return secretrial;
	}
	public static WebElement  SavesuccessSg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//div[@class='row']//div[@class='col-md-12 colpadding0']//div[@class='alert alert-success alert-dismissible']//lable"));
		return secretrial;
	}
	
	public static WebElement  SaveLORMSg1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmCreateDirectorRelatives']/div[2]/div/div/lable"));
		return secretrial;
	}
	public static WebElement  SaveMSG(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmCreateDirectorRelatives']/div[1]//label"));
		return secretrial;
	}
	
	public static WebElement  CloseLOR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btncloseRelative']"));
		return secretrial;
	}
	
	public static WebElement  LOREdit(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//div[@id='gridRelative']//a[@class='k-grid-Edit k-grid-edit k-grid-button'])[1]"));
		return secretrial;
	}
	
	public static WebElement  itemsperpage(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridRelative']/div[3]/span[1]"));
		return secretrial;
	}
	
	public static WebElement  DetailsOfInterest(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab3']"));
		return secretrial;
	}
	
	public static WebElement  DetailsofCommitteePositions(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab4']"));
		return secretrial;
	}
	
	
	public static WebElement  DOCPAddnew(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnAddDetailsOfCommittee']"));
		return secretrial;
	}
	
	
	public static WebElement  DOCPEntityName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//span[@aria-owns='ddlEntityType_listbox']//span[@class='k-select']"));

		//secretrial = driver.findElement(By.xpath("//*[@id='window']/div/div/div[3]/div/div[2]/span/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  DOCPEntityName1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlEntityType_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  DOCPCommitteName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//span[@aria-owns='ddlCommitteelist_listbox']//span[@class='k-select']"));

		//secretrial = driver.findElement(By.xpath("//*[@id='window']/div/div/div[4]/div/div[2]/span[1]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement  DOCPCommitteName1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCommitteelist_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement  DOCPCommitteName2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCommitteelist_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  DOCPCommitteNameBlank(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlCommitteelist-list']/div[1]"));
		return secretrial;
	}
	
	
	public static WebElement  DOCPPosition(WebDriver driver)		//Method for closing Message Popup
	{
	//	secretrial = driver.findElement(By.xpath("//*[@id='window']/div/div/div[6]/div/div[2]/span[1]/span/span[2]"));
		secretrial = driver.findElement(By.xpath("//span[@aria-owns='ddlDesignation_listbox']"));
		return secretrial;
	}
	
	public static WebElement  DOCPPosition1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlDesignation_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement  DateofAppointment(WebDriver driver)		//Method for closing Message Popup
	{
	//	secretrial = driver.findElement(By.xpath("//*[@id='window']/div/div/div[8]/div/div[2]/span[1]/span/span/span"));
		secretrial = driver.findElement(By.xpath("//span[@aria-controls='AppointmentFrom_dateview']"));
		
		return secretrial;
	}
	
	public static WebElement  Entityname(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//input[@id='EntityName']"));
		
		return secretrial;
	}
	public static WebElement  CommitteeName(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//input[@id='CommitteeName']"));
		
		return secretrial;
	}
	
	public static WebElement  position(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//input[@id='Designation_Name']"));
		
		return secretrial;
	}
	public static WebElement  Update(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//a[normalize-space()='Update']"));
		
		return secretrial;
	}
	
	public static WebElement  Entitynamegrid(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//td[@id='gridKendo1_active_cell']"));
		
		return secretrial;
	}
	
	
	
	public static WebElement  DateofAppointment1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("2"));
		return secretrial;
	}
	
	
	public static WebElement  DateofCessation(WebDriver driver)		//Method for closing Message Popup
	{
		//secretrial = driver.findElement(By.xpath("//*[@id='window']/div/div/div[9]/div/div[2]/span[1]/span/span/span"));
		secretrial = driver.findElement(By.xpath("//span[@aria-controls='AppointmentTo_dateview']"));
		return secretrial;
	}
	
	public static WebElement  DateofCessation1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("4"));
		return secretrial;
	}
	
	
	public static WebElement  SaveDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		//secretrial = driver.findElement(By.xpath("//*[@class='k-button k-button-icontext k-primary k-grid-update']"));
		secretrial = driver.findElement(By.xpath("(//button[@type='submit'][normalize-space()='Save'])[2]"));
		return secretrial;
	}
	
	public static WebElement  SaveMsgDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='lblerrormsg']"));
		return secretrial;
	}
	
	public static WebElement  UpdateMsgDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divsuccess']"));
		return secretrial;
	}
	
	public static WebElement  CloseDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		//secretrial = driver.findElement(By.xpath("//*[@class='k-button k-button-icontext k-grid-cancel']"));
		secretrial = driver.findElement(By.xpath("//button[@id='btnclose']"));

		return secretrial;
	}
	
	public static WebElement  CloseD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//a[normalize-space()='Close']"));

		return secretrial;
	}
	
	
	public static WebElement  EntityNameVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Entity_Id_validationMessage']"));
		return secretrial;
	}
	
	
	public static WebElement  CommitteNameVal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Committee_Id_validationMessage']"));
		return secretrial;
	}
	
	public static WebElement  EditDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-edit k-grid-button']"));
		return secretrial;
	}

	public static WebElement  DeleteDOCP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-delete k-grid-button']"));
		return secretrial;
	}
	
	
	public static WebElement  SecurityDetails(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab5']"));
		return secretrial;
	}
	
	public static WebElement  SecurityDetailsEdit(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Edit k-grid-edit k-grid-button']"));
		return secretrial;
	}
	
	public static WebElement  NumberofTransaction(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='tblClassDShares']"));
		return secretrial;
	}
	
	public static WebElement  NumberofSecurities(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNoofSec_0']"));
		return secretrial;
	}
	
	public static WebElement  DescriptionofSecurities(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDescSec_0']"));
		return secretrial;
	}
	
	public static WebElement  NominalValueSecurities(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtNominalValSec_0']"));
		return secretrial;
	}
	
	
	public static WebElement  Dateofacquisition(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDateOfAcqisition_0']"));
		return secretrial;
	}
	

	public static WebElement  Dateofdisposal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtDateOfDisposal_0']"));
		return secretrial;
	}
	
	public static WebElement  Pricepaidforacquisition(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtPricePaid_0']"));
		return secretrial;
	}
	
	public static WebElement  Otherconsiderationpaidforacquisition(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtOtherPaidAcq_0']"));
		return secretrial;
	}
	
	public static WebElement  Pricereceivedondisposal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtPriceRec_0']"));
		return secretrial;
	}
	
	public static WebElement  Modeofacquisition(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtModeOfAcq_0']"));
		return secretrial;
	}
	
	public static WebElement  Otherconsiderationreceivedondisposal(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtOtherDisposal_0']"));
		return secretrial;
	}
	
	public static WebElement  Cumulativebalance(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtCumulativeBal_0']"));
		return secretrial;
	}
	
	public static WebElement  txtSecCurities(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='txtSecCurities_0']"));
		return secretrial;
	}
	
	public static WebElement  SaveSD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btncompayDtls']"));
		return secretrial;
	}
	
	public static WebElement  SaveMsgSD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='successmessage']"));
		return secretrial;
	}
	
	public static WebElement  CloseSD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btncloseComdls']"));
		return secretrial;
	}
	
	public static WebElement  Profile(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytab6']"));
		return secretrial;
	} 
	
	public static WebElement  Profiletext(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("/html/body"));
		return secretrial;
	} 
	
	
	public static WebElement  ProfileSave(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnsavedirectorProfile']"));
		return secretrial;
	} 
	
	public static WebElement  ProfileFrame(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmDirectorProfileDetails']/div[3]/div/table/tbody/tr[2]/td/iframe"));
		return secretrial;
	} 
	
	public static WebElement  ProfileTextMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='lblsuccess']"));
		return secretrial;
	} 
	
	public static WebElement  DirectorDIR8(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='generateDIR8']"));
		return secretrial;
	} 
	
	public static WebElement  DIR8Close(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[10]"));
		return secretrial;
	} 
	
	public static WebElement  DirectorDIR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//span[@aria-owns='DirectorId_listbox']//span[@class='k-select']"));
		return secretrial;
	} 
	
	public static WebElement  DirectorDIR1(WebDriver driver)		//Method for closing Message Popup
	{
	//	secretrial = driver.findElement(By.xpath("//*[@id='directorid_listbox']/li[2]"));
		secretrial = driver.findElement(By.xpath("//*[@id='DirectorId_listbox']/li[2]"));		
		return secretrial;
	} 
	
	public static WebElement EntityNameDIR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='GenerateDIR8']/div[2]/div[2]/span/span/span[2]"));
		return secretrial;
	} 
	
	public static WebElement EntityNameDIR1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EntityId_listbox']/li[1]"));
		return secretrial;
	} 
	
	
	public static WebElement DateOfIssueDIR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='GenerateDIR8']/div[3]/div[2]/span[1]/span/span/span"));
		return secretrial;
	} 
	
	public static WebElement DateOfIssueDIR1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("12"));
		return secretrial;
	} 
	
	
	public static WebElement PreviewDIR(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnDIR8Preview']"));
		return secretrial;
	} 
	
	
	public static WebElement PreviewText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//body//p//span[1]"));
		return secretrial;
	} 
	public static WebElement frame(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//iframe[@class='k-content']"));
		return secretrial;
	} 
	
	
	public static WebElement PreviewClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//a[@aria-label='Close'])[15]"));
		return secretrial;
	} 
	
	public static WebElement PreviewDownload(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnDIR8Download']"));
		return secretrial;
	} 
	
	
	public static WebElement DirectorMBP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='generateMBP1']"));
		return secretrial;
	} 
	
	public static WebElement  MBP1Close(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[11]"));
		return secretrial;
	} 
	
	
	public static WebElement  DirectorMBP1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='GenerateMBP1']/div[1]/div[2]/span[1]/span/span[2]"));
		return secretrial;
	} 
	
	public static WebElement  DirectorMBP11(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//ul[@id='DirectorId_listbox']//li[1]"));
		return secretrial;
	} 
	
	public static WebElement EntityNameMBP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='GenerateMBP1']/div[2]/div[2]/span/span/span[2]"));
		return secretrial;
	} 
	
	public static WebElement EntityNameMBP1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//ul[@id='EntityId_listbox']//li[1]"));
		return secretrial;
	} 
	
	
	public static WebElement DateOfIssueMBP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='GenerateMBP1']/div[3]/div[2]/span[1]/span/span/span"));
		return secretrial;
	} 
	
	public static WebElement DateOfIssueMBP1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.linkText("12"));
		return secretrial;
	} 
	
	
	public static WebElement PreviewMBP1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnMBP1Preview']"));
		return secretrial;
	} 
	
	public static WebElement PreviewTextMBP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MBP1Preview_wnd_title']"));
		return secretrial;
	} 
	
	
	public static WebElement DownloadMBP(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnMBP1Download']"));
		return secretrial;
	} 
		
	public static WebElement View(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Display k-grid-view hoverCircle k-grid-button']"));
		return secretrial;
	} 
	
	public static WebElement ViewText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='wndDirectorview_wnd_title']"));
		return secretrial;
	} 
	
	public static WebElement ViewClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@class='k-button k-bare k-button-icon k-window-action'])[2]"));
		return secretrial;
	} 
	
	public static WebElement ViewAbout(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytababout']"));
		return secretrial;
	} 
	
	public static WebElement DetailsOfInterestView(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytabdirectorship']"));
		return secretrial;
	} 
	
	public static WebElement CommitteePositions(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='mytabcommitee']"));
		return secretrial;
	} 
	
	public static WebElement Delete(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-grid-Delete k-grid-delete hoverCircle k-grid-button']"));
		return secretrial;
	} 
	
	public static WebElement DINText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@style='text-align: center;']"));
		return secretrial;
	} 
	
	public static WebElement Upload(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='childrow']/div/div/div/div[1]/div/div[4]/input"));
		return secretrial;
	} 
	
	public static WebElement UploadClose(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@class='k-button k-bare k-button-icon k-window-action']"));
		return secretrial;
	} 
	
	public static WebElement Uploadbtn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUpload']/div[4]/div/button"));
		return secretrial;
	} 
	
	public static WebElement UploadMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUpload']/div[1]/div[1]/div/lable"));
		return secretrial;
	} 
	
	public static WebElement ExcelRadio(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUpdateUpload']/div[3]/div[2]/label[2]/text()"));
		return secretrial;
	} 
	
	public static WebElement SampleFormate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//img[contains(@src, 'Images/Excel_icon.png')])[1]"));
		return secretrial;
	} 
	
	public static WebElement complianceassignment(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='Mastermenu']/ul/li[11]/a"));
		return secretrial;
	} 
	
	public static WebElement MeetingRadio(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divRadioParent']/div/label[1]"));
		return secretrial;
	} 
	
	public static WebElement Entity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='home']/div[1]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;
	} 
	
	public static WebElement Entity1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EntityID_listbox']/li[1]"));
		return secretrial;
	} 
	public static WebElement Entity11(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='EntityID_listbox']/li[6]"));
		return secretrial;
	} 
	public static WebElement Id(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//tr//td[2]"));
		return secretrial;
	} 
	public static WebElement id(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridComplianceAssign']/div//td[2]"));
		return secretrial;
	} 
	
	
	
	public static WebElement Performer(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='home']/div[1]/div/div[2]/span[2]/span/span[2]"));
		return secretrial;
	} 
	
	public static WebElement Performer1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlPerformer_listbox']/li[1]"));
		return secretrial;
	} 
	
	public static WebElement Reviewer(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='home']/div[1]/div/div[3]/span[2]/span/span[2]"));
		return secretrial;
	} 
	
	public static WebElement Reviewer1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlReviewer_listbox']/li[2]"));
		return secretrial;
	} 
	
	public static WebElement StartDate(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='home']/div[1]/div/div[4]/span[2]/span/span/span"));
		return secretrial;
	} 
	
	public static WebElement StartDate1(WebDriver driver)		//Method for closing Message Popup
	{
		//secretrial = driver.findElement(By.linkText("2"));
		secretrial = driver.findElement(By.xpath("(//td//a[.='2'])[1]"));

		
		return secretrial;
	} 
	
	public static WebElement Filter(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterCompliance']"));
		return secretrial;
	}
	

	public static WebElement SaveCA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='fsetCompliance']/div[2]/div/div[2]/button"));
		return secretrial;
	}
	
	public static WebElement SaveCAMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divgridComplianceAssignMessage']/div/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement CheckBox(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridComplianceAssign']/div[3]/table/tbody/tr[1]/td[1]/input"));
		return secretrial;
	}
	
	public static WebElement CheckBoxAll(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='header_chbComplianceAssign']"));
		return secretrial;
	}
	
	public static WebElement ID(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridComplianceAssign']/div[3]/table/tbody/tr[1]/td[2]"));
		return secretrial;
	}
	
	public static WebElement Assigned(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MyTab']/li[2]"));
		return secretrial;
	}
	
	public static WebElement Export(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ExcelExport']"));
		return secretrial;
	}
	
	public static WebElement EntityAssi(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='menu1']/div[1]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement EntityAssi1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='AssignedComplianceEntityID_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement ReAssignment(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MyTab']/li[3]"));
		return secretrial;
	}
	
	public static WebElement EntityRA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='menuReAssignment']/div[2]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement EntityRA1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ReAssignmentEntityID_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement EntityRA2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ReAssignmentEntityID_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement EntityRA3(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ReAssignmentEntityID_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement User(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='menuReAssignment']/div[2]/div/div[2]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement User1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlUser_listbox']/li[1]"));
		return secretrial;
	}
	
	public static WebElement User2(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlUser_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement NewUser(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='menuReAssignment']/div[2]/div/div[3]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement NewUser1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ddlNewUser_listbox']/li[2]"));
		return secretrial;
	}
	
	public static WebElement SaveRA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnSaveReAssignment']"));
		return secretrial;
	}
	
	public static WebElement SaveRAMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divgridComplianceReAssignMessage']/div/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement Checkbox(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridComplianceReAssignment']/div[2]/table/tbody/tr[1]/td[1]/input"));
		return secretrial;
	}
	
	public static WebElement CheckboxAll(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='header_chbReAssignment']"));
		return secretrial;
	}
	
	public static WebElement Agenda(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divRadioParent']/div/label[2]/span"));
		return secretrial;
	}
	
	public static WebElement EntityAgen(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='home']/div[1]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement CheckboxAllAge(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='header_chb']"));
		return secretrial;
	}
	
	public static WebElement CheckboxAge1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridAgendaItems']/div[3]/table/tbody/tr[1]/td[1]/input"));
		return secretrial;
	}
	
	public static WebElement Apply(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnApplyAgendaItem']"));
		return secretrial;
	}
	
	public static WebElement Apply1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnApplyComplianceFilter']"));
		return secretrial;
	}
	
	public static WebElement filterCompliance(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterCompliance']"));
		return secretrial;
	}
	
	public static WebElement SaveAgenda(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='fsetCompliance']/div[2]/div/div[2]/button"));
		return secretrial;
	}
	
	public static WebElement SaveAgendaMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divgridComplianceAssignMessage']/div/div/div/lable"));
		return secretrial;
	}
	
	
	public static WebElement idText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridComplianceAssign']/div//td[2]"));
		return secretrial;
	}
	
	
	public static WebElement CheckAllAgen(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='header_chbReAssignment']"));
		return secretrial;
	}
	
	public static WebElement CheckAgen(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridComplianceReAssignment']/div[2]/table/tbody/tr[1]/td[1]/input"));
		return secretrial;
	}
	
	public static WebElement UploadAssignment(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MyTab']/li[4]"));
		return secretrial;
	}
	
	public static WebElement UploadBtn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//button[@type='submit']"));
		return secretrial;
	}
	
	public static WebElement UploadMsgAgn(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='frmUploadAComplianceAssignment']/div[1]/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement Statutory(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divRadioParent']/div/label[3]/span"));
		return secretrial;
	}
	
	public static WebElement StatutoryCheck(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//input[@class='chkbx']"));
		return secretrial;
	}
	
	public static WebElement StatutoryCheckAll(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='complianceFilterHeader_chb']"));
		return secretrial;
	}
	
	public static WebElement ExcludeAssignment(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='MyTab']/li[5]"));
		return secretrial;
	}
	
	public static WebElement EntityEA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='excludeAssignment']/div[2]/div/div[1]/span[2]/span/span[2]"));
		return secretrial;
	}
	
	public static WebElement EntityEA1(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='ExcludeAssignedComplianceEntityID_listbox']/li[3]"));
		return secretrial;
	}
	
	public static WebElement CheckEA(WebDriver driver)		//Method for closing Message Popup
	{
	//	secretrial = driver.findElement(By.xpath("//*[@id='gridComplianceAssingedExclude']/table/tbody/tr[1]/td[1]/input"));
		secretrial = driver.findElement(By.xpath("//*[@id='gridComplianceAssingedExclude']/div/table/tbody/tr[1]/td[1]/input"));

		
		return secretrial;
	}
	
	
	
	public static WebElement SaveEA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='btnExlcudeCompliance']"));
		return secretrial;
	}
	
	public static WebElement SaveEAMsg(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='divgridComplianceAssignExcludeMessage']/div/div/div/lable"));
		return secretrial;
	}
	
	public static WebElement FilterEA(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='filterComplianceAssingedExclude']"));
		return secretrial;
	}
	
	public static WebElement FilterEAText(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@id='gridComplianceAssingedExclude']/table/tbody/tr[1]/td[2]"));
		return secretrial;
	}
	
	public static WebElement NotApplicableRB(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='eVoting'])[2]"));
		return secretrial;
	}
	
	public static WebElement ApplicableRB(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@id='eVoting'])"));
		return secretrial;
	}
	
	public static WebElement EntityDropdown(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//input[@class='k-input k-readonly' and @aria-owns='ddlEntityComplianceDetails_taglist ddlEntityComplianceDetails_listbox'])[1]"));
		return secretrial;
	}
	
	public static WebElement EntityCheckbox(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//div[@id='ddlEntityComplianceDetails-list' and @class='k-list-container k-popup k-group k-reset k-state-border-up']//li//input[@type='checkbox'])[10]"));
		return secretrial;
	}
	public static WebElement Clearbutton(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.id("btnClearFilter"));
		return secretrial;
	}
	public static WebElement Financialyeardropdown(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//span[@class='k-widget k-dropdown k-header abc' and @aria-owns='ddlFYtoDate_listbox']"));
		return secretrial;
	}
	
	public static WebElement FinancialyeardropdownDD(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//ul[@id='ddlFYtoDate_listbox']//li[.='All']"));
		return secretrial;
	}
	public static WebElement CBySumOverdue(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@fill='#F44336'])[2]"));
		return secretrial;
	}
	public static WebElement OverallComStaOverdue(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@fill='#F44336'])[1]"));
		return secretrial;
	}
	
	
	public static WebElement CBySumClosedTimely(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@fill='#4CAF50'])[2]"));
		return secretrial;
	}
	public static WebElement OverallComStaClosedTimely(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//*[@fill='#4CAF50'])[1]"));
		return secretrial;
	}
	public static WebElement OverallComStaClosedTimelyMedium(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@fill='#e16e6a' and @d='M57.5 48.5 L 91.5 48.5 91.5 219.5 57.5 219.5Z']"));
		return secretrial;
	}
	
	
	
	public static WebElement CBySumOverdueCount(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//div[@class='k-tooltip k-chart-tooltip']"));
		return secretrial;
	}
	public static WebElement ComplianceStatus(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//span[@aria-owns='ddlComplianceStatusFilter_listbox']//span[@class='k-select']"));
		return secretrial;
	}
	public static WebElement ComplianceStatusValue(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//ul[@id='ddlComplianceStatusFilter_listbox']//li[.='Overdue']"));
		return secretrial;
	}
	
	public static WebElement ComplianceType(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//span[@aria-owns='ddlCheckListComplianceForDashboard_listbox']//span[@class='k-select']"));
		return secretrial;
	}
	
	public static WebElement ComplianceTypeValue(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//ul[@id='ddlCheckListComplianceForDashboard_listbox']//li[.='Statutory Checklist']"));
		return secretrial;
	}
	public static WebElement EventFunction(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//ul[@id='ddlCheckListComplianceForDashboard_listbox']//li[.='Event Function']"));
		return secretrial;
	}
	public static WebElement StatutoryFunction(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//ul[@id='ddlCheckListComplianceForDashboard_listbox']//li[.='Statutory Function']"));
		return secretrial;
	}
	public static WebElement Eventchecklist(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//ul[@id='ddlCheckListComplianceForDashboard_listbox']//li[.='Event Checklist']"));
		return secretrial;
	}
	
	
	public static WebElement OverallCompletionOverdue(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//div[@id='divDonutOCount']"));
		return secretrial;
	}
	
	public static WebElement OverallCompletionClosedDelayed(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//div[@id='divDonutCDCount']"));
		return secretrial;
	}
	
	
	public static WebElement OverallCompletionClosedTimely(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//div[@id='divDonutCTCount']"));
		return secretrial;
	}
	
	public static WebElement High(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@fill='#b03830']"));
		return secretrial;
	}
	
	public static WebElement Medium(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@fill='#e16e6a']"));
		return secretrial;
	}
	
	public static WebElement Low(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("//*[@fill='#e4a19c']"));
		return secretrial;
	}
	
	public static WebElement MainActivity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//th[@class='k-header k-with-icon'])[1]"));
		return secretrial;
	}
	
	public static WebElement BusinessActivity(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//th[@class='k-header k-with-icon'])[2]"));
		return secretrial;
	}
	
	public static WebElement Turnover(WebDriver driver)		//Method for closing Message Popup
	{
		secretrial = driver.findElement(By.xpath("(//th[@class='k-header k-with-icon'])[3]"));
		return secretrial;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
