
public class SimpleStringMap {
	public SimpleStringMap() {
		keyArray = new String[INITIAL_CAPACITY];
		valueArray = new String[INITIAL_CAPACITY];
		
	}
	
	public void put(String key, String value) {
		if (indexNumber >= keyArray.length) {
			keyArray = doubleArrayCapacity(keyArray);
			valueArray = doubleArrayCapacity(valueArray);
		}
		int putIndex = findIndex(key);
		if (putIndex != indexNumber) {
			for (int i = keyArray.length - 1; i > putIndex; i--) {
				keyArray[i] = keyArray[i - 1];
				valueArray[i] = valueArray[i - 1];
			}
			keyArray[putIndex] = key;
			valueArray[putIndex] = value;
		} else {
			keyArray[indexNumber] = key;
			valueArray[indexNumber] = value;
		}
		indexNumber++;
	}
	
	public String get(String key) {
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}
	
	private String[] doubleArrayCapacity(String[] oldArray) {
		String[] newArray = new String[2 * oldArray.length];
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i] = oldArray[i];
		}
		return newArray;
	}
	
	private int findIndex(String newKey) {
		for (int i = keyArray.length - 1; i > 0; i--) {
			if (newKey.compareTo(keyArray[i]) <= 0) {
				if (i > 0) {
					if (newKey.compareTo(keyArray[i - 1]) >= 0) {
						return i;
					}
				} else {
					return i;
				}
			}
		}
		return indexNumber;
	}
	
	private int indexNumber = 0;
	private String[] keyArray;
	private String[] valueArray;
	private static final int INITIAL_CAPACITY = 2;
}


