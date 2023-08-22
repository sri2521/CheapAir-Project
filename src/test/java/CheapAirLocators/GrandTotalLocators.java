package CheapAirLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrandTotalLocators extends DetailsPageLocators{
	public GrandTotalLocators()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="(//p[@class='cart-total']//following::span)[1]")
	private WebElement grandTotal;
	public WebElement getGrandTotal() {
		return grandTotal;
	}
}


