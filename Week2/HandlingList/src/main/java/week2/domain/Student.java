package week2.domain;

public class Student  {
	private String firstname;
	private String lastname;
	public Student(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public void setFirstname(String firstname) {
		this.firstname =firstname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setLastname(String lastname) {
		this.lastname =lastname;
	}
	public String getLastname() {
		return lastname;
	}
}
