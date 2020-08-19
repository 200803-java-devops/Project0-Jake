package com.revature;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Used to grab everything from database and paste
//onto a ResultSet object named rs and returns rs
//to book class

public class GrabAll 
{   public static ResultSet getAll()
    {   ResultSet rs = null;
        String query = "SELECT * FROM Integrals";
        PreparedStatement statement;
        try
        {   statement = ConnectionUtil.getConnection().prepareStatement(query);
            rs = statement.executeQuery();
        }   catch (SQLException e)
        {   System.out.println(e);    }
        return rs;
    }
}