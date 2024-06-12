import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//Navigating to policybazaar website
		driver.get("https://www.policybazaar.ae/");
		CarInsuranceQuotation ciq = new CarInsuranceQuotation(driver);
		ciq.getCarQuote();
		}
	}

	