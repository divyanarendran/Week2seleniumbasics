package week2seleniumbasics;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get(" http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='yes']").click();
		WebElement yes= driver.findElementByXPath("(//input[@value='1'])");
		if(yes.isSelected())
		{
	    System.out.println("Checked");
		}
		else
		{
			System.out.println("unchecked");
		}
		WebElement checked= driver.findElementByXPath("(//input[@value='1'])");
		if(checked.isSelected())
		{
	    System.out.println("already Checked");
		}
		else
		{
			System.out.println("unchecked");
		}
       
	}

}
