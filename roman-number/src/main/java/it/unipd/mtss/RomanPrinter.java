/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    
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

    private static final String[] X = {
        "\\   / ",
        " \\ /  ",
        "  X   ",
        " / \\  ",
        "/   \\ ",
        "      "
    };

    private static final String[] L = {
        " _      ",
        "| |     ",
        "| |     ",
        "| |     ",
        "| |___  ",
        "|_____| "
    };

    // La versione corretta con i singoli backslash correttamente escapati (solo 2 backslash!)
    private static final String[] C = {
        " _____ ",
        "/  __ \\",
        "| /  \\/",
        "| |    ",
        "| \\__/\\",
        " \\____/"
    };

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
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
                    asciiArt.append(X[riga]);
                } else if (lettera == 'L') {
                    asciiArt.append(L[riga]);
                } else if (lettera == 'C') {
                    asciiArt.append(C[riga]);
                } else {
                    throw new IllegalArgumentException("Carattere non supportato: " + lettera);
                }
                
                asciiArt.append(" ");
            }
            asciiArt.append("\n");
        }

        return asciiArt.toString();
    }
}