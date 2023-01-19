package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//form[contains(text(),'Your current web browser is:')]//input[2]")).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
