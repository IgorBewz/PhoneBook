package common.menu;

import java.util.Scanner;

public class Menu {
    public static void callContact (String firstName, String lastName, long number) {
        System.out.println ("Calling" + firstName + " " + lastName);
    }
    public static void saveContact (String firstName, String lastName, long number) {
        System.out.println("Saving contact" + firstName+ " " + lastName + " "+ number);
    }
    public static void findNumber (String firstName, String lastName) {
        System.out. println("Could not find" + firstName +" " + lastName);
    }

    public static void menu() {

        Scanner in  = new Scanner(System.in);

        System.out.println ("Select the action that you want to perform:");
        System.out.println("1.Call Contact");
        System.out.println("2.Save Contact");
        System.out.println("3 Find Number");
        int choice = in.nextInt();
        in.nextLine();
        switch (choice){
            case 1:
                System.out.println("Enter the contact (First name Last name");

                break;
            case 2:
                break;
            case 3:
                break;

        }
    }

}