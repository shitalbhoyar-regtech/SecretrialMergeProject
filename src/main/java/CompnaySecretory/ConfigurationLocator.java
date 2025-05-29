package CompnaySecretory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfigurationLocator 
{
	private static WebElement Secreterial;
	private static List<WebElement> elementsList = null;
	
	
	public static WebElement ClickConfiguration(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//*[@id='lefthomemenu']/a/i)[11]"));
		return Secreterial;
	}
	public static WebElement ClickConfigurationDropdown(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@class='k-dropdown-wrap k-state-default']"));
		return Secreterial;
	}
	public static WebElement SelectConfigurationDropdown(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='Id_listbox']/li[1]"));
		return Secreterial;
	}
	
	public static WebElement ClickNewBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='btnCreateNewEmail']"));
		return Secreterial;
	}
	public static WebElement ClickCheckBox(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//label[@class='k-checkbox-label']"));
		return Secreterial;
	}
	public static WebElement ClickTextBox(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//div[@id='PageHeaderFormat_rte-edit-view']//p"));
		return Secreterial;
	}
	public static WebElement ClickTextBox1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='PageFooterFormat_rte-edit-view']/p"));
		return Secreterial;
	}
	public static WebElement ClickSaveBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@value='save']"));
		return Secreterial;
	}
	public static WebElement ClickCloseBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@class=\"btn CloseButton\"]"));
		return Secreterial;
	}
	public static WebElement ClickValidationMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='frmAddTempletMasterEmailFormate']/div[2]/div/div/lable"));
		return Secreterial;
	}
	
	public static WebElement ClickiFrame(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//iframe[@title='Editable area. Press F10 for toolbar.']"));
		return Secreterial;
	}
	public static WebElement ClickiFrame1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//iframe[@title='Editable area. Press F10 for toolbar.'])[2]"));
		return Secreterial;
	}
	public static WebElement ClickEditIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@class=\"k-button-icontext k-grid-Edit k-grid-edit\"]"));
		return Secreterial;
	}
	public static WebElement ClickCloseIcon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@class='k-button k-bare k-button-icon k-window-action'])[3]"));
		return Secreterial;
	}
	public static WebElement ClickFontConfiguration(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//li[normalize-space()='Font Configuration']"));
		return Secreterial;
	}
	public static WebElement ClickEntityCompany(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-input'])[2]"));
		return Secreterial;
	}
	public static WebElement SelectEntityCompany(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='ddlEntityDetails_listbox']/li[18]"));
		return Secreterial;
	}
	public static WebElement ClickFont(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-input'])[3]"));
		return Secreterial;
	}
	public static WebElement SelectFont(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='fonts_listbox']/li[3]"));
		return Secreterial;
	}
	public static WebElement ClickFontSize(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//span[@class='k-input'])[4]"));
		return Secreterial;
	}
	public static WebElement SelectFontSize(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//*[@id='fontsize_listbox']/li[2]"));
		return Secreterial;
	}
	public static WebElement ClickSentenceCase(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//input[@id='sentenceRadio']"));
		return Secreterial;
	}
	public static WebElement ClickCapitalCase(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath(" //input[@id='capitalRadio']"));
		return Secreterial;
	}
	public static WebElement ClickSaveBtn1(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnSave']"));
		return Secreterial;
	}
	public static WebElement ClickValidMsg(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//p[@class='successData']"));
		return Secreterial;
	}
	
	public static WebElement ClickPreviewBtn(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//button[@id='btnPreview']"));
		return Secreterial;
	}
	public static WebElement ClickCloseicon(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("(//a[@aria-label='Close'])[3]"));
		return Secreterial;
	}
	public static WebElement ClickInvalidEntityName(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@id='EntityName_validationMessage']"));
		return Secreterial;
	}
	public static WebElement ClickInvalidFontName(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@id='FontType_validationMessage']"));
		return Secreterial;
	}
	public static WebElement ClickInvalidFontSize(WebDriver driver)
	{
		
		Secreterial =driver.findElement(By.xpath("//span[@id='FontSize_validationMessage']"));
		return Secreterial;
	}
	
}
