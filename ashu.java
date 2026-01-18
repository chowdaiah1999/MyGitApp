public class Palindrome {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123, reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number = " + reverse);
    }
}
public class PrintNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    // Method to read student details
    void inputDetails(Scanner sc) {
        System.out.print("Enter Student ID: ");
        id = sc.nextInt();

        sc.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);
        System.out.println("----------------------------");
    }

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 80)
            return "A";
        else if (marks >= 60)
            return "B";
        else if (marks >= 40)
            return "C";
        else
            return "Fail";
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        // Input details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            students[i] = new Student();
            students[i].inputDetails(sc);
        }

        // Display details
        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
            System.out.println("Grade        : " + students[i].calculateGrade());
        }

        sc.close();
    }
}

