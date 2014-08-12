package com.tribal.test.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.tribal.test.enums.ProjectPhaseEnum;
/*
 * Domain object to model a project entity
 */
public class Project implements Serializable {
	
	private static final long serialVersionUID = -4311065691983682854L;

	private int id;

	@NotEmpty
	private String name;
	
	@NotEmpty
	private String code;
	
	@NotEmpty
	private String techLead;
	
	@NotEmpty
	private String projectManager;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull
	private Date deliveryDate;
	
	@NotNull
	private ProjectPhaseEnum phase;
	
	@NotNull @Min(1)
	private int priority;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTechLead() {
		return techLead;
	}

	public void setTechLead(String techLead) {
		this.techLead = techLead;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public ProjectPhaseEnum getPhase() {
		return phase;
	}

	public void setPhase(ProjectPhaseEnum phase) {
		this.phase = phase;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", code=" + code + ", techLead=" + techLead
				+ ", projectManager=" + projectManager + ", deliveryDate=" + deliveryDate + ", phase=" + phase
				+ ", priority=" + priority + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((deliveryDate == null) ? 0 : deliveryDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phase == null) ? 0 : phase.hashCode());
		result = prime * result + priority;
		result = prime * result + ((projectManager == null) ? 0 : projectManager.hashCode());
		result = prime * result + ((techLead == null) ? 0 : techLead.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (deliveryDate == null) {
			if (other.deliveryDate != null)
				return false;
		} else if (!deliveryDate.equals(other.deliveryDate))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phase != other.phase)
			return false;
		if (priority != other.priority)
			return false;
		if (projectManager == null) {
			if (other.projectManager != null)
				return false;
		} else if (!projectManager.equals(other.projectManager))
			return false;
		if (techLead == null) {
			if (other.techLead != null)
				return false;
		} else if (!techLead.equals(other.techLead))
			return false;
		return true;
	}
	
}
