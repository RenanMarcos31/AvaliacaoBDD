package br.com.rsinet.hub_bdd.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.pages.PesquisaPelaLupa;
import br.com.rsinet.hub_bdd.utils.DriverFactory;
import br.com.rsinet.hub_bdd.utils.Screenshoot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisaPelaLupaSteps {

	public static WebDriver driver;
	private PesquisaPelaLupa pesquisaLupa;

	@Dado("^que estou na pagina inicial$")
	public void que_estou_na_pagina_inicial() throws Throwable {	
		driver = DriverFactory.createChrome();
	}

	@Quando("^clico na lupa$")
	public void clico_na_lupa() throws Throwable {
		pesquisaLupa = PageFactory.initElements(driver, PesquisaPelaLupa.class);
		pesquisaLupa.clickLupa();
	}

	@Quando("^pesquiso o produto$")
	public void pesquiso_o_produto() throws Throwable {
		pesquisaLupa.produto();
	}

	@Entao("^clico no produto$")
	public void clico_no_produto() throws Throwable {
		pesquisaLupa.clickProduto();
		Assert.assertTrue(driver.findElement(By.id("16")).isEnabled());
		Screenshoot.getScreenshot(driver);
	}

	@Quando("^clico novamente na lupa$")
	public void clico_novamente_na_lupa() throws Throwable {
		pesquisaLupa.clickLupa();
	}
	@Quando("^pesquiso o produto com falha$")
	public void pesquiso_o_produto_com_falha() throws Throwable {
	 pesquisaLupa.produtFalha();
	}
	
	@Entao("^o site me retorna produto nao cadastrado$")
	public void o_site_me_retorna_produto_nao_cadastrado() throws Throwable {
		Assert.assertTrue(driver.getPageSource().contains("No results for"));
		Screenshoot.getScreenshot(driver);
	}
}