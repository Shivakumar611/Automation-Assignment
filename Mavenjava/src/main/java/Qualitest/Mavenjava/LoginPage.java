package Qualitest.Mavenjava;

import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;

public class LoginPage extends Initialization{
	Initialization init = new Initialization();
	 By username=By.name("username");
	 By Password=By.name("password");
	 By submit=By.id("loginbtn");
	
	public  void GenericLogin(String user,String pass)
	{
		
		driver=init.DriverInit();
		driver.findElement(username).sendKeys(user);
		driver.findElement(Password).sendKeys(pass);
		driver.findElement(submit).click();
		System.out.println("Generic Test case passed");
		init.DriverClose();
	}
	
}
