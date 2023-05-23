package udea.calidad.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static udea.calidad.userinterfaces.UsuarioPage.TEXT_VALIDATION;


public class ValidacionBancolombia implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXT_VALIDATION).viewedBy(actor).asString();
        if(stringTemporal.contains("Te ofrecemos estas opciones para")){
            return true;
        }else {
            return false;
        }
    }

    public static ValidacionBancolombia theHomePage(){return new ValidacionBancolombia();}
}
