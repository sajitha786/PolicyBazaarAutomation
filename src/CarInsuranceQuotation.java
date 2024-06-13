import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		String name= "Sajitha";
		String mailId="sajithanazar29@gmail.com";
		String mob="585082071";
		String carBrand="Nissan";
		String modelYear="2010";
		String carModel="Sunny";
		String carVariant="SV 1.6L";
		String spec="GCC Spec";
		String dob_year="1993";
		String dob_month="January";
		String dob_day="29";
		String Nationality="Indian";
		String placeRegistered="Abu Dhabi";
		String secondHandCar="No";
		String regYear="2009";
		String drvExp="Above 5 Years";
		String insurance="New India";
		String dateToRegister="30";
		String accidentHistory="Never met with an Accident";
		String claimCertificate="No, I have No Certificate";
		String repairType="Agency";
		String isExpired="YES";
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		//System.out.println(driver.findElement(By.xpath("//button[@class='close-modal-rounded']")).isDisplayed());
		//WebElement modalElement = driver.findElement(By.xpath("//button[@class='close-modal-rounded']"));
		if(driver.findElements(By.xpath("//button[@class='close-modal-rounded']")).size()!=0) {
			driver.findElement(By.xpath("//button[@class='close-modal-rounded']")).click();
		}else{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='insurance-listing']//div[@class='left']//strong[contains(text(),'Car')][1]"))).click();
		//driver.findElement(By.xpath("//div[@class='insurance-listing']//div[@class='left']//strong[contains(text(),'Car')][1]")).click();
		if(driver.findElements(By.xpath("//button[@class='close-modal-rounded']")).size()!=0) {
			driver.findElement(By.xpath("//button[@class='close-modal-rounded']")).click();
		}else {
		
		WebElement selectElement = driver.findElement(By.cssSelector(".dynamic-select-item"));
		wait.until(ExpectedConditions.visibilityOf(selectElement));
		//selecting the brand
		selectElement.click();
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();
		driver.findElement(By.xpath("//div[@class='dynamic-flag-items']//span[.='"+carBrand+"']")).click();
		//clicking the show more button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='older-btn']//a"))).click();
		//Selecting the Car's model year
		WebElement element= driver.findElement(By.xpath("(//span[contains(text(),'"+modelYear+"')])[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		//Selecting the Car Model
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='"+carModel+"']"))).click();
		//Selecting the Car Variant
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=' ']//span[text()='"+carVariant+"']"))).click();
		//Selecting the Vehicle's Specification
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='"+spec+"']"))).click();
		//Entering the user details
		//Enter the name
		wait.until(ExpectedConditions.elementToBeClickable(By.id("name"))).sendKeys(name);
		//Enter the email
		driver.findElement(By.id("email")).sendKeys(mailId);
		//enter the date of birth
		driver.findElement(By.id("dob")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//span[@class='react-calendar__navigation__label__labelText react-calendar__navigation__label__labelText--from']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__tile--hasActive react-calendar__century-view__decades__decade']")).click();
		//Select year
		driver.findElement(By.xpath("//button[ text()='"+dob_year+"']")).click();
		//Select Month
		driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']//abbr[text()='"+dob_month+"']")).click();
		//select day
		driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day']//abbr[text()='"+dob_day+"']")).click();
		//Enter the Mobile
		driver.findElement(By.id("mo-number")).sendKeys(mob);
		driver.findElement(By.className("switch-wrap")).click();
		//Clicking on button proceed
		driver.findElement(By.id("submitBtn")).click();
		//selecting Nationality
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap   flag-wrap']//span[text()='"+Nationality+"']"))).click();
		//Where do you want to register your car 	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='"+placeRegistered+"']"))).click();
		//selecting Buying a Second Hand Car ?
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='"+secondHandCar+"']"))).click();
		//selecting First Registration Year
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='"+regYear+"']"))).click();
		//UAE Driving Exp.
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='"+drvExp+"']"))).click();
		//Previous Insurer
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='"+insurance+"']"))).click();
		//When do you want to register your car? (DD/MMM/YYYY)
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day react-calendar__month-view__days__day--weekend']//abbr[text()='"+dateToRegister+"']"))).click();
		//How many months without any Accident?
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='"+accidentHistory+"']"))).click();
		//Do you have a No Claims Certificate from the insurer ?
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-outline-wrap  ']//span[text()='"+claimCertificate+"']"))).click();
		//Your previous policy repair type
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btns-wrap ']//div[text()='"+repairType+"']"))).click();
		//Insurance expired
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btns-wrap ']//div[text()='"+isExpired+"']"))).click();
		//Would you like to activate this service?
		WebElement waitt =new WebDriverWait(driver, Duration.ofMinutes(2))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='btn-wrap']//a[@class='btn-outline']")));
		waitt.click();
		}
		}

	}

}
