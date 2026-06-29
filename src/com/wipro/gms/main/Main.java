package com.wipro.gms.main;
import java.util.ArrayList; 
import com.wipro.gms.entity.*; 
import com.wipro.gms.service.GymService; 
import com.wipro.gms.util.*;

public class Main {
	public static void main(String[] args) { 
		ArrayList<Member> members = new ArrayList<>(); 
		members.add(new Member("M001", "Rahul Sharma", "Standard", 5)); 
		members.add(new Member("M002", "Anita Verma", "Premium", 10)); 
		ArrayList<Trainer> trainers = new ArrayList<>(); 
		trainers.add(new Trainer("T101", "Karan Patel", "Strength Training", 3, 0)); 
		trainers.add(new Trainer("T102", "Meera Joshi", "Yoga", 2, 0)); 
		ArrayList<SessionBooking> sessions = new ArrayList<>(); 
		GymService service = new GymService(members, trainers, sessions); 
		try { 
			
		SessionBooking sb = service.bookSession("M001", "T101", "2025-01-12", "10:00 AM"); 
		System.out.println("Session Booked Successfully!"); 
		System.out.println("Booking ID: " + sb.getbookinId()); 
		System.out.println("\n--- Member Session History ---"); 
		service.printMemberSessions("M001"); 
		service.cancelSession(sb.getbookinId()); 
		System.out.println("\nSession Cancelled Successfully!"); 
		} 
		
		catch (InvalidMemberException ime) { 
		System.out.println(ime.toString()); 
		}
		
		catch (TrainerNotAvailableException tna) { 
		System.out.println(tna.toString()); 
		}
		
		catch (SessionException se) { 
		System.out.println(se.toString()); 
		} 
		
		catch (Exception ex) { 
		System.out.println("Unexpected Error: " + ex.toString()); 
		} 
		}

}
