/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss; //

public class IntegerToRoman { //
    
    // Definiamo i valori chiave per i numeri fino a 6
    private static final int[] VALUES = {5, 4, 1};
    private static final String[] SYMBOLS = {"V", "IV", "I"};

    public static String convert(int number) { //
        // Il limite massimo per questo step è 6
        if (number < 1 || number > 6) {
            throw new IllegalArgumentException("Per ora supportiamo solo i numeri da 1 a 6!");
        }

        StringBuilder roman = new StringBuilder();
        int remaining = number;

        // Questo ciclo "sottrae" il valore più grande possibile finché può
        for (int i = 0; i < VALUES.length; i++) {
            while (remaining >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                remaining -= VALUES[i];
            }
        }

        return roman.toString();
    }
}