/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss; //

public class IntegerToRoman { //
    
    private static final int[] VALUES = {10, 9, 5, 4, 1}; //
    private static final String[] SYMBOLS = {"X", "IX", "V", "IV", "I"}; //

    public static String convert(int number) { //
        // Alziamo il limite massimo a 20!
        if (number < 1 || number > 20) {
            throw new IllegalArgumentException("Per ora supportiamo solo i numeri da 1 a 20!");
        }

        StringBuilder roman = new StringBuilder(); //
        int remaining = number; //

        for (int i = 0; i < VALUES.length; i++) { //
            while (remaining >= VALUES[i]) { //
                roman.append(SYMBOLS[i]); //
                remaining -= VALUES[i]; //
            }
        } //

        return roman.toString(); //
    }
}