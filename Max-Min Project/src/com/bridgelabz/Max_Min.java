package com.bridgelabz;

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int x = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int y = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int z = sc.nextInt();

        if (x>y && x>z){
            System.out.println("NUmber "+x+" is Max");
        } else if (y>x && y>z) {
            System.out.println("Number "+y+" is Max");
        }else {
            System.out.println("Number "+z+" is Max");
        }
    }
}
