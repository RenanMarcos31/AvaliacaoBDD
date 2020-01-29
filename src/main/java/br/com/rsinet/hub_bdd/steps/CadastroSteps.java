package br.com.rsinet.hub_bdd.steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.pages.PaginaDeCadastro;
import br.com.rsinet.hub_bdd.pages.PaginaInicial;
import br.com.rsinet.hub_bdd.utils.DriverFactory;
import br.com.rsinet.hub_bdd.utils.Screenshoot;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastroSteps {
	WebDriver driver;
	PaginaInicial paginaInicial;
	PaginaDeCadastro paginaDeCadastro;
	
	@Dado("^que estou na pagina inicail$")
	public void que_estou_na_pagina_inicail() throws Throwable {
		driver = DriverFactory.createChrome();
		paginaInicial = PageFactory.initElements(driver, PaginaInicial.class);
		paginaDeCadastro = PageFactory.initElements(driver, PaginaDeCadastro.class);
	}

	@Quando("^clico no botao login$")
	public void clico_no_botao_login() throws Throwable {
		paginaInicial.clickLogin();
	}

	@Quando("^clico no botao cadastro$")
	public void clico_no_botao_cadastro() throws Throwable {
		paginaInicial.ClickNovoUsuario();
	}

	@Quando("^preecho meus dados$")
	public void preecho_meus_dados() throws Throwable {
		paginaDeCadastro.dadosPreenchido();
	}

	@Então("^cadastrado com sucesso$")
	public void cadastrado_com_sucesso() throws Throwable {
		Assert.assertTrue(driver.getPageSource().contains("https://www.advantageonlineshopping.com/#/"));
		Screenshoot.getScreenshot(driver);
	}

	@Então("^nao consigo registrar o usuario$")
	public void nao_consigo_registrar_o_usuario() throws Throwable {
		Assert.assertTrue(driver.getCurrentUrl().contains("/registro"));
		Screenshoot.getScreenshot(driver);
	}
	
	@After
	public void finalizando() {
		DriverFactory.fecharChrome();
	}
}