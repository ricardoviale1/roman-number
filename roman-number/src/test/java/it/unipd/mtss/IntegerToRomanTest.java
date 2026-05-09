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
    public void testConvertOneHundredReturnsC() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvertFourHundredReturnsCD() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void testConvertFiveHundredReturnsD() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertFiveHundredAndOneThrowsException() {
        // Ora l'errore deve scattare solo da 501 in su!
        IntegerToRoman.convert(501);
    }
}