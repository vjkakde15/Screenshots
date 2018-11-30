/*Program to get text of all options in listbox*/
package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog3 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/Vinod%20J/Desktop/Selenium/HTML%20Files/Test7.html");
	WebElement ListBx = driver.findElement(By.name("country"));
	Select s = new Select(ListBx);
	List<WebElement> allOptions = s.getOptions();
	ArrayList<String> allText = new ArrayList<String>();
	int count=allOptions.size();
	for (int i = 0; i < count; i++) {
		String text=allOptions.get(i).getText();
		System.out.println(text);
		allText.add(text);
	}
	Collections.sort(allText);
	for (String s1: allText) {
		System.out.println(s1);
	}
	
}
}
