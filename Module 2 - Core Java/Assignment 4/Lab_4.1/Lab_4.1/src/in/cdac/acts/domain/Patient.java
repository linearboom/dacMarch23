package in.cdac.acts.domain;

public class Patient {
	private String name;
	private int age;
	private String gender;
	private String address;
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return String.format("%-25s%-5d%-10s%-50s", this.name, this.age, this.gender, this.address);
	}
}
