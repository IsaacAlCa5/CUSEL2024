package pruebaNG_Casos_de_prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class selTest1 {
  @Test
  public void test01() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
}
