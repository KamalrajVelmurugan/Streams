package streams;

public class Student {
	
	private String name;
	private int id;
	private int marks;
	private String bloodgroup;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(String name, int id, int marks, String bloodgroup, String gender) {
		
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.bloodgroup = bloodgroup;
		this.gender = gender;
	}
	public String toString() {
		return name+"  "+id+"  "+marks+"  "+bloodgroup+"  "+gender;
	}
	
	

}
