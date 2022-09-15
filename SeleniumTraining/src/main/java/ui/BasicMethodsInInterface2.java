package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethodsInInterface2 {

	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		// get() method - load a new web page in the current browser window
		driver.get("https://www.saucedemo.com/");

		// manage() method - gets the option interface
		driver.manage().window().maximize();

		// getCurrentUrl() method - get a string representing the current url that the
		// browser is looking at
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// getTitle() method - the title of the current page
		String title = driver.getTitle();
		System.out.println(title);

		// getSource() method - get the source of the last loaded page
		String source = driver.getPageSource();
		System.out.println(source);

		// navigate() method - Allows us to navigate to the giver url
//		driver.navigate().to("http://www.google.com");

		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelements);

		driver.navigate().to("https://www.sugarcrm.com/");
		String handle = driver.getWindowHandle();
		System.out.println(handle);

		driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div/div[1]/a")).click();

		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
//
//		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
//		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();

		// close() method - close the current window
		driver.quit();

	}

}
