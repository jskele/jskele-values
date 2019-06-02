package org.jskele.values;

public abstract class StringValue extends ValueClass<String> {

	public StringValue(String value) {
		super(value);
	}

	public static <T extends StringValue> T create(Class<T> class_, String value) {
		try {
			return class_.getConstructor(String.class).newInstance(value);
		} catch (ReflectiveOperationException e) {
			throw new IllegalStateException(e);
		}
	}
}
