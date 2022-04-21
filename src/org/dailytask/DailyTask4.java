package org.dailytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DailyTask4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rekha\\eclipse-workspace\\DailyTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		driver.manage().window().maximize();
		
		WebElement textmsg = driver.findElement(By.xpath("(//li[@class='nav_first'])[6]"));
		String text = textmsg.getText();
		System.out.println(text);
		
	}

}
