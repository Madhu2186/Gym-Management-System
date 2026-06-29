package com.wipro.gms.util;

public class TrainerNotAvailableException extends Exception{
	public String tostring() {
		return "Unable to book session. The selected trainer is currently unavailable.";
	}
}

