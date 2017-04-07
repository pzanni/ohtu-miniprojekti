package ohtu.models;

import java.util.HashMap;
import java.util.Map;

public class Reference {
	private Map<String, String> fields;

	public Reference() {
		fields = new HashMap<>();
	}
	
	public Reference(Map<String, String> input) {
		fields.putAll(input);
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
		return .get("year");
	}
}
