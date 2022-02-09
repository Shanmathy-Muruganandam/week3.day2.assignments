package week3.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@type='submit']//span[1]")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String totalItems = driver.findElement(By.xpath("//div[text()='292']")).getText();
		System.out.println("Total number of items : " + totalItems);
		System.out.println(" List of Brands:");
		List<WebElement> bagBrandList = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(" Size :" + bagBrandList.size());
		System.out.println("Brand Names:");
		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}		
		System.out.println(" List of Bags:");
		List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println("Bag Names:");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
	}

}
