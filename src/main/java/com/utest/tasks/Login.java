package com.utest.tasks;

import com.sun.org.apache.bcel.internal.generic.Select;
import com.utest.userinterfaces.UTestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestLoginPage.LOGIN_BUTTON),
                Click.on(UTestLoginPage.INPUT_DATEMONTH),
                Enter.theValue("ingresarTuUsuario").into(UTestLoginPage.INPUT_FIRSTNAME),
                Enter.theValue("ingresarTuApellido").into(UTestLoginPage.INPUT_LASTNAME),
                Enter.theValue("correo@gmail.com").into(UTestLoginPage.INPUT_EMAIL)//,

                //,
               // Enter.theValue("1").into(UTestLoginPage.INPUT_DATEMONTH),
               // Enter.theValue("1").into(UTestLoginPage.INPUT_DATEDAY),
               // Enter.theValue("1999").into(UTestLoginPage.INPUT_DATEYEAR),
                //Click.on(UTestLoginPage.LOCATION_BUTTON)
                );
    }
}
