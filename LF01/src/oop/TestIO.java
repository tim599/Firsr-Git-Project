package oop;

import java.io.IOException;

public class TestIO {

	public static void main(String[] args) throws IOException {
		System.out.println("Wie ist deine Name?");
		String name = IO.readString() ;
		System.out.println("Moin " + name);
		System.out.println("Und wie Alt bist du?");
		int jahr = IO.readInteger();
		System.out.println(jahr + " Jahre Alt");
		System.out.println("Gewicht?");
		double gewicht = IO.readDouble();
		System.out.println(gewicht + " kg");
		System.out.println("Soll das Programm wiederholt werden?");
		System.out.println("Gef�llt es Dir in unserer Schule");
		boolean ok = IO.readBoolean();
		if (ok == true) {
			System.out.println("Das freut mich");
		} else if (ok == false) {
			System.out.println("Dascha bl���d");
		}

	}





}

