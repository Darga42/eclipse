
public class CourseManager 
{
	public void add(Course course) 
	{
		System.out.println(course.name+": Kurs Eklendi");
	}
	
	public void delete(Course course) 
	{
		System.out.println(course.name+": Kurs Silindi");
	}
	
	public void instructor(Course course) 
	{
		System.out.println("Eğitmen: "+course.instructor);

	}
}
