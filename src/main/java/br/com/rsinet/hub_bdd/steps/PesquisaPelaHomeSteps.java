package br.com.rsinet.hub_bdd.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pages.PesquisaPelaHome;
import br.com.rsinet.hub_bdd.utils.DriverFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisaPelaHomeSteps {
	
	public static WebDriver driver;
	private PesquisaPelaHome pesquisaHome;

	@Dado("^que estou na pagina inicial$")
	public void que_estou_na_pagina_inicial() throws Throwable {
		driver = DriverFactory.createChrome();
	}
	
	@Quando("^clico no produto$")
	public void clico_no_produto() throws Throwable {
		pesquisaHome.clickTablet();
	}
	
	@Entao("^ele abre$")
	public void ele_abre() throws Throwable {
		Assert.assertTrue(driver.findElement(By.id("16")).isEnabled());
	}
	
	@Quando("^clico em um produto$")
	public void clico_em_um_produto() throws Throwable {
		
	}
	
	@Entao("^e aberto outro produto$")
	public void e_aberto_outro_produto() throws Throwable {	
		
	}
}
