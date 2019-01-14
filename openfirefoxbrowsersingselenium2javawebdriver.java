
/* yesma chrome ma google kholepachi maximize garne window ani tespachi hamrobazaar kholera navigate back ra forward garne ani refresh garne*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openfirefoxbrowsersingselenium2javawebdriver {

	public static void main(String[] args) throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver","F:\\bj\\chromedriver_win32\\chromedriver.exe" );
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.hamrobazaar.com/");//same as driver.get()//
	
	driver.navigate().back();
	
	Thread.sleep(1800);
	
	driver.navigate().forward();
	
	Thread.sleep(5000);
	
	driver.navigate().refresh();
	
	driver.close();
	
	driver.quit();
	
	
	}
}

























