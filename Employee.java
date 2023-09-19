package streams;

public class Employee {
	private String name;
	private int age;
	private int salary;
	private String desination;
	private int experience;
	private String gender;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesination() {
		return desination;
	}

	public void setDesination(String desination) {
		this.desination = desination;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee(String name, int age, int salary, String desination, int experience, String gender) {

		this.name = name;
		this.age = age;
		this.salary = salary;
		this.desination = desination;
		this.experience = experience;
		this.gender = gender;
	}

	public String toStrin() {
		return  name+""+age+""+salary+""+experience+""+gender+""+desination;
	}

}
