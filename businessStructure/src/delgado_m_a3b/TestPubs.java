/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delgado_m_a3b;

import delgado_m_a3b.Magazine.pubUnit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marvindelgado
 */
public class TestPubs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // New Array list of type Publication
        ArrayList<Publication> pubsAL = new ArrayList<>();
        
        // New scanners for each type
        Scanner scr1 = new Scanner(System.in);
        Scanner scr2 = new Scanner(System.in);
        Scanner scr3 = new Scanner(System.in);
        Scanner scr4 = new Scanner(System.in);
        Scanner scr5 = new Scanner(System.in);
        
        // Strings that will hold input
        String mlist;
        String blist;
        String cblist;
        
        // Reads in Magazine file
        System.out.println("Please enter the name of the Magazine input file: ");
        mlist = scr1.next();
        File mFile = new File(mlist);
        // Test if file exists
        if(!mFile.exists())
        {
            System.out.printf("File is not found\n");
        }
        try (Scanner input = new Scanner(mFile)) {
            while (input.hasNext())
            {
                String title = input.nextLine();
                String publisher = input.nextLine();
                int pages = input.nextInt();
                double price = input.nextDouble();
                pubUnit pUnit = pubUnit.valueOf(input.next().toUpperCase());
                pubsAL.add(new Magazine(title, publisher, pages, price, pUnit));
                
            }
        }
        
        // Reads in Book file
        System.out.println("Please enter the name of the Books input file: ");
        blist = scr2.next();
        File bFile = new File(blist);
        // Test if file exists
        if(!bFile.exists())
        {
            System.out.printf("File is not found\n");
        }   
        try (Scanner input = new Scanner(bFile)) {
            while (input.hasNext())
            {
                String title = input.nextLine();
                String author = input.nextLine();
                String publisher = input.nextLine();
                int pages = input.nextInt();
                double price = input.nextDouble();
                pubsAL.add(new Book(title, author, publisher, pages, price));
                
            }
        }
        
        // Reads in Childbook file
        System.out.println("Please enter the name of the Childrens Book input file: ");
        cblist = scr3.next();
        File cbFile = new File(cblist);
        // Test if file exists
        if(!cbFile.exists())
        {
            System.out.printf("File is not found\n");
        } 
        try (Scanner input = new Scanner(cbFile)) {
            while (input.hasNext())
            {
                String title = input.nextLine();
                String author = input.nextLine();
                String publisher = input.nextLine();
                int pages = input.nextInt();
                double price = input.nextDouble();
                int mnAge = input.nextInt();
                int mxAge = input.nextInt();
                pubsAL.add(new ChildBook(title, author, publisher, pages, price, mnAge, mxAge));
                
            }
        }
        
         // Prompt user for ouput file name
        System.out.print("Please enter the name of the output file: ");
        String outputFileName = scr4.next();
        // Prepare output file
        FileWriter outputFile = new FileWriter(outputFileName, true);
        PrintWriter outputWriter = new PrintWriter(outputFile);
        
        // Get data for copies sold
        double userInput;
        for (int i = 0; i < pubsAL.size(); i++) {
            System.out.println("How many copies of " + pubsAL.get(i).getTitle() + " have been sold?: ");
            userInput = scr5.nextInt();
            pubsAL.get(i).setCopies(userInput);
        }
        
        // Prints data
        for(int i = 0; i < pubsAL.size(); i++)
        {
            outputWriter.print(pubsAL.get(i).toString());
        }
        
    }
    
}
