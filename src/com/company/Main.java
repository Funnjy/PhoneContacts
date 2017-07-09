package com.company;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        int command = 0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your command: ");
            command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addNewContact();
                    break;
                case 2:
                    modifyContact();
                    break;
                case 3:
                    removeContact();
                    break;
                case 4:
                    findContact();
                    break;
                case 5:
                    printContacts();
                    break;

                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void addNewContact() {
        System.out.println("Enter name: ");
        String contactName = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String contactNumber = scanner.nextLine();
        phone.addContact(new Contacts(contactName, Integer.parseInt(contactNumber)));
    }

    public static void findContact(){
        System.out.println("Enter name: ");
        String contactName = scanner.nextLine();
        System.out.println(phone.findeContactByName(contactName));
    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print instructions.");
        System.out.println("\t 1 - To add new contact.");
        System.out.println("\t 2 - To update existing contact.");
        System.out.println("\t 3 - To remove contact.");
        System.out.println("\t 4 - To find contact.");
        System.out.println("\t 5 - To list all contacts.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void printContacts() {
        phone.listAllContacts();
    }

    public static void modifyContact() {
        System.out.println("Current contact name: ");
        String contactName = scanner.nextLine();
        System.out.println("Enter new name: ");
        String newContactName = scanner.nextLine();
        System.out.println("Enter new number: ");
        String newContactNumber = scanner.nextLine();
        phone.editContact(contactName, newContactName, Integer.parseInt(newContactNumber));
    }

    public static void removeContact() {
        System.out.println("Enter contact's name: ");
        String contactsName = scanner.nextLine();
        phone.removeContact(contactsName);
    }

}
