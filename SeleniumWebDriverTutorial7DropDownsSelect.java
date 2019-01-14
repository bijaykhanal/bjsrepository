import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebDriverTutorial7DropDownsSelect {

	public static void main(String[] args) throws InterruptedException {

		
		
		
System.setProperty("webdriver.chrome.driver","F:\\bj\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("mercury");;
		
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("login")).click();

		Thread.sleep(1000);

		
		
		
		
		//steps:
				
		
		//step1: to create an object of Web element
		
		driver.findElement(By.name("fromPort"));//find the drop down web element from the page
		
		WebElement objWeb1 = driver.findElement(By.name("fromPort"));//to assign this drop down web element we create a object. this object holds the dropdown webelement
		
		
		
		
		
		//step2: To create object of select class and pass the webelement object
		
		Select objSelect = new Select(objWeb1);// creating object of select class
		
		
		
		
		
		//step3: To select from the dropdown menu
		
		objSelect.selectByIndex(2);//select by number 
		
		Thread.sleep(5000);


		objSelect.selectByValue("Paris");//select by value
		
		Thread.sleep(5000);

		
		objSelect.selectByVisibleText("Portland");//select by text
		
		Thread.sleep(5000);
 		
				
	}

}
