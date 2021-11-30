package co.com.choucair.UtestAutomation.tasks;

import co.com.choucair.UtestAutomation.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Register implements Task {




    public static Register onUtest() {
        return Tasks.instrumented(Register.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestHomePage.REGISTER_BUTTON));
    }
}
