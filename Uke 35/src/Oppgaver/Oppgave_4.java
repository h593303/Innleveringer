package Oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave_4 {

	public static void main(String[] args) {
		
		
		String bruttoTxt = showInputDialog("Skriv inn bruttolønn:");
		int brutto = parseInt(bruttoTxt);
		double skatt = 0;
		
		if(brutto <= 164100) {
			skatt = 0;
		}else if(brutto >= 164101 && brutto <= 230950) {
			skatt = brutto * (0.93/100);
		}else if(brutto >= 230951 && brutto <= 580650) {
			skatt = brutto * (2.41/100);
		}else if(brutto >= 580651 && brutto <= 934050) {
			skatt = brutto * (11.52/100);
		}else if(brutto >= 934051) {
			skatt = brutto * (14.52/100);
		}
		
		String utTxt = "Du tjener: " + brutto + "kr. Da må du betale " + skatt + "kr i skatt.";
		showMessageDialog(null, utTxt);

	}

}
