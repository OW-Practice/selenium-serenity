package utilities;

import java.util.HashMap;
import java.util.Map;

public class TestDataSingleton {
	private static TestDataSingleton instance = null;
	private Map<String, Object> dataMap;

	private TestDataSingleton() {
		dataMap = new HashMap<>();
	}

	public static TestDataSingleton getInstance() {
		if (instance == null) {
			instance = new TestDataSingleton();
		}
		return instance;
	}

	public void setData(String key, Object value) {
		dataMap.put(key, value);
	}

	public Object getData(String key) {
		return dataMap.get(key);
	}
}
