package br.com.rsinet.hub_bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaginaDeCadastro {

	public void Register_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement txtUsuario;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement txtEmail;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement txtSenha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement txtbxConfirmaSenha;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement txtbxPrimeiroNome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement txtSobrenome;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement txtTelefone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement listPais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement txtCidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement txtEndereco;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement txtEstado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement txtCep;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement chekAceito;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btnRegistro;

	public void enterUsuario(String usuario) {
		txtUsuario.sendKeys(usuario);
	}

	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void enterSenha(String senha) {
		txtSenha.sendKeys(senha);
	}

	public void enterConfirmaSenha(String confirmaSenha) {
		txtbxConfirmaSenha.sendKeys(confirmaSenha);
	}

	public void enterPrimeiroNome(String primeiroNome) {
		txtbxPrimeiroNome.sendKeys(primeiroNome);
	}

	public void enterSobrenome(String sobrenome) {
		txtSobrenome.sendKeys(sobrenome);
	}

	public void enterTelefone(String telefone) {
		txtTelefone.sendKeys(telefone);
	}

	public void listaPais(String pais) {
		Select selectCountry = new Select(listPais);
		selectCountry.selectByVisibleText("Brazil");
	}

	public void enterCidade(String cidade) {
		txtCidade.sendKeys(cidade);
	}

	public void enterEndereco(String endereco) {
		txtEndereco.sendKeys(endereco);
	}

	public void enterEstado(String estado) {
		txtEstado.sendKeys(estado);
	}

	public void enterCep(String cep) {
		txtCep.sendKeys(cep);
	}

	public void clickAceito() {
		chekAceito.click();
	}

	public void clickBtnRegistro() {
		btnRegistro.click();
	}
	
	public void dadosPreenchido() {

		enterUsuario("Renan");
		enterEmail("renan@rsinet.com.br");
		enterSenha("renan123");
		enterConfirmaSenha("renan123");
		enterPrimeiroNome("Renan");
		enterSobrenome("Marcos");
		enterTelefone("(11) 921222324");
		listaPais("Brazil");
		enterCidade("São Paulo");
		enterEndereco("R. Litoral, 217");
		enterEstado("SP");
		enterCep("03582-190");

	}

}