import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		StudentManagmentSys.addStudent();
		System.out.println("-----------------");
		
		StudentManagmentSys.display();
		System.out.println();
		
		System.out.println("-----------------");
		System.out.printf("Avg of all Student GPA's: %.2f\n", StudentManagmentSys.calculateAverageGPA());
		System.out.println("------------------");
		
		int id;
		System.out.println("Which student would you like to search? Enter his/her id: ");
		id = scanner.nextInt();
		System.out.println(StudentManagmentSys.searchStudent(id).toString());
	}

}
