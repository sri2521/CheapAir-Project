package CheapAirPageExe;

import CheapAirLocators.DetailsPageLocators;
import inst.aiite.baseclass.BaseClass;

public class DetailsPageExecution extends SelectPageExecution{
	
public static void adult1(){
		
		BaseClass.sendkeys(new DetailsPageLocators().getFirstnameAdult1(), readsinglevalue(1,0,"Sheet1"));
		BaseClass.sendkeys(new DetailsPageLocators().getLastnameAdult1(), readsinglevalue(1,1,"Sheet1"));
		BaseClass.sendkeys(new DetailsPageLocators().getSuffix1(), readsinglevalue(1,2,"Sheet1"));
		BaseClass.sendkeys(new DetailsPageLocators().getGenderAdult1(), readsinglevalue(1,3,"Sheet1"));
		BaseClass.sendkeys(new DetailsPageLocators().getDobMonthAdult1(), readsinglevalue(1,4,"Sheet1"));
		BaseClass.sendkeys(new DetailsPageLocators().getDobdayAdult1(), readsinglevalue(1,5,"Sheet1"));
		BaseClass.sendkeys(new DetailsPageLocators().getDobYearAdult1(), readsinglevalue(1,6,"Sheet1"));
}
public static void adult2name(){
	
	BaseClass.sendkeys(new DetailsPageLocators().getFirstnameAdult2(), readsinglevalue(2,0,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getLastnameAdult2(), readsinglevalue(2,1,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getSuffix2(), readsinglevalue(2,2,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getGenderAdult2(), readsinglevalue(2,3,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobMonthAdult2(), readsinglevalue(2,4,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobdayAdult2(), readsinglevalue(2,5,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobYearAdult2(), readsinglevalue(2,6,"Sheet1"));
		
	}


public static void seniorname(){
	
	BaseClass.sendkeys(new DetailsPageLocators().getFirstnameAdult3(), readsinglevalue(3,0,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getLastnameAdult3(), readsinglevalue(3,1,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getSuffix3(), readsinglevalue(3,2,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getGenderAdult3(), readsinglevalue(3,3,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobMonthAdult3(), readsinglevalue(3,4,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobdayAdult3(), readsinglevalue(3,5,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobYearAdult3(), readsinglevalue(3,6,"Sheet1"));
	
}


public static void childrenname() {
	
	
	BaseClass.sendkeys(new DetailsPageLocators().getFirstnameAdult4(), readsinglevalue(4,0,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getLastnameAdult4(), readsinglevalue(4,1,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getSuffix4(), readsinglevalue(4,2,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getGenderAdult4(), readsinglevalue(4,3,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobMonthAdult4(), readsinglevalue(4,4,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobdayAdult4(), readsinglevalue(4,5,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobYearAdult4(), readsinglevalue(4,6,"Sheet1"));
	
}


public static void closealertbox() {
	BaseClass.click_button(new DetailsPageLocators().getClosealertbox());
}

public static void infantname() {
	
	
	
	
	BaseClass.sendkeys(new DetailsPageLocators().getFirstnameAdult5(), readsinglevalue(5,0,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getLastnameAdult5(), readsinglevalue(5,1,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getSuffix5(), readsinglevalue(5,2,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getGenderAdult5(), readsinglevalue(5,3,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobMonthAdult5(), readsinglevalue(5,4,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobdayAdult5(), readsinglevalue(5,5,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getDobYearAdult5(), readsinglevalue(5,6,"Sheet1"));
	
}


public static void cardetails() {
	BaseClass.sendkeys(new DetailsPageLocators().getCcnum(), readsinglevalue(1,7,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getExpMonth1(), readsinglevalue(1,8,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getExpYear1(), readsinglevalue(1,9,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getCvv1(), readsinglevalue(1,10,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getPaymentName1(), readsinglevalue(1,11,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getPaymentCountry1(), readsinglevalue(1,12,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getPaymentAddress1(), readsinglevalue(1,13,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getPaymentAddress21(), readsinglevalue(1,14,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getPaymanetCity1(), readsinglevalue(1,15,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getPaymentPhone1(), readsinglevalue(1,18,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getEmail(), readsinglevalue(1,19,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getPasswordil(), readsinglevalue(1,20,"Sheet1"));
	BaseClass.sendkeys(new DetailsPageLocators().getConfirmPassword(), readsinglevalue(1,21,"Sheet1"));
	
	
	}

}
