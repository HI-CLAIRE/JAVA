package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newscrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naver.com");
		
		String buttonSelector = "#NM_FAVORITE > div.group_nav > ul.list_nav.NM_FAVORITE_LIST > li:nth-child(2) > a";
		WebElement newsButton = driver.findElement(By.cssSelector(buttonSelector));
		newsButton.click();
		
		String scopeSelector = "body > section > header > div.Ngnb > div > div > div.Ngnb_right > div.Ngnb_tool > a";
		WebElement scopeButton = driver.findElement(By.cssSelector(scopeSelector));
		scopeButton.click();
		
		String inputSelector = "#u_hs > div > div > input";
		WebElement searchInput = driver.findElement(By.cssSelector(inputSelector));
		searchInput.sendKeys("나스닥");
		searchInput.sendKeys(Keys.ENTER);
		
		
		List<WebElement> items = driver.findElements(By.className("info"));
		
		for(WebElement item: items) {
			System.out.println(item.getText());
		}
	}

}
