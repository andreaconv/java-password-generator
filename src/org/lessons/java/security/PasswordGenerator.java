package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		//nome
		System.out.print("insierire il proprio nome");
		String name = sc.nextLine();
		
		//cognome
		System.out.print("insierire il proprio cognome");
		String lastname = sc.nextLine();
		
		//colore
		System.out.print("insierire il proprio colore preferito");
		String color = sc.nextLine();
		
		//data di nascita
		//giorno
		System.out.print("insierire il proprio giorno di nascita a numero");
		int day = sc.nextInt();
		//mese
		System.out.print("insierire il proprio mese di nascita a numero");
		int month = sc.nextInt();
		//anno
		System.out.print("insierire il proprio anno di nascita a numero");
		int year = sc.nextInt();
		
		
		System.out.print("la tua psw è:" + name + "-" + lastname + "-" + color + "-" + day + "-" + month + "-" + year);
	}
}
