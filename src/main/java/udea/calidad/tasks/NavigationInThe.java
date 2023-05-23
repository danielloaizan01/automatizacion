package udea.calidad.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import udea.calidad.interactions.BancolombiaNavigation;

public class NavigationInThe implements Task {

    private final PageObject page;
	//PRUEBAS
    public NavigationInThe(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(BancolombiaNavigation.go());
    }

    public static NavigationInThe browser(PageObject page){
        return Tasks.instrumented(NavigationInThe.class,page);
    }
}
