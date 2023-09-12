package org.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {

	WebDriver driver;	   
		
		public checkoutPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			}

//		@FindBy(xpath="//a[@class=\"action viewcart\"]")
//		WebElement viewcard;
//		
//		@FindBy(xpath="//span[contains(text(),'Proceed to Checkout')]")
//		WebElement pagecheckout;
//		
//		@FindBy(xpath="//a[@class=\"action viewcart\"]")
//		WebElement viewcard;
//		
//		@FindBy(xpath="//span[contains(text(),'Proceed to Checkout')]")
//		WebElement pagecheckout;
//		
//		@FindBy(xpath="//a[@class=\"action viewcart\"]")
//		WebElement viewcard;
//		
//		@FindBy(xpath="//span[contains(text(),'Proceed to Checkout')]")
//		WebElement pagecheckout;
//		
//		@FindBy(xpath="//a[@class=\"action viewcart\"]")
//		WebElement viewcard;
//		
//		@FindBy(xpath="//span[contains(text(),'Proceed to Checkout')]")
//		WebElement pagecheckout;
}
