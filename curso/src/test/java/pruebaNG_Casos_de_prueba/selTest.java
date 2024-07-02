package pruebaNG_Casos_de_prueba;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selTest {
  @Test
  public void test01() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  System.out.print("hola");
	 //Identificar los objetos GUIE/WebElements de la pagina
	  WebElement nameTxt = driver.findElement(By.id("user-name"));
	  WebElement pwdTxt= driver.findElement(By.name("password"));
	  WebElement loginBotton = driver.findElement(By.id("login-button"));
	  
	  //Login
	  nameTxt.sendKeys("Standard_user");
	  pwdTxt.sendKeys("secret_sauce");
	  loginBotton.click();
	  
  }
}
