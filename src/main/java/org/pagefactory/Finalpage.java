package org.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Finalpage {
	WebDriver driver;
	 		
		public Finalpage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			}
	
		@FindBy(xpath="//a[@class=\"order-number\"]")
		WebElement ordernumbers;
		
		@FindBy(xpath="//span[contains(text(),'Continue Shopping')]")
		WebElement continueshop;
		
		public void getorderID() {
			String orderidgenerated = ordernumbers.getText();
			System.out.println("the order id of my current order is:  " + orderidgenerated);
			continueshop.click();
			}

}
