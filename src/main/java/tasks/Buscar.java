package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import userinterface.GoogleBrowser;

public class Buscar implements Task {
    private String frase;

    public Buscar(String frase) {
        this.frase = frase;
    }

    public static Buscar enGoogle(String frase) {
        return Tasks.instrumented(Buscar.class, frase);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(GoogleBrowser.BARRA_BUSQUEDA),
                Enter.theValue(frase).into(GoogleBrowser.BARRA_BUSQUEDA),
                Click.on(GoogleBrowser.BOTON_BUSCAR)
                );

    }
}
