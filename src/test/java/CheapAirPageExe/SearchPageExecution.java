package CheapAirPageExe;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebElement;

import CheapAirLocators.GrandTotalLocators;
import CheapAirLocators.SearchPageLocators;
import inst.aiite.baseclass.BaseClass;

public class SearchPageExecution extends GrandTotalLocators{
	public static void clickRounTrip()
	{
		BaseClass.click_button(new SearchPageLocators().getClickRounTrip());
	}
	public static void from()
	{
		BaseClass.click_button(new SearchPageLocators().getFrom());
		BaseClass.sendkeys(new SearchPageLocators().getFrom(), "Chennai, India");
		
	}
	public static void toCity()
	{
		BaseClass.click_button(new SearchPageLocators().getToCity());
		BaseClass.sendkeys(new SearchPageLocators().getToCity(), "Delhi, India");
		
	}
	public static void departDate()
	{
		BaseClass.click_button(new SearchPageLocators().getDepartDate());
		BaseClass.sendkeys(new SearchPageLocators().getDepartDate(), "May 10");
	}
	public static void returnDate()
	{
		BaseClass.click_button(new SearchPageLocators().getReturnDate());
		BaseClass.sendkeys(new SearchPageLocators().getReturnDate(), "Jun 6");
	}
	public static void travellerEconomy()
	{
		BaseClass.click_button(new SearchPageLocators().getTravelEco());
		
	}
	@SuppressWarnings("unlikely-arg-type")
	public static void adult()
	{
		List<WebElement> adultNo=new SearchPageLocators().getAdult();
		for(int i=0;i<adultNo.size();i++)
		{
			adultNo.get(i).click();
			if(adultNo.get(i).equals("3"))
			{
				break;	
			}
			
		}
		
	}
	@SuppressWarnings("unlikely-arg-type")
	public static void seniors()
	{
		List<WebElement> seniorsNo=new SearchPageLocators().getSeniors();
		for(int i=0;i<seniorsNo.size();i++)
		{
			seniorsNo.get(i).click();
			if(seniorsNo.get(i).equals("3"))
			{
				break;
			}
			
		}
		
	}
	@SuppressWarnings("unlikely-arg-type")
	public static void children()
	{
		List<WebElement> childrenNo=new SearchPageLocators().getChildren();
		for(int i=0;i<childrenNo.size();i++)
		{
			childrenNo.get(i).click();
			if(childrenNo.get(i).equals("3"))
			{
				break;
			}
			
		}
		
	}
	@SuppressWarnings("unlikely-arg-type")
	public static void infants()
	{
		List<WebElement> infantsNo=new SearchPageLocators().getInfants();
		for(int i=0;i<infantsNo.size();i++)
		{
			infantsNo.get(i).click();
			if(infantsNo.get(i).equals("2"))
			{
				break;
			}
			
		}
		
	}
	public static void searchFlights()
	{
		BaseClass.click_button(new SearchPageLocators().getSearchFlights());
	}
	
}
