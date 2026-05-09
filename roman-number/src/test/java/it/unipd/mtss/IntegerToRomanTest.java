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
    public void testConvertThreeReturnsIII() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvertFourReturnsIV() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvertFiveReturnsV() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvertSixReturnsVI() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    // AGGIORNAMENTO: Il 7 ora è valido! Testiamo che converta correttamente in "VII"
    @Test
    public void testConvertSevenReturnsVII() {
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void testConvertNineReturnsIX() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvertTenReturnsX() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    // AGGIORNAMENTO: Ora il limite d'errore si è spostato a 11!
    @Test(expected = IllegalArgumentException.class)
    public void testConvertElevenThrowsException() {
        IntegerToRoman.convert(11);
    }
}