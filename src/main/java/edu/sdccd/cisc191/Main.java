package edu.sdccd.cisc191;

/**
 * Module 1 - Demo runner.
 * This is primarily for your video demo.
 */
public class Main {
    public static void main(String[] args) {
        // TODO: Create at least 6 students and demonstrate:
        Student[] students = {
                new Student("Dylan", 4.0, 101),
                new Student("Martin", 3.85, 102),
                new Student("James", 2.3, 103),
                new Student("Sean", 4.0, 104),
                new Student("Cher", 1.25, 105),
                new Student("Beyonce", 5.0, 106)
        };
        // - original order
        System.out.println("Original Order");
        for (Student s : students) {
            System.out.println(s);
        }

        // - sorted-by-GPA order
        System.out.println("Sorted by GPA (Descending)");
        Student[] sorted = StudentArrayToolkit.copySortedByGpaDesc(students);
        for (Student s : sorted) {
            System.out.println(s);
        }
        // - topNByGpa with N=3
        System.out.println("Top 3 Students ");
        Student[] top3 = StudentArrayToolkit.topNByGpa(students, 3);
        for (Student s : top3) {
            System.out.println(s);
        }
        // - findByIdLinear with existing and non-existing id
        System.out.println("Searching for ID 104");
        Student found1 = StudentArrayToolkit.findByIdLinear(students, 104);
        System.out.println(found1 != null ? found1 : "Student not found");

        System.out.println("Searching for ID 999...");
        Student found2 = StudentArrayToolkit.findByIdLinear(students, 999);
        System.out.println(found2 != null ? found2 : "Student not found");


        System.out.println("Defensive Copy Check");
        System.out.println("Original[0] before change: " + students[0]);
        sorted[0] = new Student("Tampered", 0.0, 5000);
        System.out.println("Original[0] after modifying sorted array: " + students[0]);
        System.out.println("(Original array is unchanged → defensive copy works)");

    }
}
