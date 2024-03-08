package Travelling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Goibibo_Test {

	@Test
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!G!Brand!RSA!108599293!6504095653!617695092667!e!goibibo!c!&gad_source=1&gclid=CjwKCAiAopuvBhBCEiwAm8jaMZR6oK4xeggTHjdWN1phrHmhsEJPtZiDcyyG4GVWIpzHDF-LYYXn5xoC9mQQAvD_BwE");
		driver.quit();
	}
}
