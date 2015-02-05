package org.jboss.ddoyle.brms.facts;

import java.util.UUID;

public class SimpleFact {
	
	private String id;
	
	public SimpleFact() {
		this(UUID.randomUUID().toString());
	}
	
	public SimpleFact(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
