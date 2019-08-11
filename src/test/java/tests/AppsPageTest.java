package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AppsPage;
import pages.HomePageStore;

public class AppsPageTest extends TestBase{


	HomePageStore homeObject ;
	AppsPage appspageobject ;
	@Test (priority=1)
	public void UserCanSelectAppsFromHomePageOfStore()
	{		try {  
		homeObject = new HomePageStore(driver);
		homeObject.selectAPPMenu(homeObject.appsmenu);
		System.out.println(driver.getCurrentUrl()); 
		Assert.assertTrue(driver.getCurrentUrl().contains("apps"));
	}catch (Exception e) {
		System.out.println("failure"+ e.getMessage());	
	}
	}
	@Test(priority=2)
	void userCanSelectEducation() throws InterruptedException {
		try {
			appspageobject = new AppsPage (driver) ;
			appspageobject.categories.click();
			appspageobject.selectAPPMenu(appspageobject.education);
			System.out.println(driver.getCurrentUrl()); 
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.urlToBe("https://play.google.com/store/apps/category/EDUCATION?hl=en")) ;
			Assert.assertTrue(driver.getCurrentUrl().contains("EDUCATION")); 
		}catch (Exception e) {
			System.out.println("failure"+ e.getMessage());	
		}

	}

}


