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
    public void testConvertFiveHundredReturnsD() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testConvertNineHundredReturnsCM() {
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    public void testConvertOneThousandReturnsM() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertOneThousandAndOneThrowsException() {
        // Ora l'errore deve scattare solo da 1001 in su!
        IntegerToRoman.convert(1001);
    }
}