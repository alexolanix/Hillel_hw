package com.hillel.entity;

public enum UserRole {
    ADMIN(1), USER(2);
    private int role;

    private  UserRole(int role) {
        this.role = role;
        }

    public static UserRole fromNumber(int userRole) {
        if (userRole == 1) {
            return ADMIN;
        } else {
            return USER;
        }
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
