package pruebaNG_Casos_de_prueba;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selTest {
  @Test
  public void test01() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	 //Identificar los objetos GUIE/WebElements de la pagina
	  WebElement nameTxt = driver.findElement(By.id("user-name"));
	  WebElement pwdTxt= driver.findElement(By.name("password"));
	  WebElement loginBotton = driver.findElement(By.id("login-button"));
	   
	  //Login
	  nameTxt.sendKeys("visual_user");
	  Thread.sleep(2000);
	  pwdTxt.sendKeys("secret_sauce");
	  loginBotton.click();
	  //Metodos del navegador
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  /*Metodos de navegacion
	  driver.navigate().back();
	  driver.navigate().forward();*/
	  
	  
	  //DropDown
	  Select selecProd = new Select(driver.findElement(By.className("product_sort_container")));
	  Thread.sleep(2000);
	  selecProd.selectByVisibleText("Name (Z to A)");
	  Thread.sleep(2000);
	  //driver.close();
	  
	  //imprimir documentos FINDELEMENTS
	  List<WebElement> prodList =driver.findElements(By.className("inventory_item_name"));
	  System.out.println(prodList.size()); 
	  
	  //String primerProd= prodList.get(0).getText();
	  for (int i = 0; i < prodList.size(); i++) {
		  System.out.println("El producto " + i + " lleva por nombre: "+ prodList.get(i).getText());		
	}
	  driver.close();
	 
  }
}
