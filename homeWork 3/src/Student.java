
public class Student extends User{

	String studentCourse;

	public String getStudentCourse() {
		return studentCourse;
	}

	
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public Student(int id, String firstName, String lastName, String password, String studentCourse) {
		super(id, firstName, lastName, password);
		this.studentCourse = studentCourse;
	}

	
	
}
