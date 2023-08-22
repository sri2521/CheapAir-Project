package CheapAirLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPageLocators extends SearchPageLocators{
	public SelectPageLocators()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//button[@class='sc-hBxehG ctlyBb MarketingModal__CloseButton-sc-1805bkx-1 fsxaYy']")
	private WebElement closeButton;
	public WebElement getCloseButton() {
		return closeButton;
	}
	@FindBy(xpath="//div[@class='src__Box-sc-1sbtrzs-0 src__Flex-sc-1sbtrzs-1 fpCEQS hzdsvF']")
	private List<WebElement> flightName;
	
	@FindBy(xpath="//span[@class='sc-cmnYtw gSLQeZ']")
	private List<WebElement> flightprice;
	public List<WebElement> getFlightName() {
		return flightName;
	}

	public List<WebElement> getFlightprice() {
		return flightprice;
	}
	@FindBy (xpath="//div[@class='src__Box-sc-1sbtrzs-0 src__Flex-sc-1sbtrzs-1 hwBhoA hzdsvF']")
	private WebElement clickPrice;
	public WebElement getClickPrice() {
		return clickPrice;
	}
	@FindBy (xpath="//div[@class='sc-fnGiBr bJsruJ']")
	private WebElement continueButton;
	public WebElement getContinueButton() {
		return continueButton;
	}

	
}
	
	

