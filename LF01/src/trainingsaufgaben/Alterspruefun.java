package trainingsaufgaben;


import java.io.IOException;


import oop.IO;

public class Alterspruefun {

	public static void main(String[] args) throws NumberFormatException,IOException { 


		System.out.println("Wie Alt sind Sie ?");
		String eingabe = IO.readString();
		int alter = Integer.parseInt(eingabe);

		if (alter>=18) {
			System.out.println("Du bist schon vollj�hrig");
		}
		else if (alter<18) {
			System.out.println("Du bist noch minderj�hrig");
		}
		else { System.out.println("ung�ltige Eingabe");

		}

	}
}

