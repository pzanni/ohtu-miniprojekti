
package com.ohtu.data;

import com.ohtu.models.ArticleReference;
import com.ohtu.models.Reference;
import java.util.ArrayList;

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
