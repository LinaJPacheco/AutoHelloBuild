package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.GoogleResults;


public class Verificar implements Question<Boolean> {

    private String resultado;

    public Verificar(String resultado) {
        this.resultado = resultado;
    }

    public static Verificar resultados(String resultado) {
        return new Verificar(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta;
        String resultadoBusqueda1 = Text.of(GoogleResults.RESULTADOS).viewedBy(actor).asString();

        if(resultado.equals(resultadoBusqueda1)){
            respuesta = true;
        }
        else {
            respuesta = false;
        }
        return respuesta;
    }
}
