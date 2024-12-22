package testing.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testfirst {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/div[1]/form/input")).sendKeys("modi");
		Thread.sleep(5000);
		
		driver.quit();
	}
}
