package com.company;

import java.util.ArrayList;

/**
 * Created by Anton Ilchenko on 09.07.2017.
 */
public class MobilePhone {

    private ArrayList<Contacts> contactsBook = new ArrayList<Contacts>();

    public void addContact(Contacts contact) {

        if (!findeContactObjName(contact.getName()).getName().equals(contact.getName())) {
            contactsBook.add(contact);
        } else
            System.out.println("Contact \"" + contact.getName() + "\" already exist.");
    }

    public String findeContactByName(String name) {
        for (int i = 0; i < contactsBook.size(); i++) {
            if (contactsBook.get(i).getName().equals(name)) {
                return contactsBook.get(i).toString();
            }
        }
        return "Contact with name \"" + name + "\" not found.";
    }

    private int findeContactPosName(String name) {
        for (int i = 0; i < contactsBook.size(); i++) {
            if (contactsBook.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    private Contacts findeContactObjName(String name) {
        for (int i = 0; i < contactsBook.size(); i++) {
            if (contactsBook.get(i).getName().equals(name)) {
                return contactsBook.get(i);
            }
        }
        return new Contacts("null", 0);
    }

    public void editContact(String name, String newName, int newNumber) {
        if (findeContactPosName(name) >= 0) {
            contactsBook.set(findeContactPosName(name), new Contacts(newName, newNumber));
        }
    }

    public void listAllContacts() {
        for (int i = 0; i < contactsBook.size(); i++) {
            System.out.println(contactsBook.get(i).toString());
        }
    }

    public void removeContact(String name) {
        int position = findeContactPosName(name);
        if (position >= 0) {
            removeContact(position);
        }
    }

    private void removeContact(int position) {
        contactsBook.remove(position);
        System.out.println("Contact have been removed.");

    }

}
