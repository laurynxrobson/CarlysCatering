package carlyscatering;

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

    public static void main(String[] args) {
        // Calling Methods
        carlysMotto();
        guestAmount();
        eventPrice();
    }

    private static void eventPrice() {
        System.out.println("Number of guest is:\t" + no_of_guests);
        System.out.println("Price per guest is:\t" + price_per_guest);
        // Calculates the price of the event
        total_price = no_of_guests * price_per_guest;
        System.out.println("Total price for the event is:\t" + total_price);
        // Checks if the event is large
        large_event = no_of_guests >= 50;
        System.out.println("Is this event large?\t" + large_event);
    }

    public static int guestAmount() {
        System.out.print("Number of guests:\t");
        no_of_guests = input.nextInt();
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
