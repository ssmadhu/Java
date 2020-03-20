package org.javaCourse.model;

public class User {
    int id;
    String name;
    float balance;

    public User(){

    }

    public User(int id, String name, float balance){
        this.balance = balance;
        this.id = id;
        this.name = name;
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


}
