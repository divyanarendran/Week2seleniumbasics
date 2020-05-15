package week2seleniumbasics;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class SeleniumUsingLocators {

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
		//dropDown.selectByVisibleText("Conference");
		List<WebElement> options1 =dropDown.getOptions();
		int size1=options1.size();
		System.out.println(size1);
		for(WebElement allOptions:options1)
		{
			Thread.sleep(1000);
			allOptions.click();
			
		}
		WebElement industry=driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown2=new Select(industry);
		List<WebElement>options2=dropDown2.getOptions();
		int size2=options2.size();
		System.out.println(size2);
		for(WebElement allOptions2:options2)
		{
			Thread.sleep(1000);
			allOptions2.click();
		}
		WebElement ownership=driver.findElementById("createLeadForm_ownershipEnumId");
		Select dropDown3=new Select(ownership);
		List<WebElement>options3=dropDown3.getOptions();
		int size3=options3.size();
		System.out.println(size3);
		for(WebElement allOptions3:options3)
		{
			Thread.sleep(1000);
			allOptions3.click();
		}
		
		
		
	//	conference.deselectByVisibleText("Conference");
		
		
        //Thread.sleep(3000);
       //driver.close();
	}

}
