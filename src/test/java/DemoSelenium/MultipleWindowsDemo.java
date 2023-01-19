package DemoSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//a[@class='button e.g. button_hilite button_pale small_button'][normalize-space()='Click Here']"))
				.click();
		Thread.sleep(2000);

		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		Iterator<String> iterate = handles.iterator();
		String ParentWindow = iterate.next();
		String ChildWindow = iterate.next();

		driver.switchTo().window(ChildWindow);
		driver.findElement(By.xpath("//li[@id='menu-item-1561']//a[normalize-space()='Contact Us']")).click();
		Thread.sleep(2000);

		driver.switchTo().window(ParentWindow);
		driver.findElement(By.xpath("//li[@id='menu-item-1513']//a[normalize-space()='Home']")).click();
		Thread.sleep(2000);

		driver.quit();

	}

}
