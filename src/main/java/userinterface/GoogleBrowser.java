package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleBrowser extends PageObject {
    public static final Target BARRA_BUSQUEDA = Target.the("Barra de busqueda para ingresar la palabra a buscar")
            .located(By.className("gLFyf"));
    public static final Target BOTON_BUSCAR = Target.the("Boton para ingresar a la busqueda de la palabra")
            .located(By.className("gNO89b"));
}
