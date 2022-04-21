package org.dailytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DailyTask2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rekha\\eclipse-workspace\\DailyTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://sprint.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement btnclose = driver.findElement(By.xpath("//div[@id='tntButtonToClose']"));
		btnclose.click();
				
		WebElement btnclosed = driver.findElement(By.xpath("(//div[@class='phx-modal__dialog'])[1]"));
		btnclosed.click();
		
		
		//output is not coming for this task
		
	}

}
