package co.com.choucair.UtestAutomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PasswordCreationPage extends PageObject {

    public static final Target INPUT_NEW_PASSWORD=Target.the("Where do we write the new password").located(By.id("password"));
    public static final Target INPUT_CONFIRM_NEW_PASSWORD=Target.the("where do we confirm the new password").located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS_OF_USE=Target.the("where do we accept term of use").located(By.xpath("//form[@name='userForm']/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY_SECURITY_POLICY=Target.the("where do we accept term of use").located(By.xpath("//form[@name='userForm']/div[6]/label/span[1]"));
    public static final Target BUTTON_FINISH=Target.the("button to confirm Complete Setup").located(By.xpath("//a[@class='btn btn-blue']"));

}
