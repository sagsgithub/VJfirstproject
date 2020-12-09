import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebaysearch {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\Downloads\\SELENIUM\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("JBL Speakers");
		Thread.sleep(3000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(5000);
driver.findElement(By.linkText("Daily Deals")).click();
Thread .sleep(3000);

driver.navigate().to("https://www.simplilearn.com/");
Thread.sleep(5000);
driver.navigate().back();
	
		System.out.println("Title of the page is :" + driver.getTitle());
		driver.close();
	
	
}
		
		}

	