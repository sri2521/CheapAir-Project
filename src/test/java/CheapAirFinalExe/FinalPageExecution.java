package CheapAirFinalExe;

import java.awt.AWTException;

import org.junit.BeforeClass;
import org.junit.Test;

import CheapAirPageExe.GrandTotalPageExecution;

public class FinalPageExecution extends GrandTotalPageExecution{
//	public static void main(String args[]) throws InterruptedException
//	{
	@BeforeClass
	public static void lauchUrl()
	{
		launchingBrowser("chrome");
		urllaunch(propRead("URL"));
		maximizeWindowSize();
	}
	@Test
	public void test1() throws InterruptedException
	{
		clickRounTrip();
		implicitWait(10000);
		from();
		implicitWait(10000);
		toCity();
		implicitWait(10000);
		departDate();
		implicitWait(10000);
		returnDate();
		implicitWait(10000);
		travellerEconomy();
		implicitWait(10000);
		adult();
		implicitWait(10000);
		seniors();
		implicitWait(10000);
		children();
		implicitWait(10000);
		infants();
		searchFlights();
		implicitWait(20000);
		closeButton();
		implicitWait(20000);
		nameAndPrice();
		sleepThread(10000);
		clickPrice();
		sleepThread(20000);
		continueButton();
		adult1();
//	}
//	@Test
//	public void Test2() throws InterruptedException
//	{
		adult1();
		adult2name();
		seniorname();
		childrenname();
		infantname();
		cardetails();
		grandTotal();
	}
}
