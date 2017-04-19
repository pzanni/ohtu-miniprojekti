package ohtu.views;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import ohtu.ServerRule;

public class MainViewTest {
	private WebDriver driver;

	@ClassRule
	public static ServerRule server = new ServerRule();

	@Before
	public void setup() {
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void test() {
		driver.get("http://127.0.0.1:8080/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		try {
			WebElement element = driver.findElement(By.id("addButton"));
			assertEquals(element.getText(), "Add references");
			element.click();
			element = driver.findElement(By.id("previousButton"));
			element.click();
			element = driver.findElement(By.id("addButton"));
			assertEquals(element.getText(), "Add references");
		} catch (NoSuchElementException e) {
			fail("No such element");
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
	}
}
