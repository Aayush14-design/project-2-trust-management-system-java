import java.time.*;
import java.util.*;

 class Member {
     private String name;
     final int id;
     private double amount;
     private boolean payment;
     private LocalDate d1;
    Member(String name, int id) {
        this.name = name;
        this.id = id;
    }
     @Override
     public String toString() {
         return "Member{" +
                 "name='" + name + '\'' +
                 ", id=" + id +
                 ", amount=" + amount +
                 ", payment=" + payment +
                 ", d1=" + d1 +
                 '}';
     }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isPayment() {
        return payment;
    }

     public LocalDate getD1() {
         return d1;
     }

     public void setPayment(boolean payment) {
         this.payment = payment;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setAmount(double amount) {
         this.amount = amount;
     }

     public void setD1(LocalDate d1) {
         this.d1 = d1;
     }
 }
