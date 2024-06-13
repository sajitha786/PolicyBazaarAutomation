import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\EclipseWorkSpace\\PolicyBazaarAutomation\\Configuration\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String mybrowser=prop.getProperty("BrowserType");
		String ApplicationUrl =prop.getProperty("AppUrl");
		System.out.println(mybrowser);
		if(mybrowser.equals("ChromeBrowser")) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//Navigating to policybazaar website
		driver.get(ApplicationUrl);
		CarInsuranceQuotation ciq = new CarInsuranceQuotation(driver,prop);
		ciq.getCarQuote();
		}
		}
	}

	