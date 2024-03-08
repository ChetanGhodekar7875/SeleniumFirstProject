package Beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SugarClass_Test {
	@Test
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.sugarcosmetics.com/collections/sugar-x-jbl-2299?utm_source=google&utm_medium=perf_max&utm_campaign=17185724877&adgroupid=&utm_content=&utm_term=&gad_source=1&gclid=CjwKCAiAopuvBhBCEiwAm8jaMeNdRdO2c5583L90jxcCpju7JsNTFCDbsSwsf5op2lxcaDec7kZ2YBoC8IkQAvD_BwE");
		driver.quit();
	}
}
