package org.pagerepo;

import org.openqa.selenium.support.PageFactory;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.stepdef.Hook;

public class LoginPageRepo2 {
	public LoginPageRepo2() {
		PageFactory.initElements(Hook.driver, this);
	}
	@FindBy(xpath = "//div[@class='src__Box-sc-1sbtrzs-0 sc-fDnMV sc-ifasWZ cPDqnV heBeQv jqhqbE']//span[@class='sc-fztKhi lfzpWR']")
	private List<WebElement> price;
	
	@FindBy(xpath = "//div[text()='Continue']")
	private WebElement Continue;
	
	@FindBy(xpath = "//div[@class='sc-fnGiBr kCVmbb']")
	
	private WebElement cross;
	
	@FindBy(xpath = "(//div[@class='src__Box-sc-1sbtrzs-0 sc-fDnMV sc-ifasWZ cPDqnV heBeQv jqhqbE']//span[@class='sc-fztKhi lfzpWR'])[1]")
	private WebElement departflight;
	
	@FindBy(xpath = "(//div[@class='src__Box-sc-1sbtrzs-0 sc-fDnMV sc-ifasWZ cPDqnV heBeQv jqhqbE']//span[@class='sc-fztKhi lfzpWR'])[1]")
	private WebElement returnflight;
	
	public WebElement getReturnflight() {
		return returnflight;
	}

	public WebElement getDepartflight() {
		return departflight;
	}

	public List<WebElement> getPrice() {
		return price;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getCross() {
		return cross;
	}
	 
}
