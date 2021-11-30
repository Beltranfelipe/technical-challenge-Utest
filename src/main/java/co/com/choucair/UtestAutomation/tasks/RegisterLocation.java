package co.com.choucair.UtestAutomation.tasks;

import co.com.choucair.UtestAutomation.userinterface.LocationInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class RegisterLocation implements Task {
    private String city;
    private String postalCode;
    private String country;

    public RegisterLocation(String city, String postalCode, String country) {
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }

    public static RegisterLocation information(String city, String postalCode, String country) {
        return Tasks.instrumented(RegisterLocation.class,city,postalCode,country);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Clear.field(LocationInformationPage.INPUT_CITY),
                     Enter.theValue(city).into(LocationInformationPage.INPUT_CITY),
                     Enter.theValue(city).into(LocationInformationPage.INPUT_CITY).thenHit(Keys.ARROW_DOWN).thenHit((Keys.ENTER)),
                     Enter.theValue(postalCode).into(LocationInformationPage.INPUT_POSTAL_CODE),
                     Click.on(LocationInformationPage.BUTTON_COUNTRY),
                     Enter.theValue(country).into(LocationInformationPage.INPUT_COUNTRY).thenHit(Keys.ENTER),
                     Click.on(LocationInformationPage.BUTTON_NEXT));
    }
}
