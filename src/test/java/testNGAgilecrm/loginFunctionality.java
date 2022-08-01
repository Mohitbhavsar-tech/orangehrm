package testNGAgilecrm;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHRM.BaseClass;

public class loginFunctionality extends BaseClass {
	@BeforeClass
	@Parameters({"browser","url"})
	  public void beforeClass (String browser,String url){

		  LaunchBrowser(browser);
			driver.get(url);	
			}
@Test(priority=1)
@Parameters({"username","password"})
public void login(String username,String password) {
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@value='sign In']")).submit();
	
}
@Test(priority=2)
public void AddCompany(String company_name,String company_url ) {
driver.findElement(By.id("companiesmenu")).click();	
driver.findElement(By.xpath("//div[@class=\"btn-group\"]/following::button[1]")).click();
driver.findElement(By.id("company_name")).sendKeys(company_name);
driver.findElement(By.id("company_url")).sendKeys(company_url);
driver.findElement(By.id("company_validate")).click();
}
@Test
public void Validate() {
	driver.findElement(By.xpath("//div[@id=\"navbar\"]/ul/li/div[1]")).click();
	driver.findElement(By.id("searchText")).sendKeys("TCS.com");
}
}
