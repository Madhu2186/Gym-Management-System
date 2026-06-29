package com.wipro.gms.entity;

public class Trainer {
	private String trainerId;
	private String trainerName;
	private String specialization;
	private int maxClientPerSession;
	private int currentClients;
	
	public Trainer(String trainerId,
            String trainerName,
            String specialization,
            int maxClientPerSession,
            int currentClients) {

	this.trainerId = trainerId;
    this.trainerName = trainerName;
    this.specialization = specialization;
    this.maxClientPerSession = maxClientPerSession;
    this.currentClients = currentClients;
    }
	
	public String gettrainerId() {
		return trainerId;
	}
	public void settrainerId(String trainerId) {
		this.trainerId=trainerId;
	}
	
	
	public String gettrainerName() {
		return trainerName;
	}
	public void settrainerName(String trainerName) {
		this.trainerName=trainerName;
	}
	
	public String getspecialization() {
		return specialization;
	}
	public void setspecialization(String specialization) {
		this.specialization=specialization;
	}
	
	
	public int getmaxClientPerSession() {
		return maxClientPerSession;
	}
	public void setmaxClientPerSession(int maxClientPerSession) {
		this.maxClientPerSession=maxClientPerSession;
	}
	
	public int getcurrentClients() {
		return currentClients;
	}
	public void setcurrentClients(int currentClients) {
		this.currentClients=currentClients;
	}
	
	

}
