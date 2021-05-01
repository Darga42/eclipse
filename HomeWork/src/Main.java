public class Main {

	public static void main(String[] args) {
		
		//Java 2.Gün Ödev
		
		Course course1 = new Course(1, "C# Angular Kursu", "Engin Demiroğ");
		Course course2 = new Course(2, "Java React Kursu", "Engin Demiroğ");
		Course course3 = new Course(3, "Proğramlamaya Giriş İçin Temel Kurs","Engin Demiroğ");
		Course[] courses = {course1,course2,course3};
		for (Course course : courses) 
		{
			System.out.println(course.name);
		}
		System.out.println();
		System.out.println("Kurslar Bitti");
		System.out.println("-------------");
		System.out.println();
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.delete(course2);
		courseManager.instructor(course3);
		
		System.out.println();
		System.out.println("Yapıcı Blok Bitti");
		System.out.println("-------------");
		System.out.println();
		
		Category category1 = new Category(1, "Yazılım Sektörü");
		Category category2 = new Category(2, "Eğitmenler");
		Category[] categories = {category1,category2};
		
		for (Category category : categories) 
		{
			System.out.println(category.name);
		}
		
		System.out.println();
		System.out.println("Kategoriler Bitti");
		System.out.println("-------------");

	}

}
