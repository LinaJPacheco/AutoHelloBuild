package stepdefinitions;

import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.Verificar;
import questions.VerificarError;

public class ErrorSearchGoogleSteps {


    //Se reutiliza la busqueda exitosa y solo se implementa la question
    @Then("^Lina debe ver el mensaje (.*) ingresado con el aviso que no se encontro su busqueda$")
    public void linaDebeVerElMensajeHvwajbualfnvbsavaiovaIngresadoConElAvisoQueNoSeEncontroSuBusqueda(String frase) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarError.resultados(frase)));
    }



}
