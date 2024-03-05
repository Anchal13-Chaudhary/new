package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.Gyms;
import testBase.BaseClass;

public class TC_03_Gyms extends BaseClass{
	
	@Test(priority=1,groups= {"sanity","master"})
	public void clickGymSection() throws InterruptedException, IOException {
		
		Gyms gs=new Gyms(driver);
		gs.FindGym();
		logger.info("Type gyms in search box.......");
		gs.handlePopupWindow();
	}
	
	@Test(priority=2,groups={"regression","master"})
	public void printGymSubList() throws InterruptedException, IOException {
		Gyms gs=new Gyms(driver);
		
		gs.printGymSubList();
		logger.info("Sub-Menu of Gyms are Printed.......");

	}
	
	@Test(priority=3,groups= {"regression","master"})
	public void printSubMenuList() {
		Gyms gs=new Gyms(driver);
		gs.subMenuDetails();
		logger.info("Sub-Menu dropdown items list is printed.....");
		
	}

}
