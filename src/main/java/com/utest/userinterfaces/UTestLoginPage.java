package com.utest.userinterfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON=Target.the("button that shows us the form to login").located(By.linkText("Join Today"));

    public static final Target INPUT_FIRSTNAME =Target.the("PRIMER NOMBRE").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME =Target.the("APELLIDO").located(By.id("lastName"));
    public static final Target INPUT_EMAIL =Target.the("CORREO ELECTRONICO").located(By.id("email"));
    public static final Target INPUT_DATEMONTH =Target.the("MES DE CUMPLEAÑOS").located(By.id("birthMonth"));
    /*public static final Target INPUT_DATEDAY =Target.the("DIA DE CUMPLEAÑOS").located(By.id("birthDay"));
    public static final Target INPUT_DATEYEAR =Target.the("ANO DE CUMPLEAÑOS").located(By.id("birthYear"));
    public static final Target LOCATION_BUTTON =Target.the("button that shows us the form to login").located(By.linkText("Next: Location"));

    public static final Target INPUT_CITY =Target.the("CIUDAD").located(By.id("city"));
    public static final Target INPUT_ZIP =Target.the("CODIGO POSTAÑ").located(By.id("zip"));
    public static final Target INPUT_PAIS =Target.the("CORREO PAIS").located(By.className("ui-select"));
    public static final Target DEVICES_BUTTON =Target.the("button that shows us the form to login").located(By.linkText("Next: Devices"));
   /* ui-select-match-text pull-left ui-select-allow-clear
    public static final Target INPUT_OS =Target.the("SISTEMA OPERATIVO").located(By.className("ui-select-match-text pull-left ui-select-allow-clear"));
    public static final Target INPUT_OS =Target.the("SISTEMA OPERATIVO").located(By.className("ui-select-match-text pull-left ui-select-allow-clear"));
    public static final Target INPUT_OS =Target.the("SISTEMA OPERATIVO").located(By.className("ui-select-match-text pull-left ui-select-allow-clear"));
*//*
    public static final Target LASTSTEP_BUTTON =Target.the("button that shows us the form to login").located(By.linkText("Next: Last Step"));

    public static final Target INPUT_PASSWORD =Target.the("PRIMER NOMBRE").located(By.id("password"));
    public static final Target INPUT_COMFIRMPASSWORD =Target.the("APELLIDO").located(By.id("confirmPassword"));
    public static final Target CHECK_TERMUSE =Target.the("CORREO PAIS").located(By.className("checkmark signup-consent__checkbox"));
    public static final Target CHECK_PRIVSEC =Target.the("CORREO PAIS").located(By.className("checkmark signup-consent__checkbox"));
    public static final Target COMPLETESETUP_BUTTON =Target.the("button that shows us the form to login").located(By.linkText("Complete Setup"));

*/



}
