package com.company.samuraiSatan.models;

import com.company.samuraiSatan.IO;
import com.jakewharton.fliptables.FlipTable;
import com.company.samuraiSatan.dao.UserDao;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class User {
    private int user_ID;
    private String user_Name;
    private String user_Surname;
    private int phone;
    private String email;
    private int role_ID;
    private String password;
    private int balance;
    private boolean is_Active;
    private String purchased;

    public User(int user_ID, String user_Name, String user_Surname, int phone, String email, int role_ID, String password, int balance, boolean is_Active, String purchased) {
        this.user_ID = user_ID;
        this.user_Name = user_Name;
        this.user_Surname = user_Surname;
        this.phone = phone;
        this.email = email;
        this.role_ID = role_ID;
        this.password = password;
        this.balance = balance;
        this.is_Active = is_Active;
        this.purchased = purchased;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public String getUser_Surname() {
        return user_Surname;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getRole_ID() {
        return role_ID;
    }

    public String getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }

    public boolean getIs_Active() {
        return is_Active;
    }

    public String getPurchased() {
        return purchased;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public void setUser_Surname(String user_Surname) {
        this.user_Surname = user_Surname;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole_ID(int role_ID) {
        this.role_ID = role_ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setIs_Active(boolean is_Active) {
        this.is_Active = is_Active;
    }

    public void setPurchased(String purchased) {
        this.purchased = purchased;
    }
}