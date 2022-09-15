package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\browser driver\\msedgedriver.exe");
		
		EdgeDriver driver=new EdgeDriver();
		
//		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
}
