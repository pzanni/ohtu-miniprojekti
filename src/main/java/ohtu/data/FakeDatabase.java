
package ohtu.data;

import java.util.ArrayList;
import java.util.List;

import ohtu.models.Reference;

public class FakeDatabase {
    
    private static List<Reference> refs;
    
    public FakeDatabase() {
        refs = new ArrayList<>();
        refs.add(new Reference()
	        		.set("title", "some book")
	        		.set("author", "arthur")
	        		.set("year", "1986"));
        refs.add(new Reference()
	        		.set("title", "Strong Book")
	        		.set("author", "Real Name")
	        		.set("year", "1999"));
    }
    
    public static List<Reference> getAllRefs() {
        return refs;
    }
    
    
    public static void addReference(Reference toAdd) {
        refs.add(toAdd);
    }
}
