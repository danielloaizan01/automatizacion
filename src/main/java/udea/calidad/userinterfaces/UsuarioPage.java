package udea.calidad.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UsuarioPage extends PageObject {
    public static final Target ANUNCIO = Target.the("ANUNCIO").locatedBy("//*[@id='closeModalBtn']/span");
    public static final Target BUTTON_CREDITOS = Target.the("BOTON CREDITOS").locatedBy("//*[@id='home-conoce-mas-productos']/div/div[2]/div[1]/div/div[2]/span/a");
    public static final Target BUTTON_BUSCAR_SIMULACION = Target.the("LINK PARA SIMULAR").locatedBy("//*[@id='creditos']/div/div[1]/div[11]/div/div[2]/div/a[1]");
    public static final Target BUTTON_CONTINUAR = Target.the("BOTON CONTINUAR").locatedBy("//*[@id='boton-seleccion-tarjeta']");

    public static final Target OPCION_SI = Target.the("OPCION SI").locatedBy("//*[@id='opcion-si']/label");

    public static final Target TEXT_INPUT = Target.the("INPUT DINERO A SIMULAR").locatedBy("//*[@id='valor-simulacion']");

    public static final Target TEXT_INPUT1 = Target.the("INPUT MESES SIMULACION").locatedBy("//*[@id='valor-plazo']");

    public static final Target FECHA = Target.the("INPUT FECHA").locatedBy("//*[@id='campo-fecha']");
    public static final Target FECHA_ANNO = Target.the("INPUT ANNO").locatedBy("//*[@id='mat-datepicker-0']/div/mat-multi-year-view/table/tbody/tr[3]/td[1]/div[1]");
    public static final Target FECHA_MES = Target.the("INPUT MES").locatedBy("//*[@id='mat-datepicker-0']/div/mat-year-view/table/tbody/tr[3]/td[2]/div[1]");
    public static final Target FECHA_DIA = Target.the("INPUT DIA").locatedBy("//*[@id='mat-datepicker-0']/div/mat-month-view/table/tbody/tr[3]/td[1]/div[1]");

    public static final Target BUTTON_SIMULAR = Target.the("BOTON SIMULAR").locatedBy("//*[@id='boton-simular']");

    public static final Target TEXT_VALIDATION = Target.the("TEXTO EN LA SIMULACION").locatedBy("//*[@id='layoutContainers']/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-resultado-simulacion/section[1]/span");

}