package HashSetList;

public class Student {

	private String firstName;
	private String lastName;
	private String studentID; //U12345
	private String major;
	
	public Student(String firsName, String lastName, String studentID, String major) {
		super();
		this.firstName = firsName;
		this.lastName = lastName;
		this.studentID = studentID;
		this.major = major;
	}
	
	
	public String getFirsName() {
		return firstName;
	}
	public void setFirsName(String firsName) {
		this.firstName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((major == null) ? 0 : major.hashCode());
		result = prime * result + ((studentID == null) ? 0 : studentID.hashCode());
		//System.out.println("generated hash" + result);
		return Math.abs(result);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (major == null) {
			if (other.major != null)
				return false;
		} else if (!major.equals(other.major))
			return false;
		if (studentID == null) {
			if (other.studentID != null)
				return false;
		} else if (!studentID.equals(other.studentID))
			return false;
		return true;
	}
	
	public String toString() {
		return "\"" + firstName + "\"," + "\"" + lastName + "\"," + 
				"\"" + studentID + "\"," + "\"" + major + "\"";
	}
	
}
