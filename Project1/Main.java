import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

     
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Name: ");
            sc.nextLine(); 
            String name = sc.nextLine();

            System.out.print("Roll No: ");
            int roll = sc.nextInt();

            System.out.print("Number of subjects: ");
            int subjects = sc.nextInt();

           
            Student s = new Student(name, roll, subjects);

            int[] marks = new int[subjects];
            System.out.println("Enter marks:");

            for (int j = 0; j < subjects; j++) {
                marks[j] = sc.nextInt();
            }

            s.setMarks(marks);
            students[i] = s;
        }

    
        System.out.println("\n===== STUDENT REPORTS =====\n");

        for (Student s : students) {
            s.displayDetails();
        }

        sc.close();
    }
}
