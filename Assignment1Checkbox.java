package week2seleniumbasics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get(" http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
      WebElement java=  driver.findElementByXPath("(//input[@type='checkbox'])[1]");
      java.click();
      
      boolean selenium=driver.findElementByXPath("(//input[@type='checkbox'])[6]").isSelected();
      System.out.println(selenium);
      
      WebElement deselect= driver.findElementByXPath("(//input[@type='checkbox'])[8]");
      if(deselect.isSelected())
      {
    	  driver.findElementByXPath("(//input[@type='checkbox'])[8]").click();
    	  System.out.println("unchecked the checked one");
      }
      else {
    	  System.out.println("checked");
    	  
      }
      
      driver.findElementByXPath("(//input[@type='checkbox'])[9]").click();
      driver.findElementByXPath("(//input[@type='checkbox'])[10]").click();
      driver.findElementByXPath("(//input[@type='checkbox'])[11]").click();
      driver.findElementByXPath("(//input[@type='checkbox'])[12]").click();
      driver.findElementByXPath("(//input[@type='checkbox'])[13]").click();
        //label[text()='Select the languages that you know?'])/parent::div[1]
        //rgb color  System.out.println("Colour of button is "+driver.findElementById("color").getCssValue("background-color"));
        
	}

}
