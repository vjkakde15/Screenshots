/*Prog to check if any listbox is single select or multi select list */
package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog1 {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/Vinod%20J/Desktop/Selenium/HTML%20Files/Test7.html");
	WebElement ListBx = driver.findElement(By.name("country"));
	Select s = new Select(ListBx);
	Boolean t= s.isMultiple();
	System.out.println(t);
	s.selectByVisibleText("India");
	s.selectByIndex(4);
	s.selectByValue("BZL");
	Thread.sleep(1000);
//	s.deselectAll();
	s.deselectByValue("AUS");
	s.deselectByIndex(2);
	s.deselectByVisibleText("Brazil");

}
}
