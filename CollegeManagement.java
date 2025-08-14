import java.util.Scanner;

public class CollegeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student Name: ");
        String sName = sc.nextLine();
        System.out.print("Student ID: ");
        String sId = sc.nextLine();
        System.out.print("Course: ");
        String course = sc.nextLine();
        System.out.print("Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();

        System.out.print("Faculty Name: ");
        String fName = sc.nextLine();
        System.out.print("Faculty ID: ");
        String fId = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        System.out.print("Subject: ");
        String subject = sc.nextLine();

        System.out.println("\n--- Details ---");
        System.out.println("Student: " + sName + " | ID: " + sId + " | Course: " + course + " | Marks: " + marks + " | Result: " + (marks >= 40 ? "Pass" : "Fail"));
        System.out.println("Faculty: " + fName + " | ID: " + fId + " | Dept: " + dept + " | Subject: " + subject);

        sc.close();
    }
}
