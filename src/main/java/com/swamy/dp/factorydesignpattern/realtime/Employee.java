package com.swamy.dp.factorydesignpattern.realtime;

public class Employee {

	private String empName;
	private String modeOfContact;
	private String email;
	private String phone;

	public Employee() {
		super();
	}

	public Employee(String empName, String modeOfContact, String email, String phone) {
		super();
		this.empName = empName;
		this.modeOfContact = modeOfContact;
		this.email = email;
		this.phone = phone;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getModeOfContact() {
		return modeOfContact;
	}

	public void setModeOfContact(String modeOfContact) {
		this.modeOfContact = modeOfContact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", modeOfContact=" + modeOfContact + ", email=" + email + ", phone="
				+ phone + "]";
	}

}
