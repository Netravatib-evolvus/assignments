package com.evolvus.Pro1Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  String JDBC_H2_URL = "jdbc:h2:mem:evolvus";  

          String userName = "netra";
          String password = "net@123";
              
        try
        {
        	 Connection connection = DriverManager.getConnection(JDBC_H2_URL, userName, password);
             String createSql = "Create table students (ID int primary key, name varchar(50),address varchar(50))";
             Statement statement = connection.createStatement();
             boolean isCreated = statement.execute(createSql);
             System.out.println("the tabke status is " + isCreated);
             String insertSql = "Insert into students (ID, name,address) values (1, 'Netra','Bijapur')";
             boolean isInserted = statement.execute(insertSql);
             System.out.println("the inserted records " + isInserted);
             String seleSql = "SELECT *  FROM students WHERE name='Netra';";
             ResultSet resultSet = statement.executeQuery(seleSql);
             while (resultSet.next()) {
                 System.out.println(" the Addess:::" + resultSet.getString("address"));

             }
             String updatedAddress = "Bangalore";
             String updateSql = "UPDATE students SET address='" + updatedAddress + "';";
             int result = statement.executeUpdate(updateSql);
             System.out.println(" the updated recors " + result);

         } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }

  
        }
        
        
        
        
        
        
        
    }

