package br.com.rsinet.hub_bdd.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.pages.PaginaDeCadastro;


public class CadastroTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		
		PaginaDeCadastro start = PageFactory.initElements(driver, PaginaDeCadastro.class);
		
		start.botaoLogin.click(); 
		
		start.botaoCriarConta.sendKeys(Keys.ENTER);
		
		start.nomeUsuario.sendKeys("RenanMarcos31");
		
		start.email.sendKeys("renan.s@rsinet.com.br");
		
		start.senha.sendKeys("@Test123");
		
		start.comfirmaSenha.sendKeys("@Test123");
		
		start.primeiroNome.sendKeys("Renan");
		
		start.sobreNome.sendKeys("Silva");
		
		start.telefone.sendKeys("11 52908586");
		
		start.cidade.sendKeys("São Paulo");
		
		start.endereco.sendKeys("R. Doruo Litoral");
		
		start.cidade.sendKeys("SP");
		
		start.cep.sendKeys("03582180");
		
		start.botaoAceito.click();
		
		start.botaoCadastrar.click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
