package com.cucumber.steps;

import java.util.concurrent.TimeUnit;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

/**
 * Created by mjbarger on 8/25/16.
 */
public class GmailLoginSteps {
    WebDriver dr;

    @Given("^navigate to gmail page$")
    public void navigate(){
        dr=new FirefoxDriver();
        dr.get("http://www.gmail.com");
    }

    @When ("^user logged in using username as (.+) and password as (.+)")
    public void login(String username,String password){
        dr.findElement(By.name("Email")).sendKeys(username);
        dr.findElement(By.name("signIn")).click();
        dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        dr.findElement(By.name("Passwd")).sendKeys(password);
        dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement signInBtn = dr.findElement(By.id("signIn"));
        signInBtn.click();

    }

    @Then("^inbox page should be displayed$")
    public void verifySuccessful(){
        String expectedText="More";
        String actualText=dr.findElement(By.className("Ykrj7b")).getText();
        Assert.assertTrue("Login successful",expectedText.equals(actualText));
    }
}
