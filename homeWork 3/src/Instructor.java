
public class Instructor extends User {
	String ınstructorCourse;

	public Instructor(int id, String firstName, String lastName, String password, String ınstructorCourse) {
		super(id, firstName, lastName, password);
		this.ınstructorCourse = ınstructorCourse;
	}

	public String getInstructorCourse() {
		return ınstructorCourse;
	}

	public void setInstructorCourse(String ınstructorCourse) {
		this.ınstructorCourse = ınstructorCourse;
	}
	
	
	
	
}
