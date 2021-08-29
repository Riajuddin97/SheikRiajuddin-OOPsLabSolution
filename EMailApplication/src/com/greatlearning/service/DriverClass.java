package com.greatlearning.service;

import java.util.Scanner;

import com.greatlearning.model.Employee;

public class DriverClass {

	public static void main(String[] args) {

		Employee obj = new Employee("Riyaz", "Sheik");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		char[] generatedPassword;

		System.out.println("Please enter the department from the following:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);

		int option = sc.nextInt();

		if (option == 1) {
			generatedEmail = cs.generateEmailAddress(obj.getFirstName().toLowerCase(),
					obj.getLastName().toLowerCase(), "technical");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(obj, generatedEmail, generatedPassword);
		}

		if (option == 2) {
			generatedEmail = cs.generateEmailAddress(obj.getFirstName().toLowerCase(), obj.getLastName().toLowerCase(),
					"admin");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(obj, generatedEmail, generatedPassword);
		}

		if (option == 3) {
			generatedEmail = cs.generateEmailAddress(obj.getFirstName().toLowerCase(), obj.getLastName().toLowerCase(),
					"HR");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(obj, generatedEmail, generatedPassword);
		}
		if (option == 4) {
			generatedEmail = cs.generateEmailAddress(obj.getFirstName().toLowerCase(), obj.getLastName().toLowerCase(),
					"legal");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(obj, generatedEmail, generatedPassword);
		}
		
		sc.close();
	}
}