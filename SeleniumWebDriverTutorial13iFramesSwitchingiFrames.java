import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverTutorial13iFramesSwitchingiFrames {

	public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","F:\\bj\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
	
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Az");yetti samma matrai garda error aucha element vettaena vanera tesaile switchtoiframe vanne garnuparcha jun 3 kisimle garna milchha
		
		//1st kisim(by using the name of the iframe): mathiko line'18' ko satta lekhne: driver.switchTo().frame("iframeResult");driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Az");driver.switchto().parentFrame();Thread.sleep(2000);driver.close();

		//2nd kisim(by using iframeboarder index): mathiko line'18' ko satta lekhne: driver.switchTo().frame(1);driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Az");driver.switchto().parentFrame();Thread.sleep(2000);driver.close();
		
		//3rd kisim(by using web element of iframe tara iframeko element thapauna mildaina):mathiko line'18' ko satta lekhne: WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));driver.switchTo().frame(iframe);driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Az");driver.switchto().parentFrame();Thread.sleep(5000);driver.close();
		
		
		
	}

}
