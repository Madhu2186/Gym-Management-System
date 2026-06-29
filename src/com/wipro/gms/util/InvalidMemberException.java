package com.wipro.gms.util;

public class InvalidMemberException extends Exception{
	public String tostring(){
		return  "Member verification failed. Booking cannot be processed.";
	}
}

