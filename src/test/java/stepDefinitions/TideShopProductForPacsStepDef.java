package stepDefinitions;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.ShopProductPacs;
import reusableComponents.BaseClass;
import utility.ScreenShotClass;

public class TideShopProductForPacsStepDef extends BaseClass {

	ShopProductPacs spp;
	ScreenShotClass ssc;
	ExtentTest test;
	
	@Given("^I am at the Home page of Tide website$")
	public void i_am_at_the_home_page_of_tide_website() {
		ssc = new ScreenShotClass();
		test = extent.createTest("Open Shop Product Pacs");
		System.out.println("Tide webpage fetched");

	}

	@When("^I hovered on Shop Products$")
	public void i_hovered_on_shop_products() throws Exception {
		spp = new ShopProductPacs(driver);
		spp.moveToShopProducts();
		log.info("Hoverd on Shop Products");
		test.pass("Hoverd on Shop Products");

	}

	@And("^Clicked on Pacs product$")
	public void clicked_on_pacs_product() throws Exception {
		spp.clickOnPacs();
		log.info("Clicked on Pacs Products");
		test.pass("Clicked on Pacs Products");
	}

	@Then("^Pacs product page should be visible$")
	public void pacs_product_page_should_be_visible() throws Exception {
		System.out.println("Pacs Product page is visible");
		spp.retailer();
		log.info("Clicked on Retailers");
		test.pass("Clicked on Retailers");
	}

	@And("^validate with Pacs Product is visible$")
	public void validate_with_pacs_product_is_visible() throws IOException {
		ssc.screenshots();
		log.info("Took Screnshot");
		test.pass("Took Screnshot");
		spp.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");

	}

}
