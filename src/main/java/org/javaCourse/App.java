package org.javaCourse;

import org.javaCourse.model.Course;
import org.javaCourse.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static List<User> users = new ArrayList<User>();
    public static List<Course> courses = new ArrayList<Course>();
    public static void main( String[] args )
    {




    }

    public static void init(){
        users.add(new User(1, "Madhu", 50));
        users.add(new User(2, "Akshay", 50));
        courses.add(new Course(1, "Java Concepts", 10, (float)10.3));
    }

    public static void displayInitMessage() {
        System.out.println("Who are you? \n 1. Admin \n 2. User \n Enter your choice?" );
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch(choice) {
            case 1: {
                displayAdminOptions();
                break;
            }
            case 2: {
                displayUserOptions();
                break;
            }
            default: {
                System.out.println("Enter a valid choice!!");
            }
        }

    }

    public static void displayAdminOptions() {
        System.out.println("1. Add User \n 2. Add Course. \n Enter choice: " );
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch(choice) {
            case 1: {
               //Create a user Name: "ABC"
                User user = new User( 3 ,"ABC", 50);
            }
            case 2: {
               Course course = new Course(5, "Java BAsics", 5, 10);
            }
            default: {
                System.out.println("Enter a valid choice!!");
            }
        }
    }

    public static void displayUserOptions() {

    }
}
