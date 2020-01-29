package br.com.rsinet.hub_bdd.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PesquisaPelaHome {

	WebDriver driver;

	public PesquisaPelaHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "details_16")
	private WebElement btnTablet;
	
	public void clickTablet() {
		btnTablet.click();
	}
	
	@FindBy(how = How.ID, using = "16")
	private WebElement tabletHP;
	
	public void clickProduto() {
		tabletHP.click();
	}

	//busca categoria pela tela principal com Erro
	
	@FindBy(how = How.ID, using = "//*[@id=\"details_10\"]")
	private WebElement Elitebook;
	
	public void clickDetalhe() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Elitebook);
		
	}
	
}

