package odev3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1, "Fatih", "G�ren", "fgoren", "fatihgoren61@gmail.com",
				"Java", "C#");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student);
		studentManager.update(student);
		studentManager.delete(student);
		studentManager.addCompletedCourse();
		studentManager.deleteCompletedCourse();
		
		
		Instructor instructor = new Instructor(2, "Engin", "Demiro�", "edemirog",
				"engindemirog@gmail.com", "JAVA", "C#");
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.add(instructor);
		instructorManager.update(instructor);
		instructorManager.delete(instructor);
		instructorManager.addCertificate();
		instructorManager.deleteCertificate();
	}

}
