package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.AddcustomerPage;
import com.nopcommerce.pageObjects.LoginPage;
import com.nopcommerce.utilities.ExcelUtils;

public class TC_AddCustomer_DataProvider extends BaseClass {

	@Test(priority = -1)
	public void Login() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("admin@yourstore.com");
		lp.setPassword("admin");
		lp.clickLogin();
		Thread.sleep(10000);
	}

	@Test
	public void addCust(String gen, String cnews) throws InterruptedException, Exception {

		ExcelUtils util = new ExcelUtils();
		util.setExcelFile("./testData\\Customer.xlsx", "Customer");
		AddcustomerPage acp = new AddcustomerPage(driver);

		acp.clickOnCustomersMenu();
		acp.clickOnCustomersMenuItem();
		acp.clickOnAddnew();
		Thread.sleep(2000);
		acp.setEmail(util.getCellData(2, 1));
		acp.setPassword(util.getCellData(2, 2));
		acp.setGender(gen);
		acp.setNews(cnews);
		acp.setFirstName(util.getCellData(2, 3));
		acp.setLastName(util.getCellData(2, 4));
		acp.setCompanyName(util.getCellData(2, 6));
		acp.setAdminContent(util.getCellData(2, 7));
		acp.clickOnSave();

	}
}
