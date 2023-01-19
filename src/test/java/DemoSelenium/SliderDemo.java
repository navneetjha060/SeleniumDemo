package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/sliders/");
		driver.manage().window().maximize();

		WebElement Frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(Frame);

		WebElement Slider = driver.findElement(
				By.xpath("//div[@id='green']//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));

		Actions action = new Actions(driver);
		action.dragAndDropBy(Slider, 50, 0).build().perform();
		Thread.sleep(4000);
		driver.quit();

	}

}
