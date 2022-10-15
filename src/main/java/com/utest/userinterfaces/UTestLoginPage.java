package com.utest.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON=Target.the("button to register").located(By.linkText("Join Today"));

    public static final Target INPUT_FIRSTNAME =Target.the("input for first name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME =Target.the("input for lastname").located(By.id("lastName"));
    public static final Target INPUT_EMAIL =Target.the("input for E-mail").located(By.id("email"));
    public static final Target INPUT_DATEMONTH =Target.the("input for month of birth").located(By.id("birthMonth"));
    public static final Target INPUT_DATEDAY =Target.the("input for day of birth").located(By.id("birthDay"));
    public static final Target INPUT_DATEYEAR =Target.the("input for year of birth").located(By.id("birthYear"));
    public static final Target LOCATION_BUTTON =Target.the("Button to continue registration").located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a[@class='btn btn-blue']"));

    public static final Target INPUT_CITY =Target.the("input for city").located(By.id("city"));
    public static final Target INPUT_ZIP =Target.the("input for ZIP").located(By.id("zip"));
    public static final Target DEVICES_BUTTON =Target.the("Button to continue registration").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    public static final Target LASTSTEP_BUTTON =Target.the("Button to continue registration").located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue pull-right']"));

    public static final Target INPUT_PASSWORD =Target.the("").located(By.id("Input for password"));
    public static final Target INPUT_COMFIRMPASSWORD =Target.the("").located(By.id("Input for confirm Password"));

    public static final Target CHECK_TERMUSE =Target.the("check for term and cond").located(By.xpath("//label[@class='input-check-box signup-consent']//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target CHECK_PRIVSEC =Target.the("check for priv").located(By.xpath("//label[@class='input-check-box signup-consent']//span[@class='checkmark signup-consent__checkbox error']"));

    public static final Target COMPLETESETUP_BUTTON =Target.the("Button to continue registration").located(By.xpath("//div[@class='pull-right next-step']//a[@class='btn btn-blue']"));

}
