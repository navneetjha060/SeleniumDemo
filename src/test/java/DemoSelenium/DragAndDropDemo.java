package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(frame);

		WebElement drag = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();

		Thread.sleep(3000);

		driver.quit();

	}

}
