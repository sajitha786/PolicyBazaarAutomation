import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarInsuranceQuotation {

	private WebDriver driver;

	public CarInsuranceQuotation(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public void getCarQuote() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		//Thread.sleep(3000L);
		System.out.println(driver.findElement(By.xpath("//button[@class='close-modal-rounded']")).isDisplayed());
		if(driver.findElement(By.xpath("//button[@class='close-modal-rounded']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@class='close-modal-rounded']")).click();
		}

		//Thread.sleep(3000L);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='insurance-listing']//div[@class='left']//strong[contains(text(),'Car')][1]"))).click();
		//driver.findElement(By.xpath("//div[@class='insurance-listing']//div[@class='left']//strong[contains(text(),'Car')][1]")).click();
		if(driver.findElement(By.xpath("//button[@class='close-modal-rounded']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@class='close-modal-rounded']")).click();
		}
		
		WebElement selectElement = driver.findElement(By.cssSelector(".dynamic-select-item"));
		wait.until(ExpectedConditions.visibilityOf(selectElement));
		//selecting the brand
		selectElement.click();
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		driver.findElement(By.xpath("//div[@class='dynamic-flag-items']//span[.='Nissan']")).click();
		//clicking the show more button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='older-btn']//a"))).click();
		//Selecting the Car's model year
		driver.findElement(By.xpath("//div[@class='year ']//li//span[text()='2010']")).click();
		//Selecting the Car Model
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='Sunny']"))).click();
		//Selecting the Car Variant
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=' ']//span[text()='SV 1.6L']"))).click();
		//Selecting the Vehicle's Specification
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='GCC Spec']"))).click();
		//Entering the user details
		//Enter the name
		wait.until(ExpectedConditions.elementToBeClickable(By.id("name"))).sendKeys("Sajitha");
		//Enter the email
		driver.findElement(By.id("email")).sendKeys("sajithanazar29@gmail.com");
		//enter the date of birth
		driver.findElement(By.id("dob")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__tile--hasActive react-calendar__century-view__decades__decade']")).click();
		//Select year
		driver.findElement(By.xpath("//button[ text()='1993']")).click();
		//Select Month
		driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']//abbr[text()='January']")).click();
		//select day
		driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day']//abbr[text()='29']")).click();
		//Enter the Mobile
		driver.findElement(By.id("mo-number")).sendKeys("585082071");
		driver.findElement(By.className("switch-wrap")).click();
		//Clicking on button proceed
		driver.findElement(By.id("submitBtn")).click();
		//selecting Nationality
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap   flag-wrap']//span[text()='Indian']"))).click();
		//Where do you want to register your car 	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='Abu Dhabi']"))).click();
		//selecting Buying a Second Hand Car ?
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='No']"))).click();
		//selecting First Registration Year
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='2009']"))).click();
		//UAE Driving Exp.
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='Above 5 Years']"))).click();
		//Previous Insurer
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='New India']"))).click();
		//When do you want to register your car? (DD/MMM/YYYY)
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day react-calendar__month-view__days__day--weekend']//abbr[text()='30']"))).click();
		//How many months without any Accident?
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='Never met with an Accident']"))).click();
		//Do you have a No Claims Certificate from the insurer ?
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='No, I have No Certificate']"))).click();
		//Your previous policy repair type
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btns-wrap ']//div[text()='Agency']"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btns-wrap ']//div[text()='YES']"))).click();
		//Would you like to activate this service?
		WebElement waitt =new WebDriverWait(driver, Duration.ofMinutes(2))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-wrap']//a[@class='btn-outline']")));
		waitt.click();

	}

}
