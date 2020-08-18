package com.revature;

import java.sql.*;

public class DBConnect {
    static final String URL = "jdbc:postgresql://localhost:5431/Integrals";
    static final String USER = "Integrals";
    static final String PASS = "hello";

    private static Connection c = null;

    public Connection getConnect()
    {   if (c == null)
        {   try   
            {   Class.forName("org.postgresql.Driver");
                c = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("Connection Successful");
            }   catch (SQLException se)
            {   System.out.println("Connection to SQL database failed");
                se.printStackTrace();
            }   catch (Exception e)
            {   System.out.println("Could not load driver");
                e.printStackTrace();
            }
        }
        return c;
    }
}