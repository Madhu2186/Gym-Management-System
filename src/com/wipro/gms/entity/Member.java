package com.wipro.gms.entity;

public class Member {
	private String memberId;
	private String memberName;
	private String membershipPlan;
	private int remainingSession;
	
    public Member(String memberId, String memberName, String membershipPlan, int remainingSession) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.membershipPlan = membershipPlan;
        this.remainingSession = remainingSession;
    }
    
	public String getmemberId() {
		return memberId;
	}
	public void setmemberId(String memberId) {
		this.memberId=memberId;
	}
	
	
	public String getmemberName() {
		return memberName;
	}
	public void setmamberName(String memberName) {
		this.memberName=memberName;
	}
	
	
	public String getmembershipPlan() {
		return membershipPlan;
	}
	public void setmembershipPlan(String membershipPlan) {
		this.membershipPlan=membershipPlan;
	}
	
	
	public int getremainingSession() {
		return remainingSession;
	}
	public void setremainingSession(int remainingSession) {
		this.remainingSession=remainingSession;
	}
}



