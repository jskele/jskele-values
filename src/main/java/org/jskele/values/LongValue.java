package org.jskele.values;

public abstract class LongValue extends ValueClass<Long> {

	public LongValue(String string) {
		this(Long.valueOf(string));
	}

	public LongValue(Long value) {
		super(value);
	}

	public static <T extends LongValue> T create(Class<T> class_, Long value) {
		try {
			return class_.getConstructor(Long.class).newInstance(value);
		} catch (ReflectiveOperationException e) {
			throw new IllegalStateException(e);
		}
	}
}
