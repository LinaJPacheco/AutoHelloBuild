package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.mockito.stubbing.Answer;
import questions.Verificar;
import tasks.Abrir;
import tasks.Buscar;

public class SearchGoogleSetps {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que Lina quiere realizar una busqueda en google$")
    public void queLinaQuiereRealizarUnaBusquedaEnGoogle() throws Exception {
        OnStage.theActorCalled("Lina").wasAbleTo(Abrir.paginaGoogle());
    }

    @When("^Lina ingrese la frase (.*)$")
    public void linaIngreseLaFraseCristianoRonaldo(String frase) throws Exception {
       OnStage.theActorInTheSpotlight().attemptsTo(Buscar.enGoogle(frase));
    }

    @Then("^Lina debe ver los resultados de (.*) y el tiempo que tardo$")
    public void linaDebeVerLosResultadosDeCristianoRonaldoYElTiempoQueTardo(String frase) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultados(frase)));
    }



}

