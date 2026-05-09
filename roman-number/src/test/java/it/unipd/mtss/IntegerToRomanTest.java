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
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvertTenReturnsX() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvertTwentyReturnsXX() {
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void testConvertFortyReturnsXL() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void testConvertFiftyReturnsL() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertFiftyOneThrowsException() {
        // Ora l'errore deve essere lanciato solo sopra 50!
        IntegerToRoman.convert(51);
    }
}