package org.jskele.libs.values;

import java.util.UUID;

public abstract class UuidValue extends ValueClass<UUID> {
	public UuidValue(UUID uuid) {
		super(uuid);
	}

	public UuidValue(String string) {
		super(UUID.fromString(string));
	}
}
