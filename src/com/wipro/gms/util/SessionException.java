package com.wipro.gms.util;

public class SessionException extends Exception{
	public String toString() {
		return "Unable to book session due to an invalid session request.";
	}

}

