package udea.calidad.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.concurrent.ThreadLocalRandom;

import static udea.calidad.userinterfaces.UsuarioPage.*;
import static udea.calidad.userinterfaces.UsuarioPage.BUTTON_SIMULAR;
//prueba final
public class SimulationBancolombia implements Interaction {
    private static final int MIN_VALUE = 1000000;
    private static final int MAX_VALUE = 500000000;
    private static final int MIN_MONTHS = 48;
    private static final int MAX_MONTHS = 84;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(OPCION_SI));

        int valorAleatorio = generarValorAleatorio(MIN_VALUE, MAX_VALUE);
        int plazoAleatorio = generarValorAleatorio(MIN_MONTHS, MAX_MONTHS);

        actor.attemptsTo(Enter.theValue(String.valueOf(valorAleatorio)).into(TEXT_INPUT));
        actor.attemptsTo(Enter.theValue(String.valueOf(plazoAleatorio)).into(TEXT_INPUT1));
        actor.attemptsTo(Click.on(FECHA));
        actor.attemptsTo(Click.on(FECHA_ANNO));
        actor.attemptsTo(Click.on(FECHA_MES));
        actor.attemptsTo(Click.on(FECHA_DIA));
        actor.attemptsTo(Click.on(BUTTON_SIMULAR));
    }

    // La advertencia de seguridad puede ser ignorada en este caso
    private int generarValorAleatorio(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
    //pequeños cambios se necesitan revisar
    public static SimulationBancolombia infoGo() {
        return Tasks.instrumented(SimulationBancolombia.class);
    }
}


