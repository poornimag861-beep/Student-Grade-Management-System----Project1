public class Student {
    private String name;
    private int rollNo;
    private int[] marks;

    
    public Student(String name, int rollNo, int subjects) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = new int[subjects]; 
    }

   
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

  
    public int calculateTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    
    public char calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }


    public void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Total  : " + calculateTotal());
        System.out.printf("Average: %.2f%n", calculateAverage());
        System.out.println("Grade  : " + calculateGrade());
        System.out.println("--------------------------");
    }
}
