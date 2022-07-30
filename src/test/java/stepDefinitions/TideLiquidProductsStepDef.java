package stepDefinitions;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.TideLiquidProduct;
import reusableComponents.BaseClass;
import utility.ScreenShotClass;

public class TideLiquidProductsStepDef extends BaseClass{

	TideLiquidProduct tlp;
	ScreenShotClass ssc;
	ExtentTest test;
	
	@Given("I am in Tide HomePage and hoverd on shop products")
	public void i_am_in_tide_home_page_and_hoverd_on_shop_products() throws Exception {
		tlp = new TideLiquidProduct(driver);
		ssc = new ScreenShotClass();
		test = extent.createTest("Check for Liquid Products");
		tlp.moveToShopProducts();
		log.info("Hoverd on Shop Products");
		test.pass("Hoverd on Shop Products");
	}

	@When("I clicked on Liquid Product")
	public void i_clicked_on_liquid_product() throws Exception {
		tlp.clickOnLiquid();
		log.info("Clicked on Liquids");
		test.pass("Clicked on Liquids");
	}

	@Then("Click on sensitive option")
	public void click_on_sensitive_option() throws Exception {
		tlp.clickOnSensitive();
		log.info("Clicked on Sensitive option");
		test.pass("Clicked on Sensitive option");
	}

	@And("Verify sensitive page is displayed or not")
	public void verify_sensitive_page_is_displayed_or_not() throws Exception {
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		tlp.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
	}
	
}
