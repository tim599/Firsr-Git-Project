package matrizen;

import java.io.IOException;

import oop.IO;

public class TestIO {

	public static void main(String[] args) throws IOException {
		// Tabelle mit Nachkommazahlen einfügen 
		double [][] tableDouble = IO.readDoubleTable();
		IO.writeDoubleTable(tableDouble);
	}

}
