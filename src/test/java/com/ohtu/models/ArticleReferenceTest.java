
package com.ohtu.models;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author pzanni
 */
public class ArticleReferenceTest {
    private ArticleReference ref;
    
    @Before
    public void intitialize() {
        ref = new ArticleReference("Tieteellinen artikkeli", "Anni", "Hesari", 1996, "", 12, 11, 10, "", "");
    }
    
    @Test
    public void gettersWork() {
        assertEquals("Tieteellinen artikkeli", ref.getTitle());
        assertEquals("Anni", ref.getAuthor());
        assertEquals("Hesari", ref.getJournal());
        assertEquals(1996, ref.getYear());
        assertEquals("", ref.getVolume());
        assertEquals(12, ref.getNumber());
        assertEquals(11, ref.getPages());
        assertEquals(10, ref.getMonth());
        assertEquals("", ref.getNote());
        assertEquals("", ref.getKey());
    }
    
    @Test
    public void settersWork() {
        ref.setJournal("mm");
        assertEquals("mm", ref.getJournal());
        ref.setKey("1");
        assertEquals("1", ref.getKey());
        ref.setMonth(12);
        assertEquals(12, ref.getMonth());
        ref.setNote("n");
        assertEquals("n", ref.getNote());
        ref.setNumber(45);
        assertEquals(45, ref.getNumber());
        ref.setPages(300);
        assertEquals(300, ref.getPages());
    }
    
    @Test
    public void toStringReturnsCorrectString() {
        assertEquals("", ref.toString());
    }
    
}
