package org.dailytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DailyTask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rekha\\eclipse-workspace\\DailyTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com");
		driver.manage().window().maximize();
		
		WebElement textmsg = driver.findElement(By.xpath("//p[contains(text(),'A')]"));
		String text = textmsg.getText();
		System.out.println(text);
	}
	

}
