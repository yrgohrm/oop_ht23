package se.yrgo.oop.library.helpers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class InternalHelperTest {
    @Test
    void testGetInternalNumber() {
        // this is a silly test
        assertEquals(42, InternalHelper.getInternalNumber());
    }
}
