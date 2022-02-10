package Sections_1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Chrome_Bro {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\addla\\GES9\\New folder\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	}
}
