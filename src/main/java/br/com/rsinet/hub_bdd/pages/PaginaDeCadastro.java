package br.com.rsinet.hub_bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaginaDeCadastro {
	
	final WebDriver driver;

	@FindBy(how = How.ID, using = "menuUser")
	public  WebElement botaoLogin;
	
	@FindBy(how = How.LINK_TEXT, using = "CREATE NEW ACCOUNT")
	public WebElement botaoCriarConta;
	
	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	public WebElement nomeUsuario;
	
	@FindBy(how = How.NAME, using = "emailRegisterPage")
	public WebElement email;
	
	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	public WebElement senha;
	
	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	public WebElement comfirmaSenha;
	
	@FindBy(how = How.NAME, using = "first_nameRegisterPag")
	public WebElement primeiroNome;
	
	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	public WebElement sobreNome;
	
	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	public WebElement telefone;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\\\"formCover\\\"]/div[3]/div[1]/sec-view[1]/div/select")
	public WebElement pais;
	
	@FindBy(how = How.NAME, using = "cityRegisterPage")
	public WebElement cidade;
	
	@FindBy(how = How.NAME, using = "addressRegisterPage")
	public WebElement endereco;
	 
	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	public WebElement estado;
	
	@FindBy(how = How.NAME, using = "postal_codeRegisterPage.sendKeys")
	public WebElement cep;
	
	@FindBy(how = How.NAME, using = "i_agree")
	public WebElement botaoAceito;
	
	@FindBy(how = How.ID, using = "register_btnundefined")
	public WebElement botaoCadastrar;

	public PaginaDeCadastro(WebDriver driver) {
		this.driver = driver;
	}
}
