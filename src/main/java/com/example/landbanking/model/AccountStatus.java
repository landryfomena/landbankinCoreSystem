package com.example.landbanking.model;

public enum AccountStatus {

	BLOCKED("BLOCKED"),
	ACTIV("ACTIV"),
	AWAITING("AWAITING");
	
	private String statut;
	
	private AccountStatus(String statut) {
		this.statut = statut;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String name) {
		this.statut = name;
	}
}
