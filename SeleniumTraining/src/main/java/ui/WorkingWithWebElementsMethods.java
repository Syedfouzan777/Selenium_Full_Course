package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebElementsMethods {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		driver.findElement(By.name("firstname")).clear();
		System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).getCssValue("font-size"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"menu-item-22135\"]/a/span[1]")).isSelected());

	}

}
