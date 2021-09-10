package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "What is the quote?" );
        String quote = scanner.nextLine();

        System.out.println("Who said it?");
        String author = scanner.nextLine();

        //System.out.printf("\"test\"");
        //System.out.printf("%s says, \"%s\"%n", author, quote);
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
