package ohtu.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ohtu.models.validators.CommonValidator;
import ohtu.models.validators.ReferenceValidator;

public class Reference {
	private Map<String, String> fields;
	private List<ReferenceValidator> validators;

	public Reference() {
		fields = new HashMap<>();
		validators = new ArrayList<>();
		validators.add(new CommonValidator());
	}
	
	public Reference(Map<String, String> input) {
		this();
		input.forEach((k, v) -> set(k, v));
	}

	public String get(String key) {
		String val = fields.get(key);
		return val != null ? val : "";
	}

	public Reference set(String key, String value) {
		fields.put(key.toLowerCase(), value);
		return this;
	}

	public String getAuthor() {
		return get("author");
	}

	public String getTitle() {
		return get("title");
	}

	public String getYear() {
		return get("year");
	}
	
	public String getJournal() {
		return get("journal");
	}
	
	public String getKey() {
		return get("key");
	}
	
	public String getType() {
		return get("type");
	}

	public void addValidator(ReferenceValidator validator) {
		this.validators.add(validator);
	}
	
	public boolean isValid() {
		return validators.stream().allMatch(v -> v.isValid(this));
	}
	
	public String toBibTex() {
		StringBuilder sb = new StringBuilder("@" + getType() + "{" + getKey() + ",\n");
		
		fields.forEach((k, v) -> {
			if (!k.equals("type") && !k.equals("key"))
				sb.append("\t" + k + "=" + "{" + v + "},\n");
		});
		
		return sb.append("}").toString();
	}
}
