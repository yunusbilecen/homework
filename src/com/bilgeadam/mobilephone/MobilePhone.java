package com.bilgeadam.mobilephone;

import java.util.ArrayList;

public class MobilePhone {
	private String ownerName;
	private ArrayList<Contacts> contacts = new ArrayList<>();
	
	public MobilePhone(String ownerName) {
		this.ownerName = ownerName;
	}

	public void addContact(Contacts c) {
		if(contacts.contains(contacts)) {
			System.out.println("Kullanici zaten var");
		}else {
			contacts.add(c);
		}
	}
	
	public void modifyContact(int currentNumber, String newName, int newNumber) {
		for (Contacts contact : contacts) {
			if(contact.getPhoneNumber() == currentNumber) {
				contact.setName(newName);
				contact.setPhoneNumber(newNumber);
			}	
		}
	}
	
	public void removeContact(int contactNumber) {
		for (Contacts contact : contacts) {
			if(contact.getPhoneNumber() == contactNumber) {
				contacts.remove(contact);
			}	
		}
	}
	
	public boolean findContact(int contactNumber) {
		for (Contacts contact : contacts) {
			if(contact.getPhoneNumber() == contactNumber) {
				return true;
			}	
		}
		return false;
	}

	public void showContacts() {
		System.out.println("MobileP has " + contacts.size() +" contacts");
		for (Contacts c : contacts) {
			System.out.print(c.toString());
		}
	}
	
	

	
}
