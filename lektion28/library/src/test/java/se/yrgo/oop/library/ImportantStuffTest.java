package se.yrgo.oop.library;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ImportantStuffTest {
    @Test
    void testGetNumber() {
        // this is a silly test!
        assertEquals(126, ImportantStuff.getNumber());
    }
}
