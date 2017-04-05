/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ohtu.data;

import com.ohtu.models.ArticleReference;
import com.ohtu.models.Reference;
import java.util.ArrayList;

/**
 *
 * @author pullis
 */
public class DAO {
    
    public DAO() {
    }
    
    public ArrayList<Reference> getAll() {
        return FakeDatabase.getAll();
    } 
    
    public void addReference(Reference toAdd) {
        FakeDatabase.addReference(toAdd);
    }
    
    public void addArticleReference(ArticleReference toAdd) {
        FakeDatabase.addArticleReference(toAdd);
    }
}
