package com.capg.pbms.accountmanagement.model;


public class Employee {
	private String employeeId;
	private String employeeName;
	private String employeeBranchId;
	private String employeeDesignation;
	private String employeeSal;
	private String employeePassword;
	public Employee() {
		
	}
	public Employee(String employeeId, String employeeName, String employeeBranchId, String employeeDesignation,
			String employeeSal, String employeePassword) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeBranchId = employeeBranchId;
		this.employeeDesignation = employeeDesignation;
		this.employeeSal = employeeSal;
		this.employeePassword = employeePassword;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeBranchId() {
		return employeeBranchId;
	}
	public void setEmployeeBranchId(String employeeBranchId) {
		this.employeeBranchId = employeeBranchId;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public String getEmployeeSal() {
		return employeeSal;
	}
	public void setEmployeeSal(String employeeSal) {
		this.employeeSal = employeeSal;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeBranchId == null) ? 0 : employeeBranchId.hashCode());
		result = prime * result + ((employeeDesignation == null) ? 0 : employeeDesignation.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + ((employeePassword == null) ? 0 : employeePassword.hashCode());
		result = prime * result + ((employeeSal == null) ? 0 : employeeSal.hashCode());
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
		Employee other = (Employee) obj;
		if (employeeBranchId == null) {
			if (other.employeeBranchId != null)
				return false;
		} else if (!employeeBranchId.equals(other.employeeBranchId))
			return false;
		if (employeeDesignation == null) {
			if (other.employeeDesignation != null)
				return false;
		} else if (!employeeDesignation.equals(other.employeeDesignation))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeePassword == null) {
			if (other.employeePassword != null)
				return false;
		} else if (!employeePassword.equals(other.employeePassword))
			return false;
		if (employeeSal == null) {
			if (other.employeeSal != null)
				return false;
		} else if (!employeeSal.equals(other.employeeSal))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeBranchId="
				+ employeeBranchId + ", employeeDesignation=" + employeeDesignation + ", employeeSal=" + employeeSal
				+ ", employeePassword=" + employeePassword + "]";
	}
	


}
