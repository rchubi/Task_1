package com.company;

import java.util.Scanner;

/**
 * Created by Roman on 23.10.2018.
 */
public class zavdanya_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("First computer - " );
        int ct1 = in.nextInt();
        System.out.println("Second computer - " );
        int ct2 = in.nextInt();
        System.out.println("Third computer - " );
        int ct3 = in.nextInt();
        System.out.println("Ct1: " + ct1 + "\t" +
                            "Ct2: " + ct2 + "\t" +
                            "Ct3: " + ct3);

        System.out.println("Total: " + (ct1 + ct2 + ct3));
    }
}
