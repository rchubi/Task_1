package com.company;

import java.util.Scanner;

/**
 * Created by Roman on 23.10.2018.
 */

public class zavdannya_2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("What is your name?" );
            String name = in.nextLine();
            System.out.println("My name is " + name + "." );
            System.out.println("Where are you live, " + name + "?");
            String adress = in.nextLine();
            System.out.println("I live on " + adress + ".");
        }

}
