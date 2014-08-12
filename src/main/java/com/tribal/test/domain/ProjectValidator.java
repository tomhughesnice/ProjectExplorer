package com.tribal.test.domain;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.tribal.test.enums.ProjectPhaseEnum;

public class ProjectValidator implements Validator {

	/**
	 * Only Validates the Project class
	 */
	@Override
	public boolean supports(Class<?> clazz) {
		return Project.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
		ValidationUtils.rejectIfEmpty(e, "code", "code.empty");
		ValidationUtils.rejectIfEmpty(e, "techLead", "techLead.empty");
		ValidationUtils.rejectIfEmpty(e, "projectManager", "projectManager.empty");
		ValidationUtils.rejectIfEmpty(e, "deliveryDate", "deliveryDate.empty");
		ValidationUtils.rejectIfEmpty(e, "phase", "phase.empty");
	}
	
}
