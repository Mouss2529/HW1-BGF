package com.company;

import java.util.Scanner;

public class Main {
    {
        System.out.println("hello world");
    }
    public static void main(String[] args) {

        // saisir une chaine
        Scanner sc_ech = new Scanner(System.in);
        //System.out.println("saisie");

        //declare the original String object
        String strOrig = sc_ech.nextLine();

        //declare the char array
        char[] stringArray;

        //convert string into array using toCharArray() method of string class
        stringArray = strOrig.toCharArray();

        //display the array
        for(int index=stringArray.length-1; index >=0 ; index--)
            System.out.print(stringArray[index]);
    }
}
