package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk&bc=HA");
		driver.manage().window().maximize();

		// code for links
		List<WebElement> links = driver.findElementsByTagName("a");
		System.out.println("Total Tags are :" + links.size());
		for (int i = 0; i < links.size(); i++) {
			System.out.println("Links on page are: " + links.get(i).getAttribute("href"));
			System.out.println("Links on page are: " + links.get(i).getText());
		}

		// code for dropdown
		List<WebElement> ddown = driver.findElementsByTagName("option");
		System.out.println("Total Tags are :" + ddown.size());
		for (int i = 0; i < ddown.size(); i++) {
			System.out.println("dropdowns on page are: " + ddown.get(i).getAttribute("value"));
			System.out.println("dropdowns on page are: " + ddown.get(i).getText());

		}

	}
}
