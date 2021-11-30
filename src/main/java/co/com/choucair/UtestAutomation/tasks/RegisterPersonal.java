package co.com.choucair.UtestAutomation.tasks;

import co.com.choucair.UtestAutomation.userinterface.DevicesInformationPage;
import co.com.choucair.UtestAutomation.userinterface.LocationInformationPage;
import co.com.choucair.UtestAutomation.userinterface.PasswordCreationPage;
import co.com.choucair.UtestAutomation.userinterface.PersonalInformationFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;


public class RegisterPersonal implements Task {
    private String firstName;
    private String lastName;
    private String email ;
    private String birthMonth;
    private String birthDay;
    private String birthYear;
    private String languages;

    public RegisterPersonal(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String languages) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.languages = languages;
    }

    public static RegisterPersonal information(String firstName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String languages) {
        return Tasks.instrumented(RegisterPersonal.class, firstName,  lastName,  email,  birthMonth,  birthDay,  birthYear,  languages);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    Enter.theValue(firstName).into(PersonalInformationFormPage.INPUT_FIRST_NAME),
                    Enter.theValue(lastName).into(PersonalInformationFormPage.INPUT_LAST_NAME),
                    Enter.theValue(email).into(PersonalInformationFormPage.INPUT_EMAIL),
                    SelectFromOptions.byVisibleText(birthMonth).from(PersonalInformationFormPage.SELECT_BIRTH_MONTH),
                    SelectFromOptions.byVisibleText(birthDay).from(PersonalInformationFormPage.SELECT_BIRTH_DAY),
                    SelectFromOptions.byVisibleText(birthYear).from(PersonalInformationFormPage.SELECT_BIRTH_YEAR),
                    Enter.theValue(languages).into(PersonalInformationFormPage.INPUT_LANGUAGES).thenHit(Keys.ENTER),
                    Click.on(PersonalInformationFormPage.BUTTON_NEXT)
            );

    }
}
