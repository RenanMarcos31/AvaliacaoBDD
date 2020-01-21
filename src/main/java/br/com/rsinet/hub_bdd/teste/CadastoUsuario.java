package br.com.rsinet.hub_bdd.teste;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.Utils.DriverFactury;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastoUsuario {
	private WebDriver driver;

	@Dado("^que estou na pagina inicial$")
	public void que_estou_na_pagina_inicail() throws Throwable {
	    driver = DriverFactury.createChrome();
	    throw new PendingException();
	}

	@Quando("^clico no botao login$")
	public void clico_no_botao_login() throws Throwable {
		driver.findElement(By.id("menuUserSVGPath")).click();
	}

	@Quando("^clico no botao cadastro$")
	public void clico_no_botao_cadastro() throws Throwable {
		driver.findElement(By.linkText("CREATE NEW ACCOUNT"));
	    throw new PendingException();
	}

	@Quando("^preencho com meus dados$")
	public void preencho_com_meus_dados() throws Throwable {
	    throw new PendingException();
	}

	@Então("^cadastrado com sucesso$")
	public void cadastrado_com_sucesso() throws Throwable {
	    throw new PendingException();
	}

}
