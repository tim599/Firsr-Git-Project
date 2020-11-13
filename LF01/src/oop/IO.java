package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {
	public static String readString() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String eingabe = br.readLine();
		return eingabe;


	}
	public static int readInteger() throws IOException {
		while (true) {
			try	{
				String eingabe = readString();
				int zahl = Integer.parseInt(eingabe);
				return zahl;
			}
			catch (NumberFormatException e) {
				System.out.print("Das ist keine Ganzzahl!! Wiederholen sie erneut");
			}

		}
	}
	public static double readDouble() throws IOException {
		while (true) {
			try	{
				String eingabe = readString();
				double zahl = Double.parseDouble(eingabe.trim().replace("," , "."));
				return zahl;
			}
			catch (NumberFormatException e) {
				System.out.print("Das ist keine Zahl!! Wiederholen sie erneut");
			}

		}
	}
	public static boolean readBoolean() throws IOException {

		while (true) {

			String eingabe = readString();
			if ((eingabe.equalsIgnoreCase("Ja"))|| (eingabe.equalsIgnoreCase("Yes"))
					||(eingabe.equalsIgnoreCase("j"))||(eingabe.equalsIgnoreCase("y"))) {
				return true ;
			}
			else if( eingabe.equalsIgnoreCase("n")||eingabe.equalsIgnoreCase("nein") ) {
				return false ;
			}
			System.out.println("Falsche Eingabe. Bitte wiederholen");
		}
		
	}


}