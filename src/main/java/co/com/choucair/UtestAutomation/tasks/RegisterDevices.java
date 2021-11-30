package co.com.choucair.UtestAutomation.tasks;

import co.com.choucair.UtestAutomation.userinterface.DevicesInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class RegisterDevices implements Task {
    private String computer;
    private String version;
    private String languageOS;
    private String mobileDevice;
    private String modelMobile;
    private String mobileOperatingSystem ;

    public RegisterDevices(String computer, String version, String languageOS, String mobileDevice, String modelMobile, String mobileOperatingSystem) {
        this.computer = computer;
        this.version = version;
        this.languageOS = languageOS;
        this.mobileDevice = mobileDevice;
        this.modelMobile = modelMobile;
        this.mobileOperatingSystem = mobileOperatingSystem;
    }

    public static RegisterDevices information(String computer, String version, String languageOS, String mobileDevice, String modelMobile, String mobileOperatingSystem) {
        return Tasks.instrumented(RegisterDevices.class,computer, version, languageOS, mobileDevice, modelMobile,  mobileOperatingSystem);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DevicesInformationPage.BUTTON_COMPUTER),
                Enter.theValue(computer).into(DevicesInformationPage.INPUT_COMPUTER).thenHit(Keys.ENTER),
                Click.on(DevicesInformationPage.BUTTON_VERSION),
                Enter.theValue(version).into(DevicesInformationPage.INPUT_VERSION).thenHit(Keys.ENTER),
                Click.on(DevicesInformationPage.BUTTON_LANGUAGE),
                Enter.theValue(languageOS).into(DevicesInformationPage.INPUT_LANGUAGE).thenHit(Keys.ENTER),
                Click.on(DevicesInformationPage.BUTTON_MOBILE_DEVICE),
                Enter.theValue(mobileDevice).into(DevicesInformationPage.INPUT_MOBILE_DEVICE).thenHit(Keys.ENTER),
                Click.on(DevicesInformationPage.BUTTON_MODEL),
                Enter.theValue(modelMobile).into(DevicesInformationPage.INPUT_MODEL).thenHit(Keys.ENTER),
                Click.on(DevicesInformationPage.BUTTON_OPERATING_SYSTEM),
                Enter.theValue(mobileOperatingSystem).into(DevicesInformationPage.INPUT_OPERATING_SYSTEM).thenHit(Keys.ENTER),
                Click.on(DevicesInformationPage.BUTTON_NEXT));
    }
}
