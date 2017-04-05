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
public class FakeDatabase {
    
    private static ArrayList<Reference> refs;
    
    public FakeDatabase() {
        refs = new ArrayList<>();
        refs.add(new Reference("title1", "author", 1986));
        refs.add(new Reference("title2", "author4", 1999));
    }
    
    public static ArrayList<Reference> getAll() {
        return refs;
    }
    
    public static void addReference(Reference toAdd) {
        refs.add(toAdd);
    }
    
    public static void addArticleReference(ArticleReference toAdd) {
        refs.add(toAdd);
    }
}
