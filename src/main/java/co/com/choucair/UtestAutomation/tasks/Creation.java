package co.com.choucair.UtestAutomation.tasks;

import co.com.choucair.UtestAutomation.userinterface.PasswordCreationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Creation implements Task {
    private String newPassword;
    public static Creation Password(String newPassword) {
        return Tasks.instrumented(Creation.class,newPassword);
    }

    public Creation(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(newPassword).into(PasswordCreationPage.INPUT_NEW_PASSWORD),
                Enter.theValue(newPassword).into(PasswordCreationPage.INPUT_CONFIRM_NEW_PASSWORD),
                Click.on(PasswordCreationPage.CHECK_TERMS_OF_USE),
                Click.on(PasswordCreationPage.CHECK_PRIVACY_SECURITY_POLICY),
                Click.on(PasswordCreationPage.BUTTON_FINISH));
    }
}
