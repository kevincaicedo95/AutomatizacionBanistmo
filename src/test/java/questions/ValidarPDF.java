package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.events.ActorPerforms;
import net.serenitybdd.screenplay.questions.ValueOf;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getDriver;

public class ValidarPDF implements Question<Boolean> {
    @Override
    public Boolean answeredBy (Actor actor){
        WebDriver driver = getDriver();
        String currentUrl = driver.getCurrentUrl();
        Boolean comparate;
        String namePDF="ProhibicionesSuperIntendenciaDeBancosSIB.pdf";
        if  (currentUrl.contains(namePDF)){
            comparate=true;
        }
        else {
            comparate = false;
        }
        return comparate;
    }

    public static ValidarPDF queSeaElDeProhibiciones() {return  new ValidarPDF();}
}
