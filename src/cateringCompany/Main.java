package cateringCompany;

import java.util.EventObject;
import java.util.Scanner;

/**
 *
 * @author lauryn robson
 */
public class Main {
    // Global Variables
    static Scanner input = new Scanner(System.in);
    static int no_of_guests;
    static double total_price;
    static int price_per_guest = 35;
    static boolean large_event;
    static String event_ID;
    // Event object
    static Event eventObj = new Event();

    public static void main(String[] args) {

        // Calling Methods
        carlysMotto();
        guestAmount();
        eventNumber();
        eventPrice();

    }

    private static void eventPrice() {
        System.out.println("Number of guest is:\t\t" + eventObj.getGuests());
        System.out.println("Price per guest is:\t\t" + price_per_guest);
        System.out.println("Event ID is:\t\t\t" + eventObj.getEvent_number());
        // Calculates the price of the event
        total_price = eventObj.getGuests() * price_per_guest;
        System.out.println("Total price for the event is:\tt" + total_price);
        // Checks if the event is large
        large_event = no_of_guests >= 50;
        System.out.println("Is this event large?\t\t" + large_event);
    }

    private static void eventNumber() {
        input.nextLine();
        // Get the event ID
        System.out.print("Enter the event ID:\t\t");
        event_ID = input.nextLine();
        eventObj.setEvent_number(event_ID);
    }

    public static int guestAmount() {
        System.out.print("Number of guests:\t\t");
        no_of_guests = input.nextInt();
        eventObj.setGuests(no_of_guests);
        return no_of_guests;
    }

    public static void carlysMotto() {
        System.out.println("*************************************************");
        System.out.println("*\t\t\t\t\t\t*");
        System.out.println("* Carly's makes the food that makes it a party. *");
        System.out.println("*\t\t\t\t\t\t*");
        System.out.println("*************************************************");
    }

}
