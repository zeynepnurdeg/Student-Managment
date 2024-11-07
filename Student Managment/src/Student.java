import java.util.Scanner;

public class Student {
	private String name;
	private int id;
	private double gpa;
	private boolean hasScholarship;
	
	Scanner scanner = new Scanner(System.in);
	
	public Student(){
		
	}
	
	public void getInput() {
		System.out.println("Enter student name: ");
		name = scanner.nextLine();
		
		System.out.println("Enter Student GPA: ");
		gpa = scanner.nextDouble();
		
		System.out.println("Does the student have a scholarship? (Y/N): ");
		String has;
		scanner.skip("\\R");
		has = scanner.nextLine();
		if (has.equalsIgnoreCase("Y")) {
			hasScholarship = true;
		}
		else {
			hasScholarship = false;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public boolean isHasScholarship() {
		return hasScholarship;
	}
	
	public String toString() {
		String scholarship = "";
		if (hasScholarship) {
			scholarship = "Student has scholarship. \n";
		}
		else {
			scholarship = "No scholarship. \n";
		}
		return "Student name= " + name +
				"\n ID= " + id + 
				"\n GPA= " + gpa + 
				"\n Scholarship status= " + scholarship;
	}
	
	
	
}
