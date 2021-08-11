import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignUp {

	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91996\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		String title=driver.getTitle();
		System.out.println("Title "+ title );
		driver.findElement(By.name("firstName")).sendKeys("Vijay");
		driver.findElement(By.name("lastName")).sendKeys("Lade");
		driver.findElement(By.name("Username")).sendKeys("vijaylade2705");
		driver.findElement(By.name("Passwd")).sendKeys("Vijay@11161");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Vijay@11161");
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/div[2]")).click();
		
		
	}
}
