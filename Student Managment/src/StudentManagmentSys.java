import java.util.Scanner;

public class StudentManagmentSys {
	private static final int MAX_CAPACITY = 5;
	private static Student[] students = new Student[MAX_CAPACITY];
	private static int count = 0;
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void addStudent() {
		String choice;
		while (count != MAX_CAPACITY) {
			int id;
			System.out.println("Enter Student ID: ");
			id = scanner.nextInt();
			if (searchStudentById(id)) {
				System.out.println("Student ID already exists. Please enter a different ID.");
				continue;
			}
			
			Student s = new Student();
			s.setId(id);
			s.getInput();
			scanner.skip("\\R");
			
			students[count++] = s;
			
			System.out.println("Do you want to add another student? ");
			choice = scanner.nextLine();
			
			if (choice.equalsIgnoreCase("N")) {
				break;
			}
			
			if (count == MAX_CAPACITY) {
				System.out.println("Maximum capacity of students reached!");
			}
			
		}
	}
	
	public static boolean searchStudentById(int id) {
		int i;
		for (i = 0; i < count; i++) {
			if (students[i].getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public static Student searchStudent(int id) {
		int i;
		for (i = 0; i < count; i++) {
			if (students[i].getId() == id) {
				return students[i];
			}
		}
		return null;
	}
	
	public static double calculateAverageGPA() {
		int i;
		double sum = 0;
		for (i = 0; i < count; i++) {
			sum += students[i].getGpa();
		}
		return sum / count;
	}
	
	public static void display() {
		int i;
		System.out.println("Here is a list of the students: ");
		for (i = 0; i < count; i++) {
			System.out.println(students[i].toString());
		}
	}

	
}
