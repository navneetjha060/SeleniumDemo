package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		Thread.sleep(3000);

		WebElement frame = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//input[@id='s']")).sendKeys("Test");
		Thread.sleep(3000);

		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
