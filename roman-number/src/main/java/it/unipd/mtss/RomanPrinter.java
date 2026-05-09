/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss; //

public class RomanPrinter { //
    
    private static final String[] I = {
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    };

    private static final String[] V = {
        "\\      /",
        " \\    / ",
        "  \\  /  ",
        "   \\/   ",
        "   ||   ",
        "   ||   "
    };

    // Definiamo le 6 righe per la lettera 'X'
    private static final String[] X = {
        "\\   / ",
        " \\ /  ",
        "  X   ",
        " / \\  ",
        "/   \\ ",
        "      "
    };

    public static String print(int num) { //
        return printAsciiArt(IntegerToRoman.convert(num)); //
    }

    private static String printAsciiArt(String romanNumber) { //
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        StringBuilder asciiArt = new StringBuilder();

        for (int riga = 0; riga < 6; riga++) {
            for (int i = 0; i < romanNumber.length(); i++) {
                char lettera = romanNumber.charAt(i);
                
                if (lettera == 'I') {
                    asciiArt.append(I[riga]);
                } else if (lettera == 'V') {
                    asciiArt.append(V[riga]);
                } else if (lettera == 'X') {
                    asciiArt.append(X[riga]); // Aggiungiamo la X alla stampa
                } else {
                    throw new IllegalArgumentException("Carattere non supportato per ora: " + lettera);
                }
                
                asciiArt.append(" ");
            }
            asciiArt.append("\n");
        }

        return asciiArt.toString();
    }
}