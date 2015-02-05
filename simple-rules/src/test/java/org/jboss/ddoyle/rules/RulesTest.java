package org.jboss.ddoyle.rules;

import static org.junit.Assert.*;

import org.jboss.ddoyle.brms.facts.SimpleFact;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RulesTest {

	private static KieContainer kieContainer;
	
	@BeforeClass
	public static void setup() {
		KieServices kieServices = KieServices.Factory.get();
		kieContainer = kieServices.newKieClasspathContainer();
	}
	
	
	@Test
	public void test() {
		KieSession kieSession = kieContainer.newKieSession();
		RulesFiredListener rulesFiredListener = new RulesFiredListener();
		kieSession.addEventListener(rulesFiredListener);
		kieSession.insert(new SimpleFact("1"));
		kieSession.fireAllRules();
		
		assertEquals("One rule should have fired.", 1, 1); 
	}

}
