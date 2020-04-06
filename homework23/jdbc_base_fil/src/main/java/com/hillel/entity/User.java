package com.hillel.entity;

public class User {
    public static String ID = "id";
    public static String USERNAME = "user_name";
    public static String PASSWORD = "password";
    public static String FIRSTNAME = "first_name";
    public static String LASTNAME = "last_name";
    public static String ROLE = "role";

    private int id;
    private String user_name;
    private String password;
    private String first_name;
    private String last_name;



    private UserRole role;

    public User(int id, String user_name, String password, String first_name, String last_name, UserRole role) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
