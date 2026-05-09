/////////////////////////////////
// RICARDO VIALE 2150737
// TOMMASO ZORZETTO 2148629
/////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvertOneReturnsI() {
        // Arrange (Prepariamo i dati)
        int number = 1;

        // Act (Eseguiamo l'azione)
        String result = IntegerToRoman.convert(number);

        // Assert (Controlliamo se il risultato è corretto)
        assertEquals("I", result);
    }

    @Test
    public void testConvertThreeReturnsIII() {
        // Arrange & Act
        String result = IntegerToRoman.convert(3);

        // Assert
        assertEquals("III", result);
    }
    @Test
    public void testConvertFourReturnsIV() { //
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvertFiveReturnsV() { //
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvertSixReturnsVI() { //
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertSevenThrowsException() { //
        IntegerToRoman.convert(7); // Deve dare errore perché supportiamo fino a 6
    }
}