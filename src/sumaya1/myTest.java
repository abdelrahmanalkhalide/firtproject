package sumaya1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class myTest {

	WebDriver driver = new EdgeDriver();

	String THEWEBSITE = "https://www.saucedemo.com/";
	String UserName = "standard_user";
	String Password = "secret_sauce";

	@BeforeTest
	public void mySetup() {

		driver.manage().window().maximize();

		driver.get(THEWEBSITE);

	}

	@Test(priority = 1)
	public void login() throws InterruptedException {

		WebElement UsernameInput = driver.findElement(By.id("user-name"));

		WebElement PasswordInput = driver.findElement(By.id("password"));

		WebElement Loginbutton = driver.findElement(By.id("login-button"));

		UsernameInput.sendKeys(UserName);
		PasswordInput.sendKeys(Password);
		Loginbutton.click();

	}

	@Test(priority = 2)
	public void addItemToThecart() throws InterruptedException {
		WebElement BackPackAddButton = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		BackPackAddButton.click();

	}

	@Test(priority = 3)
	public void removeItemFromTheCart() {

		WebElement BackPackRemoveButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
		BackPackRemoveButton.click();

	}

	@Test(priority = 4)
	public void logout() throws InterruptedException {

		WebElement BurgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
		BurgerMenu.click();
		Thread.sleep(1000);

		WebElement LogOutButton = driver.findElement(By.id("logout_sidebar_link"));
		LogOutButton.click();
	}

	@AfterTest
	public void myAfterTest() {

//		driver.quit();
	}

}
