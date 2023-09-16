package com.bridgelabz;

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        String x= sc.nextLine().toLowerCase();
        System.out.print("Enter Second Number: ");
        String y= sc.nextLine().toLowerCase();
        System.out.print("Enter Third Number: ");
        String z= sc.nextLine().toLowerCase();

        if (x.length()>y.length() && x.length()>z.length()){
            System.out.println("String "+x+" is Max");
        }else if (y.length()>x.length() && y.length()>z.length()){
            System.out.println("String "+y+" is Max");
        }else {
            System.out.println("String "+z+" is Max");
        }

    }
}
