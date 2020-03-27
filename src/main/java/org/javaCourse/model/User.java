package org.javaCourse.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    int id;
    String name;
    float balance;
    List<Course> coursesPurchased;
    public User(){

    }

    public User(int id, String name, float balance){
        this.balance = balance;
        this.id = id;
        this.name = name;
        this.coursesPurchased= new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public List<Course> getCoursesPurchased() { return coursesPurchased; }

    public void addCoursesPurchased(Course course) { coursesPurchased.add(course); }


}
