/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entry.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;



/**
 *
 * @author ckonstantakis
 */
public class EntryProject { 
  public static void main(String[] args) throws FileNotFoundException 
  {
      try{
      //find the file to read
      File csvFile = new File ("C:\\Users\\ckonstantakis\\Desktop\\customers1.csv");// File: java class (only for windows)
      //scan the file
      Scanner scan = new Scanner(csvFile);
      //a counter of customers in file
      int linecounter=0;
      
      //ignore the headers of the file
      scan.nextLine();//skipping the 1rst line
      
      while(scan.hasNextLine())
      {
        //read a line from the file and store into data object
        String data = scan.nextLine();
        String[] dataArray = data.split(";");
        
        //object for every data set
        String firstName = dataArray[0];
        String lastName = dataArray[1];
        String email = dataArray[2];
        String town = dataArray[3];
        String telephone = dataArray[4];
        
        //for(int i=0; i<dataArray.length;i++)
                //{
                  
                  linecounter++;//look out for headers in file!! You will miss the 1rst number.
                  
                  //calls each method of fixFile class to fix the data sets
                  System.out.println("First Name : " + fixFile.methodFN(firstName));
                  System.out.println("Last Name : " + fixFile.methodLN(lastName));
                  System.out.println("Email Address : " + fixFile.methodE(email));
                  System.out.println("Town : " + fixFile.methodT(town));
                  System.out.println("Telephone Number : " + fixFile.methodTN(telephone));
                  System.out.println("Customer Number In List : " + linecounter);
                  System.out.println();
                //}
      }
      }catch (FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());
            }
//will need one more class to find duplicate numbers
  }
}