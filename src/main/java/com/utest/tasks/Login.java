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

                Enter.theValue("Jefersson").into(UTestLoginPage.INPUT_FIRSTNAME),
                Enter.theValue("Bedoya").into(UTestLoginPage.INPUT_LASTNAME),
                Enter.theValue("Engineerjef@gmail.com").into(UTestLoginPage.INPUT_EMAIL),
                Enter.keyValues("MARCH").into(UTestLoginPage.INPUT_DATEMONTH),
                Enter.keyValues("3").into(UTestLoginPage.INPUT_DATEDAY),
                Enter.keyValues("1994").into(UTestLoginPage.INPUT_DATEYEAR),
                Click.on(UTestLoginPage.LOCATION_BUTTON),

                Enter.theValue("Sincelejo Sucre, Colombia").into(UTestLoginPage.INPUT_CITY),
                Enter.theValue("700001").into(UTestLoginPage.INPUT_ZIP),
                Click.on(UTestLoginPage.DEVICES_BUTTON),

                Click.on(UTestLoginPage.LASTSTEP_BUTTON),

                Enter.theValue("Hola mundo123456").into(UTestLoginPage.INPUT_PASSWORD),
                Enter.theValue("Hola mundo123456").into(UTestLoginPage.INPUT_COMFIRMPASSWORD),

                Click.on(UTestLoginPage.CHECK_TERMUSE),
                Click.on(UTestLoginPage.CHECK_PRIVSEC),

                Click.on(UTestLoginPage.COMPLETESETUP_BUTTON)

                );
    }
}
