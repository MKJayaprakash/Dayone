package org.dailytask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DailyTask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rekha\\eclipse-workspace\\DailyTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.id("credit2"));
		WebElement d = driver.findElement(By.id("bank"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(s, d).perform();
		
		WebElement a = driver.findElement(By.id("credit1"));
		WebElement b = driver.findElement(By.id("loan"));
		
		actions.dragAndDrop(a, b).perform();
		
		WebElement g = driver.findElement(By.id("fourth"));
		WebElement h = driver.findElement(By.id("amt7"));
		
		actions.dragAndDrop(g, h).perform();
		
		WebElement i = driver.findElement(By.id("fourth"));
		WebElement j = driver.findElement(By.id("amt8"));
		
		actions.dragAndDrop(i, j).perform();
		
		WebElement textperfect = driver.findElement(By.id("equal"));
		String text = textperfect.getText();
		System.out.println(text);
	}

}
