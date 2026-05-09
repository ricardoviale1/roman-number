package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrintOne() {
        // Arrange
        int number = 1;
        
        // Il disegno che ci aspettiamo per la singola "I" (con lo spazio finale)
        String expected = 
            " _____  \n" +
            "|_   _| \n" +
            "  | |   \n" +
            "  | |   \n" +
            " _| |_  \n" +
            "|_____| \n";

        // Act
        String result = RomanPrinter.print(number);

        // Assert
        assertEquals(expected, result);
    }
    @Test
    public void testPrintFive() { //
        int number = 5; 
        
        String expected = 
            "\\      / \n" +
            " \\    /  \n" +
            "  \\  /   \n" +
            "   \\/    \n" +
            "   ||    \n" +
            "   ||    \n";

        assertEquals(expected, RomanPrinter.print(number));
    }
}