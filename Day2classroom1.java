package week2seleniumbasics;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day2classroom1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//username
	 driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
     driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
     driver.findElementByXPath("//input[@value='Login']").click();
     driver.findElementByXPath("(//a)[2]").click();
     driver.findElementByXPath("//a[text()='Leads']").click();
     driver.findElementByXPath("//a[text()='Merge Leads']").click();
     driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
     Thread.sleep(1000);
     driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
 
     
	}

}
