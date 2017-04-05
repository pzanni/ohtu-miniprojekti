package com.ohtu.models;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class ReferenceTest {
    private Reference ref;
    
    @Before
    public void initialize() {
        ref = new Reference("Veljeni Leijonamieli", "Astrid Lindgren", 1973);
    }
    
    @Test
    public void constructorInitializesPropertiesCorrectly() {
        assertEquals("Veljeni Leijonamieli", ref.getTitle());
        assertEquals("Astrid Lindgren", ref.getAuthor());
        assertEquals(1973, ref.getYear());
    }
    
    @Test
    public void toStringReturnsCorrectString() {
        assertEquals("", ref.toString());
    }
}