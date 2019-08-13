package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AppsPage;
import pages.HomePageStore;
import pages.SearchPage;



public class SearchpageTest extends TestBase{

	HomePageStore homeObject ;
	String appname =" Ted ";
	SearchPage  Searchobject ;
	AppsPage appspageobject ;

	@Test (priority=1)
	public void UserCanSelectAppsFromHomePageOfStore()
	{	
		homeObject = new HomePageStore(driver);
		homeObject.selectAPPMenu(homeObject.appsmenu);
		System.out.println(driver.getCurrentUrl()); 
		Assert.assertTrue(driver.getCurrentUrl().contains("apps"));

	}
	@Test(priority=2)
	void userCanSelectEducation()   {

		appspageobject = new AppsPage (driver) ;
		appspageobject.categories.click();
		appspageobject.selectAPPMenu(appspageobject.education);
		System.out.println(driver.getCurrentUrl()); 
		WebDriverWait wait = new WebDriverWait(driver,10);
	    wait.until(ExpectedConditions.urlToBe("https://play.google.com/store/apps/category/EDUCATION?hl=en")) ;
		Assert.assertTrue(driver.getCurrentUrl().contains("EDUCATION")); 
	}
	@Test(priority=3)
	public void userCansearchForTed ()  {
		Searchobject =  new SearchPage (driver);
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.elementToBeClickable(Searchobject.searchbtn));
		 Searchobject.userWritingOnSearchTxt(appname);
			try { Thread.sleep(1000);

		}catch (Exception e) {
			e.printStackTrace();		}
	}
	@Test(priority=4)
	public void userCanasserttedicon ()   {
		Searchobject = new SearchPage (driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("TED")));
		driver.findElement(By.linkText("TED")).click();
		if(Searchobject.Tedassertimage.isDisplayed())
		{
			System.out.println("image displayed");
		}else{
			System.out.println("image notdisplayed");
		}
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		
	
		
	}
}
