package Shopping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Test {
	
	@Test
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=1482691883000728199&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062108&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
		driver.quit();
	}


}
