package week2seleniumbasics;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment2 {
	

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
	     //Login button
	     driver.findElementByXPath("//input[@value='Login']").click();
	     //Click on CRM
	     driver.findElementByXPath("(//a)[2]").click();
	     //Click on leads button
	     driver.findElementByXPath("//a[text()='Leads']").click();
	     //Click on findLeads button
	     driver.findElementByXPath("//a[text()='Find Leads']").click();
	     
	     //Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("gopi");
		//Click on Findleads button
     	driver.findElementByXPath("//button[text()='Find Leads']").click();
     	//Waiting for loading
     	Thread.sleep(2000);
     	//Click on first lead 
     	driver.findElementByXPath("(//a[@class='linktext'][@href='/crmsfa/control/viewLead?partyId=10005'])[1]").click();
     	//Verify the title
     	String title=driver.getTitle();
     	System.out.println(title);
     //Click Edit
     	driver.findElementByXPath("//a[@class='subMenuButton'][@href='updateLeadForm?partyId=10005']").click();
     	//clear already present value in company name
     	driver.findElementByXPath("//input[@name='companyName'][@id='updateLeadForm_companyName']").clear();
     	//Changing the company name
        driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("abc");
        //Click on Update
        driver.findElementByXPath("//input[@class='smallSubmit'][@value='Update']").click();
        //Confirm the changed name appears
      String name= driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
      System.out.println(title);
      System.out.println(name);
     
      driver.close();
      
        
     		   	
		
      
	}

}
