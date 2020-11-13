package taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaschenrechnerFinale {
	static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		boolean weiter = false;

		do {
			schreibeMenue();
			String auswahl = bufferedReader.readLine();

			if (auswahl.equals("+")) {
				addieren();
				
			} else if (auswahl.equals("-")) {
				minus();

			} else if (auswahl.equals("*")) {
				potenzieren();
			} else if (auswahl.equals("/")) {
				dividieren();

			} else if (auswahl.equals("p")) {
				pow();
			} else if (auswahl.equals("w")) {
				sqrt();
			}

			System.out.println();		
			System.out.println("Soll das Programm wiederholt werden?");
			String text = bufferedReader.readLine();
			if (text.equalsIgnoreCase("Ja")) {
				weiter = true;
			} else {
				weiter = false;
			}
		}while(weiter == true);
	}

	private static void schreibeMenue() {
		System.out.println("Folgende Rechenarten stehen zur Verf�gung:");
		System.out.println("[+] f�r Addition");
		System.out.println("[-] f�r Subtraktion");
		System.out.println("[*] f�r Multiplikation");
		System.out.println("[/] f�r Division");
		System.out.println("[p] f�r Potenzieren");
		System.out.println("[w] f�r Wuerzelziehen");
		System.out.println();
	}
	
	private static void addieren() throws NumberFormatException, IOException {
	System.out.print("Bitte geben Sie den ersten Summanden ein: ");
	double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
	System.out.print("Bitte geben Sie den zweiten Summanden ein: ");
	double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
	double summe = zahl1 + zahl2;
	System.out.println("Die Summe betr�gt " + summe);
	}
	
	private static void minus() throws NumberFormatException, IOException {
		System.out.print("Bitte geben Sie den Minuend ein: ");
		double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		System.out.print("Bitte geben Sie den Subtrahend ein: ");
		double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		double differenz = zahl1 - zahl2;
		System.out.println("Die Differenz betr�gt " + differenz);
	}
	private static void potenzieren() throws NumberFormatException, IOException {
		System.out.println("Bitte geben Sie die erste Zahl ein: ");
		double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		double multiplikation = zahl1*zahl2;
		System.out.println("Die Multiplikation betr�gt " + multiplikation);
	}
	private static void dividieren() throws NumberFormatException, IOException {
		System.out.println("Bitte geben Sie die erste Zahl ein: ");
		double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		double division = zahl1/zahl2;
		System.out.println("Die division betr�gt " + division);	
	}
	private static void sqrt() throws NumberFormatException, IOException {
		System.out.println(" Bitte Geben Sie die Zahl ein: ");
		double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		double wuerzel= Math.sqrt(zahl1);
		System.out.println("Die division betr�gt " + wuerzel);
	}
	private static void pow() throws NumberFormatException, IOException {
		System.out.println("Bitte geben Sie die erste Zahl ein: ");
		double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		System.out.print("Bitte geben Sie die zweite Zahl ein: ");
		double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
		double pot=Math.pow(zahl1,zahl2);
		System.out.println("Das Potenzieren betr�gt " + pot);
	}
}
	
	