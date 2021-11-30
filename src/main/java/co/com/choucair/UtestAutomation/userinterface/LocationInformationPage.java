package co.com.choucair.UtestAutomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationInformationPage extends PageObject {

    public static final Target INPUT_CITY=Target.the("where do we write the city").located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE=Target.the("where do we write the postal code").located(By.id("zip"));
    public static final Target BUTTON_COUNTRY=Target.the("enable field editing").located(By.xpath("//span[@class='ui-select-match-text pull-left']"));
    public static final Target INPUT_COUNTRY=Target.the("where do we write the country").located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target BUTTON_NEXT=Target.the("button to confirm next step").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
