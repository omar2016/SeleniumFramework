package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePageStore extends PageBase{

	public HomePageStore(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}


	@FindBy(linkText="Apps")
	public 
    WebElement appsmenu ;


}
