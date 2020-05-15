package week2seleniumbasics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//username
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
		//password
	     driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	     //Click on Login button
	     driver.findElementByXPath("//input[@value='Login']").click();
	     //Click on CRM
	     driver.findElementByXPath("(//a)[2]").click();
	    //Click on Leads
	     driver.findElementByXPath("//a[text()='Leads']").click();
	     //Click on FindLead
	     driver.findElementByXPath("//a[text()='Find Leads']").click();
	     //Click on phone
	     driver.findElementByXPath("(//a[@class='x-tab-right'])[2]").click();
	     //enter 99
	  driver.findElementByXPath("(//input[@name='phoneNumber'])").sendKeys("90");
	  //click on find leads button
	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	//For loading time req
	Thread.sleep(2000);
	//To print the id
	String name= driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").getText();
	System.out.println(name);
	//Click on first element
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
	//Click Delete
	driver.findElementByXPath("//a[@href='javascript:document.deleteLeadForm.submit()']").click();
	Thread.sleep(1000);
	//Click findLead
	driver.findElementByXPath("	//a[text()='Find Leads']").click();
	Thread.sleep(1000);
		//Enter the captured Lead ID
		 driver.findElementByXPath("//input[@name='id']").sendKeys(name); 
		 Thread.sleep(2000); 
		 //Click on Find leads
		 driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		 Thread.sleep(1000);
		 String display= driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(name);
		 System.out.println(display);
		 
		 driver.close();
		 
	
     
	

}
}
