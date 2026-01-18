class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Rahul";
        s.display();
    }
}

import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double basicSalary;

    void input(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    double calculateHRA() {
        return basicSalary * 0.20;
    }

    double calculateDA() {
        return basicSalary * 0.10;
    }

    double calculateGrossSalary() {
        return basicSalary + calculateHRA() + calculateDA();
    }

    void display() {
        System.out.println("\nEmployee ID    : " + empId);
        System.out.println("Employee Name  : " + empName);
        System.out.println("Basic Salary   : " + basicSalary);
        System.out.println("HRA            : " + calculateHRA());
        System.out.println("DA             : " + calculateDA());
        System.out.println("Gross Salary   : " + calculateGrossSalary());
    }
}

public class PayrollSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));
            emp[i] = new Employee();
            emp[i].input(sc);
        }

        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        sc.close();
    }
}
