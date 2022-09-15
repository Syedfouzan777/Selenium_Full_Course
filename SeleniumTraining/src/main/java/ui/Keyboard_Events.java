package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Events {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare");
		driver.manage().window().maximize();
		WebElement sourcetext = driver
				.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[5]/pre"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(sourcetext, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement second = driver.findElement(
				By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[3]/pre/span"));
		
		Thread.sleep(2000);
		action.keyDown(second, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();

	}

}
