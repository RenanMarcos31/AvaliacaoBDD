package br.com.rsinet.hub_bdd.steps;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "feature",
			glue = { "br.com.rsinet.hub_bdd.steps" },plugin = { "pretty",
			"html: report/relatorio.html" })
			
	public class TestRunner {
}
