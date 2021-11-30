package co.com.choucair.UtestAutomation.questions;

import co.com.choucair.UtestAutomation.userinterface.WelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    public Answer(String question){
        this.question=question;
    }
    public static Answer toThe(String question) {
        return new Answer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String WelcomeMessage= Text.of(WelcomePage.WELCOME_MESSAGE).viewedBy(actor).asString();
        if (question.equals(WelcomeMessage)){
            result=true;
        }else{
            result=false;
        }
        return result;

    }


}
