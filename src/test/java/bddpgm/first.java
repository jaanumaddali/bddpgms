package bddpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class first {
WebDriver driver;
	
	@Given("ftft")
	public void ftft() {
	    // Write code here that turns the phrase above into concrete actions
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	    
	}

	@Given("hyhuyu")
	public void hyhuyu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.google.com");
	} 

	@When("jkhuki")
	public void jkhuki() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	    
	}

	@Then("jnhuhuy")
	public void jnhuhuy() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	   
	}

}
