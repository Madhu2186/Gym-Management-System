# 🏋️ Gym Management System

A console-based **Gym Management System** developed in **Java** that manages gym members, trainers, and workout session bookings. The system demonstrates Object-Oriented Programming concepts such as encapsulation, exception handling, collections, constructors, and package organization.

## 📌 Project Objective

The Gym Management System simulates the day-to-day operations of a gym by allowing:

- Member registration and validation
- Trainer availability checking
- Workout session booking
- Session cancellation
- Viewing member booking history

The project follows a layered architecture using packages for entities, services, utilities, and the main application.

---

## 📂 Project Structure

```
com.wipro.gms
│
├── entity
│   ├── Member.java
│   ├── Trainer.java
│   └── SessionBooking.java
│
├── service
│   └── GymService.java
│
├── util
│   ├── InvalidMemberException.java
│   ├── TrainerNotAvailableException.java
│   └── SessionException.java
│
└── main
    └── Main.java
```

---

## ✨ Features

- 👤 Member Management
  - Validate registered members
  - Track remaining membership sessions

- 🏋️ Trainer Management
  - Check trainer availability
  - Prevent trainer overbooking

- 📅 Session Booking
  - Book workout sessions
  - Generate unique booking IDs
  - Prevent duplicate bookings

- ❌ Session Cancellation
  - Cancel existing bookings
  - Restore member sessions
  - Update trainer availability

- 📋 Booking History
  - Display all sessions booked by a member

---

## 🛠 Technologies Used

- Java
- Eclipse IDE
- Java Collections (`ArrayList`)
- Object-Oriented Programming
- Exception Handling

---

## 📚 Concepts Used

- Classes & Objects
- Constructors
- Encapsulation
- Getters & Setters
- Packages
- Inheritance
- User Defined Exceptions
- ArrayList
- Exception Handling
- Method Overriding (`toString()`)

---

## ⚙️ Custom Exceptions

| Exception | Description |
|-----------|-------------|
| `InvalidMemberException` | Thrown when the member ID is invalid or membership is inactive. |
| `TrainerNotAvailableException` | Thrown when the trainer has reached maximum capacity or is unavailable. |
| `SessionException` | Thrown for duplicate bookings, invalid sessions, or session limit violations. |

---

## 🚀 Workflow

1. Load members, trainers, and existing bookings.
2. Validate the member.
3. Check trainer availability.
4. Create a new booking.
5. Update trainer capacity.
6. Deduct member's remaining sessions.
7. Store booking details.
8. Print booking history.
9. Cancel booking when required.

---

## 📷 Sample Output

```
Session Booked Successfully!

Booking ID: B1

--- Member Session History ---

Booking ID : B1
Trainer ID : T101
Trainer Name : Karan Patel
Session Date : 2025-01-12
Session Time : 10:00 AM

Session Cancelled Successfully!
```

---

## 🎯 Learning Outcomes

This project demonstrates practical implementation of:

- Java OOP Principles
- Collections Framework
- Custom Exception Handling
- Package Organization
- Business Logic Implementation
- Console-Based Application Development

