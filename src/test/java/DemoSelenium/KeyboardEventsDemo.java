package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEventsDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://textcomparator.com/?gclid=Cj0KCQiAtbqdBhDvARIsAGYnXBPvqed6MJqPR0-ExyBwHugkWLNXfLD8tQdMyHoop3HLTIgXz7sbAgkaAvmnEALw_wcB");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement source = driver.findElement(By.xpath("//textarea[@id='textInput1']"));
		source.sendKeys("Test");
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

		WebElement destination = driver.findElement(By.xpath("//textarea[@id='textInput2']"));
		destination.click();
		action.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[2]")).click();

		String Result = driver.findElement(By.xpath("//div[@class='similar-texts MuiBox-root css-0']")).getText();

		System.out.println(Result);
		driver.quit();

	}

}
