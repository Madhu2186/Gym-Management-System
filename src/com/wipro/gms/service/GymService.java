package com.wipro.gms.service;
import java.util.ArrayList;
import com.wipro.gms.entity.*;
import com.wipro.gms.util.*;
public class GymService {
	private ArrayList<Member> members;
	private ArrayList<Trainer> trainers;
	private ArrayList<SessionBooking>sessionbookings;

	public GymService(ArrayList<Member>members,ArrayList<Trainer>trainers,ArrayList<SessionBooking>sessionbookings) {
		this.members=members;
		this.trainers=trainers;
		this.sessionbookings=sessionbookings;
		
	}

public boolean validateMember(String memberId) throws InvalidMemberException {
	for(Member mem:members) {
		if(mem.getmemberId().equals(memberId)) {
			if (mem.getremainingSession()>0) {
				return true;
			}
		}
		}throw new InvalidMemberException();
	}

public boolean checkTrainerAvailability(String trainerId) throws TrainerNotAvailableException {
	for (Trainer trai:trainers) {
		if(trai.gettrainerId().equals(trainerId)) {
			if(trai.getcurrentClients()<trai.getmaxClientPerSession()) {
				return true;
			}
		}
	}
	throw new TrainerNotAvailableException();
  }
public SessionBooking bookSession(String memberId, String trainerId, String date, String time) throws Exception {

    validateMember(memberId);

    checkTrainerAvailability(trainerId);

    for (SessionBooking booking : sessionbookings) {

        if (booking.getmemberId().equals(memberId)
                && booking.gettrainerId().equals(trainerId)
                && booking.getsessionDate().equals(date)
                && booking.getsessionTime().equals(time)) {

            throw new SessionException();
        }
    }

    Member member = null;
    Trainer trainer = null;

    for (Member mem : members) {
        if (mem.getmemberId().equals(memberId)) {
            member = mem;
            break;
        }
    }

    for (Trainer trai : trainers) {
        if (trai.gettrainerId().equals(trainerId)) {
            trainer = trai;
            break;
        }
    }

    if (member.getremainingSession() <= 0) {
        throw new SessionException();
    }

    String bookingId = "B" + (sessionbookings.size() + 1);

    trainer.setcurrentClients(trainer.getcurrentClients() + 1);

    member.setremainingSession(member.getremainingSession() - 1);

    SessionBooking booking = new SessionBooking();

    booking.setbookingId(bookingId);
    booking.setmemberId(memberId);
    booking.settrainerId(trainerId);
    booking.setsessionDate(date);
    booking.setsessionTime(time);

    sessionbookings.add(booking);

    return booking;
}
public boolean cancelSession(String bookingId)throws SessionException{
	    SessionBooking booking = null;
	    
	    for (SessionBooking sb : sessionbookings) {

	        if (sb.getbookinId().equals(bookingId)) {
	            booking = sb;
	            break;
	        }
	    }

	    if (booking == null) {
	        throw new SessionException();
	    }

	    for (Member mem : members) {

	        if (mem.getmemberId().equals(booking.getmemberId())) {

	            mem.setremainingSession(mem.getremainingSession() + 1);
	            break;
	        }
	    }

	    for (Trainer trai : trainers) {

	        if (trai.gettrainerId().equals(booking.gettrainerId())) {

	            trai.setcurrentClients(trai.getcurrentClients() - 1);
	            break;
	        }
	    }

	    sessionbookings.remove(booking);

	    return true;
	
	}
public void printMemberSessions(String memberId) {

    for (SessionBooking booking : sessionbookings) {

        if (booking.getmemberId().equals(memberId)) {

            String trainerName = "";
            String specialization = "";

            for (Trainer trainer : trainers) {

                if (trainer.gettrainerId().equals(booking.gettrainerId())) {

                    trainerName = trainer.gettrainerName();
                    specialization = trainer.getspecialization();
                    break;
                }
            }

            System.out.println("Booking ID      : " + booking.getbookinId());
            System.out.println("Trainer ID      : " + booking.gettrainerId());
            System.out.println("Trainer Name    : " + trainerName);
            System.out.println("Specialization  : " + specialization);
            System.out.println("Session Date    : " + booking.getsessionDate());
            System.out.println("Session Time    : " + booking.getsessionTime());
        }
    }
}
}


