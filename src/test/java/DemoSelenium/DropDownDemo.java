package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(
				By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		Select select = new Select(dropdown);

		select.selectByIndex(2);
		Thread.sleep(3000);

		select.selectByVisibleText("American Samoa");
		Thread.sleep(3000);

		select.selectByValue("CHN");
		Thread.sleep(3000);

		driver.quit();

	}

}
