/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */ import java.io.Console;
public class ConsoleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      Console cnsl = null;
      String alpha = null;
      
      try{
         // creates a console object
         cnsl = System.console();

         // if console is not null
         if (cnsl != null) {
            
            // read line from the user input
            alpha = cnsl.readLine("Name: ");
            
            // prints
            System.out.println("Name is: " + alpha);
            
            // read password into the char array
            char[] pwd = cnsl.readPassword("Password: ");
            
            // prints
            System.out.println("Password is: "+pwd);
         }      
      }catch(Exception ex){
         
         // if any error occurs
         ex.printStackTrace();      
      }
   

        // TODO code application logic here
    }
    
}
