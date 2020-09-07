package Oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave_6 {

	public static void main(String[] args) {
		String heltallTxt = showInputDialog("Skriv inn et heltall større enn 0:");
		int heltall = parseInt(heltallTxt);
		if(heltall <= 0) {
			showMessageDialog(null, "Heltall må være større enn 0");
		} else {
			int resultat = 1;
			for(int i=1; i<=heltall; i++) {
				resultat = resultat * i; 
			}
			showMessageDialog(null, "Resultatet av " + heltall + "! ble " + resultat + ".");
		}
		

	}

}
