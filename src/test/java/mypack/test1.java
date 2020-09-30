package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\batch248\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.silentOutput","true");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//launch site
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//h4[text()='Search Selection']"));
		driver.executeScript("argument[0].scrollIntoView();",e);
		
		
		
		
		
		
		
	}

}
