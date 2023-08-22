package CheapAirPageExe;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import CheapAirLocators.SelectPageLocators;
import inst.aiite.baseclass.BaseClass;

public class SelectPageExecution extends SearchPageExecution{
	public static void closeButton()
	{
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it= handler.iterator();
		String parentwindowid= it.next();
		System.out.println("parent window id:"+parentwindowid);
		
		String childwindowid= it.next();
		System.out.println("child window id:"+childwindowid);
		
		driver.switchTo().window(childwindowid);
		
		WebElement close =new SelectPageLocators().getCloseButton();
		close.click();
	}
	public static void nameAndPrice()
	{
		List<WebElement> name = new SelectPageLocators().getFlightName();
		List<WebElement> price = new SelectPageLocators().getFlightprice();
		
		Map<String,String> m = new HashMap<>();
		for (int i = 0; i < name.size(); i++) {
		m.put(name.get(i).getText(),price.get(i).getText());
		
		}
		System.out.println(m);
		Entry<String, String> minEntry = Collections.min(m.entrySet(), Comparator.comparing(Entry::getValue));
		String minValue = minEntry.getValue(); 
		System.out.println(minValue);
	}
	public static void clickPrice() throws InterruptedException
	{
		sleepThread(10000);
		WebElement min_flight_price = new SelectPageLocators().getClickPrice();
		sleepThread(10000);

			BaseClass.click_button(min_flight_price);
			sleepThread(10000);
			BaseClass.click_button(min_flight_price);
	}
	public static void continueButton() {
		WebElement continue_Button = new SelectPageLocators().getContinueButton();
		BaseClass.click_button(continue_Button);
	}
	
}
