package fabianfalon.webdriver;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
	@Test
	public void verificarTitulo() {
		// Instancia de firefoxdriver
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("http://www.engee.com.ar/");

		Assert.assertTrue("El mensaje debe tener la palabra Engee", driver.getTitle().contains("Engee"));

		driver.close();
}
}
