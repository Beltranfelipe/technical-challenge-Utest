package co.com.choucair.UtestAutomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformationFormPage extends PageObject {
    public static final Target INPUT_FIRST_NAME=Target.the("where do we write the first name").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME=Target.the("where do we write the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL=Target.the("where do we write the email").located(By.id("email"));
    public static final Target SELECT_BIRTH_MONTH=Target.the("where do we Select birth month ").located(By.id("birthMonth"));
    public static final Target SELECT_BIRTH_DAY=Target.the("where do we Select birth day").located(By.id("birthDay"));
    public static final Target SELECT_BIRTH_YEAR=Target.the("where do we Select birth year").located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES =Target.the("where do we write the speak language").located(By.xpath("//input[@type='search']"));
    public static final Target BUTTON_NEXT=Target.the("button to confirm next step").located(By.xpath("//a[@class='btn btn-blue']"));


}
