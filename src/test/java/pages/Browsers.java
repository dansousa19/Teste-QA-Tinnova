package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
	
	protected static WebDriver driver;

	public void abrirNavegador(String site) {
		try {
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(site);
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("***** erro ao abrir navegador *****" + e.getMessage());
			System.out.println("***** causa do erro *****" + e.getCause());

		}
	}

}
