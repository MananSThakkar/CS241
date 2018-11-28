package SortAlgorithms;

public class Student implements Comparable<Student>{
	
	private String fName;
	private String lName;
	private double gpa;
	private String uName;
	
	public Student(String fName, String lName, double gpa, String uName) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.gpa = gpa;
		this.uName = uName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	@Override
	public String toString() {
		return "Student [" + fName + ", " + lName 
				+ ", " + gpa + ", " + uName + "]";
	}

	@Override
	public int compareTo(Student s) {
		return this.uName.compareTo(s.getuName());
	}
}

	

