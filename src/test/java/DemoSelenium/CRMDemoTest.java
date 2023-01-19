package DemoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CRMDemoTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Navneet");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Demo123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");

		Actions action = new Actions(driver);

		WebElement Contacts = driver.findElement(By.xpath("//a[normalize-space()='Contacts']"));
		action.moveToElement(Contacts).build().perform();

		driver.findElement(By.xpath("//a[normalize-space()='New Contact']")).click();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Navneet");

		WebElement Title = driver.findElement(By.xpath("//select[@name='title']"));
		Select select = new Select(Title);
		select.selectByVisibleText("Mr.");
		
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys("Google");

		Thread.sleep(3000);

		driver.quit();

	}

}
