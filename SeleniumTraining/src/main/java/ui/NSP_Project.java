package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NSP_Project {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://scholarships.gov.in/");
		driver.findElement(By.xpath("//*[@id=\"applicant_login\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("/html/body/section/div/div[2]/div[3]/a/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button']"));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		
	}
}
