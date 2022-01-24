package com.kafka.consumer;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Employee {

	private String message = "";
    private int identifier = 0;
    private String name ="";
    public void PracticalAdvice(@JsonProperty("message") final String message,
    						@JsonProperty("name") final String name,
                           @JsonProperty("identifier") final int identifier) {
        this.message = message;
        this.identifier = identifier;
    }

    public String getMessage() {
        return message;
    }

    public int getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return "Employee::toString() {" +
                "message='" + message + '\'' +
                ", identifier=" + identifier +
                '}';
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}