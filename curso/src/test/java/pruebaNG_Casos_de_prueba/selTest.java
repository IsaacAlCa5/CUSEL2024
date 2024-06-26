package pruebaNG_Casos_de_prueba;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class selTest {
  @Test
  public void test01() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
}
