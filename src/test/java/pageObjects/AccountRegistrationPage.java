package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstNameTextField;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastNameTextField;
	
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement eMailTextField;
	
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement telephoneTextField;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement passwordTextField;
	
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement passwordConfirmTextField;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement agreeCheckBox;
	
	
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement accountCreatedConfirmationMsg;
	
	
	public void setFirstName(String firstName)
	{
		firstNameTextField.sendKeys(firstName);
	}
	
	public void setLastName(String lastName)
	{
		lastNameTextField.sendKeys(lastName);
	}
	
	public void setEmail(String emailID)
	{
		eMailTextField.sendKeys(emailID);
	}
	
	public void setTelephone(String telephone)
	{
		telephoneTextField.sendKeys(telephone);
	}
	
	public void setPassword(String password)
	{
		passwordTextField.sendKeys(password);
	}
	
	public void setConfirmPassword(String password)
	{
		passwordConfirmTextField.sendKeys(password);
	}
	
	public void setPrivacyPolicy()
	{
		agreeCheckBox.click();
	}
	
	public void clickContinue()
	{
		continueButton.click();
	}
	
	
	public String getConfirmationMsg()
	{
		try {
			return(accountCreatedConfirmationMsg.getText());
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
		
	}
	
}
