package com.tribal.test.enums;

/**
 * Holds all the possible phases of this project
 * @author thomash
 *
 */
public enum ProjectPhaseEnum {
	BRIEFING, SCOPING, INTERACTION, DEVELOPMENT, QA, RELEASE;
	
	public String getDisplayName() {
		return this.name().toLowerCase();
	}
	
	public static ProjectPhaseEnum getByName(String name) {
		for (ProjectPhaseEnum theEnum : ProjectPhaseEnum.values()) {
			if (theEnum.name().equals(name)) {
				return theEnum;
			}
		}
		return null;
	}
	
	
}
