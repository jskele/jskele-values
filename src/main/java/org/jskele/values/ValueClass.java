package org.jskele.values;

import java.util.Objects;

public abstract class ValueClass<T> {
	private final T value;

	protected ValueClass(T value) {
		this.value = Objects.requireNonNull(value, "value must not be null");
	}

	public T toValue() {
		return value;
	}

	@Override
	public String toString() {
		return value.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof ValueClass)) {
			return false;
		}

		ValueClass that = (ValueClass) obj;

		if (!Objects.equals(this.getClass(), that.getClass())) {
			return false;
		}

		return Objects.equals(this.value, that.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getClass(), this.value);
	}
}
