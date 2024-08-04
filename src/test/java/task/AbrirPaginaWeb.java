package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPaginaWeb implements Task {
    public static AbrirPaginaWeb paraComenzarEscenario(){
        return instrumented(AbrirPaginaWeb.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.banistmo.com/wps/portal/banistmo/personas")
        );
    }
}
