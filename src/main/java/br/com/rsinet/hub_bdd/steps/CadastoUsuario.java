package br.com.rsinet.hub_bdd.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastoUsuario {
	public static WebDriver driver;

	@Dado("^que estou na pagina inicail$")
	public void que_estou_na_pagina_inicail() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
	}

	@Quando("^clico no botao login$")
	public void clico_no_botao_login() throws Throwable {
		driver.findElement(By.id("menuUser")).click();
	}

	@Quando("^clico no botao cadastro$")
	public void clico_no_botao_cadastro() throws Throwable {
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).sendKeys(Keys.ENTER);
	}

	@Quando("^preecho meus dados$")
	public void preecho_meus_dados() throws Throwable {
		driver.findElement(By.name("usernameRegisterPage"));
		driver.findElement(By.name("emailRegisterPage")).sendKeys("renan@rsinet.com.br");
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("@Test123");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input")).sendKeys("@Test123");
		driver.findElement(By.name("first_nameRegisterPage")).sendKeys("Renan");
		driver.findElement(By.name("last_nameRegisterPage")).sendKeys("Marcos");
		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys("11 951928586");
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select")));
		select.selectByVisibleText("Brazil");
		driver.findElement(By.name("cityRegisterPage")).sendKeys("São Paulo");
		driver.findElement(By.name("addressRegisterPage")).sendKeys("R. Douro Litoral, 220");
		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys("SP");
		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys("03582180");
		driver.findElement(By.name("i_agree")).click();
		driver.findElement(By.id("register_btnundefined")).click();
	}

	@Então("^cadastrado com sucesso$")
	public void cadastrado_com_sucesso() throws Throwable {
		Assert.assertTrue(driver.getPageSource().contains("https://www.advantageonlineshopping.com/#/"));
	}

	@Então("^cadastro com falha$")
	public void cadastro_com_falha() throws Throwable {
		Assert.assertTrue(driver.getCurrentUrl().contains("/registro"));
	}
}
