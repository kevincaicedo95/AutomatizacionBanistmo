package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class InteracionesPaginaBanistmo {
    public static final Target BOTON_ENTENDIDO = Target.the("boton entendido").locatedBy("//*[@id=\"btn-aceptar-cookies\"]");
    public static final Target BOTON_PRODUCTOS_SERVICIOS = Target.the("boton productos y servicios").locatedBy("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/a");
    public static final Target BOTON_PRESTAMOS = Target.the("boton prestamos").locatedBy("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/ul/li/div[1]/div[1]/ul/li[4]/a");
    public static final Target BOTON_PRESTAMOS_AUTO = Target.the("boton prestamos auto").locatedBy("//*[@id=\"none\"]/div/div/div[2]/div[3]/div/div[1]");
    public static final Target BOTON_AUTOMOVILES_REGULARES = Target.the("boton agregar tiempo").locatedBy("//*[@id=\"none\"]/div/div/div[2]/div[1]/div/div[1]");
    public static final Target BOTON_TASAS_TARIFAS = Target.the("boton tasas y tarifas").locatedBy("//*[@id=\"filialTabs\"]/li[4]/a");
    public static final Target BOTON_PDF = Target.the("boton descargar pdf").locatedBy("//*[@id=\"tab4\"]/table/tbody/tr[2]/td[2]/a/img");
}
