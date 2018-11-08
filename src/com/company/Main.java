package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        double pi = 3.14;
        Scanner in = new Scanner(System.in);

        double a = in.nextDouble();
        main.sp(a, pi);

    }

    public void sp(double r, double pi) {
        double P = 2*r * pi;
        double S = r*r*pi;

        System.out.println("S = " + S );
        System.out.println("P = " + P );
    }
}
