
package ohtu.data;

import java.util.List;

import ohtu.models.Reference;

public class ReferenceDAO {
    private FakeDatabase database;
    
    public ReferenceDAO(FakeDatabase database) {
    	this.database = database;
    }
    
    public List<Reference> getAll() {
        return database.getAllRefs();
    } 
    
    public void addReference(Reference toAdd) {
		database.addReference(toAdd);
    }
}
