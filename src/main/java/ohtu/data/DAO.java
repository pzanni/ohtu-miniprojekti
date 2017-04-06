
package ohtu.data;

import java.util.ArrayList;

import ohtu.models.ArticleReference;
import ohtu.models.Reference;

public class DAO {
    
    public DAO() {
    }
    
    public ArrayList<Reference> getAll() {
        return FakeDatabase.getAllRefs();
    } 
    
    public ArrayList<ArticleReference> getArticleReferences() {
        return FakeDatabase.getArticleRefs();
    }
    
    public void addReference(Reference toAdd) {
        FakeDatabase.addReference(toAdd);
    }
    
    public void addArticleReference(ArticleReference toAdd) {
        FakeDatabase.addArticleReference(toAdd);
    }
}
