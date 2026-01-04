package cicdtestpakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void fun() {
	  
	  System.out.println("test for safty *****************************************");
  }
  
  @Test
  public void googleTest() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	  driver.findElement(By.name("q")).sendKeys("javascript api");
	  
	  System.out.println("test sucessful*****************************************");
  }
}
