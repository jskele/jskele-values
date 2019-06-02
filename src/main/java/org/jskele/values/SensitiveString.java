package org.jskele.values;

import java.util.Arrays;

/**
 * Can be used for sensitive data, such as password, where actual value shouldn't be logged.
 * Also has a clear() method for destroying the data, useful if you don't want passwords lying around in the heap.
 */
public class SensitiveString extends ValueClass<char[]> {

	public SensitiveString(char[] value) {
		super(value);
	}

	@Override
	public String toString() {
		return "***";
	}

	public void clear() {
		Arrays.fill(toValue(), (char) 0);
	}
}
