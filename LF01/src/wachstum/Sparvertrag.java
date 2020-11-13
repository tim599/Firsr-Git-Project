package wachstum;

import java.io.IOException;

import oop.IO;

public class Sparvertrag {

	public static void main(String[] args) throws IOException {
		do {
			System.out.print("Bitte Kapital eingeben: ");
			double kapital = IO.readDouble();
			System.out.print("Bitte den Zinssatz eingeben: ");
			double zinsen = IO.readDouble();
			System.out.print("Bitte die Laufzeit in Jahren eingeben: ");
			int laufzeit = IO.readInteger();
			
			System.out.println("Jahr\t"+"Anfangskapital\t"+"Zinsbetrag\t"+"Jahresendbetrag\t");
			
			for(int i=1;i<=laufzeit;i++) {
				double ergebnis1 = kapital/100*zinsen;
				double ergebnis2 = ergebnis1+kapital;
				double value1 = Math.round(ergebnis1*100);
				value1 = value1/100;
				double value2 = Math.round(ergebnis2*100);
				value2 = value2/100;
				
				kapital = value2;
				
				System.out.println(i+"\t"+kapital+"\t\t"+value1+"\t\t"+value2);
			}
		
			System.out.println("Neue Berechnung?");
		} while (IO.readBoolean());

	}

}
