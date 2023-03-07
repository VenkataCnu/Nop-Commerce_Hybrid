package com.nopcommerce.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {

	public WebDriver ldriver;

	public AddcustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/i")
	WebElement lnkCustomers_menu;

	@FindBy(xpath = "//span[@class='menu-item-title'][contains(text(),'Customers')]")
	WebElement lnkCustomers_menuitem;

	@FindBy(xpath = "//a[@class='btn bg-blue']")
	WebElement btnAddnew;

	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(id = "SelectedCustomerRoleIds")
	WebElement txtcustomerRoles;

	@FindBy(xpath = "//li[contains(text(),'Administrators')]")
	WebElement lstitemAdministrators;

	@FindBy(xpath = "//li[contains(text(),'Registered')]")
	WebElement lstitemRegistered;

	@FindBy(xpath = "//li[contains(text(),'Guests')]")
	WebElement lstitemGuests;

	@FindBy(xpath = "//li[contains(text(),'Vendors')]")
	WebElement lstitemVendors;

	@FindBy(xpath = "VendorId")
	WebElement drpmgrOfVendor;

	@FindBy(id = "Gender_Male")
	WebElement rdMaleGender;

	@FindBy(id = "Gender_Female")
	WebElement rdFeMaleGender;

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement txtFirstName;

	@FindBy(xpath = "//input[@id='LastName']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@id='DateOfBirth']")
	WebElement txtDob;

	@FindBy(xpath = "//input[@id='Company']")
	WebElement txtCompanyName;

	@FindBy(xpath = "//textarea[@id='AdminComment']")
	WebElement txtAdminContent;

	@FindBy(xpath = "//div[@class='k-multiselect-wrap k-floatwrap'][1]")
	WebElement news;

	@FindBy(xpath = "//button[@name='save']")
	WebElement btnSave;

	public void clickOnCustomersMenu() {
		lnkCustomers_menu.click();
	}

	public void clickOnCustomersMenuItem() {
		lnkCustomers_menuitem.click();
	}

	public void clickOnAddnew() {
		btnAddnew.click();
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void setCustomerRoles(String role) throws InterruptedException {
		Select sel = new Select(txtcustomerRoles);
		sel.selectByValue(role);
		Thread.sleep(3000);

	}

	public void setManagerOfVendor(String value) {
		Select drp = new Select(drpmgrOfVendor);
		drp.selectByVisibleText(value);
	}

	public void setGender(String gender) {
		if (gender.equals("Male")) {
			rdMaleGender.click();
		} else {
			rdFeMaleGender.click();
		}

	}

	public void setNews(String cnews) {
		news.sendKeys(cnews);
	}

	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void setDob(String dob) {
		txtDob.sendKeys(dob);
	}

	public void setCompanyName(String comname) {
		txtCompanyName.sendKeys(comname);
	}

	public void setAdminContent(String content) {
		txtAdminContent.sendKeys(content);
	}

	public void clickOnSave() {
		btnSave.click();
	}

}
