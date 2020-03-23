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
    public static void main(String[] args)
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
        System.out.println("Please enter Username: " );
        Scanner scan = new Scanner(System.in);
        String userName=scan.next();

        Boolean bool=null;
        int index = 0;
        for (int i = 0; i < users.size(); i++){
            if(users.get(i).getName() == userName){
                bool=true;
                index=i;
                break;
            }
        }
        if (bool){
            System.out.println("1. View Courses and Buy  \n 2. View Purchase History \n Enter Choice: " );
            scan = new Scanner(System.in);
            int choice = scan.nextInt();

            switch(choice) {
                case 1: {
                    for (int i=0;i<courses.size();i++){
                        System.out.println("ID:"+courses.get(i).getId()+ " " + "Course Name:" +courses.get(i).getName() + "\n" );
                    }
                    System.out.println("Please enter ID of the Course you would like to buy. Enter -1 to buy nothing. " );
                    scan = new Scanner(System.in);
                    int id = scan.nextInt();
                    if (choice>-1){
                        for (int i = 0; i < courses.size(); i++){
                            if(id == courses.get(i).getId()){
                                users.get(index).addCoursesPurchased(courses.get(i));
                                users.get(index).setBalance(users.get(index).getBalance()-courses.get(i).getCost());
                                break;
                            }
                        }
                    }
                }
                case 2: {
                    List<Course> coursePurchased = users.get(index).getCoursesPurchased();
                    for (int i=0; i<coursePurchased.size(); i++){
                        System.out.println("ID:"+ coursePurchased.get(i).getId() + " " + "Course Name:" + coursePurchased.get(i).getName() + "\n" );
                    }
                }
                default: {
                    System.out.println("Enter a valid choice!!");
                }
            }
        } else {
            System.out.println("User Name was not found.");
        }
    }
}
