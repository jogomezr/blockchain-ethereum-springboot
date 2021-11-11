package com.example.blockchain.ethereum.service.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author jagomez.rodriguez
 *
 */
public enum InitiativeStatusEnum {
	ACTIVE("active"),

	PENDING("pending"),

	FINISHED("finished");

	private String value;

	InitiativeStatusEnum(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static InitiativeStatusEnum fromValue(String value) {
		for (InitiativeStatusEnum b : InitiativeStatusEnum.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}

}
