package com.pluralsight;
import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter pickup date: ");
        String pickupDate = myscanner.nextLine();
        System.out.print("Enter number of days: ");
        int days = myscanner.nextInt();
        myscanner.nextLine();
        System.out.print("Do you want a electric toll tag? (yes/no): ");
        String tollTag = myscanner.nextLine();
        System.out.print("Do you want a GPS?(yes/no): ");
        String gps = myscanner.nextLine();
        System.out.print("Do you want roadside assistance?(yes/no): ");
        String roadside = myscanner.nextLine();
        System.out.print("Enter your age: ");
        int age = myscanner.nextInt();

        double basicRental = 29.99 * days;
        double optionPerDay = 0;
        if (tollTag.equals("yes")) {
            optionPerDay = optionPerDay + 3.95;
        }
        if (gps.equals("yes")) {
            optionPerDay = optionPerDay + 2.95;
        }
        if (roadside.equals("yes")) {
            optionPerDay = optionPerDay + 3.95;
        }

        double optionCost = optionPerDay * days;

        double surcharge = 0;
        if (age < 25) {
            surcharge = basicRental * 0.30;
        }
            double totalCost = basicRental + optionCost + surcharge;
            System.out.printf("Basic car rental: $%.2f%n", basicRental);
            System.out.printf("Options cost: $%.2f%n", optionCost);
            System.out.printf("Underage driver surcharge: $%.2f%n", surcharge);
            System.out.printf("Total cost: $%.2f%n", totalCost);

    }
}