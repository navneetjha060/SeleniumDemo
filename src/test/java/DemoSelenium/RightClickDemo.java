package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();

		Thread.sleep(4000);
		driver.quit();

	}

}
