package week2seleniumbasics;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstLead10004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
	     driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
	     driver.findElementByXPath("//input[@value='Login']").click();
	     driver.findElementByXPath("(//a)[2]").click();
	     driver.findElementByXPath("//a[text()='Leads']").click();
	     driver.findElementByXPath("//a[text()='Find Leads']").click();
	     driver.findElementByXPath("//a[text()='10004']").click();
	     
	}

}
