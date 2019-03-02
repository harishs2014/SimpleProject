package Stepdefinition;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Feature;

public class Hooks {
	public static String scenarioName;
	
	@Before
    public void beforeScenario(Scenario scenario){
		//this.scenario=scenario;
		scenarioName=scenario.getName();
        System.out.println("This will run before the every Scenario : "+scenarioName);
    }
 
	@After
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }
	  
}
