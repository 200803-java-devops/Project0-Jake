package com.revature;

import java.sql.Connection;
import java.sql.SQLException;;

public class App {
    public static void main(String[] args) throws SQLException
    {   DBConnect test = new DBConnect();
        Connection c = test.getConnect();
        System.out.println(c);
        book newList = new book();
        newList.bookStart();
    }
} 