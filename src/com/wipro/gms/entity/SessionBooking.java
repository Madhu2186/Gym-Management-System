package com.wipro.gms.entity;

public class SessionBooking {
	private String bookingId;
	private String memberId;
	private String trainerId;
	private String sessionDate;
	private String sessionTime;
	
	
	public String getbookinId() {
		return bookingId;
	}
	public void setbookingId(String bookingId) {
		this.bookingId=bookingId;
	}
	
	
	public String getmemberId() {
		return memberId;
	}
	public void setmemberId(String memberId) {
		this.memberId=memberId;
	}
	
	
	public String gettrainerId() {
		return trainerId;
	}
	public void settrainerId(String trainerId) {
		this.trainerId=trainerId;
	}
	
	
	public String getsessionDate() {
		return sessionDate;
	}
	public void setsessionDate(String sessionDate) {
		this.sessionDate=sessionDate;
	}
	
	
	public String getsessionTime() {
		return sessionTime;
	}
	public void setsessionTime(String sessionTime) {
		this.sessionTime=sessionTime;
	}

	
}



