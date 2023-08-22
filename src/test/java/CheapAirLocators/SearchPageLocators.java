package CheapAirLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import inst.aiite.baseclass.BaseClass;

public class SearchPageLocators extends BaseClass{
	public SearchPageLocators()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='tgl-btn'])[1]")
	private WebElement clickRounTrip;
	public WebElement getClickRounTrip() {
		return clickRounTrip;
	}
	@FindBy(xpath="//input[@type='text' and @id='from1']")
	private WebElement from;
	public WebElement getFrom() {
		return from;
	}
	@FindBy(xpath="//input[@id='to1' and @name='to1']")
	private WebElement toCity;
	public WebElement getToCity() {
		return toCity;
	}
	@FindBy(id="departs")
	private WebElement departDate;
	@FindBy(id="returns")
	private WebElement returnDate;
	public WebElement getDepartDate() {
		return departDate;
	}
	public void setDepartDate(WebElement departDate) {
		this.departDate = departDate;
	}
	public WebElement getReturnDate() {
		return returnDate;
	}
	@FindBy (xpath="//div[@tabindex='4']")
		private WebElement travelEco;
	public WebElement getTravelEco() {
		return travelEco;
	}
	@FindBy (xpath="//button[@tabindex='6']")
	private List<WebElement> adult;
	@FindBy (xpath="//button[@tabindex='8']")
	private List<WebElement> seniors;
	@FindBy (xpath="//button[@tabindex='10']")
	private List<WebElement> children;
	public List<WebElement> getAdult() {
		return adult;
	}
	public List<WebElement> getSeniors() {
		return seniors;
	}
	public List<WebElement> getChildren() {
		return children;
	}
	public List<WebElement> getInfants() {
		return infants;
	}
	@FindBy (xpath="//button[@tabindex='12']")
	private List<WebElement> infants;
	@FindBy (xpath="//button[@tabindex='51']")
	private WebElement searchFlights;
	public WebElement getSearchFlights() {
		return searchFlights;
	}
}
