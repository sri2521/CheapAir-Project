package CheapAirPageExe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CheapAirLocators.GrandTotalLocators;
import inst.aiite.baseclass.BaseClass;

public class GrandTotalPageExecution extends DetailsPageExecution{
	
	public static void grandTotal()
	{
		String orderNumber = BaseClass.getAttribute(new GrandTotalLocators().getGrandTotal());
		BaseClass.excelWrite(orderNumber,"GrandTotal4");
		System.out.println(orderNumber);
		
	}
}
