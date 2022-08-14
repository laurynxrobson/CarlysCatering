package cateringCompany;

public class Event {
   // Declaring fields
   public final static double price_per_guest = 35;
   public final static int guest_limit = 50;
   private String event_number;
   private int guests;
   private double price;

   // Getters and Setters
   public String getEvent_number() {
      return this.event_number;
   }

   public void setEvent_number(String event_number) {
      this.event_number = event_number;
   }

   public int getGuests() {
      return this.guests;
   }

   public void setGuests(int guests) {
      this.guests = guests;
   }

   public double getPrice() {
      return this.price;
   }

   public Event(String event_number, int guests) {
      this.event_number = event_number;
      this.guests = guests;
   }

   public Event(int guests) {
      this.event_number = "A000";
      this.guests = guests;
   }

}
