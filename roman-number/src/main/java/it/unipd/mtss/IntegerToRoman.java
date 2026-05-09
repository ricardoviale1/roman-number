/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    public static String convert(int number) {
        // Se il numero non è tra 1 e 3, per ora lanciamo un errore
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException("Per ora supportiamo solo i numeri da 1 a 3!");
        }

        StringBuilder roman = new StringBuilder();
        
        // Se inseriamo 1 aggiunge una "I", se 2 aggiunge "II", se 3 aggiunge "III"
        for (int i = 0; i < number; i++) {
            roman.append("I");
        }

        return roman.toString();
    }
}