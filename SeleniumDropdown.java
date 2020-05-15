package week2seleniumbasics;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class SeleniumDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("Demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_firstName").sendKeys("divya");
		driver.findElementById("createLeadForm_lastName").sendKeys("divya");
	//	driver.findElementByClassName("smallSubmit").click();
		
		WebElement source= driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown= new Select(source);
		dropDown.selectByVisibleText("Conference");
		
		WebElement industry= driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown2= new Select(industry);
		dropDown2.selectByValue("IND_AEROSPACE");
		
		WebElement ownership= driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown3= new Select(ownership);
		dropDown3.selectByIndex(1);
		
		
}
}
