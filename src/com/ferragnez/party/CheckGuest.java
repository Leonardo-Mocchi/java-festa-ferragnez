package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        // to ask the user their name
        System.out.println("Please enter your name");
        Scanner input = new Scanner(System.in);
        String inputGuest = input.nextLine().toLowerCase();
        input.close();

        // apply correct formatting to the user input
        String[] nameSplitter = inputGuest.split("[\\s-]");
        String firstNameFormatted = nameSplitter[0].substring(0, 1).toUpperCase() + nameSplitter[0].substring(1);
        String lastNameFormatted = nameSplitter[1].substring(0, 1).toUpperCase() + nameSplitter[1].substring(1);

        String formattedInputGuest;
        if (firstNameFormatted.equals("J") && lastNameFormatted.equals("Ax")) {
            formattedInputGuest = "J-Ax";
        } else {
            formattedInputGuest = String.join(" ", firstNameFormatted, lastNameFormatted);
        }

        // Array of invited guests
        String[] invitedGuests = {
                "Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-Ax",
                "Francesco Totti",
                "Ilary Blasi",
                "Bebe Vio",
                "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"
        };

        // check if the user is in the guest list
        boolean inGuestList = false;

        for (int i = 0; !inGuestList && i < invitedGuests.length; i++) {
            if (formattedInputGuest.equals(invitedGuests[i])) {
                inGuestList = true;
                /* break; // either the break here or above "!inGuestList &&" only one is
                needed because they do the same thing */
            }
        }

        // bonus through the while loop
        /*
         int index = 0;
         while (!inGuestList && index < invitedGuests.length) {
         if (formattedInputGuest.equals(invitedGuests[index])) {
         inGuestList = true;
         }
         index++;
         }
         */

        // response message to the user
        if (inGuestList) {
            System.out.println("Welcome " + formattedInputGuest + " we have been expecting you. Enjoy the party!");
        } else {
            System.out.println("Sorry " + formattedInputGuest + ", but your name isn't on our list, please leave the premises");
        }
    }
}
