package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradebookHashIDs {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newID;
        String newStudent;

        System.out.println("Enter each ID number (or enter 0 to finish):");

        // Get student names and grades
        do {

            System.out.print("ID Number: ");
            newID = in.nextInt();
            // Integers don't consume enters; you need to force a new line here
            // Otherwise you won't be able to store your student value with your key
            in.nextLine();

            if (newID != 0) {
                System.out.print("Student: ");
                newStudent = in.nextLine();
                students.put(newID, newStudent);

                // Read in the newline before looping back
                // in.nextLine();
            }

        } while(newID != 0);


        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Student ID: " + student.getKey() + " - " + student.getValue());

        }

    }

}
