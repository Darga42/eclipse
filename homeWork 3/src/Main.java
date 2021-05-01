
public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Sefa", "Adam", "1234");
		
		Student student = new Student(2, "Tahir", "Darga","4567","Java React");
		
		Instructor instructor = new Instructor(3, "Engin", "Demiroğ", "789", "Java React");
		
		
		
		
		
		UserManager userManager = new UserManager();
		
		StudentManager studentManager = new StudentManager();
		
		InstructorManager instructorManager = new InstructorManager();
		
		System.out.println("Ekleme Bloğu ");
		System.out.println("----------");
		userManager.add(user);
		studentManager.add(student);
		instructorManager.add(instructor);
		System.out.println();
		System.out.println("Silme Bloğu ");
		System.out.println("----------");
		System.out.println();
		userManager.delete(user);
		studentManager.delete(student);
		instructorManager.delete(instructor);
		
	}

}
