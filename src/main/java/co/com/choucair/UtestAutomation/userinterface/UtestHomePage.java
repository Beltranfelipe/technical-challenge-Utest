package co.com.choucair.UtestAutomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestHomePage extends PageObject {
    public static final Target REGISTER_BUTTON=Target.the("button showing registration form")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
