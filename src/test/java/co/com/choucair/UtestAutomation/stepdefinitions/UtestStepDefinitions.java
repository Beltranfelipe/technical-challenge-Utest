package co.com.choucair.UtestAutomation.stepdefinitions;


import co.com.choucair.UtestAutomation.model.DataRegister;
import co.com.choucair.UtestAutomation.questions.Answer;
import co.com.choucair.UtestAutomation.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());}

    @Given("^that Felipe wants to belong to the professional network for testers Utest$")
    public void thatFelipeWantsToBelongToTheProfessionalNetworkForTestersUtest(List<DataRegister> dataRegister ) {
        OnStage.theActorCalled(dataRegister.get(0).getCreator()).wasAbleTo(OpenUp.thePage(), Register.onUtest());
    }

    @When("^he fills in the registration form$")
    public void heFillsInTheRegistrationForm(List<DataRegister> dataRegister) {
        OnStage.theActorCalled(dataRegister.get(0).getCreator()).attemptsTo(RegisterPersonal.information(dataRegister.get(0).getFirstName(),dataRegister.get(0).getLastName(),dataRegister.get(0).getEmail(),dataRegister.get(0).getBirthMonth(),dataRegister.get(0).getBirthDay(),dataRegister.get(0).getBirthYear(),dataRegister.get(0).getLanguages()),
                RegisterLocation.information(dataRegister.get(0).getCity(),dataRegister.get(0).getPostalCode(),dataRegister.get(0).getCountry()),
                RegisterDevices.information(dataRegister.get(0).getComputer(),dataRegister.get(0).getVersion(),dataRegister.get(0).getLanguageOS(),dataRegister.get(0).getMobileDevice(),dataRegister.get(0).getModelMobile(),dataRegister.get(0).getMobileOperatingSystem()),
                Creation.Password(dataRegister.get(0).getNewPassword()));


    }

    @Then("^he successfully registers by observing the tittle!$")
    public void heSuccessfullyRegistersByObservingTheTittle(List<DataRegister> dataRegister) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(dataRegister.get(0).getWelcomeMessage())));
    }
}
