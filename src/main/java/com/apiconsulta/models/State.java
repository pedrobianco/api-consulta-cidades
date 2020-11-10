package com.apiconsulta.models;

import java.io.Serializable;

public class State implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String state;
    
    public State() {
    	
    }
    
    public State(String state, Long number) {
		super();
		this.state = state;
		this.number = number;
	}
	private Long number;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

}