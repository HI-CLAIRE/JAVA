package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SRTTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://etk.srail.kr/main.do");

		Select departure = new Select(driver.findElement(By.id("dptRsStnCd")));
		departure.selectByVisibleText("광주송정");
		
		Select arrival = new Select(driver.findElement(By.id("arvRsStnCd")));
		arrival.selectByVisibleText("수서");
		
		String selector = "#search-form > fieldset > a";
		WebElement button = driver.findElement(By.cssSelector(selector));
		button.click();
	}

}
