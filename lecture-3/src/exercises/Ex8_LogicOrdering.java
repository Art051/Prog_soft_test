package exercises;

import java.util.Scanner;

public class Ex8_LogicOrdering {

    private static final Scanner stdin = new Scanner(System.in);


    public static void main(String[] args) {

        countingStudents();
    }


    public static void countingStudents() {
        /*
    READ CAREFULLY TO GET ORDER OF THE LOGIC CORRECT
The user enters the number of students that entered a building and the number of students that left
The user is asked if the alarm should be armed, and enters “yes” or “no”
If some of the students remain in the building display an alarm message “Students left in the building”.
However, this message should not be shown if the alarm is not armed.
When the building is empty a simple “Building is empty” message should be displayed.
     */

        int studentsInCount, studentsOutCount;
        boolean studentsRemain, armAlarm;

        System.out.print("Please enter how many students entered the building: \n");
        studentsInCount = Integer.parseInt(stdin.nextLine());

        System.out.print("Please enter how many students left the building: \n");
        studentsOutCount = Integer.parseInt(stdin.nextLine());
        studentsRemain = (studentsInCount > studentsOutCount);

        System.out.print("Should the alarm be armed? (Y/N)\n");
        armAlarm = stdin.nextLine().equalsIgnoreCase("y");

        if (armAlarm && studentsRemain) {
            System.out.print("Students left in the building\n");
        }
        else if (!studentsRemain) {
            System.out.print("Building is empty\n");
        }
    }

}
