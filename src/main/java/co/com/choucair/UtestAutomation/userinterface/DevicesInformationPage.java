package co.com.choucair.UtestAutomation.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesInformationPage extends PageObject {
    public static final Target BUTTON_COMPUTER=Target.the("enable computer field editing").located(By.xpath("//div[@id='web-device']//span[@aria-label='Select OS']"));
    public static final Target INPUT_COMPUTER=Target.the("where do we write the SO computer").located(By.xpath("//div[@id='web-device']//input[@placeholder='Select OS']"));
    public static final Target BUTTON_VERSION=Target.the("enable version field editing").located(By.xpath("//span[@aria-label='Select a Version']"));
    public static final Target INPUT_VERSION=Target.the("where do we write the version").located(By.xpath("//input[@placeholder='Select a Version']"));
    public static final Target BUTTON_LANGUAGE=Target.the("enable language field editing").located(By.xpath("//span[@aria-label='Select OS language']"));
    public static final Target INPUT_LANGUAGE=Target.the("where do we write the language").located(By.xpath("//input[@placeholder='Select OS language']"));
    public static final Target BUTTON_MOBILE_DEVICE=Target.the("enable mobile device field editing").located(By.xpath("//span[@aria-label='Select Brand']"));
    public static final Target INPUT_MOBILE_DEVICE=Target.the("where do we write the mobile device").located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target BUTTON_MODEL=Target.the("enable model field editing").located(By.xpath("//span[@aria-label='Select a Model']"));
    public static final Target INPUT_MODEL=Target.the("where do we write the mobile model").located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target BUTTON_OPERATING_SYSTEM=Target.the("enable operating system field editing").located(By.xpath("//div[@id='mobile-device']//span[@aria-label='Select OS']"));
    public static final Target INPUT_OPERATING_SYSTEM=Target.the("where do we write the operating system mobile").located(By.xpath("//div[@id='mobile-device']//input[@placeholder='Select OS']"));
    public static final Target BUTTON_NEXT=Target.the("button to confirm next step").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
