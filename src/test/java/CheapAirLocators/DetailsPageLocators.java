package CheapAirLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailsPageLocators extends SelectPageLocators{
	public DetailsPageLocators()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstName1")
	private WebElement firstnameAdult1;
	

	@FindBy(id="lastName1")
	private WebElement lastnameAdult1;
	
	
	@FindBy(id="gender1")
	private WebElement genderAdult1;
	
	@FindBy(id="dobMonth1")
	private WebElement dobMonthAdult1;
	
	@FindBy(id="dobDay1")
	private WebElement dobdayAdult1;
	
	@FindBy(id="dobYear1")
	private WebElement dobYearAdult1;
	
	
	@FindBy(id="firstName2")
	private WebElement firstnameAdult2;
	

	@FindBy(id="lastName2")
	private WebElement lastnameAdult2;
	
	
	@FindBy(id="gender2")
	private WebElement genderAdult2;
	
	@FindBy(id="dobMonth2")
	private WebElement dobMonthAdult2;
	
	@FindBy(id="dobDay2")
	private WebElement dobdayAdult2;
	
	@FindBy(id="dobYear2")
	private WebElement dobYearAdult2;
	
	@FindBy(id="firstName3")
	private WebElement firstnameAdult3;
	

	@FindBy(id="lastName3")
	private WebElement lastnameAdult3;
	
	
	@FindBy(id="gender3")
	private WebElement genderAdult3;
	
	@FindBy(id="dobMonth3")
	private WebElement dobMonthAdult3;
	
	@FindBy(id="dobDay3")
	private WebElement dobdayAdult3;
	
	@FindBy(id="dobYear3")
	private WebElement dobYearAdult3;
	
	
	@FindBy(id="firstName4")
	private WebElement firstnameAdult4;
	

	@FindBy(id="lastName4")
	private WebElement lastnameAdult4;
	
	
	@FindBy(id="gender4")
	private WebElement genderAdult4;
	
	@FindBy(id="dobMonth4")
	private WebElement dobMonthAdult4;
	
	
	@FindBy(id="dobDay4")
	private WebElement dobdayAdult4;
	
	@FindBy(id="dobYear4")
	private WebElement dobYearAdult4;
	
	@FindBy(id="firstName5")
	private WebElement firstnameAdult5;
	

	@FindBy(id="lastName5")
	private WebElement lastnameAdult5;
	
	
	@FindBy(id="gender5")
	private WebElement genderAdult5;
	
	@FindBy(id="dobMonth5")
	private WebElement dobMonthAdult5;
	
	@FindBy(id="dobDay5")
	private WebElement dobdayAdult5;
	
	@FindBy(id="dobYear5")
	private WebElement dobYearAdult5;

	@FindBy(xpath="//button[@class='DismissibleFixedFooter__RoundButton-sc-704e26-1 fpvsKc']")
	private WebElement closealertbox;
	
	@FindBy(id="ccNum1")
	private WebElement ccnum;
	
	
	@FindBy(id="expMonth1")
	private WebElement expMonth1;
	
	@FindBy(id="expYear1")
	private WebElement expYear1;
	
	@FindBy(id="cvv1")
	private WebElement cvv1;
	
	@FindBy(id="paymentName1")
	private WebElement paymentName1;
	
	@FindBy(id="paymentCountry1")
	private WebElement paymentCountry1;
	
	@FindBy(id="paymentAddress1")
	private WebElement paymentAddress1;
	
	
	@FindBy(id="paymentAddress21")
	private WebElement paymentAddress21;
	
	
	@FindBy(id="paymanetCity1")
	private WebElement paymanetCity1;
	
	@FindBy(id="paymentPhone1")
	private WebElement paymentPhone1;
	
	@FindBy(id="email")
	private WebElement email;
	
	public WebElement getFirstnameAdult1() {
		return firstnameAdult1;
	}

	public WebElement getLastnameAdult1() {
		return lastnameAdult1;
	}

	public WebElement getGenderAdult1() {
		return genderAdult1;
	}

	public WebElement getDobMonthAdult1() {
		return dobMonthAdult1;
	}

	public WebElement getDobdayAdult1() {
		return dobdayAdult1;
	}

	public WebElement getDobYearAdult1() {
		return dobYearAdult1;
	}

	public WebElement getFirstnameAdult2() {
		return firstnameAdult2;
	}

	public WebElement getLastnameAdult2() {
		return lastnameAdult2;
	}

	public WebElement getGenderAdult2() {
		return genderAdult2;
	}

	public WebElement getDobMonthAdult2() {
		return dobMonthAdult2;
	}

	public WebElement getDobdayAdult2() {
		return dobdayAdult2;
	}

	public WebElement getDobYearAdult2() {
		return dobYearAdult2;
	}

	public WebElement getFirstnameAdult3() {
		return firstnameAdult3;
	}

	public WebElement getLastnameAdult3() {
		return lastnameAdult3;
	}

	public WebElement getGenderAdult3() {
		return genderAdult3;
	}

	public WebElement getDobMonthAdult3() {
		return dobMonthAdult3;
	}

	public WebElement getDobdayAdult3() {
		return dobdayAdult3;
	}

	public WebElement getDobYearAdult3() {
		return dobYearAdult3;
	}

	public WebElement getFirstnameAdult4() {
		return firstnameAdult4;
	}

	public WebElement getLastnameAdult4() {
		return lastnameAdult4;
	}

	public WebElement getGenderAdult4() {
		return genderAdult4;
	}

	public WebElement getDobMonthAdult4() {
		return dobMonthAdult4;
	}

	public WebElement getDobdayAdult4() {
		return dobdayAdult4;
	}

	public WebElement getDobYearAdult4() {
		return dobYearAdult4;
	}

	public WebElement getFirstnameAdult5() {
		return firstnameAdult5;
	}

	public WebElement getLastnameAdult5() {
		return lastnameAdult5;
	}

	public WebElement getGenderAdult5() {
		return genderAdult5;
	}

	public WebElement getDobMonthAdult5() {
		return dobMonthAdult5;
	}

	public WebElement getDobdayAdult5() {
		return dobdayAdult5;
	}

	public WebElement getDobYearAdult5() {
		return dobYearAdult5;
	}

	public WebElement getClosealertbox() {
		return closealertbox;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getExpMonth1() {
		return expMonth1;
	}

	public WebElement getExpYear1() {
		return expYear1;
	}

	public WebElement getCvv1() {
		return cvv1;
	}

	public WebElement getPaymentName1() {
		return paymentName1;
	}

	public WebElement getPaymentCountry1() {
		return paymentCountry1;
	}

	public WebElement getPaymentAddress1() {
		return paymentAddress1;
	}

	public WebElement getPaymentAddress21() {
		return paymentAddress21;
	}

	public WebElement getPaymanetCity1() {
		return paymanetCity1;
	}

	public WebElement getPaymentPhone1() {
		return paymentPhone1;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswordil() {
		return passwordil;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	@FindBy(id="password")
	private WebElement passwordil;

	@FindBy(id="confirmPassword")
	private WebElement confirmPassword;

	@FindBy(id="suffix1")
	private WebElement suffix1;
	@FindBy(id="suffix2")
	private WebElement suffix2;
	@FindBy(id="suffix3")
	private WebElement suffix3;
	public WebElement getSuffix1() {
		return suffix1;
	}

	public void setSuffix1(WebElement suffix1) {
		this.suffix1 = suffix1;
	}

	public WebElement getSuffix2() {
		return suffix2;
	}

	public void setSuffix2(WebElement suffix2) {
		this.suffix2 = suffix2;
	}

	public WebElement getSuffix3() {
		return suffix3;
	}

	public void setSuffix3(WebElement suffix3) {
		this.suffix3 = suffix3;
	}

	public WebElement getSuffix4() {
		return suffix4;
	}

	public void setSuffix4(WebElement suffix4) {
		this.suffix4 = suffix4;
	}

	public WebElement getSuffix5() {
		return suffix5;
	}

	public void setSuffix5(WebElement suffix5) {
		this.suffix5 = suffix5;
	}
	@FindBy(id="suffix4")
	private WebElement suffix4;
	@FindBy(id="suffix5")
	private WebElement suffix5;
}
