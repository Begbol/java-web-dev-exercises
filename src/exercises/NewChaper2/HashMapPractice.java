package exercises.NewChaper2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentID;

        System.out.println("Enter your students (or ENTER to finish:");

        // Get the student names and grades
        do{
            System.out.println("Student's ID ");
            newStudentID = input.nextInt();
            //Read in the newline before looping back
            input.nextLine();

            if(!newStudentID.equals(-1)){
                System.out.println("Student's Name: ");
                String newStudentName = input.nextLine();
                students.put(newStudentID, newStudentName);


            }
        }while (!newStudentID.equals(-1));


        for(Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + "" + student.getValue() + "");

        }
    }
}
