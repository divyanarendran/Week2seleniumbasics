package week2seleniumbasics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment4 {

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
	     
	     //Click on Email 
	     driver.findElementByXPath("(//a[@class='x-tab-right'])[3]").click();
	    
		 //Enter email
		 driver.findElementByXPath("(//input[@name='emailAddress'])").sendKeys("email");
		 //Click on Findleads button
		 driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		 Thread.sleep(1000);
		 //Capture first lead name
		 String name= driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]").getText();
		 System.out.println(name);
		 //Click on first resulting lead
		 driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		 String firstName= driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		 System.out.println(firstName);
        //Click on Duplicate Lead
		 driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		 //verify the title
		 driver.findElementByXPath("//div[@id='sectionHeaderTitle_leads']");
		 String title=driver.getTitle();
		 System.out.println(title);
		 if(title.equals("Duplicate Lead | opentaps CRM"))
		 {
			 System.out.println("Title matched");
		 }
		 else
		 {
			 System.out.println("Title mismatch");
		 }
		 //Click on Create Lead
		 driver.findElementByXPath("//input[@value='Create Lead']").click();
		 //Get the firstname 
		 String firstName2= driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		 System.out.println(firstName2);
		 //Comparison of both captured and viewed one
		 if(firstName.equals(firstName2))
		 {
			 System.out.println("Confirm the duplicated lead name is same as captured name");
		 }
		 else
		 {
			 System.out.println("Mismatch in the names");
		 }
		driver.close();
		  

	}

}
