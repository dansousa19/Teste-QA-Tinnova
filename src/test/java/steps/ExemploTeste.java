package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Browsers;
import pages.HomePage;

public class ExemploTeste {
	
	Browsers browser = new Browsers();
	HomePage home = new HomePage();
	
	@Given("que entre no site da empresa {string}")
	public void que_entre_no_site_da_empresa(String site) {
		browser.abrirNavegador(site);
		}

	@Given("que clico em entrar")
	public void que_clico_em_entrar() throws InterruptedException {
	    home.menu("btnEntrar");
		}

	@Given("que clico em adicionar")
	public void que_clico_em_adicionar() throws InterruptedException {
	    home.menu("btnAdicionar");
		}

	@When("preencho o nome")
	public void preencho_o_nome() throws InterruptedException {
	    home.menu("btnName");
		}

	@When("preencho o email")
	public void preencho_o_email() throws InterruptedException {
	    home.menu("btnEmail");
		}

	@When("preencho o cpf")
	public void preencho_o_cpf() throws InterruptedException {
	    home.menu("btnCpf");
		}

	@When("preencho o telefone")
	public void preencho_o_telefone() throws InterruptedException {
	    home.menu("btnTelefone");
		}

	@Then("que clico em guardar")
	public void que_clico_em_guardar() throws InterruptedException {
	    home.menu("btnGuardar");
	}

}
