package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethodsInInterface {

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
		driver.navigate().to("http://www.google.com");

		// close() method - close the current window
		driver.close();

	}

}
