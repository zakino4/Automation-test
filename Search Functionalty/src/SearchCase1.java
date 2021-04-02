import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SearchCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.pearson.com");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("course" + Keys.ENTER);
		
		Thread.sleep(1000);
		driver.navigate().to("https://www.pearson.com/search-results.html?_charset_=UTF-8&#stq=course&stp=2");
		Thread.sleep(1000);
		driver.navigate().to("https://www.pearson.com/content/dam/one-dot-com/one-dot-com/global/Files/efficacy-and-research/reports/audited/Mastering-Physics-v3-summary.pdf");

		//driver.findElement(By.linkText("Online_Information_Literacy.pdf"));

		//driver.navigate().to("https://www.pearson.com/search-results.html?_charset_=UTF-8&#stq=course&stp=2");

		

		
		
	
		
		
	
	}

}
