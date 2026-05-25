# project-2-trust-management-system-java
A modular Java console application implementing OOP principles, encapsulation, collections, and member/payment management functionalities.
# Trust Management System | Java

A console-based Java application developed using Object-Oriented Programming (OOP) principles to manage trust/community members, payment records, member updates, and collection reports.

---

## Features

✅ Add New Member  
✅ Remove Existing Member  
✅ Search Member by ID  
✅ Update Member Information  
✅ Payment Management System  
✅ Paid Members Report  
✅ Unpaid Members Report  
✅ Display All Members  
✅ Total Amount Collection Calculation  
✅ Total Paid Members Count  
✅ Total Unpaid Members Count  
✅ Duplicate ID Validation

---

## Technologies Used

- Java
- OOP (Object-Oriented Programming)
- Java Collections Framework
- ArrayList
- Iterator
- Encapsulation
- Constructor Injection
- LocalDate API
- Scanner Class

---

## Project Structure

```text
TrustManagementSystem
│
├── Member.java
│     → Stores member information
│
├── MemberService.java
│     → Contains all business logic and operations
│
└── TrustManagementSystem.java
      → Main class containing menu-driven system
```

---

## Functionalities

### 1. Add Member
Allows users to add a new member.

Validations:
- Duplicate IDs are not allowed.

### 2. Remove Member
Removes a member using their ID.

Implementation:
- Uses Iterator to safely remove elements from ArrayList.
- Prevents ConcurrentModificationException.

### 3. Amount To Pay
Calculates payment amount based on member ID range.

Rules:

| ID Range | Amount |
|----------|---------|
| <=1000 | 1000 |
| <=1200 | 850 |
| >1200 | 500 |

Also:
- Marks payment status as paid.
- Stores payment date using LocalDate.

### 4. Search Member
Searches member details using Member ID.

### 5. Update Member
Updates member name using ID.

### 6. Reports
Displays:
- Paid Members
- Unpaid Members
- Total Amount Collected
- Total Paid Members
- Total Unpaid Members

---

## Concepts Practiced

This project helped me practice:

- Class Design
- Encapsulation
- Getters and Setters
- Service Layer Design
- Constructor Usage
- Java Collections
- Iterator Usage
- Modular Programming
- Menu Driven Systems
- Basic Software Architecture

---

## Sample Menu

```text
Welcome To our Trust

1. Add Member
2. Remove Member
3. Amount To Pay
4. Starting Day To Pay
5. Last Day To Pay
6. List Of Paid Members
7. List Of Unpaid Members
8. Display All Members
9. Search Member By ID
10. Update Member
11. Total Amount Created
12. Total Paid Members
13. Total Unpaid Members
14. Exit
```

---

## Future Improvements

Planned upgrades:

- File Handling
- Exception Handling
- MySQL Database Integration (JDBC)
- Login/Admin Authentication
- GUI Version
- Spring Boot Backend Version

---

## Learning Outcome

This project strengthened my understanding of:

- Java fundamentals
- OOP concepts
- Clean code organization
- Data management using collections
- Real-world problem solving through programming

---

## Author

**Aayush Limbadya**

Engineering Student | AIML  
Currently learning Java, DBMS, Data Structures, and Backend Development.
