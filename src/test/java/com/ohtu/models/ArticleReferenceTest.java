
package com.ohtu.models;

import com.ohtu.data.DAO;
import com.ohtu.data.FakeDatabase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author pzanni
 */
public class ArticleReferenceTest {
    private ArticleReference ref;
    private FakeDatabase fdb;
    
    @Before
    public void intitialize() {
        ref = new ArticleReference("Tieteellinen artikkeli", "Anni", "Hesari", 1996, "", 12, 11, 10, "", "");
        fdb = new FakeDatabase();
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
        ref.setVolume("voluumi");
        assertEquals("voluumi", ref.getVolume());
    }

    @Test
    public void savingWorks() {
        ref.save();
        DAO dao = new DAO();
        assertTrue(dao.getArticleReferences().contains(ref));
    }

    @Test
    public void toStringReturnsCorrectString() {
        assertEquals("", ref.toString());
    }

}
