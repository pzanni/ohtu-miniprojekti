package com.ohtu.models;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReferenceTest {
    @Test
    public void constructorInitializesPropertiesCorrectly() { // Just made sure that reports are generated
        Reference ref = new Reference("Mein Kampf", "Adolf Hitler", 1925);
        assertEquals(1925, ref.getYear());
    }
}