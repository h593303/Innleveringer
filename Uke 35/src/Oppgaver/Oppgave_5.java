package Oppgaver;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave_5 {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i++) {
			boolean inputOK = false;
			int poengsum = 0;
			while(inputOK == false) {
				String poengsumTxt = showInputDialog("Skriv inn poengsum:");
				poengsum = parseInt(poengsumTxt);
				if(poengsum <= 100 && poengsum >= 0) {
					inputOK = true;
				}else {
					showMessageDialog(null, "Poengsum må være mellom 0 og 100");
				}
			}
			String utTxt;
			
			if(poengsum <= 100 && poengsum >= 90) {
				utTxt = "Karakteren din er A.";
			}else if(poengsum <= 89 && poengsum >= 80) {
				utTxt = "Karakteren din er B.";
			}else if(poengsum <= 79 && poengsum >= 60) {
				utTxt = "Karakteren din er C.";
			}else if(poengsum <= 59 && poengsum >= 50) {
				utTxt = "Karakteren din er D.";
			}else if(poengsum <= 49 && poengsum >= 40) {
				utTxt = "Karakteren din er E.";
			}else if(poengsum <= 39 && poengsum >= 0) {
				utTxt = "Karakteren din er F.";
			}else{
				// Vil aldri skje etter while test
				utTxt = "Du har gitt inn ugyldig poengsum.";
			}
			
			showMessageDialog(null, utTxt);
			
		}

	}

}
