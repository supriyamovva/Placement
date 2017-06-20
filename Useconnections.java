/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placementmanagement;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Lenovo
 */
public class Useconnections
{
    public static void registerDriver()
    {
        try     {

			Class.forName("org.postgresql.Driver");
                        System.out.println("Driver registered!!");

		}
        catch (ClassNotFoundException e)
                {

			System.out.println("Driver Not Registered");
			e.printStackTrace();
		

                 }
    }
    public static Connection connectDatabase()
            {
            Connection conn = null;

		try {

			conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/supriya", "supriya","supriya");
                        if (conn != null) 
                        {
                              System.out.println("You made it, take control your database now!");
                        } 
                        else 
                        {
                              System.out.println("Failed to make connection!");
                        }

                    } 
                catch (SQLException e)
                    {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			
                    }
                return conn;
            
            }
    public static ResultSet statementResultset(Connection connection,String sql)
    {
        Statement stmt=null;
        ResultSet rs=null;
        try
        {
                     stmt=connection.createStatement();
                     rs = stmt.executeQuery(sql);
                     
        }
        catch(SQLException e)
        {
                 System.out.println("RESULT SET EXCEPTION OCCURED");
                 e.printStackTrace();
        }
        
        return rs;
    }
    
}
