package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class Main
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) throws SQLException
    {

//        findAllStudentsAndAdddresses();
//        insertStudent();
//        listAllStudentsAndCourse();
//        updateStudentAddress();

    }

    public static Connection getDBConn() throws SQLException
    {
        String connectionString = "jdbc:postgresql://localhost:5432/University";
        Properties props = new Properties();
        Connection connection;

        try
        {
            InputStream input = Main.class.getClassLoader().getResourceAsStream("db.properties");
            props.load(input);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try
        {

            connection = DriverManager.getConnection(connectionString, props);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static void findAllStudentsAndAdddresses() throws SQLException
    {
        Statement statement = getDBConn().createStatement();
        ResultSet results = statement.executeQuery("SELECT * FROM \"Student\" LEFT OUTER JOIN \"Course\" ON \"Student\".\"Course\" =  \"Course\".\"CourseID\"");

        while (results.next())
        {
            System.out.printf("%s %s %s %s\n", "Student ID: " + results.getString("StudentID"), "Name: " + results.getString(2), "Address: " + results.getString("Address"), results.getString("Course"));
        }
    }


    //Inserting data:
    public static void insertStudent() throws SQLException
    {

        Connection conn = getDBConn();
        try
        {
            {
                String studentName = printQGetStr("Enter Student name: ");
                String studentAddress = printQGetStr("Enter Student address: ");
                int studentCourseID = printQGetInt("Enter Student course ID: ");

                PreparedStatement statement = conn.prepareStatement("INSERT INTO (\"StudentName\", \"Address\", \"Course\") VALUES (?, ?, ?)");
                statement.setString(1, studentName);
                statement.setString(2, studentAddress);
                statement.setInt(3, studentCourseID);
                statement.execute();
            }
        }

        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }


    public static void listAllStudentsAndCourse() throws SQLException
    {

        Connection conn = getDBConn();

        Statement statement = conn.createStatement();
        ResultSet results = statement.executeQuery("SELECT \"StudentName\", \"CourseName\" FROM \"Student\" LEFT OUTER JOIN \"Course\" ON \"Student\".\"Course\" =  \"Course\".\"CourseID\"");

        while (results.next())
        {
            System.out.printf("%s\t\t%s\n", results.getString(1), results.getString(2));
        }
    }

    // Allow the user to update a student’s address.

    public static void updateStudentAddress() throws SQLException
    {

        Connection conn = getDBConn();

        printStr("List of all students and student numbers:");
        findAllStudentsAndAdddresses();

        int chosenStudentID = printQGetInt("Enter ID of student to change address for: ");
        String newAddress = printQGetStr("Enter new address: ");

        PreparedStatement statement = conn.prepareStatement("UPDATE \"Student\" SET \"Address\" =  (?) WHERE  \"StudentID\" = (?)");
        statement.setString(1, newAddress);
        statement.setInt(2, chosenStudentID);
        statement.execute();

    }


    // Allow the user to delete a student.
    public static void deleteStudent() throws SQLException
    {

        Connection conn = getDBConn();
        printQGetStr("List of all students and student numbers:");
        findAllStudentsAndAdddresses();

        int chosenStudentID = printQGetInt("Enter ID of student to change address for: ");

        PreparedStatement statement = conn.prepareStatement("DELETE FROM \"Student\" WHERE  \"StudentID\" = (?)");
        statement.setInt(1, chosenStudentID);
        statement.execute();

    }

    //Allow the user to add new courses.
    public static void addNewCourse() throws SQLException
    {

        Connection conn = getDBConn();
        String courseTitle = printQGetStr("Enter course name: ");

        PreparedStatement statement = conn.prepareStatement("INSERT INTO \"Course\" (\"CourseName\") VALUES (?)");
        statement.setString(1, courseTitle);
        statement.execute();

    }

    //Allow the user to add new students and associate them with a course.
    public static void addStuAssocCourse() throws SQLException
    {
        insertStudent();
    }

    public static void printStr(String prompt)
    {
        System.out.printf("%s: ", prompt);
    }

    public static String printQGetStr(String prompt)
    {
        System.out.printf("%s: ", prompt);
        return stdin.nextLine();
    }

    public static int printQGetInt(String prompt)
    {
        System.out.printf("%s: ", prompt);
        return Integer.parseInt(stdin.nextLine());
    }
}