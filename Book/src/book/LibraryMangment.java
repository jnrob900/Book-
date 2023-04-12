/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import java.util.Scanner;

/**
 *
 * @author jnrob
 */
public class LibraryMangment {
    
    public static void main(String argv[]) {

            String name;

            String author;

            int year;

            int pages;

            char ans;

            Scanner sc = new Scanner(System.in);

            do {

                  System.out .print("*************************Welcome to my Library********************************************");

                  System.out.println();

                  System.out.print("What is the name of your book : ");

                  name = sc.nextLine();

                  System.out.println();

                  System.out.print("Who is the author : ");

                  author = sc.nextLine();

                  System.out.println();

                  System.out.print("What year was the book published :");

                  year = sc.nextInt();

                  sc.nextLine(); // reading off stray newline left by nextInt()

                  System.out.println();

                  System.out.print("Number of Pages :");

                  pages = sc.nextInt();

                  sc.nextLine(); // reading off stray newline

                  System.out.println();

                  try {

                        Magazine Book = new Magazine(name, author, year, pages);

                        // displaying the created book, just for letting user know that

                        // everything works correctly, if you do not want this, then

                        // remove below two lines.

                        System.out.println("Book created: ");

                        System.out.println("Name: " + Book.getName() + ", Author: "

                                    + Book.getAuthor() + ", Year: " + Book.getPublishYear()

                                    + ", Pages: " + Book.getPages());

                  } 
                  catch (Exception e)
                  {

                        // prints the error message

                        System.out.println("Error: " + e.getMessage());

                        // return; //will continue

                  }

                  System.out.print("Do you want to run again? (y/n) ");

                  ans = sc.next().charAt(0);

                  sc.nextLine(); // reading off stray newline

                  System.out.println();

            } while (ans == 'Y' || ans == 'y');

      }

}
    
