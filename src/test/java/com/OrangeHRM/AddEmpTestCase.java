package com.OrangeHRM;

import java.util.Map;

public class AddEmpTestCase extends BaseClass {

	public static void main(String[] args) throws Exception {
		LaunchBrowser("chrome");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		LoginPage loginPage = new LoginPage();
		EmpListPage empListPage = new EmpListPage();
		loginPage.login("Admin","admin123");
		Map<String,Object> empDetails=empListPage.addEmp("Cyber", "", "Success", false, null, null);
		EmpListPage.searchEmp(empDetails);
	}

}
