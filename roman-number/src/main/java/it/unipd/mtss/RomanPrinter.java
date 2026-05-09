/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    
    // Definiamo le 6 righe dell'ASCII art per la lettera 'I'
    private static final String[] I = {
        " _____ ",
        "|_   _|",
        "  | |  ",
        "  | |  ",
        " _| |_ ",
        "|_____|"
    };

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        StringBuilder asciiArt = new StringBuilder();

        // Ciclo principale: dobbiamo costruire il disegno riga per riga (da 0 a 5)
        for (int riga = 0; riga < 6; riga++) {
            
            // Per ogni riga, scorriamo tutte le lettere del numero romano (es. "III")
            for (int i = 0; i < romanNumber.length(); i++) {
                char lettera = romanNumber.charAt(i);
                
                if (lettera == 'I') {
                    asciiArt.append(I[riga]);
                } else {
                    throw new IllegalArgumentException("Carattere non supportato per ora: " + lettera);
                }
                
                // Aggiungiamo un piccolo spazio tra una lettera e l'altra per non farle attaccare
                asciiArt.append(" ");
            }
            
            // Alla fine di ogni riga, andiamo a capo
            asciiArt.append("\n");
        }

        return asciiArt.toString();
    }
}