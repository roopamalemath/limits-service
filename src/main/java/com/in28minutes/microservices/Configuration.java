package com.in28minutes.microservices;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// anything starting from limits-service from application.properties configuration
@ConfigurationProperties("limits-service")
public class Configuration {
	
	// read the values
	//create the variable that match from application.properties
	private int minimum;
	private int maximum;
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	

}
