package DemoSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		List<WebElement> Elements1 = driver.findElements(By.tagName("a"));
		List<WebElement> Elements2 = driver.findElements(By.xpath("//a"));
		System.out.println(Elements1.size());
		System.out.println(Elements2.size());
		driver.quit();

	}

}
