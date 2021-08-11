import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Testcase {

	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91996\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		String title=driver.getTitle();
		System.out.println("Title "+ title );
		//this.teststep.log(LogStatus.INFO,title);
		String heading=driver.findElement((By.xpath("//*[@id='content']/h1"))).getText();
		System.out.println("Heading1 "+ heading );
		String heading2=driver.findElement((By.xpath("//*[@id='content']/h2"))).getText();
		System.out.println("Heading2 "+ heading2 );
		driver.findElement(By.linkText(("A/B Testing"))).click();
		System.out.println("A/B Testing opened successfully ");
		String expURL="http://the-internet.herokuapp.com/abtest1";
		String actualURL=driver.getCurrentUrl();
		System.out.println(expURL+"   "+actualURL);
		Assert.assertEquals(actualURL,expURL,"Expected and Actual URL is not matched");
		System.out.println(expURL+"   "+actualURL);
		
	}
}
