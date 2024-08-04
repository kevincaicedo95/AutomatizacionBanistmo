package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userInterface.InteracionesPaginaBanistmo.*;

public class NavegarAPDF implements Task {
    public static NavegarAPDF paraDescargar(){
        return instrumented(NavegarAPDF.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_ENTENDIDO),
                Click.on(BOTON_PRODUCTOS_SERVICIOS),
                Click.on(BOTON_PRESTAMOS),
                Click.on(BOTON_PRESTAMOS_AUTO),
                Click.on(BOTON_AUTOMOVILES_REGULARES),
                Click.on(BOTON_TASAS_TARIFAS),
                Click.on(BOTON_PDF),
                Switch.toNewWindow()
        );
    }
}
