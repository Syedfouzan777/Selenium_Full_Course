package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.xpath("//*[@id=\"u_0_0_x1\"]")).click();
		driver.manage().window().maximize();
		WebElement ddown = driver.findElement(By.name("employees_c"));
		Select select = new Select(ddown);
		WebElement firstOption = select.getFirstSelectedOption();
		firstOption.getText();

		select.selectByValue("1");
		Thread.sleep(2000);
		select.selectByVisibleText("6");
		Thread.sleep(2000);
		select.deselectByIndex(8);
		Thread.sleep(2000);

//		WebElement ddown = driver.findElement(By.id("multi-select"));
//		Select select = new Select(ddown);
//		select.selectByValue("California");
//		Thread.sleep(2000);
//		select.selectByIndex(5);
//		List<WebElement> allitems = select.getAllSelectedOptions();
//		System.out.println(allitems.size());
//		Thread.sleep(2000);
//		select.deselectAll();
//		Thread.sleep(2000);
//		select.selectByValue("California");
//		Thread.sleep(2000);
//		select.selectByIndex(5);

	}
}
