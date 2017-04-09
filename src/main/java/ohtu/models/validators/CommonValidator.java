package ohtu.models.validators;

import ohtu.models.Reference;

public class CommonValidator implements ReferenceValidator {

	@Override
	public boolean isValid(Reference reference) {
		//reference contains required fields
		
		String[] required = {"author", "title", "year"};
		for (String field : required) {
			if (reference.get(field).isEmpty())
				return false;
		}
		
		return true;
	}
}
