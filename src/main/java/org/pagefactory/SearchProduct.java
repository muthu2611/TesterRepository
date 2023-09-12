package org.pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.ReusablityMethods;

public class SearchProduct extends ReusablityMethods {
	
	 WebDriver driver;
	 String myproductName="Lando Gym Jacket";
	   
		
		public SearchProduct(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
			}
		
		
		@FindBy(id="ui-id-5")
		WebElement mens;
		
		@FindBy(xpath="(//span[contains(text(),'Tops')])[2]")
		WebElement Tops;
		
		@FindBy(xpath="(//span[contains(text(),'Jackets')])[2]")
		WebElement Jackets;
		
		@FindBy(xpath="(//div[@class=\"products wrapper grid products-grid\"])//strong//a")
		List<WebElement> alljackets;
		
		
		public void navigatetoproduct() {
			mouseoveractions(driver, mens, Tops);
			Jackets.click();
			}
		
		public void selectoneproduct() {
			iterateproducts(driver, alljackets, myproductName);
			}
		
		
		
		

}
