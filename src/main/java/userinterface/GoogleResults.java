package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleResults extends PageObject {
    public static final Target RESULTADOS = Target.the("Cantidad de resultados y tiempo de respuesta para la frase")
            .located(By.xpath("//span[contains(text(), 'Cristiano Ronaldo')]"));
    public static final Target RESULTADO_ERROR = Target.the("Obtencion de mensaje de error en frase buscada")
            .located(By.xpath("//em[contains(text(), 'hvwajbualfnvbsavaiova')]"));

}
