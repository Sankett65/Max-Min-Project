package com.bridgelabz;

import java.util.Scanner;

public class Max_Min {


    public static void max(String x,String y,String z){
        if (x.length()>y.length() && x.length()>z.length()){
            System.out.println("String "+x+" is Max");
        }else if (y.length()>x.length() && y.length()>z.length()){
            System.out.println("String "+y+" is Max");
        }else {
            System.out.println("String "+z+" is Max");
        }

    }

    public static void max(String x,String y,String z,String a){
        if (x.length()>y.length() && x.length()>z.length()){
            System.out.println("String "+x+" is Max");
        }else if (y.length()>x.length() && y.length()>z.length()){
            System.out.println("String "+y+" is Max");
        }else {
            System.out.println("String "+z+" is Max");
        }

    }
    public static void max(String x,String y,String z,String a,String b){
        if (x.length()>y.length() && x.length()>z.length()){
            System.out.println("String "+x+" is Max");
        }else if (y.length()>x.length() && y.length()>z.length()){
            System.out.println("String "+y+" is Max");
        }else {
            System.out.println("String "+z+" is Max");
        }

    }

    public static void main(String[] args) {
       String str1 = "S".toLowerCase();
       String str2 = "Sa".toLowerCase();
       String str3 = "San".toLowerCase();
       String str4 = "Sak".toLowerCase();
       String str5 = "Sae".toLowerCase();
       String str6 = "Sat".toLowerCase();

        max(str1,str2,str3);
    }
}
