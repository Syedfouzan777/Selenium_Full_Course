package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtom {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		driver.manage().window().maximize();
		WebElement radiobutton = driver.findElement(By.id("redeemFlights"));
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
		System.out.println(driver.findElement(By.xpath("..*[@name='book-flight-radio']")).getSize());
	}

}
