
package ohtu.data;

import java.util.ArrayList;

import ohtu.models.ArticleReference;
import ohtu.models.Reference;

public class FakeDatabase {
    
    private static ArrayList<Reference> refs;
    private static ArrayList<ArticleReference> arRefs;
    
    public FakeDatabase() {
        refs = new ArrayList<>();
        arRefs = new ArrayList<>();
        refs.add(new Reference("title1", "author", 1986));
        refs.add(new Reference("title2", "author4", 1999));
        arRefs.add(new ArticleReference("title1", "author", "journali", 1986, "voluumi", 1, 2, 3, "nootti", "avain"));
        arRefs.add(new ArticleReference("some book", "arthur", "journali", 1261, "volume 3", 1, 2, 3, "notes here", "key"));
    }
    
    public static ArrayList<Reference> getAllRefs() {
        return refs;
    }
    
    public static ArrayList<ArticleReference> getArticleRefs() {
        return arRefs;
    }
    
    public static void addReference(Reference toAdd) {
        refs.add(toAdd);
    }
    
    public static void addArticleReference(ArticleReference toAdd) {
        arRefs.add(toAdd);
    }
}
