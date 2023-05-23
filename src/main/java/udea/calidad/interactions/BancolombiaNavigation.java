package udea.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


import static udea.calidad.userinterfaces.UsuarioPage.*;

public class BancolombiaNavigation implements Interaction{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ANUNCIO));
        actor.attemptsTo(Click.on(BUTTON_CREDITOS));
        actor.attemptsTo(Click.on(BUTTON_BUSCAR_SIMULACION));
        actor.attemptsTo(Click.on(BUTTON_CONTINUAR));

    }

    public static BancolombiaNavigation go(){
        return Tasks.instrumented(BancolombiaNavigation.class);
    }
}
