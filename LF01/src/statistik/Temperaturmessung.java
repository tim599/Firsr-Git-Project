package statistik;

import java.io.IOException;

import oop.IO;

public class Temperaturmessung {

	public static void main(String[] args) throws IOException {
		System.out.print("Bitte geben Sie die Temperatur an Tag 1 ein:");
		double tag1 = IO.readDouble();
		System.out.print("Bitte geben Sie die Temperatur an Tag 2 ein:");
		double tag2 = IO.readDouble();
		System.out.print("Bitte geben Sie die Temperatur an Tag 3 ein:");
		double tag3 = IO.readDouble();
		System.out.print("Bitte geben Sie die Temperatur an Tag 4 ein:");
		double tag4 = IO.readDouble();
		System.out.print("Bitte geben Sie die Temperatur an Tag 5 ein:");
		double tag5 = IO.readDouble();
		System.out.print("Bitte geben Sie die Temperatur an Tag 6 ein:");
		double tag6 = IO.readDouble();
		System.out.print("Bitte geben Sie die Temperatur an Tag 7 ein:");
		double tag7 = IO.readDouble();
		
		double mittelwert = (tag1+tag2+tag3+tag4+tag5+tag6+tag7)/7;
	    double maximal1 = Math.max(tag1, tag2);
	    double maximal2 = Math.max(tag3, tag4);
	    double maximal3 = Math.max(tag5, tag6);
	    double maximal4 = Math.max(maximal1, maximal2);
	    double maximal5 = Math.max(maximal3, maximal4);
	    double maximal6 = Math.max(maximal5, maximal4);
	    double maximal10 = Math.max(tag7,maximal6);
	    System.out.println("Der Mittelwert beträgt: "+mittelwert);
	    System.out.println("Die maximale Temperatur beträgt: "+maximal10);
	}
}
