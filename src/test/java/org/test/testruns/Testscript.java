package org.test.testruns;

import java.io.IOException;

import org.pagefactory.AddToCard;
import org.pagefactory.Finalpage;
import org.pagefactory.ProductCardPage;
import org.pagefactory.SearchProduct;
import org.pagefactory.loginapp;
import org.pagefactory.shippingaddress;
import org.testng.annotations.Test;
import org.utility.Baseclass;

public class Testscript extends Baseclass {
	//WebDriver driver;
	//loginapp login;
	

	@Test
	public void firsttestcase() throws InterruptedException  {
			
		    driver.get(prop.getProperty("url"));
		    loginapp login = new loginapp(Baseclass.driver);
			login.signinapp();
			login.entercred("user3mk@abrc.com", "qwerty@123#");
			Thread.sleep(4000);
			SearchProduct search = new SearchProduct(Baseclass.driver);
			search.navigatetoproduct();
			search.selectoneproduct();
			AddToCard card = new AddToCard(driver);
			card.addselectedproducttocard();
			card.gotoproductcard();
			ProductCardPage pcard= new ProductCardPage(driver);
			pcard.pageordercheckout();
			shippingaddress shipping = new shippingaddress(driver);
			shipping.newaddressentry();
			shipping.filldetails("byjus","logoparkcolony","markdown","new main road","chennai");
			shipping.fillfulldetails("603113", "3211233451");
			shipping.orderplacing();
			Finalpage fpage = new Finalpage(driver);
			fpage.getorderID();
		}
	}
