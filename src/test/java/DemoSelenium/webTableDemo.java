package DemoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTableDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		int Col = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		int Row = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();

		for (int i = 2; i <= Row; i++) {

			for (int j = 1; j <= Col; j++) {

				String Value = driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]//td[" + j + "]"))
						.getText();
				System.out.print(Value + " ");

			}
			System.out.println();
		}
		driver.quit();
	}

}
