/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    
    // Aggiungiamo 100 (C) e 90 (XC) in testa per l'algoritmo greedy
    private static final int[] VALUES = {100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int number) {
        // Ora il limite massimo sale a 100!
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("Per ora supportiamo solo i numeri da 1 a 100!");
        }

        StringBuilder roman = new StringBuilder();
        int remaining = number;

        for (int i = 0; i < VALUES.length; i++) {
            while (remaining >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                remaining -= VALUES[i];
            }
        }

        return roman.toString();
    }
}