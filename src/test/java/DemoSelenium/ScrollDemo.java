package DemoSelenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4d1ohbptwj_e&adgrpid=58490306106&hvpone=&hvptwo=&hvadid=486391490878&hvpos=&hvnetw=g&hvrand=4502059500485917336&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300452&hvtargid=kwd-298187295805&hydadcr=5657_2175734&gclid=CjwKCAiA76-dBhByEiwAA0_s9T3GDRnV5S-LTqunqJTOARpVGDvHDiTkReFa7mFPbaUPqeT3yG_4sxoCJ1oQAvD_BwE");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,5000)");
		Thread.sleep(4000);
		driver.quit();

	}

}
