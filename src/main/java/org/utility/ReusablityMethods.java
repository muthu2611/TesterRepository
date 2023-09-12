package org.utility;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReusablityMethods {

	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void mouseoveractions(WebDriver driver,WebElement ele1 , WebElement ele2) {
		Actions a = new Actions(driver);
		a.moveToElement(ele1).moveToElement(ele2).build().perform();
	}
	
	public void mouseover(WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();
	}
	
	public void iterateproducts(WebDriver driver,List<WebElement> element1, String productname) {
		for (WebElement element2 : element1) {
			 String linkname =element2.getAttribute("href");
			 String textname = element2.getText();
			

			if (textname.contains(productname)) {
				element2.click();
				break;
			}
	}
}
	public void scrollpage(WebElement element2 , WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element2);
	}
	
	public void javascriptclick(WebElement element3 , WebDriver driver) {
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].click();", element3);
	}
	
	public void selectmethodsbyvalue(WebDriver driver,WebElement element4,String Values) {
		Select s1 = new Select(element4);
		s1.selectByValue(Values);
		
	}
	public void selectmethodsbyIndex(WebDriver driver,WebElement element5,int index) {
		Select s2 = new Select(element5);
		s2.selectByIndex(index);
	}
	public void selectmethodsbyText(WebDriver driver,WebElement element6 , String visibletext) {
		Select s3 = new Select(element6);
		s3.selectByVisibleText(visibletext);
}
}
