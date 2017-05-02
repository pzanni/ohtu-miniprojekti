package ohtu.models.validators;

import ohtu.models.Reference;
import ohtu.utilities.Fields;

public class CommonValidator implements ReferenceValidator {

	@Override
	public boolean isValid(Reference reference) {
		//reference contains required fields
		
		String[] required = Fields.getRequired(reference.getType());
		for (String field : required) {
			if (reference.get(field).isEmpty())
				return false;
		}
		
		return true;
	}
}
