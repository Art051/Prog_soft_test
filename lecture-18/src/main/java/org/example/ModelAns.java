package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class ModelAns
{


    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) throws SQLException
    {
        while (menu());
    }

    public static boolean menu()
    {
        System.out.printf("Please select from the following options:\n" + "1: List all students and their courses\n" + "2: Update a student's address\n" + "3: Delete a student\n" + "4: Add a new course\n" + "5:Add a new Student\n" + "6: Exit\n\n");
        int menuOption = readIntFromConsoleInRange(1, 6);

        switch (menuOption)
        {
            case 1:
                listAllStudents();
                break;
            case 2:
                updateStudentAddress();
                break;
            case 3:
                deleteStudent();
                break;
            case 4:
                addNewCourse();
                break;
            case 5:
                addStudentWithCourse();
                break;
            case 6:
                return false;
        }
        return true;
    }

    public static Connection getDBConn() throws SQLException
    {
        String connectionString = "jdbc:postgresql://localhost:5432/University";
        Properties props = new Properties();

        try
        {
            InputStream input = Main.class.getClassLoader().getResourceAsStream("db.properties");
            props.load(input);
        }
        catch (IOException e)
        {
            throw new SQLException("Could not read database parameters.");
        }

        Connection connection = DriverManager.getConnection(connectionString, props);

        return connection;
    }


    public static PreparedStatement createPreparredStatement(String sql) throws SQLException
    {
        Connection conn = getDBConn();
        PreparedStatement statement = conn.prepareStatement(sql);
        return statement;
    }


    public static String readStringFromConsoleWithMessage(String message)
    {
        System.out.printf("%s", message);
        return stdin.nextLine();
    }

    public static int readIntFromConsoleWithMessage(String message)
    {
        System.out.printf("%s", message);
        return readIntFromConsole();
    }


    public static int readIntFromConsoleInRange(int rangeLow, int rangeHigh)
    {
        while (true)
        {
            int number = readIntFromConsole();
            if (number >= rangeLow && number <= rangeHigh)
            {
                return number;
            }
            System.out.printf("Please enter a number between %d and %d.\n", rangeLow, rangeHigh);
        }
    }

    public static int readIntFromConsole()
    {
        do
        {
            try
            {
                int number = Integer.parseInt(stdin.nextLine());
                return number;
            }
            catch (NumberFormatException e)
            {
                System.out.printf("Invalid number entered, please try again. \n");
            }
        } while (true);
    }


    public static void listAllCourses()
    {

    }

    public static void listAllStudents()
    {
        try
        {
            PreparedStatement statement = createPreparredStatement("SELECT * FROM \"Student\" LEFT OUTER JOIN \"Course\" ON \"Student\".\"Course\" =  \"Course\".\"CourseID\"");
            ResultSet results = statement.executeQuery();
            printResults(results, "StudentID", "StudentName", "Address", "Course");

        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void updateStudentAddress()
    {
        int studentID = getStudentID();

        String newAddress = readStringFromConsoleWithMessage("Please enter the new address: ");
        try
        {
            PreparedStatement statement = createPreparredStatement("UPDATE \"Student\" SET \"Address\" = ? WHERE \"StudentID\" = ?");
            statement.setString(1, newAddress);
            statement.setInt(2, studentID);
            statement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void deleteStudent()
    {
        int studentID = getStudentID();

        String continueDelete = readStringFromConsoleWithMessage("Are you sure you want to permanently delete this student? Enter 'yes' to confirm: ");

        if (!(continueDelete.equals("yes")))
        {
            return;
        }
        try
        {
            PreparedStatement statement = createPreparredStatement("DELETE FROM \"Student\"  WHERE \"StudentID\" = ?");
            statement.setInt(1, studentID);
            statement.execute();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }


    public static void addNewCourse()
    {
        try
        {
            PreparedStatement statement = createPreparredStatement("INSERT INTO \"COURSE\" (\"CourseName\") VALUES (?)");
            String coursename = readStringFromConsoleWithMessage("Enter course name: ");
            statement.setString(1, coursename);
            statement.execute();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static void addStudentWithCourse()
    {
        try
        {
            PreparedStatement statement = createPreparredStatement("INSERT INTO \"STUDENT\" (\"StudentName\",(\"Address\",(\"Course\") VALUES ( ? , ? , ? )");
            String studentName = readStringFromConsoleWithMessage("Enter student name: ");
            String studentAddress = readStringFromConsoleWithMessage("Enter student address: ");
            int studentCourse = getCourseID();

            statement.setString(1, studentName);
            statement.setString(2, studentAddress);
            statement.setInt(3, studentCourse);
            statement.execute();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static int getCourseID()
    {
        //Doesn't check if a student ID is actually valid or not - handled by exception further up
        int courseID = -1;

        do
        {

            courseID = readIntFromConsoleWithMessage("Please enter a Course ID, or enter 0 or less to list all Courses.");

            if (courseID <= 0)
            {
                listAllCourses();
            }
        } while (courseID <= 0);
        return courseID;

    }

    public static int getStudentID()
    {
        //Doesn't check if a student ID is actually valid or not - handled by exception further up
        int studentID = -1;

        do
        {

            studentID = readIntFromConsoleWithMessage("Please enter a Student ID, or enter 0 or less to list all students.");

            if (studentID <= 0)
            {
                listAllStudents();
            }
        } while (studentID <= 0);
        return studentID;

    }

    public static void printResults(ResultSet data, String... columNames) throws SQLException
    {
        for (String column : columNames)
        {
            System.out.printf("%s\t", column);
        }
        System.out.printf("%s\n");
        while (data.next())
        {
            for (String column : columNames)
            {
                System.out.printf("%s\t", data.getString(column));
            }
            System.out.printf("\n");
        }
    }

}

