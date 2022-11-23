package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.GoogleResults;

public class VerificarError implements Question<Boolean> {

    private String resultado;

    public VerificarError(String resultado) {
        this.resultado = resultado;
    }

    public static VerificarError resultados(String resultado) {
        return new VerificarError(resultado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean respuesta;
        String resultadoBusqueda = Text.of(GoogleResults.RESULTADO_ERROR).viewedBy(actor).asString();

        if(resultado.equals(resultadoBusqueda)){
            respuesta = true;
        }
        else {
            respuesta = false;
        }
        return respuesta;
    }
}
