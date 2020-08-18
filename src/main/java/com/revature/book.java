package com.revature;

import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.SQLException;

public class book {
    void bookStart() throws SQLException
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Integral Solutions Book");
        System.out.println("[1] Search for an integral by id");
        System.out.println("[2] Search for exact integral");
        System.out.println("[3] Call calculator for result on Integral choice");
        System.out.println("[4] Display all Integrals in a text file");
        System.out.println("[5] How to use this App.");
        System.out.println("[6] Notes about Integrals");
        System.out.println("[any other key]. Exit Program");
        int choice = sc.nextInt(); 
        sc.nextLine();

        

        if (choice == 1)
        {   ResultSet rc = null;
            GrabAll grabAll = new GrabAll();
            rc = grabAll.getAll();
            int J = 0;
            System.out.println("Please type an integral id");
            int choice3 = sc.nextInt();
            sc.nextLine();
            while (rc.next())
            {   J = rc.getInt("id");
                if (J == choice3)
                {   System.out.println("id# " + rc.getInt("id") + " Integral: " + rc.getString("Integral") + "   Solution: " + rc.getString("Solution"));    
                }
            } 
           bookStart();
        }

        else if (choice == 2)
        {   ResultSet rc = null;
            GrabAll grabAll = new GrabAll();
            rc = grabAll.getAll();
            String I = null;
            System.out.println("Please type the integral you are looking for");
            String choice2 = sc.nextLine();
            while (rc.next())
            {   I = rc.getString("Integral");
                if (I.equals(choice2))
                {   System.out.println("id# " + rc.getString("id") + " Integral: " + rc.getString("Integral") + "   Solution: " + rc.getString("Solution"));    
                }
            }
            bookStart();
        }
        
    

        else if (choice == 3)
        {   IntegralList showIntegral = new IntegralList();
            showIntegral.display();
        }

        else if (choice == 4)
        {   ResultSet rc = null;
            GrabAll grabAll = new GrabAll();
            rc = grabAll.getAll();
            while (rc.next())
            {   System.out.println("id# " + rc.getString("id") + " Integral: " + rc.getString("Integral") + "   Solution: " + rc.getString("Solution")); 
            }
        }

        else if (choice == 5)
        {   System.out.println("This app is an integral database used to view solutions to integrals that have been");
            System.out.println("solved and uploaded to this database. If you would like to search for a specific ");
            System.out.println("Integral and see if it has been solved, press 1, hit enter, and a prompt will ask you ");
            System.out.println("to input an id number to get an integral and its solution. Here, x's are used and constants ");
            System.out.println("are written with the letter a. If you would like to search for an exact integral, press 2.");
            System.out.println("If you would like to find the result out of specific ");
            System.out.println("integral, press 3 and a prompt will ask you for the id number of the integral you want to ");
            System.out.println("calculate from. It will ask for interval endpoint inputs, or from n1 to n2, and it may ask you for ");
            System.out.println("constant values, exponents, or other integer inputs depending on the integral.");
            System.out.println("If you would like all integrals and solutions ");
            System.out.println("printed to a txt file, press 4. To learn how to use this app, press 5. To read author's ");
            System.out.println("notes on integrals, press 6. To exit the program, press 0 in the start menu.\n\n");
            bookStart();
        }

        else if (choice == 6)
        {   System.out.println("Integrals are used to find areas under curves in mathematical cartesian graphs.");
            System.out.println("While the field of mathematics has many techniques to solve integrals, there are ");
            System.out.println("many integrals that either have solutions not yet solved, not uploaded to this ");
            System.out.println("database, or simply take far too much time to solve. Integral books provide ");
            System.out.println("references to many solved Integrals, but the sheer volume in paper format can be ");
            System.out.println("overwhelming. Thus, the next logical step is to place these integrals into a ");
            System.out.println("computer database to hold the ability to store far greater volumes of integrals ");
            System.out.println("as well as provide a backbone to insert more integrals should they ever be solved. ");
            System.out.println("A digital reference to integrals can become essential to any engineer as it will cut ");
            System.out.println("down the time it takes to solve difficult integrals.\n\n");
            bookStart();
        }
    }
}