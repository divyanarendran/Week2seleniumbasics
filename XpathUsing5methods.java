package week2seleniumbasics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsing5methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//username
		WebElement username = driver.findElementByXPath("//input[@id='username']");
		username.sendKeys("Demosalesmanager");
	//	driver.findElementById("username").sendKeys("Demosalesmanager");
		//password
		WebElement password = driver.findElementByXPath("//input[@id='password']");
		password.sendKeys("crmsfa");
//		driver.findElementById("password").sendKeys("crmsfa");
		//Submit button
		WebElement login = driver.findElementByXPath("//input[@value='Login']");
		login.click();
		//driver.findElementByClassName("decorativeSubmit").click();
		//CRMSFA
		WebElement crm= driver.findElementByXPath("(//a)[2]");
		crm.click();
		//driver.findElementByLinkText("CRM/SFA").click();
		//Leads
		WebElement leads=driver.findElementByXPath("//a[text()='Leads']");
		leads.click();
		//driver.findElementByLinkText("Leads").click();
		//Create lead
		WebElement createLead= driver.findElementByXPath("//a[text()='Create Lead']");
	   createLead.click();
		//driver.findElementByLinkText("Create Lead").click();
	   //Company name
	   WebElement companyName=driver.findElementByXPath("//input[@id='createLeadForm_companyName']");
		companyName.sendKeys("TestLeaf");
		
	   //driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		//Firstname
			WebElement firstname=driver.findElementByXPath("//input[@id='createLeadForm_firstName']");
			firstname.sendKeys("divya");
		//driver.findElementById("createLeadForm_firstName").sendKeys("divya");
		//Lastname
			WebElement lastname=driver.findElementByXPath("//input[@id='createLeadForm_lastName']");
			lastname.sendKeys("divya");
			//driver.findElementById("createLeadForm_lastName").sendKeys("divya");
		WebElement createLead1= driver.findElementByXPath("//input[@name='submitButton']");
		createLead1.click();
	}

}
