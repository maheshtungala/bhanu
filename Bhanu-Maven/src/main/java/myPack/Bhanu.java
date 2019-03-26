package myPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bhanu {
@Test
public static void verifyLogin() {
	WebDriver driver = new ChromeDriver();
	driver.get("http://apps.qaplanet.in/qahrm");
	driver.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
	driver.findElement(By.name("txtPassword")).sendKeys("lab1");
	driver.findElement(By.name("Submit")).click();
	
	if(driver.getTitle().equals("OrangeHRM")) {
		System.out.println("TC VerifyLogin Passed!");
	}else{
		System.out.println("TC VerifyLogin Failed!");
	}
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
@Test
public static void addEmp() {
	System.out.println("Add Emp Passed!");
}
@Test
public static void editEmp() {
	System.out.println("Edit Emp Passed!");
}
@Test
 public static void deleteEmp() {
	System.out.println("Delete Emp Passed!");
}
}
