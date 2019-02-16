package com.bilgeadam.mobilephone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MobilePhoneTest {
	public static Scanner scanner = new Scanner(System.in);
	public static MobilePhone moPhone = new MobilePhone("Yunus");

	public static void main(String[] args) {
		boolean flag = true;
		int choise = 0;
		printIntructions();
		while (flag) {
			choise = scanner.nextInt();
			switch (choise) {
			case 1:
				addContact();
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
				moPhone.showContacts();
				break;
			case 6:
				printIntructions();
				break;
			case 7:
				flag = false;
				break;
			}
		}
	}

	private static void findContact() throws InputMismatchException {
		System.out.println("Please contact phone number : ");

		int contactNumber = scanner.nextInt();
		String message = (moPhone.findContact(contactNumber)) ? "Mobile phone has that contact" : "Mobile phone do NOT have that contact";
		System.out.println(message);

	}

	private static void removeContact() throws InputMismatchException {
		System.out.println("Please contact phone number : ");
		int contactNumber = scanner.nextInt();
		moPhone.removeContact(contactNumber);

	}

	private static void modifyContact() throws InputMismatchException {
		System.out.println("Please current phone number :");
		int cNumber = scanner.nextInt();
		System.out.println("Please new name : ");
		String nName = scanner.nextLine();
		System.out.println("Please new number : ");
		int nNumber = 0;

		do {
			System.out.println("Please contact phone number : ");
			nNumber = scanner.nextInt();
		} while (moPhone.findContact(nNumber));

		moPhone.modifyContact(cNumber, nName, nNumber);
	}

	private static void addContact() throws InputMismatchException {
		int number = 0;
		System.out.println("Please contact name : ");
		String name = scanner.next();

		do {
			System.out.println("Please contact phone number : ");
			number = scanner.nextInt();

		} while (moPhone.findContact(number));

		moPhone.addContact(new Contacts(name, number));
	}

	public static void printIntructions() {
		String message = "Pleas choose : \n" 
				+ "\t1-Add Contact\n" 
				+ "\t2-Modify Contact\n" 
				+ "\t3-Remove Contact\n"
				+ "\t4-Find Contact\n" 
				+ "\t5-Show All Contacts\n" 
				+ "\t6-Print Instructions\n" 
				+ "\t7-Quit App";
		System.out.println(message);
	}
}
