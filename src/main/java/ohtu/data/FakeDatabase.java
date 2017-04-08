
package ohtu.data;

import java.util.ArrayList;
import java.util.List;

import ohtu.models.Reference;

public class FakeDatabase {
	private List<Reference> refs;

	public FakeDatabase() {
		refs = new ArrayList<>();
		refs.add(new Reference().set("TYPE", "Article").set("author", "Fox and Patterson")
				.set("title", "Crossing the software education chasm").set("year", "2012").set("kEY", "fox"));
		refs.add(new Reference().set("TYPE", "Book").set("author", "Abram et al.")
				.set("title", "Guide to the Software Engineering Body of Knownledge").set("year", "2004")
				.set("kEY", "SWEBOK"));
		refs.add(new Reference().set("TYPE", "InProceedings").set("author", "Royce")
				.set("title", "Managing the Development of Large Software Systems").set("year", "1970")
				.set("kEY", "royce70"));
	}

	public List<Reference> getAllRefs() {
		return refs;
	}

	public void addReference(Reference toAdd) {
		refs.add(toAdd);
	}
}
