import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91996\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		String title=driver.getTitle();
		System.out.println("Title "+ title );
		WebElement hotel=driver.findElement(By.xpath("//*[@id='header']/div[1]/ul/li[3]/a/span"));
		//WebElement chkboxIndia=driver.findElement(By.id(""));
		WebElement chkInDate=driver.findElement(By.xpath("//*[@id='root']/div[2]/div/section/div[1]/div/div[3]/div/div[1]/div/h4]"));
		 
		WebElement chkOutDate=driver.findElement(By.xpath("//*[@id=root]/div[2]/div/section/div[1]/div/div[3]/div/div[4]/div/h4"));
		hotel.click();
	//	chkboxIndia.click();
		chkInDate.clear();
		chkInDate.sendKeys("Dec 30,2020");
		chkInDate.clear();
		chkInDate.sendKeys("Dec 31,2020");
	}

}
