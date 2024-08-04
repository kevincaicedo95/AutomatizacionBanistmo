package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.AbrirPaginaWeb;
import task.NavegarAPDF;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class PdfProhibiciones {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("kevin");
    }

    @Dado("que el usuario esta en la pagina principal de personas")
    public void queElUsuarioEstaEnLaPaginaPrincipalDePersonas() {
        theActorCalled("kevin").attemptsTo(AbrirPaginaWeb.paraComenzarEscenario());
    }
    @Cuando("el usuario navega hasta tasas y tarifas")
    public void elUsuarioNavegaHastaTasasYTarifas() {
        theActorCalled("kevin").attemptsTo(NavegarAPDF.paraDescargar());
    }
    @Entonces("valido que se pueda descargar correctamente el pdf de prohibiciones")
    public void validoQueSePuedaDescargarCorrectamenteElPdfDeProhibiciones() {

    }

}
