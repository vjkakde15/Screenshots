/*Program to select all the options in listbox and print total no of options in listbox*/
package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Vinod%20J/Desktop/Selenium/HTML%20Files/Test7.html");
		WebElement ListBx = driver.findElement(By.name("country"));
		Select s = new Select(ListBx);
		List<WebElement> allOptions = s.getOptions();		
		int count = allOptions.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
		s.selectByIndex(i);
}
	}
}
