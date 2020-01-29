package br.com.rsinet.hub_bdd.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PesquisaPelaLupa {

	WebDriver driver;

	public PesquisaPelaLupa(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement lupa;

	public void clickLupa() {
		lupa.click();
	}
	
	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement barraDePesquisa;

	public void entrarAutoComplete(String autoComplete) {
		barraDePesquisa.sendKeys(autoComplete + Keys.ENTER);	
	}
	
	@FindBy(how = How.ID, using = "16")
	private WebElement tablet;
	
	public void clickProduto() {
		tablet.click();
	}
	
	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement barraDePesquisaFalha;
	
	public void entraAutocompleteFalha(String autoCompleFalha) {
		barraDePesquisaFalha.sendKeys(autoCompleFalha + Keys.ENTER);
	}

	public void produto() {
		
		entrarAutoComplete("HP ELITEPAD 1000 G2 TABLET");
	}
	
	public void produtFalha() {
		entraAutocompleteFalha("TABLET SANSUNG");
	}
}

