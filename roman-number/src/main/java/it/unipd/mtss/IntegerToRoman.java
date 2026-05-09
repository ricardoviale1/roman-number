/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    
    // Aggiungiamo 50 (L) e 40 (XL) in testa per la conversione greedy
    private static final int[] VALUES = {50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLS = {"L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int number) {
        // Ora il limite massimo sale a 50!
        if (number < 1 || number > 50) {
            throw new IllegalArgumentException("Per ora supportiamo solo i numeri da 1 a 50!");
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